import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface cve {
   List<bno> a(@Nullable bno var1, enn var2, Predicate<? super bno> var3);

   <T extends bno> List<T> a(dpd<bno, T> var1, enn var2, Predicate<? super T> var3);

   default <T extends bno> List<T> a(Class<T> $$0, enn $$1, Predicate<? super T> $$2) {
      return this.a(dpd.a($$0), $$1, $$2);
   }

   List<? extends chh> x();

   default List<bno> a_(@Nullable bno $$0, enn $$1) {
      return this.a($$0, $$1, bnt.f);
   }

   default boolean a(@Nullable bno $$0, eol $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (bno $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dH() && $$2.H && ($$0 == null || !$$2.x($$0)) && eoi.c($$1, eoi.a($$2.cH()), enw.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends bno> List<T> a(Class<T> $$0, enn $$1) {
      return this.a($$0, $$1, bnt.f);
   }

   default List<eol> c(@Nullable bno $$0, enn $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<bno> $$2 = $$0 == null ? bnt.g : bnt.f.and($$0::h);
         List<bno> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<eol> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (bno $$5 : $$3) {
               $$4.add(eoi.a($$5.cH()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default chh a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<bno> $$4) {
      double $$5 = -1.0;
      chh $$6 = null;

      for (chh $$7 : this.x()) {
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
   default chh a(bno $$0, double $$1) {
      return this.a($$0.dr(), $$0.dt(), $$0.dx(), $$1, false);
   }

   @Nullable
   default chh a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<bno> $$5 = $$4 ? bnt.e : bnt.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (chh $$4 : this.x()) {
         if (bnt.f.test($$4) && bnt.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default chh a(byu $$0, bog $$1) {
      return this.a(this.x(), $$0, $$1, $$1.dr(), $$1.dt(), $$1.dx());
   }

   @Nullable
   default chh a(byu $$0, bog $$1, double $$2, double $$3, double $$4) {
      return this.a(this.x(), $$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   default chh a(byu $$0, double $$1, double $$2, double $$3) {
      return this.a(this.x(), $$0, null, $$1, $$2, $$3);
   }

   @Nullable
   default <T extends bog> T a(Class<? extends T> $$0, byu $$1, @Nullable bog $$2, double $$3, double $$4, double $$5, enn $$6) {
      return this.a(this.a($$0, $$6, $$0x -> true), $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   default <T extends bog> T a(List<? extends T> $$0, byu $$1, @Nullable bog $$2, double $$3, double $$4, double $$5) {
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

   default List<chh> a(byu $$0, bog $$1, enn $$2) {
      List<chh> $$3 = Lists.newArrayList();

      for (chh $$4 : this.x()) {
         if ($$2.e($$4.dr(), $$4.dt(), $$4.dx()) && $$0.a($$1, $$4)) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   default <T extends bog> List<T> a(Class<T> $$0, byu $$1, bog $$2, enn $$3) {
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
   default chh b(UUID $$0) {
      for (int $$1 = 0; $$1 < this.x().size(); $$1++) {
         chh $$2 = this.x().get($$1);
         if ($$0.equals($$2.cw())) {
            return $$2;
         }
      }

      return null;
   }
}
