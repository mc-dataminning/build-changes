import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface dbr {
   List<brv> a(@Nullable brv var1, ewp var2, Predicate<? super brv> var3);

   <T extends brv> List<T> a(dxj<brv, T> var1, ewp var2, Predicate<? super T> var3);

   default <T extends brv> List<T> a(Class<T> $$0, ewp $$1, Predicate<? super T> $$2) {
      return this.a(dxj.a($$0), $$1, $$2);
   }

   List<? extends cly> x();

   default List<brv> a_(@Nullable brv $$0, ewp $$1) {
      return this.a($$0, $$1, bsa.f);
   }

   default boolean a(@Nullable brv $$0, exn $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (brv $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dP() && $$2.K && ($$0 == null || !$$2.y($$0)) && exk.c($$1, exk.a($$2.cP()), ewy.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends brv> List<T> a(Class<T> $$0, ewp $$1) {
      return this.a($$0, $$1, bsa.f);
   }

   default List<exn> a(@Nullable brv $$0, ewp $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<brv> $$2 = $$0 == null ? bsa.g : bsa.f.and($$0::i);
         List<brv> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<exn> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (brv $$5 : $$3) {
               $$4.add(exk.a($$5.cP()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default cly a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<brv> $$4) {
      double $$5 = -1.0;
      cly $$6 = null;

      for (cly $$7 : this.x()) {
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
   default cly a(brv $$0, double $$1) {
      return this.a($$0.dz(), $$0.dB(), $$0.dF(), $$1, false);
   }

   @Nullable
   default cly a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<brv> $$5 = $$4 ? bsa.e : bsa.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   @Nullable
   default cly a(ir $$0, double $$1, boolean $$2) {
      ewu $$3 = $$0.b();
      return this.a($$3.a(), $$3.b(), $$3.c(), $$1, $$2);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (cly $$4 : this.x()) {
         if (bsa.f.test($$4) && bsa.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default cly a(cde $$0, bso $$1) {
      return this.a(this.x(), $$0, $$1, $$1.dz(), $$1.dB(), $$1.dF());
   }

   @Nullable
   default cly a(cde $$0, bso $$1, double $$2, double $$3, double $$4) {
      return this.a(this.x(), $$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   default cly a(cde $$0, double $$1, double $$2, double $$3) {
      return this.a(this.x(), $$0, null, $$1, $$2, $$3);
   }

   @Nullable
   default <T extends bso> T a(Class<? extends T> $$0, cde $$1, @Nullable bso $$2, double $$3, double $$4, double $$5, ewp $$6) {
      return this.a(this.a($$0, $$6, $$0x -> true), $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   default <T extends bso> T a(List<? extends T> $$0, cde $$1, @Nullable bso $$2, double $$3, double $$4, double $$5) {
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

   default List<cly> a(cde $$0, bso $$1, ewp $$2) {
      List<cly> $$3 = Lists.newArrayList();

      for (cly $$4 : this.x()) {
         if ($$2.e($$4.dz(), $$4.dB(), $$4.dF()) && $$0.a($$1, $$4)) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   default <T extends bso> List<T> a(Class<T> $$0, cde $$1, bso $$2, ewp $$3) {
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
   default cly c(UUID $$0) {
      for (int $$1 = 0; $$1 < this.x().size(); $$1++) {
         cly $$2 = this.x().get($$1);
         if ($$0.equals($$2.cE())) {
            return $$2;
         }
      }

      return null;
   }
}
