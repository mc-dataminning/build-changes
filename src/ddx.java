import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface ddx {
   List<bto> a(@Nullable bto var1, eyn var2, Predicate<? super bto> var3);

   <T extends bto> List<T> a(dyz<bto, T> var1, eyn var2, Predicate<? super T> var3);

   default <T extends bto> List<T> a(Class<T> $$0, eyn $$1, Predicate<? super T> $$2) {
      return this.a(dyz.a($$0), $$1, $$2);
   }

   List<? extends cnu> x();

   default List<bto> a_(@Nullable bto $$0, eyn $$1) {
      return this.a($$0, $$1, btt.f);
   }

   default boolean a(@Nullable bto $$0, ezm $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (bto $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dN() && $$2.J && ($$0 == null || !$$2.z($$0)) && ezj.c($$1, ezj.a($$2.cO()), eyw.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends bto> List<T> a(Class<T> $$0, eyn $$1) {
      return this.a($$0, $$1, btt.f);
   }

   default List<ezm> c(@Nullable bto $$0, eyn $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<bto> $$2 = $$0 == null ? btt.g : btt.f.and($$0::i);
         List<bto> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<ezm> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (bto $$5 : $$3) {
               $$4.add(ezj.a($$5.cO()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default cnu a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<bto> $$4) {
      double $$5 = -1.0;
      cnu $$6 = null;

      for (cnu $$7 : this.x()) {
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
   default cnu a(bto $$0, double $$1) {
      return this.a($$0.dx(), $$0.dz(), $$0.dD(), $$1, false);
   }

   @Nullable
   default cnu a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<bto> $$5 = $$4 ? btt.e : btt.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (cnu $$4 : this.x()) {
         if (btt.f.test($$4) && btt.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default cnu a(cfa $$0, buk $$1) {
      return this.a(this.x(), $$0, $$1, $$1.dx(), $$1.dz(), $$1.dD());
   }

   @Nullable
   default cnu a(cfa $$0, buk $$1, double $$2, double $$3, double $$4) {
      return this.a(this.x(), $$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   default cnu a(cfa $$0, double $$1, double $$2, double $$3) {
      return this.a(this.x(), $$0, null, $$1, $$2, $$3);
   }

   @Nullable
   default <T extends buk> T a(Class<? extends T> $$0, cfa $$1, @Nullable buk $$2, double $$3, double $$4, double $$5, eyn $$6) {
      return this.a(this.a($$0, $$6, $$0x -> true), $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   default <T extends buk> T a(List<? extends T> $$0, cfa $$1, @Nullable buk $$2, double $$3, double $$4, double $$5) {
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

   default List<cnu> a(cfa $$0, buk $$1, eyn $$2) {
      List<cnu> $$3 = Lists.newArrayList();

      for (cnu $$4 : this.x()) {
         if ($$2.e($$4.dx(), $$4.dz(), $$4.dD()) && $$0.a($$1, $$4)) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   default <T extends buk> List<T> a(Class<T> $$0, cfa $$1, buk $$2, eyn $$3) {
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
   default cnu b(UUID $$0) {
      for (int $$1 = 0; $$1 < this.x().size(); $$1++) {
         cnu $$2 = this.x().get($$1);
         if ($$0.equals($$2.cD())) {
            return $$2;
         }
      }

      return null;
   }
}
