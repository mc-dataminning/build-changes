import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface dgz {
   List<bvk> a(@Nullable bvk var1, fbt var2, Predicate<? super bvk> var3);

   <T extends bvk> List<T> a(ecf<bvk, T> var1, fbt var2, Predicate<? super T> var3);

   default <T extends bvk> List<T> a(Class<T> $$0, fbt $$1, Predicate<? super T> $$2) {
      return this.a(ecf.a($$0), $$1, $$2);
   }

   List<? extends cpx> y();

   default List<bvk> a_(@Nullable bvk $$0, fbt $$1) {
      return this.a($$0, $$1, bvp.f);
   }

   default boolean a(@Nullable bvk $$0, fcs $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (bvk $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dR() && $$2.I && ($$0 == null || !$$2.z($$0)) && fcp.c($$1, fcp.a($$2.cR()), fcc.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends bvk> List<T> a(Class<T> $$0, fbt $$1) {
      return this.a($$0, $$1, bvp.f);
   }

   default List<fcs> c(@Nullable bvk $$0, fbt $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<bvk> $$2 = $$0 == null ? bvp.g : bvp.f.and($$0::i);
         List<bvk> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<fcs> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (bvk $$5 : $$3) {
               $$4.add(fcp.a($$5.cR()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default cpx a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<bvk> $$4) {
      double $$5 = -1.0;
      cpx $$6 = null;

      for (cpx $$7 : this.y()) {
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
   default cpx a(bvk $$0, double $$1) {
      return this.a($$0.dB(), $$0.dD(), $$0.dH(), $$1, false);
   }

   @Nullable
   default cpx a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<bvk> $$5 = $$4 ? bvp.e : bvp.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (cpx $$4 : this.y()) {
         if (bvp.f.test($$4) && bvp.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default cpx b(UUID $$0) {
      for (int $$1 = 0; $$1 < this.y().size(); $$1++) {
         cpx $$2 = this.y().get($$1);
         if ($$0.equals($$2.cG())) {
            return $$2;
         }
      }

      return null;
   }
}
