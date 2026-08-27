import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface czl {
   List<bql> a(@Nullable bql var1, eta var2, Predicate<? super bql> var3);

   <T extends bql> List<T> a(duf<bql, T> var1, eta var2, Predicate<? super T> var3);

   default <T extends bql> List<T> a(Class<T> $$0, eta $$1, Predicate<? super T> $$2) {
      return this.a(duf.a($$0), $$1, $$2);
   }

   List<? extends ckl> x();

   default List<bql> a_(@Nullable bql $$0, eta $$1) {
      return this.a($$0, $$1, bqq.f);
   }

   default boolean a(@Nullable bql $$0, ety $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (bql $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dI() && $$2.J && ($$0 == null || !$$2.y($$0)) && etv.c($$1, etv.a($$2.cI()), etj.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends bql> List<T> a(Class<T> $$0, eta $$1) {
      return this.a($$0, $$1, bqq.f);
   }

   default List<ety> c(@Nullable bql $$0, eta $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<bql> $$2 = $$0 == null ? bqq.g : bqq.f.and($$0::i);
         List<bql> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<ety> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (bql $$5 : $$3) {
               $$4.add(etv.a($$5.cI()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default ckl a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<bql> $$4) {
      double $$5 = -1.0;
      ckl $$6 = null;

      for (ckl $$7 : this.x()) {
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
   default ckl a(bql $$0, double $$1) {
      return this.a($$0.ds(), $$0.du(), $$0.dy(), $$1, false);
   }

   @Nullable
   default ckl a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<bql> $$5 = $$4 ? bqq.e : bqq.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (ckl $$4 : this.x()) {
         if (bqq.f.test($$4) && bqq.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default ckl a(cbu $$0, bre $$1) {
      return this.a(this.x(), $$0, $$1, $$1.ds(), $$1.du(), $$1.dy());
   }

   @Nullable
   default ckl a(cbu $$0, bre $$1, double $$2, double $$3, double $$4) {
      return this.a(this.x(), $$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   default ckl a(cbu $$0, double $$1, double $$2, double $$3) {
      return this.a(this.x(), $$0, null, $$1, $$2, $$3);
   }

   @Nullable
   default <T extends bre> T a(Class<? extends T> $$0, cbu $$1, @Nullable bre $$2, double $$3, double $$4, double $$5, eta $$6) {
      return this.a(this.a($$0, $$6, $$0x -> true), $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   default <T extends bre> T a(List<? extends T> $$0, cbu $$1, @Nullable bre $$2, double $$3, double $$4, double $$5) {
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

   default List<ckl> a(cbu $$0, bre $$1, eta $$2) {
      List<ckl> $$3 = Lists.newArrayList();

      for (ckl $$4 : this.x()) {
         if ($$2.e($$4.ds(), $$4.du(), $$4.dy()) && $$0.a($$1, $$4)) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   default <T extends bre> List<T> a(Class<T> $$0, cbu $$1, bre $$2, eta $$3) {
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
   default ckl b(UUID $$0) {
      for (int $$1 = 0; $$1 < this.x().size(); $$1++) {
         ckl $$2 = this.x().get($$1);
         if ($$0.equals($$2.cx())) {
            return $$2;
         }
      }

      return null;
   }
}
