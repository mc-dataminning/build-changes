import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public class cie extends cct implements brb, brt {
   private static final UUID bY = UUID.fromString("9e362924-01de-4ddd-a2b2-d0f7a405a174");
   private static final bsj bZ = new bsj(bY, "Strider suffocating modifier", -0.34F, bsj.a.b);
   private static final float cb = 0.35F;
   private static final float cc = 0.55F;
   private static final cwd cd = cwd.a(csg.dD);
   private static final cwd ce = cwd.a(csg.dD, csg.nS);
   private static final ajk<Integer> cf = ajo.a(cie.class, ajm.b);
   private static final ajk<Boolean> cg = ajo.a(cie.class, ajm.k);
   private static final ajk<Boolean> ch = ajo.a(cie.class, ajm.k);
   private final bra ci = new bra(this.ao, cf, ch);
   @Nullable
   private bzj cj;

   public cie(bqr<? extends cie> $$0, czu $$1) {
      super($$0, $$1);
      this.J = true;
      this.a(emi.j, -1.0F);
      this.a(emi.i, 0.0F);
      this.a(emi.n, 0.0F);
      this.a(emi.o, 0.0F);
   }

   public static boolean c(bqr<cie> $$0, czv $$1, bri $$2, im $$3, ayd $$4) {
      im.a $$5 = $$3.j();

      do {
         $$5.c(ir.b);
      } while ($$1.b_($$5).a(avt.b));

      return $$1.a_($$5).i();
   }

   @Override
   public void a(ajk<?> $$0) {
      if (cf.equals($$0) && this.dN().B) {
         this.ci.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(cf, 0);
      $$0.a(cg, false);
      $$0.a(ch, false);
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      this.ci.a($$0);
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      this.ci.b($$0);
   }

   @Override
   public boolean i() {
      return this.ci.d();
   }

   @Override
   public boolean f() {
      return this.bB() && !this.p_();
   }

   @Override
   public void a(@Nullable ava $$0) {
      this.ci.a(true);
      if ($$0 != null) {
         this.dN().a(null, this, auz.xP, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   protected void z() {
      this.bS.a(1, new byu(this, 1.65));
      this.bS.a(2, new bxn(this, 1.0));
      this.cj = new bzj(this, 1.4, ce, false);
      this.bS.a(3, this.cj);
      this.bS.a(4, new cie.a(this, 1.0));
      this.bS.a(5, new bya(this, 1.0));
      this.bS.a(7, new byy(this, 1.0, 60));
      this.bS.a(8, new byj(this, ckl.class, 8.0F));
      this.bS.a(8, new byw(this));
      this.bS.a(9, new byj(this, cie.class, 8.0F));
   }

   public void w(boolean $$0) {
      this.ao.a(cg, $$0);
      bsh $$1 = this.f(bsl.r);
      if ($$1 != null) {
         if ($$0) {
            $$1.b(bZ);
         } else {
            $$1.e(bZ);
         }
      }
   }

   public boolean r() {
      return this.ao.a(cg);
   }

   @Override
   public boolean a(elr $$0) {
      return $$0.a(avt.b);
   }

   @Override
   protected etf a(bql $$0, bqo $$1, float $$2) {
      float $$3 = Math.min(0.25F, this.aV.a());
      float $$4 = this.aV.b();
      float $$5 = 0.12F * axw.b($$4 * 1.5F) * 2.0F * $$3;
      return super.a($$0, $$1, $$2).b(0.0, (double)($$5 * $$2), 0.0);
   }

   @Override
   public boolean a(czx $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public bre cO() {
      return (bre)(this.i() && this.cR() instanceof ckl $$0 && $$0.b(csg.nS) ? $$0 : super.cO());
   }

   @Override
   public etf b(bre $$0) {
      etf[] $$1 = new etf[]{
         a((double)this.dh(), (double)$$0.dh(), $$0.dD()),
         a((double)this.dh(), (double)$$0.dh(), $$0.dD() - 22.5F),
         a((double)this.dh(), (double)$$0.dh(), $$0.dD() + 22.5F),
         a((double)this.dh(), (double)$$0.dh(), $$0.dD() - 45.0F),
         a((double)this.dh(), (double)$$0.dh(), $$0.dD() + 45.0F)
      };
      Set<im> $$2 = Sets.newLinkedHashSet();
      double $$3 = this.cI().e;
      double $$4 = this.cI().b - 0.5;
      im.a $$5 = new im.a();

      for (etf $$6 : $$1) {
         $$5.b(this.ds() + $$6.c, $$3, this.dy() + $$6.e);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.i());
            $$5.c(ir.a);
         }
      }

      for (im $$8 : $$2) {
         if (!this.dN().b_($$8).a(avt.b)) {
            double $$9 = this.dN().j($$8);
            if (cml.a($$9)) {
               etf $$10 = etf.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fG().iterator();

               while (var14.hasNext()) {
                  brp $$11 = (brp)var14.next();
                  eta $$12 = $$0.f($$11);
                  if (cml.a(this.dN(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new etf(this.ds(), this.cI().e, this.dy());
   }

   @Override
   protected void a(ckl $$0, etf $$1) {
      this.a($$0.dD(), $$0.dF() * 0.5F);
      this.O = this.aZ = this.bb = this.dD();
      this.ci.b();
      super.a($$0, $$1);
   }

   @Override
   protected etf b(ckl $$0, etf $$1) {
      return new etf(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(ckl $$0) {
      return (float)(this.g(bsl.r) * (double)(this.r() ? 0.35F : 0.55F) * (double)this.ci.c());
   }

   @Override
   protected float aM() {
      return this.aa + 0.6F;
   }

   @Override
   protected void b(im $$0, dpy $$1) {
      this.a(this.bq() ? auz.xN : auz.xM, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.ci.a(this.ej());
   }

   @Override
   protected void a(double $$0, boolean $$1, dpy $$2, im $$3) {
      this.aQ();
      if (this.bq()) {
         this.n();
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void l() {
      if (this.y() && this.ah.a(140) == 0) {
         this.b(auz.xI);
      } else if (this.gm() && this.ah.a(60) == 0) {
         this.b(auz.xJ);
      }

      if (!this.gf()) {
         boolean $$2;
         boolean var10000;
         label36: {
            dpy $$0 = this.dN().a_(this.dn());
            dpy $$1 = this.bm();
            $$2 = $$0.a(avo.aU) || $$1.a(avo.aU) || this.b(avt.b) > 0.0;
            if (this.da() instanceof cie $$3 && $$3.r()) {
               var10000 = true;
               break label36;
            }

            var10000 = false;
         }

         boolean $$4 = var10000;
         this.w(!$$2 || $$4);
      }

      super.l();
      this.gp();
      this.aQ();
   }

   private boolean y() {
      return this.cj != null && this.cj.i();
   }

   @Override
   protected boolean B() {
      return true;
   }

   private void gp() {
      if (this.bq()) {
         etk $$0 = etk.a(this);
         if ($$0.a(dhl.d, this.dn(), true) && !this.dN().b_(this.dn().c()).a(avt.b)) {
            this.d(true);
         } else {
            this.g(this.dq().a(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static bsk.a u() {
      return brg.A().a(bsl.r, 0.175F).a(bsl.k, 16.0);
   }

   @Override
   protected auy v() {
      return !this.gm() && !this.y() ? auz.xH : null;
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.xL;
   }

   @Override
   protected auy o_() {
      return auz.xK;
   }

   @Override
   protected boolean r(bql $$0) {
      return !this.bQ() && !this.a(avt.b);
   }

   @Override
   public boolean fn() {
      return true;
   }

   @Override
   public boolean bO() {
      return false;
   }

   @Override
   protected cap b(czu $$0) {
      return new cie.b(this, $$0);
   }

   @Override
   public float a(im $$0, czx $$1) {
      if ($$1.a_($$0).u().a(avt.b)) {
         return 10.0F;
      } else {
         return this.bq() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public cie b(aqe $$0, bqf $$1) {
      return bqr.aY.a((czu)$$0);
   }

   @Override
   public boolean o(csd $$0) {
      return cd.a($$0);
   }

   @Override
   protected void eB() {
      super.eB();
      if (this.i()) {
         this.a(csg.nL);
      }
   }

   @Override
   public boq b(ckl $$0, bop $$1) {
      boolean $$2 = this.o($$0.b($$1));
      if (!$$2 && this.i() && !this.bQ() && !$$0.fP()) {
         if (!this.dN().B) {
            $$0.n(this);
         }

         return boq.a(this.dN().B);
      } else {
         boq $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            csd $$4 = $$0.b($$1);
            return $$4.a(csg.nL) ? $$4.a($$0, this, $$1) : boq.d;
         } else {
            if ($$2 && !this.aU()) {
               this.dN().a(null, this.ds(), this.du(), this.dy(), auz.xO, this.dc(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public etf cK() {
      return new etf(0.0, (double)(0.6F * this.cJ()), (double)(this.dh() * 0.4F));
   }

   @Nullable
   @Override
   public brw a(daj $$0, boo $$1, bri $$2, @Nullable brw $$3) {
      if (this.p_()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         ayd $$4 = $$0.E_();
         if ($$4.a(30) == 0) {
            brg $$5 = bqr.bw.a((czu)$$0.E());
            if ($$5 != null) {
               $$3 = this.a($$0, $$1, $$5, new cik.b(cik.a($$4), false));
               $$5.a(bqs.a, new csd(csg.nS));
               this.a(null);
            }
         } else if ($$4.a(10) == 0) {
            bqf $$6 = bqr.aY.a((czu)$$0.E());
            if ($$6 != null) {
               $$6.c_(-24000);
               $$3 = this.a($$0, $$1, $$6, null);
            }
         } else {
            $$3 = new bqf.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   private brw a(daj $$0, boo $$1, brg $$2, @Nullable brw $$3) {
      $$2.b(this.ds(), this.du(), this.dy(), this.dD(), 0.0F);
      $$2.a($$0, $$1, bri.g, $$3);
      $$2.a(this, true);
      return new bqf.a(0.0F);
   }

   static class a extends byo {
      private final cie g;

      a(cie $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public im k() {
         return this.e;
      }

      @Override
      public boolean b() {
         return !this.g.bq() && this.a(this.g.dN(), this.e);
      }

      @Override
      public boolean a() {
         return !this.g.bq() && super.a();
      }

      @Override
      public boolean l() {
         return this.d % 20 == 0;
      }

      @Override
      protected boolean a(czx $$0, im $$1) {
         return $$0.a_($$1).a(dcx.H) && $$0.a_($$1.c()).a(emg.a);
      }
   }

   static class b extends cao {
      b(cie $$0, czu $$1) {
         super($$0, $$1);
      }

      @Override
      protected emh a(int $$0) {
         this.o = new emn();
         this.o.a(true);
         return new emh(this.o, $$0);
      }

      @Override
      protected boolean a(emi $$0) {
         return $$0 != emi.i && $$0 != emi.o && $$0 != emi.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(im $$0) {
         return this.b.a_($$0).a(dcx.H) || super.a($$0);
      }
   }
}
