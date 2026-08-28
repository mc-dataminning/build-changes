import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface dek extends deg {
   dxa C_();

   @Nullable
   deg c(int var1, int var2);

   default boolean a(@Nullable bue $$0, fah $$1) {
      return true;
   }

   default boolean a(dvj $$0, jh $$1, ezs $$2) {
      fah $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(bue $$0) {
      return this.a($$0, fae.a($$0.cS()));
   }

   default boolean b(ezi $$0) {
      return this.a(null, $$0);
   }

   default boolean g(bue $$0) {
      return this.a($$0, $$0.cS());
   }

   default boolean a(@Nullable bue $$0, ezi $$1) {
      return this.a($$0, $$1, false);
   }

   default boolean a(@Nullable bue $$0, ezi $$1, boolean $$2) {
      for (fah $$4 : $$2 ? this.f($$0, $$1) : this.e($$0, $$1)) {
         if (!$$4.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         fah $$5 = this.i($$0, $$1);
         return $$5 == null || !fae.c($$5, fae.a($$1), ezr.i);
      }
   }

   default boolean b(@Nullable bue $$0, ezi $$1) {
      for (fah $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<fah> c(@Nullable bue var1, ezi var2);

   default Iterable<fah> d(@Nullable bue $$0, ezi $$1) {
      List<fah> $$2 = this.c($$0, $$1);
      Iterable<fah> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<fah> e(@Nullable bue $$0, ezi $$1) {
      return () -> new dee<fah>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   default Iterable<fah> f(@Nullable bue $$0, ezi $$1) {
      return () -> new dee<fah>(this, ezs.a($$0, true), $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private fah i(bue $$0, ezi $$1) {
      dxa $$2 = this.C_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default ezj b(dej $$0) {
      ezj $$1 = this.a($$0);
      dxa $$2 = this.C_();
      if ($$2.a($$0.b()) && !$$2.a($$1.g())) {
         ezn $$3 = $$1.g().d($$0.b());
         jm $$4 = jm.a($$3.d, $$3.e, $$3.f);
         ezn $$5 = $$2.c($$1.g());
         return new ezj($$5, $$4, jh.a((ka)$$5), false, true);
      } else {
         return $$1;
      }
   }

   default boolean g(@Nullable bue $$0, ezi $$1) {
      dee<fah> $$2 = new dee<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((fah)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<jh> h(bue $$0, ezi $$1) {
      jh $$2 = null;
      double $$3 = Double.MAX_VALUE;
      dee<jh> $$4 = new dee<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

      while ($$4.hasNext()) {
         jh $$5 = (jh)$$4.next();
         double $$6 = $$5.b($$0.dv());
         if ($$6 < $$3 || $$6 == $$3 && ($$2 == null || $$2.i($$5) < 0)) {
            $$2 = $$5.j();
            $$3 = $$6;
         }
      }

      return Optional.ofNullable($$2);
   }

   default Optional<ezn> a(@Nullable bue $$0, fah $$1, ezn $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         ezi $$6 = $$1.a().c($$3, $$4, $$5);
         fah $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.C_() == null || this.C_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(fae::a)
            .reduce(fae.a(), fae::a);
         fah $$8 = fae.a($$1, $$7, ezr.e);
         return $$8.b($$2);
      }
   }
}
