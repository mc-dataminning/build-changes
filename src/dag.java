import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface dag extends czg, czn, dat, dbe.a {
   @Nullable
   dsd a(int var1, int var2, dtc var3, boolean var4);

   @Deprecated
   boolean b(int var1, int var2);

   int a(dvz.a var1, int var2, int var3);

   int B_();

   dbe F_();

   default iw<dbc> t(in $$0) {
      return this.F_().a($$0);
   }

   default Stream<dqh> c(etk $$0) {
      int $$1 = axz.a($$0.a);
      int $$2 = axz.a($$0.d);
      int $$3 = axz.a($$0.b);
      int $$4 = axz.a($$0.e);
      int $$5 = axz.a($$0.c);
      int $$6 = axz.a($$0.f);
      return this.a($$1, $$3, $$5, $$2, $$4, $$6) ? this.a($$0) : Stream.empty();
   }

   @Override
   default int a(in $$0, czo $$1) {
      return $$1.getColor(this.t($$0).a(), (double)$$0.u(), (double)$$0.w());
   }

   @Override
   default iw<dbc> getNoiseBiome(int $$0, int $$1, int $$2) {
      dsd $$3 = this.a(jh.e($$0), jh.e($$2), dtc.f, false);
      return $$3 != null ? $$3.getNoiseBiome($$0, $$1, $$2) : this.a($$0, $$1, $$2);
   }

   iw<dbc> a(int var1, int var2, int var3);

   boolean x_();

   @Deprecated
   int z_();

   dtz D_();

   @Override
   default int I_() {
      return this.D_().n();
   }

   @Override
   default int J_() {
      return this.D_().o();
   }

   default in a(dvz.a $$0, in $$1) {
      return new in($$1.u(), this.a($$0, $$1.u(), $$1.w()), $$1.w());
   }

   default boolean u(in $$0) {
      return this.a_($$0).i();
   }

   default boolean v(in $$0) {
      if ($$0.v() >= this.z_()) {
         return this.h($$0);
      } else {
         in $$1 = new in($$0.u(), this.z_(), $$0.w());
         if (!this.h($$1)) {
            return false;
         } else {
            for (in var4 = $$1.d(); var4.v() > $$0.v(); var4 = var4.d()) {
               dqh $$2 = this.a_(var4);
               if ($$2.b(this, var4) > 0 && !$$2.k()) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   default float w(in $$0) {
      return this.x($$0) - 0.5F;
   }

   @Deprecated
   default float x(in $$0) {
      float $$1 = (float)this.A($$0) / 15.0F;
      float $$2 = $$1 / (4.0F - 3.0F * $$1);
      return axz.i(this.D_().s(), $$2, 1.0F);
   }

   default dsd y(in $$0) {
      return this.a(jp.a($$0.u()), jp.a($$0.w()));
   }

   default dsd a(int $$0, int $$1) {
      return this.a($$0, $$1, dtc.n, true);
   }

   default dsd a(int $$0, int $$1, dtc $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   @Nullable
   @Override
   default czj c(int $$0, int $$1) {
      return this.a($$0, $$1, dtc.c, false);
   }

   default boolean z(in $$0) {
      return this.b_($$0).a(avw.a);
   }

   default boolean d(etk $$0) {
      int $$1 = axz.a($$0.a);
      int $$2 = axz.c($$0.d);
      int $$3 = axz.a($$0.b);
      int $$4 = axz.c($$0.e);
      int $$5 = axz.a($$0.c);
      int $$6 = axz.c($$0.f);
      in.a $$7 = new in.a();

      for (int $$8 = $$1; $$8 < $$2; $$8++) {
         for (int $$9 = $$3; $$9 < $$4; $$9++) {
            for (int $$10 = $$5; $$10 < $$6; $$10++) {
               dqh $$11 = this.a_($$7.d($$8, $$9, $$10));
               if (!$$11.u().c()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   default int A(in $$0) {
      return this.c($$0, this.B_());
   }

   default int c(in $$0, int $$1) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000 ? this.b($$0, $$1) : 15;
   }

   @Deprecated
   default boolean f(int $$0, int $$1) {
      return this.b(jp.a($$0), jp.a($$1));
   }

   @Deprecated
   default boolean B(in $$0) {
      return this.f($$0.u(), $$0.w());
   }

   @Deprecated
   default boolean a(in $$0, in $$1) {
      return this.a($$0.u(), $$0.v(), $$0.w(), $$1.u(), $$1.v(), $$1.w());
   }

   @Deprecated
   default boolean a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      return $$4 >= this.I_() && $$1 < this.al() ? this.b($$0, $$2, $$3, $$5) : false;
   }

   @Deprecated
   default boolean b(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = jp.a($$0);
      int $$5 = jp.a($$2);
      int $$6 = jp.a($$1);
      int $$7 = jp.a($$3);

      for (int $$8 = $$4; $$8 <= $$5; $$8++) {
         for (int $$9 = $$6; $$9 <= $$7; $$9++) {
            if (!this.b($$8, $$9)) {
               return false;
            }
         }
      }

      return true;
   }

   jk H_();

   cnu J();

   default <T> iy<T> a(akg<? extends jj<? extends T>> $$0) {
      jj<T> $$1 = this.H_().d($$0);
      return $$1.p().a(this.J());
   }
}
