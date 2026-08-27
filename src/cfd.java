import javax.annotation.Nullable;

public class cfd extends cef {
   private static final afs<Byte> g = afv.a(cfd.class, afu.a);
   private static final afs<Boolean> h = afv.a(cfd.class, afu.k);
   private static final clo i = new clo(clr.vH);
   private boolean j;
   public int f;

   public cfd(bkz<? extends cfd> $$0, csf $$1) {
      super($$0, $$1, i);
   }

   public cfd(csf $$0, bll $$1, clo $$2) {
      super(bkz.bb, $$1, $$0, $$2);
      this.an.b(g, (byte)cqb.g($$2));
      this.an.b(h, $$2.B());
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(g, (byte)0);
      this.an.a(h, false);
   }

   @Override
   public void l() {
      if (this.c > 4) {
         this.j = true;
      }

      bkv $$0 = this.w();
      int $$1 = this.an.b(g);
      if ($$1 > 0 && (this.j || this.G()) && $$0 != null) {
         if (!this.M()) {
            if (!this.dN().B && this.d == cef.a.b) {
               this.a(this.x(), 0.1F);
            }

            this.am();
         } else {
            this.p(true);
            ejz $$2 = $$0.br().d(this.dl());
            this.p(this.ds(), this.du() + $$2.d * 0.015 * (double)$$1, this.dy());
            if (this.dN().B) {
               this.ad = this.du();
            }

            double $$3 = 0.05 * (double)$$1;
            this.g(this.dq().a(0.95).e($$2.d().a($$3)));
            if (this.f == 0) {
               this.a(aqv.yk, 10.0F, 1.0F);
            }

            this.f++;
         }
      }

      super.l();
   }

   private boolean M() {
      bkv $$0 = this.w();
      return $$0 == null || !$$0.bx() ? false : !($$0 instanceof amj) || !$$0.P_();
   }

   @Override
   public boolean H() {
      return this.an.b(h);
   }

   @Nullable
   @Override
   protected ejw a(ejz $$0, ejz $$1) {
      return this.j ? null : super.a($$0, $$1);
   }

   @Override
   protected void a(ejw $$0) {
      bkv $$1 = $$0.a();
      float $$2 = 8.0F;
      if ($$1 instanceof bll $$3) {
         $$2 += cqb.a(this.y(), $$3.eT());
      }

      bkv $$4 = this.w();
      bjt $$5 = this.dO().a(this, (bkv)($$4 == null ? this : $$4));
      this.j = true;
      aqu $$6 = aqv.yi;
      if ($$1.a($$5, $$2)) {
         if ($$1.ai() == bkz.E) {
            return;
         }

         if ($$1 instanceof bll $$7) {
            if ($$4 instanceof bll) {
               cqb.a($$7, $$4);
               cqb.b((bll)$$4, $$7);
            }

            this.a($$7);
         }
      }

      this.g(this.dq().d(-0.01, -0.1, -0.01));
      float $$8 = 1.0F;
      if (this.dN() instanceof ami && this.dN().Z() && this.K()) {
         hx $$9 = $$1.dn();
         if (this.dN().g($$9)) {
            blk $$10 = bkz.ai.a(this.dN());
            if ($$10 != null) {
               $$10.e(ejz.c($$9));
               $$10.b($$4 instanceof amj ? (amj)$$4 : null);
               this.dN().b($$10);
               $$6 = aqv.yp;
               $$8 = 5.0F;
            }
         }
      }

      this.a($$6, $$8, 1.0F);
   }

   public boolean K() {
      return cqb.i(this.y());
   }

   @Override
   protected boolean a(cdz $$0) {
      return super.a($$0) || this.G() && this.d((bkv)$$0) && $$0.fT().e(this.x());
   }

   @Override
   protected aqu s() {
      return aqv.yj;
   }

   @Override
   public void b_(cdz $$0) {
      if (this.d((bkv)$$0) || this.w() == null) {
         super.b_($$0);
      }
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      this.j = $$0.q("DealtDamage");
      this.an.b(g, (byte)cqb.g(this.y()));
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      $$0.a("DealtDamage", this.j);
   }

   @Override
   public void q() {
      int $$0 = this.an.b(g);
      if (this.d != cef.a.b || $$0 <= 0) {
         super.q();
      }
   }

   @Override
   protected float E() {
      return 0.99F;
   }

   @Override
   public boolean k(double $$0, double $$1, double $$2) {
      return true;
   }
}
