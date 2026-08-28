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

public class ceh {
   private static final Logger a = LogUtils.getLogger();
   private final Short2ObjectMap<ceg> b = new Short2ObjectOpenHashMap();
   private final Map<jj<cei>, Set<ceg>> c = Maps.newHashMap();
   private final Runnable d;
   private boolean e;

   public static Codec<ceh> a(Runnable $$0) {
      return RecordCodecBuilder.create(
            $$1 -> $$1.group(
                     RecordCodecBuilder.point($$0),
                     Codec.BOOL.lenientOptionalFieldOf("Valid", false).forGetter($$0xx -> $$0xx.e),
                     ceg.a($$0).listOf().fieldOf("Records").forGetter($$0xx -> ImmutableList.copyOf($$0xx.b.values()))
                  )
                  .apply($$1, ceh::new)
         )
         .orElseGet(ac.a("Failed to read POI section: ", a::error), () -> new ceh($$0, false, ImmutableList.of()));
   }

   public ceh(Runnable $$0) {
      this($$0, true, ImmutableList.of());
   }

   private ceh(Runnable $$0, boolean $$1, List<ceg> $$2) {
      this.d = $$0;
      this.e = $$1;
      $$2.forEach(this::a);
   }

   public Stream<ceg> a(Predicate<jj<cei>> $$0, cef.b $$1) {
      return this.c.entrySet().stream().filter($$1x -> $$0.test((jj<cei>)$$1x.getKey())).flatMap($$0x -> ((Set)$$0x.getValue()).stream()).filter($$1.a());
   }

   public void a(ja $$0, jj<cei> $$1) {
      if (this.a(new ceg($$0, $$1, this.d))) {
         a.debug("Added POI of type {} @ {}", $$1.g(), $$0);
         this.d.run();
      }
   }

   private boolean a(ceg $$0) {
      ja $$1 = $$0.f();
      jj<cei> $$2 = $$0.g();
      short $$3 = kc.b($$1);
      ceg $$4 = (ceg)this.b.get($$3);
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

   public void a(ja $$0) {
      ceg $$1 = (ceg)this.b.remove(kc.b($$0));
      if ($$1 == null) {
         a.error("POI data mismatch: never registered at {}", $$0);
      } else {
         this.c.get($$1.g()).remove($$1);
         a.debug("Removed POI of type {} @ {}", LogUtils.defer($$1::g), LogUtils.defer($$1::f));
         this.d.run();
      }
   }

   @Deprecated
   @azl
   public int b(ja $$0) {
      return this.e($$0).map(ceg::a).orElse(0);
   }

   public boolean c(ja $$0) {
      ceg $$1 = (ceg)this.b.get(kc.b($$0));
      if ($$1 == null) {
         throw (IllegalStateException)ac.b(new IllegalStateException("POI never registered at " + $$0));
      } else {
         boolean $$2 = $$1.c();
         this.d.run();
         return $$2;
      }
   }

   public boolean a(ja $$0, Predicate<jj<cei>> $$1) {
      return this.d($$0).filter($$1).isPresent();
   }

   public Optional<jj<cei>> d(ja $$0) {
      return this.e($$0).map(ceg::g);
   }

   private Optional<ceg> e(ja $$0) {
      return Optional.ofNullable((ceg)this.b.get(kc.b($$0)));
   }

   public void a(Consumer<BiConsumer<ja, jj<cei>>> $$0) {
      if (!this.e) {
         Short2ObjectMap<ceg> $$1 = new Short2ObjectOpenHashMap(this.b);
         this.b();
         $$0.accept(($$1x, $$2) -> {
            short $$3 = kc.b($$1x);
            ceg $$4 = (ceg)$$1.computeIfAbsent($$3, $$2x -> new ceg($$1x, $$2, this.d));
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
