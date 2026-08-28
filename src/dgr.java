import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface dgr extends dgn {
   dzl F_();

   @Nullable
   dgn c(int var1, int var2);

   default boolean a(@Nullable bvk $$0, fcs $$1) {
      return true;
   }

   default boolean a(dxv $$0, jh $$1, fcd $$2) {
      fcs $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(bvk $$0) {
      return this.a($$0, fcp.a($$0.cR()));
   }

   default boolean b(fbt $$0) {
      return this.a(null, $$0);
   }

   default boolean g(bvk $$0) {
      return this.a($$0, $$0.cR());
   }

   default boolean a(@Nullable bvk $$0, fbt $$1) {
      return this.a($$0, $$1, false);
   }

   default boolean a(@Nullable bvk $$0, fbt $$1, boolean $$2) {
      for (fcs $$4 : $$2 ? this.f($$0, $$1) : this.e($$0, $$1)) {
         if (!$$4.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         fcs $$5 = this.i($$0, $$1);
         return $$5 == null || !fcp.c($$5, fcp.a($$1), fcc.i);
      }
   }

   default boolean b(@Nullable bvk $$0, fbt $$1) {
      for (fcs $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<fcs> c(@Nullable bvk var1, fbt var2);

   default Iterable<fcs> d(@Nullable bvk $$0, fbt $$1) {
      List<fcs> $$2 = this.c($$0, $$1);
      Iterable<fcs> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<fcs> e(@Nullable bvk $$0, fbt $$1) {
      return () -> new dgl<fcs>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   default Iterable<fcs> f(@Nullable bvk $$0, fbt $$1) {
      return () -> new dgl<fcs>(this, fcd.a($$0, true), $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private fcs i(bvk $$0, fbt $$1) {
      dzl $$2 = this.F_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default fbu b(dgq $$0) {
      fbu $$1 = this.a($$0);
      dzl $$2 = this.F_();
      if ($$2.a($$0.b()) && !$$2.a($$1.g())) {
         fby $$3 = $$1.g().d($$0.b());
         jm $$4 = jm.a($$3.d, $$3.e, $$3.f);
         fby $$5 = $$2.c($$1.g());
         return new fbu($$5, $$4, jh.a((ka)$$5), false, true);
      } else {
         return $$1;
      }
   }

   default boolean g(@Nullable bvk $$0, fbt $$1) {
      dgl<fcs> $$2 = new dgl<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((fcs)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<jh> h(bvk $$0, fbt $$1) {
      jh $$2 = null;
      double $$3 = Double.MAX_VALUE;
      dgl<jh> $$4 = new dgl<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

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

   default Optional<fby> a(@Nullable bvk $$0, fcs $$1, fby $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         fbt $$6 = $$1.a().c($$3, $$4, $$5);
         fcs $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.F_() == null || this.F_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(fcp::a)
            .reduce(fcp.a(), fcp::a);
         fcs $$8 = fcp.a($$1, $$7, fcc.e);
         return $$8.b($$2);
      }
   }
}
