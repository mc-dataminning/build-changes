import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface cph {
   List<bil> a(@Nullable bil var1, ehd var2, Predicate<? super bil> var3);

   <T extends bil> List<T> a(djc<bil, T> var1, ehd var2, Predicate<? super T> var3);

   default <T extends bil> List<T> a(Class<T> $$0, ehd $$1, Predicate<? super T> $$2) {
      return this.a(djc.a($$0), $$1, $$2);
   }

   List<? extends cbp> v();

   default List<bil> a_(@Nullable bil $$0, ehd $$1) {
      return this.a($$0, $$1, bio.f);
   }

   default boolean a(@Nullable bil $$0, eib $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (bil $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dF() && $$2.I && ($$0 == null || !$$2.y($$0)) && ehy.c($$1, ehy.a($$2.cG()), ehm.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends bil> List<T> a(Class<T> $$0, ehd $$1) {
      return this.a($$0, $$1, bio.f);
   }

   default List<eib> c(@Nullable bil $$0, ehd $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<bil> $$2 = $$0 == null ? bio.g : bio.f.and($$0::h);
         List<bil> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<eib> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (bil $$5 : $$3) {
               $$4.add(ehy.a($$5.cG()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default cbp a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<bil> $$4) {
      double $$5 = -1.0;
      cbp $$6 = null;

      for (cbp $$7 : this.v()) {
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
   default cbp a(bil $$0, double $$1) {
      return this.a($$0.dp(), $$0.dr(), $$0.dv(), $$1, false);
   }

   @Nullable
   default cbp a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<bil> $$5 = $$4 ? bio.e : bio.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (cbp $$4 : this.v()) {
         if (bio.f.test($$4) && bio.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default cbp a(btn $$0, bjb $$1) {
      return this.a(this.v(), $$0, $$1, $$1.dp(), $$1.dr(), $$1.dv());
   }

   @Nullable
   default cbp a(btn $$0, bjb $$1, double $$2, double $$3, double $$4) {
      return this.a(this.v(), $$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   default cbp a(btn $$0, double $$1, double $$2, double $$3) {
      return this.a(this.v(), $$0, null, $$1, $$2, $$3);
   }

   @Nullable
   default <T extends bjb> T a(Class<? extends T> $$0, btn $$1, @Nullable bjb $$2, double $$3, double $$4, double $$5, ehd $$6) {
      return this.a(this.a($$0, $$6, $$0x -> true), $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   default <T extends bjb> T a(List<? extends T> $$0, btn $$1, @Nullable bjb $$2, double $$3, double $$4, double $$5) {
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

   default List<cbp> a(btn $$0, bjb $$1, ehd $$2) {
      List<cbp> $$3 = Lists.newArrayList();

      for (cbp $$4 : this.v()) {
         if ($$2.e($$4.dp(), $$4.dr(), $$4.dv()) && $$0.a($$1, $$4)) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   default <T extends bjb> List<T> a(Class<T> $$0, btn $$1, bjb $$2, ehd $$3) {
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
   default cbp b(UUID $$0) {
      for (int $$1 = 0; $$1 < this.v().size(); $$1++) {
         cbp $$2 = this.v().get($$1);
         if ($$0.equals($$2.cv())) {
            return $$2;
         }
      }

      return null;
   }
}
