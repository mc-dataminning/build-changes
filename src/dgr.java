import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface dgr {
   List<bvf> a(@Nullable bvf var1, fbn var2, Predicate<? super bvf> var3);

   <T extends bvf> List<T> a(ebx<bvf, T> var1, fbn var2, Predicate<? super T> var3);

   default <T extends bvf> List<T> a(Class<T> $$0, fbn $$1, Predicate<? super T> $$2) {
      return this.a(ebx.a($$0), $$1, $$2);
   }

   List<? extends cps> y();

   default List<bvf> a_(@Nullable bvf $$0, fbn $$1) {
      return this.a($$0, $$1, bvk.f);
   }

   default boolean a(@Nullable bvf $$0, fcm $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (bvf $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dQ() && $$2.I && ($$0 == null || !$$2.z($$0)) && fcj.c($$1, fcj.a($$2.cR()), fbw.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends bvf> List<T> a(Class<T> $$0, fbn $$1) {
      return this.a($$0, $$1, bvk.f);
   }

   default List<fcm> c(@Nullable bvf $$0, fbn $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<bvf> $$2 = $$0 == null ? bvk.g : bvk.f.and($$0::i);
         List<bvf> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<fcm> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (bvf $$5 : $$3) {
               $$4.add(fcj.a($$5.cR()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default cps a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<bvf> $$4) {
      double $$5 = -1.0;
      cps $$6 = null;

      for (cps $$7 : this.y()) {
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
   default cps a(bvf $$0, double $$1) {
      return this.a($$0.dA(), $$0.dC(), $$0.dG(), $$1, false);
   }

   @Nullable
   default cps a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<bvf> $$5 = $$4 ? bvk.e : bvk.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (cps $$4 : this.y()) {
         if (bvk.f.test($$4) && bvk.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default cps b(UUID $$0) {
      for (int $$1 = 0; $$1 < this.y().size(); $$1++) {
         cps $$2 = this.y().get($$1);
         if ($$0.equals($$2.cG())) {
            return $$2;
         }
      }

      return null;
   }
}
