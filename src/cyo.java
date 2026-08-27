import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface cyo {
   List<bpv> a(@Nullable bpv var1, erv var2, Predicate<? super bpv> var3);

   <T extends bpv> List<T> a(dtg<bpv, T> var1, erv var2, Predicate<? super T> var3);

   default <T extends bpv> List<T> a(Class<T> $$0, erv $$1, Predicate<? super T> $$2) {
      return this.a(dtg.a($$0), $$1, $$2);
   }

   List<? extends cjt> x();

   default List<bpv> a_(@Nullable bpv $$0, erv $$1) {
      return this.a($$0, $$1, bqa.f);
   }

   default boolean a(@Nullable bpv $$0, est $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (bpv $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dH() && $$2.I && ($$0 == null || !$$2.y($$0)) && esq.c($$1, esq.a($$2.cH()), ese.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends bpv> List<T> a(Class<T> $$0, erv $$1) {
      return this.a($$0, $$1, bqa.f);
   }

   default List<est> c(@Nullable bpv $$0, erv $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<bpv> $$2 = $$0 == null ? bqa.g : bqa.f.and($$0::i);
         List<bpv> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<est> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (bpv $$5 : $$3) {
               $$4.add(esq.a($$5.cH()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default cjt a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<bpv> $$4) {
      double $$5 = -1.0;
      cjt $$6 = null;

      for (cjt $$7 : this.x()) {
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
   default cjt a(bpv $$0, double $$1) {
      return this.a($$0.dr(), $$0.dt(), $$0.dx(), $$1, false);
   }

   @Nullable
   default cjt a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<bpv> $$5 = $$4 ? bqa.e : bqa.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (cjt $$4 : this.x()) {
         if (bqa.f.test($$4) && bqa.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default cjt a(cbe $$0, bqo $$1) {
      return this.a(this.x(), $$0, $$1, $$1.dr(), $$1.dt(), $$1.dx());
   }

   @Nullable
   default cjt a(cbe $$0, bqo $$1, double $$2, double $$3, double $$4) {
      return this.a(this.x(), $$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   default cjt a(cbe $$0, double $$1, double $$2, double $$3) {
      return this.a(this.x(), $$0, null, $$1, $$2, $$3);
   }

   @Nullable
   default <T extends bqo> T a(Class<? extends T> $$0, cbe $$1, @Nullable bqo $$2, double $$3, double $$4, double $$5, erv $$6) {
      return this.a(this.a($$0, $$6, $$0x -> true), $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   default <T extends bqo> T a(List<? extends T> $$0, cbe $$1, @Nullable bqo $$2, double $$3, double $$4, double $$5) {
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

   default List<cjt> a(cbe $$0, bqo $$1, erv $$2) {
      List<cjt> $$3 = Lists.newArrayList();

      for (cjt $$4 : this.x()) {
         if ($$2.e($$4.dr(), $$4.dt(), $$4.dx()) && $$0.a($$1, $$4)) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   default <T extends bqo> List<T> a(Class<T> $$0, cbe $$1, bqo $$2, erv $$3) {
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
   default cjt b(UUID $$0) {
      for (int $$1 = 0; $$1 < this.x().size(); $$1++) {
         cjt $$2 = this.x().get($$1);
         if ($$0.equals($$2.cw())) {
            return $$2;
         }
      }

      return null;
   }
}
