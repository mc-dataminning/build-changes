import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface dbk extends dbg {
   dut D_();

   @Nullable
   dbg a(int var1, int var2);

   default boolean a(@Nullable brv $$0, exn $$1) {
      return true;
   }

   default boolean a(dtc $$0, ir $$1, ewz $$2) {
      exn $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(brv $$0) {
      return this.a($$0, exk.a($$0.cP()));
   }

   default boolean b(ewp $$0) {
      return this.b(null, $$0);
   }

   default boolean g(brv $$0) {
      return this.b($$0, $$0.cP());
   }

   default boolean b(@Nullable brv $$0, ewp $$1) {
      return this.a($$0, $$1, false);
   }

   default boolean a(@Nullable brv $$0, ewp $$1, boolean $$2) {
      for (exn $$3 : this.e($$0, $$1)) {
         if (!$$3.c()) {
            return false;
         }
      }

      if (!this.a($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         exn $$4 = this.h($$0, $$1);
         return $$4 == null || !exk.c($$4, exk.a($$1), ewy.i);
      }
   }

   default boolean c(@Nullable brv $$0, ewp $$1) {
      for (exn $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<exn> a(@Nullable brv var1, ewp var2);

   default Iterable<exn> d(@Nullable brv $$0, ewp $$1) {
      List<exn> $$2 = this.a($$0, $$1);
      Iterable<exn> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<exn> e(@Nullable brv $$0, ewp $$1) {
      return () -> new dbe<exn>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private exn h(brv $$0, ewp $$1) {
      dut $$2 = this.D_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default boolean f(@Nullable brv $$0, ewp $$1) {
      dbe<exn> $$2 = new dbe<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((exn)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<ir> g(brv $$0, ewp $$1) {
      ir $$2 = null;
      double $$3 = Double.MAX_VALUE;
      dbe<ir> $$4 = new dbe<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

      while ($$4.hasNext()) {
         ir $$5 = (ir)$$4.next();
         double $$6 = $$5.b($$0.ds());
         if ($$6 < $$3 || $$6 == $$3 && ($$2 == null || $$2.i($$5) < 0)) {
            $$2 = $$5.i();
            $$3 = $$6;
         }
      }

      return Optional.ofNullable($$2);
   }

   default Optional<ewu> a(@Nullable brv $$0, exn $$1, ewu $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         ewp $$6 = $$1.a().c($$3, $$4, $$5);
         exn $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.D_() == null || this.D_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(exk::a)
            .reduce(exk.a(), exk::a);
         exn $$8 = exk.a($$1, $$7, ewy.e);
         return $$8.a($$2);
      }
   }
}
