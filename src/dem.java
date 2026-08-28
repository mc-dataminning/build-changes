import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface dem {
   List<btz> a(@Nullable btz var1, ezc var2, Predicate<? super btz> var3);

   <T extends btz> List<T> a(dzo<btz, T> var1, ezc var2, Predicate<? super T> var3);

   default <T extends btz> List<T> a(Class<T> $$0, ezc $$1, Predicate<? super T> $$2) {
      return this.a(dzo.a($$0), $$1, $$2);
   }

   List<? extends coh> x();

   default List<btz> a_(@Nullable btz $$0, ezc $$1) {
      return this.a($$0, $$1, bue.f);
   }

   default boolean a(@Nullable btz $$0, fab $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (btz $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dS() && $$2.J && ($$0 == null || !$$2.z($$0)) && ezy.c($$1, ezy.a($$2.cS()), ezl.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends btz> List<T> a(Class<T> $$0, ezc $$1) {
      return this.a($$0, $$1, bue.f);
   }

   default List<fab> c(@Nullable btz $$0, ezc $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<btz> $$2 = $$0 == null ? bue.g : bue.f.and($$0::i);
         List<btz> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<fab> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (btz $$5 : $$3) {
               $$4.add(ezy.a($$5.cS()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default coh a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<btz> $$4) {
      double $$5 = -1.0;
      coh $$6 = null;

      for (coh $$7 : this.x()) {
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
   default coh a(btz $$0, double $$1) {
      return this.a($$0.dC(), $$0.dE(), $$0.dI(), $$1, false);
   }

   @Nullable
   default coh a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<btz> $$5 = $$4 ? bue.e : bue.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (coh $$4 : this.x()) {
         if (bue.f.test($$4) && bue.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default coh a(cfm $$0, buv $$1) {
      return this.a(this.x(), $$0, $$1, $$1.dC(), $$1.dE(), $$1.dI());
   }

   @Nullable
   default coh a(cfm $$0, buv $$1, double $$2, double $$3, double $$4) {
      return this.a(this.x(), $$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   default coh a(cfm $$0, double $$1, double $$2, double $$3) {
      return this.a(this.x(), $$0, null, $$1, $$2, $$3);
   }

   @Nullable
   default <T extends buv> T a(Class<? extends T> $$0, cfm $$1, @Nullable buv $$2, double $$3, double $$4, double $$5, ezc $$6) {
      return this.a(this.a($$0, $$6, $$0x -> true), $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   default <T extends buv> T a(List<? extends T> $$0, cfm $$1, @Nullable buv $$2, double $$3, double $$4, double $$5) {
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

   default List<coh> a(cfm $$0, buv $$1, ezc $$2) {
      List<coh> $$3 = Lists.newArrayList();

      for (coh $$4 : this.x()) {
         if ($$2.e($$4.dC(), $$4.dE(), $$4.dI()) && $$0.a($$1, $$4)) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   default <T extends buv> List<T> a(Class<T> $$0, cfm $$1, buv $$2, ezc $$3) {
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
   default coh b(UUID $$0) {
      for (int $$1 = 0; $$1 < this.x().size(); $$1++) {
         coh $$2 = this.x().get($$1);
         if ($$0.equals($$2.cH())) {
            return $$2;
         }
      }

      return null;
   }
}
