import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface dbq extends dbm {
   duc C_();

   @Nullable
   dbm c(int var1, int var2);

   default boolean a(@Nullable bsh $$0, exa $$1) {
      return true;
   }

   default boolean a(dsl $$0, ja $$1, ewm $$2) {
      exa $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(bsh $$0) {
      return this.a($$0, ewx.a($$0.cM()));
   }

   default boolean b(ewc $$0) {
      return this.a(null, $$0);
   }

   default boolean g(bsh $$0) {
      return this.a($$0, $$0.cM());
   }

   default boolean a(@Nullable bsh $$0, ewc $$1) {
      for (exa $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         exa $$3 = this.h($$0, $$1);
         return $$3 == null || !ewx.c($$3, ewx.a($$1), ewl.i);
      }
   }

   default boolean b(@Nullable bsh $$0, ewc $$1) {
      for (exa $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<exa> c(@Nullable bsh var1, ewc var2);

   default Iterable<exa> d(@Nullable bsh $$0, ewc $$1) {
      List<exa> $$2 = this.c($$0, $$1);
      Iterable<exa> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<exa> e(@Nullable bsh $$0, ewc $$1) {
      return () -> new dbk<exa>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private exa h(bsh $$0, ewc $$1) {
      duc $$2 = this.C_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default boolean f(@Nullable bsh $$0, ewc $$1) {
      dbk<exa> $$2 = new dbk<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((exa)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<ja> g(bsh $$0, ewc $$1) {
      ja $$2 = null;
      double $$3 = Double.MAX_VALUE;
      dbk<ja> $$4 = new dbk<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

      while ($$4.hasNext()) {
         ja $$5 = (ja)$$4.next();
         double $$6 = $$5.b($$0.dp());
         if ($$6 < $$3 || $$6 == $$3 && ($$2 == null || $$2.i($$5) < 0)) {
            $$2 = $$5.i();
            $$3 = $$6;
         }
      }

      return Optional.ofNullable($$2);
   }

   default Optional<ewh> a(@Nullable bsh $$0, exa $$1, ewh $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         ewc $$6 = $$1.a().c($$3, $$4, $$5);
         exa $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.C_() == null || this.C_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(ewx::a)
            .reduce(ewx.a(), ewx::a);
         exa $$8 = ewx.a($$1, $$7, ewl.e);
         return $$8.a($$2);
      }
   }
}
