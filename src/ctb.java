import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface ctb extends csb, csi, cto, ctz.a {
   @Nullable
   dkl a(int var1, int var2, dkq var3, boolean var4);

   @Deprecated
   boolean b(int var1, int var2);

   int a(dny.a var1, int var2, int var3);

   int C_();

   ctz G_();

   default ie<ctx> s(hv $$0) {
      return this.G_().a($$0);
   }

   default Stream<dip> c(ekw $$0) {
      int $$1 = aty.a($$0.a);
      int $$2 = aty.a($$0.d);
      int $$3 = aty.a($$0.b);
      int $$4 = aty.a($$0.e);
      int $$5 = aty.a($$0.c);
      int $$6 = aty.a($$0.f);
      return this.a($$1, $$3, $$5, $$2, $$4, $$6) ? this.a($$0) : Stream.empty();
   }

   @Override
   default int a(hv $$0, csj $$1) {
      return $$1.getColor(this.s($$0).a(), (double)$$0.u(), (double)$$0.w());
   }

   @Override
   default ie<ctx> getNoiseBiome(int $$0, int $$1, int $$2) {
      dkl $$3 = this.a(iq.e($$0), iq.e($$2), dkq.f, false);
      return $$3 != null ? $$3.getNoiseBiome($$0, $$1, $$2) : this.a($$0, $$1, $$2);
   }

   ie<ctx> a(int var1, int var2, int var3);

   boolean y_();

   @Deprecated
   int A_();

   dly E_();

   @Override
   default int J_() {
      return this.E_().n();
   }

   @Override
   default int K_() {
      return this.E_().o();
   }

   default hv a(dny.a $$0, hv $$1) {
      return new hv($$1.u(), this.a($$0, $$1.u(), $$1.w()), $$1.w());
   }

   default boolean t(hv $$0) {
      return this.a_($$0).i();
   }

   default boolean u(hv $$0) {
      if ($$0.v() >= this.A_()) {
         return this.g($$0);
      } else {
         hv $$1 = new hv($$0.u(), this.A_(), $$0.w());
         if (!this.g($$1)) {
            return false;
         } else {
            for (hv var4 = $$1.d(); var4.v() > $$0.v(); var4 = var4.d()) {
               dip $$2 = this.a_(var4);
               if ($$2.b(this, var4) > 0 && !$$2.k()) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   default float v(hv $$0) {
      return this.w($$0) - 0.5F;
   }

   @Deprecated
   default float w(hv $$0) {
      float $$1 = (float)this.z($$0) / 15.0F;
      float $$2 = $$1 / (4.0F - 3.0F * $$1);
      return aty.i(this.E_().s(), $$2, 1.0F);
   }

   default dkl x(hv $$0) {
      return this.a(ix.a($$0.u()), ix.a($$0.w()));
   }

   default dkl a(int $$0, int $$1) {
      return this.a($$0, $$1, dkq.n, true);
   }

   default dkl a(int $$0, int $$1, dkq $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   @Nullable
   @Override
   default cse c(int $$0, int $$1) {
      return this.a($$0, $$1, dkq.c, false);
   }

   default boolean y(hv $$0) {
      return this.b_($$0).a(arw.a);
   }

   default boolean d(ekw $$0) {
      int $$1 = aty.a($$0.a);
      int $$2 = aty.c($$0.d);
      int $$3 = aty.a($$0.b);
      int $$4 = aty.c($$0.e);
      int $$5 = aty.a($$0.c);
      int $$6 = aty.c($$0.f);
      hv.a $$7 = new hv.a();

      for (int $$8 = $$1; $$8 < $$2; $$8++) {
         for (int $$9 = $$3; $$9 < $$4; $$9++) {
            for (int $$10 = $$5; $$10 < $$6; $$10++) {
               dip $$11 = this.a_($$7.d($$8, $$9, $$10));
               if (!$$11.u().c()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   default int z(hv $$0) {
      return this.c($$0, this.C_());
   }

   default int c(hv $$0, int $$1) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000 ? this.b($$0, $$1) : 15;
   }

   @Deprecated
   default boolean f(int $$0, int $$1) {
      return this.b(ix.a($$0), ix.a($$1));
   }

   @Deprecated
   default boolean A(hv $$0) {
      return this.f($$0.u(), $$0.w());
   }

   @Deprecated
   default boolean a(hv $$0, hv $$1) {
      return this.a($$0.u(), $$0.v(), $$0.w(), $$1.u(), $$1.v(), $$1.w());
   }

   @Deprecated
   default boolean a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      return $$4 >= this.J_() && $$1 < this.ak() ? this.b($$0, $$2, $$3, $$5) : false;
   }

   @Deprecated
   default boolean b(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = ix.a($$0);
      int $$5 = ix.a($$2);
      int $$6 = ix.a($$1);
      int $$7 = ix.a($$3);

      for (int $$8 = $$4; $$8 <= $$5; $$8++) {
         for (int $$9 = $$6; $$9 <= $$7; $$9++) {
            if (!this.b($$8, $$9)) {
               return false;
            }
         }
      }

      return true;
   }

   is I_();

   chb H();

   default <T> ih<T> a(ags<? extends ir<? extends T>> $$0) {
      ir<T> $$1 = this.I_().d($$0);
      return $$1.p().a(this.H());
   }
}
