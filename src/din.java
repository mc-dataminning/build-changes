import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface din {
   List<bwd> a(@Nullable bwd var1, fed var2, Predicate<? super bwd> var3);

   <T extends bwd> List<T> a(eel<bwd, T> var1, fed var2, Predicate<? super T> var3);

   default <T extends bwd> List<T> a(Class<T> $$0, fed $$1, Predicate<? super T> $$2) {
      return this.a(eel.a($$0), $$1, $$2);
   }

   List<? extends cqy> z();

   default List<bwd> a_(@Nullable bwd $$0, fed $$1) {
      return this.a($$0, $$1, bwk.f);
   }

   default boolean a(@Nullable bwd $$0, ffc $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (bwd $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dQ() && $$2.I && ($$0 == null || !$$2.z($$0)) && fez.c($$1, fez.a($$2.cR()), fem.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends bwd> List<T> a(Class<T> $$0, fed $$1) {
      return this.a($$0, $$1, bwk.f);
   }

   default List<ffc> c(@Nullable bwd $$0, fed $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<bwd> $$2 = $$0 == null ? bwk.g : bwk.f.and($$0::i);
         List<bwd> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<ffc> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (bwd $$5 : $$3) {
               $$4.add(fez.a($$5.cR()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default cqy a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<bwd> $$4) {
      double $$5 = -1.0;
      cqy $$6 = null;

      for (cqy $$7 : this.z()) {
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
   default cqy a(bwd $$0, double $$1) {
      return this.a($$0.dA(), $$0.dC(), $$0.dG(), $$1, false);
   }

   @Nullable
   default cqy a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<bwd> $$5 = $$4 ? bwk.e : bwk.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (cqy $$4 : this.z()) {
         if (bwk.f.test($$4) && bwk.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default cqy a(UUID $$0) {
      for (int $$1 = 0; $$1 < this.z().size(); $$1++) {
         cqy $$2 = this.z().get($$1);
         if ($$0.equals($$2.cG())) {
            return $$2;
         }
      }

      return null;
   }
}
