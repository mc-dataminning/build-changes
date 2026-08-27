import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public class cgl extends cbd implements bpl, bqd {
   private static final UUID bX = UUID.fromString("9e362924-01de-4ddd-a2b2-d0f7a405a174");
   private static final bqt bY = new bqt(bX, "Strider suffocating modifier", -0.34F, bqt.a.b);
   private static final float ca = 0.35F;
   private static final float cb = 0.55F;
   private static final ctk cc = ctk.a(cqn.dC);
   private static final ctk cd = ctk.a(cqn.dC, cqn.nR);
   private static final aim<Integer> ce = aiq.a(cgl.class, aio.b);
   private static final aim<Boolean> cf = aiq.a(cgl.class, aio.k);
   private static final aim<Boolean> cg = aiq.a(cgl.class, aio.k);
   private final bpk ch = new bpk(this.an, ce, cg);
   @Nullable
   private bxt ci;

   public cgl(bpc<? extends cgl> $$0, cwz $$1) {
      super($$0, $$1);
      this.I = true;
      this.a(eiy.j, -1.0F);
      this.a(eiy.i, 0.0F);
      this.a(eiy.n, 0.0F);
      this.a(eiy.o, 0.0F);
   }

   public static boolean c(bpc<cgl> $$0, cxa $$1, bps $$2, ib $$3, axd $$4) {
      ib.a $$5 = $$3.j();

      do {
         $$5.c(ih.b);
      } while ($$1.b_($$5).a(aus.b));

      return $$1.a_($$5).i();
   }

   @Override
   public void a(aim<?> $$0) {
      if (ce.equals($$0) && this.dM().B) {
         this.ch.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(ce, 0);
      $$0.a(cf, false);
      $$0.a(cg, false);
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      this.ch.a($$0);
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      this.ch.b($$0);
   }

   @Override
   public boolean i() {
      return this.ch.d();
   }

   @Override
   public boolean f() {
      return this.bA() && !this.o_();
   }

   @Override
   public void a(@Nullable atz $$0) {
      this.ch.a(true);
      if ($$0 != null) {
         this.dM().a(null, this, aty.xA, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   protected void z() {
      this.bR.a(1, new bxe(this, 1.65));
      this.bR.a(2, new bvx(this, 1.0));
      this.ci = new bxt(this, 1.4, cd, false);
      this.bR.a(3, this.ci);
      this.bR.a(4, new cgl.a(this, 1.0));
      this.bR.a(5, new bwk(this, 1.0));
      this.bR.a(7, new bxi(this, 1.0, 60));
      this.bR.a(8, new bwt(this, cis.class, 8.0F));
      this.bR.a(8, new bxg(this));
      this.bR.a(9, new bwt(this, cgl.class, 8.0F));
   }

   public void w(boolean $$0) {
      this.an.a(cf, $$0);
      bqr $$1 = this.f(bqv.r);
      if ($$1 != null) {
         if ($$0) {
            $$1.b(bY);
         } else {
            $$1.e(bY);
         }
      }
   }

   public boolean r() {
      return this.an.a(cf);
   }

   @Override
   public boolean a(ein $$0) {
      return $$0.a(aus.b);
   }

   @Override
   protected epr a(bow $$0, boz $$1, float $$2) {
      float $$3 = Math.min(0.25F, this.aT.a());
      float $$4 = this.aT.b();
      float $$5 = 0.12F * aww.b($$4 * 1.5F) * 2.0F * $$3;
      return super.a($$0, $$1, $$2).b(0.0, (double)($$5 * $$2), 0.0);
   }

   @Override
   public boolean a(cxc $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public bpo cN() {
      return (bpo)(this.i() && this.cQ() instanceof cis $$0 && $$0.b(cqn.nR) ? $$0 : super.cN());
   }

   @Override
   public epr b(bpo $$0) {
      epr[] $$1 = new epr[]{
         a((double)this.dg(), (double)$$0.dg(), $$0.dC()),
         a((double)this.dg(), (double)$$0.dg(), $$0.dC() - 22.5F),
         a((double)this.dg(), (double)$$0.dg(), $$0.dC() + 22.5F),
         a((double)this.dg(), (double)$$0.dg(), $$0.dC() - 45.0F),
         a((double)this.dg(), (double)$$0.dg(), $$0.dC() + 45.0F)
      };
      Set<ib> $$2 = Sets.newLinkedHashSet();
      double $$3 = this.cH().e;
      double $$4 = this.cH().b - 0.5;
      ib.a $$5 = new ib.a();

      for (epr $$6 : $$1) {
         $$5.b(this.dr() + $$6.c, $$3, this.dx() + $$6.e);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.i());
            $$5.c(ih.a);
         }
      }

      for (ib $$8 : $$2) {
         if (!this.dM().b_($$8).a(aus.b)) {
            double $$9 = this.dM().j($$8);
            if (cks.a($$9)) {
               epr $$10 = epr.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fF().iterator();

               while (var14.hasNext()) {
                  bpz $$11 = (bpz)var14.next();
                  epm $$12 = $$0.f($$11);
                  if (cks.a(this.dM(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new epr(this.dr(), this.cH().e, this.dx());
   }

   @Override
   protected void a(cis $$0, epr $$1) {
      this.a($$0.dC(), $$0.dE() * 0.5F);
      this.N = this.aX = this.aZ = this.dC();
      this.ch.b();
      super.a($$0, $$1);
   }

   @Override
   protected epr b(cis $$0, epr $$1) {
      return new epr(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cis $$0) {
      return (float)(this.g(bqv.r) * (double)(this.r() ? 0.35F : 0.55F) * (double)this.ch.c());
   }

   @Override
   protected float aM() {
      return this.Z + 0.6F;
   }

   @Override
   protected void b(ib $$0, dmz $$1) {
      this.a(this.bq() ? aty.xy : aty.xx, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.ch.a(this.ei());
   }

   @Override
   protected void a(double $$0, boolean $$1, dmz $$2, ib $$3) {
      this.aQ();
      if (this.bq()) {
         this.n();
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void l() {
      if (this.y() && this.ag.a(140) == 0) {
         this.b(aty.xt);
      } else if (this.gk() && this.ag.a(60) == 0) {
         this.b(aty.xu);
      }

      if (!this.gd()) {
         boolean $$2;
         boolean var10000;
         label36: {
            dmz $$0 = this.dM().a_(this.dm());
            dmz $$1 = this.bm();
            $$2 = $$0.a(aun.aU) || $$1.a(aun.aU) || this.b(aus.b) > 0.0;
            if (this.cZ() instanceof cgl $$3 && $$3.r()) {
               var10000 = true;
               break label36;
            }

            var10000 = false;
         }

         boolean $$4 = var10000;
         this.w(!$$2 || $$4);
      }

      super.l();
      this.gn();
      this.aQ();
   }

   private boolean y() {
      return this.ci != null && this.ci.i();
   }

   @Override
   protected boolean B() {
      return true;
   }

   private void gn() {
      if (this.bq()) {
         epw $$0 = epw.a(this);
         if ($$0.a(dep.d, this.dm(), true) && !this.dM().b_(this.dm().c()).a(aus.b)) {
            this.c(true);
         } else {
            this.g(this.dp().a(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static bqu.a s() {
      return bpq.A().a(bqv.r, 0.175F).a(bqv.k, 16.0);
   }

   @Override
   protected atx v() {
      return !this.gk() && !this.y() ? aty.xs : null;
   }

   @Override
   protected atx d(bnv $$0) {
      return aty.xw;
   }

   @Override
   protected atx n_() {
      return aty.xv;
   }

   @Override
   protected boolean r(bow $$0) {
      return !this.bP() && !this.a(aus.b);
   }

   @Override
   public boolean fm() {
      return true;
   }

   @Override
   public boolean bN() {
      return false;
   }

   @Override
   protected byz b(cwz $$0) {
      return new cgl.b(this, $$0);
   }

   @Override
   public float a(ib $$0, cxc $$1) {
      if ($$1.a_($$0).u().a(aus.b)) {
         return 10.0F;
      } else {
         return this.bq() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public cgl b(apf $$0, bor $$1) {
      return bpc.aY.a((cwz)$$0);
   }

   @Override
   public boolean o(cqk $$0) {
      return cc.a($$0);
   }

   @Override
   protected void eA() {
      super.eA();
      if (this.i()) {
         this.a(cqn.nK);
      }
   }

   @Override
   public bnc b(cis $$0, bnb $$1) {
      boolean $$2 = this.o($$0.b($$1));
      if (!$$2 && this.i() && !this.bP() && !$$0.fO()) {
         if (!this.dM().B) {
            $$0.n(this);
         }

         return bnc.a(this.dM().B);
      } else {
         bnc $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cqk $$4 = $$0.b($$1);
            return $$4.a(cqn.nK) ? $$4.a($$0, this, $$1) : bnc.d;
         } else {
            if ($$2 && !this.aU()) {
               this.dM().a(null, this.dr(), this.dt(), this.dx(), aty.xz, this.db(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public epr cJ() {
      return new epr(0.0, (double)(0.6F * this.cI()), (double)(this.dg() * 0.4F));
   }

   @Nullable
   @Override
   public bqg a(cxo $$0, bna $$1, bps $$2, @Nullable bqg $$3) {
      if (this.o_()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         axd $$4 = $$0.E_();
         if ($$4.a(30) == 0) {
            bpq $$5 = bpc.bw.a((cwz)$$0.E());
            if ($$5 != null) {
               $$3 = this.a($$0, $$1, $$5, new cgr.b(cgr.a($$4), false));
               $$5.a(bpd.a, new cqk(cqn.nR));
               this.a(null);
            }
         } else if ($$4.a(10) == 0) {
            bor $$6 = bpc.aY.a((cwz)$$0.E());
            if ($$6 != null) {
               $$6.c_(-24000);
               $$3 = this.a($$0, $$1, $$6, null);
            }
         } else {
            $$3 = new bor.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   private bqg a(cxo $$0, bna $$1, bpq $$2, @Nullable bqg $$3) {
      $$2.b(this.dr(), this.dt(), this.dx(), this.dC(), 0.0F);
      $$2.a($$0, $$1, bps.g, $$3);
      $$2.a(this, true);
      return new bor.a(0.0F);
   }

   static class a extends bwy {
      private final cgl g;

      a(cgl $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public ib k() {
         return this.e;
      }

      @Override
      public boolean b() {
         return !this.g.bq() && this.a(this.g.dM(), this.e);
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
      protected boolean a(cxc $$0, ib $$1) {
         return $$0.a_($$1).a(dac.H) && $$0.a_($$1.c()).a($$0, $$1, ejd.a);
      }
   }

   static class b extends byy {
      b(cgl $$0, cwz $$1) {
         super($$0, $$1);
      }

      @Override
      protected eje a(int $$0) {
         this.o = new ejh();
         this.o.a(true);
         return new eje(this.o, $$0);
      }

      @Override
      protected boolean a(eiy $$0) {
         return $$0 != eiy.i && $$0 != eiy.o && $$0 != eiy.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(ib $$0) {
         return this.b.a_($$0).a(dac.H) || super.a($$0);
      }
   }
}
