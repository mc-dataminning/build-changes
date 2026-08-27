import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface csz {
   List<blp> a(@Nullable blp var1, elh var2, Predicate<? super blp> var3);

   <T extends blp> List<T> a(dmy<blp, T> var1, elh var2, Predicate<? super T> var3);

   default <T extends blp> List<T> a(Class<T> $$0, elh $$1, Predicate<? super T> $$2) {
      return this.a(dmy.a($$0), $$1, $$2);
   }

   List<? extends cfb> x();

   default List<blp> a_(@Nullable blp $$0, elh $$1) {
      return this.a($$0, $$1, bls.f);
   }

   default boolean a(@Nullable blp $$0, emf $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (blp $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dH() && $$2.I && ($$0 == null || !$$2.y($$0)) && emc.c($$1, emc.a($$2.cH()), elq.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends blp> List<T> a(Class<T> $$0, elh $$1) {
      return this.a($$0, $$1, bls.f);
   }

   default List<emf> c(@Nullable blp $$0, elh $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<blp> $$2 = $$0 == null ? bls.g : bls.f.and($$0::h);
         List<blp> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<emf> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (blp $$5 : $$3) {
               $$4.add(emc.a($$5.cH()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default cfb a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<blp> $$4) {
      double $$5 = -1.0;
      cfb $$6 = null;

      for (cfb $$7 : this.x()) {
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
   default cfb a(blp $$0, double $$1) {
      return this.a($$0.dr(), $$0.dt(), $$0.dx(), $$1, false);
   }

   @Nullable
   default cfb a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<blp> $$5 = $$4 ? bls.e : bls.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (cfb $$4 : this.x()) {
         if (bls.f.test($$4) && bls.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default cfb a(bwt $$0, bmf $$1) {
      return this.a(this.x(), $$0, $$1, $$1.dr(), $$1.dt(), $$1.dx());
   }

   @Nullable
   default cfb a(bwt $$0, bmf $$1, double $$2, double $$3, double $$4) {
      return this.a(this.x(), $$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   default cfb a(bwt $$0, double $$1, double $$2, double $$3) {
      return this.a(this.x(), $$0, null, $$1, $$2, $$3);
   }

   @Nullable
   default <T extends bmf> T a(Class<? extends T> $$0, bwt $$1, @Nullable bmf $$2, double $$3, double $$4, double $$5, elh $$6) {
      return this.a(this.a($$0, $$6, $$0x -> true), $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   default <T extends bmf> T a(List<? extends T> $$0, bwt $$1, @Nullable bmf $$2, double $$3, double $$4, double $$5) {
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

   default List<cfb> a(bwt $$0, bmf $$1, elh $$2) {
      List<cfb> $$3 = Lists.newArrayList();

      for (cfb $$4 : this.x()) {
         if ($$2.e($$4.dr(), $$4.dt(), $$4.dx()) && $$0.a($$1, $$4)) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   default <T extends bmf> List<T> a(Class<T> $$0, bwt $$1, bmf $$2, elh $$3) {
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
   default cfb b(UUID $$0) {
      for (int $$1 = 0; $$1 < this.x().size(); $$1++) {
         cfb $$2 = this.x().get($$1);
         if ($$0.equals($$2.cw())) {
            return $$2;
         }
      }

      return null;
   }
}
