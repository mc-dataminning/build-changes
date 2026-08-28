import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface dkc extends dja, djh, dkr, dle.a {
   @Nullable
   edd a(int var1, int var2, eee var3, boolean var4);

   @Deprecated
   boolean b(int var1, int var2);

   int a(ehf.a var1, int var2, int var3);

   default int b(ehf.a $$0, iw $$1) {
      return this.a($$0, $$1.u(), $$1.w());
   }

   int D_();

   dle H_();

   default jg<dlc> u(iw $$0) {
      return this.H_().a($$0);
   }

   default Stream<ebg> c(ffn $$0) {
      int $$1 = azq.a($$0.a);
      int $$2 = azq.a($$0.d);
      int $$3 = azq.a($$0.b);
      int $$4 = azq.a($$0.e);
      int $$5 = azq.a($$0.c);
      int $$6 = azq.a($$0.f);
      return this.a($$1, $$3, $$5, $$2, $$4, $$6) ? this.a($$0) : Stream.empty();
   }

   @Override
   default int a(iw $$0, djj $$1) {
      return $$1.getColor(this.u($$0).a(), (double)$$0.u(), (double)$$0.w());
   }

   @Override
   default jg<dlc> getNoiseBiome(int $$0, int $$1, int $$2) {
      edd $$3 = this.a(jr.e($$0), jr.e($$2), eee.f, false);
      return $$3 != null ? $$3.getNoiseBiome($$0, $$1, $$2) : this.a($$0, $$1, $$2);
   }

   jg<dlc> a(int var1, int var2, int var3);

   boolean A_();

   int P();

   efd F_();

   @Override
   default int K_() {
      return this.F_().n();
   }

   @Override
   default int L_() {
      return this.F_().o();
   }

   default iw a(ehf.a $$0, iw $$1) {
      return new iw($$1.u(), this.a($$0, $$1.u(), $$1.w()), $$1.w());
   }

   default boolean v(iw $$0) {
      return this.a_($$0).l();
   }

   default boolean w(iw $$0) {
      if ($$0.v() >= this.P()) {
         return this.h($$0);
      } else {
         iw $$1 = new iw($$0.u(), this.P(), $$0.w());
         if (!this.h($$1)) {
            return false;
         } else {
            for (iw var4 = $$1.e(); var4.v() > $$0.v(); var4 = var4.e()) {
               ebg $$2 = this.a_(var4);
               if ($$2.g() > 0 && !$$2.n()) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   default float x(iw $$0) {
      return this.y($$0) - 0.5F;
   }

   @Deprecated
   default float y(iw $$0) {
      float $$1 = (float)this.B($$0) / 15.0F;
      float $$2 = $$1 / (4.0F - 3.0F * $$1);
      return azq.h(this.F_().s(), $$2, 1.0F);
   }

   default edd z(iw $$0) {
      return this.a(jz.a($$0.u()), jz.a($$0.w()));
   }

   default edd a(int $$0, int $$1) {
      return this.a($$0, $$1, eee.n, true);
   }

   default edd a(int $$0, int $$1, eee $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   @Nullable
   @Override
   default djd c(int $$0, int $$1) {
      return this.a($$0, $$1, eee.c, false);
   }

   default boolean A(iw $$0) {
      return this.b_($$0).a(axl.a);
   }

   default boolean d(ffn $$0) {
      int $$1 = azq.a($$0.a);
      int $$2 = azq.c($$0.d);
      int $$3 = azq.a($$0.b);
      int $$4 = azq.c($$0.e);
      int $$5 = azq.a($$0.c);
      int $$6 = azq.c($$0.f);
      iw.a $$7 = new iw.a();

      for (int $$8 = $$1; $$8 < $$2; $$8++) {
         for (int $$9 = $$3; $$9 < $$4; $$9++) {
            for (int $$10 = $$5; $$10 < $$6; $$10++) {
               ebg $$11 = this.a_($$7.d($$8, $$9, $$10));
               if (!$$11.y().c()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   default int B(iw $$0) {
      return this.c($$0, this.D_());
   }

   default int c(iw $$0, int $$1) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000 ? this.b($$0, $$1) : 15;
   }

   @Deprecated
   default boolean f(int $$0, int $$1) {
      return this.b(jz.a($$0), jz.a($$1));
   }

   @Deprecated
   default boolean C(iw $$0) {
      return this.f($$0.u(), $$0.w());
   }

   @Deprecated
   default boolean a(iw $$0, iw $$1) {
      return this.a($$0.u(), $$0.v(), $$0.w(), $$1.u(), $$1.v(), $$1.w());
   }

   @Deprecated
   default boolean a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      return $$4 >= this.K_() && $$1 <= this.ao() ? this.b($$0, $$2, $$3, $$5) : false;
   }

   @Deprecated
   default boolean b(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = jz.a($$0);
      int $$5 = jz.a($$2);
      int $$6 = jz.a($$1);
      int $$7 = jz.a($$3);

      for (int $$8 = $$4; $$8 <= $$5; $$8++) {
         for (int $$9 = $$6; $$9 <= $$7; $$9++) {
            if (!this.b($$8, $$9)) {
               return false;
            }
         }
      }

      return true;
   }

   ju J_();

   cvj K();

   default <T> ji<T> a(alj<? extends jt<? extends T>> $$0) {
      jt<T> $$1 = this.J_().f($$0);
      return $$1.a(this.K());
   }
}
