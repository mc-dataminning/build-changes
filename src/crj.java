import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface crj {
   List<bki> a(@Nullable bki var1, ejd var2, Predicate<? super bki> var3);

   <T extends bki> List<T> a(dku<bki, T> var1, ejd var2, Predicate<? super T> var3);

   default <T extends bki> List<T> a(Class<T> $$0, ejd $$1, Predicate<? super T> $$2) {
      return this.a(dku.a($$0), $$1, $$2);
   }

   List<? extends cdm> v();

   default List<bki> a_(@Nullable bki $$0, ejd $$1) {
      return this.a($$0, $$1, bkl.f);
   }

   default boolean a(@Nullable bki $$0, ekb $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (bki $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dG() && $$2.I && ($$0 == null || !$$2.y($$0)) && ejy.c($$1, ejy.a($$2.cG()), ejm.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends bki> List<T> a(Class<T> $$0, ejd $$1) {
      return this.a($$0, $$1, bkl.f);
   }

   default List<ekb> c(@Nullable bki $$0, ejd $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<bki> $$2 = $$0 == null ? bkl.g : bkl.f.and($$0::h);
         List<bki> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<ekb> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (bki $$5 : $$3) {
               $$4.add(ejy.a($$5.cG()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default cdm a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<bki> $$4) {
      double $$5 = -1.0;
      cdm $$6 = null;

      for (cdm $$7 : this.v()) {
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
   default cdm a(bki $$0, double $$1) {
      return this.a($$0.dq(), $$0.ds(), $$0.dw(), $$1, false);
   }

   @Nullable
   default cdm a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<bki> $$5 = $$4 ? bkl.e : bkl.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (cdm $$4 : this.v()) {
         if (bkl.f.test($$4) && bkl.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default cdm a(bvk $$0, bky $$1) {
      return this.a(this.v(), $$0, $$1, $$1.dq(), $$1.ds(), $$1.dw());
   }

   @Nullable
   default cdm a(bvk $$0, bky $$1, double $$2, double $$3, double $$4) {
      return this.a(this.v(), $$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   default cdm a(bvk $$0, double $$1, double $$2, double $$3) {
      return this.a(this.v(), $$0, null, $$1, $$2, $$3);
   }

   @Nullable
   default <T extends bky> T a(Class<? extends T> $$0, bvk $$1, @Nullable bky $$2, double $$3, double $$4, double $$5, ejd $$6) {
      return this.a(this.a($$0, $$6, $$0x -> true), $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   default <T extends bky> T a(List<? extends T> $$0, bvk $$1, @Nullable bky $$2, double $$3, double $$4, double $$5) {
      double $$6 = -1.0;
      T $$7 = null;

      for (T $$8 : $$0) {
         if ($$1.a($$2, $$8)) {
            double $$9 = $$8.i($$3, $$4, $$5);
            if ($$6 == -1.0 || $$9 < $$6) {
               $$6 = $$9;
               $$7 = $$8;
            }
         }
      }

      return $$7;
   }

   default List<cdm> a(bvk $$0, bky $$1, ejd $$2) {
      List<cdm> $$3 = Lists.newArrayList();

      for (cdm $$4 : this.v()) {
         if ($$2.e($$4.dq(), $$4.ds(), $$4.dw()) && $$0.a($$1, $$4)) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   default <T extends bky> List<T> a(Class<T> $$0, bvk $$1, bky $$2, ejd $$3) {
      List<T> $$4 = this.a($$0, $$3, $$0x -> true);
      List<T> $$5 = Lists.newArrayList();

      for (T $$6 : $$4) {
         if ($$1.a($$2, $$6)) {
            $$5.add($$6);
         }
      }

      return $$5;
   }

   @Nullable
   default cdm b(UUID $$0) {
      for (int $$1 = 0; $$1 < this.v().size(); $$1++) {
         cdm $$2 = this.v().get($$1);
         if ($$0.equals($$2.cv())) {
            return $$2;
         }
      }

      return null;
   }
}
