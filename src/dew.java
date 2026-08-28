import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface dew {
   List<bui> a(@Nullable bui var1, ezm var2, Predicate<? super bui> var3);

   <T extends bui> List<T> a(dzy<bui, T> var1, ezm var2, Predicate<? super T> var3);

   default <T extends bui> List<T> a(Class<T> $$0, ezm $$1, Predicate<? super T> $$2) {
      return this.a(dzy.a($$0), $$1, $$2);
   }

   List<? extends cor> x();

   default List<bui> a_(@Nullable bui $$0, ezm $$1) {
      return this.a($$0, $$1, bun.f);
   }

   default boolean a(@Nullable bui $$0, fal $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (bui $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dT() && $$2.J && ($$0 == null || !$$2.z($$0)) && fai.c($$1, fai.a($$2.cT()), ezv.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends bui> List<T> a(Class<T> $$0, ezm $$1) {
      return this.a($$0, $$1, bun.f);
   }

   default List<fal> c(@Nullable bui $$0, ezm $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<bui> $$2 = $$0 == null ? bun.g : bun.f.and($$0::i);
         List<bui> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<fal> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (bui $$5 : $$3) {
               $$4.add(fai.a($$5.cT()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default cor a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<bui> $$4) {
      double $$5 = -1.0;
      cor $$6 = null;

      for (cor $$7 : this.x()) {
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
   default cor a(bui $$0, double $$1) {
      return this.a($$0.dD(), $$0.dF(), $$0.dJ(), $$1, false);
   }

   @Nullable
   default cor a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<bui> $$5 = $$4 ? bun.e : bun.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (cor $$4 : this.x()) {
         if (bun.f.test($$4) && bun.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default cor a(cfv $$0, bve $$1) {
      return this.a(this.x(), $$0, $$1, $$1.dD(), $$1.dF(), $$1.dJ());
   }

   @Nullable
   default cor a(cfv $$0, bve $$1, double $$2, double $$3, double $$4) {
      return this.a(this.x(), $$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   default cor a(cfv $$0, double $$1, double $$2, double $$3) {
      return this.a(this.x(), $$0, null, $$1, $$2, $$3);
   }

   @Nullable
   default <T extends bve> T a(Class<? extends T> $$0, cfv $$1, @Nullable bve $$2, double $$3, double $$4, double $$5, ezm $$6) {
      return this.a(this.a($$0, $$6, $$0x -> true), $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   default <T extends bve> T a(List<? extends T> $$0, cfv $$1, @Nullable bve $$2, double $$3, double $$4, double $$5) {
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

   default List<cor> a(cfv $$0, bve $$1, ezm $$2) {
      List<cor> $$3 = Lists.newArrayList();

      for (cor $$4 : this.x()) {
         if ($$2.e($$4.dD(), $$4.dF(), $$4.dJ()) && $$0.a($$1, $$4)) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   default <T extends bve> List<T> a(Class<T> $$0, cfv $$1, bve $$2, ezm $$3) {
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
   default cor b(UUID $$0) {
      for (int $$1 = 0; $$1 < this.x().size(); $$1++) {
         cor $$2 = this.x().get($$1);
         if ($$0.equals($$2.cI())) {
            return $$2;
         }
      }

      return null;
   }
}
