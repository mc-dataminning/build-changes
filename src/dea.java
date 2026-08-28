import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface dea {
   List<btr> a(@Nullable btr var1, eyr var2, Predicate<? super btr> var3);

   <T extends btr> List<T> a(dzd<btr, T> var1, eyr var2, Predicate<? super T> var3);

   default <T extends btr> List<T> a(Class<T> $$0, eyr $$1, Predicate<? super T> $$2) {
      return this.a(dzd.a($$0), $$1, $$2);
   }

   List<? extends cnx> x();

   default List<btr> a_(@Nullable btr $$0, eyr $$1) {
      return this.a($$0, $$1, btw.f);
   }

   default boolean a(@Nullable btr $$0, ezq $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (btr $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dN() && $$2.J && ($$0 == null || !$$2.z($$0)) && ezn.c($$1, ezn.a($$2.cO()), eza.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends btr> List<T> a(Class<T> $$0, eyr $$1) {
      return this.a($$0, $$1, btw.f);
   }

   default List<ezq> c(@Nullable btr $$0, eyr $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<btr> $$2 = $$0 == null ? btw.g : btw.f.and($$0::i);
         List<btr> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<ezq> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (btr $$5 : $$3) {
               $$4.add(ezn.a($$5.cO()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default cnx a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<btr> $$4) {
      double $$5 = -1.0;
      cnx $$6 = null;

      for (cnx $$7 : this.x()) {
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
   default cnx a(btr $$0, double $$1) {
      return this.a($$0.dx(), $$0.dz(), $$0.dD(), $$1, false);
   }

   @Nullable
   default cnx a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<btr> $$5 = $$4 ? btw.e : btw.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (cnx $$4 : this.x()) {
         if (btw.f.test($$4) && btw.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default cnx a(cfd $$0, bun $$1) {
      return this.a(this.x(), $$0, $$1, $$1.dx(), $$1.dz(), $$1.dD());
   }

   @Nullable
   default cnx a(cfd $$0, bun $$1, double $$2, double $$3, double $$4) {
      return this.a(this.x(), $$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   default cnx a(cfd $$0, double $$1, double $$2, double $$3) {
      return this.a(this.x(), $$0, null, $$1, $$2, $$3);
   }

   @Nullable
   default <T extends bun> T a(Class<? extends T> $$0, cfd $$1, @Nullable bun $$2, double $$3, double $$4, double $$5, eyr $$6) {
      return this.a(this.a($$0, $$6, $$0x -> true), $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   default <T extends bun> T a(List<? extends T> $$0, cfd $$1, @Nullable bun $$2, double $$3, double $$4, double $$5) {
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

   default List<cnx> a(cfd $$0, bun $$1, eyr $$2) {
      List<cnx> $$3 = Lists.newArrayList();

      for (cnx $$4 : this.x()) {
         if ($$2.e($$4.dx(), $$4.dz(), $$4.dD()) && $$0.a($$1, $$4)) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   default <T extends bun> List<T> a(Class<T> $$0, cfd $$1, bun $$2, eyr $$3) {
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
   default cnx b(UUID $$0) {
      for (int $$1 = 0; $$1 < this.x().size(); $$1++) {
         cnx $$2 = this.x().get($$1);
         if ($$0.equals($$2.cD())) {
            return $$2;
         }
      }

      return null;
   }
}
