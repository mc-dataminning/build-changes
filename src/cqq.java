import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface cqq {
   List<bjt> a(@Nullable bjt var1, eia var2, Predicate<? super bjt> var3);

   <T extends bjt> List<T> a(djz<bjt, T> var1, eia var2, Predicate<? super T> var3);

   default <T extends bjt> List<T> a(Class<T> $$0, eia $$1, Predicate<? super T> $$2) {
      return this.a(djz.a($$0), $$1, $$2);
   }

   List<? extends ccx> v();

   default List<bjt> a_(@Nullable bjt $$0, eia $$1) {
      return this.a($$0, $$1, bjw.f);
   }

   default boolean a(@Nullable bjt $$0, eiy $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (bjt $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dG() && $$2.I && ($$0 == null || !$$2.y($$0)) && eiv.c($$1, eiv.a($$2.cG()), eij.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends bjt> List<T> a(Class<T> $$0, eia $$1) {
      return this.a($$0, $$1, bjw.f);
   }

   default List<eiy> c(@Nullable bjt $$0, eia $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<bjt> $$2 = $$0 == null ? bjw.g : bjw.f.and($$0::h);
         List<bjt> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<eiy> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (bjt $$5 : $$3) {
               $$4.add(eiv.a($$5.cG()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default ccx a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<bjt> $$4) {
      double $$5 = -1.0;
      ccx $$6 = null;

      for (ccx $$7 : this.v()) {
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
   default ccx a(bjt $$0, double $$1) {
      return this.a($$0.dq(), $$0.ds(), $$0.dw(), $$1, false);
   }

   @Nullable
   default ccx a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<bjt> $$5 = $$4 ? bjw.e : bjw.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (ccx $$4 : this.v()) {
         if (bjw.f.test($$4) && bjw.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default ccx a(buv $$0, bkj $$1) {
      return this.a(this.v(), $$0, $$1, $$1.dq(), $$1.ds(), $$1.dw());
   }

   @Nullable
   default ccx a(buv $$0, bkj $$1, double $$2, double $$3, double $$4) {
      return this.a(this.v(), $$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   default ccx a(buv $$0, double $$1, double $$2, double $$3) {
      return this.a(this.v(), $$0, null, $$1, $$2, $$3);
   }

   @Nullable
   default <T extends bkj> T a(Class<? extends T> $$0, buv $$1, @Nullable bkj $$2, double $$3, double $$4, double $$5, eia $$6) {
      return this.a(this.a($$0, $$6, $$0x -> true), $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   default <T extends bkj> T a(List<? extends T> $$0, buv $$1, @Nullable bkj $$2, double $$3, double $$4, double $$5) {
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

   default List<ccx> a(buv $$0, bkj $$1, eia $$2) {
      List<ccx> $$3 = Lists.newArrayList();

      for (ccx $$4 : this.v()) {
         if ($$2.e($$4.dq(), $$4.ds(), $$4.dw()) && $$0.a($$1, $$4)) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   default <T extends bkj> List<T> a(Class<T> $$0, buv $$1, bkj $$2, eia $$3) {
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
   default ccx b(UUID $$0) {
      for (int $$1 = 0; $$1 < this.v().size(); $$1++) {
         ccx $$2 = this.v().get($$1);
         if ($$0.equals($$2.cv())) {
            return $$2;
         }
      }

      return null;
   }
}
