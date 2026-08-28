import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface dbj extends dbf {
   dtu C_();

   @Nullable
   dbf c(int var1, int var2);

   default boolean a(@Nullable bsv $$0, ewl $$1) {
      return true;
   }

   default boolean a(dsd $$0, iz $$1, evx $$2) {
      ewl $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(bsv $$0) {
      return this.a($$0, ewi.a($$0.cK()));
   }

   default boolean b(evn $$0) {
      return this.a(null, $$0);
   }

   default boolean g(bsv $$0) {
      return this.a($$0, $$0.cK());
   }

   default boolean a(@Nullable bsv $$0, evn $$1) {
      for (ewl $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         ewl $$3 = this.h($$0, $$1);
         return $$3 == null || !ewi.c($$3, ewi.a($$1), evw.i);
      }
   }

   default boolean b(@Nullable bsv $$0, evn $$1) {
      for (ewl $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<ewl> c(@Nullable bsv var1, evn var2);

   default Iterable<ewl> d(@Nullable bsv $$0, evn $$1) {
      List<ewl> $$2 = this.c($$0, $$1);
      Iterable<ewl> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<ewl> e(@Nullable bsv $$0, evn $$1) {
      return () -> new dbd<ewl>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private ewl h(bsv $$0, evn $$1) {
      dtu $$2 = this.C_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default boolean f(@Nullable bsv $$0, evn $$1) {
      dbd<ewl> $$2 = new dbd<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((ewl)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<iz> g(bsv $$0, evn $$1) {
      iz $$2 = null;
      double $$3 = Double.MAX_VALUE;
      dbd<iz> $$4 = new dbd<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

      while ($$4.hasNext()) {
         iz $$5 = (iz)$$4.next();
         double $$6 = $$5.b($$0.dn());
         if ($$6 < $$3 || $$6 == $$3 && ($$2 == null || $$2.i($$5) < 0)) {
            $$2 = $$5.i();
            $$3 = $$6;
         }
      }

      return Optional.ofNullable($$2);
   }

   default Optional<evs> a(@Nullable bsv $$0, ewl $$1, evs $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         evn $$6 = $$1.a().c($$3, $$4, $$5);
         ewl $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.C_() == null || this.C_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(ewi::a)
            .reduce(ewi.a(), ewi::a);
         ewl $$8 = ewi.a($$1, $$7, evw.e);
         return $$8.a($$2);
      }
   }
}
