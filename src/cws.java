import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface cws {
   List<box> a(@Nullable box var1, epo var2, Predicate<? super box> var3);

   <T extends box> List<T> a(drd<box, T> var1, epo var2, Predicate<? super T> var3);

   default <T extends box> List<T> a(Class<T> $$0, epo $$1, Predicate<? super T> $$2) {
      return this.a(drd.a($$0), $$1, $$2);
   }

   List<? extends ciu> x();

   default List<box> a_(@Nullable box $$0, epo $$1) {
      return this.a($$0, $$1, bpc.f);
   }

   default boolean a(@Nullable box $$0, eqm $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (box $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dH() && $$2.I && ($$0 == null || !$$2.y($$0)) && eqj.c($$1, eqj.a($$2.cH()), epx.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends box> List<T> a(Class<T> $$0, epo $$1) {
      return this.a($$0, $$1, bpc.f);
   }

   default List<eqm> c(@Nullable box $$0, epo $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<box> $$2 = $$0 == null ? bpc.g : bpc.f.and($$0::i);
         List<box> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<eqm> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (box $$5 : $$3) {
               $$4.add(eqj.a($$5.cH()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default ciu a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<box> $$4) {
      double $$5 = -1.0;
      ciu $$6 = null;

      for (ciu $$7 : this.x()) {
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
   default ciu a(box $$0, double $$1) {
      return this.a($$0.dr(), $$0.dt(), $$0.dx(), $$1, false);
   }

   @Nullable
   default ciu a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<box> $$5 = $$4 ? bpc.e : bpc.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (ciu $$4 : this.x()) {
         if (bpc.f.test($$4) && bpc.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default ciu a(caf $$0, bpp $$1) {
      return this.a(this.x(), $$0, $$1, $$1.dr(), $$1.dt(), $$1.dx());
   }

   @Nullable
   default ciu a(caf $$0, bpp $$1, double $$2, double $$3, double $$4) {
      return this.a(this.x(), $$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   default ciu a(caf $$0, double $$1, double $$2, double $$3) {
      return this.a(this.x(), $$0, null, $$1, $$2, $$3);
   }

   @Nullable
   default <T extends bpp> T a(Class<? extends T> $$0, caf $$1, @Nullable bpp $$2, double $$3, double $$4, double $$5, epo $$6) {
      return this.a(this.a($$0, $$6, $$0x -> true), $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   default <T extends bpp> T a(List<? extends T> $$0, caf $$1, @Nullable bpp $$2, double $$3, double $$4, double $$5) {
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

   default List<ciu> a(caf $$0, bpp $$1, epo $$2) {
      List<ciu> $$3 = Lists.newArrayList();

      for (ciu $$4 : this.x()) {
         if ($$2.e($$4.dr(), $$4.dt(), $$4.dx()) && $$0.a($$1, $$4)) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   default <T extends bpp> List<T> a(Class<T> $$0, caf $$1, bpp $$2, epo $$3) {
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
   default ciu b(UUID $$0) {
      for (int $$1 = 0; $$1 < this.x().size(); $$1++) {
         ciu $$2 = this.x().get($$1);
         if ($$0.equals($$2.cw())) {
            return $$2;
         }
      }

      return null;
   }
}
