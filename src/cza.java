import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface cza extends cya, cyh, czn, czy.a {
   @Nullable
   dqv a(int var1, int var2, dru var3, boolean var4);

   @Deprecated
   boolean b(int var1, int var2);

   int a(dur.a var1, int var2, int var3);

   int B_();

   czy F_();

   default il<czw> t(ib $$0) {
      return this.F_().a($$0);
   }

   default Stream<doz> c(erv $$0) {
      int $$1 = axk.a($$0.a);
      int $$2 = axk.a($$0.d);
      int $$3 = axk.a($$0.b);
      int $$4 = axk.a($$0.e);
      int $$5 = axk.a($$0.c);
      int $$6 = axk.a($$0.f);
      return this.a($$1, $$3, $$5, $$2, $$4, $$6) ? this.a($$0) : Stream.empty();
   }

   @Override
   default int a(ib $$0, cyi $$1) {
      return $$1.getColor(this.t($$0).a(), (double)$$0.u(), (double)$$0.w());
   }

   @Override
   default il<czw> getNoiseBiome(int $$0, int $$1, int $$2) {
      dqv $$3 = this.a(iw.e($$0), iw.e($$2), dru.f, false);
      return $$3 != null ? $$3.getNoiseBiome($$0, $$1, $$2) : this.a($$0, $$1, $$2);
   }

   il<czw> a(int var1, int var2, int var3);

   boolean x_();

   @Deprecated
   int z_();

   dsr D_();

   @Override
   default int I_() {
      return this.D_().n();
   }

   @Override
   default int J_() {
      return this.D_().o();
   }

   default ib a(dur.a $$0, ib $$1) {
      return new ib($$1.u(), this.a($$0, $$1.u(), $$1.w()), $$1.w());
   }

   default boolean u(ib $$0) {
      return this.a_($$0).i();
   }

   default boolean v(ib $$0) {
      if ($$0.v() >= this.z_()) {
         return this.h($$0);
      } else {
         ib $$1 = new ib($$0.u(), this.z_(), $$0.w());
         if (!this.h($$1)) {
            return false;
         } else {
            for (ib var4 = $$1.d(); var4.v() > $$0.v(); var4 = var4.d()) {
               doz $$2 = this.a_(var4);
               if ($$2.b(this, var4) > 0 && !$$2.k()) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   default float w(ib $$0) {
      return this.x($$0) - 0.5F;
   }

   @Deprecated
   default float x(ib $$0) {
      float $$1 = (float)this.A($$0) / 15.0F;
      float $$2 = $$1 / (4.0F - 3.0F * $$1);
      return axk.i(this.D_().s(), $$2, 1.0F);
   }

   default dqv y(ib $$0) {
      return this.a(je.a($$0.u()), je.a($$0.w()));
   }

   default dqv a(int $$0, int $$1) {
      return this.a($$0, $$1, dru.n, true);
   }

   default dqv a(int $$0, int $$1, dru $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   @Nullable
   @Override
   default cyd c(int $$0, int $$1) {
      return this.a($$0, $$1, dru.c, false);
   }

   default boolean z(ib $$0) {
      return this.b_($$0).a(avh.a);
   }

   default boolean d(erv $$0) {
      int $$1 = axk.a($$0.a);
      int $$2 = axk.c($$0.d);
      int $$3 = axk.a($$0.b);
      int $$4 = axk.c($$0.e);
      int $$5 = axk.a($$0.c);
      int $$6 = axk.c($$0.f);
      ib.a $$7 = new ib.a();

      for (int $$8 = $$1; $$8 < $$2; $$8++) {
         for (int $$9 = $$3; $$9 < $$4; $$9++) {
            for (int $$10 = $$5; $$10 < $$6; $$10++) {
               doz $$11 = this.a_($$7.d($$8, $$9, $$10));
               if (!$$11.u().c()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   default int A(ib $$0) {
      return this.c($$0, this.B_());
   }

   default int c(ib $$0, int $$1) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000 ? this.b($$0, $$1) : 15;
   }

   @Deprecated
   default boolean f(int $$0, int $$1) {
      return this.b(je.a($$0), je.a($$1));
   }

   @Deprecated
   default boolean B(ib $$0) {
      return this.f($$0.u(), $$0.w());
   }

   @Deprecated
   default boolean a(ib $$0, ib $$1) {
      return this.a($$0.u(), $$0.v(), $$0.w(), $$1.u(), $$1.v(), $$1.w());
   }

   @Deprecated
   default boolean a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      return $$4 >= this.I_() && $$1 < this.al() ? this.b($$0, $$2, $$3, $$5) : false;
   }

   @Deprecated
   default boolean b(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = je.a($$0);
      int $$5 = je.a($$2);
      int $$6 = je.a($$1);
      int $$7 = je.a($$3);

      for (int $$8 = $$4; $$8 <= $$5; $$8++) {
         for (int $$9 = $$6; $$9 <= $$7; $$9++) {
            if (!this.b($$8, $$9)) {
               return false;
            }
         }
      }

      return true;
   }

   iz H_();

   cmg J();

   default <T> in<T> a(ajs<? extends iy<? extends T>> $$0) {
      iy<T> $$1 = this.H_().d($$0);
      return $$1.p().a(this.J());
   }
}
