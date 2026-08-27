import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface cmd {
   List<bfj> a(@Nullable bfj var1, eed var2, Predicate<? super bfj> var3);

   <T extends bfj> List<T> a(dfz<bfj, T> var1, eed var2, Predicate<? super T> var3);

   default <T extends bfj> List<T> a(Class<T> $$0, eed $$1, Predicate<? super T> $$2) {
      return this.a(dfz.a($$0), $$1, $$2);
   }

   List<? extends byo> v();

   default List<bfj> a_(@Nullable bfj $$0, eed $$1) {
      return this.a($$0, $$1, bfm.f);
   }

   default boolean a(@Nullable bfj $$0, efb $$1) {
      if ($$1.b()) {
         return true;
      } else {
         for (bfj $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dD() && $$2.H && ($$0 == null || !$$2.v($$0)) && eey.c($$1, eey.a($$2.cE()), eem.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends bfj> List<T> a(Class<T> $$0, eed $$1) {
      return this.a($$0, $$1, bfm.f);
   }

   default List<efb> b(@Nullable bfj $$0, eed $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<bfj> $$2 = $$0 == null ? bfm.g : bfm.f.and($$0::h);
         List<bfj> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<efb> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (bfj $$5 : $$3) {
               $$4.add(eey.a($$5.cE()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default byo a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<bfj> $$4) {
      double $$5 = -1.0;
      byo $$6 = null;

      for (byo $$7 : this.v()) {
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
   default byo a(bfj $$0, double $$1) {
      return this.a($$0.dn(), $$0.dp(), $$0.dt(), $$1, false);
   }

   @Nullable
   default byo a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<bfj> $$5 = $$4 ? bfm.e : bfm.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (byo $$4 : this.v()) {
         if (bfm.f.test($$4) && bfm.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default byo a(bqm $$0, bfz $$1) {
      return this.a(this.v(), $$0, $$1, $$1.dn(), $$1.dp(), $$1.dt());
   }

   @Nullable
   default byo a(bqm $$0, bfz $$1, double $$2, double $$3, double $$4) {
      return this.a(this.v(), $$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   default byo a(bqm $$0, double $$1, double $$2, double $$3) {
      return this.a(this.v(), $$0, null, $$1, $$2, $$3);
   }

   @Nullable
   default <T extends bfz> T a(Class<? extends T> $$0, bqm $$1, @Nullable bfz $$2, double $$3, double $$4, double $$5, eed $$6) {
      return this.a(this.a($$0, $$6, $$0x -> true), $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   default <T extends bfz> T a(List<? extends T> $$0, bqm $$1, @Nullable bfz $$2, double $$3, double $$4, double $$5) {
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

   default List<byo> a(bqm $$0, bfz $$1, eed $$2) {
      List<byo> $$3 = Lists.newArrayList();

      for (byo $$4 : this.v()) {
         if ($$2.e($$4.dn(), $$4.dp(), $$4.dt()) && $$0.a($$1, $$4)) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   default <T extends bfz> List<T> a(Class<T> $$0, bqm $$1, bfz $$2, eed $$3) {
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
   default byo b(UUID $$0) {
      for (int $$1 = 0; $$1 < this.v().size(); $$1++) {
         byo $$2 = this.v().get($$1);
         if ($$0.equals($$2.ct())) {
            return $$2;
         }
      }

      return null;
   }
}
