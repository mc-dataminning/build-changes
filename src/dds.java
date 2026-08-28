import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface dds extends ddo {
   dwj B_();

   @Nullable
   ddo c(int var1, int var2);

   default boolean a(@Nullable btr $$0, ezq $$1) {
      return true;
   }

   default boolean a(dus $$0, jf $$1, ezb $$2) {
      ezq $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(btr $$0) {
      return this.a($$0, ezn.a($$0.cO()));
   }

   default boolean b(eyr $$0) {
      return this.a(null, $$0);
   }

   default boolean g(btr $$0) {
      return this.a($$0, $$0.cO());
   }

   default boolean a(@Nullable btr $$0, eyr $$1) {
      return this.a($$0, $$1, false);
   }

   default boolean a(@Nullable btr $$0, eyr $$1, boolean $$2) {
      for (ezq $$4 : $$2 ? this.f($$0, $$1) : this.e($$0, $$1)) {
         if (!$$4.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         ezq $$5 = this.i($$0, $$1);
         return $$5 == null || !ezn.c($$5, ezn.a($$1), eza.i);
      }
   }

   default boolean b(@Nullable btr $$0, eyr $$1) {
      for (ezq $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<ezq> c(@Nullable btr var1, eyr var2);

   default Iterable<ezq> d(@Nullable btr $$0, eyr $$1) {
      List<ezq> $$2 = this.c($$0, $$1);
      Iterable<ezq> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<ezq> e(@Nullable btr $$0, eyr $$1) {
      return () -> new ddm<ezq>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   default Iterable<ezq> f(@Nullable btr $$0, eyr $$1) {
      return () -> new ddm<ezq>(this, ezb.a($$0, true), $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private ezq i(btr $$0, eyr $$1) {
      dwj $$2 = this.B_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default eyu b(ddr $$0) {
      eyu $$1 = this.a($$0);
      dwj $$2 = this.B_();
      if ($$2.a($$0.b()) && !$$2.a($$1.g())) {
         eyw $$3 = $$1.g().d($$0.b());
         jk $$4 = jk.a($$3.d, $$3.e, $$3.f);
         eyw $$5 = $$2.c($$1.g());
         return new eys($$5, $$4, jf.a((jy)$$5), false, true);
      } else {
         return $$1;
      }
   }

   default boolean g(@Nullable btr $$0, eyr $$1) {
      ddm<ezq> $$2 = new ddm<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((ezq)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<jf> h(btr $$0, eyr $$1) {
      jf $$2 = null;
      double $$3 = Double.MAX_VALUE;
      ddm<jf> $$4 = new ddm<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

      while ($$4.hasNext()) {
         jf $$5 = (jf)$$4.next();
         double $$6 = $$5.b($$0.dq());
         if ($$6 < $$3 || $$6 == $$3 && ($$2 == null || $$2.i($$5) < 0)) {
            $$2 = $$5.j();
            $$3 = $$6;
         }
      }

      return Optional.ofNullable($$2);
   }

   default Optional<eyw> a(@Nullable btr $$0, ezq $$1, eyw $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         eyr $$6 = $$1.a().c($$3, $$4, $$5);
         ezq $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.B_() == null || this.B_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(ezn::a)
            .reduce(ezn.a(), ezn::a);
         ezq $$8 = ezn.a($$1, $$7, eza.e);
         return $$8.a($$2);
      }
   }
}
