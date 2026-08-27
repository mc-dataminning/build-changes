import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface csy extends csu {
   dkx D_();

   @Nullable
   csu c(int var1, int var2);

   default boolean a(@Nullable blu $$0, eml $$1) {
      return true;
   }

   default boolean a(djg $$0, hx $$1, elx $$2) {
      eml $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(blu $$0) {
      return this.a($$0, emi.a($$0.cH()));
   }

   default boolean b(eln $$0) {
      return this.a(null, $$0);
   }

   default boolean g(blu $$0) {
      return this.a($$0, $$0.cH());
   }

   default boolean a(@Nullable blu $$0, eln $$1) {
      for (eml $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         eml $$3 = this.h($$0, $$1);
         return $$3 == null || !emi.c($$3, emi.a($$1), elw.i);
      }
   }

   default boolean b(@Nullable blu $$0, eln $$1) {
      for (eml $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<eml> c(@Nullable blu var1, eln var2);

   default Iterable<eml> d(@Nullable blu $$0, eln $$1) {
      List<eml> $$2 = this.c($$0, $$1);
      Iterable<eml> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<eml> e(@Nullable blu $$0, eln $$1) {
      return () -> new css<eml>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private eml h(blu $$0, eln $$1) {
      dkx $$2 = this.D_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default boolean f(@Nullable blu $$0, eln $$1) {
      css<eml> $$2 = new css<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((eml)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<hx> g(blu $$0, eln $$1) {
      hx $$2 = null;
      double $$3 = Double.MAX_VALUE;
      css<hx> $$4 = new css<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

      while ($$4.hasNext()) {
         hx $$5 = (hx)$$4.next();
         double $$6 = $$5.b($$0.dk());
         if ($$6 < $$3 || $$6 == $$3 && ($$2 == null || $$2.i($$5) < 0)) {
            $$2 = $$5.i();
            $$3 = $$6;
         }
      }

      return Optional.ofNullable($$2);
   }

   default Optional<els> a(@Nullable blu $$0, eml $$1, els $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         eln $$6 = $$1.a().c($$3, $$4, $$5);
         eml $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.D_() == null || this.D_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(emi::a)
            .reduce(emi.a(), emi::a);
         eml $$8 = emi.a($$1, $$7, elw.e);
         return $$8.a($$2);
      }
   }
}
