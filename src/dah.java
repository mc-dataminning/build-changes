import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface dah extends dad {
   dss C_();

   @Nullable
   dad c(int var1, int var2);

   default boolean a(@Nullable bru $$0, evd $$1) {
      return true;
   }

   default boolean a(drb $$0, io $$1, eup $$2) {
      evd $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(bru $$0) {
      return this.a($$0, eva.a($$0.cK()));
   }

   default boolean b(euf $$0) {
      return this.a(null, $$0);
   }

   default boolean g(bru $$0) {
      return this.a($$0, $$0.cK());
   }

   default boolean a(@Nullable bru $$0, euf $$1) {
      for (evd $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         evd $$3 = this.h($$0, $$1);
         return $$3 == null || !eva.c($$3, eva.a($$1), euo.i);
      }
   }

   default boolean b(@Nullable bru $$0, euf $$1) {
      for (evd $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<evd> c(@Nullable bru var1, euf var2);

   default Iterable<evd> d(@Nullable bru $$0, euf $$1) {
      List<evd> $$2 = this.c($$0, $$1);
      Iterable<evd> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<evd> e(@Nullable bru $$0, euf $$1) {
      return () -> new dab<evd>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private evd h(bru $$0, euf $$1) {
      dss $$2 = this.C_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default boolean f(@Nullable bru $$0, euf $$1) {
      dab<evd> $$2 = new dab<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((evd)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<io> g(bru $$0, euf $$1) {
      io $$2 = null;
      double $$3 = Double.MAX_VALUE;
      dab<io> $$4 = new dab<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

      while ($$4.hasNext()) {
         io $$5 = (io)$$4.next();
         double $$6 = $$5.b($$0.dn());
         if ($$6 < $$3 || $$6 == $$3 && ($$2 == null || $$2.i($$5) < 0)) {
            $$2 = $$5.i();
            $$3 = $$6;
         }
      }

      return Optional.ofNullable($$2);
   }

   default Optional<euk> a(@Nullable bru $$0, evd $$1, euk $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         euf $$6 = $$1.a().c($$3, $$4, $$5);
         evd $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.C_() == null || this.C_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(eva::a)
            .reduce(eva.a(), eva::a);
         evd $$8 = eva.a($$1, $$7, euo.e);
         return $$8.a($$2);
      }
   }
}
