import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface dcn {
   List<bsr> a(@Nullable bsr var1, ewx var2, Predicate<? super bsr> var3);

   <T extends bsr> List<T> a(dxn<bsr, T> var1, ewx var2, Predicate<? super T> var3);

   default <T extends bsr> List<T> a(Class<T> $$0, ewx $$1, Predicate<? super T> $$2) {
      return this.a(dxn.a($$0), $$1, $$2);
   }

   List<? extends cmx> x();

   default List<bsr> a_(@Nullable bsr $$0, ewx $$1) {
      return this.a($$0, $$1, bsw.f);
   }

   default boolean a(@Nullable bsr $$0, exv $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (bsr $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dJ() && $$2.J && ($$0 == null || !$$2.y($$0)) && exs.c($$1, exs.a($$2.cK()), exg.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends bsr> List<T> a(Class<T> $$0, ewx $$1) {
      return this.a($$0, $$1, bsw.f);
   }

   default List<exv> c(@Nullable bsr $$0, ewx $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<bsr> $$2 = $$0 == null ? bsw.g : bsw.f.and($$0::i);
         List<bsr> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<exv> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (bsr $$5 : $$3) {
               $$4.add(exs.a($$5.cK()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default cmx a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<bsr> $$4) {
      double $$5 = -1.0;
      cmx $$6 = null;

      for (cmx $$7 : this.x()) {
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
   default cmx a(bsr $$0, double $$1) {
      return this.a($$0.dt(), $$0.dv(), $$0.dz(), $$1, false);
   }

   @Nullable
   default cmx a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<bsr> $$5 = $$4 ? bsw.e : bsw.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (cmx $$4 : this.x()) {
         if (bsw.f.test($$4) && bsw.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default cmx a(cef $$0, btn $$1) {
      return this.a(this.x(), $$0, $$1, $$1.dt(), $$1.dv(), $$1.dz());
   }

   @Nullable
   default cmx a(cef $$0, btn $$1, double $$2, double $$3, double $$4) {
      return this.a(this.x(), $$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   default cmx a(cef $$0, double $$1, double $$2, double $$3) {
      return this.a(this.x(), $$0, null, $$1, $$2, $$3);
   }

   @Nullable
   default <T extends btn> T a(Class<? extends T> $$0, cef $$1, @Nullable btn $$2, double $$3, double $$4, double $$5, ewx $$6) {
      return this.a(this.a($$0, $$6, $$0x -> true), $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   default <T extends btn> T a(List<? extends T> $$0, cef $$1, @Nullable btn $$2, double $$3, double $$4, double $$5) {
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

   default List<cmx> a(cef $$0, btn $$1, ewx $$2) {
      List<cmx> $$3 = Lists.newArrayList();

      for (cmx $$4 : this.x()) {
         if ($$2.e($$4.dt(), $$4.dv(), $$4.dz()) && $$0.a($$1, $$4)) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   default <T extends btn> List<T> a(Class<T> $$0, cef $$1, btn $$2, ewx $$3) {
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
   default cmx b(UUID $$0) {
      for (int $$1 = 0; $$1 < this.x().size(); $$1++) {
         cmx $$2 = this.x().get($$1);
         if ($$0.equals($$2.cz())) {
            return $$2;
         }
      }

      return null;
   }
}
