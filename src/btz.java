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

public class btz {
   private static final Logger a = LogUtils.getLogger();
   private final Short2ObjectMap<bty> b = new Short2ObjectOpenHashMap();
   private final Map<he<bua>, Set<bty>> c = Maps.newHashMap();
   private final Runnable d;
   private boolean e;

   public static Codec<btz> a(Runnable $$0) {
      return RecordCodecBuilder.create(
            $$1 -> $$1.group(
                     RecordCodecBuilder.point($$0),
                     Codec.BOOL.optionalFieldOf("Valid", false).forGetter($$0xx -> $$0xx.e),
                     bty.a($$0).listOf().fieldOf("Records").forGetter($$0xx -> ImmutableList.copyOf($$0xx.b.values()))
                  )
                  .apply($$1, btz::new)
         )
         .orElseGet(ac.a("Failed to read POI section: ", a::error), () -> new btz($$0, false, ImmutableList.of()));
   }

   public btz(Runnable $$0) {
      this($$0, true, ImmutableList.of());
   }

   private btz(Runnable $$0, boolean $$1, List<bty> $$2) {
      this.d = $$0;
      this.e = $$1;
      $$2.forEach(this::a);
   }

   public Stream<bty> a(Predicate<he<bua>> $$0, btx.b $$1) {
      return this.c.entrySet().stream().filter($$1x -> $$0.test((he<bua>)$$1x.getKey())).flatMap($$0x -> ((Set)$$0x.getValue()).stream()).filter($$1.a());
   }

   public void a(gu $$0, he<bua> $$1) {
      if (this.a(new bty($$0, $$1, this.d))) {
         a.debug("Added POI of type {} @ {}", $$1.e().map($$0x -> $$0x.a().toString()).orElse("[unregistered]"), $$0);
         this.d.run();
      }
   }

   private boolean a(bty $$0) {
      gu $$1 = $$0.f();
      he<bua> $$2 = $$0.g();
      short $$3 = hx.b($$1);
      bty $$4 = (bty)this.b.get($$3);
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

   public void a(gu $$0) {
      bty $$1 = (bty)this.b.remove(hx.b($$0));
      if ($$1 == null) {
         a.error("POI data mismatch: never registered at {}", $$0);
      } else {
         this.c.get($$1.g()).remove($$1);
         a.debug("Removed POI of type {} @ {}", LogUtils.defer($$1::g), LogUtils.defer($$1::f));
         this.d.run();
      }
   }

   @Deprecated
   @asq
   public int b(gu $$0) {
      return this.e($$0).map(bty::a).orElse(0);
   }

   public boolean c(gu $$0) {
      bty $$1 = (bty)this.b.get(hx.b($$0));
      if ($$1 == null) {
         throw (IllegalStateException)ac.b(new IllegalStateException("POI never registered at " + $$0));
      } else {
         boolean $$2 = $$1.c();
         this.d.run();
         return $$2;
      }
   }

   public boolean a(gu $$0, Predicate<he<bua>> $$1) {
      return this.d($$0).filter($$1).isPresent();
   }

   public Optional<he<bua>> d(gu $$0) {
      return this.e($$0).map(bty::g);
   }

   private Optional<bty> e(gu $$0) {
      return Optional.ofNullable((bty)this.b.get(hx.b($$0)));
   }

   public void a(Consumer<BiConsumer<gu, he<bua>>> $$0) {
      if (!this.e) {
         Short2ObjectMap<bty> $$1 = new Short2ObjectOpenHashMap(this.b);
         this.b();
         $$0.accept(($$1x, $$2) -> {
            short $$3 = hx.b($$1x);
            bty $$4 = (bty)$$1.computeIfAbsent($$3, $$2x -> new bty($$1x, $$2, this.d));
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
