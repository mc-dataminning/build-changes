import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface dih {
   List<bwa> a(@Nullable bwa var1, fdr var2, Predicate<? super bwa> var3);

   <T extends bwa> List<T> a(eea<bwa, T> var1, fdr var2, Predicate<? super T> var3);

   default <T extends bwa> List<T> a(Class<T> $$0, fdr $$1, Predicate<? super T> $$2) {
      return this.a(eea.a($$0), $$1, $$2);
   }

   List<? extends cqs> z();

   default List<bwa> a_(@Nullable bwa $$0, fdr $$1) {
      return this.a($$0, $$1, bwh.f);
   }

   default boolean a(@Nullable bwa $$0, feq $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (bwa $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dQ() && $$2.I && ($$0 == null || !$$2.z($$0)) && fen.c($$1, fen.a($$2.cR()), fea.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends bwa> List<T> a(Class<T> $$0, fdr $$1) {
      return this.a($$0, $$1, bwh.f);
   }

   default List<feq> c(@Nullable bwa $$0, fdr $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<bwa> $$2 = $$0 == null ? bwh.g : bwh.f.and($$0::i);
         List<bwa> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<feq> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (bwa $$5 : $$3) {
               $$4.add(fen.a($$5.cR()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default cqs a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<bwa> $$4) {
      double $$5 = -1.0;
      cqs $$6 = null;

      for (cqs $$7 : this.z()) {
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
   default cqs a(bwa $$0, double $$1) {
      return this.a($$0.dA(), $$0.dC(), $$0.dG(), $$1, false);
   }

   @Nullable
   default cqs a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<bwa> $$5 = $$4 ? bwh.e : bwh.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (cqs $$4 : this.z()) {
         if (bwh.f.test($$4) && bwh.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default cqs a(UUID $$0) {
      for (int $$1 = 0; $$1 < this.z().size(); $$1++) {
         cqs $$2 = this.z().get($$1);
         if ($$0.equals($$2.cG())) {
            return $$2;
         }
      }

      return null;
   }
}
