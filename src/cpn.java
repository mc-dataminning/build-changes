import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface cpn extends com, cou, cqa, cqk.a {
   @Nullable
   dgu a(int var1, int var2, dgz var3, boolean var4);

   @Deprecated
   boolean b(int var1, int var2);

   int a(dkh.a var1, int var2, int var3);

   int v_();

   cqk z_();

   default hf<cqi> s(gv $$0) {
      return this.z_().a($$0);
   }

   default Stream<dey> c(eha $$0) {
      int $$1 = aro.a($$0.a);
      int $$2 = aro.a($$0.d);
      int $$3 = aro.a($$0.b);
      int $$4 = aro.a($$0.e);
      int $$5 = aro.a($$0.c);
      int $$6 = aro.a($$0.f);
      return this.a($$1, $$3, $$5, $$2, $$4, $$6) ? this.a($$0) : Stream.empty();
   }

   @Override
   default int a(gv $$0, cov $$1) {
      return $$1.getColor(this.s($$0).a(), (double)$$0.u(), (double)$$0.w());
   }

   @Override
   default hf<cqi> getNoiseBiome(int $$0, int $$1, int $$2) {
      dgu $$3 = this.a(hr.e($$0), hr.e($$2), dgz.f, false);
      return $$3 != null ? $$3.getNoiseBiome($$0, $$1, $$2) : this.a($$0, $$1, $$2);
   }

   hf<cqi> a(int var1, int var2, int var3);

   boolean r_();

   @Deprecated
   int t_();

   dih x_();

   @Override
   default int C_() {
      return this.x_().n();
   }

   @Override
   default int D_() {
      return this.x_().o();
   }

   default gv a(dkh.a $$0, gv $$1) {
      return new gv($$1.u(), this.a($$0, $$1.u(), $$1.w()), $$1.w());
   }

   default boolean t(gv $$0) {
      return this.a_($$0).i();
   }

   default boolean u(gv $$0) {
      if ($$0.v() >= this.t_()) {
         return this.g($$0);
      } else {
         gv $$1 = new gv($$0.u(), this.t_(), $$0.w());
         if (!this.g($$1)) {
            return false;
         } else {
            for (gv var4 = $$1.d(); var4.v() > $$0.v(); var4 = var4.d()) {
               dey $$2 = this.a_(var4);
               if ($$2.b(this, var4) > 0 && !$$2.k()) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   default float v(gv $$0) {
      return this.w($$0) - 0.5F;
   }

   @Deprecated
   default float w(gv $$0) {
      float $$1 = (float)this.z($$0) / 15.0F;
      float $$2 = $$1 / (4.0F - 3.0F * $$1);
      return aro.i(this.x_().s(), $$2, 1.0F);
   }

   default dgu x(gv $$0) {
      return this.a(hy.a($$0.u()), hy.a($$0.w()));
   }

   default dgu a(int $$0, int $$1) {
      return this.a($$0, $$1, dgz.n, true);
   }

   default dgu a(int $$0, int $$1, dgz $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   @Nullable
   @Override
   default coq c(int $$0, int $$1) {
      return this.a($$0, $$1, dgz.c, false);
   }

   default boolean y(gv $$0) {
      return this.b_($$0).a(apo.a);
   }

   default boolean d(eha $$0) {
      int $$1 = aro.a($$0.a);
      int $$2 = aro.c($$0.d);
      int $$3 = aro.a($$0.b);
      int $$4 = aro.c($$0.e);
      int $$5 = aro.a($$0.c);
      int $$6 = aro.c($$0.f);
      gv.a $$7 = new gv.a();

      for (int $$8 = $$1; $$8 < $$2; $$8++) {
         for (int $$9 = $$3; $$9 < $$4; $$9++) {
            for (int $$10 = $$5; $$10 < $$6; $$10++) {
               dey $$11 = this.a_($$7.d($$8, $$9, $$10));
               if (!$$11.u().c()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   default int z(gv $$0) {
      return this.c($$0, this.v_());
   }

   default int c(gv $$0, int $$1) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000 ? this.b($$0, $$1) : 15;
   }

   @Deprecated
   default boolean f(int $$0, int $$1) {
      return this.b(hy.a($$0), hy.a($$1));
   }

   @Deprecated
   default boolean A(gv $$0) {
      return this.f($$0.u(), $$0.w());
   }

   @Deprecated
   default boolean a(gv $$0, gv $$1) {
      return this.a($$0.u(), $$0.v(), $$0.w(), $$1.u(), $$1.v(), $$1.w());
   }

   @Deprecated
   default boolean a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      return $$4 >= this.C_() && $$1 < this.aj() ? this.b($$0, $$2, $$3, $$5) : false;
   }

   @Deprecated
   default boolean b(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = hy.a($$0);
      int $$5 = hy.a($$2);
      int $$6 = hy.a($$1);
      int $$7 = hy.a($$3);

      for (int $$8 = $$4; $$8 <= $$5; $$8++) {
         for (int $$9 = $$6; $$9 <= $$7; $$9++) {
            if (!this.b($$8, $$9)) {
               return false;
            }
         }
      }

      return true;
   }

   ht B_();

   cdt G();

   default <T> hh<T> a(aeo<? extends hs<? extends T>> $$0) {
      hs<T> $$1 = this.B_().d($$0);
      return $$1.p().a(this.G());
   }
}
