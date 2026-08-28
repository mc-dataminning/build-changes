import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface dbx {
   List<bsh> a(@Nullable bsh var1, ewc var2, Predicate<? super bsh> var3);

   <T extends bsh> List<T> a(dwv<bsh, T> var1, ewc var2, Predicate<? super T> var3);

   default <T extends bsh> List<T> a(Class<T> $$0, ewc $$1, Predicate<? super T> $$2) {
      return this.a(dwv.a($$0), $$1, $$2);
   }

   List<? extends cml> x();

   default List<bsh> a_(@Nullable bsh $$0, ewc $$1) {
      return this.a($$0, $$1, bsm.f);
   }

   default boolean a(@Nullable bsh $$0, exa $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (bsh $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dM() && $$2.J && ($$0 == null || !$$2.y($$0)) && ewx.c($$1, ewx.a($$2.cM()), ewl.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends bsh> List<T> a(Class<T> $$0, ewc $$1) {
      return this.a($$0, $$1, bsm.f);
   }

   default List<exa> c(@Nullable bsh $$0, ewc $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<bsh> $$2 = $$0 == null ? bsm.g : bsm.f.and($$0::i);
         List<bsh> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<exa> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (bsh $$5 : $$3) {
               $$4.add(ewx.a($$5.cM()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default cml a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<bsh> $$4) {
      double $$5 = -1.0;
      cml $$6 = null;

      for (cml $$7 : this.x()) {
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
   default cml a(bsh $$0, double $$1) {
      return this.a($$0.dw(), $$0.dy(), $$0.dC(), $$1, false);
   }

   @Nullable
   default cml a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<bsh> $$5 = $$4 ? bsm.e : bsm.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (cml $$4 : this.x()) {
         if (bsm.f.test($$4) && bsm.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default cml a(cdt $$0, btc $$1) {
      return this.a(this.x(), $$0, $$1, $$1.dw(), $$1.dy(), $$1.dC());
   }

   @Nullable
   default cml a(cdt $$0, btc $$1, double $$2, double $$3, double $$4) {
      return this.a(this.x(), $$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   default cml a(cdt $$0, double $$1, double $$2, double $$3) {
      return this.a(this.x(), $$0, null, $$1, $$2, $$3);
   }

   @Nullable
   default <T extends btc> T a(Class<? extends T> $$0, cdt $$1, @Nullable btc $$2, double $$3, double $$4, double $$5, ewc $$6) {
      return this.a(this.a($$0, $$6, $$0x -> true), $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   default <T extends btc> T a(List<? extends T> $$0, cdt $$1, @Nullable btc $$2, double $$3, double $$4, double $$5) {
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

   default List<cml> a(cdt $$0, btc $$1, ewc $$2) {
      List<cml> $$3 = Lists.newArrayList();

      for (cml $$4 : this.x()) {
         if ($$2.e($$4.dw(), $$4.dy(), $$4.dC()) && $$0.a($$1, $$4)) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   default <T extends btc> List<T> a(Class<T> $$0, cdt $$1, btc $$2, ewc $$3) {
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
   default cml b(UUID $$0) {
      for (int $$1 = 0; $$1 < this.x().size(); $$1++) {
         cml $$2 = this.x().get($$1);
         if ($$0.equals($$2.cB())) {
            return $$2;
         }
      }

      return null;
   }
}
