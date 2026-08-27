import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface cpc {
   List<bii> a(@Nullable bii var1, egy var2, Predicate<? super bii> var3);

   <T extends bii> List<T> a(dix<bii, T> var1, egy var2, Predicate<? super T> var3);

   default <T extends bii> List<T> a(Class<T> $$0, egy $$1, Predicate<? super T> $$2) {
      return this.a(dix.a($$0), $$1, $$2);
   }

   List<? extends cbm> v();

   default List<bii> a_(@Nullable bii $$0, egy $$1) {
      return this.a($$0, $$1, bil.f);
   }

   default boolean a(@Nullable bii $$0, ehw $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (bii $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dF() && $$2.I && ($$0 == null || !$$2.y($$0)) && eht.c($$1, eht.a($$2.cG()), ehh.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends bii> List<T> a(Class<T> $$0, egy $$1) {
      return this.a($$0, $$1, bil.f);
   }

   default List<ehw> c(@Nullable bii $$0, egy $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<bii> $$2 = $$0 == null ? bil.g : bil.f.and($$0::h);
         List<bii> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<ehw> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (bii $$5 : $$3) {
               $$4.add(eht.a($$5.cG()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default cbm a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<bii> $$4) {
      double $$5 = -1.0;
      cbm $$6 = null;

      for (cbm $$7 : this.v()) {
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
   default cbm a(bii $$0, double $$1) {
      return this.a($$0.dp(), $$0.dr(), $$0.dv(), $$1, false);
   }

   @Nullable
   default cbm a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<bii> $$5 = $$4 ? bil.e : bil.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (cbm $$4 : this.v()) {
         if (bil.f.test($$4) && bil.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default cbm a(btk $$0, biy $$1) {
      return this.a(this.v(), $$0, $$1, $$1.dp(), $$1.dr(), $$1.dv());
   }

   @Nullable
   default cbm a(btk $$0, biy $$1, double $$2, double $$3, double $$4) {
      return this.a(this.v(), $$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   default cbm a(btk $$0, double $$1, double $$2, double $$3) {
      return this.a(this.v(), $$0, null, $$1, $$2, $$3);
   }

   @Nullable
   default <T extends biy> T a(Class<? extends T> $$0, btk $$1, @Nullable biy $$2, double $$3, double $$4, double $$5, egy $$6) {
      return this.a(this.a($$0, $$6, $$0x -> true), $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   default <T extends biy> T a(List<? extends T> $$0, btk $$1, @Nullable biy $$2, double $$3, double $$4, double $$5) {
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

   default List<cbm> a(btk $$0, biy $$1, egy $$2) {
      List<cbm> $$3 = Lists.newArrayList();

      for (cbm $$4 : this.v()) {
         if ($$2.e($$4.dp(), $$4.dr(), $$4.dv()) && $$0.a($$1, $$4)) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   default <T extends biy> List<T> a(Class<T> $$0, btk $$1, biy $$2, egy $$3) {
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
   default cbm b(UUID $$0) {
      for (int $$1 = 0; $$1 < this.v().size(); $$1++) {
         cbm $$2 = this.v().get($$1);
         if ($$0.equals($$2.cv())) {
            return $$2;
         }
      }

      return null;
   }
}
