import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface dbn extends dbj {
   dty C_();

   @Nullable
   dbj c(int var1, int var2);

   default boolean a(@Nullable bsd $$0, ews $$1) {
      return true;
   }

   default boolean a(dsh $$0, ja $$1, ewe $$2) {
      ews $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(bsd $$0) {
      return this.a($$0, ewp.a($$0.cK()));
   }

   default boolean b(evu $$0) {
      return this.a(null, $$0);
   }

   default boolean g(bsd $$0) {
      return this.a($$0, $$0.cK());
   }

   default boolean a(@Nullable bsd $$0, evu $$1) {
      for (ews $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         ews $$3 = this.h($$0, $$1);
         return $$3 == null || !ewp.c($$3, ewp.a($$1), ewd.i);
      }
   }

   default boolean b(@Nullable bsd $$0, evu $$1) {
      for (ews $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<ews> c(@Nullable bsd var1, evu var2);

   default Iterable<ews> d(@Nullable bsd $$0, evu $$1) {
      List<ews> $$2 = this.c($$0, $$1);
      Iterable<ews> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<ews> e(@Nullable bsd $$0, evu $$1) {
      return () -> new dbh<ews>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private ews h(bsd $$0, evu $$1) {
      dty $$2 = this.C_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default boolean f(@Nullable bsd $$0, evu $$1) {
      dbh<ews> $$2 = new dbh<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((ews)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<ja> g(bsd $$0, evu $$1) {
      ja $$2 = null;
      double $$3 = Double.MAX_VALUE;
      dbh<ja> $$4 = new dbh<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

      while ($$4.hasNext()) {
         ja $$5 = (ja)$$4.next();
         double $$6 = $$5.b($$0.dn());
         if ($$6 < $$3 || $$6 == $$3 && ($$2 == null || $$2.i($$5) < 0)) {
            $$2 = $$5.i();
            $$3 = $$6;
         }
      }

      return Optional.ofNullable($$2);
   }

   default Optional<evz> a(@Nullable bsd $$0, ews $$1, evz $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         evu $$6 = $$1.a().c($$3, $$4, $$5);
         ews $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.C_() == null || this.C_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(ewp::a)
            .reduce(ewp.a(), ewp::a);
         ews $$8 = ewp.a($$1, $$7, ewd.e);
         return $$8.a($$2);
      }
   }
}
