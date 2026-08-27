import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface cps {
   List<biw> a(@Nullable biw var1, ehc var2, Predicate<? super biw> var3);

   <T extends biw> List<T> a(djb<biw, T> var1, ehc var2, Predicate<? super T> var3);

   default <T extends biw> List<T> a(Class<T> $$0, ehc $$1, Predicate<? super T> $$2) {
      return this.a(djb.a($$0), $$1, $$2);
   }

   List<? extends cca> v();

   default List<biw> a_(@Nullable biw $$0, ehc $$1) {
      return this.a($$0, $$1, biz.f);
   }

   default boolean a(@Nullable biw $$0, eia $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (biw $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dG() && $$2.I && ($$0 == null || !$$2.y($$0)) && ehx.c($$1, ehx.a($$2.cG()), ehl.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends biw> List<T> a(Class<T> $$0, ehc $$1) {
      return this.a($$0, $$1, biz.f);
   }

   default List<eia> c(@Nullable biw $$0, ehc $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<biw> $$2 = $$0 == null ? biz.g : biz.f.and($$0::h);
         List<biw> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<eia> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (biw $$5 : $$3) {
               $$4.add(ehx.a($$5.cG()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default cca a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<biw> $$4) {
      double $$5 = -1.0;
      cca $$6 = null;

      for (cca $$7 : this.v()) {
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
   default cca a(biw $$0, double $$1) {
      return this.a($$0.dq(), $$0.ds(), $$0.dw(), $$1, false);
   }

   @Nullable
   default cca a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<biw> $$5 = $$4 ? biz.e : biz.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (cca $$4 : this.v()) {
         if (biz.f.test($$4) && biz.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default cca a(bty $$0, bjm $$1) {
      return this.a(this.v(), $$0, $$1, $$1.dq(), $$1.ds(), $$1.dw());
   }

   @Nullable
   default cca a(bty $$0, bjm $$1, double $$2, double $$3, double $$4) {
      return this.a(this.v(), $$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   default cca a(bty $$0, double $$1, double $$2, double $$3) {
      return this.a(this.v(), $$0, null, $$1, $$2, $$3);
   }

   @Nullable
   default <T extends bjm> T a(Class<? extends T> $$0, bty $$1, @Nullable bjm $$2, double $$3, double $$4, double $$5, ehc $$6) {
      return this.a(this.a($$0, $$6, $$0x -> true), $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   default <T extends bjm> T a(List<? extends T> $$0, bty $$1, @Nullable bjm $$2, double $$3, double $$4, double $$5) {
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

   default List<cca> a(bty $$0, bjm $$1, ehc $$2) {
      List<cca> $$3 = Lists.newArrayList();

      for (cca $$4 : this.v()) {
         if ($$2.e($$4.dq(), $$4.ds(), $$4.dw()) && $$0.a($$1, $$4)) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   default <T extends bjm> List<T> a(Class<T> $$0, bty $$1, bjm $$2, ehc $$3) {
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
   default cca b(UUID $$0) {
      for (int $$1 = 0; $$1 < this.v().size(); $$1++) {
         cca $$2 = this.v().get($$1);
         if ($$0.equals($$2.cv())) {
            return $$2;
         }
      }

      return null;
   }
}
