import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface dfd {
   List<bul> a(@Nullable bul var1, ezt var2, Predicate<? super bul> var3);

   <T extends bul> List<T> a(eaf<bul, T> var1, ezt var2, Predicate<? super T> var3);

   default <T extends bul> List<T> a(Class<T> $$0, ezt $$1, Predicate<? super T> $$2) {
      return this.a(eaf.a($$0), $$1, $$2);
   }

   List<? extends cou> y();

   default List<bul> a_(@Nullable bul $$0, ezt $$1) {
      return this.a($$0, $$1, buq.f);
   }

   default boolean a(@Nullable bul $$0, fas $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (bul $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dQ() && $$2.I && ($$0 == null || !$$2.z($$0)) && fap.c($$1, fap.a($$2.cR()), fac.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends bul> List<T> a(Class<T> $$0, ezt $$1) {
      return this.a($$0, $$1, buq.f);
   }

   default List<fas> c(@Nullable bul $$0, ezt $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<bul> $$2 = $$0 == null ? buq.g : buq.f.and($$0::i);
         List<bul> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<fas> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (bul $$5 : $$3) {
               $$4.add(fap.a($$5.cR()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default cou a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<bul> $$4) {
      double $$5 = -1.0;
      cou $$6 = null;

      for (cou $$7 : this.y()) {
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
   default cou a(bul $$0, double $$1) {
      return this.a($$0.dA(), $$0.dC(), $$0.dG(), $$1, false);
   }

   @Nullable
   default cou a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<bul> $$5 = $$4 ? buq.e : buq.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (cou $$4 : this.y()) {
         if (buq.f.test($$4) && buq.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default cou b(UUID $$0) {
      for (int $$1 = 0; $$1 < this.y().size(); $$1++) {
         cou $$2 = this.y().get($$1);
         if ($$0.equals($$2.cG())) {
            return $$2;
         }
      }

      return null;
   }
}
