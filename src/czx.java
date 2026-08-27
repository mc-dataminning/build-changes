import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface czx extends cyx, cze, dak, dav.a {
   @Nullable
   dru a(int var1, int var2, dst var3, boolean var4);

   @Deprecated
   boolean b(int var1, int var2);

   int a(dvq.a var1, int var2, int var3);

   int B_();

   dav F_();

   default iv<dat> t(im $$0) {
      return this.F_().a($$0);
   }

   default Stream<dpy> c(eta $$0) {
      int $$1 = axw.a($$0.a);
      int $$2 = axw.a($$0.d);
      int $$3 = axw.a($$0.b);
      int $$4 = axw.a($$0.e);
      int $$5 = axw.a($$0.c);
      int $$6 = axw.a($$0.f);
      return this.a($$1, $$3, $$5, $$2, $$4, $$6) ? this.a($$0) : Stream.empty();
   }

   @Override
   default int a(im $$0, czf $$1) {
      return $$1.getColor(this.t($$0).a(), (double)$$0.u(), (double)$$0.w());
   }

   @Override
   default iv<dat> getNoiseBiome(int $$0, int $$1, int $$2) {
      dru $$3 = this.a(jg.e($$0), jg.e($$2), dst.f, false);
      return $$3 != null ? $$3.getNoiseBiome($$0, $$1, $$2) : this.a($$0, $$1, $$2);
   }

   iv<dat> a(int var1, int var2, int var3);

   boolean x_();

   @Deprecated
   int z_();

   dtq D_();

   @Override
   default int I_() {
      return this.D_().n();
   }

   @Override
   default int J_() {
      return this.D_().o();
   }

   default im a(dvq.a $$0, im $$1) {
      return new im($$1.u(), this.a($$0, $$1.u(), $$1.w()), $$1.w());
   }

   default boolean u(im $$0) {
      return this.a_($$0).i();
   }

   default boolean v(im $$0) {
      if ($$0.v() >= this.z_()) {
         return this.h($$0);
      } else {
         im $$1 = new im($$0.u(), this.z_(), $$0.w());
         if (!this.h($$1)) {
            return false;
         } else {
            for (im var4 = $$1.d(); var4.v() > $$0.v(); var4 = var4.d()) {
               dpy $$2 = this.a_(var4);
               if ($$2.b(this, var4) > 0 && !$$2.k()) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   default float w(im $$0) {
      return this.x($$0) - 0.5F;
   }

   @Deprecated
   default float x(im $$0) {
      float $$1 = (float)this.A($$0) / 15.0F;
      float $$2 = $$1 / (4.0F - 3.0F * $$1);
      return axw.i(this.D_().s(), $$2, 1.0F);
   }

   default dru y(im $$0) {
      return this.a(jo.a($$0.u()), jo.a($$0.w()));
   }

   default dru a(int $$0, int $$1) {
      return this.a($$0, $$1, dst.n, true);
   }

   default dru a(int $$0, int $$1, dst $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   @Nullable
   @Override
   default cza c(int $$0, int $$1) {
      return this.a($$0, $$1, dst.c, false);
   }

   default boolean z(im $$0) {
      return this.b_($$0).a(avt.a);
   }

   default boolean d(eta $$0) {
      int $$1 = axw.a($$0.a);
      int $$2 = axw.c($$0.d);
      int $$3 = axw.a($$0.b);
      int $$4 = axw.c($$0.e);
      int $$5 = axw.a($$0.c);
      int $$6 = axw.c($$0.f);
      im.a $$7 = new im.a();

      for (int $$8 = $$1; $$8 < $$2; $$8++) {
         for (int $$9 = $$3; $$9 < $$4; $$9++) {
            for (int $$10 = $$5; $$10 < $$6; $$10++) {
               dpy $$11 = this.a_($$7.d($$8, $$9, $$10));
               if (!$$11.u().c()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   default int A(im $$0) {
      return this.c($$0, this.B_());
   }

   default int c(im $$0, int $$1) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000 ? this.b($$0, $$1) : 15;
   }

   @Deprecated
   default boolean f(int $$0, int $$1) {
      return this.b(jo.a($$0), jo.a($$1));
   }

   @Deprecated
   default boolean B(im $$0) {
      return this.f($$0.u(), $$0.w());
   }

   @Deprecated
   default boolean a(im $$0, im $$1) {
      return this.a($$0.u(), $$0.v(), $$0.w(), $$1.u(), $$1.v(), $$1.w());
   }

   @Deprecated
   default boolean a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      return $$4 >= this.I_() && $$1 < this.al() ? this.b($$0, $$2, $$3, $$5) : false;
   }

   @Deprecated
   default boolean b(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = jo.a($$0);
      int $$5 = jo.a($$2);
      int $$6 = jo.a($$1);
      int $$7 = jo.a($$3);

      for (int $$8 = $$4; $$8 <= $$5; $$8++) {
         for (int $$9 = $$6; $$9 <= $$7; $$9++) {
            if (!this.b($$8, $$9)) {
               return false;
            }
         }
      }

      return true;
   }

   jj H_();

   cmy J();

   default <T> ix<T> a(ake<? extends ji<? extends T>> $$0) {
      ji<T> $$1 = this.H_().d($$0);
      return $$1.p().a(this.J());
   }
}
