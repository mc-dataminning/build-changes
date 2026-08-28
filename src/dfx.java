import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface dfx {
   List<buj> a(@Nullable buj var1, fat var2, Predicate<? super buj> var3);

   <T extends buj> List<T> a(ebf<buj, T> var1, fat var2, Predicate<? super T> var3);

   default <T extends buj> List<T> a(Class<T> $$0, fat $$1, Predicate<? super T> $$2) {
      return this.a(ebf.a($$0), $$1, $$2);
   }

   List<? extends cov> z();

   default List<buj> a_(@Nullable buj $$0, fat $$1) {
      return this.a($$0, $$1, buo.f);
   }

   default boolean a(@Nullable buj $$0, fbs $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (buj $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dR() && $$2.I && ($$0 == null || !$$2.z($$0)) && fbp.c($$1, fbp.a($$2.cR()), fbc.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends buj> List<T> a(Class<T> $$0, fat $$1) {
      return this.a($$0, $$1, buo.f);
   }

   default List<fbs> c(@Nullable buj $$0, fat $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<buj> $$2 = $$0 == null ? buo.g : buo.f.and($$0::i);
         List<buj> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<fbs> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (buj $$5 : $$3) {
               $$4.add(fbp.a($$5.cR()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default cov a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<buj> $$4) {
      double $$5 = -1.0;
      cov $$6 = null;

      for (cov $$7 : this.z()) {
         if ($$4 == null || $$4.test($$7)) {
            double $$8 = $$7.i($$0, $$1, $$2);
            if (($$3 < 0.0 || $$8 < $$3 * $$3) && ($$5 == -1.0 || $$8 < $$5)) {
               $$5 = $$8;
               $$6 = $$7;
            }
         }
      }

      return $$6;
   }

   @Nullable
   default cov a(buj $$0, double $$1) {
      return this.a($$0.dB(), $$0.dD(), $$0.dH(), $$1, false);
   }

   @Nullable
   default cov a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<buj> $$5 = $$4 ? buo.e : buo.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (cov $$4 : this.z()) {
         if (buo.f.test($$4) && buo.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default cov b(UUID $$0) {
      for (int $$1 = 0; $$1 < this.z().size(); $$1++) {
         cov $$2 = this.z().get($$1);
         if ($$0.equals($$2.cG())) {
            return $$2;
         }
      }

      return null;
   }
}
