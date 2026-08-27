import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface cyx {
   List<bqa> a(@Nullable bqa var1, ese var2, Predicate<? super bqa> var3);

   <T extends bqa> List<T> a(dtp<bqa, T> var1, ese var2, Predicate<? super T> var3);

   default <T extends bqa> List<T> a(Class<T> $$0, ese $$1, Predicate<? super T> $$2) {
      return this.a(dtp.a($$0), $$1, $$2);
   }

   List<? extends cka> x();

   default List<bqa> a_(@Nullable bqa $$0, ese $$1) {
      return this.a($$0, $$1, bqf.f);
   }

   default boolean a(@Nullable bqa $$0, etc $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (bqa $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dH() && $$2.I && ($$0 == null || !$$2.y($$0)) && esz.c($$1, esz.a($$2.cH()), esn.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends bqa> List<T> a(Class<T> $$0, ese $$1) {
      return this.a($$0, $$1, bqf.f);
   }

   default List<etc> c(@Nullable bqa $$0, ese $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<bqa> $$2 = $$0 == null ? bqf.g : bqf.f.and($$0::i);
         List<bqa> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<etc> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (bqa $$5 : $$3) {
               $$4.add(esz.a($$5.cH()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default cka a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<bqa> $$4) {
      double $$5 = -1.0;
      cka $$6 = null;

      for (cka $$7 : this.x()) {
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
   default cka a(bqa $$0, double $$1) {
      return this.a($$0.dr(), $$0.dt(), $$0.dx(), $$1, false);
   }

   @Nullable
   default cka a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<bqa> $$5 = $$4 ? bqf.e : bqf.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (cka $$4 : this.x()) {
         if (bqf.f.test($$4) && bqf.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default cka a(cbj $$0, bqt $$1) {
      return this.a(this.x(), $$0, $$1, $$1.dr(), $$1.dt(), $$1.dx());
   }

   @Nullable
   default cka a(cbj $$0, bqt $$1, double $$2, double $$3, double $$4) {
      return this.a(this.x(), $$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   default cka a(cbj $$0, double $$1, double $$2, double $$3) {
      return this.a(this.x(), $$0, null, $$1, $$2, $$3);
   }

   @Nullable
   default <T extends bqt> T a(Class<? extends T> $$0, cbj $$1, @Nullable bqt $$2, double $$3, double $$4, double $$5, ese $$6) {
      return this.a(this.a($$0, $$6, $$0x -> true), $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   default <T extends bqt> T a(List<? extends T> $$0, cbj $$1, @Nullable bqt $$2, double $$3, double $$4, double $$5) {
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

   default List<cka> a(cbj $$0, bqt $$1, ese $$2) {
      List<cka> $$3 = Lists.newArrayList();

      for (cka $$4 : this.x()) {
         if ($$2.e($$4.dr(), $$4.dt(), $$4.dx()) && $$0.a($$1, $$4)) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   default <T extends bqt> List<T> a(Class<T> $$0, cbj $$1, bqt $$2, ese $$3) {
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
   default cka b(UUID $$0) {
      for (int $$1 = 0; $$1 < this.x().size(); $$1++) {
         cka $$2 = this.x().get($$1);
         if ($$0.equals($$2.cw())) {
            return $$2;
         }
      }

      return null;
   }
}
