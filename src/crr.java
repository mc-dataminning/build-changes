import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface crr {
   List<bkq> a(@Nullable bkq var1, ejp var2, Predicate<? super bkq> var3);

   <T extends bkq> List<T> a(dlg<bkq, T> var1, ejp var2, Predicate<? super T> var3);

   default <T extends bkq> List<T> a(Class<T> $$0, ejp $$1, Predicate<? super T> $$2) {
      return this.a(dlg.a($$0), $$1, $$2);
   }

   List<? extends cdu> w();

   default List<bkq> a_(@Nullable bkq $$0, ejp $$1) {
      return this.a($$0, $$1, bkt.f);
   }

   default boolean a(@Nullable bkq $$0, ekn $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (bkq $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dI() && $$2.I && ($$0 == null || !$$2.y($$0)) && ekk.c($$1, ekk.a($$2.cH()), ejy.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends bkq> List<T> a(Class<T> $$0, ejp $$1) {
      return this.a($$0, $$1, bkt.f);
   }

   default List<ekn> c(@Nullable bkq $$0, ejp $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<bkq> $$2 = $$0 == null ? bkt.g : bkt.f.and($$0::h);
         List<bkq> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<ekn> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (bkq $$5 : $$3) {
               $$4.add(ekk.a($$5.cH()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default cdu a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<bkq> $$4) {
      double $$5 = -1.0;
      cdu $$6 = null;

      for (cdu $$7 : this.w()) {
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
   default cdu a(bkq $$0, double $$1) {
      return this.a($$0.ds(), $$0.du(), $$0.dy(), $$1, false);
   }

   @Nullable
   default cdu a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<bkq> $$5 = $$4 ? bkt.e : bkt.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (cdu $$4 : this.w()) {
         if (bkt.f.test($$4) && bkt.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default cdu a(bvs $$0, blg $$1) {
      return this.a(this.w(), $$0, $$1, $$1.ds(), $$1.du(), $$1.dy());
   }

   @Nullable
   default cdu a(bvs $$0, blg $$1, double $$2, double $$3, double $$4) {
      return this.a(this.w(), $$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   default cdu a(bvs $$0, double $$1, double $$2, double $$3) {
      return this.a(this.w(), $$0, null, $$1, $$2, $$3);
   }

   @Nullable
   default <T extends blg> T a(Class<? extends T> $$0, bvs $$1, @Nullable blg $$2, double $$3, double $$4, double $$5, ejp $$6) {
      return this.a(this.a($$0, $$6, $$0x -> true), $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   default <T extends blg> T a(List<? extends T> $$0, bvs $$1, @Nullable blg $$2, double $$3, double $$4, double $$5) {
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

   default List<cdu> a(bvs $$0, blg $$1, ejp $$2) {
      List<cdu> $$3 = Lists.newArrayList();

      for (cdu $$4 : this.w()) {
         if ($$2.e($$4.ds(), $$4.du(), $$4.dy()) && $$0.a($$1, $$4)) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   default <T extends blg> List<T> a(Class<T> $$0, bvs $$1, blg $$2, ejp $$3) {
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
   default cdu b(UUID $$0) {
      for (int $$1 = 0; $$1 < this.w().size(); $$1++) {
         cdu $$2 = this.w().get($$1);
         if ($$0.equals($$2.cw())) {
            return $$2;
         }
      }

      return null;
   }
}
