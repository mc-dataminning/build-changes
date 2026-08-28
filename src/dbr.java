import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface dbr {
   List<bsw> a(@Nullable bsw var1, evo var2, Predicate<? super bsw> var3);

   <T extends bsw> List<T> a(dwl<bsw, T> var1, evo var2, Predicate<? super T> var3);

   default <T extends bsw> List<T> a(Class<T> $$0, evo $$1, Predicate<? super T> $$2) {
      return this.a(dwl.a($$0), $$1, $$2);
   }

   List<? extends cmz> x();

   default List<bsw> a_(@Nullable bsw $$0, evo $$1) {
      return this.a($$0, $$1, btb.f);
   }

   default boolean a(@Nullable bsw $$0, ewm $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (bsw $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dK() && $$2.J && ($$0 == null || !$$2.y($$0)) && ewj.c($$1, ewj.a($$2.cK()), evx.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends bsw> List<T> a(Class<T> $$0, evo $$1) {
      return this.a($$0, $$1, btb.f);
   }

   default List<ewm> c(@Nullable bsw $$0, evo $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<bsw> $$2 = $$0 == null ? btb.g : btb.f.and($$0::i);
         List<bsw> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<ewm> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (bsw $$5 : $$3) {
               $$4.add(ewj.a($$5.cK()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default cmz a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<bsw> $$4) {
      double $$5 = -1.0;
      cmz $$6 = null;

      for (cmz $$7 : this.x()) {
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
   default cmz a(bsw $$0, double $$1) {
      return this.a($$0.du(), $$0.dw(), $$0.dA(), $$1, false);
   }

   @Nullable
   default cmz a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<bsw> $$5 = $$4 ? btb.e : btb.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (cmz $$4 : this.x()) {
         if (btb.f.test($$4) && btb.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default cmz a(cei $$0, btr $$1) {
      return this.a(this.x(), $$0, $$1, $$1.du(), $$1.dw(), $$1.dA());
   }

   @Nullable
   default cmz a(cei $$0, btr $$1, double $$2, double $$3, double $$4) {
      return this.a(this.x(), $$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   default cmz a(cei $$0, double $$1, double $$2, double $$3) {
      return this.a(this.x(), $$0, null, $$1, $$2, $$3);
   }

   @Nullable
   default <T extends btr> T a(Class<? extends T> $$0, cei $$1, @Nullable btr $$2, double $$3, double $$4, double $$5, evo $$6) {
      return this.a(this.a($$0, $$6, $$0x -> true), $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   default <T extends btr> T a(List<? extends T> $$0, cei $$1, @Nullable btr $$2, double $$3, double $$4, double $$5) {
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

   default List<cmz> a(cei $$0, btr $$1, evo $$2) {
      List<cmz> $$3 = Lists.newArrayList();

      for (cmz $$4 : this.x()) {
         if ($$2.e($$4.du(), $$4.dw(), $$4.dA()) && $$0.a($$1, $$4)) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   default <T extends btr> List<T> a(Class<T> $$0, cei $$1, btr $$2, evo $$3) {
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
   default cmz b(UUID $$0) {
      for (int $$1 = 0; $$1 < this.x().size(); $$1++) {
         cmz $$2 = this.x().get($$1);
         if ($$0.equals($$2.cz())) {
            return $$2;
         }
      }

      return null;
   }
}
