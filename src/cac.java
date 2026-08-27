import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class cac {
   private static final Logger a = LogUtils.getLogger();
   private final Short2ObjectMap<cab> b = new Short2ObjectOpenHashMap();
   private final Map<il<cad>, Set<cab>> c = Maps.newHashMap();
   private final Runnable d;
   private boolean e;

   public static Codec<cac> a(Runnable $$0) {
      return RecordCodecBuilder.create(
            $$1 -> $$1.group(
                     RecordCodecBuilder.point($$0),
                     Codec.BOOL.optionalFieldOf("Valid", false).forGetter($$0xx -> $$0xx.e),
                     cab.a($$0).listOf().fieldOf("Records").forGetter($$0xx -> ImmutableList.copyOf($$0xx.b.values()))
                  )
                  .apply($$1, cac::new)
         )
         .orElseGet(ac.a("Failed to read POI section: ", a::error), () -> new cac($$0, false, ImmutableList.of()));
   }

   public cac(Runnable $$0) {
      this($$0, true, ImmutableList.of());
   }

   private cac(Runnable $$0, boolean $$1, List<cab> $$2) {
      this.d = $$0;
      this.e = $$1;
      $$2.forEach(this::a);
   }

   public Stream<cab> a(Predicate<il<cad>> $$0, caa.b $$1) {
      return this.c.entrySet().stream().filter($$1x -> $$0.test((il<cad>)$$1x.getKey())).flatMap($$0x -> ((Set)$$0x.getValue()).stream()).filter($$1.a());
   }

   public void a(ib $$0, il<cad> $$1) {
      if (this.a(new cab($$0, $$1, this.d))) {
         a.debug("Added POI of type {} @ {}", $$1.g(), $$0);
         this.d.run();
      }
   }

   private boolean a(cab $$0) {
      ib $$1 = $$0.f();
      il<cad> $$2 = $$0.g();
      short $$3 = jd.b($$1);
      cab $$4 = (cab)this.b.get($$3);
      if ($$4 != null) {
         if ($$2.equals($$4.g())) {
            return false;
         }

         ac.a("POI data mismatch: already registered at " + $$1);
      }

      this.b.put($$3, $$0);
      this.c.computeIfAbsent($$2, $$0x -> Sets.newHashSet()).add($$0);
      return true;
   }

   public void a(ib $$0) {
      cab $$1 = (cab)this.b.remove(jd.b($$0));
      if ($$1 == null) {
         a.error("POI data mismatch: never registered at {}", $$0);
      } else {
         this.c.get($$1.g()).remove($$1);
         a.debug("Removed POI of type {} @ {}", LogUtils.defer($$1::g), LogUtils.defer($$1::f));
         this.d.run();
      }
   }

   @Deprecated
   @axp
   public int b(ib $$0) {
      return this.e($$0).map(cab::a).orElse(0);
   }

   public boolean c(ib $$0) {
      cab $$1 = (cab)this.b.get(jd.b($$0));
      if ($$1 == null) {
         throw (IllegalStateException)ac.b(new IllegalStateException("POI never registered at " + $$0));
      } else {
         boolean $$2 = $$1.c();
         this.d.run();
         return $$2;
      }
   }

   public boolean a(ib $$0, Predicate<il<cad>> $$1) {
      return this.d($$0).filter($$1).isPresent();
   }

   public Optional<il<cad>> d(ib $$0) {
      return this.e($$0).map(cab::g);
   }

   private Optional<cab> e(ib $$0) {
      return Optional.ofNullable((cab)this.b.get(jd.b($$0)));
   }

   public void a(Consumer<BiConsumer<ib, il<cad>>> $$0) {
      if (!this.e) {
         Short2ObjectMap<cab> $$1 = new Short2ObjectOpenHashMap(this.b);
         this.b();
         $$0.accept(($$1x, $$2) -> {
            short $$3 = jd.b($$1x);
            cab $$4 = (cab)$$1.computeIfAbsent($$3, $$2x -> new cab($$1x, $$2, this.d));
            this.a($$4);
         });
         this.e = true;
         this.d.run();
      }
   }

   private void b() {
      this.b.clear();
      this.c.clear();
   }

   boolean a() {
      return this.e;
   }
}
