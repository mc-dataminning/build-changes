import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface dgq {
   List<bvb> a(@Nullable bvb var1, fbm var2, Predicate<? super bvb> var3);

   <T extends bvb> List<T> a(eby<bvb, T> var1, fbm var2, Predicate<? super T> var3);

   default <T extends bvb> List<T> a(Class<T> $$0, fbm $$1, Predicate<? super T> $$2) {
      return this.a(eby.a($$0), $$1, $$2);
   }

   List<? extends cpo> z();

   default List<bvb> a_(@Nullable bvb $$0, fbm $$1) {
      return this.a($$0, $$1, bvg.f);
   }

   default boolean a(@Nullable bvb $$0, fcl $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (bvb $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dR() && $$2.I && ($$0 == null || !$$2.z($$0)) && fci.c($$1, fci.a($$2.cR()), fbv.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends bvb> List<T> a(Class<T> $$0, fbm $$1) {
      return this.a($$0, $$1, bvg.f);
   }

   default List<fcl> c(@Nullable bvb $$0, fbm $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<bvb> $$2 = $$0 == null ? bvg.g : bvg.f.and($$0::i);
         List<bvb> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<fcl> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (bvb $$5 : $$3) {
               $$4.add(fci.a($$5.cR()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default cpo a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<bvb> $$4) {
      double $$5 = -1.0;
      cpo $$6 = null;

      for (cpo $$7 : this.z()) {
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
   default cpo a(bvb $$0, double $$1) {
      return this.a($$0.dB(), $$0.dD(), $$0.dH(), $$1, false);
   }

   @Nullable
   default cpo a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<bvb> $$5 = $$4 ? bvg.e : bvg.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (cpo $$4 : this.z()) {
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
   default cpo b(UUID $$0) {
      for (int $$1 = 0; $$1 < this.z().size(); $$1++) {
         cpo $$2 = this.z().get($$1);
         if ($$0.equals($$2.cG())) {
            return $$2;
         }
      }

      return null;
   }
}
