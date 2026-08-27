import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface cwq {
   List<bow> a(@Nullable bow var1, epm var2, Predicate<? super bow> var3);

   <T extends bow> List<T> a(drb<bow, T> var1, epm var2, Predicate<? super T> var3);

   default <T extends bow> List<T> a(Class<T> $$0, epm $$1, Predicate<? super T> $$2) {
      return this.a(drb.a($$0), $$1, $$2);
   }

   List<? extends cis> x();

   default List<bow> a_(@Nullable bow $$0, epm $$1) {
      return this.a($$0, $$1, bpb.f);
   }

   default boolean a(@Nullable bow $$0, eqk $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (bow $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dH() && $$2.I && ($$0 == null || !$$2.y($$0)) && eqh.c($$1, eqh.a($$2.cH()), epv.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends bow> List<T> a(Class<T> $$0, epm $$1) {
      return this.a($$0, $$1, bpb.f);
   }

   default List<eqk> c(@Nullable bow $$0, epm $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<bow> $$2 = $$0 == null ? bpb.g : bpb.f.and($$0::i);
         List<bow> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<eqk> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (bow $$5 : $$3) {
               $$4.add(eqh.a($$5.cH()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default cis a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<bow> $$4) {
      double $$5 = -1.0;
      cis $$6 = null;

      for (cis $$7 : this.x()) {
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
   default cis a(bow $$0, double $$1) {
      return this.a($$0.dr(), $$0.dt(), $$0.dx(), $$1, false);
   }

   @Nullable
   default cis a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<bow> $$5 = $$4 ? bpb.e : bpb.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (cis $$4 : this.x()) {
         if (bpb.f.test($$4) && bpb.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default cis a(cae $$0, bpo $$1) {
      return this.a(this.x(), $$0, $$1, $$1.dr(), $$1.dt(), $$1.dx());
   }

   @Nullable
   default cis a(cae $$0, bpo $$1, double $$2, double $$3, double $$4) {
      return this.a(this.x(), $$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   default cis a(cae $$0, double $$1, double $$2, double $$3) {
      return this.a(this.x(), $$0, null, $$1, $$2, $$3);
   }

   @Nullable
   default <T extends bpo> T a(Class<? extends T> $$0, cae $$1, @Nullable bpo $$2, double $$3, double $$4, double $$5, epm $$6) {
      return this.a(this.a($$0, $$6, $$0x -> true), $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   default <T extends bpo> T a(List<? extends T> $$0, cae $$1, @Nullable bpo $$2, double $$3, double $$4, double $$5) {
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

   default List<cis> a(cae $$0, bpo $$1, epm $$2) {
      List<cis> $$3 = Lists.newArrayList();

      for (cis $$4 : this.x()) {
         if ($$2.e($$4.dr(), $$4.dt(), $$4.dx()) && $$0.a($$1, $$4)) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   default <T extends bpo> List<T> a(Class<T> $$0, cae $$1, bpo $$2, epm $$3) {
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
   default cis b(UUID $$0) {
      for (int $$1 = 0; $$1 < this.x().size(); $$1++) {
         cis $$2 = this.x().get($$1);
         if ($$0.equals($$2.cw())) {
            return $$2;
         }
      }

      return null;
   }
}
