import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface dgi extends dge {
   dze F_();

   @Nullable
   dge c(int var1, int var2);

   default boolean a(@Nullable bvb $$0, fcl $$1) {
      return true;
   }

   default boolean a(dxo $$0, jh $$1, fbw $$2) {
      fcl $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(bvb $$0) {
      return this.a($$0, fci.a($$0.cR()));
   }

   default boolean b(fbm $$0) {
      return this.a(null, $$0);
   }

   default boolean g(bvb $$0) {
      return this.a($$0, $$0.cR());
   }

   default boolean a(@Nullable bvb $$0, fbm $$1) {
      return this.a($$0, $$1, false);
   }

   default boolean a(@Nullable bvb $$0, fbm $$1, boolean $$2) {
      for (fcl $$4 : $$2 ? this.f($$0, $$1) : this.e($$0, $$1)) {
         if (!$$4.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         fcl $$5 = this.i($$0, $$1);
         return $$5 == null || !fci.c($$5, fci.a($$1), fbv.i);
      }
   }

   default boolean b(@Nullable bvb $$0, fbm $$1) {
      for (fcl $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<fcl> c(@Nullable bvb var1, fbm var2);

   default Iterable<fcl> d(@Nullable bvb $$0, fbm $$1) {
      List<fcl> $$2 = this.c($$0, $$1);
      Iterable<fcl> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<fcl> e(@Nullable bvb $$0, fbm $$1) {
      return () -> new dgc<fcl>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   default Iterable<fcl> f(@Nullable bvb $$0, fbm $$1) {
      return () -> new dgc<fcl>(this, fbw.a($$0, true), $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private fcl i(bvb $$0, fbm $$1) {
      dze $$2 = this.F_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default fbn b(dgh $$0) {
      fbn $$1 = this.a($$0);
      dze $$2 = this.F_();
      if ($$2.a($$0.b()) && !$$2.a($$1.g())) {
         fbr $$3 = $$1.g().d($$0.b());
         jm $$4 = jm.a($$3.d, $$3.e, $$3.f);
         fbr $$5 = $$2.c($$1.g());
         return new fbn($$5, $$4, jh.a((ka)$$5), false, true);
      } else {
         return $$1;
      }
   }

   default boolean g(@Nullable bvb $$0, fbm $$1) {
      dgc<fcl> $$2 = new dgc<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((fcl)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<jh> h(bvb $$0, fbm $$1) {
      jh $$2 = null;
      double $$3 = Double.MAX_VALUE;
      dgc<jh> $$4 = new dgc<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

      while ($$4.hasNext()) {
         jh $$5 = (jh)$$4.next();
         double $$6 = $$5.b($$0.du());
         if ($$6 < $$3 || $$6 == $$3 && ($$2 == null || $$2.i($$5) < 0)) {
            $$2 = $$5.j();
            $$3 = $$6;
         }
      }

      return Optional.ofNullable($$2);
   }

   default Optional<fbr> a(@Nullable bvb $$0, fcl $$1, fbr $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         fbm $$6 = $$1.a().c($$3, $$4, $$5);
         fcl $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.F_() == null || this.F_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(fci::a)
            .reduce(fci.a(), fci::a);
         fcl $$8 = fci.a($$1, $$7, fbv.e);
         return $$8.b($$2);
      }
   }
}
