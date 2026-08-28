import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface dbw {
   List<bsg> a(@Nullable bsg var1, ewa var2, Predicate<? super bsg> var3);

   <T extends bsg> List<T> a(dwu<bsg, T> var1, ewa var2, Predicate<? super T> var3);

   default <T extends bsg> List<T> a(Class<T> $$0, ewa $$1, Predicate<? super T> $$2) {
      return this.a(dwu.a($$0), $$1, $$2);
   }

   List<? extends cmk> x();

   default List<bsg> a_(@Nullable bsg $$0, ewa $$1) {
      return this.a($$0, $$1, bsl.f);
   }

   default boolean a(@Nullable bsg $$0, ewy $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (bsg $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dL() && $$2.J && ($$0 == null || !$$2.y($$0)) && ewv.c($$1, ewv.a($$2.cL()), ewj.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends bsg> List<T> a(Class<T> $$0, ewa $$1) {
      return this.a($$0, $$1, bsl.f);
   }

   default List<ewy> c(@Nullable bsg $$0, ewa $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<bsg> $$2 = $$0 == null ? bsl.g : bsl.f.and($$0::i);
         List<bsg> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<ewy> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (bsg $$5 : $$3) {
               $$4.add(ewv.a($$5.cL()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default cmk a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<bsg> $$4) {
      double $$5 = -1.0;
      cmk $$6 = null;

      for (cmk $$7 : this.x()) {
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
   default cmk a(bsg $$0, double $$1) {
      return this.a($$0.dv(), $$0.dx(), $$0.dB(), $$1, false);
   }

   @Nullable
   default cmk a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<bsg> $$5 = $$4 ? bsl.e : bsl.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (cmk $$4 : this.x()) {
         if (bsl.f.test($$4) && bsl.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default cmk a(cds $$0, btb $$1) {
      return this.a(this.x(), $$0, $$1, $$1.dv(), $$1.dx(), $$1.dB());
   }

   @Nullable
   default cmk a(cds $$0, btb $$1, double $$2, double $$3, double $$4) {
      return this.a(this.x(), $$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   default cmk a(cds $$0, double $$1, double $$2, double $$3) {
      return this.a(this.x(), $$0, null, $$1, $$2, $$3);
   }

   @Nullable
   default <T extends btb> T a(Class<? extends T> $$0, cds $$1, @Nullable btb $$2, double $$3, double $$4, double $$5, ewa $$6) {
      return this.a(this.a($$0, $$6, $$0x -> true), $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   default <T extends btb> T a(List<? extends T> $$0, cds $$1, @Nullable btb $$2, double $$3, double $$4, double $$5) {
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

   default List<cmk> a(cds $$0, btb $$1, ewa $$2) {
      List<cmk> $$3 = Lists.newArrayList();

      for (cmk $$4 : this.x()) {
         if ($$2.e($$4.dv(), $$4.dx(), $$4.dB()) && $$0.a($$1, $$4)) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   default <T extends btb> List<T> a(Class<T> $$0, cds $$1, btb $$2, ewa $$3) {
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
   default cmk b(UUID $$0) {
      for (int $$1 = 0; $$1 < this.x().size(); $$1++) {
         cmk $$2 = this.x().get($$1);
         if ($$0.equals($$2.cA())) {
            return $$2;
         }
      }

      return null;
   }
}
