import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface cvi {
   List<bnq> a(@Nullable bnq var1, enu var2, Predicate<? super bnq> var3);

   <T extends bnq> List<T> a(dpk<bnq, T> var1, enu var2, Predicate<? super T> var3);

   default <T extends bnq> List<T> a(Class<T> $$0, enu $$1, Predicate<? super T> $$2) {
      return this.a(dpk.a($$0), $$1, $$2);
   }

   List<? extends chl> x();

   default List<bnq> a_(@Nullable bnq $$0, enu $$1) {
      return this.a($$0, $$1, bnv.f);
   }

   default boolean a(@Nullable bnq $$0, eos $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (bnq $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dH() && $$2.H && ($$0 == null || !$$2.x($$0)) && eop.c($$1, eop.a($$2.cH()), eod.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends bnq> List<T> a(Class<T> $$0, enu $$1) {
      return this.a($$0, $$1, bnv.f);
   }

   default List<eos> c(@Nullable bnq $$0, enu $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<bnq> $$2 = $$0 == null ? bnv.g : bnv.f.and($$0::h);
         List<bnq> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<eos> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (bnq $$5 : $$3) {
               $$4.add(eop.a($$5.cH()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default chl a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<bnq> $$4) {
      double $$5 = -1.0;
      chl $$6 = null;

      for (chl $$7 : this.x()) {
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
   default chl a(bnq $$0, double $$1) {
      return this.a($$0.dr(), $$0.dt(), $$0.dx(), $$1, false);
   }

   @Nullable
   default chl a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<bnq> $$5 = $$4 ? bnv.e : bnv.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (chl $$4 : this.x()) {
         if (bnv.f.test($$4) && bnv.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default chl a(byy $$0, boi $$1) {
      return this.a(this.x(), $$0, $$1, $$1.dr(), $$1.dt(), $$1.dx());
   }

   @Nullable
   default chl a(byy $$0, boi $$1, double $$2, double $$3, double $$4) {
      return this.a(this.x(), $$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   default chl a(byy $$0, double $$1, double $$2, double $$3) {
      return this.a(this.x(), $$0, null, $$1, $$2, $$3);
   }

   @Nullable
   default <T extends boi> T a(Class<? extends T> $$0, byy $$1, @Nullable boi $$2, double $$3, double $$4, double $$5, enu $$6) {
      return this.a(this.a($$0, $$6, $$0x -> true), $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   default <T extends boi> T a(List<? extends T> $$0, byy $$1, @Nullable boi $$2, double $$3, double $$4, double $$5) {
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

   default List<chl> a(byy $$0, boi $$1, enu $$2) {
      List<chl> $$3 = Lists.newArrayList();

      for (chl $$4 : this.x()) {
         if ($$2.e($$4.dr(), $$4.dt(), $$4.dx()) && $$0.a($$1, $$4)) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   default <T extends boi> List<T> a(Class<T> $$0, byy $$1, boi $$2, enu $$3) {
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
   default chl b(UUID $$0) {
      for (int $$1 = 0; $$1 < this.x().size(); $$1++) {
         chl $$2 = this.x().get($$1);
         if ($$0.equals($$2.cw())) {
            return $$2;
         }
      }

      return null;
   }
}
