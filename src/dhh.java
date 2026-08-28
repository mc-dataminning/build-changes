import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface dhh {
   List<bvs> a(@Nullable bvs var1, fcp var2, Predicate<? super bvs> var3);

   <T extends bvs> List<T> a(ecy<bvs, T> var1, fcp var2, Predicate<? super T> var3);

   default <T extends bvs> List<T> a(Class<T> $$0, fcp $$1, Predicate<? super T> $$2) {
      return this.a(ecy.a($$0), $$1, $$2);
   }

   List<? extends cqi> z();

   default List<bvs> a_(@Nullable bvs $$0, fcp $$1) {
      return this.a($$0, $$1, bvz.f);
   }

   default boolean a(@Nullable bvs $$0, fdo $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (bvs $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dQ() && $$2.I && ($$0 == null || !$$2.z($$0)) && fdl.c($$1, fdl.a($$2.cR()), fcy.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends bvs> List<T> a(Class<T> $$0, fcp $$1) {
      return this.a($$0, $$1, bvz.f);
   }

   default List<fdo> c(@Nullable bvs $$0, fcp $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<bvs> $$2 = $$0 == null ? bvz.g : bvz.f.and($$0::i);
         List<bvs> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<fdo> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (bvs $$5 : $$3) {
               $$4.add(fdl.a($$5.cR()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default cqi a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<bvs> $$4) {
      double $$5 = -1.0;
      cqi $$6 = null;

      for (cqi $$7 : this.z()) {
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
   default cqi a(bvs $$0, double $$1) {
      return this.a($$0.dA(), $$0.dC(), $$0.dG(), $$1, false);
   }

   @Nullable
   default cqi a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<bvs> $$5 = $$4 ? bvz.e : bvz.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (cqi $$4 : this.z()) {
         if (bvz.f.test($$4) && bvz.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default cqi a(UUID $$0) {
      for (int $$1 = 0; $$1 < this.z().size(); $$1++) {
         cqi $$2 = this.z().get($$1);
         if ($$0.equals($$2.cG())) {
            return $$2;
         }
      }

      return null;
   }
}
