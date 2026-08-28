import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface djp {
   List<bwt> a(@Nullable bwt var1, ffl var2, Predicate<? super bwt> var3);

   <T extends bwt> List<T> a(efq<bwt, T> var1, ffl var2, Predicate<? super T> var3);

   default <T extends bwt> List<T> a(Class<T> $$0, ffl $$1, Predicate<? super T> $$2) {
      return this.a(efq.a($$0), $$1, $$2);
   }

   List<? extends crx> z();

   default List<bwt> a_(@Nullable bwt $$0, ffl $$1) {
      return this.a($$0, $$1, bxa.f);
   }

   default boolean a(@Nullable bwt $$0, fgk $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (bwt $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dQ() && $$2.I && ($$0 == null || !$$2.z($$0)) && fgh.c($$1, fgh.a($$2.cR()), ffu.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends bwt> List<T> a(Class<T> $$0, ffl $$1) {
      return this.a($$0, $$1, bxa.f);
   }

   default List<fgk> c(@Nullable bwt $$0, ffl $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<bwt> $$2 = $$0 == null ? bxa.g : bxa.f.and($$0::i);
         List<bwt> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<fgk> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (bwt $$5 : $$3) {
               $$4.add(fgh.a($$5.cR()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default crx a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<bwt> $$4) {
      double $$5 = -1.0;
      crx $$6 = null;

      for (crx $$7 : this.z()) {
         if ($$4 == null || $$4.test($$7)) {
            double $$8 = $$7.h($$0, $$1, $$2);
            if (($$3 < 0.0 || $$8 < $$3 * $$3) && ($$5 == -1.0 || $$8 < $$5)) {
               $$5 = $$8;
               $$6 = $$7;
            }
         }
      }

      return $$6;
   }

   @Nullable
   default crx a(bwt $$0, double $$1) {
      return this.a($$0.dA(), $$0.dC(), $$0.dG(), $$1, false);
   }

   @Nullable
   default crx a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<bwt> $$5 = $$4 ? bxa.e : bxa.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (crx $$4 : this.z()) {
         if (bxa.f.test($$4) && bxa.b.test($$4)) {
            double $$5 = $$4.h($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default crx a(UUID $$0) {
      for (int $$1 = 0; $$1 < this.z().size(); $$1++) {
         crx $$2 = this.z().get($$1);
         if ($$0.equals($$2.cG())) {
            return $$2;
         }
      }

      return null;
   }
}
