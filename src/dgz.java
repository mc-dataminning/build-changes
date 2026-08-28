import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface dgz extends dgv {
   eae A_();

   @Nullable
   dgv c(int var1, int var2);

   default boolean a(@Nullable bvs $$0, fdo $$1) {
      return true;
   }

   default boolean a(dym $$0, jj $$1, fcz $$2) {
      fdo $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a($$1));
   }

   default boolean f(bvs $$0) {
      return this.a($$0, fdl.a($$0.cR()));
   }

   default boolean b(fcp $$0) {
      return this.a(null, $$0);
   }

   default boolean g(bvs $$0) {
      return this.a($$0, $$0.cR());
   }

   default boolean a(@Nullable bvs $$0, fcp $$1) {
      return this.a($$0, $$1, false);
   }

   default boolean a(@Nullable bvs $$0, fcp $$1, boolean $$2) {
      for (fdo $$4 : $$2 ? this.f($$0, $$1) : this.e($$0, $$1)) {
         if (!$$4.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         fdo $$5 = this.i($$0, $$1);
         return $$5 == null || !fdl.c($$5, fdl.a($$1), fcy.i);
      }
   }

   default boolean b(@Nullable bvs $$0, fcp $$1) {
      for (fdo $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<fdo> c(@Nullable bvs var1, fcp var2);

   default Iterable<fdo> d(@Nullable bvs $$0, fcp $$1) {
      List<fdo> $$2 = this.c($$0, $$1);
      Iterable<fdo> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<fdo> e(@Nullable bvs $$0, fcp $$1) {
      return () -> new dgt<fdo>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   default Iterable<fdo> f(@Nullable bvs $$0, fcp $$1) {
      return () -> new dgt<fdo>(this, fcz.a($$0, true), $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private fdo i(bvs $$0, fcp $$1) {
      eae $$2 = this.A_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default fcq b(dgy $$0) {
      fcq $$1 = this.a($$0);
      eae $$2 = this.A_();
      if ($$2.a($$0.b()) && !$$2.a($$1.g())) {
         fcu $$3 = $$1.g().d($$0.b());
         jo $$4 = jo.a($$3.d, $$3.e, $$3.f);
         fcu $$5 = $$2.c($$1.g());
         return new fcq($$5, $$4, jj.a((kc)$$5), false, true);
      } else {
         return $$1;
      }
   }

   default boolean g(@Nullable bvs $$0, fcp $$1) {
      dgt<fdo> $$2 = new dgt<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((fdo)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<jj> h(bvs $$0, fcp $$1) {
      jj $$2 = null;
      double $$3 = Double.MAX_VALUE;
      dgt<jj> $$4 = new dgt<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

      while ($$4.hasNext()) {
         jj $$5 = (jj)$$4.next();
         double $$6 = $$5.b($$0.dt());
         if ($$6 < $$3 || $$6 == $$3 && ($$2 == null || $$2.i($$5) < 0)) {
            $$2 = $$5.j();
            $$3 = $$6;
         }
      }

      return Optional.ofNullable($$2);
   }

   default Optional<fcu> a(@Nullable bvs $$0, fdo $$1, fcu $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         fcp $$6 = $$1.a().c($$3, $$4, $$5);
         fdo $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.A_() == null || this.A_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(fdl::a)
            .reduce(fdl.a(), fdl::a);
         fdo $$8 = fdl.a($$1, $$7, fcy.e);
         return $$8.b($$2);
      }
   }
}
