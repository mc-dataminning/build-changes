import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface dcl {
   List<bsq> a(@Nullable bsq var1, ewr var2, Predicate<? super bsq> var3);

   <T extends bsq> List<T> a(dxk<bsq, T> var1, ewr var2, Predicate<? super T> var3);

   default <T extends bsq> List<T> a(Class<T> $$0, ewr $$1, Predicate<? super T> $$2) {
      return this.a(dxk.a($$0), $$1, $$2);
   }

   List<? extends cmv> x();

   default List<bsq> a_(@Nullable bsq $$0, ewr $$1) {
      return this.a($$0, $$1, bsv.f);
   }

   default boolean a(@Nullable bsq $$0, exp $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (bsq $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dL() && $$2.J && ($$0 == null || !$$2.y($$0)) && exm.c($$1, exm.a($$2.cL()), exa.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends bsq> List<T> a(Class<T> $$0, ewr $$1) {
      return this.a($$0, $$1, bsv.f);
   }

   default List<exp> c(@Nullable bsq $$0, ewr $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<bsq> $$2 = $$0 == null ? bsv.g : bsv.f.and($$0::i);
         List<bsq> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<exp> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (bsq $$5 : $$3) {
               $$4.add(exm.a($$5.cL()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default cmv a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<bsq> $$4) {
      double $$5 = -1.0;
      cmv $$6 = null;

      for (cmv $$7 : this.x()) {
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
   default cmv a(bsq $$0, double $$1) {
      return this.a($$0.dv(), $$0.dx(), $$0.dB(), $$1, false);
   }

   @Nullable
   default cmv a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<bsq> $$5 = $$4 ? bsv.e : bsv.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (cmv $$4 : this.x()) {
         if (bsv.f.test($$4) && bsv.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default cmv a(ced $$0, btl $$1) {
      return this.a(this.x(), $$0, $$1, $$1.dv(), $$1.dx(), $$1.dB());
   }

   @Nullable
   default cmv a(ced $$0, btl $$1, double $$2, double $$3, double $$4) {
      return this.a(this.x(), $$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   default cmv a(ced $$0, double $$1, double $$2, double $$3) {
      return this.a(this.x(), $$0, null, $$1, $$2, $$3);
   }

   @Nullable
   default <T extends btl> T a(Class<? extends T> $$0, ced $$1, @Nullable btl $$2, double $$3, double $$4, double $$5, ewr $$6) {
      return this.a(this.a($$0, $$6, $$0x -> true), $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   default <T extends btl> T a(List<? extends T> $$0, ced $$1, @Nullable btl $$2, double $$3, double $$4, double $$5) {
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

   default List<cmv> a(ced $$0, btl $$1, ewr $$2) {
      List<cmv> $$3 = Lists.newArrayList();

      for (cmv $$4 : this.x()) {
         if ($$2.e($$4.dv(), $$4.dx(), $$4.dB()) && $$0.a($$1, $$4)) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   default <T extends btl> List<T> a(Class<T> $$0, ced $$1, btl $$2, ewr $$3) {
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
   default cmv b(UUID $$0) {
      for (int $$1 = 0; $$1 < this.x().size(); $$1++) {
         cmv $$2 = this.x().get($$1);
         if ($$0.equals($$2.cA())) {
            return $$2;
         }
      }

      return null;
   }
}
