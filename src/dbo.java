import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface dbo {
   List<bst> a(@Nullable bst var1, evl var2, Predicate<? super bst> var3);

   <T extends bst> List<T> a(dwi<bst, T> var1, evl var2, Predicate<? super T> var3);

   default <T extends bst> List<T> a(Class<T> $$0, evl $$1, Predicate<? super T> $$2) {
      return this.a(dwi.a($$0), $$1, $$2);
   }

   List<? extends cmw> x();

   default List<bst> a_(@Nullable bst $$0, evl $$1) {
      return this.a($$0, $$1, bsy.f);
   }

   default boolean a(@Nullable bst $$0, ewj $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (bst $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dK() && $$2.J && ($$0 == null || !$$2.y($$0)) && ewg.c($$1, ewg.a($$2.cK()), evu.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends bst> List<T> a(Class<T> $$0, evl $$1) {
      return this.a($$0, $$1, bsy.f);
   }

   default List<ewj> c(@Nullable bst $$0, evl $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<bst> $$2 = $$0 == null ? bsy.g : bsy.f.and($$0::i);
         List<bst> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<ewj> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (bst $$5 : $$3) {
               $$4.add(ewg.a($$5.cK()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default cmw a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<bst> $$4) {
      double $$5 = -1.0;
      cmw $$6 = null;

      for (cmw $$7 : this.x()) {
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
   default cmw a(bst $$0, double $$1) {
      return this.a($$0.du(), $$0.dw(), $$0.dA(), $$1, false);
   }

   @Nullable
   default cmw a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<bst> $$5 = $$4 ? bsy.e : bsy.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (cmw $$4 : this.x()) {
         if (bsy.f.test($$4) && bsy.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default cmw a(cef $$0, bto $$1) {
      return this.a(this.x(), $$0, $$1, $$1.du(), $$1.dw(), $$1.dA());
   }

   @Nullable
   default cmw a(cef $$0, bto $$1, double $$2, double $$3, double $$4) {
      return this.a(this.x(), $$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   default cmw a(cef $$0, double $$1, double $$2, double $$3) {
      return this.a(this.x(), $$0, null, $$1, $$2, $$3);
   }

   @Nullable
   default <T extends bto> T a(Class<? extends T> $$0, cef $$1, @Nullable bto $$2, double $$3, double $$4, double $$5, evl $$6) {
      return this.a(this.a($$0, $$6, $$0x -> true), $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   default <T extends bto> T a(List<? extends T> $$0, cef $$1, @Nullable bto $$2, double $$3, double $$4, double $$5) {
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

   default List<cmw> a(cef $$0, bto $$1, evl $$2) {
      List<cmw> $$3 = Lists.newArrayList();

      for (cmw $$4 : this.x()) {
         if ($$2.e($$4.du(), $$4.dw(), $$4.dA()) && $$0.a($$1, $$4)) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   default <T extends bto> List<T> a(Class<T> $$0, cef $$1, bto $$2, evl $$3) {
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
   default cmw b(UUID $$0) {
      for (int $$1 = 0; $$1 < this.x().size(); $$1++) {
         cmw $$2 = this.x().get($$1);
         if ($$0.equals($$2.cz())) {
            return $$2;
         }
      }

      return null;
   }
}
