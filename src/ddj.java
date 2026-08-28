import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface ddj {
   List<btj> a(@Nullable btj var1, exz var2, Predicate<? super btj> var3);

   <T extends btj> List<T> a(dyl<btj, T> var1, exz var2, Predicate<? super T> var3);

   default <T extends btj> List<T> a(Class<T> $$0, exz $$1, Predicate<? super T> $$2) {
      return this.a(dyl.a($$0), $$1, $$2);
   }

   List<? extends cnp> x();

   default List<btj> a_(@Nullable btj $$0, exz $$1) {
      return this.a($$0, $$1, bto.f);
   }

   default boolean a(@Nullable btj $$0, eyx $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (btj $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dN() && $$2.J && ($$0 == null || !$$2.z($$0)) && eyu.c($$1, eyu.a($$2.cO()), eyi.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends btj> List<T> a(Class<T> $$0, exz $$1) {
      return this.a($$0, $$1, bto.f);
   }

   default List<eyx> c(@Nullable btj $$0, exz $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<btj> $$2 = $$0 == null ? bto.g : bto.f.and($$0::i);
         List<btj> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<eyx> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (btj $$5 : $$3) {
               $$4.add(eyu.a($$5.cO()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default cnp a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<btj> $$4) {
      double $$5 = -1.0;
      cnp $$6 = null;

      for (cnp $$7 : this.x()) {
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
   default cnp a(btj $$0, double $$1) {
      return this.a($$0.dx(), $$0.dz(), $$0.dD(), $$1, false);
   }

   @Nullable
   default cnp a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<btj> $$5 = $$4 ? bto.e : bto.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (cnp $$4 : this.x()) {
         if (bto.f.test($$4) && bto.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default cnp a(cev $$0, buf $$1) {
      return this.a(this.x(), $$0, $$1, $$1.dx(), $$1.dz(), $$1.dD());
   }

   @Nullable
   default cnp a(cev $$0, buf $$1, double $$2, double $$3, double $$4) {
      return this.a(this.x(), $$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   default cnp a(cev $$0, double $$1, double $$2, double $$3) {
      return this.a(this.x(), $$0, null, $$1, $$2, $$3);
   }

   @Nullable
   default <T extends buf> T a(Class<? extends T> $$0, cev $$1, @Nullable buf $$2, double $$3, double $$4, double $$5, exz $$6) {
      return this.a(this.a($$0, $$6, $$0x -> true), $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   default <T extends buf> T a(List<? extends T> $$0, cev $$1, @Nullable buf $$2, double $$3, double $$4, double $$5) {
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

   default List<cnp> a(cev $$0, buf $$1, exz $$2) {
      List<cnp> $$3 = Lists.newArrayList();

      for (cnp $$4 : this.x()) {
         if ($$2.e($$4.dx(), $$4.dz(), $$4.dD()) && $$0.a($$1, $$4)) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   default <T extends buf> List<T> a(Class<T> $$0, cev $$1, buf $$2, exz $$3) {
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
   default cnp b(UUID $$0) {
      for (int $$1 = 0; $$1 < this.x().size(); $$1++) {
         cnp $$2 = this.x().get($$1);
         if ($$0.equals($$2.cD())) {
            return $$2;
         }
      }

      return null;
   }
}
