import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface clw extends cls {
   dds w_();

   @Nullable
   cls c(int var1, int var2);

   default boolean a(@Nullable bfj $$0, efb $$1) {
      return true;
   }

   default boolean a(dcb $$0, gu $$1, een $$2) {
      efb $$3 = $$0.b(this, $$1, $$2);
      return $$3.b() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(bfj $$0) {
      return this.a($$0, eey.a($$0.cE()));
   }

   default boolean b(eed $$0) {
      return this.a(null, $$0);
   }

   default boolean g(bfj $$0) {
      return this.a($$0, $$0.cE());
   }

   default boolean a(@Nullable bfj $$0, eed $$1) {
      for (efb $$2 : this.d($$0, $$1)) {
         if (!$$2.b()) {
            return false;
         }
      }

      if (!this.b($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         efb $$3 = this.g($$0, $$1);
         return $$3 == null || !eey.c($$3, eey.a($$1), eem.i);
      }
   }

   List<efb> b(@Nullable bfj var1, eed var2);

   default Iterable<efb> c(@Nullable bfj $$0, eed $$1) {
      List<efb> $$2 = this.b($$0, $$1);
      Iterable<efb> $$3 = this.d($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<efb> d(@Nullable bfj $$0, eed $$1) {
      return () -> new clq<efb>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private efb g(bfj $$0, eed $$1) {
      dds $$2 = this.w_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default boolean e(@Nullable bfj $$0, eed $$1) {
      clq<efb> $$2 = new clq<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((efb)$$2.next()).b()) {
            return true;
         }
      }

      return false;
   }

   default Optional<gu> f(bfj $$0, eed $$1) {
      gu $$2 = null;
      double $$3 = Double.MAX_VALUE;
      clq<gu> $$4 = new clq<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

      while ($$4.hasNext()) {
         gu $$5 = (gu)$$4.next();
         double $$6 = $$5.b($$0.dg());
         if ($$6 < $$3 || $$6 == $$3 && ($$2 == null || $$2.i($$5) < 0)) {
            $$2 = $$5.i();
            $$3 = $$6;
         }
      }

      return Optional.ofNullable($$2);
   }

   default Optional<eei> a(@Nullable bfj $$0, efb $$1, eei $$2, double $$3, double $$4, double $$5) {
      if ($$1.b()) {
         return Optional.empty();
      } else {
         eed $$6 = $$1.a().c($$3, $$4, $$5);
         efb $$7 = StreamSupport.stream(this.d($$0, $$6).spliterator(), false)
            .filter($$0x -> this.w_() == null || this.w_().a($$0x.a()))
            .flatMap($$0x -> $$0x.d().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(eey::a)
            .reduce(eey.a(), eey::a);
         efb $$8 = eey.a($$1, $$7, eem.e);
         return $$8.a($$2);
      }
   }
}
