import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface cvo extends cvk {
   dnv D_();

   @Nullable
   cvk c(int var1, int var2);

   default boolean a(@Nullable bof $$0, epo $$1) {
      return true;
   }

   default boolean a(dme $$0, ib $$1, epa $$2) {
      epo $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(bof $$0) {
      return this.a($$0, epl.a($$0.cE()));
   }

   default boolean b(eoq $$0) {
      return this.a(null, $$0);
   }

   default boolean g(bof $$0) {
      return this.a($$0, $$0.cE());
   }

   default boolean a(@Nullable bof $$0, eoq $$1) {
      for (epo $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         epo $$3 = this.h($$0, $$1);
         return $$3 == null || !epl.c($$3, epl.a($$1), eoz.i);
      }
   }

   default boolean b(@Nullable bof $$0, eoq $$1) {
      for (epo $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<epo> c(@Nullable bof var1, eoq var2);

   default Iterable<epo> d(@Nullable bof $$0, eoq $$1) {
      List<epo> $$2 = this.c($$0, $$1);
      Iterable<epo> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<epo> e(@Nullable bof $$0, eoq $$1) {
      return () -> new cvi<epo>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private epo h(bof $$0, eoq $$1) {
      dnv $$2 = this.D_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default boolean f(@Nullable bof $$0, eoq $$1) {
      cvi<epo> $$2 = new cvi<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((epo)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<ib> g(bof $$0, eoq $$1) {
      ib $$2 = null;
      double $$3 = Double.MAX_VALUE;
      cvi<ib> $$4 = new cvi<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

      while ($$4.hasNext()) {
         ib $$5 = (ib)$$4.next();
         double $$6 = $$5.b($$0.dh());
         if ($$6 < $$3 || $$6 == $$3 && ($$2 == null || $$2.i($$5) < 0)) {
            $$2 = $$5.i();
            $$3 = $$6;
         }
      }

      return Optional.ofNullable($$2);
   }

   default Optional<eov> a(@Nullable bof $$0, epo $$1, eov $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         eoq $$6 = $$1.a().c($$3, $$4, $$5);
         epo $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.D_() == null || this.D_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(epl::a)
            .reduce(epl.a(), epl::a);
         epo $$8 = epl.a($$1, $$7, eoz.e);
         return $$8.a($$2);
      }
   }
}
