import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface daq {
   List<brw> a(@Nullable brw var1, euh var2, Predicate<? super brw> var3);

   <T extends brw> List<T> a(dvk<brw, T> var1, euh var2, Predicate<? super T> var3);

   default <T extends brw> List<T> a(Class<T> $$0, euh $$1, Predicate<? super T> $$2) {
      return this.a(dvk.a($$0), $$1, $$2);
   }

   List<? extends cly> x();

   default List<brw> a_(@Nullable brw $$0, euh $$1) {
      return this.a($$0, $$1, bsb.f);
   }

   default boolean a(@Nullable brw $$0, evf $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (brw $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dK() && $$2.J && ($$0 == null || !$$2.y($$0)) && evc.c($$1, evc.a($$2.cK()), euq.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends brw> List<T> a(Class<T> $$0, euh $$1) {
      return this.a($$0, $$1, bsb.f);
   }

   default List<evf> c(@Nullable brw $$0, euh $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<brw> $$2 = $$0 == null ? bsb.g : bsb.f.and($$0::i);
         List<brw> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<evf> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (brw $$5 : $$3) {
               $$4.add(evc.a($$5.cK()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default cly a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<brw> $$4) {
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
   default cly a(brw $$0, double $$1) {
      return this.a($$0.du(), $$0.dw(), $$0.dA(), $$1, false);
   }

   @Nullable
   default cly a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<brw> $$5 = $$4 ? bsb.e : bsb.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (cly $$4 : this.x()) {
         if (bsb.f.test($$4) && bsb.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default cly a(cdh $$0, bsq $$1) {
      return this.a(this.x(), $$0, $$1, $$1.du(), $$1.dw(), $$1.dA());
   }

   @Nullable
   default cly a(cdh $$0, bsq $$1, double $$2, double $$3, double $$4) {
      return this.a(this.x(), $$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   default cly a(cdh $$0, double $$1, double $$2, double $$3) {
      return this.a(this.x(), $$0, null, $$1, $$2, $$3);
   }

   @Nullable
   default <T extends bsq> T a(Class<? extends T> $$0, cdh $$1, @Nullable bsq $$2, double $$3, double $$4, double $$5, euh $$6) {
      return this.a(this.a($$0, $$6, $$0x -> true), $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   default <T extends bsq> T a(List<? extends T> $$0, cdh $$1, @Nullable bsq $$2, double $$3, double $$4, double $$5) {
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

   default List<cly> a(cdh $$0, bsq $$1, euh $$2) {
      List<cly> $$3 = Lists.newArrayList();

      for (cly $$4 : this.x()) {
         if ($$2.e($$4.du(), $$4.dw(), $$4.dA()) && $$0.a($$1, $$4)) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   default <T extends bsq> List<T> a(Class<T> $$0, cdh $$1, bsq $$2, euh $$3) {
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
   default cly b(UUID $$0) {
      for (int $$1 = 0; $$1 < this.x().size(); $$1++) {
         cly $$2 = this.x().get($$1);
         if ($$0.equals($$2.cz())) {
            return $$2;
         }
      }

      return null;
   }
}
