import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface cto {
   List<blw> a(@Nullable blw var1, elx var2, Predicate<? super blw> var3);

   <T extends blw> List<T> a(dnn<blw, T> var1, elx var2, Predicate<? super T> var3);

   default <T extends blw> List<T> a(Class<T> $$0, elx $$1, Predicate<? super T> $$2) {
      return this.a(dnn.a($$0), $$1, $$2);
   }

   List<? extends cfq> x();

   default List<blw> a_(@Nullable blw $$0, elx $$1) {
      return this.a($$0, $$1, bmb.f);
   }

   default boolean a(@Nullable blw $$0, emv $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (blw $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dG() && $$2.I && ($$0 == null || !$$2.x($$0)) && ems.c($$1, ems.a($$2.cH()), emg.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends blw> List<T> a(Class<T> $$0, elx $$1) {
      return this.a($$0, $$1, bmb.f);
   }

   default List<emv> c(@Nullable blw $$0, elx $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<blw> $$2 = $$0 == null ? bmb.g : bmb.f.and($$0::h);
         List<blw> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<emv> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (blw $$5 : $$3) {
               $$4.add(ems.a($$5.cH()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default cfq a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<blw> $$4) {
      double $$5 = -1.0;
      cfq $$6 = null;

      for (cfq $$7 : this.x()) {
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
   default cfq a(blw $$0, double $$1) {
      return this.a($$0.dq(), $$0.ds(), $$0.dw(), $$1, false);
   }

   @Nullable
   default cfq a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<blw> $$5 = $$4 ? bmb.e : bmb.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (cfq $$4 : this.x()) {
         if (bmb.f.test($$4) && bmb.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default cfq a(bxd $$0, bmo $$1) {
      return this.a(this.x(), $$0, $$1, $$1.dq(), $$1.ds(), $$1.dw());
   }

   @Nullable
   default cfq a(bxd $$0, bmo $$1, double $$2, double $$3, double $$4) {
      return this.a(this.x(), $$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   default cfq a(bxd $$0, double $$1, double $$2, double $$3) {
      return this.a(this.x(), $$0, null, $$1, $$2, $$3);
   }

   @Nullable
   default <T extends bmo> T a(Class<? extends T> $$0, bxd $$1, @Nullable bmo $$2, double $$3, double $$4, double $$5, elx $$6) {
      return this.a(this.a($$0, $$6, $$0x -> true), $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   default <T extends bmo> T a(List<? extends T> $$0, bxd $$1, @Nullable bmo $$2, double $$3, double $$4, double $$5) {
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

   default List<cfq> a(bxd $$0, bmo $$1, elx $$2) {
      List<cfq> $$3 = Lists.newArrayList();

      for (cfq $$4 : this.x()) {
         if ($$2.e($$4.dq(), $$4.ds(), $$4.dw()) && $$0.a($$1, $$4)) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   default <T extends bmo> List<T> a(Class<T> $$0, bxd $$1, bmo $$2, elx $$3) {
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
   default cfq b(UUID $$0) {
      for (int $$1 = 0; $$1 < this.x().size(); $$1++) {
         cfq $$2 = this.x().get($$1);
         if ($$0.equals($$2.cw())) {
            return $$2;
         }
      }

      return null;
   }
}
