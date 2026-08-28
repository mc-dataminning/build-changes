import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface djr {
   List<bwv> a(@Nullable bwv var1, ffn var2, Predicate<? super bwv> var3);

   <T extends bwv> List<T> a(efs<bwv, T> var1, ffn var2, Predicate<? super T> var3);

   default <T extends bwv> List<T> a(Class<T> $$0, ffn $$1, Predicate<? super T> $$2) {
      return this.a(efs.a($$0), $$1, $$2);
   }

   List<? extends crz> z();

   default List<bwv> a_(@Nullable bwv $$0, ffn $$1) {
      return this.a($$0, $$1, bxc.f);
   }

   default boolean a(@Nullable bwv $$0, fgm $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (bwv $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dQ() && $$2.I && ($$0 == null || !$$2.z($$0)) && fgj.c($$1, fgj.a($$2.cR()), ffw.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends bwv> List<T> a(Class<T> $$0, ffn $$1) {
      return this.a($$0, $$1, bxc.f);
   }

   default List<fgm> c(@Nullable bwv $$0, ffn $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<bwv> $$2 = $$0 == null ? bxc.g : bxc.f.and($$0::i);
         List<bwv> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<fgm> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (bwv $$5 : $$3) {
               $$4.add(fgj.a($$5.cR()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default crz a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<bwv> $$4) {
      double $$5 = -1.0;
      crz $$6 = null;

      for (crz $$7 : this.z()) {
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
   default crz a(bwv $$0, double $$1) {
      return this.a($$0.dA(), $$0.dC(), $$0.dG(), $$1, false);
   }

   @Nullable
   default crz a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<bwv> $$5 = $$4 ? bxc.e : bxc.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (crz $$4 : this.z()) {
         if (bxc.f.test($$4) && bxc.b.test($$4)) {
            double $$5 = $$4.h($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default crz a(UUID $$0) {
      for (int $$1 = 0; $$1 < this.z().size(); $$1++) {
         crz $$2 = this.z().get($$1);
         if ($$0.equals($$2.cG())) {
            return $$2;
         }
      }

      return null;
   }
}
