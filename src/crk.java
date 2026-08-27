import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface crk extends crg {
   diz C_();

   @Nullable
   crg c(int var1, int var2);

   default boolean a(@Nullable bkq $$0, ekn $$1) {
      return true;
   }

   default boolean a(dhi $$0, ht $$1, ejz $$2) {
      ekn $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(bkq $$0) {
      return this.a($$0, ekk.a($$0.cH()));
   }

   default boolean b(ejp $$0) {
      return this.a(null, $$0);
   }

   default boolean g(bkq $$0) {
      return this.a($$0, $$0.cH());
   }

   default boolean a(@Nullable bkq $$0, ejp $$1) {
      for (ekn $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         ekn $$3 = this.h($$0, $$1);
         return $$3 == null || !ekk.c($$3, ekk.a($$1), ejy.i);
      }
   }

   default boolean b(@Nullable bkq $$0, ejp $$1) {
      for (ekn $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<ekn> c(@Nullable bkq var1, ejp var2);

   default Iterable<ekn> d(@Nullable bkq $$0, ejp $$1) {
      List<ekn> $$2 = this.c($$0, $$1);
      Iterable<ekn> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<ekn> e(@Nullable bkq $$0, ejp $$1) {
      return () -> new cre<ekn>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private ekn h(bkq $$0, ejp $$1) {
      diz $$2 = this.C_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default boolean f(@Nullable bkq $$0, ejp $$1) {
      cre<ekn> $$2 = new cre<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((ekn)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<ht> g(bkq $$0, ejp $$1) {
      ht $$2 = null;
      double $$3 = Double.MAX_VALUE;
      cre<ht> $$4 = new cre<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

      while ($$4.hasNext()) {
         ht $$5 = (ht)$$4.next();
         double $$6 = $$5.b($$0.dl());
         if ($$6 < $$3 || $$6 == $$3 && ($$2 == null || $$2.i($$5) < 0)) {
            $$2 = $$5.i();
            $$3 = $$6;
         }
      }

      return Optional.ofNullable($$2);
   }

   default Optional<eju> a(@Nullable bkq $$0, ekn $$1, eju $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         ejp $$6 = $$1.a().c($$3, $$4, $$5);
         ekn $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.C_() == null || this.C_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(ekk::a)
            .reduce(ekk.a(), ekk::a);
         ekn $$8 = ekk.a($$1, $$7, ejy.e);
         return $$8.a($$2);
      }
   }
}
