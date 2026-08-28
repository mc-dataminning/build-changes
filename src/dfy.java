import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface dfy {
   List<buk> a(@Nullable buk var1, fau var2, Predicate<? super buk> var3);

   <T extends buk> List<T> a(ebg<buk, T> var1, fau var2, Predicate<? super T> var3);

   default <T extends buk> List<T> a(Class<T> $$0, fau $$1, Predicate<? super T> $$2) {
      return this.a(ebg.a($$0), $$1, $$2);
   }

   List<? extends cow> z();

   default List<buk> a_(@Nullable buk $$0, fau $$1) {
      return this.a($$0, $$1, bup.f);
   }

   default boolean a(@Nullable buk $$0, fbt $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (buk $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dQ() && $$2.I && ($$0 == null || !$$2.z($$0)) && fbq.c($$1, fbq.a($$2.cR()), fbd.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends buk> List<T> a(Class<T> $$0, fau $$1) {
      return this.a($$0, $$1, bup.f);
   }

   default List<fbt> c(@Nullable buk $$0, fau $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<buk> $$2 = $$0 == null ? bup.g : bup.f.and($$0::i);
         List<buk> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<fbt> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (buk $$5 : $$3) {
               $$4.add(fbq.a($$5.cR()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default cow a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<buk> $$4) {
      double $$5 = -1.0;
      cow $$6 = null;

      for (cow $$7 : this.z()) {
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
   default cow a(buk $$0, double $$1) {
      return this.a($$0.dA(), $$0.dC(), $$0.dG(), $$1, false);
   }

   @Nullable
   default cow a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<buk> $$5 = $$4 ? bup.e : bup.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (cow $$4 : this.z()) {
         if (bup.f.test($$4) && bup.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default cow b(UUID $$0) {
      for (int $$1 = 0; $$1 < this.z().size(); $$1++) {
         cow $$2 = this.z().get($$1);
         if ($$0.equals($$2.cG())) {
            return $$2;
         }
      }

      return null;
   }
}
