import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public class chm extends ccd implements bql, brd {
   private static final UUID bX = UUID.fromString("9e362924-01de-4ddd-a2b2-d0f7a405a174");
   private static final brt bY = new brt(bX, "Strider suffocating modifier", -0.34F, brt.a.b);
   private static final float ca = 0.35F;
   private static final float cb = 0.55F;
   private static final cvg cc = cvg.a(crm.dC);
   private static final cvg cd = cvg.a(crm.dC, crm.nR);
   private static final aiy<Integer> ce = ajc.a(chm.class, aja.b);
   private static final aiy<Boolean> cf = ajc.a(chm.class, aja.k);
   private static final aiy<Boolean> cg = ajc.a(chm.class, aja.k);
   private final bqk ch = new bqk(this.an, ce, cg);
   @Nullable
   private byt ci;

   public chm(bqb<? extends chm> $$0, cyx $$1) {
      super($$0, $$1);
      this.I = true;
      this.a(elj.j, -1.0F);
      this.a(elj.i, 0.0F);
      this.a(elj.n, 0.0F);
      this.a(elj.o, 0.0F);
   }

   public static boolean c(bqb<chm> $$0, cyy $$1, bqs $$2, ib $$3, axr $$4) {
      ib.a $$5 = $$3.j();

      do {
         $$5.c(ih.b);
      } while ($$1.b_($$5).a(avh.b));

      return $$1.a_($$5).i();
   }

   @Override
   public void a(aiy<?> $$0) {
      if (ce.equals($$0) && this.dM().B) {
         this.ch.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(ce, 0);
      $$0.a(cf, false);
      $$0.a(cg, false);
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      this.ch.a($$0);
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      this.ch.b($$0);
   }

   @Override
   public boolean i() {
      return this.ch.d();
   }

   @Override
   public boolean f() {
      return this.bA() && !this.p_();
   }

   @Override
   public void a(@Nullable aun $$0) {
      this.ch.a(true);
      if ($$0 != null) {
         this.dM().a(null, this, aum.xI, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   protected void z() {
      this.bR.a(1, new bye(this, 1.65));
      this.bR.a(2, new bwx(this, 1.0));
      this.ci = new byt(this, 1.4, cd, false);
      this.bR.a(3, this.ci);
      this.bR.a(4, new chm.a(this, 1.0));
      this.bR.a(5, new bxk(this, 1.0));
      this.bR.a(7, new byi(this, 1.0, 60));
      this.bR.a(8, new bxt(this, cjt.class, 8.0F));
      this.bR.a(8, new byg(this));
      this.bR.a(9, new bxt(this, chm.class, 8.0F));
   }

   public void w(boolean $$0) {
      this.an.a(cf, $$0);
      brr $$1 = this.f(brv.r);
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
   public boolean a(eks $$0) {
      return $$0.a(avh.b);
   }

   @Override
   protected esa a(bpv $$0, bpy $$1, float $$2) {
      float $$3 = Math.min(0.25F, this.aT.a());
      float $$4 = this.aT.b();
      float $$5 = 0.12F * axk.b($$4 * 1.5F) * 2.0F * $$3;
      return super.a($$0, $$1, $$2).b(0.0, (double)($$5 * $$2), 0.0);
   }

   @Override
   public boolean a(cza $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public bqo cN() {
      return (bqo)(this.i() && this.cQ() instanceof cjt $$0 && $$0.b(crm.nR) ? $$0 : super.cN());
   }

   @Override
   public esa b(bqo $$0) {
      esa[] $$1 = new esa[]{
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

      for (esa $$6 : $$1) {
         $$5.b(this.dr() + $$6.c, $$3, this.dx() + $$6.e);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.i());
            $$5.c(ih.a);
         }
      }

      for (ib $$8 : $$2) {
         if (!this.dM().b_($$8).a(avh.b)) {
            double $$9 = this.dM().j($$8);
            if (clt.a($$9)) {
               esa $$10 = esa.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fF().iterator();

               while (var14.hasNext()) {
                  bqz $$11 = (bqz)var14.next();
                  erv $$12 = $$0.f($$11);
                  if (clt.a(this.dM(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new esa(this.dr(), this.cH().e, this.dx());
   }

   @Override
   protected void a(cjt $$0, esa $$1) {
      this.a($$0.dC(), $$0.dE() * 0.5F);
      this.N = this.aX = this.aZ = this.dC();
      this.ch.b();
      super.a($$0, $$1);
   }

   @Override
   protected esa b(cjt $$0, esa $$1) {
      return new esa(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cjt $$0) {
      return (float)(this.g(brv.r) * (double)(this.r() ? 0.35F : 0.55F) * (double)this.ch.c());
   }

   @Override
   protected float aM() {
      return this.Z + 0.6F;
   }

   @Override
   protected void b(ib $$0, doz $$1) {
      this.a(this.bq() ? aum.xG : aum.xF, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.ch.a(this.ei());
   }

   @Override
   protected void a(double $$0, boolean $$1, doz $$2, ib $$3) {
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
         this.b(aum.xB);
      } else if (this.gk() && this.ag.a(60) == 0) {
         this.b(aum.xC);
      }

      if (!this.gd()) {
         boolean $$2;
         boolean var10000;
         label36: {
            doz $$0 = this.dM().a_(this.dm());
            doz $$1 = this.bm();
            $$2 = $$0.a(avc.aU) || $$1.a(avc.aU) || this.b(avh.b) > 0.0;
            if (this.cZ() instanceof chm $$3 && $$3.r()) {
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
         esf $$0 = esf.a(this);
         if ($$0.a(dgn.d, this.dm(), true) && !this.dM().b_(this.dm().c()).a(avh.b)) {
            this.c(true);
         } else {
            this.g(this.dp().a(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static bru.a u() {
      return bqq.A().a(brv.r, 0.175F).a(brv.k, 16.0);
   }

   @Override
   protected aul v() {
      return !this.gk() && !this.y() ? aum.xA : null;
   }

   @Override
   protected aul d(bot $$0) {
      return aum.xE;
   }

   @Override
   protected aul o_() {
      return aum.xD;
   }

   @Override
   protected boolean r(bpv $$0) {
      return !this.bP() && !this.a(avh.b);
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
   protected bzz b(cyx $$0) {
      return new chm.b(this, $$0);
   }

   @Override
   public float a(ib $$0, cza $$1) {
      if ($$1.a_($$0).u().a(avh.b)) {
         return 10.0F;
      } else {
         return this.bq() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public chm b(aps $$0, bpp $$1) {
      return bqb.aY.a((cyx)$$0);
   }

   @Override
   public boolean o(crj $$0) {
      return cc.a($$0);
   }

   @Override
   protected void eA() {
      super.eA();
      if (this.i()) {
         this.a(crm.nK);
      }
   }

   @Override
   public boa b(cjt $$0, bnz $$1) {
      boolean $$2 = this.o($$0.b($$1));
      if (!$$2 && this.i() && !this.bP() && !$$0.fO()) {
         if (!this.dM().B) {
            $$0.n(this);
         }

         return boa.a(this.dM().B);
      } else {
         boa $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            crj $$4 = $$0.b($$1);
            return $$4.a(crm.nK) ? $$4.a($$0, this, $$1) : boa.d;
         } else {
            if ($$2 && !this.aU()) {
               this.dM().a(null, this.dr(), this.dt(), this.dx(), aum.xH, this.db(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public esa cJ() {
      return new esa(0.0, (double)(0.6F * this.cI()), (double)(this.dg() * 0.4F));
   }

   @Nullable
   @Override
   public brg a(czm $$0, bny $$1, bqs $$2, @Nullable brg $$3) {
      if (this.p_()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         axr $$4 = $$0.E_();
         if ($$4.a(30) == 0) {
            bqq $$5 = bqb.bw.a((cyx)$$0.E());
            if ($$5 != null) {
               $$3 = this.a($$0, $$1, $$5, new chs.b(chs.a($$4), false));
               $$5.a(bqc.a, new crj(crm.nR));
               this.a(null);
            }
         } else if ($$4.a(10) == 0) {
            bpp $$6 = bqb.aY.a((cyx)$$0.E());
            if ($$6 != null) {
               $$6.c_(-24000);
               $$3 = this.a($$0, $$1, $$6, null);
            }
         } else {
            $$3 = new bpp.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   private brg a(czm $$0, bny $$1, bqq $$2, @Nullable brg $$3) {
      $$2.b(this.dr(), this.dt(), this.dx(), this.dC(), 0.0F);
      $$2.a($$0, $$1, bqs.g, $$3);
      $$2.a(this, true);
      return new bpp.a(0.0F);
   }

   static class a extends bxy {
      private final chm g;

      a(chm $$0, double $$1) {
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
      protected boolean a(cza $$0, ib $$1) {
         return $$0.a_($$1).a(dca.H) && $$0.a_($$1.c()).a(elh.a);
      }
   }

   static class b extends bzy {
      b(chm $$0, cyx $$1) {
         super($$0, $$1);
      }

      @Override
      protected eli a(int $$0) {
         this.o = new elo();
         this.o.a(true);
         return new eli(this.o, $$0);
      }

      @Override
      protected boolean a(elj $$0) {
         return $$0 != elj.i && $$0 != elj.o && $$0 != elj.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(ib $$0) {
         return this.b.a_($$0).a(dca.H) || super.a($$0);
      }
   }
}
