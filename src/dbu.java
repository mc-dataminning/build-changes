import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface dbu {
   List<bsd> a(@Nullable bsd var1, evu var2, Predicate<? super bsd> var3);

   <T extends bsd> List<T> a(dwo<bsd, T> var1, evu var2, Predicate<? super T> var3);

   default <T extends bsd> List<T> a(Class<T> $$0, evu $$1, Predicate<? super T> $$2) {
      return this.a(dwo.a($$0), $$1, $$2);
   }

   List<? extends cmh> x();

   default List<bsd> a_(@Nullable bsd $$0, evu $$1) {
      return this.a($$0, $$1, bsi.f);
   }

   default boolean a(@Nullable bsd $$0, ews $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (bsd $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dK() && $$2.J && ($$0 == null || !$$2.y($$0)) && ewp.c($$1, ewp.a($$2.cK()), ewd.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends bsd> List<T> a(Class<T> $$0, evu $$1) {
      return this.a($$0, $$1, bsi.f);
   }

   default List<ews> c(@Nullable bsd $$0, evu $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<bsd> $$2 = $$0 == null ? bsi.g : bsi.f.and($$0::i);
         List<bsd> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<ews> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (bsd $$5 : $$3) {
               $$4.add(ewp.a($$5.cK()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default cmh a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<bsd> $$4) {
      double $$5 = -1.0;
      cmh $$6 = null;

      for (cmh $$7 : this.x()) {
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
   default cmh a(bsd $$0, double $$1) {
      return this.a($$0.du(), $$0.dw(), $$0.dA(), $$1, false);
   }

   @Nullable
   default cmh a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<bsd> $$5 = $$4 ? bsi.e : bsi.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (cmh $$4 : this.x()) {
         if (bsi.f.test($$4) && bsi.b.test($$4)) {
            double $$5 = $$4.i($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default cmh a(cdp $$0, bsy $$1) {
      return this.a(this.x(), $$0, $$1, $$1.du(), $$1.dw(), $$1.dA());
   }

   @Nullable
   default cmh a(cdp $$0, bsy $$1, double $$2, double $$3, double $$4) {
      return this.a(this.x(), $$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   default cmh a(cdp $$0, double $$1, double $$2, double $$3) {
      return this.a(this.x(), $$0, null, $$1, $$2, $$3);
   }

   @Nullable
   default <T extends bsy> T a(Class<? extends T> $$0, cdp $$1, @Nullable bsy $$2, double $$3, double $$4, double $$5, evu $$6) {
      return this.a(this.a($$0, $$6, $$0x -> true), $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   default <T extends bsy> T a(List<? extends T> $$0, cdp $$1, @Nullable bsy $$2, double $$3, double $$4, double $$5) {
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

   default List<cmh> a(cdp $$0, bsy $$1, evu $$2) {
      List<cmh> $$3 = Lists.newArrayList();

      for (cmh $$4 : this.x()) {
         if ($$2.e($$4.du(), $$4.dw(), $$4.dA()) && $$0.a($$1, $$4)) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   default <T extends bsy> List<T> a(Class<T> $$0, cdp $$1, bsy $$2, evu $$3) {
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
   default cmh b(UUID $$0) {
      for (int $$1 = 0; $$1 < this.x().size(); $$1++) {
         cmh $$2 = this.x().get($$1);
         if ($$0.equals($$2.cz())) {
            return $$2;
         }
      }

      return null;
   }
}
