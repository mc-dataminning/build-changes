import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface cou extends coq {
   dgp w_();

   @Nullable
   coq c(int var1, int var2);

   default boolean a(@Nullable big $$0, ehy $$1) {
      return true;
   }

   default boolean a(dey $$0, gv $$1, ehk $$2) {
      ehy $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(big $$0) {
      return this.a($$0, ehv.a($$0.cG()));
   }

   default boolean b(eha $$0) {
      return this.a(null, $$0);
   }

   default boolean g(big $$0) {
      return this.a($$0, $$0.cG());
   }

   default boolean a(@Nullable big $$0, eha $$1) {
      for (ehy $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         ehy $$3 = this.h($$0, $$1);
         return $$3 == null || !ehv.c($$3, ehv.a($$1), ehj.i);
      }
   }

   default boolean b(@Nullable big $$0, eha $$1) {
      for (ehy $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<ehy> c(@Nullable big var1, eha var2);

   default Iterable<ehy> d(@Nullable big $$0, eha $$1) {
      List<ehy> $$2 = this.c($$0, $$1);
      Iterable<ehy> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<ehy> e(@Nullable big $$0, eha $$1) {
      return () -> new coo<ehy>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private ehy h(big $$0, eha $$1) {
      dgp $$2 = this.w_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default boolean f(@Nullable big $$0, eha $$1) {
      coo<ehy> $$2 = new coo<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((ehy)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<gv> g(big $$0, eha $$1) {
      gv $$2 = null;
      double $$3 = Double.MAX_VALUE;
      coo<gv> $$4 = new coo<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

      while ($$4.hasNext()) {
         gv $$5 = (gv)$$4.next();
         double $$6 = $$5.b($$0.di());
         if ($$6 < $$3 || $$6 == $$3 && ($$2 == null || $$2.i($$5) < 0)) {
            $$2 = $$5.i();
            $$3 = $$6;
         }
      }

      return Optional.ofNullable($$2);
   }

   default Optional<ehf> a(@Nullable big $$0, ehy $$1, ehf $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         eha $$6 = $$1.a().c($$3, $$4, $$5);
         ehy $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.w_() == null || this.w_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(ehv::a)
            .reduce(ehv.a(), ehv::a);
         ehy $$8 = ehv.a($$1, $$7, ehj.e);
         return $$8.a($$2);
      }
   }
}
