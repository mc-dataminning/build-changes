import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface ddp extends ddl {
   dwf A_();

   @Nullable
   ddl c(int var1, int var2);

   default boolean a(@Nullable bto $$0, ezm $$1) {
      return true;
   }

   default boolean a(duo $$0, je $$1, eyx $$2) {
      ezm $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(bto $$0) {
      return this.a($$0, ezj.a($$0.cO()));
   }

   default boolean b(eyn $$0) {
      return this.a(null, $$0);
   }

   default boolean g(bto $$0) {
      return this.a($$0, $$0.cO());
   }

   default boolean a(@Nullable bto $$0, eyn $$1) {
      return this.a($$0, $$1, false);
   }

   default boolean a(@Nullable bto $$0, eyn $$1, boolean $$2) {
      for (ezm $$4 : $$2 ? this.f($$0, $$1) : this.e($$0, $$1)) {
         if (!$$4.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         ezm $$5 = this.i($$0, $$1);
         return $$5 == null || !ezj.c($$5, ezj.a($$1), eyw.i);
      }
   }

   default boolean b(@Nullable bto $$0, eyn $$1) {
      for (ezm $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<ezm> c(@Nullable bto var1, eyn var2);

   default Iterable<ezm> d(@Nullable bto $$0, eyn $$1) {
      List<ezm> $$2 = this.c($$0, $$1);
      Iterable<ezm> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<ezm> e(@Nullable bto $$0, eyn $$1) {
      return () -> new ddj<ezm>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   default Iterable<ezm> f(@Nullable bto $$0, eyn $$1) {
      return () -> new ddj<ezm>(this, eyx.a($$0, true), $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private ezm i(bto $$0, eyn $$1) {
      dwf $$2 = this.A_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default eyq b(ddo $$0) {
      eyq $$1 = this.a($$0);
      dwf $$2 = this.A_();
      if ($$2.a($$0.b()) && !$$2.a($$1.g())) {
         eys $$3 = $$1.g().d($$0.b());
         jj $$4 = jj.a($$3.d, $$3.e, $$3.f);
         eys $$5 = $$2.c($$1.g());
         return new eyo($$5, $$4, je.a((jx)$$5), false, true);
      } else {
         return $$1;
      }
   }

   default boolean g(@Nullable bto $$0, eyn $$1) {
      ddj<ezm> $$2 = new ddj<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((ezm)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<je> h(bto $$0, eyn $$1) {
      je $$2 = null;
      double $$3 = Double.MAX_VALUE;
      ddj<je> $$4 = new ddj<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

      while ($$4.hasNext()) {
         je $$5 = (je)$$4.next();
         double $$6 = $$5.b($$0.dq());
         if ($$6 < $$3 || $$6 == $$3 && ($$2 == null || $$2.i($$5) < 0)) {
            $$2 = $$5.j();
            $$3 = $$6;
         }
      }

      return Optional.ofNullable($$2);
   }

   default Optional<eys> a(@Nullable bto $$0, ezm $$1, eys $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         eyn $$6 = $$1.a().c($$3, $$4, $$5);
         ezm $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.A_() == null || this.A_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(ezj::a)
            .reduce(ezj.a(), ezj::a);
         ezm $$8 = ezj.a($$1, $$7, eyw.e);
         return $$8.a($$2);
      }
   }
}
