import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface dka extends diy, djf, dkp, dlc.a {
   @Nullable
   edb a(int var1, int var2, eec var3, boolean var4);

   @Deprecated
   boolean b(int var1, int var2);

   int a(ehd.a var1, int var2, int var3);

   default int b(ehd.a $$0, iv $$1) {
      return this.a($$0, $$1.u(), $$1.w());
   }

   int D_();

   dlc H_();

   default jf<dla> u(iv $$0) {
      return this.H_().a($$0);
   }

   default Stream<ebe> c(ffl $$0) {
      int $$1 = azo.a($$0.a);
      int $$2 = azo.a($$0.d);
      int $$3 = azo.a($$0.b);
      int $$4 = azo.a($$0.e);
      int $$5 = azo.a($$0.c);
      int $$6 = azo.a($$0.f);
      return this.a($$1, $$3, $$5, $$2, $$4, $$6) ? this.a($$0) : Stream.empty();
   }

   @Override
   default int a(iv $$0, djh $$1) {
      return $$1.getColor(this.u($$0).a(), (double)$$0.u(), (double)$$0.w());
   }

   @Override
   default jf<dla> getNoiseBiome(int $$0, int $$1, int $$2) {
      edb $$3 = this.a(jq.e($$0), jq.e($$2), eec.f, false);
      return $$3 != null ? $$3.getNoiseBiome($$0, $$1, $$2) : this.a($$0, $$1, $$2);
   }

   jf<dla> a(int var1, int var2, int var3);

   boolean A_();

   int P();

   efb F_();

   @Override
   default int K_() {
      return this.F_().n();
   }

   @Override
   default int L_() {
      return this.F_().o();
   }

   default iv a(ehd.a $$0, iv $$1) {
      return new iv($$1.u(), this.a($$0, $$1.u(), $$1.w()), $$1.w());
   }

   default boolean v(iv $$0) {
      return this.a_($$0).l();
   }

   default boolean w(iv $$0) {
      if ($$0.v() >= this.P()) {
         return this.h($$0);
      } else {
         iv $$1 = new iv($$0.u(), this.P(), $$0.w());
         if (!this.h($$1)) {
            return false;
         } else {
            for (iv var4 = $$1.e(); var4.v() > $$0.v(); var4 = var4.e()) {
               ebe $$2 = this.a_(var4);
               if ($$2.g() > 0 && !$$2.n()) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   default float x(iv $$0) {
      return this.y($$0) - 0.5F;
   }

   @Deprecated
   default float y(iv $$0) {
      float $$1 = (float)this.B($$0) / 15.0F;
      float $$2 = $$1 / (4.0F - 3.0F * $$1);
      return azo.h(this.F_().s(), $$2, 1.0F);
   }

   default edb z(iv $$0) {
      return this.a(jy.a($$0.u()), jy.a($$0.w()));
   }

   default edb a(int $$0, int $$1) {
      return this.a($$0, $$1, eec.n, true);
   }

   default edb a(int $$0, int $$1, eec $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   @Nullable
   @Override
   default djb c(int $$0, int $$1) {
      return this.a($$0, $$1, eec.c, false);
   }

   default boolean A(iv $$0) {
      return this.b_($$0).a(axj.a);
   }

   default boolean d(ffl $$0) {
      int $$1 = azo.a($$0.a);
      int $$2 = azo.c($$0.d);
      int $$3 = azo.a($$0.b);
      int $$4 = azo.c($$0.e);
      int $$5 = azo.a($$0.c);
      int $$6 = azo.c($$0.f);
      iv.a $$7 = new iv.a();

      for (int $$8 = $$1; $$8 < $$2; $$8++) {
         for (int $$9 = $$3; $$9 < $$4; $$9++) {
            for (int $$10 = $$5; $$10 < $$6; $$10++) {
               ebe $$11 = this.a_($$7.d($$8, $$9, $$10));
               if (!$$11.y().c()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   default int B(iv $$0) {
      return this.c($$0, this.D_());
   }

   default int c(iv $$0, int $$1) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000 ? this.b($$0, $$1) : 15;
   }

   @Deprecated
   default boolean f(int $$0, int $$1) {
      return this.b(jy.a($$0), jy.a($$1));
   }

   @Deprecated
   default boolean C(iv $$0) {
      return this.f($$0.u(), $$0.w());
   }

   @Deprecated
   default boolean a(iv $$0, iv $$1) {
      return this.a($$0.u(), $$0.v(), $$0.w(), $$1.u(), $$1.v(), $$1.w());
   }

   @Deprecated
   default boolean a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      return $$4 >= this.K_() && $$1 <= this.ao() ? this.b($$0, $$2, $$3, $$5) : false;
   }

   @Deprecated
   default boolean b(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = jy.a($$0);
      int $$5 = jy.a($$2);
      int $$6 = jy.a($$1);
      int $$7 = jy.a($$3);

      for (int $$8 = $$4; $$8 <= $$5; $$8++) {
         for (int $$9 = $$6; $$9 <= $$7; $$9++) {
            if (!this.b($$8, $$9)) {
               return false;
            }
         }
      }

      return true;
   }

   jt J_();

   cvh K();

   default <T> jh<T> a(alh<? extends js<? extends T>> $$0) {
      js<T> $$1 = this.J_().f($$0);
      return $$1.a(this.K());
   }
}
