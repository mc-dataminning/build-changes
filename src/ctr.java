import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface ctr extends csr, csy, cue, cup.a {
   @Nullable
   dlc a(int var1, int var2, dlh var3, boolean var4);

   @Deprecated
   boolean b(int var1, int var2);

   int a(dop.a var1, int var2, int var3);

   int C_();

   cup G_();

   default ih<cun> t(hx $$0) {
      return this.G_().a($$0);
   }

   default Stream<djg> c(eln $$0) {
      int $$1 = aun.a($$0.a);
      int $$2 = aun.a($$0.d);
      int $$3 = aun.a($$0.b);
      int $$4 = aun.a($$0.e);
      int $$5 = aun.a($$0.c);
      int $$6 = aun.a($$0.f);
      return this.a($$1, $$3, $$5, $$2, $$4, $$6) ? this.a($$0) : Stream.empty();
   }

   @Override
   default int a(hx $$0, csz $$1) {
      return $$1.getColor(this.t($$0).a(), (double)$$0.u(), (double)$$0.w());
   }

   @Override
   default ih<cun> getNoiseBiome(int $$0, int $$1, int $$2) {
      dlc $$3 = this.a(is.e($$0), is.e($$2), dlh.f, false);
      return $$3 != null ? $$3.getNoiseBiome($$0, $$1, $$2) : this.a($$0, $$1, $$2);
   }

   ih<cun> a(int var1, int var2, int var3);

   boolean y_();

   @Deprecated
   int A_();

   dmp E_();

   @Override
   default int J_() {
      return this.E_().n();
   }

   @Override
   default int K_() {
      return this.E_().o();
   }

   default hx a(dop.a $$0, hx $$1) {
      return new hx($$1.u(), this.a($$0, $$1.u(), $$1.w()), $$1.w());
   }

   default boolean u(hx $$0) {
      return this.a_($$0).i();
   }

   default boolean v(hx $$0) {
      if ($$0.v() >= this.A_()) {
         return this.h($$0);
      } else {
         hx $$1 = new hx($$0.u(), this.A_(), $$0.w());
         if (!this.h($$1)) {
            return false;
         } else {
            for (hx var4 = $$1.d(); var4.v() > $$0.v(); var4 = var4.d()) {
               djg $$2 = this.a_(var4);
               if ($$2.b(this, var4) > 0 && !$$2.k()) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   default float w(hx $$0) {
      return this.x($$0) - 0.5F;
   }

   @Deprecated
   default float x(hx $$0) {
      float $$1 = (float)this.A($$0) / 15.0F;
      float $$2 = $$1 / (4.0F - 3.0F * $$1);
      return aun.i(this.E_().s(), $$2, 1.0F);
   }

   default dlc y(hx $$0) {
      return this.a(iz.a($$0.u()), iz.a($$0.w()));
   }

   default dlc a(int $$0, int $$1) {
      return this.a($$0, $$1, dlh.n, true);
   }

   default dlc a(int $$0, int $$1, dlh $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   @Nullable
   @Override
   default csu c(int $$0, int $$1) {
      return this.a($$0, $$1, dlh.c, false);
   }

   default boolean z(hx $$0) {
      return this.b_($$0).a(asl.a);
   }

   default boolean d(eln $$0) {
      int $$1 = aun.a($$0.a);
      int $$2 = aun.c($$0.d);
      int $$3 = aun.a($$0.b);
      int $$4 = aun.c($$0.e);
      int $$5 = aun.a($$0.c);
      int $$6 = aun.c($$0.f);
      hx.a $$7 = new hx.a();

      for (int $$8 = $$1; $$8 < $$2; $$8++) {
         for (int $$9 = $$3; $$9 < $$4; $$9++) {
            for (int $$10 = $$5; $$10 < $$6; $$10++) {
               djg $$11 = this.a_($$7.d($$8, $$9, $$10));
               if (!$$11.u().c()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   default int A(hx $$0) {
      return this.c($$0, this.C_());
   }

   default int c(hx $$0, int $$1) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000 ? this.b($$0, $$1) : 15;
   }

   @Deprecated
   default boolean f(int $$0, int $$1) {
      return this.b(iz.a($$0), iz.a($$1));
   }

   @Deprecated
   default boolean B(hx $$0) {
      return this.f($$0.u(), $$0.w());
   }

   @Deprecated
   default boolean a(hx $$0, hx $$1) {
      return this.a($$0.u(), $$0.v(), $$0.w(), $$1.u(), $$1.v(), $$1.w());
   }

   @Deprecated
   default boolean a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      return $$4 >= this.J_() && $$1 < this.al() ? this.b($$0, $$2, $$3, $$5) : false;
   }

   @Deprecated
   default boolean b(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = iz.a($$0);
      int $$5 = iz.a($$2);
      int $$6 = iz.a($$1);
      int $$7 = iz.a($$3);

      for (int $$8 = $$4; $$8 <= $$5; $$8++) {
         for (int $$9 = $$6; $$9 <= $$7; $$9++) {
            if (!this.b($$8, $$9)) {
               return false;
            }
         }
      }

      return true;
   }

   iu I_();

   chr I();

   default <T> ij<T> a(ahf<? extends it<? extends T>> $$0) {
      it<T> $$1 = this.I_().d($$0);
      return $$1.p().a(this.I());
   }
}
