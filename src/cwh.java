import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface cwh extends cvh, cvo, cwu, cxf.a {
   @Nullable
   doa a(int var1, int var2, dof var3, boolean var4);

   @Deprecated
   boolean b(int var1, int var2);

   int a(drq.a var1, int var2, int var3);

   int C_();

   cxf G_();

   default il<cxd> t(ib $$0) {
      return this.G_().a($$0);
   }

   default Stream<dme> c(eoq $$0) {
      int $$1 = awm.a($$0.a);
      int $$2 = awm.a($$0.d);
      int $$3 = awm.a($$0.b);
      int $$4 = awm.a($$0.e);
      int $$5 = awm.a($$0.c);
      int $$6 = awm.a($$0.f);
      return this.a($$1, $$3, $$5, $$2, $$4, $$6) ? this.a($$0) : Stream.empty();
   }

   @Override
   default int a(ib $$0, cvp $$1) {
      return $$1.getColor(this.t($$0).a(), (double)$$0.u(), (double)$$0.w());
   }

   @Override
   default il<cxd> getNoiseBiome(int $$0, int $$1, int $$2) {
      doa $$3 = this.a(iw.e($$0), iw.e($$2), dof.f, false);
      return $$3 != null ? $$3.getNoiseBiome($$0, $$1, $$2) : this.a($$0, $$1, $$2);
   }

   il<cxd> a(int var1, int var2, int var3);

   boolean y_();

   @Deprecated
   int A_();

   dpq E_();

   @Override
   default int J_() {
      return this.E_().n();
   }

   @Override
   default int K_() {
      return this.E_().o();
   }

   default ib a(drq.a $$0, ib $$1) {
      return new ib($$1.u(), this.a($$0, $$1.u(), $$1.w()), $$1.w());
   }

   default boolean u(ib $$0) {
      return this.a_($$0).i();
   }

   default boolean v(ib $$0) {
      if ($$0.v() >= this.A_()) {
         return this.h($$0);
      } else {
         ib $$1 = new ib($$0.u(), this.A_(), $$0.w());
         if (!this.h($$1)) {
            return false;
         } else {
            for (ib var4 = $$1.d(); var4.v() > $$0.v(); var4 = var4.d()) {
               dme $$2 = this.a_(var4);
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
      return awm.i(this.E_().s(), $$2, 1.0F);
   }

   default doa y(ib $$0) {
      return this.a(jd.a($$0.u()), jd.a($$0.w()));
   }

   default doa a(int $$0, int $$1) {
      return this.a($$0, $$1, dof.n, true);
   }

   default doa a(int $$0, int $$1, dof $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   @Nullable
   @Override
   default cvk c(int $$0, int $$1) {
      return this.a($$0, $$1, dof.c, false);
   }

   default boolean z(ib $$0) {
      return this.b_($$0).a(auj.a);
   }

   default boolean d(eoq $$0) {
      int $$1 = awm.a($$0.a);
      int $$2 = awm.c($$0.d);
      int $$3 = awm.a($$0.b);
      int $$4 = awm.c($$0.e);
      int $$5 = awm.a($$0.c);
      int $$6 = awm.c($$0.f);
      ib.a $$7 = new ib.a();

      for (int $$8 = $$1; $$8 < $$2; $$8++) {
         for (int $$9 = $$3; $$9 < $$4; $$9++) {
            for (int $$10 = $$5; $$10 < $$6; $$10++) {
               dme $$11 = this.a_($$7.d($$8, $$9, $$10));
               if (!$$11.u().c()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   default int A(ib $$0) {
      return this.c($$0, this.C_());
   }

   default int c(ib $$0, int $$1) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000 ? this.b($$0, $$1) : 15;
   }

   @Deprecated
   default boolean f(int $$0, int $$1) {
      return this.b(jd.a($$0), jd.a($$1));
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
      return $$4 >= this.J_() && $$1 < this.ak() ? this.b($$0, $$2, $$3, $$5) : false;
   }

   @Deprecated
   default boolean b(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = jd.a($$0);
      int $$5 = jd.a($$2);
      int $$6 = jd.a($$1);
      int $$7 = jd.a($$3);

      for (int $$8 = $$4; $$8 <= $$5; $$8++) {
         for (int $$9 = $$6; $$9 <= $$7; $$9++) {
            if (!this.b($$8, $$9)) {
               return false;
            }
         }
      }

      return true;
   }

   iy I_();

   ckl I();

   default <T> in<T> a(ajb<? extends ix<? extends T>> $$0) {
      ix<T> $$1 = this.I_().d($$0);
      return $$1.p().a(this.I());
   }
}
