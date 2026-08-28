import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface dga {
   List<bum> a(@Nullable bum var1, faw var2, Predicate<? super bum> var3);

   <T extends bum> List<T> a(ebi<bum, T> var1, faw var2, Predicate<? super T> var3);

   default <T extends bum> List<T> a(Class<T> $$0, faw $$1, Predicate<? super T> $$2) {
      return this.a(ebi.a($$0), $$1, $$2);
   }

   List<? extends coy> z();

   default List<bum> a_(@Nullable bum $$0, faw $$1) {
      return this.a($$0, $$1, bur.f);
   }

   default boolean a(@Nullable bum $$0, fbv $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (bum $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dQ() && $$2.I && ($$0 == null || !$$2.z($$0)) && fbs.c($$1, fbs.a($$2.cR()), fbf.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends bum> List<T> a(Class<T> $$0, faw $$1) {
      return this.a($$0, $$1, bur.f);
   }

   default List<fbv> c(@Nullable bum $$0, faw $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<bum> $$2 = $$0 == null ? bur.g : bur.f.and($$0::i);
         List<bum> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<fbv> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (bum $$5 : $$3) {
               $$4.add(fbs.a($$5.cR()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default coy a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<bum> $$4) {
      double $$5 = -1.0;
      coy $$6 = null;

      for (coy $$7 : this.z()) {
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
   default coy a(bum $$0, double $$1) {
      return this.a($$0.dA(), $$0.dC(), $$0.dG(), $$1, false);
   }

   @Nullable
   default coy a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<bum> $$5 = $$4 ? bur.e : bur.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (coy $$4 : this.z()) {
         if (bur.f.test($$4) && bur.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default coy b(UUID $$0) {
      for (int $$1 = 0; $$1 < this.z().size(); $$1++) {
         coy $$2 = this.z().get($$1);
         if ($$0.equals($$2.cG())) {
            return $$2;
         }
      }

      return null;
   }
}
