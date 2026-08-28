import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface dcx extends dbx, dce, ddk, ddw.a {
   @Nullable
   duw a(int var1, int var2, dvx var3, boolean var4);

   @Deprecated
   boolean b(int var1, int var2);

   int a(dyv.a var1, int var2, int var3);

   int B_();

   ddw F_();

   default jm<ddu> t(jd $$0) {
      return this.F_().a($$0);
   }

   default Stream<dta> c(ewr $$0) {
      int $$1 = ayn.a($$0.a);
      int $$2 = ayn.a($$0.d);
      int $$3 = ayn.a($$0.b);
      int $$4 = ayn.a($$0.e);
      int $$5 = ayn.a($$0.c);
      int $$6 = ayn.a($$0.f);
      return this.a($$1, $$3, $$5, $$2, $$4, $$6) ? this.a($$0) : Stream.empty();
   }

   @Override
   default int a(jd $$0, dcf $$1) {
      return $$1.getColor(this.t($$0).a(), (double)$$0.u(), (double)$$0.w());
   }

   @Override
   default jm<ddu> getNoiseBiome(int $$0, int $$1, int $$2) {
      duw $$3 = this.a(jx.e($$0), jx.e($$2), dvx.f, false);
      return $$3 != null ? $$3.getNoiseBiome($$0, $$1, $$2) : this.a($$0, $$1, $$2);
   }

   jm<ddu> a(int var1, int var2, int var3);

   boolean x_();

   @Deprecated
   int z_();

   dwv D_();

   @Override
   default int I_() {
      return this.D_().n();
   }

   @Override
   default int J_() {
      return this.D_().o();
   }

   default jd a(dyv.a $$0, jd $$1) {
      return new jd($$1.u(), this.a($$0, $$1.u(), $$1.w()), $$1.w());
   }

   default boolean u(jd $$0) {
      return this.a_($$0).i();
   }

   default boolean v(jd $$0) {
      if ($$0.v() >= this.z_()) {
         return this.h($$0);
      } else {
         jd $$1 = new jd($$0.u(), this.z_(), $$0.w());
         if (!this.h($$1)) {
            return false;
         } else {
            for (jd var4 = $$1.d(); var4.v() > $$0.v(); var4 = var4.d()) {
               dta $$2 = this.a_(var4);
               if ($$2.b(this, var4) > 0 && !$$2.k()) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   default float w(jd $$0) {
      return this.x($$0) - 0.5F;
   }

   @Deprecated
   default float x(jd $$0) {
      float $$1 = (float)this.A($$0) / 15.0F;
      float $$2 = $$1 / (4.0F - 3.0F * $$1);
      return ayn.i(this.D_().s(), $$2, 1.0F);
   }

   default duw y(jd $$0) {
      return this.a(kf.a($$0.u()), kf.a($$0.w()));
   }

   default duw a(int $$0, int $$1) {
      return this.a($$0, $$1, dvx.n, true);
   }

   default duw a(int $$0, int $$1, dvx $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   @Nullable
   @Override
   default dca c(int $$0, int $$1) {
      return this.a($$0, $$1, dvx.c, false);
   }

   default boolean z(jd $$0) {
      return this.b_($$0).a(awj.a);
   }

   default boolean d(ewr $$0) {
      int $$1 = ayn.a($$0.a);
      int $$2 = ayn.c($$0.d);
      int $$3 = ayn.a($$0.b);
      int $$4 = ayn.c($$0.e);
      int $$5 = ayn.a($$0.c);
      int $$6 = ayn.c($$0.f);
      jd.a $$7 = new jd.a();

      for (int $$8 = $$1; $$8 < $$2; $$8++) {
         for (int $$9 = $$3; $$9 < $$4; $$9++) {
            for (int $$10 = $$5; $$10 < $$6; $$10++) {
               dta $$11 = this.a_($$7.d($$8, $$9, $$10));
               if (!$$11.u().c()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   default int A(jd $$0) {
      return this.c($$0, this.B_());
   }

   default int c(jd $$0, int $$1) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000 ? this.b($$0, $$1) : 15;
   }

   @Deprecated
   default boolean f(int $$0, int $$1) {
      return this.b(kf.a($$0), kf.a($$1));
   }

   @Deprecated
   default boolean B(jd $$0) {
      return this.f($$0.u(), $$0.w());
   }

   @Deprecated
   default boolean a(jd $$0, jd $$1) {
      return this.a($$0.u(), $$0.v(), $$0.w(), $$1.u(), $$1.v(), $$1.w());
   }

   @Deprecated
   default boolean a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      return $$4 >= this.I_() && $$1 < this.am() ? this.b($$0, $$2, $$3, $$5) : false;
   }

   @Deprecated
   default boolean b(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = kf.a($$0);
      int $$5 = kf.a($$2);
      int $$6 = kf.a($$1);
      int $$7 = kf.a($$3);

      for (int $$8 = $$4; $$8 <= $$5; $$8++) {
         for (int $$9 = $$6; $$9 <= $$7; $$9++) {
            if (!this.b($$8, $$9)) {
               return false;
            }
         }
      }

      return true;
   }

   ka H_();

   cpj J();

   default <T> jo<T> a(akp<? extends jz<? extends T>> $$0) {
      jz<T> $$1 = this.H_().d($$0);
      return $$1.q().a(this.J());
   }
}
