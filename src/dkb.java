import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface dkb {
   List<bxe> a(@Nullable bxe var1, ffx var2, Predicate<? super bxe> var3);

   <T extends bxe> List<T> a(egc<bxe, T> var1, ffx var2, Predicate<? super T> var3);

   default <T extends bxe> List<T> a(Class<T> $$0, ffx $$1, Predicate<? super T> $$2) {
      return this.a(egc.a($$0), $$1, $$2);
   }

   List<? extends csi> z();

   default List<bxe> a_(@Nullable bxe $$0, ffx $$1) {
      return this.a($$0, $$1, bxl.f);
   }

   default boolean a(@Nullable bxe $$0, fgw $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (bxe $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dQ() && $$2.I && ($$0 == null || !$$2.z($$0)) && fgt.c($$1, fgt.a($$2.cR()), fgg.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends bxe> List<T> a(Class<T> $$0, ffx $$1) {
      return this.a($$0, $$1, bxl.f);
   }

   default List<fgw> c(@Nullable bxe $$0, ffx $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<bxe> $$2 = $$0 == null ? bxl.g : bxl.f.and($$0::i);
         List<bxe> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<fgw> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (bxe $$5 : $$3) {
               $$4.add(fgt.a($$5.cR()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default csi a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<bxe> $$4) {
      double $$5 = -1.0;
      csi $$6 = null;

      for (csi $$7 : this.z()) {
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
   default csi a(bxe $$0, double $$1) {
      return this.a($$0.dA(), $$0.dC(), $$0.dG(), $$1, false);
   }

   @Nullable
   default csi a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<bxe> $$5 = $$4 ? bxl.e : bxl.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (csi $$4 : this.z()) {
         if (bxl.f.test($$4) && bxl.b.test($$4)) {
            double $$5 = $$4.h($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default csi a(UUID $$0) {
      for (int $$1 = 0; $$1 < this.z().size(); $$1++) {
         csi $$2 = this.z().get($$1);
         if ($$0.equals($$2.cG())) {
            return $$2;
         }
      }

      return null;
   }
}
