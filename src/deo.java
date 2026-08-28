import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface deo extends dek {
   dxe C_();

   @Nullable
   dek c(int var1, int var2);

   default boolean a(@Nullable bui $$0, fal $$1) {
      return true;
   }

   default boolean a(dvo $$0, jh $$1, ezw $$2) {
      fal $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(bui $$0) {
      return this.a($$0, fai.a($$0.cT()));
   }

   default boolean b(ezm $$0) {
      return this.a(null, $$0);
   }

   default boolean g(bui $$0) {
      return this.a($$0, $$0.cT());
   }

   default boolean a(@Nullable bui $$0, ezm $$1) {
      return this.a($$0, $$1, false);
   }

   default boolean a(@Nullable bui $$0, ezm $$1, boolean $$2) {
      for (fal $$4 : $$2 ? this.f($$0, $$1) : this.e($$0, $$1)) {
         if (!$$4.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         fal $$5 = this.i($$0, $$1);
         return $$5 == null || !fai.c($$5, fai.a($$1), ezv.i);
      }
   }

   default boolean b(@Nullable bui $$0, ezm $$1) {
      for (fal $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<fal> c(@Nullable bui var1, ezm var2);

   default Iterable<fal> d(@Nullable bui $$0, ezm $$1) {
      List<fal> $$2 = this.c($$0, $$1);
      Iterable<fal> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<fal> e(@Nullable bui $$0, ezm $$1) {
      return () -> new dei<fal>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   default Iterable<fal> f(@Nullable bui $$0, ezm $$1) {
      return () -> new dei<fal>(this, ezw.a($$0, true), $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private fal i(bui $$0, ezm $$1) {
      dxe $$2 = this.C_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default ezn b(den $$0) {
      ezn $$1 = this.a($$0);
      dxe $$2 = this.C_();
      if ($$2.a($$0.b()) && !$$2.a($$1.g())) {
         ezr $$3 = $$1.g().d($$0.b());
         jm $$4 = jm.a($$3.d, $$3.e, $$3.f);
         ezr $$5 = $$2.c($$1.g());
         return new ezn($$5, $$4, jh.a((ka)$$5), false, true);
      } else {
         return $$1;
      }
   }

   default boolean g(@Nullable bui $$0, ezm $$1) {
      dei<fal> $$2 = new dei<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((fal)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<jh> h(bui $$0, ezm $$1) {
      jh $$2 = null;
      double $$3 = Double.MAX_VALUE;
      dei<jh> $$4 = new dei<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

      while ($$4.hasNext()) {
         jh $$5 = (jh)$$4.next();
         double $$6 = $$5.b($$0.dw());
         if ($$6 < $$3 || $$6 == $$3 && ($$2 == null || $$2.i($$5) < 0)) {
            $$2 = $$5.j();
            $$3 = $$6;
         }
      }

      return Optional.ofNullable($$2);
   }

   default Optional<ezr> a(@Nullable bui $$0, fal $$1, ezr $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         ezm $$6 = $$1.a().c($$3, $$4, $$5);
         fal $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.C_() == null || this.C_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(fai::a)
            .reduce(fai.a(), fai::a);
         fal $$8 = fai.a($$1, $$7, ezv.e);
         return $$8.b($$2);
      }
   }
}
