import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public class cfe extends bzx implements bof, box {
   private static final UUID bT = UUID.fromString("9e362924-01de-4ddd-a2b2-d0f7a405a174");
   private static final bpn bU = new bpn(bT, "Strider suffocating modifier", -0.34F, bpn.a.b);
   private static final float bW = 0.35F;
   private static final float bX = 0.55F;
   private static final csc bY = csc.a(cpg.dC);
   private static final csc bZ = csc.a(cpg.dC, cpg.nR);
   private static final aie<Integer> ca = aih.a(cfe.class, aig.b);
   private static final aie<Boolean> cb = aih.a(cfe.class, aig.k);
   private static final aie<Boolean> cc = aih.a(cfe.class, aig.k);
   private final boe cd = new boe(this.am, ca, cc);
   @Nullable
   private bwn ce;

   public cfe(bnw<? extends cfe> $$0, cvr $$1) {
      super($$0, $$1);
      this.H = true;
      this.a(ehh.j, -1.0F);
      this.a(ehh.i, 0.0F);
      this.a(ehh.n, 0.0F);
      this.a(ehh.o, 0.0F);
   }

   public static boolean c(bnw<cfe> $$0, cvs $$1, bom $$2, hz $$3, awp $$4) {
      hz.a $$5 = $$3.j();

      do {
         $$5.c(ie.b);
      } while ($$1.b_($$5).a(auf.b));

      return $$1.a_($$5).i();
   }

   @Override
   public void a(aie<?> $$0) {
      if (ca.equals($$0) && this.dM().B) {
         this.cd.a();
      }

      super.a($$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(ca, 0);
      this.am.a(cb, false);
      this.am.a(cc, false);
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      this.cd.a($$0);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.cd.b($$0);
   }

   @Override
   public boolean i() {
      return this.cd.d();
   }

   @Override
   public boolean g() {
      return this.bx() && !this.o_();
   }

   @Override
   public void a(@Nullable atm $$0) {
      this.cd.a(true);
      if ($$0 != null) {
         this.dM().a(null, this, atl.xx, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   protected void B() {
      this.bO.a(1, new bvy(this, 1.65));
      this.bO.a(2, new bur(this, 1.0));
      this.ce = new bwn(this, 1.4, bZ, false);
      this.bO.a(3, this.ce);
      this.bO.a(4, new cfe.a(this, 1.0));
      this.bO.a(5, new bve(this, 1.0));
      this.bO.a(7, new bwc(this, 1.0, 60));
      this.bO.a(8, new bvn(this, chl.class, 8.0F));
      this.bO.a(8, new bwa(this));
      this.bO.a(9, new bvn(this, cfe.class, 8.0F));
   }

   public void w(boolean $$0) {
      this.am.b(cb, $$0);
      bpl $$1 = this.f(bpp.o);
      if ($$1 != null) {
         if ($$0) {
            $$1.b(bU);
         } else {
            $$1.e(bU);
         }
      }
   }

   @Override
   public boolean u() {
      return this.am.b(cb);
   }

   @Override
   public boolean a(egw $$0) {
      return $$0.a(auf.b);
   }

   @Override
   protected enz a(bnq $$0, bnt $$1, float $$2) {
      float $$3 = Math.min(0.25F, this.aQ.a());
      float $$4 = this.aQ.b();
      float $$5 = 0.12F * awi.b($$4 * 1.5F) * 2.0F * $$3;
      return super.a($$0, $$1, $$2).b(0.0, (double)($$5 * $$2), 0.0);
   }

   @Override
   public boolean a(cvu $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public boi cN() {
      return (boi)(this.i() && this.cQ() instanceof chl $$0 && $$0.b(cpg.nR) ? $$0 : super.cN());
   }

   @Override
   public enz b(boi $$0) {
      enz[] $$1 = new enz[]{
         a((double)this.dg(), (double)$$0.dg(), $$0.dC()),
         a((double)this.dg(), (double)$$0.dg(), $$0.dC() - 22.5F),
         a((double)this.dg(), (double)$$0.dg(), $$0.dC() + 22.5F),
         a((double)this.dg(), (double)$$0.dg(), $$0.dC() - 45.0F),
         a((double)this.dg(), (double)$$0.dg(), $$0.dC() + 45.0F)
      };
      Set<hz> $$2 = Sets.newLinkedHashSet();
      double $$3 = this.cH().e;
      double $$4 = this.cH().b - 0.5;
      hz.a $$5 = new hz.a();

      for (enz $$6 : $$1) {
         $$5.b(this.dr() + $$6.c, $$3, this.dx() + $$6.e);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.i());
            $$5.c(ie.a);
         }
      }

      for (hz $$8 : $$2) {
         if (!this.dM().b_($$8).a(auf.b)) {
            double $$9 = this.dM().j($$8);
            if (cjj.a($$9)) {
               enz $$10 = enz.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fA().iterator();

               while (var14.hasNext()) {
                  bot $$11 = (bot)var14.next();
                  enu $$12 = $$0.f($$11);
                  if (cjj.a(this.dM(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new enz(this.dr(), this.cH().e, this.dx());
   }

   @Override
   protected void a(chl $$0, enz $$1) {
      this.a($$0.dC(), $$0.dE() * 0.5F);
      this.M = this.aU = this.aW = this.dC();
      this.cd.b();
      super.a($$0, $$1);
   }

   @Override
   protected enz b(chl $$0, enz $$1) {
      return new enz(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(chl $$0) {
      return (float)(this.g(bpp.o) * (double)(this.u() ? 0.35F : 0.55F) * (double)this.cd.c());
   }

   @Override
   protected float aM() {
      return this.Y + 0.6F;
   }

   @Override
   protected void b(hz $$0, dlj $$1) {
      this.a(this.bn() ? atl.xv : atl.xu, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.cd.a(this.eh());
   }

   @Override
   protected void a(double $$0, boolean $$1, dlj $$2, hz $$3) {
      this.aQ();
      if (this.bn()) {
         this.n();
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void l() {
      if (this.A() && this.af.a(140) == 0) {
         this.b(atl.xq);
      } else if (this.gd() && this.af.a(60) == 0) {
         this.b(atl.xr);
      }

      if (!this.fW()) {
         boolean $$2;
         boolean var10000;
         label36: {
            dlj $$0 = this.dM().a_(this.dm());
            dlj $$1 = this.bj();
            $$2 = $$0.a(aua.aT) || $$1.a(aua.aT) || this.b(auf.b) > 0.0;
            if (this.cZ() instanceof cfe $$3 && $$3.u()) {
               var10000 = true;
               break label36;
            }

            var10000 = false;
         }

         boolean $$4 = var10000;
         this.w(!$$2 || $$4);
      }

      super.l();
      this.gg();
      this.aQ();
   }

   private boolean A() {
      return this.ce != null && this.ce.i();
   }

   @Override
   protected boolean D() {
      return true;
   }

   private void gg() {
      if (this.bn()) {
         eoe $$0 = eoe.a(this);
         if ($$0.a(ddh.d, this.dm(), true) && !this.dM().b_(this.dm().c()).a(auf.b)) {
            this.c(true);
         } else {
            this.g(this.dp().a(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static bpo.a w() {
      return bok.C().a(bpp.o, 0.175F).a(bpp.i, 16.0);
   }

   @Override
   protected atk y() {
      return !this.gd() && !this.A() ? atl.xp : null;
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.xt;
   }

   @Override
   protected atk n_() {
      return atl.xs;
   }

   @Override
   protected boolean q(bnq $$0) {
      return !this.bP() && !this.a(auf.b);
   }

   @Override
   public boolean fh() {
      return true;
   }

   @Override
   public boolean bN() {
      return false;
   }

   @Override
   protected bxt b(cvr $$0) {
      return new cfe.b(this, $$0);
   }

   @Override
   public float a(hz $$0, cvu $$1) {
      if ($$1.a_($$0).u().a(auf.b)) {
         return 10.0F;
      } else {
         return this.bn() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public cfe b(aow $$0, bnl $$1) {
      return bnw.aX.a((cvr)$$0);
   }

   @Override
   public boolean m(cpd $$0) {
      return bY.a($$0);
   }

   @Override
   protected void ez() {
      super.ez();
      if (this.i()) {
         this.a(cpg.nK);
      }
   }

   @Override
   public blw b(chl $$0, blv $$1) {
      boolean $$2 = this.m($$0.b($$1));
      if (!$$2 && this.i() && !this.bP() && !$$0.fI()) {
         if (!this.dM().B) {
            $$0.m(this);
         }

         return blw.a(this.dM().B);
      } else {
         blw $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cpd $$4 = $$0.b($$1);
            return $$4.a(cpg.nK) ? $$4.a($$0, this, $$1) : blw.d;
         } else {
            if ($$2 && !this.aU()) {
               this.dM().a(null, this.dr(), this.dt(), this.dx(), atl.xw, this.db(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public enz cJ() {
      return new enz(0.0, (double)(0.6F * this.cI()), (double)(this.dg() * 0.4F));
   }

   @Nullable
   @Override
   public bpa a(cwg $$0, blu $$1, bom $$2, @Nullable bpa $$3, @Nullable sw $$4) {
      if (this.o_()) {
         return super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         awp $$5 = $$0.F_();
         if ($$5.a(30) == 0) {
            bok $$6 = bnw.bv.a((cvr)$$0.E());
            if ($$6 != null) {
               $$3 = this.a($$0, $$1, $$6, new cfk.b(cfk.a($$5), false));
               $$6.a(bnx.a, new cpd(cpg.nR));
               this.a(null);
            }
         } else if ($$5.a(10) == 0) {
            bnl $$7 = bnw.aX.a((cvr)$$0.E());
            if ($$7 != null) {
               $$7.c_(-24000);
               $$3 = this.a($$0, $$1, $$7, null);
            }
         } else {
            $$3 = new bnl.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   private bpa a(cwg $$0, blu $$1, bok $$2, @Nullable bpa $$3) {
      $$2.b(this.dr(), this.dt(), this.dx(), this.dC(), 0.0F);
      $$2.a($$0, $$1, bom.g, $$3, null);
      $$2.a(this, true);
      return new bnl.a(0.0F);
   }

   static class a extends bvs {
      private final cfe g;

      a(cfe $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public hz k() {
         return this.e;
      }

      @Override
      public boolean b() {
         return !this.g.bn() && this.a(this.g.dM(), this.e);
      }

      @Override
      public boolean a() {
         return !this.g.bn() && super.a();
      }

      @Override
      public boolean l() {
         return this.d % 20 == 0;
      }

      @Override
      protected boolean a(cvu $$0, hz $$1) {
         return $$0.a_($$1).a(cyu.H) && $$0.a_($$1.c()).a($$0, $$1, ehm.a);
      }
   }

   static class b extends bxs {
      b(cfe $$0, cvr $$1) {
         super($$0, $$1);
      }

      @Override
      protected ehn a(int $$0) {
         this.o = new ehq();
         this.o.a(true);
         return new ehn(this.o, $$0);
      }

      @Override
      protected boolean a(ehh $$0) {
         return $$0 != ehh.i && $$0 != ehh.o && $$0 != ehh.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(hz $$0) {
         return this.b.a_($$0).a(cyu.H) || super.a($$0);
      }
   }
}
