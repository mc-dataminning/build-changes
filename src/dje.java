import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface dje {
   List<bwi> a(@Nullable bwi var1, fex var2, Predicate<? super bwi> var3);

   <T extends bwi> List<T> a(eff<bwi, T> var1, fex var2, Predicate<? super T> var3);

   default <T extends bwi> List<T> a(Class<T> $$0, fex $$1, Predicate<? super T> $$2) {
      return this.a(eff.a($$0), $$1, $$2);
   }

   List<? extends crm> z();

   default List<bwi> a_(@Nullable bwi $$0, fex $$1) {
      return this.a($$0, $$1, bwp.f);
   }

   default boolean a(@Nullable bwi $$0, ffw $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (bwi $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dP() && $$2.I && ($$0 == null || !$$2.z($$0)) && fft.c($$1, fft.a($$2.cQ()), ffg.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends bwi> List<T> a(Class<T> $$0, fex $$1) {
      return this.a($$0, $$1, bwp.f);
   }

   default List<ffw> c(@Nullable bwi $$0, fex $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<bwi> $$2 = $$0 == null ? bwp.g : bwp.f.and($$0::i);
         List<bwi> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<ffw> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (bwi $$5 : $$3) {
               $$4.add(fft.a($$5.cQ()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default crm a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<bwi> $$4) {
      double $$5 = -1.0;
      crm $$6 = null;

      for (crm $$7 : this.z()) {
         if ($$4 == null || $$4.test($$7)) {
            double $$8 = $$7.h($$0, $$1, $$2);
            if (($$3 < 0.0 || $$8 < $$3 * $$3) && ($$5 == -1.0 || $$8 < $$5)) {
               $$5 = $$8;
               $$6 = $$7;
            }
         }
      }

      return $$6;
   }

   @Nullable
   default crm a(bwi $$0, double $$1) {
      return this.a($$0.dz(), $$0.dB(), $$0.dF(), $$1, false);
   }

   @Nullable
   default crm a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<bwi> $$5 = $$4 ? bwp.e : bwp.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (crm $$4 : this.z()) {
         if (bwp.f.test($$4) && bwp.b.test($$4)) {
            double $$5 = $$4.h($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default crm a(UUID $$0) {
      for (int $$1 = 0; $$1 < this.z().size(); $$1++) {
         crm $$2 = this.z().get($$1);
         if ($$0.equals($$2.cF())) {
            return $$2;
         }
      }

      return null;
   }
}
