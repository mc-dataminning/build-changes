import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface cvb extends cux {
   dna D_();

   @Nullable
   cux c(int var1, int var2);

   default boolean a(@Nullable bnq $$0, eos $$1) {
      return true;
   }

   default boolean a(dlj $$0, hz $$1, eoe $$2) {
      eos $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(bnq $$0) {
      return this.a($$0, eop.a($$0.cH()));
   }

   default boolean b(enu $$0) {
      return this.a(null, $$0);
   }

   default boolean g(bnq $$0) {
      return this.a($$0, $$0.cH());
   }

   default boolean a(@Nullable bnq $$0, enu $$1) {
      for (eos $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         eos $$3 = this.h($$0, $$1);
         return $$3 == null || !eop.c($$3, eop.a($$1), eod.i);
      }
   }

   default boolean b(@Nullable bnq $$0, enu $$1) {
      for (eos $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<eos> c(@Nullable bnq var1, enu var2);

   default Iterable<eos> d(@Nullable bnq $$0, enu $$1) {
      List<eos> $$2 = this.c($$0, $$1);
      Iterable<eos> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<eos> e(@Nullable bnq $$0, enu $$1) {
      return () -> new cuv<eos>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private eos h(bnq $$0, enu $$1) {
      dna $$2 = this.D_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default boolean f(@Nullable bnq $$0, enu $$1) {
      cuv<eos> $$2 = new cuv<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((eos)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<hz> g(bnq $$0, enu $$1) {
      hz $$2 = null;
      double $$3 = Double.MAX_VALUE;
      cuv<hz> $$4 = new cuv<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

      while ($$4.hasNext()) {
         hz $$5 = (hz)$$4.next();
         double $$6 = $$5.b($$0.dk());
         if ($$6 < $$3 || $$6 == $$3 && ($$2 == null || $$2.i($$5) < 0)) {
            $$2 = $$5.i();
            $$3 = $$6;
         }
      }

      return Optional.ofNullable($$2);
   }

   default Optional<enz> a(@Nullable bnq $$0, eos $$1, enz $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         enu $$6 = $$1.a().c($$3, $$4, $$5);
         eos $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.D_() == null || this.D_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(eop::a)
            .reduce(eop.a(), eop::a);
         eos $$8 = eop.a($$1, $$7, eod.e);
         return $$8.a($$2);
      }
   }
}
