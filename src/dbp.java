import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface dbp {
   List<bsu> a(@Nullable bsu var1, evm var2, Predicate<? super bsu> var3);

   <T extends bsu> List<T> a(dwj<bsu, T> var1, evm var2, Predicate<? super T> var3);

   default <T extends bsu> List<T> a(Class<T> $$0, evm $$1, Predicate<? super T> $$2) {
      return this.a(dwj.a($$0), $$1, $$2);
   }

   List<? extends cmx> x();

   default List<bsu> a_(@Nullable bsu $$0, evm $$1) {
      return this.a($$0, $$1, bsz.f);
   }

   default boolean a(@Nullable bsu $$0, ewk $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (bsu $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dK() && $$2.J && ($$0 == null || !$$2.y($$0)) && ewh.c($$1, ewh.a($$2.cK()), evv.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends bsu> List<T> a(Class<T> $$0, evm $$1) {
      return this.a($$0, $$1, bsz.f);
   }

   default List<ewk> c(@Nullable bsu $$0, evm $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<bsu> $$2 = $$0 == null ? bsz.g : bsz.f.and($$0::i);
         List<bsu> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<ewk> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (bsu $$5 : $$3) {
               $$4.add(ewh.a($$5.cK()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default cmx a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<bsu> $$4) {
      double $$5 = -1.0;
      cmx $$6 = null;

      for (cmx $$7 : this.x()) {
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
   default cmx a(bsu $$0, double $$1) {
      return this.a($$0.du(), $$0.dw(), $$0.dA(), $$1, false);
   }

   @Nullable
   default cmx a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<bsu> $$5 = $$4 ? bsz.e : bsz.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (cmx $$4 : this.x()) {
         if (bsz.f.test($$4) && bsz.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default cmx a(ceg $$0, btp $$1) {
      return this.a(this.x(), $$0, $$1, $$1.du(), $$1.dw(), $$1.dA());
   }

   @Nullable
   default cmx a(ceg $$0, btp $$1, double $$2, double $$3, double $$4) {
      return this.a(this.x(), $$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   default cmx a(ceg $$0, double $$1, double $$2, double $$3) {
      return this.a(this.x(), $$0, null, $$1, $$2, $$3);
   }

   @Nullable
   default <T extends btp> T a(Class<? extends T> $$0, ceg $$1, @Nullable btp $$2, double $$3, double $$4, double $$5, evm $$6) {
      return this.a(this.a($$0, $$6, $$0x -> true), $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   default <T extends btp> T a(List<? extends T> $$0, ceg $$1, @Nullable btp $$2, double $$3, double $$4, double $$5) {
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

   default List<cmx> a(ceg $$0, btp $$1, evm $$2) {
      List<cmx> $$3 = Lists.newArrayList();

      for (cmx $$4 : this.x()) {
         if ($$2.e($$4.du(), $$4.dw(), $$4.dA()) && $$0.a($$1, $$4)) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   default <T extends btp> List<T> a(Class<T> $$0, ceg $$1, btp $$2, evm $$3) {
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
   default cmx b(UUID $$0) {
      for (int $$1 = 0; $$1 < this.x().size(); $$1++) {
         cmx $$2 = this.x().get($$1);
         if ($$0.equals($$2.cz())) {
            return $$2;
         }
      }

      return null;
   }
}
