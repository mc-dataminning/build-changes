import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface ctf {
   List<blu> a(@Nullable blu var1, eln var2, Predicate<? super blu> var3);

   <T extends blu> List<T> a(dne<blu, T> var1, eln var2, Predicate<? super T> var3);

   default <T extends blu> List<T> a(Class<T> $$0, eln $$1, Predicate<? super T> $$2) {
      return this.a(dne.a($$0), $$1, $$2);
   }

   List<? extends cfh> x();

   default List<blu> a_(@Nullable blu $$0, eln $$1) {
      return this.a($$0, $$1, blx.f);
   }

   default boolean a(@Nullable blu $$0, eml $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (blu $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dH() && $$2.I && ($$0 == null || !$$2.y($$0)) && emi.c($$1, emi.a($$2.cH()), elw.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends blu> List<T> a(Class<T> $$0, eln $$1) {
      return this.a($$0, $$1, blx.f);
   }

   default List<eml> c(@Nullable blu $$0, eln $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<blu> $$2 = $$0 == null ? blx.g : blx.f.and($$0::h);
         List<blu> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<eml> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (blu $$5 : $$3) {
               $$4.add(emi.a($$5.cH()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default cfh a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<blu> $$4) {
      double $$5 = -1.0;
      cfh $$6 = null;

      for (cfh $$7 : this.x()) {
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
   default cfh a(blu $$0, double $$1) {
      return this.a($$0.dr(), $$0.dt(), $$0.dx(), $$1, false);
   }

   @Nullable
   default cfh a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<blu> $$5 = $$4 ? blx.e : blx.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (cfh $$4 : this.x()) {
         if (blx.f.test($$4) && blx.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default cfh a(bwy $$0, bmk $$1) {
      return this.a(this.x(), $$0, $$1, $$1.dr(), $$1.dt(), $$1.dx());
   }

   @Nullable
   default cfh a(bwy $$0, bmk $$1, double $$2, double $$3, double $$4) {
      return this.a(this.x(), $$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   default cfh a(bwy $$0, double $$1, double $$2, double $$3) {
      return this.a(this.x(), $$0, null, $$1, $$2, $$3);
   }

   @Nullable
   default <T extends bmk> T a(Class<? extends T> $$0, bwy $$1, @Nullable bmk $$2, double $$3, double $$4, double $$5, eln $$6) {
      return this.a(this.a($$0, $$6, $$0x -> true), $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   default <T extends bmk> T a(List<? extends T> $$0, bwy $$1, @Nullable bmk $$2, double $$3, double $$4, double $$5) {
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

   default List<cfh> a(bwy $$0, bmk $$1, eln $$2) {
      List<cfh> $$3 = Lists.newArrayList();

      for (cfh $$4 : this.x()) {
         if ($$2.e($$4.dr(), $$4.dt(), $$4.dx()) && $$0.a($$1, $$4)) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   default <T extends bmk> List<T> a(Class<T> $$0, bwy $$1, bmk $$2, eln $$3) {
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
   default cfh b(UUID $$0) {
      for (int $$1 = 0; $$1 < this.x().size(); $$1++) {
         cfh $$2 = this.x().get($$1);
         if ($$0.equals($$2.cw())) {
            return $$2;
         }
      }

      return null;
   }
}
