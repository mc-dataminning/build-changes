import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface cpm {
   List<biq> a(@Nullable biq var1, ehi var2, Predicate<? super biq> var3);

   <T extends biq> List<T> a(djh<biq, T> var1, ehi var2, Predicate<? super T> var3);

   default <T extends biq> List<T> a(Class<T> $$0, ehi $$1, Predicate<? super T> $$2) {
      return this.a(djh.a($$0), $$1, $$2);
   }

   List<? extends cbu> v();

   default List<biq> a_(@Nullable biq $$0, ehi $$1) {
      return this.a($$0, $$1, bit.f);
   }

   default boolean a(@Nullable biq $$0, eig $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (biq $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dG() && $$2.I && ($$0 == null || !$$2.y($$0)) && eid.c($$1, eid.a($$2.cG()), ehr.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends biq> List<T> a(Class<T> $$0, ehi $$1) {
      return this.a($$0, $$1, bit.f);
   }

   default List<eig> c(@Nullable biq $$0, ehi $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<biq> $$2 = $$0 == null ? bit.g : bit.f.and($$0::h);
         List<biq> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<eig> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (biq $$5 : $$3) {
               $$4.add(eid.a($$5.cG()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default cbu a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<biq> $$4) {
      double $$5 = -1.0;
      cbu $$6 = null;

      for (cbu $$7 : this.v()) {
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
   default cbu a(biq $$0, double $$1) {
      return this.a($$0.dq(), $$0.ds(), $$0.dw(), $$1, false);
   }

   @Nullable
   default cbu a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<biq> $$5 = $$4 ? bit.e : bit.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (cbu $$4 : this.v()) {
         if (bit.f.test($$4) && bit.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default cbu a(bts $$0, bjg $$1) {
      return this.a(this.v(), $$0, $$1, $$1.dq(), $$1.ds(), $$1.dw());
   }

   @Nullable
   default cbu a(bts $$0, bjg $$1, double $$2, double $$3, double $$4) {
      return this.a(this.v(), $$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   default cbu a(bts $$0, double $$1, double $$2, double $$3) {
      return this.a(this.v(), $$0, null, $$1, $$2, $$3);
   }

   @Nullable
   default <T extends bjg> T a(Class<? extends T> $$0, bts $$1, @Nullable bjg $$2, double $$3, double $$4, double $$5, ehi $$6) {
      return this.a(this.a($$0, $$6, $$0x -> true), $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   default <T extends bjg> T a(List<? extends T> $$0, bts $$1, @Nullable bjg $$2, double $$3, double $$4, double $$5) {
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

   default List<cbu> a(bts $$0, bjg $$1, ehi $$2) {
      List<cbu> $$3 = Lists.newArrayList();

      for (cbu $$4 : this.v()) {
         if ($$2.e($$4.dq(), $$4.ds(), $$4.dw()) && $$0.a($$1, $$4)) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   default <T extends bjg> List<T> a(Class<T> $$0, bts $$1, bjg $$2, ehi $$3) {
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
   default cbu b(UUID $$0) {
      for (int $$1 = 0; $$1 < this.v().size(); $$1++) {
         cbu $$2 = this.v().get($$1);
         if ($$0.equals($$2.cv())) {
            return $$2;
         }
      }

      return null;
   }
}
