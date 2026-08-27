import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface czu {
   List<brh> a(@Nullable brh var1, etk var2, Predicate<? super brh> var3);

   <T extends brh> List<T> a(duo<brh, T> var1, etk var2, Predicate<? super T> var3);

   default <T extends brh> List<T> a(Class<T> $$0, etk $$1, Predicate<? super T> $$2) {
      return this.a(duo.a($$0), $$1, $$2);
   }

   List<? extends clh> x();

   default List<brh> a_(@Nullable brh $$0, etk $$1) {
      return this.a($$0, $$1, brm.f);
   }

   default boolean a(@Nullable brh $$0, eui $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (brh $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dI() && $$2.J && ($$0 == null || !$$2.y($$0)) && euf.c($$1, euf.a($$2.cI()), ett.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends brh> List<T> a(Class<T> $$0, etk $$1) {
      return this.a($$0, $$1, brm.f);
   }

   default List<eui> c(@Nullable brh $$0, etk $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<brh> $$2 = $$0 == null ? brm.g : brm.f.and($$0::i);
         List<brh> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<eui> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (brh $$5 : $$3) {
               $$4.add(euf.a($$5.cI()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default clh a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<brh> $$4) {
      double $$5 = -1.0;
      clh $$6 = null;

      for (clh $$7 : this.x()) {
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
   default clh a(brh $$0, double $$1) {
      return this.a($$0.ds(), $$0.du(), $$0.dy(), $$1, false);
   }

   @Nullable
   default clh a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<brh> $$5 = $$4 ? brm.e : brm.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (clh $$4 : this.x()) {
         if (brm.f.test($$4) && brm.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default clh a(ccq $$0, bsa $$1) {
      return this.a(this.x(), $$0, $$1, $$1.ds(), $$1.du(), $$1.dy());
   }

   @Nullable
   default clh a(ccq $$0, bsa $$1, double $$2, double $$3, double $$4) {
      return this.a(this.x(), $$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   default clh a(ccq $$0, double $$1, double $$2, double $$3) {
      return this.a(this.x(), $$0, null, $$1, $$2, $$3);
   }

   @Nullable
   default <T extends bsa> T a(Class<? extends T> $$0, ccq $$1, @Nullable bsa $$2, double $$3, double $$4, double $$5, etk $$6) {
      return this.a(this.a($$0, $$6, $$0x -> true), $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   default <T extends bsa> T a(List<? extends T> $$0, ccq $$1, @Nullable bsa $$2, double $$3, double $$4, double $$5) {
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

   default List<clh> a(ccq $$0, bsa $$1, etk $$2) {
      List<clh> $$3 = Lists.newArrayList();

      for (clh $$4 : this.x()) {
         if ($$2.e($$4.ds(), $$4.du(), $$4.dy()) && $$0.a($$1, $$4)) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   default <T extends bsa> List<T> a(Class<T> $$0, ccq $$1, bsa $$2, etk $$3) {
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
   default clh b(UUID $$0) {
      for (int $$1 = 0; $$1 < this.x().size(); $$1++) {
         clh $$2 = this.x().get($$1);
         if ($$0.equals($$2.cx())) {
            return $$2;
         }
      }

      return null;
   }
}
