import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Stream;

public record dpt(it<dmz> b) {
   public static final MapCodec<dpt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(iv.b(ke.aN, Lifecycle.stable(), dmz.a).fieldOf("dimensions").forGetter(dpt::d)).apply($$0, $$0.stable(dpt::new))
   );
   private static final Set<ahg<dmz>> c = ImmutableSet.of(dmz.b, dmz.c, dmz.d);
   private static final int d = c.size();

   public dpt(it<dmz> b) {
      dmz $$1 = b.a(dmz.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public static Stream<ahg<dmz>> a(Stream<ahg<dmz>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public dpt a(iu $$0, dlm $$1) {
      it<dmy> $$2 = $$0.d(ke.ay);
      it<dmz> $$3 = a($$2, this.b, $$1);
      return new dpt($$3);
   }

   public static it<dmz> a(it<dmy> $$0, it<dmz> $$1, dlm $$2) {
      dmz $$3 = $$1.a(dmz.b);
      ih<dmy> $$4 = (ih<dmy>)($$3 == null ? $$0.f(dmw.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static it<dmz> a(it<dmz> $$0, ih<dmy> $$1, dlm $$2) {
      jc<dmz> $$3 = new ip<>(ke.aN, Lifecycle.experimental());
      $$3.a(dmz.b, new dmz($$1, $$2), Lifecycle.stable());

      for (Entry<ahg<dmz>, dmz> $$4 : $$0.g()) {
         ahg<dmz> $$5 = $$4.getKey();
         if ($$5 != dmz.b) {
            $$3.a($$5, $$4.getValue(), $$0.e($$4.getValue()));
         }
      }

      return $$3.l();
   }

   public dlm a() {
      dmz $$0 = this.b.a(dmz.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<dmz> a(ahg<dmz> $$0) {
      return this.b.d($$0);
   }

   public ImmutableSet<ahg<ctx>> b() {
      return this.d().g().stream().map(Entry::getKey).map(ke::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof dop;
   }

   private static egz.a b(it<dmz> $$0) {
      return $$0.d(dmz.b).map($$0x -> {
         dlm $$1 = $$0x.b();
         if ($$1 instanceof dop) {
            return egz.a.c;
         } else {
            return $$1 instanceof dot ? egz.a.b : egz.a.a;
         }
      }).orElse(egz.a.a);
   }

   static Lifecycle a(ahg<dmz> $$0, dmz $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(ahg<dmz> $$0, dmz $$1) {
      if ($$0 == dmz.b) {
         return a($$1);
      } else if ($$0 == dmz.c) {
         return b($$1);
      } else {
         return $$0 == dmz.d ? c($$1) : false;
      }
   }

   private static boolean a(dmz $$0) {
      ih<dmy> $$1 = $$0.a();
      if (!$$1.a(dmw.a) && !$$1.a(dmw.d)) {
         return false;
      } else {
         if ($$0.b().c() instanceof cvj $$2 && !$$2.a(cvl.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(dmz $$0) {
      return $$0.a().a(dmw.b) && $$0.b() instanceof dpb $$1 && $$1.a(dpd.f) && $$1.c() instanceof cvj $$2 && $$2.a(cvl.a);
   }

   private static boolean c(dmz $$0) {
      return $$0.a().a(dmw.c) && $$0.b() instanceof dpb $$1 && $$1.a(dpd.g) && $$1.c() instanceof cvn;
   }

   public dpt.b a(it<dmz> $$0) {
      Stream<ahg<dmz>> $$1 = Stream.concat($$0.f().stream(), this.b.f().stream()).distinct();

      record a(ahg<dmz> a, dmz b) {

         Lifecycle c() {
            return dpt.a(this.a, this.b);
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.d($$2x).or(() -> this.b.d($$2x)).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      jc<dmz> $$4 = new ip<>(ke.aN, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      it<dmz> $$5 = $$4.l();
      egz.a $$6 = b($$5);
      return new dpt.b($$5.l(), $$6);
   }

   public it<dmz> d() {
      return this.b;
   }

   public static record b(it<dmz> a, egz.a b) {
      public Lifecycle a() {
         return this.a.d();
      }

      public iu.b b() {
         return new iu.c(List.of(this.a)).d();
      }

      public it<dmz> c() {
         return this.a;
      }

      public egz.a d() {
         return this.b;
      }
   }
}
