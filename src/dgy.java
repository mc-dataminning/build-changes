import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface dgy {
   List<bvj> a(@Nullable bvj var1, fbs var2, Predicate<? super bvj> var3);

   <T extends bvj> List<T> a(ece<bvj, T> var1, fbs var2, Predicate<? super T> var3);

   default <T extends bvj> List<T> a(Class<T> $$0, fbs $$1, Predicate<? super T> $$2) {
      return this.a(ece.a($$0), $$1, $$2);
   }

   List<? extends cpw> y();

   default List<bvj> a_(@Nullable bvj $$0, fbs $$1) {
      return this.a($$0, $$1, bvo.f);
   }

   default boolean a(@Nullable bvj $$0, fcr $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (bvj $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dQ() && $$2.I && ($$0 == null || !$$2.z($$0)) && fco.c($$1, fco.a($$2.cR()), fcb.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends bvj> List<T> a(Class<T> $$0, fbs $$1) {
      return this.a($$0, $$1, bvo.f);
   }

   default List<fcr> c(@Nullable bvj $$0, fbs $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<bvj> $$2 = $$0 == null ? bvo.g : bvo.f.and($$0::i);
         List<bvj> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<fcr> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (bvj $$5 : $$3) {
               $$4.add(fco.a($$5.cR()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default cpw a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<bvj> $$4) {
      double $$5 = -1.0;
      cpw $$6 = null;

      for (cpw $$7 : this.y()) {
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
   default cpw a(bvj $$0, double $$1) {
      return this.a($$0.dA(), $$0.dC(), $$0.dG(), $$1, false);
   }

   @Nullable
   default cpw a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<bvj> $$5 = $$4 ? bvo.e : bvo.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (cpw $$4 : this.y()) {
         if (bvo.f.test($$4) && bvo.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default cpw b(UUID $$0) {
      for (int $$1 = 0; $$1 < this.y().size(); $$1++) {
         cpw $$2 = this.y().get($$1);
         if ($$0.equals($$2.cG())) {
            return $$2;
         }
      }

      return null;
   }
}
