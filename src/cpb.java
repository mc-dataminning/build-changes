import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface cpb {
   List<big> a(@Nullable big var1, eha var2, Predicate<? super big> var3);

   <T extends big> List<T> a(diw<big, T> var1, eha var2, Predicate<? super T> var3);

   default <T extends big> List<T> a(Class<T> $$0, eha $$1, Predicate<? super T> $$2) {
      return this.a(diw.a($$0), $$1, $$2);
   }

   List<? extends cbl> v();

   default List<big> a_(@Nullable big $$0, eha $$1) {
      return this.a($$0, $$1, bij.f);
   }

   default boolean a(@Nullable big $$0, ehy $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (big $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dF() && $$2.I && ($$0 == null || !$$2.y($$0)) && ehv.c($$1, ehv.a($$2.cG()), ehj.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends big> List<T> a(Class<T> $$0, eha $$1) {
      return this.a($$0, $$1, bij.f);
   }

   default List<ehy> c(@Nullable big $$0, eha $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<big> $$2 = $$0 == null ? bij.g : bij.f.and($$0::h);
         List<big> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<ehy> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (big $$5 : $$3) {
               $$4.add(ehv.a($$5.cG()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default cbl a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<big> $$4) {
      double $$5 = -1.0;
      cbl $$6 = null;

      for (cbl $$7 : this.v()) {
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
   default cbl a(big $$0, double $$1) {
      return this.a($$0.dp(), $$0.dr(), $$0.dv(), $$1, false);
   }

   @Nullable
   default cbl a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<big> $$5 = $$4 ? bij.e : bij.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (cbl $$4 : this.v()) {
         if (bij.f.test($$4) && bij.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default cbl a(btj $$0, biw $$1) {
      return this.a(this.v(), $$0, $$1, $$1.dp(), $$1.dr(), $$1.dv());
   }

   @Nullable
   default cbl a(btj $$0, biw $$1, double $$2, double $$3, double $$4) {
      return this.a(this.v(), $$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   default cbl a(btj $$0, double $$1, double $$2, double $$3) {
      return this.a(this.v(), $$0, null, $$1, $$2, $$3);
   }

   @Nullable
   default <T extends biw> T a(Class<? extends T> $$0, btj $$1, @Nullable biw $$2, double $$3, double $$4, double $$5, eha $$6) {
      return this.a(this.a($$0, $$6, $$0x -> true), $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   default <T extends biw> T a(List<? extends T> $$0, btj $$1, @Nullable biw $$2, double $$3, double $$4, double $$5) {
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

   default List<cbl> a(btj $$0, biw $$1, eha $$2) {
      List<cbl> $$3 = Lists.newArrayList();

      for (cbl $$4 : this.v()) {
         if ($$2.e($$4.dp(), $$4.dr(), $$4.dv()) && $$0.a($$1, $$4)) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   default <T extends biw> List<T> a(Class<T> $$0, btj $$1, biw $$2, eha $$3) {
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
   default cbl b(UUID $$0) {
      for (int $$1 = 0; $$1 < this.v().size(); $$1++) {
         cbl $$2 = this.v().get($$1);
         if ($$0.equals($$2.cv())) {
            return $$2;
         }
      }

      return null;
   }
}
