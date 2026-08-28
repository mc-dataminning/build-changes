import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface dbq {
   List<bsv> a(@Nullable bsv var1, evn var2, Predicate<? super bsv> var3);

   <T extends bsv> List<T> a(dwk<bsv, T> var1, evn var2, Predicate<? super T> var3);

   default <T extends bsv> List<T> a(Class<T> $$0, evn $$1, Predicate<? super T> $$2) {
      return this.a(dwk.a($$0), $$1, $$2);
   }

   List<? extends cmy> x();

   default List<bsv> a_(@Nullable bsv $$0, evn $$1) {
      return this.a($$0, $$1, bta.f);
   }

   default boolean a(@Nullable bsv $$0, ewl $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (bsv $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dK() && $$2.J && ($$0 == null || !$$2.y($$0)) && ewi.c($$1, ewi.a($$2.cK()), evw.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends bsv> List<T> a(Class<T> $$0, evn $$1) {
      return this.a($$0, $$1, bta.f);
   }

   default List<ewl> c(@Nullable bsv $$0, evn $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<bsv> $$2 = $$0 == null ? bta.g : bta.f.and($$0::i);
         List<bsv> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<ewl> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (bsv $$5 : $$3) {
               $$4.add(ewi.a($$5.cK()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default cmy a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<bsv> $$4) {
      double $$5 = -1.0;
      cmy $$6 = null;

      for (cmy $$7 : this.x()) {
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
   default cmy a(bsv $$0, double $$1) {
      return this.a($$0.du(), $$0.dw(), $$0.dA(), $$1, false);
   }

   @Nullable
   default cmy a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<bsv> $$5 = $$4 ? bta.e : bta.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (cmy $$4 : this.x()) {
         if (bta.f.test($$4) && bta.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default cmy a(ceh $$0, btq $$1) {
      return this.a(this.x(), $$0, $$1, $$1.du(), $$1.dw(), $$1.dA());
   }

   @Nullable
   default cmy a(ceh $$0, btq $$1, double $$2, double $$3, double $$4) {
      return this.a(this.x(), $$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   default cmy a(ceh $$0, double $$1, double $$2, double $$3) {
      return this.a(this.x(), $$0, null, $$1, $$2, $$3);
   }

   @Nullable
   default <T extends btq> T a(Class<? extends T> $$0, ceh $$1, @Nullable btq $$2, double $$3, double $$4, double $$5, evn $$6) {
      return this.a(this.a($$0, $$6, $$0x -> true), $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   default <T extends btq> T a(List<? extends T> $$0, ceh $$1, @Nullable btq $$2, double $$3, double $$4, double $$5) {
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

   default List<cmy> a(ceh $$0, btq $$1, evn $$2) {
      List<cmy> $$3 = Lists.newArrayList();

      for (cmy $$4 : this.x()) {
         if ($$2.e($$4.du(), $$4.dw(), $$4.dA()) && $$0.a($$1, $$4)) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   default <T extends btq> List<T> a(Class<T> $$0, ceh $$1, btq $$2, evn $$3) {
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
   default cmy b(UUID $$0) {
      for (int $$1 = 0; $$1 < this.x().size(); $$1++) {
         cmy $$2 = this.x().get($$1);
         if ($$0.equals($$2.cz())) {
            return $$2;
         }
      }

      return null;
   }
}
