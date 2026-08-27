import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface csi extends cri, crp, csv, ctf.a {
   @Nullable
   djj a(int var1, int var2, djo var3, boolean var4);

   @Deprecated
   boolean b(int var1, int var2);

   int a(dmw.a var1, int var2, int var3);

   int C_();

   ctf G_();

   default ig<ctd> s(hx $$0) {
      return this.G_().a($$0);
   }

   default Stream<dhn> c(eju $$0) {
      int $$1 = atq.a($$0.a);
      int $$2 = atq.a($$0.d);
      int $$3 = atq.a($$0.b);
      int $$4 = atq.a($$0.e);
      int $$5 = atq.a($$0.c);
      int $$6 = atq.a($$0.f);
      return this.a($$1, $$3, $$5, $$2, $$4, $$6) ? this.a($$0) : Stream.empty();
   }

   @Override
   default int a(hx $$0, crq $$1) {
      return $$1.getColor(this.s($$0).a(), (double)$$0.u(), (double)$$0.w());
   }

   @Override
   default ig<ctd> getNoiseBiome(int $$0, int $$1, int $$2) {
      djj $$3 = this.a(ir.e($$0), ir.e($$2), djo.f, false);
      return $$3 != null ? $$3.getNoiseBiome($$0, $$1, $$2) : this.a($$0, $$1, $$2);
   }

   ig<ctd> a(int var1, int var2, int var3);

   boolean y_();

   @Deprecated
   int A_();

   dkw E_();

   @Override
   default int J_() {
      return this.E_().n();
   }

   @Override
   default int K_() {
      return this.E_().o();
   }

   default hx a(dmw.a $$0, hx $$1) {
      return new hx($$1.u(), this.a($$0, $$1.u(), $$1.w()), $$1.w());
   }

   default boolean t(hx $$0) {
      return this.a_($$0).i();
   }

   default boolean u(hx $$0) {
      if ($$0.v() >= this.A_()) {
         return this.g($$0);
      } else {
         hx $$1 = new hx($$0.u(), this.A_(), $$0.w());
         if (!this.g($$1)) {
            return false;
         } else {
            for (hx var4 = $$1.d(); var4.v() > $$0.v(); var4 = var4.d()) {
               dhn $$2 = this.a_(var4);
               if ($$2.b(this, var4) > 0 && !$$2.k()) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   default float v(hx $$0) {
      return this.w($$0) - 0.5F;
   }

   @Deprecated
   default float w(hx $$0) {
      float $$1 = (float)this.z($$0) / 15.0F;
      float $$2 = $$1 / (4.0F - 3.0F * $$1);
      return atq.i(this.E_().s(), $$2, 1.0F);
   }

   default djj x(hx $$0) {
      return this.a(iy.a($$0.u()), iy.a($$0.w()));
   }

   default djj a(int $$0, int $$1) {
      return this.a($$0, $$1, djo.n, true);
   }

   default djj a(int $$0, int $$1, djo $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   @Nullable
   @Override
   default crl c(int $$0, int $$1) {
      return this.a($$0, $$1, djo.c, false);
   }

   default boolean y(hx $$0) {
      return this.b_($$0).a(arp.a);
   }

   default boolean d(eju $$0) {
      int $$1 = atq.a($$0.a);
      int $$2 = atq.c($$0.d);
      int $$3 = atq.a($$0.b);
      int $$4 = atq.c($$0.e);
      int $$5 = atq.a($$0.c);
      int $$6 = atq.c($$0.f);
      hx.a $$7 = new hx.a();

      for (int $$8 = $$1; $$8 < $$2; $$8++) {
         for (int $$9 = $$3; $$9 < $$4; $$9++) {
            for (int $$10 = $$5; $$10 < $$6; $$10++) {
               dhn $$11 = this.a_($$7.d($$8, $$9, $$10));
               if (!$$11.u().c()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   default int z(hx $$0) {
      return this.c($$0, this.C_());
   }

   default int c(hx $$0, int $$1) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000 ? this.b($$0, $$1) : 15;
   }

   @Deprecated
   default boolean f(int $$0, int $$1) {
      return this.b(iy.a($$0), iy.a($$1));
   }

   @Deprecated
   default boolean A(hx $$0) {
      return this.f($$0.u(), $$0.w());
   }

   @Deprecated
   default boolean a(hx $$0, hx $$1) {
      return this.a($$0.u(), $$0.v(), $$0.w(), $$1.u(), $$1.v(), $$1.w());
   }

   @Deprecated
   default boolean a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      return $$4 >= this.J_() && $$1 < this.ak() ? this.b($$0, $$2, $$3, $$5) : false;
   }

   @Deprecated
   default boolean b(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = iy.a($$0);
      int $$5 = iy.a($$2);
      int $$6 = iy.a($$1);
      int $$7 = iy.a($$3);

      for (int $$8 = $$4; $$8 <= $$5; $$8++) {
         for (int $$9 = $$6; $$9 <= $$7; $$9++) {
            if (!this.b($$8, $$9)) {
               return false;
            }
         }
      }

      return true;
   }

   it I_();

   cgi H();

   default <T> ii<T> a(agl<? extends is<? extends T>> $$0) {
      is<T> $$1 = this.I_().d($$0);
      return $$1.p().a(this.H());
   }
}
