import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface cpo {
   List<bis> a(@Nullable bis var1, ehk var2, Predicate<? super bis> var3);

   <T extends bis> List<T> a(djj<bis, T> var1, ehk var2, Predicate<? super T> var3);

   default <T extends bis> List<T> a(Class<T> $$0, ehk $$1, Predicate<? super T> $$2) {
      return this.a(djj.a($$0), $$1, $$2);
   }

   List<? extends cbw> v();

   default List<bis> a_(@Nullable bis $$0, ehk $$1) {
      return this.a($$0, $$1, biv.f);
   }

   default boolean a(@Nullable bis $$0, eii $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (bis $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dG() && $$2.I && ($$0 == null || !$$2.y($$0)) && eif.c($$1, eif.a($$2.cG()), eht.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends bis> List<T> a(Class<T> $$0, ehk $$1) {
      return this.a($$0, $$1, biv.f);
   }

   default List<eii> c(@Nullable bis $$0, ehk $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<bis> $$2 = $$0 == null ? biv.g : biv.f.and($$0::h);
         List<bis> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<eii> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (bis $$5 : $$3) {
               $$4.add(eif.a($$5.cG()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default cbw a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<bis> $$4) {
      double $$5 = -1.0;
      cbw $$6 = null;

      for (cbw $$7 : this.v()) {
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
   default cbw a(bis $$0, double $$1) {
      return this.a($$0.dq(), $$0.ds(), $$0.dw(), $$1, false);
   }

   @Nullable
   default cbw a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<bis> $$5 = $$4 ? biv.e : biv.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (cbw $$4 : this.v()) {
         if (biv.f.test($$4) && biv.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default cbw a(btu $$0, bji $$1) {
      return this.a(this.v(), $$0, $$1, $$1.dq(), $$1.ds(), $$1.dw());
   }

   @Nullable
   default cbw a(btu $$0, bji $$1, double $$2, double $$3, double $$4) {
      return this.a(this.v(), $$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   default cbw a(btu $$0, double $$1, double $$2, double $$3) {
      return this.a(this.v(), $$0, null, $$1, $$2, $$3);
   }

   @Nullable
   default <T extends bji> T a(Class<? extends T> $$0, btu $$1, @Nullable bji $$2, double $$3, double $$4, double $$5, ehk $$6) {
      return this.a(this.a($$0, $$6, $$0x -> true), $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   default <T extends bji> T a(List<? extends T> $$0, btu $$1, @Nullable bji $$2, double $$3, double $$4, double $$5) {
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

   default List<cbw> a(btu $$0, bji $$1, ehk $$2) {
      List<cbw> $$3 = Lists.newArrayList();

      for (cbw $$4 : this.v()) {
         if ($$2.e($$4.dq(), $$4.ds(), $$4.dw()) && $$0.a($$1, $$4)) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   default <T extends bji> List<T> a(Class<T> $$0, btu $$1, bji $$2, ehk $$3) {
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
   default cbw b(UUID $$0) {
      for (int $$1 = 0; $$1 < this.v().size(); $$1++) {
         cbw $$2 = this.v().get($$1);
         if ($$0.equals($$2.cv())) {
            return $$2;
         }
      }

      return null;
   }
}
