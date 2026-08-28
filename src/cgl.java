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

public class cgl {
   private static final Logger a = LogUtils.getLogger();
   private final Short2ObjectMap<cgk> b = new Short2ObjectOpenHashMap();
   private final Map<jr<cgm>, Set<cgk>> c = Maps.newHashMap();
   private final Runnable d;
   private boolean e;

   public cgl(Runnable $$0) {
      this($$0, true, ImmutableList.of());
   }

   cgl(Runnable $$0, boolean $$1, List<cgk> $$2) {
      this.d = $$0;
      this.e = $$1;
      $$2.forEach(this::a);
   }

   public cgl.a a() {
      return new cgl.a(this.e, this.b.values().stream().map(cgk::a).toList());
   }

   public Stream<cgk> a(Predicate<jr<cgm>> $$0, cgj.b $$1) {
      return this.c.entrySet().stream().filter($$1x -> $$0.test((jr<cgm>)$$1x.getKey())).flatMap($$0x -> ((Set)$$0x.getValue()).stream()).filter($$1.a());
   }

   public void a(ji $$0, jr<cgm> $$1) {
      if (this.a(new cgk($$0, $$1, this.d))) {
         a.debug("Added POI of type {} @ {}", $$1.g(), $$0);
         this.d.run();
      }
   }

   private boolean a(cgk $$0) {
      ji $$1 = $$0.g();
      jr<cgm> $$2 = $$0.h();
      short $$3 = kk.b($$1);
      cgk $$4 = (cgk)this.b.get($$3);
      if ($$4 != null) {
         if ($$2.equals($$4.h())) {
            return false;
         }

         af.b("POI data mismatch: already registered at " + $$1);
      }

      this.b.put($$3, $$0);
      this.c.computeIfAbsent($$2, $$0x -> Sets.newHashSet()).add($$0);
      return true;
   }

   public void a(ji $$0) {
      cgk $$1 = (cgk)this.b.remove(kk.b($$0));
      if ($$1 == null) {
         a.error("POI data mismatch: never registered at {}", $$0);
      } else {
         this.c.get($$1.h()).remove($$1);
         a.debug("Removed POI of type {} @ {}", LogUtils.defer($$1::h), LogUtils.defer($$1::g));
         this.d.run();
      }
   }

   @Deprecated
   @baf
   public int b(ji $$0) {
      return this.e($$0).map(cgk::b).orElse(0);
   }

   public boolean c(ji $$0) {
      cgk $$1 = (cgk)this.b.get(kk.b($$0));
      if ($$1 == null) {
         throw (IllegalStateException)af.b(new IllegalStateException("POI never registered at " + $$0));
      } else {
         boolean $$2 = $$1.d();
         this.d.run();
         return $$2;
      }
   }

   public boolean a(ji $$0, Predicate<jr<cgm>> $$1) {
      return this.d($$0).filter($$1).isPresent();
   }

   public Optional<jr<cgm>> d(ji $$0) {
      return this.e($$0).map(cgk::h);
   }

   private Optional<cgk> e(ji $$0) {
      return Optional.ofNullable((cgk)this.b.get(kk.b($$0)));
   }

   public void a(Consumer<BiConsumer<ji, jr<cgm>>> $$0) {
      if (!this.e) {
         Short2ObjectMap<cgk> $$1 = new Short2ObjectOpenHashMap(this.b);
         this.c();
         $$0.accept(($$1x, $$2) -> {
            short $$3 = kk.b($$1x);
            cgk $$4 = (cgk)$$1.computeIfAbsent($$3, $$2x -> new cgk($$1x, $$2, this.d));
            this.a($$4);
         });
         this.e = true;
         this.d.run();
      }
   }

   private void c() {
      this.b.clear();
      this.c.clear();
   }

   boolean b() {
      return this.e;
   }

   public static record a(boolean b, List<cgk.a> c) {
      public static final Codec<cgl.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.BOOL.lenientOptionalFieldOf("Valid", false).forGetter(cgl.a::a), cgk.a.a.listOf().fieldOf("Records").forGetter(cgl.a::b))
               .apply($$0, cgl.a::new)
      );

      public cgl a(Runnable $$0) {
         return new cgl($$0, this.b, this.c.stream().map($$1 -> $$1.a($$0)).toList());
      }

      public boolean a() {
         return this.b;
      }

      public List<cgk.a> b() {
         return this.c;
      }
   }
}
