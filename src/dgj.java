import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface dgj extends dfi, dfp, dgy, dhk.a {
   @Nullable
   dyq a(int var1, int var2, dzr var3, boolean var4);

   @Deprecated
   boolean b(int var1, int var2);

   int a(ecq.a var1, int var2, int var3);

   int E_();

   dhk I_();

   default jr<dhi> t(ji $$0) {
      return this.I_().a($$0);
   }

   default Stream<dwv> c(fat $$0) {
      int $$1 = ayy.a($$0.a);
      int $$2 = ayy.a($$0.d);
      int $$3 = ayy.a($$0.b);
      int $$4 = ayy.a($$0.e);
      int $$5 = ayy.a($$0.c);
      int $$6 = ayy.a($$0.f);
      return this.a($$1, $$3, $$5, $$2, $$4, $$6) ? this.a($$0) : Stream.empty();
   }

   @Override
   default int a(ji $$0, dfq $$1) {
      return $$1.getColor(this.t($$0).a(), (double)$$0.u(), (double)$$0.w());
   }

   @Override
   default jr<dhi> getNoiseBiome(int $$0, int $$1, int $$2) {
      dyq $$3 = this.a(kc.e($$0), kc.e($$2), dzr.f, false);
      return $$3 != null ? $$3.getNoiseBiome($$0, $$1, $$2) : this.a($$0, $$1, $$2);
   }

   jr<dhi> a(int var1, int var2, int var3);

   boolean B_();

   int P();

   eaq G_();

   @Override
   default int L_() {
      return this.G_().n();
   }

   @Override
   default int M_() {
      return this.G_().o();
   }

   default ji a(ecq.a $$0, ji $$1) {
      return new ji($$1.u(), this.a($$0, $$1.u(), $$1.w()), $$1.w());
   }

   default boolean u(ji $$0) {
      return this.a_($$0).l();
   }

   default boolean v(ji $$0) {
      if ($$0.v() >= this.P()) {
         return this.h($$0);
      } else {
         ji $$1 = new ji($$0.u(), this.P(), $$0.w());
         if (!this.h($$1)) {
            return false;
         } else {
            for (ji var4 = $$1.e(); var4.v() > $$0.v(); var4 = var4.e()) {
               dwv $$2 = this.a_(var4);
               if ($$2.g() > 0 && !$$2.n()) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   default float w(ji $$0) {
      return this.x($$0) - 0.5F;
   }

   @Deprecated
   default float x(ji $$0) {
      float $$1 = (float)this.A($$0) / 15.0F;
      float $$2 = $$1 / (4.0F - 3.0F * $$1);
      return ayy.h(this.G_().s(), $$2, 1.0F);
   }

   default dyq y(ji $$0) {
      return this.a(kk.a($$0.u()), kk.a($$0.w()));
   }

   default dyq a(int $$0, int $$1) {
      return this.a($$0, $$1, dzr.n, true);
   }

   default dyq a(int $$0, int $$1, dzr $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   @Nullable
   @Override
   default dfl c(int $$0, int $$1) {
      return this.a($$0, $$1, dzr.c, false);
   }

   default boolean z(ji $$0) {
      return this.b_($$0).a(awu.a);
   }

   default boolean d(fat $$0) {
      int $$1 = ayy.a($$0.a);
      int $$2 = ayy.c($$0.d);
      int $$3 = ayy.a($$0.b);
      int $$4 = ayy.c($$0.e);
      int $$5 = ayy.a($$0.c);
      int $$6 = ayy.c($$0.f);
      ji.a $$7 = new ji.a();

      for (int $$8 = $$1; $$8 < $$2; $$8++) {
         for (int $$9 = $$3; $$9 < $$4; $$9++) {
            for (int $$10 = $$5; $$10 < $$6; $$10++) {
               dwv $$11 = this.a_($$7.d($$8, $$9, $$10));
               if (!$$11.y().c()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   default int A(ji $$0) {
      return this.c($$0, this.E_());
   }

   default int c(ji $$0, int $$1) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000 ? this.b($$0, $$1) : 15;
   }

   @Deprecated
   default boolean f(int $$0, int $$1) {
      return this.b(kk.a($$0), kk.a($$1));
   }

   @Deprecated
   default boolean B(ji $$0) {
      return this.f($$0.u(), $$0.w());
   }

   @Deprecated
   default boolean a(ji $$0, ji $$1) {
      return this.a($$0.u(), $$0.v(), $$0.w(), $$1.u(), $$1.v(), $$1.w());
   }

   @Deprecated
   default boolean a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      return $$4 >= this.L_() && $$1 <= this.an() ? this.b($$0, $$2, $$3, $$5) : false;
   }

   @Deprecated
   default boolean b(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = kk.a($$0);
      int $$5 = kk.a($$2);
      int $$6 = kk.a($$1);
      int $$7 = kk.a($$3);

      for (int $$8 = $$4; $$8 <= $$5; $$8++) {
         for (int $$9 = $$6; $$9 <= $$7; $$9++) {
            if (!this.b($$8, $$9)) {
               return false;
            }
         }
      }

      return true;
   }

   kf K_();

   crr K();

   default <T> jt<T> a(akt<? extends ke<? extends T>> $$0) {
      ke<T> $$1 = this.K_().e($$0);
      return $$1.a(this.K());
   }
}
