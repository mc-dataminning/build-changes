import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface cvv {
   List<bof> a(@Nullable bof var1, eoq var2, Predicate<? super bof> var3);

   <T extends bof> List<T> a(dqf<bof, T> var1, eoq var2, Predicate<? super T> var3);

   default <T extends bof> List<T> a(Class<T> $$0, eoq $$1, Predicate<? super T> $$2) {
      return this.a(dqf.a($$0), $$1, $$2);
   }

   List<? extends cia> x();

   default List<bof> a_(@Nullable bof $$0, eoq $$1) {
      return this.a($$0, $$1, bok.f);
   }

   default boolean a(@Nullable bof $$0, epo $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (bof $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dE() && $$2.H && ($$0 == null || !$$2.x($$0)) && epl.c($$1, epl.a($$2.cE()), eoz.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends bof> List<T> a(Class<T> $$0, eoq $$1) {
      return this.a($$0, $$1, bok.f);
   }

   default List<epo> c(@Nullable bof $$0, eoq $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<bof> $$2 = $$0 == null ? bok.g : bok.f.and($$0::h);
         List<bof> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<epo> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (bof $$5 : $$3) {
               $$4.add(epl.a($$5.cE()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default cia a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<bof> $$4) {
      double $$5 = -1.0;
      cia $$6 = null;

      for (cia $$7 : this.x()) {
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
   default cia a(bof $$0, double $$1) {
      return this.a($$0.do(), $$0.dq(), $$0.du(), $$1, false);
   }

   @Nullable
   default cia a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<bof> $$5 = $$4 ? bok.e : bok.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (cia $$4 : this.x()) {
         if (bok.f.test($$4) && bok.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default cia a(bzn $$0, box $$1) {
      return this.a(this.x(), $$0, $$1, $$1.do(), $$1.dq(), $$1.du());
   }

   @Nullable
   default cia a(bzn $$0, box $$1, double $$2, double $$3, double $$4) {
      return this.a(this.x(), $$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   default cia a(bzn $$0, double $$1, double $$2, double $$3) {
      return this.a(this.x(), $$0, null, $$1, $$2, $$3);
   }

   @Nullable
   default <T extends box> T a(Class<? extends T> $$0, bzn $$1, @Nullable box $$2, double $$3, double $$4, double $$5, eoq $$6) {
      return this.a(this.a($$0, $$6, $$0x -> true), $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   default <T extends box> T a(List<? extends T> $$0, bzn $$1, @Nullable box $$2, double $$3, double $$4, double $$5) {
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

   default List<cia> a(bzn $$0, box $$1, eoq $$2) {
      List<cia> $$3 = Lists.newArrayList();

      for (cia $$4 : this.x()) {
         if ($$2.e($$4.do(), $$4.dq(), $$4.du()) && $$0.a($$1, $$4)) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   default <T extends box> List<T> a(Class<T> $$0, bzn $$1, box $$2, eoq $$3) {
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
   default cia b(UUID $$0) {
      for (int $$1 = 0; $$1 < this.x().size(); $$1++) {
         cia $$2 = this.x().get($$1);
         if ($$0.equals($$2.ct())) {
            return $$2;
         }
      }

      return null;
   }
}
