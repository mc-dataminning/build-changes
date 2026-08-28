import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface dcz extends dbz, dcg, ddm, ddy.a {
   @Nullable
   duy a(int var1, int var2, dvz var3, boolean var4);

   @Deprecated
   boolean b(int var1, int var2);

   int a(dyy.a var1, int var2, int var3);

   int B_();

   ddy F_();

   default jm<ddw> t(jd $$0) {
      return this.F_().a($$0);
   }

   default Stream<dtc> c(ewv $$0) {
      int $$1 = ayo.a($$0.a);
      int $$2 = ayo.a($$0.d);
      int $$3 = ayo.a($$0.b);
      int $$4 = ayo.a($$0.e);
      int $$5 = ayo.a($$0.c);
      int $$6 = ayo.a($$0.f);
      return this.a($$1, $$3, $$5, $$2, $$4, $$6) ? this.a($$0) : Stream.empty();
   }

   @Override
   default int a(jd $$0, dch $$1) {
      return $$1.getColor(this.t($$0).a(), (double)$$0.u(), (double)$$0.w());
   }

   @Override
   default jm<ddw> getNoiseBiome(int $$0, int $$1, int $$2) {
      duy $$3 = this.a(jx.e($$0), jx.e($$2), dvz.f, false);
      return $$3 != null ? $$3.getNoiseBiome($$0, $$1, $$2) : this.a($$0, $$1, $$2);
   }

   jm<ddw> a(int var1, int var2, int var3);

   boolean x_();

   @Deprecated
   int z_();

   dwy D_();

   @Override
   default int I_() {
      return this.D_().n();
   }

   @Override
   default int J_() {
      return this.D_().o();
   }

   default jd a(dyy.a $$0, jd $$1) {
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
            for (jd var4 = $$1.e(); var4.v() > $$0.v(); var4 = var4.e()) {
               dtc $$2 = this.a_(var4);
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
      return ayo.i(this.D_().s(), $$2, 1.0F);
   }

   default duy y(jd $$0) {
      return this.a(kf.a($$0.u()), kf.a($$0.w()));
   }

   default duy a(int $$0, int $$1) {
      return this.a($$0, $$1, dvz.n, true);
   }

   default duy a(int $$0, int $$1, dvz $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   @Nullable
   @Override
   default dcc c(int $$0, int $$1) {
      return this.a($$0, $$1, dvz.c, false);
   }

   default boolean z(jd $$0) {
      return this.b_($$0).a(awk.a);
   }

   default boolean d(ewv $$0) {
      int $$1 = ayo.a($$0.a);
      int $$2 = ayo.c($$0.d);
      int $$3 = ayo.a($$0.b);
      int $$4 = ayo.c($$0.e);
      int $$5 = ayo.a($$0.c);
      int $$6 = ayo.c($$0.f);
      jd.a $$7 = new jd.a();

      for (int $$8 = $$1; $$8 < $$2; $$8++) {
         for (int $$9 = $$3; $$9 < $$4; $$9++) {
            for (int $$10 = $$5; $$10 < $$6; $$10++) {
               dtc $$11 = this.a_($$7.d($$8, $$9, $$10));
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

   cpl J();

   default <T> jo<T> a(akq<? extends jz<? extends T>> $$0) {
      jz<T> $$1 = this.H_().d($$0);
      return $$1.q().a(this.J());
   }
}
