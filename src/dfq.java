import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface dfq extends dfm {
   dym F_();

   @Nullable
   dfm c(int var1, int var2);

   default boolean a(@Nullable buk $$0, fbt $$1) {
      return true;
   }

   default boolean a(dww $$0, ji $$1, fbe $$2) {
      fbt $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(buk $$0) {
      return this.a($$0, fbq.a($$0.cR()));
   }

   default boolean b(fau $$0) {
      return this.a(null, $$0);
   }

   default boolean g(buk $$0) {
      return this.a($$0, $$0.cR());
   }

   default boolean a(@Nullable buk $$0, fau $$1) {
      return this.a($$0, $$1, false);
   }

   default boolean a(@Nullable buk $$0, fau $$1, boolean $$2) {
      for (fbt $$4 : $$2 ? this.f($$0, $$1) : this.e($$0, $$1)) {
         if (!$$4.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         fbt $$5 = this.i($$0, $$1);
         return $$5 == null || !fbq.c($$5, fbq.a($$1), fbd.i);
      }
   }

   default boolean b(@Nullable buk $$0, fau $$1) {
      for (fbt $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<fbt> c(@Nullable buk var1, fau var2);

   default Iterable<fbt> d(@Nullable buk $$0, fau $$1) {
      List<fbt> $$2 = this.c($$0, $$1);
      Iterable<fbt> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<fbt> e(@Nullable buk $$0, fau $$1) {
      return () -> new dfk<fbt>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   default Iterable<fbt> f(@Nullable buk $$0, fau $$1) {
      return () -> new dfk<fbt>(this, fbe.a($$0, true), $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private fbt i(buk $$0, fau $$1) {
      dym $$2 = this.F_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default fav b(dfp $$0) {
      fav $$1 = this.a($$0);
      dym $$2 = this.F_();
      if ($$2.a($$0.b()) && !$$2.a($$1.g())) {
         faz $$3 = $$1.g().d($$0.b());
         jn $$4 = jn.a($$3.d, $$3.e, $$3.f);
         faz $$5 = $$2.c($$1.g());
         return new fav($$5, $$4, ji.a((kb)$$5), false, true);
      } else {
         return $$1;
      }
   }

   default boolean g(@Nullable buk $$0, fau $$1) {
      dfk<fbt> $$2 = new dfk<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((fbt)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<ji> h(buk $$0, fau $$1) {
      ji $$2 = null;
      double $$3 = Double.MAX_VALUE;
      dfk<ji> $$4 = new dfk<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

      while ($$4.hasNext()) {
         ji $$5 = (ji)$$4.next();
         double $$6 = $$5.b($$0.dt());
         if ($$6 < $$3 || $$6 == $$3 && ($$2 == null || $$2.i($$5) < 0)) {
            $$2 = $$5.j();
            $$3 = $$6;
         }
      }

      return Optional.ofNullable($$2);
   }

   default Optional<faz> a(@Nullable buk $$0, fbt $$1, faz $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         fau $$6 = $$1.a().c($$3, $$4, $$5);
         fbt $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.F_() == null || this.F_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(fbq::a)
            .reduce(fbq.a(), fbq::a);
         fbt $$8 = fbq.a($$1, $$7, fbd.e);
         return $$8.b($$2);
      }
   }
}
