import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface des {
   List<bue> a(@Nullable bue var1, ezi var2, Predicate<? super bue> var3);

   <T extends bue> List<T> a(dzu<bue, T> var1, ezi var2, Predicate<? super T> var3);

   default <T extends bue> List<T> a(Class<T> $$0, ezi $$1, Predicate<? super T> $$2) {
      return this.a(dzu.a($$0), $$1, $$2);
   }

   List<? extends com> x();

   default List<bue> a_(@Nullable bue $$0, ezi $$1) {
      return this.a($$0, $$1, buj.f);
   }

   default boolean a(@Nullable bue $$0, fah $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (bue $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dS() && $$2.J && ($$0 == null || !$$2.z($$0)) && fae.c($$1, fae.a($$2.cS()), ezr.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends bue> List<T> a(Class<T> $$0, ezi $$1) {
      return this.a($$0, $$1, buj.f);
   }

   default List<fah> c(@Nullable bue $$0, ezi $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<bue> $$2 = $$0 == null ? buj.g : buj.f.and($$0::i);
         List<bue> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<fah> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (bue $$5 : $$3) {
               $$4.add(fae.a($$5.cS()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default com a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<bue> $$4) {
      double $$5 = -1.0;
      com $$6 = null;

      for (com $$7 : this.x()) {
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
   default com a(bue $$0, double $$1) {
      return this.a($$0.dC(), $$0.dE(), $$0.dI(), $$1, false);
   }

   @Nullable
   default com a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<bue> $$5 = $$4 ? buj.e : buj.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (com $$4 : this.x()) {
         if (buj.f.test($$4) && buj.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default com a(cfr $$0, bva $$1) {
      return this.a(this.x(), $$0, $$1, $$1.dC(), $$1.dE(), $$1.dI());
   }

   @Nullable
   default com a(cfr $$0, bva $$1, double $$2, double $$3, double $$4) {
      return this.a(this.x(), $$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   default com a(cfr $$0, double $$1, double $$2, double $$3) {
      return this.a(this.x(), $$0, null, $$1, $$2, $$3);
   }

   @Nullable
   default <T extends bva> T a(Class<? extends T> $$0, cfr $$1, @Nullable bva $$2, double $$3, double $$4, double $$5, ezi $$6) {
      return this.a(this.a($$0, $$6, $$0x -> true), $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   default <T extends bva> T a(List<? extends T> $$0, cfr $$1, @Nullable bva $$2, double $$3, double $$4, double $$5) {
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

   default List<com> a(cfr $$0, bva $$1, ezi $$2) {
      List<com> $$3 = Lists.newArrayList();

      for (com $$4 : this.x()) {
         if ($$2.e($$4.dC(), $$4.dE(), $$4.dI()) && $$0.a($$1, $$4)) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   default <T extends bva> List<T> a(Class<T> $$0, cfr $$1, bva $$2, ezi $$3) {
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
   default com b(UUID $$0) {
      for (int $$1 = 0; $$1 < this.x().size(); $$1++) {
         com $$2 = this.x().get($$1);
         if ($$0.equals($$2.cH())) {
            return $$2;
         }
      }

      return null;
   }
}
