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

public class cgo {
   private static final Logger a = LogUtils.getLogger();
   private final Short2ObjectMap<cgn> b = new Short2ObjectOpenHashMap();
   private final Map<jr<cgp>, Set<cgn>> c = Maps.newHashMap();
   private final Runnable d;
   private boolean e;

   public cgo(Runnable $$0) {
      this($$0, true, ImmutableList.of());
   }

   cgo(Runnable $$0, boolean $$1, List<cgn> $$2) {
      this.d = $$0;
      this.e = $$1;
      $$2.forEach(this::a);
   }

   public cgo.a a() {
      return new cgo.a(this.e, this.b.values().stream().map(cgn::a).toList());
   }

   public Stream<cgn> a(Predicate<jr<cgp>> $$0, cgm.b $$1) {
      return this.c.entrySet().stream().filter($$1x -> $$0.test((jr<cgp>)$$1x.getKey())).flatMap($$0x -> ((Set)$$0x.getValue()).stream()).filter($$1.a());
   }

   public void a(ji $$0, jr<cgp> $$1) {
      if (this.a(new cgn($$0, $$1, this.d))) {
         a.debug("Added POI of type {} @ {}", $$1.g(), $$0);
         this.d.run();
      }
   }

   private boolean a(cgn $$0) {
      ji $$1 = $$0.g();
      jr<cgp> $$2 = $$0.h();
      short $$3 = kk.b($$1);
      cgn $$4 = (cgn)this.b.get($$3);
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
      cgn $$1 = (cgn)this.b.remove(kk.b($$0));
      if ($$1 == null) {
         a.error("POI data mismatch: never registered at {}", $$0);
      } else {
         this.c.get($$1.h()).remove($$1);
         a.debug("Removed POI of type {} @ {}", LogUtils.defer($$1::h), LogUtils.defer($$1::g));
         this.d.run();
      }
   }

   @Deprecated
   @bag
   public int b(ji $$0) {
      return this.e($$0).map(cgn::b).orElse(0);
   }

   public boolean c(ji $$0) {
      cgn $$1 = (cgn)this.b.get(kk.b($$0));
      if ($$1 == null) {
         throw (IllegalStateException)af.b(new IllegalStateException("POI never registered at " + $$0));
      } else {
         boolean $$2 = $$1.d();
         this.d.run();
         return $$2;
      }
   }

   public boolean a(ji $$0, Predicate<jr<cgp>> $$1) {
      return this.d($$0).filter($$1).isPresent();
   }

   public Optional<jr<cgp>> d(ji $$0) {
      return this.e($$0).map(cgn::h);
   }

   private Optional<cgn> e(ji $$0) {
      return Optional.ofNullable((cgn)this.b.get(kk.b($$0)));
   }

   public void a(Consumer<BiConsumer<ji, jr<cgp>>> $$0) {
      if (!this.e) {
         Short2ObjectMap<cgn> $$1 = new Short2ObjectOpenHashMap(this.b);
         this.c();
         $$0.accept(($$1x, $$2) -> {
            short $$3 = kk.b($$1x);
            cgn $$4 = (cgn)$$1.computeIfAbsent($$3, $$2x -> new cgn($$1x, $$2, this.d));
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

   public static record a(boolean b, List<cgn.a> c) {
      public static final Codec<cgo.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.BOOL.lenientOptionalFieldOf("Valid", false).forGetter(cgo.a::a), cgn.a.a.listOf().fieldOf("Records").forGetter(cgo.a::b))
               .apply($$0, cgo.a::new)
      );

      public cgo a(Runnable $$0) {
         return new cgo($$0, this.b, this.c.stream().map($$1 -> $$1.a($$0)).toList());
      }

      public boolean a() {
         return this.b;
      }

      public List<cgn.a> b() {
         return this.c;
      }
   }
}
