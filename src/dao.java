import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface dao {
   List<bru> a(@Nullable bru var1, euf var2, Predicate<? super bru> var3);

   <T extends bru> List<T> a(dvi<bru, T> var1, euf var2, Predicate<? super T> var3);

   default <T extends bru> List<T> a(Class<T> $$0, euf $$1, Predicate<? super T> $$2) {
      return this.a(dvi.a($$0), $$1, $$2);
   }

   List<? extends clw> x();

   default List<bru> a_(@Nullable bru $$0, euf $$1) {
      return this.a($$0, $$1, brz.f);
   }

   default boolean a(@Nullable bru $$0, evd $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (bru $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dK() && $$2.J && ($$0 == null || !$$2.y($$0)) && eva.c($$1, eva.a($$2.cK()), euo.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends bru> List<T> a(Class<T> $$0, euf $$1) {
      return this.a($$0, $$1, brz.f);
   }

   default List<evd> c(@Nullable bru $$0, euf $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<bru> $$2 = $$0 == null ? brz.g : brz.f.and($$0::i);
         List<bru> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<evd> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (bru $$5 : $$3) {
               $$4.add(eva.a($$5.cK()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default clw a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<bru> $$4) {
      double $$5 = -1.0;
      clw $$6 = null;

      for (clw $$7 : this.x()) {
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
   default clw a(bru $$0, double $$1) {
      return this.a($$0.du(), $$0.dw(), $$0.dA(), $$1, false);
   }

   @Nullable
   default clw a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<bru> $$5 = $$4 ? brz.e : brz.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (clw $$4 : this.x()) {
         if (brz.f.test($$4) && brz.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default clw a(cdf $$0, bso $$1) {
      return this.a(this.x(), $$0, $$1, $$1.du(), $$1.dw(), $$1.dA());
   }

   @Nullable
   default clw a(cdf $$0, bso $$1, double $$2, double $$3, double $$4) {
      return this.a(this.x(), $$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   default clw a(cdf $$0, double $$1, double $$2, double $$3) {
      return this.a(this.x(), $$0, null, $$1, $$2, $$3);
   }

   @Nullable
   default <T extends bso> T a(Class<? extends T> $$0, cdf $$1, @Nullable bso $$2, double $$3, double $$4, double $$5, euf $$6) {
      return this.a(this.a($$0, $$6, $$0x -> true), $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   default <T extends bso> T a(List<? extends T> $$0, cdf $$1, @Nullable bso $$2, double $$3, double $$4, double $$5) {
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

   default List<clw> a(cdf $$0, bso $$1, euf $$2) {
      List<clw> $$3 = Lists.newArrayList();

      for (clw $$4 : this.x()) {
         if ($$2.e($$4.du(), $$4.dw(), $$4.dA()) && $$0.a($$1, $$4)) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   default <T extends bso> List<T> a(Class<T> $$0, cdf $$1, bso $$2, euf $$3) {
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
   default clw b(UUID $$0) {
      for (int $$1 = 0; $$1 < this.x().size(); $$1++) {
         clw $$2 = this.x().get($$1);
         if ($$0.equals($$2.cz())) {
            return $$2;
         }
      }

      return null;
   }
}
