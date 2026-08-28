import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface dgq extends dgm {
   dzk F_();

   @Nullable
   dgm c(int var1, int var2);

   default boolean a(@Nullable bvj $$0, fcr $$1) {
      return true;
   }

   default boolean a(dxu $$0, jh $$1, fcc $$2) {
      fcr $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(bvj $$0) {
      return this.a($$0, fco.a($$0.cR()));
   }

   default boolean b(fbs $$0) {
      return this.a(null, $$0);
   }

   default boolean g(bvj $$0) {
      return this.a($$0, $$0.cR());
   }

   default boolean a(@Nullable bvj $$0, fbs $$1) {
      return this.a($$0, $$1, false);
   }

   default boolean a(@Nullable bvj $$0, fbs $$1, boolean $$2) {
      for (fcr $$4 : $$2 ? this.f($$0, $$1) : this.e($$0, $$1)) {
         if (!$$4.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         fcr $$5 = this.i($$0, $$1);
         return $$5 == null || !fco.c($$5, fco.a($$1), fcb.i);
      }
   }

   default boolean b(@Nullable bvj $$0, fbs $$1) {
      for (fcr $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<fcr> c(@Nullable bvj var1, fbs var2);

   default Iterable<fcr> d(@Nullable bvj $$0, fbs $$1) {
      List<fcr> $$2 = this.c($$0, $$1);
      Iterable<fcr> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<fcr> e(@Nullable bvj $$0, fbs $$1) {
      return () -> new dgk<fcr>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   default Iterable<fcr> f(@Nullable bvj $$0, fbs $$1) {
      return () -> new dgk<fcr>(this, fcc.a($$0, true), $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private fcr i(bvj $$0, fbs $$1) {
      dzk $$2 = this.F_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default fbt b(dgp $$0) {
      fbt $$1 = this.a($$0);
      dzk $$2 = this.F_();
      if ($$2.a($$0.b()) && !$$2.a($$1.g())) {
         fbx $$3 = $$1.g().d($$0.b());
         jm $$4 = jm.a($$3.d, $$3.e, $$3.f);
         fbx $$5 = $$2.c($$1.g());
         return new fbt($$5, $$4, jh.a((ka)$$5), false, true);
      } else {
         return $$1;
      }
   }

   default boolean g(@Nullable bvj $$0, fbs $$1) {
      dgk<fcr> $$2 = new dgk<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((fcr)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<jh> h(bvj $$0, fbs $$1) {
      jh $$2 = null;
      double $$3 = Double.MAX_VALUE;
      dgk<jh> $$4 = new dgk<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

      while ($$4.hasNext()) {
         jh $$5 = (jh)$$4.next();
         double $$6 = $$5.b($$0.dt());
         if ($$6 < $$3 || $$6 == $$3 && ($$2 == null || $$2.i($$5) < 0)) {
            $$2 = $$5.j();
            $$3 = $$6;
         }
      }

      return Optional.ofNullable($$2);
   }

   default Optional<fbx> a(@Nullable bvj $$0, fcr $$1, fbx $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         fbs $$6 = $$1.a().c($$3, $$4, $$5);
         fcr $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.F_() == null || this.F_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(fco::a)
            .reduce(fco.a(), fco::a);
         fcr $$8 = fco.a($$1, $$7, fcb.e);
         return $$8.b($$2);
      }
   }
}
