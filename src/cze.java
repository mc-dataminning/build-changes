import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface cze extends cza {
   drp C_();

   @Nullable
   cza c(int var1, int var2);

   default boolean a(@Nullable bql $$0, ety $$1) {
      return true;
   }

   default boolean a(dpy $$0, im $$1, etk $$2) {
      ety $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(bql $$0) {
      return this.a($$0, etv.a($$0.cI()));
   }

   default boolean b(eta $$0) {
      return this.a(null, $$0);
   }

   default boolean g(bql $$0) {
      return this.a($$0, $$0.cI());
   }

   default boolean a(@Nullable bql $$0, eta $$1) {
      for (ety $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         ety $$3 = this.h($$0, $$1);
         return $$3 == null || !etv.c($$3, etv.a($$1), etj.i);
      }
   }

   default boolean b(@Nullable bql $$0, eta $$1) {
      for (ety $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<ety> c(@Nullable bql var1, eta var2);

   default Iterable<ety> d(@Nullable bql $$0, eta $$1) {
      List<ety> $$2 = this.c($$0, $$1);
      Iterable<ety> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<ety> e(@Nullable bql $$0, eta $$1) {
      return () -> new cyy<ety>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private ety h(bql $$0, eta $$1) {
      drp $$2 = this.C_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default boolean f(@Nullable bql $$0, eta $$1) {
      cyy<ety> $$2 = new cyy<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((ety)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<im> g(bql $$0, eta $$1) {
      im $$2 = null;
      double $$3 = Double.MAX_VALUE;
      cyy<im> $$4 = new cyy<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

      while ($$4.hasNext()) {
         im $$5 = (im)$$4.next();
         double $$6 = $$5.b($$0.dl());
         if ($$6 < $$3 || $$6 == $$3 && ($$2 == null || $$2.i($$5) < 0)) {
            $$2 = $$5.i();
            $$3 = $$6;
         }
      }

      return Optional.ofNullable($$2);
   }

   default Optional<etf> a(@Nullable bql $$0, ety $$1, etf $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         eta $$6 = $$1.a().c($$3, $$4, $$5);
         ety $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.C_() == null || this.C_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(etv::a)
            .reduce(etv.a(), etv::a);
         ety $$8 = etv.a($$1, $$7, etj.e);
         return $$8.a($$2);
      }
   }
}
