import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface dbk {
   List<bsp> a(@Nullable bsp var1, evh var2, Predicate<? super bsp> var3);

   <T extends bsp> List<T> a(dwe<bsp, T> var1, evh var2, Predicate<? super T> var3);

   default <T extends bsp> List<T> a(Class<T> $$0, evh $$1, Predicate<? super T> $$2) {
      return this.a(dwe.a($$0), $$1, $$2);
   }

   List<? extends cms> x();

   default List<bsp> a_(@Nullable bsp $$0, evh $$1) {
      return this.a($$0, $$1, bsu.f);
   }

   default boolean a(@Nullable bsp $$0, ewf $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (bsp $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dK() && $$2.J && ($$0 == null || !$$2.y($$0)) && ewc.c($$1, ewc.a($$2.cK()), evq.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends bsp> List<T> a(Class<T> $$0, evh $$1) {
      return this.a($$0, $$1, bsu.f);
   }

   default List<ewf> c(@Nullable bsp $$0, evh $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<bsp> $$2 = $$0 == null ? bsu.g : bsu.f.and($$0::i);
         List<bsp> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<ewf> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (bsp $$5 : $$3) {
               $$4.add(ewc.a($$5.cK()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default cms a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<bsp> $$4) {
      double $$5 = -1.0;
      cms $$6 = null;

      for (cms $$7 : this.x()) {
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
   default cms a(bsp $$0, double $$1) {
      return this.a($$0.du(), $$0.dw(), $$0.dA(), $$1, false);
   }

   @Nullable
   default cms a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<bsp> $$5 = $$4 ? bsu.e : bsu.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (cms $$4 : this.x()) {
         if (bsu.f.test($$4) && bsu.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default cms a(ceb $$0, btk $$1) {
      return this.a(this.x(), $$0, $$1, $$1.du(), $$1.dw(), $$1.dA());
   }

   @Nullable
   default cms a(ceb $$0, btk $$1, double $$2, double $$3, double $$4) {
      return this.a(this.x(), $$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   default cms a(ceb $$0, double $$1, double $$2, double $$3) {
      return this.a(this.x(), $$0, null, $$1, $$2, $$3);
   }

   @Nullable
   default <T extends btk> T a(Class<? extends T> $$0, ceb $$1, @Nullable btk $$2, double $$3, double $$4, double $$5, evh $$6) {
      return this.a(this.a($$0, $$6, $$0x -> true), $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   default <T extends btk> T a(List<? extends T> $$0, ceb $$1, @Nullable btk $$2, double $$3, double $$4, double $$5) {
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

   default List<cms> a(ceb $$0, btk $$1, evh $$2) {
      List<cms> $$3 = Lists.newArrayList();

      for (cms $$4 : this.x()) {
         if ($$2.e($$4.du(), $$4.dw(), $$4.dA()) && $$0.a($$1, $$4)) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   default <T extends btk> List<T> a(Class<T> $$0, ceb $$1, btk $$2, evh $$3) {
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
   default cms b(UUID $$0) {
      for (int $$1 = 0; $$1 < this.x().size(); $$1++) {
         cms $$2 = this.x().get($$1);
         if ($$0.equals($$2.cz())) {
            return $$2;
         }
      }

      return null;
   }
}
