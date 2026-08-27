import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface csp {
   List<blf> a(@Nullable blf var1, ekw var2, Predicate<? super blf> var3);

   <T extends blf> List<T> a(dmn<blf, T> var1, ekw var2, Predicate<? super T> var3);

   default <T extends blf> List<T> a(Class<T> $$0, ekw $$1, Predicate<? super T> $$2) {
      return this.a(dmn.a($$0), $$1, $$2);
   }

   List<? extends cer> w();

   default List<blf> a_(@Nullable blf $$0, ekw $$1) {
      return this.a($$0, $$1, bli.f);
   }

   default boolean a(@Nullable blf $$0, elu $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (blf $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dH() && $$2.I && ($$0 == null || !$$2.y($$0)) && elr.c($$1, elr.a($$2.cH()), elf.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends blf> List<T> a(Class<T> $$0, ekw $$1) {
      return this.a($$0, $$1, bli.f);
   }

   default List<elu> c(@Nullable blf $$0, ekw $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<blf> $$2 = $$0 == null ? bli.g : bli.f.and($$0::h);
         List<blf> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<elu> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (blf $$5 : $$3) {
               $$4.add(elr.a($$5.cH()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default cer a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<blf> $$4) {
      double $$5 = -1.0;
      cer $$6 = null;

      for (cer $$7 : this.w()) {
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
   default cer a(blf $$0, double $$1) {
      return this.a($$0.dr(), $$0.dt(), $$0.dx(), $$1, false);
   }

   @Nullable
   default cer a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<blf> $$5 = $$4 ? bli.e : bli.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (cer $$4 : this.w()) {
         if (bli.f.test($$4) && bli.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default cer a(bwj $$0, blv $$1) {
      return this.a(this.w(), $$0, $$1, $$1.dr(), $$1.dt(), $$1.dx());
   }

   @Nullable
   default cer a(bwj $$0, blv $$1, double $$2, double $$3, double $$4) {
      return this.a(this.w(), $$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   default cer a(bwj $$0, double $$1, double $$2, double $$3) {
      return this.a(this.w(), $$0, null, $$1, $$2, $$3);
   }

   @Nullable
   default <T extends blv> T a(Class<? extends T> $$0, bwj $$1, @Nullable blv $$2, double $$3, double $$4, double $$5, ekw $$6) {
      return this.a(this.a($$0, $$6, $$0x -> true), $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   default <T extends blv> T a(List<? extends T> $$0, bwj $$1, @Nullable blv $$2, double $$3, double $$4, double $$5) {
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

   default List<cer> a(bwj $$0, blv $$1, ekw $$2) {
      List<cer> $$3 = Lists.newArrayList();

      for (cer $$4 : this.w()) {
         if ($$2.e($$4.dr(), $$4.dt(), $$4.dx()) && $$0.a($$1, $$4)) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   default <T extends blv> List<T> a(Class<T> $$0, bwj $$1, blv $$2, ekw $$3) {
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
   default cer b(UUID $$0) {
      for (int $$1 = 0; $$1 < this.w().size(); $$1++) {
         cer $$2 = this.w().get($$1);
         if ($$0.equals($$2.cw())) {
            return $$2;
         }
      }

      return null;
   }
}
