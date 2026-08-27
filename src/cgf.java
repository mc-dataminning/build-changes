import javax.annotation.Nullable;

public class cgf extends cfh {
   private static final agj<Byte> g = agm.a(cgf.class, agl.a);
   private static final agj<Boolean> h = agm.a(cgf.class, agl.k);
   private static final cmr i = new cmr(cmu.vI);
   private boolean j;
   public int f;

   public cgf(blt<? extends cgf> $$0, cti $$1) {
      super($$0, $$1, i);
   }

   public cgf(cti $$0, bmf $$1, cmr $$2) {
      super(blt.bc, $$1, $$0, $$2);
      this.an.b(g, (byte)cre.g($$2));
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

      blp $$0 = this.w();
      int $$1 = this.an.b(g);
      if ($$1 > 0 && (this.j || this.H()) && $$0 != null) {
         if (!this.N()) {
            if (!this.dM().B && this.d == cfh.a.b) {
               this.a(this.y(), 0.1F);
            }

            this.am();
         } else {
            this.p(true);
            elm $$2 = $$0.br().d(this.dk());
            this.p(this.dr(), this.dt() + $$2.d * 0.015 * (double)$$1, this.dx());
            if (this.dM().B) {
               this.ad = this.dt();
            }

            double $$3 = 0.05 * (double)$$1;
            this.g(this.dp().a(0.95).e($$2.d().a($$3)));
            if (this.f == 0) {
               this.a(arm.yF, 10.0F, 1.0F);
            }

            this.f++;
         }
      }

      super.l();
   }

   private boolean N() {
      blp $$0 = this.w();
      return $$0 == null || !$$0.bx() ? false : !($$0 instanceof ana) || !$$0.P_();
   }

   @Override
   public boolean I() {
      return this.an.b(h);
   }

   @Nullable
   @Override
   protected elj a(elm $$0, elm $$1) {
      return this.j ? null : super.a($$0, $$1);
   }

   @Override
   protected void a(elj $$0) {
      blp $$1 = $$0.a();
      float $$2 = 8.0F;
      if ($$1 instanceof bmf $$3) {
         $$2 += cre.a(this.z(), $$3.eS());
      }

      blp $$4 = this.w();
      bkn $$5 = this.dN().a(this, (blp)($$4 == null ? this : $$4));
      this.j = true;
      arl $$6 = arm.yD;
      if ($$1.a($$5, $$2)) {
         if ($$1.ai() == blt.F) {
            return;
         }

         if ($$1 instanceof bmf $$7) {
            if ($$4 instanceof bmf) {
               cre.a($$7, $$4);
               cre.b((bmf)$$4, $$7);
            }

            this.a($$7);
         }
      } else if ($$1.ai().a(ase.s)) {
         this.s();
         return;
      }

      this.g(this.dp().d(-0.01, -0.1, -0.01));
      float $$8 = 1.0F;
      if (this.dM() instanceof amz && this.dM().aa() && this.M()) {
         hx $$9 = $$1.dm();
         if (this.dM().h($$9)) {
            bme $$10 = blt.aj.a(this.dM());
            if ($$10 != null) {
               $$10.e(elm.c($$9));
               $$10.b($$4 instanceof ana ? (ana)$$4 : null);
               this.dM().b($$10);
               $$6 = arm.yK;
               $$8 = 5.0F;
            }
         }
      }

      this.a($$6, $$8, 1.0F);
   }

   public boolean M() {
      return cre.i(this.z());
   }

   @Override
   protected boolean a(cfb $$0) {
      return super.a($$0) || this.H() && this.d((blp)$$0) && $$0.fS().e(this.y());
   }

   @Override
   protected arl u() {
      return arm.yE;
   }

   @Override
   public void b_(cfb $$0) {
      if (this.d((blp)$$0) || this.w() == null) {
         super.b_($$0);
      }
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      this.j = $$0.q("DealtDamage");
      this.an.b(g, (byte)cre.g(this.z()));
   }

   @Override
   public void b(sl $$0) {
      super.b($$0);
      $$0.a("DealtDamage", this.j);
   }

   @Override
   public void q() {
      int $$0 = this.an.b(g);
      if (this.d != cfh.a.b || $$0 <= 0) {
         super.q();
      }
   }

   @Override
   protected float G() {
      return 0.99F;
   }

   @Override
   public boolean k(double $$0, double $$1, double $$2) {
      return true;
   }
}
