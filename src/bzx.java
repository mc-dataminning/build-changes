import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzx extends but implements bjf, bjy {
   private static final UUID bT = UUID.fromString("9e362924-01de-4ddd-a2b2-d0f7a405a174");
   private static final bkm bU = new bkm(bT, "Strider suffocating modifier", -0.34F, bkm.a.b);
   private static final float bW = 0.35F;
   private static final float bX = 0.55F;
   private static final cmi bY = cmi.a(cjk.dh);
   private static final cmi bZ = cmi.a(cjk.dh, cjk.ng);
   private static final aeg<Integer> ca = aej.a(bzx.class, aei.b);
   private static final aeg<Boolean> cb = aej.a(bzx.class, aei.k);
   private static final aeg<Boolean> cc = aej.a(bzx.class, aei.k);
   private final bje cd = new bje(this.an, ca, cc);
   @Nullable
   private brl ce;

   public bzx(biw<? extends bzx> $$0, cpx $$1) {
      super($$0, $$1);
      this.I = true;
      this.a(eaz.j, -1.0F);
      this.a(eaz.i, 0.0F);
      this.a(eaz.n, 0.0F);
      this.a(eaz.o, 0.0F);
   }

   public static boolean c(biw<bzx> $$0, cpy $$1, bjm $$2, gw $$3, ase $$4) {
      gw.a $$5 = $$3.j();

      do {
         $$5.c(hc.b);
      } while ($$1.b_($$5).a(apz.b));

      return $$1.a_($$5).i();
   }

   @Override
   public void a(aeg<?> $$0) {
      if (ca.equals($$0) && this.dL().B) {
         this.cd.a();
      }

      super.a($$0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(ca, 0);
      this.an.a(cb, false);
      this.an.a(cc, false);
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      this.cd.a($$0);
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      this.cd.b($$0);
   }

   @Override
   public boolean i() {
      return this.cd.d();
   }

   @Override
   public boolean g() {
      return this.bv() && !this.m_();
   }

   @Override
   public void a(@Nullable apg $$0) {
      this.cd.a(true);
      if ($$0 != null) {
         this.dL().a(null, this, apf.wr, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   protected void z() {
      this.bO.a(1, new bqw(this, 1.65));
      this.bO.a(2, new bpp(this, 1.0));
      this.ce = new brl(this, 1.4, bZ, false);
      this.bO.a(3, this.ce);
      this.bO.a(4, new bzx.a(this, 1.0));
      this.bO.a(5, new bqc(this, 1.0));
      this.bO.a(7, new bra(this, 1.0, 60));
      this.bO.a(8, new bql(this, cbw.class, 8.0F));
      this.bO.a(8, new bqy(this));
      this.bO.a(9, new bql(this, bzx.class, 8.0F));
   }

   public void w(boolean $$0) {
      this.an.b(cb, $$0);
      bkk $$1 = this.a(bko.d);
      if ($$1 != null) {
         $$1.b(bT);
         if ($$0) {
            $$1.b(bU);
         }
      }
   }

   public boolean s() {
      return this.an.b(cb);
   }

   @Override
   public boolean a(eao $$0) {
      return $$0.a(apz.b);
   }

   @Override
   protected Vector3f a(bis $$0, bit $$1, float $$2) {
      float $$3 = Math.min(0.25F, this.aQ.a());
      float $$4 = this.aQ.b();
      float $$5 = 0.12F * ary.b($$4 * 1.5F) * 2.0F * $$3;
      return new Vector3f(0.0F, $$1.b + $$5 * $$2, 0.0F);
   }

   @Override
   public boolean a(cqa $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public bji cN() {
      return (bji)(this.i() && this.cQ() instanceof cbw $$0 && $$0.b(cjk.ng) ? $$0 : super.cN());
   }

   @Override
   public ehp b(bji $$0) {
      ehp[] $$1 = new ehp[]{
         a((double)this.df(), (double)$$0.df(), $$0.dB()),
         a((double)this.df(), (double)$$0.df(), $$0.dB() - 22.5F),
         a((double)this.df(), (double)$$0.df(), $$0.dB() + 22.5F),
         a((double)this.df(), (double)$$0.df(), $$0.dB() - 45.0F),
         a((double)this.df(), (double)$$0.df(), $$0.dB() + 45.0F)
      };
      Set<gw> $$2 = Sets.newLinkedHashSet();
      double $$3 = this.cG().e;
      double $$4 = this.cG().b - 0.5;
      gw.a $$5 = new gw.a();

      for (ehp $$6 : $$1) {
         $$5.b(this.dq() + $$6.c, $$3, this.dw() + $$6.e);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.i());
            $$5.c(hc.a);
         }
      }

      for (gw $$8 : $$2) {
         if (!this.dL().b_($$8).a(apz.b)) {
            double $$9 = this.dL().i($$8);
            if (cds.a($$9)) {
               ehp $$10 = ehp.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fz().iterator();

               while (var14.hasNext()) {
                  bju $$11 = (bju)var14.next();
                  ehk $$12 = $$0.e($$11);
                  if (cds.a(this.dL(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new ehp(this.dq(), this.cG().e, this.dw());
   }

   @Override
   protected void a(cbw $$0, ehp $$1) {
      this.a($$0.dB(), $$0.dD() * 0.5F);
      this.N = this.aU = this.aW = this.dB();
      this.cd.b();
      super.a($$0, $$1);
   }

   @Override
   protected ehp b(cbw $$0, ehp $$1) {
      return new ehp(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cbw $$0) {
      return (float)(this.b(bko.d) * (double)(this.s() ? 0.35F : 0.55F) * (double)this.cd.c());
   }

   @Override
   protected float aK() {
      return this.Z + 0.6F;
   }

   @Override
   protected void b(gw $$0, dfl $$1) {
      this.a(this.bl() ? apf.wp : apf.wo, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.cd.a(this.ef());
   }

   @Override
   protected void a(double $$0, boolean $$1, dfl $$2, gw $$3) {
      this.aO();
      if (this.bl()) {
         this.n();
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void l() {
      if (this.y() && this.ag.a(140) == 0) {
         this.a(apf.wk, 1.0F, this.eW());
      } else if (this.ga() && this.ag.a(60) == 0) {
         this.a(apf.wl, 1.0F, this.eW());
      }

      if (!this.fT()) {
         boolean $$2;
         boolean var10000;
         label36: {
            dfl $$0 = this.dL().a_(this.dl());
            dfl $$1 = this.bh();
            $$2 = $$0.a(apu.aT) || $$1.a(apu.aT) || this.b(apz.b) > 0.0;
            if (this.cY() instanceof bzx $$3 && $$3.s()) {
               var10000 = true;
               break label36;
            }

            var10000 = false;
         }

         boolean $$4 = var10000;
         this.w(!$$2 || $$4);
      }

      super.l();
      this.gd();
      this.aO();
   }

   private boolean y() {
      return this.ce != null && this.ce.i();
   }

   @Override
   protected boolean B() {
      return true;
   }

   private void gd() {
      if (this.bl()) {
         ehu $$0 = ehu.a(this);
         if ($$0.a(cxk.c, this.dl(), true) && !this.dL().b_(this.dl().c()).a(apz.b)) {
            this.c(true);
         } else {
            this.f(this.do().a(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static bkn.a t() {
      return bjk.A().a(bko.d, 0.175F).a(bko.b, 16.0);
   }

   @Override
   protected ape w() {
      return !this.ga() && !this.y() ? apf.wj : null;
   }

   @Override
   protected ape d(bhq $$0) {
      return apf.wn;
   }

   @Override
   protected ape l_() {
      return apf.wm;
   }

   @Override
   protected boolean r(bis $$0) {
      return !this.bO() && !this.a(apz.b);
   }

   @Override
   public boolean ff() {
      return true;
   }

   @Override
   public boolean bM() {
      return false;
   }

   @Override
   protected bsr b(cpx $$0) {
      return new bzx.b(this, $$0);
   }

   @Override
   public float a(gw $$0, cqa $$1) {
      if ($$1.a_($$0).u().a(apz.b)) {
         return 10.0F;
      } else {
         return this.bl() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public bzx b(aks $$0, bin $$1) {
      return biw.aV.a((cpx)$$0);
   }

   @Override
   public boolean m(cjh $$0) {
      return bY.a($$0);
   }

   @Override
   protected void ex() {
      super.ex();
      if (this.i()) {
         this.a(cjk.mZ);
      }
   }

   @Override
   public bha b(cbw $$0, bgz $$1) {
      boolean $$2 = this.m($$0.b($$1));
      if (!$$2 && this.i() && !this.bO() && !$$0.fH()) {
         if (!this.dL().B) {
            $$0.n(this);
         }

         return bha.a(this.dL().B);
      } else {
         bha $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cjh $$4 = $$0.b($$1);
            return $$4.a(cjk.mZ) ? $$4.a($$0, this, $$1) : bha.d;
         } else {
            if ($$2 && !this.aS()) {
               this.dL().a(null, this.dq(), this.ds(), this.dw(), apf.wq, this.da(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public ehp cI() {
      return new ehp(0.0, (double)(0.6F * this.cH()), (double)(this.df() * 0.4F));
   }

   @Nullable
   @Override
   public bkb a(cqm $$0, bgy $$1, bjm $$2, @Nullable bkb $$3, @Nullable qy $$4) {
      if (this.m_()) {
         return super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         ase $$5 = $$0.D_();
         if ($$5.a(30) == 0) {
            bjk $$6 = biw.bs.a((cpx)$$0.C());
            if ($$6 != null) {
               $$3 = this.a($$0, $$1, $$6, new cad.b(cad.a($$5), false));
               $$6.a(bix.a, new cjh(cjk.ng));
               this.a(null);
            }
         } else if ($$5.a(10) == 0) {
            bin $$7 = biw.aV.a((cpx)$$0.C());
            if ($$7 != null) {
               $$7.c_(-24000);
               $$3 = this.a($$0, $$1, $$7, null);
            }
         } else {
            $$3 = new bin.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   private bkb a(cqm $$0, bgy $$1, bjk $$2, @Nullable bkb $$3) {
      $$2.b(this.dq(), this.ds(), this.dw(), this.dB(), 0.0F);
      $$2.a($$0, $$1, bjm.g, $$3, null);
      $$2.a(this, true);
      return new bin.a(0.0F);
   }

   static class a extends bqq {
      private final bzx g;

      a(bzx $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public gw k() {
         return this.e;
      }

      @Override
      public boolean b() {
         return !this.g.bl() && this.a(this.g.dL(), this.e);
      }

      @Override
      public boolean a() {
         return !this.g.bl() && super.a();
      }

      @Override
      public boolean l() {
         return this.d % 20 == 0;
      }

      @Override
      protected boolean a(cqa $$0, gw $$1) {
         return $$0.a_($$1).a(csy.H) && $$0.a_($$1.c()).a($$0, $$1, ebe.a);
      }
   }

   static class b extends bsq {
      b(bzx $$0, cpx $$1) {
         super($$0, $$1);
      }

      @Override
      protected ebf a(int $$0) {
         this.o = new ebi();
         this.o.a(true);
         return new ebf(this.o, $$0);
      }

      @Override
      protected boolean a(eaz $$0) {
         return $$0 != eaz.i && $$0 != eaz.o && $$0 != eaz.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(gw $$0) {
         return this.b.a_($$0).a(csy.H) || super.a($$0);
      }
   }
}
