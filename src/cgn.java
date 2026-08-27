import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public class cgn extends cbe implements bpm, bqe {
   private static final UUID bX = UUID.fromString("9e362924-01de-4ddd-a2b2-d0f7a405a174");
   private static final bqu bY = new bqu(bX, "Strider suffocating modifier", -0.34F, bqu.a.b);
   private static final float ca = 0.35F;
   private static final float cb = 0.55F;
   private static final ctm cc = ctm.a(cqp.dC);
   private static final ctm cd = ctm.a(cqp.dC, cqp.nR);
   private static final aim<Integer> ce = aiq.a(cgn.class, aio.b);
   private static final aim<Boolean> cf = aiq.a(cgn.class, aio.k);
   private static final aim<Boolean> cg = aiq.a(cgn.class, aio.k);
   private final bpl ch = new bpl(this.an, ce, cg);
   @Nullable
   private bxu ci;

   public cgn(bpd<? extends cgn> $$0, cxb $$1) {
      super($$0, $$1);
      this.I = true;
      this.a(ejg.j, -1.0F);
      this.a(ejg.i, 0.0F);
      this.a(ejg.n, 0.0F);
      this.a(ejg.o, 0.0F);
   }

   public static boolean c(bpd<cgn> $$0, cxc $$1, bpt $$2, ib $$3, axd $$4) {
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
         this.dM().a(null, this, aty.xF, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   protected void z() {
      this.bR.a(1, new bxf(this, 1.65));
      this.bR.a(2, new bvy(this, 1.0));
      this.ci = new bxu(this, 1.4, cd, false);
      this.bR.a(3, this.ci);
      this.bR.a(4, new cgn.a(this, 1.0));
      this.bR.a(5, new bwl(this, 1.0));
      this.bR.a(7, new bxj(this, 1.0, 60));
      this.bR.a(8, new bwu(this, ciu.class, 8.0F));
      this.bR.a(8, new bxh(this));
      this.bR.a(9, new bwu(this, cgn.class, 8.0F));
   }

   public void w(boolean $$0) {
      this.an.a(cf, $$0);
      bqs $$1 = this.f(bqw.r);
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
   public boolean a(eip $$0) {
      return $$0.a(aus.b);
   }

   @Override
   protected ept a(box $$0, bpa $$1, float $$2) {
      float $$3 = Math.min(0.25F, this.aT.a());
      float $$4 = this.aT.b();
      float $$5 = 0.12F * aww.b($$4 * 1.5F) * 2.0F * $$3;
      return super.a($$0, $$1, $$2).b(0.0, (double)($$5 * $$2), 0.0);
   }

   @Override
   public boolean a(cxe $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public bpp cN() {
      return (bpp)(this.i() && this.cQ() instanceof ciu $$0 && $$0.b(cqp.nR) ? $$0 : super.cN());
   }

   @Override
   public ept b(bpp $$0) {
      ept[] $$1 = new ept[]{
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

      for (ept $$6 : $$1) {
         $$5.b(this.dr() + $$6.c, $$3, this.dx() + $$6.e);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.i());
            $$5.c(ih.a);
         }
      }

      for (ib $$8 : $$2) {
         if (!this.dM().b_($$8).a(aus.b)) {
            double $$9 = this.dM().j($$8);
            if (cku.a($$9)) {
               ept $$10 = ept.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fF().iterator();

               while (var14.hasNext()) {
                  bqa $$11 = (bqa)var14.next();
                  epo $$12 = $$0.f($$11);
                  if (cku.a(this.dM(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new ept(this.dr(), this.cH().e, this.dx());
   }

   @Override
   protected void a(ciu $$0, ept $$1) {
      this.a($$0.dC(), $$0.dE() * 0.5F);
      this.N = this.aX = this.aZ = this.dC();
      this.ch.b();
      super.a($$0, $$1);
   }

   @Override
   protected ept b(ciu $$0, ept $$1) {
      return new ept(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(ciu $$0) {
      return (float)(this.g(bqw.r) * (double)(this.r() ? 0.35F : 0.55F) * (double)this.ch.c());
   }

   @Override
   protected float aM() {
      return this.Z + 0.6F;
   }

   @Override
   protected void b(ib $$0, dnb $$1) {
      this.a(this.bq() ? aty.xD : aty.xC, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.ch.a(this.ei());
   }

   @Override
   protected void a(double $$0, boolean $$1, dnb $$2, ib $$3) {
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
         this.b(aty.xy);
      } else if (this.gk() && this.ag.a(60) == 0) {
         this.b(aty.xz);
      }

      if (!this.gd()) {
         boolean $$2;
         boolean var10000;
         label36: {
            dnb $$0 = this.dM().a_(this.dm());
            dnb $$1 = this.bm();
            $$2 = $$0.a(aun.aU) || $$1.a(aun.aU) || this.b(aus.b) > 0.0;
            if (this.cZ() instanceof cgn $$3 && $$3.r()) {
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
         epy $$0 = epy.a(this);
         if ($$0.a(der.d, this.dm(), true) && !this.dM().b_(this.dm().c()).a(aus.b)) {
            this.c(true);
         } else {
            this.g(this.dp().a(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static bqv.a s() {
      return bpr.A().a(bqw.r, 0.175F).a(bqw.k, 16.0);
   }

   @Override
   protected atx v() {
      return !this.gk() && !this.y() ? aty.xx : null;
   }

   @Override
   protected atx d(bnw $$0) {
      return aty.xB;
   }

   @Override
   protected atx n_() {
      return aty.xA;
   }

   @Override
   protected boolean r(box $$0) {
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
   protected bza b(cxb $$0) {
      return new cgn.b(this, $$0);
   }

   @Override
   public float a(ib $$0, cxe $$1) {
      if ($$1.a_($$0).u().a(aus.b)) {
         return 10.0F;
      } else {
         return this.bq() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public cgn b(apf $$0, bos $$1) {
      return bpd.aZ.a((cxb)$$0);
   }

   @Override
   public boolean o(cqm $$0) {
      return cc.a($$0);
   }

   @Override
   protected void eA() {
      super.eA();
      if (this.i()) {
         this.a(cqp.nK);
      }
   }

   @Override
   public bnd b(ciu $$0, bnc $$1) {
      boolean $$2 = this.o($$0.b($$1));
      if (!$$2 && this.i() && !this.bP() && !$$0.fO()) {
         if (!this.dM().B) {
            $$0.n(this);
         }

         return bnd.a(this.dM().B);
      } else {
         bnd $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cqm $$4 = $$0.b($$1);
            return $$4.a(cqp.nK) ? $$4.a($$0, this, $$1) : bnd.d;
         } else {
            if ($$2 && !this.aU()) {
               this.dM().a(null, this.dr(), this.dt(), this.dx(), aty.xE, this.db(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public ept cJ() {
      return new ept(0.0, (double)(0.6F * this.cI()), (double)(this.dg() * 0.4F));
   }

   @Nullable
   @Override
   public bqh a(cxq $$0, bnb $$1, bpt $$2, @Nullable bqh $$3) {
      if (this.o_()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         axd $$4 = $$0.E_();
         if ($$4.a(30) == 0) {
            bpr $$5 = bpd.bx.a((cxb)$$0.E());
            if ($$5 != null) {
               $$3 = this.a($$0, $$1, $$5, new cgt.b(cgt.a($$4), false));
               $$5.a(bpe.a, new cqm(cqp.nR));
               this.a(null);
            }
         } else if ($$4.a(10) == 0) {
            bos $$6 = bpd.aZ.a((cxb)$$0.E());
            if ($$6 != null) {
               $$6.c_(-24000);
               $$3 = this.a($$0, $$1, $$6, null);
            }
         } else {
            $$3 = new bos.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   private bqh a(cxq $$0, bnb $$1, bpr $$2, @Nullable bqh $$3) {
      $$2.b(this.dr(), this.dt(), this.dx(), this.dC(), 0.0F);
      $$2.a($$0, $$1, bpt.g, $$3);
      $$2.a(this, true);
      return new bos.a(0.0F);
   }

   static class a extends bwz {
      private final cgn g;

      a(cgn $$0, double $$1) {
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
      protected boolean a(cxe $$0, ib $$1) {
         return $$0.a_($$1).a(dae.H) && $$0.a_($$1.c()).a($$0, $$1, eje.a);
      }
   }

   static class b extends byz {
      b(cgn $$0, cxb $$1) {
         super($$0, $$1);
      }

      @Override
      protected ejf a(int $$0) {
         this.o = new ejj();
         this.o.a(true);
         return new ejf(this.o, $$0);
      }

      @Override
      protected boolean a(ejg $$0) {
         return $$0 != ejg.i && $$0 != ejg.o && $$0 != ejg.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(ib $$0) {
         return this.b.a_($$0).a(dae.H) || super.a($$0);
      }
   }
}
