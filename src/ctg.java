import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface ctg {
   List<blv> a(@Nullable blv var1, elo var2, Predicate<? super blv> var3);

   <T extends blv> List<T> a(dnf<blv, T> var1, elo var2, Predicate<? super T> var3);

   default <T extends blv> List<T> a(Class<T> $$0, elo $$1, Predicate<? super T> $$2) {
      return this.a(dnf.a($$0), $$1, $$2);
   }

   List<? extends cfi> x();

   default List<blv> a_(@Nullable blv $$0, elo $$1) {
      return this.a($$0, $$1, bly.f);
   }

   default boolean a(@Nullable blv $$0, emm $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (blv $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dH() && $$2.I && ($$0 == null || !$$2.y($$0)) && emj.c($$1, emj.a($$2.cH()), elx.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends blv> List<T> a(Class<T> $$0, elo $$1) {
      return this.a($$0, $$1, bly.f);
   }

   default List<emm> c(@Nullable blv $$0, elo $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<blv> $$2 = $$0 == null ? bly.g : bly.f.and($$0::h);
         List<blv> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<emm> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (blv $$5 : $$3) {
               $$4.add(emj.a($$5.cH()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default cfi a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<blv> $$4) {
      double $$5 = -1.0;
      cfi $$6 = null;

      for (cfi $$7 : this.x()) {
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
   default cfi a(blv $$0, double $$1) {
      return this.a($$0.dr(), $$0.dt(), $$0.dx(), $$1, false);
   }

   @Nullable
   default cfi a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<blv> $$5 = $$4 ? bly.e : bly.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (cfi $$4 : this.x()) {
         if (bly.f.test($$4) && bly.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default cfi a(bwz $$0, bml $$1) {
      return this.a(this.x(), $$0, $$1, $$1.dr(), $$1.dt(), $$1.dx());
   }

   @Nullable
   default cfi a(bwz $$0, bml $$1, double $$2, double $$3, double $$4) {
      return this.a(this.x(), $$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   default cfi a(bwz $$0, double $$1, double $$2, double $$3) {
      return this.a(this.x(), $$0, null, $$1, $$2, $$3);
   }

   @Nullable
   default <T extends bml> T a(Class<? extends T> $$0, bwz $$1, @Nullable bml $$2, double $$3, double $$4, double $$5, elo $$6) {
      return this.a(this.a($$0, $$6, $$0x -> true), $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   default <T extends bml> T a(List<? extends T> $$0, bwz $$1, @Nullable bml $$2, double $$3, double $$4, double $$5) {
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

   default List<cfi> a(bwz $$0, bml $$1, elo $$2) {
      List<cfi> $$3 = Lists.newArrayList();

      for (cfi $$4 : this.x()) {
         if ($$2.e($$4.dr(), $$4.dt(), $$4.dx()) && $$0.a($$1, $$4)) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   default <T extends bml> List<T> a(Class<T> $$0, bwz $$1, bml $$2, elo $$3) {
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
   default cfi b(UUID $$0) {
      for (int $$1 = 0; $$1 < this.x().size(); $$1++) {
         cfi $$2 = this.x().get($$1);
         if ($$0.equals($$2.cw())) {
            return $$2;
         }
      }

      return null;
   }
}
