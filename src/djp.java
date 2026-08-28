import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface djp extends din, diu, dke, dkr.a {
   @Nullable
   ecq a(int var1, int var2, edr var3, boolean var4);

   @Deprecated
   boolean b(int var1, int var2);

   int a(egs.a var1, int var2, int var3);

   default int b(egs.a $$0, iv $$1) {
      return this.a($$0, $$1.u(), $$1.w());
   }

   int z_();

   dkr D_();

   default jf<dkp> u(iv $$0) {
      return this.D_().a($$0);
   }

   default Stream<eat> c(fex $$0) {
      int $$1 = azm.a($$0.a);
      int $$2 = azm.a($$0.d);
      int $$3 = azm.a($$0.b);
      int $$4 = azm.a($$0.e);
      int $$5 = azm.a($$0.c);
      int $$6 = azm.a($$0.f);
      return this.a($$1, $$3, $$5, $$2, $$4, $$6) ? this.a($$0) : Stream.empty();
   }

   @Override
   default int a(iv $$0, diw $$1) {
      return $$1.getColor(this.u($$0).a(), (double)$$0.u(), (double)$$0.w());
   }

   @Override
   default jf<dkp> getNoiseBiome(int $$0, int $$1, int $$2) {
      ecq $$3 = this.a(jq.e($$0), jq.e($$2), edr.f, false);
      return $$3 != null ? $$3.getNoiseBiome($$0, $$1, $$2) : this.a($$0, $$1, $$2);
   }

   jf<dkp> a(int var1, int var2, int var3);

   boolean w_();

   int P();

   eeq B_();

   @Override
   default int G_() {
      return this.B_().n();
   }

   @Override
   default int H_() {
      return this.B_().o();
   }

   default iv a(egs.a $$0, iv $$1) {
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
               eat $$2 = this.a_(var4);
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
      return azm.h(this.B_().s(), $$2, 1.0F);
   }

   default ecq z(iv $$0) {
      return this.a(jy.a($$0.u()), jy.a($$0.w()));
   }

   default ecq a(int $$0, int $$1) {
      return this.a($$0, $$1, edr.n, true);
   }

   default ecq a(int $$0, int $$1, edr $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   @Nullable
   @Override
   default diq c(int $$0, int $$1) {
      return this.a($$0, $$1, edr.c, false);
   }

   default boolean A(iv $$0) {
      return this.b_($$0).a(axh.a);
   }

   default boolean d(fex $$0) {
      int $$1 = azm.a($$0.a);
      int $$2 = azm.c($$0.d);
      int $$3 = azm.a($$0.b);
      int $$4 = azm.c($$0.e);
      int $$5 = azm.a($$0.c);
      int $$6 = azm.c($$0.f);
      iv.a $$7 = new iv.a();

      for (int $$8 = $$1; $$8 < $$2; $$8++) {
         for (int $$9 = $$3; $$9 < $$4; $$9++) {
            for (int $$10 = $$5; $$10 < $$6; $$10++) {
               eat $$11 = this.a_($$7.d($$8, $$9, $$10));
               if (!$$11.y().c()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   default int B(iv $$0) {
      return this.c($$0, this.z_());
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
      return $$4 >= this.G_() && $$1 <= this.ao() ? this.b($$0, $$2, $$3, $$5) : false;
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

   jt F_();

   cuw K();

   default <T> jh<T> a(alf<? extends js<? extends T>> $$0) {
      js<T> $$1 = this.F_().f($$0);
      return $$1.a(this.K());
   }
}
