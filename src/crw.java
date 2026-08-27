import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface crw {
   List<bkv> a(@Nullable bkv var1, eju var2, Predicate<? super bkv> var3);

   <T extends bkv> List<T> a(dll<bkv, T> var1, eju var2, Predicate<? super T> var3);

   default <T extends bkv> List<T> a(Class<T> $$0, eju $$1, Predicate<? super T> $$2) {
      return this.a(dll.a($$0), $$1, $$2);
   }

   List<? extends cdz> w();

   default List<bkv> a_(@Nullable bkv $$0, eju $$1) {
      return this.a($$0, $$1, bky.f);
   }

   default boolean a(@Nullable bkv $$0, eks $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (bkv $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dI() && $$2.I && ($$0 == null || !$$2.y($$0)) && ekp.c($$1, ekp.a($$2.cH()), ekd.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends bkv> List<T> a(Class<T> $$0, eju $$1) {
      return this.a($$0, $$1, bky.f);
   }

   default List<eks> c(@Nullable bkv $$0, eju $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<bkv> $$2 = $$0 == null ? bky.g : bky.f.and($$0::h);
         List<bkv> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<eks> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (bkv $$5 : $$3) {
               $$4.add(ekp.a($$5.cH()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default cdz a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<bkv> $$4) {
      double $$5 = -1.0;
      cdz $$6 = null;

      for (cdz $$7 : this.w()) {
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
   default cdz a(bkv $$0, double $$1) {
      return this.a($$0.ds(), $$0.du(), $$0.dy(), $$1, false);
   }

   @Nullable
   default cdz a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<bkv> $$5 = $$4 ? bky.e : bky.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (cdz $$4 : this.w()) {
         if (bky.f.test($$4) && bky.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default cdz a(bvx $$0, bll $$1) {
      return this.a(this.w(), $$0, $$1, $$1.ds(), $$1.du(), $$1.dy());
   }

   @Nullable
   default cdz a(bvx $$0, bll $$1, double $$2, double $$3, double $$4) {
      return this.a(this.w(), $$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   default cdz a(bvx $$0, double $$1, double $$2, double $$3) {
      return this.a(this.w(), $$0, null, $$1, $$2, $$3);
   }

   @Nullable
   default <T extends bll> T a(Class<? extends T> $$0, bvx $$1, @Nullable bll $$2, double $$3, double $$4, double $$5, eju $$6) {
      return this.a(this.a($$0, $$6, $$0x -> true), $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   default <T extends bll> T a(List<? extends T> $$0, bvx $$1, @Nullable bll $$2, double $$3, double $$4, double $$5) {
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

   default List<cdz> a(bvx $$0, bll $$1, eju $$2) {
      List<cdz> $$3 = Lists.newArrayList();

      for (cdz $$4 : this.w()) {
         if ($$2.e($$4.ds(), $$4.du(), $$4.dy()) && $$0.a($$1, $$4)) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   default <T extends bll> List<T> a(Class<T> $$0, bvx $$1, bll $$2, eju $$3) {
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
   default cdz b(UUID $$0) {
      for (int $$1 = 0; $$1 < this.w().size(); $$1++) {
         cdz $$2 = this.w().get($$1);
         if ($$0.equals($$2.cw())) {
            return $$2;
         }
      }

      return null;
   }
}
