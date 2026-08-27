import javax.annotation.Nullable;

public class cnb extends cmc {
   private static final ajr<Byte> h = ajv.a(cnb.class, ajt.a);
   private static final ajr<Boolean> i = ajv.a(cnb.class, ajt.k);
   private boolean j;
   public int g;

   public cnb(bsa<? extends cnb> $$0, dax $$1) {
      super($$0, $$1);
   }

   public cnb(dax $$0, bso $$1, cto $$2) {
      super(bsa.bf, $$1, $$0, $$2);
      this.ao.a(h, (byte)cza.i($$2));
      this.ao.a(i, $$2.y());
   }

   public cnb(dax $$0, double $$1, double $$2, double $$3, cto $$4) {
      super(bsa.bf, $$1, $$2, $$3, $$0, $$4);
      this.ao.a(h, (byte)cza.i($$4));
      this.ao.a(i, $$4.y());
   }

   @Override
   protected void a(ajv.a $$0) {
      super.a($$0);
      $$0.a(h, (byte)0);
      $$0.a(i, false);
   }

   @Override
   public void l() {
      if (this.c > 4) {
         this.j = true;
      }

      bru $$0 = this.s();
      int $$1 = this.ao.a(h);
      if ($$1 > 0 && (this.j || this.G()) && $$0 != null) {
         if (!this.M()) {
            if (!this.dP().B && this.d == cmc.a.b) {
               this.a(this.w(), 0.1F);
            }

            this.ao();
         } else {
            this.b(true);
            euk $$2 = $$0.bx().d(this.dn());
            this.p(this.du(), this.dw() + $$2.d * 0.015 * (double)$$1, this.dA());
            if (this.dP().B) {
               this.ae = this.dw();
            }

            double $$3 = 0.05 * (double)$$1;
            this.g(this.ds().a(0.95).e($$2.d().a($$3)));
            if (this.g == 0) {
               this.a(avh.zz, 10.0F, 1.0F);
            }

            this.g++;
         }
      }

      super.l();
   }

   private boolean M() {
      bru $$0 = this.s();
      return $$0 == null || !$$0.bD() ? false : !($$0 instanceof aqn) || !$$0.N_();
   }

   @Override
   public boolean H() {
      return this.ao.a(i);
   }

   @Nullable
   @Override
   protected euh a(euk $$0, euk $$1) {
      return this.j ? null : super.a($$0, $$1);
   }

   @Override
   protected void a(euh $$0) {
      bru $$1 = $$0.a();
      float $$2 = 8.0F;
      if ($$1 instanceof bso $$3) {
         $$2 += cza.a(this.y(), $$3.ak());
      }

      bru $$4 = this.s();
      bqn $$5 = this.dQ().a(this, (bru)($$4 == null ? this : $$4));
      this.j = true;
      avg $$6 = avh.zx;
      if ($$1.a($$5, $$2)) {
         if ($$1.ak() == bsa.H) {
            return;
         }

         if ($$1 instanceof bso $$7) {
            if ($$4 instanceof bso) {
               cza.a($$7, $$4);
               cza.b((bso)$$4, $$7);
            }

            this.a($$7);
         }
      }

      this.g(this.ds().d(-0.01, -0.1, -0.01));
      float $$8 = 1.0F;
      if (this.dP() instanceof aqm && this.dP().ab() && this.K()) {
         io $$9 = $$1.dp();
         if (this.dP().h($$9)) {
            bsn $$10 = bsa.am.a(this.dP());
            if ($$10 != null) {
               $$10.e(euk.c($$9));
               $$10.b($$4 instanceof aqn ? (aqn)$$4 : null);
               this.dP().b($$10);
               $$6 = avh.zE;
               $$8 = 5.0F;
            }
         }
      }

      this.a($$6, $$8, 1.0F);
   }

   public boolean K() {
      return cza.k(this.y());
   }

   @Override
   protected boolean a(clw $$0) {
      return super.a($$0) || this.G() && this.e($$0) && $$0.gc().f(this.w());
   }

   @Override
   protected cto x() {
      return new cto(ctr.vP);
   }

   @Override
   protected avg u() {
      return avh.zy;
   }

   @Override
   public void b_(clw $$0) {
      if (this.e($$0) || this.s() == null) {
         super.b_($$0);
      }
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.j = $$0.q("DealtDamage");
      this.ao.a(h, (byte)cza.i(this.y()));
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("DealtDamage", this.j);
   }

   @Override
   public void p() {
      int $$0 = this.ao.a(h);
      if (this.d != cmc.a.b || $$0 <= 0) {
         super.p();
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
