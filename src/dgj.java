import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface dgj extends dgf {
   dzd F_();

   @Nullable
   dgf c(int var1, int var2);

   default boolean a(@Nullable bvf $$0, fcm $$1) {
      return true;
   }

   default boolean a(dxn $$0, jh $$1, fbx $$2) {
      fcm $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(bvf $$0) {
      return this.a($$0, fcj.a($$0.cR()));
   }

   default boolean b(fbn $$0) {
      return this.a(null, $$0);
   }

   default boolean g(bvf $$0) {
      return this.a($$0, $$0.cR());
   }

   default boolean a(@Nullable bvf $$0, fbn $$1) {
      return this.a($$0, $$1, false);
   }

   default boolean a(@Nullable bvf $$0, fbn $$1, boolean $$2) {
      for (fcm $$4 : $$2 ? this.f($$0, $$1) : this.e($$0, $$1)) {
         if (!$$4.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         fcm $$5 = this.i($$0, $$1);
         return $$5 == null || !fcj.c($$5, fcj.a($$1), fbw.i);
      }
   }

   default boolean b(@Nullable bvf $$0, fbn $$1) {
      for (fcm $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<fcm> c(@Nullable bvf var1, fbn var2);

   default Iterable<fcm> d(@Nullable bvf $$0, fbn $$1) {
      List<fcm> $$2 = this.c($$0, $$1);
      Iterable<fcm> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<fcm> e(@Nullable bvf $$0, fbn $$1) {
      return () -> new dgd<fcm>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   default Iterable<fcm> f(@Nullable bvf $$0, fbn $$1) {
      return () -> new dgd<fcm>(this, fbx.a($$0, true), $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private fcm i(bvf $$0, fbn $$1) {
      dzd $$2 = this.F_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default fbo b(dgi $$0) {
      fbo $$1 = this.a($$0);
      dzd $$2 = this.F_();
      if ($$2.a($$0.b()) && !$$2.a($$1.g())) {
         fbs $$3 = $$1.g().d($$0.b());
         jm $$4 = jm.a($$3.d, $$3.e, $$3.f);
         fbs $$5 = $$2.c($$1.g());
         return new fbo($$5, $$4, jh.a((ka)$$5), false, true);
      } else {
         return $$1;
      }
   }

   default boolean g(@Nullable bvf $$0, fbn $$1) {
      dgd<fcm> $$2 = new dgd<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((fcm)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<jh> h(bvf $$0, fbn $$1) {
      jh $$2 = null;
      double $$3 = Double.MAX_VALUE;
      dgd<jh> $$4 = new dgd<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

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

   default Optional<fbs> a(@Nullable bvf $$0, fcm $$1, fbs $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         fbn $$6 = $$1.a().c($$3, $$4, $$5);
         fcm $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.F_() == null || this.F_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(fcj::a)
            .reduce(fcj.a(), fcj::a);
         fcm $$8 = fcj.a($$1, $$7, fbw.e);
         return $$8.b($$2);
      }
   }
}
