import javax.annotation.Nullable;

public class cob extends cnc {
   private static final akj<Byte> g = akn.a(cob.class, akl.a);
   private static final akj<Boolean> h = akn.a(cob.class, akl.k);
   private boolean i;
   public int f;

   public cob(bsz<? extends cob> $$0, dbx $$1) {
      super($$0, $$1);
   }

   public cob(dbx $$0, bto $$1, cuo $$2) {
      super(bsz.bf, $$1, $$0, $$2);
      this.ao.a(g, (byte)daa.i($$2));
      this.ao.a(h, $$2.y());
   }

   public cob(dbx $$0, double $$1, double $$2, double $$3, cuo $$4) {
      super(bsz.bf, $$1, $$2, $$3, $$0, $$4);
      this.ao.a(g, (byte)daa.i($$4));
      this.ao.a(h, $$4.y());
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(g, (byte)0);
      $$0.a(h, false);
   }

   @Override
   public void l() {
      if (this.c > 4) {
         this.i = true;
      }

      bst $$0 = this.s();
      int $$1 = this.ao.a(g);
      if ($$1 > 0 && (this.i || this.G()) && $$0 != null) {
         if (!this.M()) {
            if (!this.dP().B && this.d == cnc.a.b) {
               this.a(this.w(), 0.1F);
            }

            this.ao();
         } else {
            this.b(true);
            evq $$2 = $$0.bx().d(this.dn());
            this.p(this.du(), this.dw() + $$2.d * 0.015 * (double)$$1, this.dA());
            if (this.dP().B) {
               this.ae = this.dw();
            }

            double $$3 = 0.05 * (double)$$1;
            this.h(this.ds().a(0.95).e($$2.d().a($$3)));
            if (this.f == 0) {
               this.a(avz.zz, 10.0F, 1.0F);
            }

            this.f++;
         }
      }

      super.l();
   }

   private boolean M() {
      bst $$0 = this.s();
      return $$0 == null || !$$0.bD() ? false : !($$0 instanceof arf) || !$$0.N_();
   }

   @Override
   public boolean H() {
      return this.ao.a(h);
   }

   @Nullable
   @Override
   protected evn a(evq $$0, evq $$1) {
      return this.i ? null : super.a($$0, $$1);
   }

   @Override
   protected void a(evn $$0) {
      bst $$1 = $$0.a();
      float $$2 = 8.0F;
      if ($$1 instanceof bto $$3) {
         $$2 += daa.a(this.y(), $$3.ak());
      }

      bst $$4 = this.s();
      brm $$5 = this.dQ().a(this, (bst)($$4 == null ? this : $$4));
      this.i = true;
      avy $$6 = avz.zx;
      if ($$1.a($$5, $$2)) {
         if ($$1.ak() == bsz.H) {
            return;
         }

         if ($$1 instanceof bto $$7) {
            if ($$4 instanceof bto) {
               daa.a($$7, $$4);
               daa.b((bto)$$4, $$7);
            }

            this.a($$7);
         }
      }

      this.h(this.ds().d(-0.01, -0.1, -0.01));
      float $$8 = 1.0F;
      if (this.dP() instanceof are && this.dP().ac() && this.K()) {
         iz $$9 = $$1.dp();
         if (this.dP().h($$9)) {
            btn $$10 = bsz.am.a(this.dP());
            if ($$10 != null) {
               $$10.e(evq.c($$9));
               $$10.b($$4 instanceof arf ? (arf)$$4 : null);
               this.dP().b($$10);
               $$6 = avz.zE;
               $$8 = 5.0F;
            }
         }
      }

      this.a($$6, $$8, 1.0F);
   }

   public boolean K() {
      return daa.k(this.y());
   }

   @Override
   protected boolean a(cmw $$0) {
      return super.a($$0) || this.G() && this.e($$0) && $$0.gc().f(this.w());
   }

   @Override
   protected cuo x() {
      return new cuo(cur.vP);
   }

   @Override
   protected avy u() {
      return avz.zy;
   }

   @Override
   public void b_(cmw $$0) {
      if (this.e($$0) || this.s() == null) {
         super.b_($$0);
      }
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.i = $$0.q("DealtDamage");
      this.ao.a(g, (byte)daa.i(this.y()));
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("DealtDamage", this.i);
   }

   @Override
   public void p() {
      int $$0 = this.ao.a(g);
      if (this.d != cnc.a.b || $$0 <= 0) {
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
