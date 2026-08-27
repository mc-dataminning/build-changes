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

public class cby {
   private static final Logger a = LogUtils.getLogger();
   private final Short2ObjectMap<cbx> b = new Short2ObjectOpenHashMap();
   private final Map<in<cbz>, Set<cbx>> c = Maps.newHashMap();
   private final Runnable d;
   private boolean e;

   public static Codec<cby> a(Runnable $$0) {
      return RecordCodecBuilder.create(
            $$1 -> $$1.group(
                     RecordCodecBuilder.point($$0),
                     Codec.BOOL.optionalFieldOf("Valid", false).forGetter($$0xx -> $$0xx.e),
                     cbx.a($$0).listOf().fieldOf("Records").forGetter($$0xx -> ImmutableList.copyOf($$0xx.b.values()))
                  )
                  .apply($$1, cby::new)
         )
         .orElseGet(ac.a("Failed to read POI section: ", a::error), () -> new cby($$0, false, ImmutableList.of()));
   }

   public cby(Runnable $$0) {
      this($$0, true, ImmutableList.of());
   }

   private cby(Runnable $$0, boolean $$1, List<cbx> $$2) {
      this.d = $$0;
      this.e = $$1;
      $$2.forEach(this::a);
   }

   public Stream<cbx> a(Predicate<in<cbz>> $$0, cbw.b $$1) {
      return this.c.entrySet().stream().filter($$1x -> $$0.test((in<cbz>)$$1x.getKey())).flatMap($$0x -> ((Set)$$0x.getValue()).stream()).filter($$1.a());
   }

   public void a(id $$0, in<cbz> $$1) {
      if (this.a(new cbx($$0, $$1, this.d))) {
         a.debug("Added POI of type {} @ {}", $$1.g(), $$0);
         this.d.run();
      }
   }

   private boolean a(cbx $$0) {
      id $$1 = $$0.f();
      in<cbz> $$2 = $$0.g();
      short $$3 = jg.b($$1);
      cbx $$4 = (cbx)this.b.get($$3);
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

   public void a(id $$0) {
      cbx $$1 = (cbx)this.b.remove(jg.b($$0));
      if ($$1 == null) {
         a.error("POI data mismatch: never registered at {}", $$0);
      } else {
         this.c.get($$1.g()).remove($$1);
         a.debug("Removed POI of type {} @ {}", LogUtils.defer($$1::g), LogUtils.defer($$1::f));
         this.d.run();
      }
   }

   @Deprecated
   @ayp
   public int b(id $$0) {
      return this.e($$0).map(cbx::a).orElse(0);
   }

   public boolean c(id $$0) {
      cbx $$1 = (cbx)this.b.get(jg.b($$0));
      if ($$1 == null) {
         throw (IllegalStateException)ac.b(new IllegalStateException("POI never registered at " + $$0));
      } else {
         boolean $$2 = $$1.c();
         this.d.run();
         return $$2;
      }
   }

   public boolean a(id $$0, Predicate<in<cbz>> $$1) {
      return this.d($$0).filter($$1).isPresent();
   }

   public Optional<in<cbz>> d(id $$0) {
      return this.e($$0).map(cbx::g);
   }

   private Optional<cbx> e(id $$0) {
      return Optional.ofNullable((cbx)this.b.get(jg.b($$0)));
   }

   public void a(Consumer<BiConsumer<id, in<cbz>>> $$0) {
      if (!this.e) {
         Short2ObjectMap<cbx> $$1 = new Short2ObjectOpenHashMap(this.b);
         this.b();
         $$0.accept(($$1x, $$2) -> {
            short $$3 = jg.b($$1x);
            cbx $$4 = (cbx)$$1.computeIfAbsent($$3, $$2x -> new cbx($$1x, $$2, this.d));
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
