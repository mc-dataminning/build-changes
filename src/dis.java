import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface dis {
   List<bwf> a(@Nullable bwf var1, fel var2, Predicate<? super bwf> var3);

   <T extends bwf> List<T> a(eet<bwf, T> var1, fel var2, Predicate<? super T> var3);

   default <T extends bwf> List<T> a(Class<T> $$0, fel $$1, Predicate<? super T> $$2) {
      return this.a(eet.a($$0), $$1, $$2);
   }

   List<? extends crc> z();

   default List<bwf> a_(@Nullable bwf $$0, fel $$1) {
      return this.a($$0, $$1, bwm.f);
   }

   default boolean a(@Nullable bwf $$0, ffk $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (bwf $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dQ() && $$2.I && ($$0 == null || !$$2.z($$0)) && ffh.c($$1, ffh.a($$2.cR()), feu.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends bwf> List<T> a(Class<T> $$0, fel $$1) {
      return this.a($$0, $$1, bwm.f);
   }

   default List<ffk> c(@Nullable bwf $$0, fel $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<bwf> $$2 = $$0 == null ? bwm.g : bwm.f.and($$0::i);
         List<bwf> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<ffk> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (bwf $$5 : $$3) {
               $$4.add(ffh.a($$5.cR()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default crc a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<bwf> $$4) {
      double $$5 = -1.0;
      crc $$6 = null;

      for (crc $$7 : this.z()) {
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
   default crc a(bwf $$0, double $$1) {
      return this.a($$0.dA(), $$0.dC(), $$0.dG(), $$1, false);
   }

   @Nullable
   default crc a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<bwf> $$5 = $$4 ? bwm.e : bwm.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (crc $$4 : this.z()) {
         if (bwm.f.test($$4) && bwm.b.test($$4)) {
            double $$5 = $$4.h($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default crc a(UUID $$0) {
      for (int $$1 = 0; $$1 < this.z().size(); $$1++) {
         crc $$2 = this.z().get($$1);
         if ($$0.equals($$2.cG())) {
            return $$2;
         }
      }

      return null;
   }
}
