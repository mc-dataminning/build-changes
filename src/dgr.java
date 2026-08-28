import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface dgr {
   List<bva> a(@Nullable bva var1, fbs var2, Predicate<? super bva> var3);

   <T extends bva> List<T> a(ecb<bva, T> var1, fbs var2, Predicate<? super T> var3);

   default <T extends bva> List<T> a(Class<T> $$0, fbs $$1, Predicate<? super T> $$2) {
      return this.a(ecb.a($$0), $$1, $$2);
   }

   List<? extends cpr> z();

   default List<bva> a_(@Nullable bva $$0, fbs $$1) {
      return this.a($$0, $$1, bvg.f);
   }

   default boolean a(@Nullable bva $$0, fcr $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (bva $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dP() && $$2.I && ($$0 == null || !$$2.z($$0)) && fco.c($$1, fco.a($$2.cQ()), fcb.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends bva> List<T> a(Class<T> $$0, fbs $$1) {
      return this.a($$0, $$1, bvg.f);
   }

   default List<fcr> c(@Nullable bva $$0, fbs $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<bva> $$2 = $$0 == null ? bvg.g : bvg.f.and($$0::i);
         List<bva> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<fcr> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (bva $$5 : $$3) {
               $$4.add(fco.a($$5.cQ()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default cpr a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<bva> $$4) {
      double $$5 = -1.0;
      cpr $$6 = null;

      for (cpr $$7 : this.z()) {
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
   default cpr a(bva $$0, double $$1) {
      return this.a($$0.dz(), $$0.dB(), $$0.dF(), $$1, false);
   }

   @Nullable
   default cpr a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<bva> $$5 = $$4 ? bvg.e : bvg.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (cpr $$4 : this.z()) {
         if (bvg.f.test($$4) && bvg.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default cpr a(UUID $$0) {
      for (int $$1 = 0; $$1 < this.z().size(); $$1++) {
         cpr $$2 = this.z().get($$1);
         if ($$0.equals($$2.cF())) {
            return $$2;
         }
      }

      return null;
   }
}
