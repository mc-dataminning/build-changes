import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cbn extends bwj implements bkv, blo {
   private static final UUID bT = UUID.fromString("9e362924-01de-4ddd-a2b2-d0f7a405a174");
   private static final bmc bU = new bmc(bT, "Strider suffocating modifier", -0.34F, bmc.a.b);
   private static final float bW = 0.35F;
   private static final float bX = 0.55F;
   private static final coc bY = coc.a(cle.dh);
   private static final coc bZ = coc.a(cle.dh, cle.ng);
   private static final afm<Integer> ca = afp.a(cbn.class, afo.b);
   private static final afm<Boolean> cb = afp.a(cbn.class, afo.k);
   private static final afm<Boolean> cc = afp.a(cbn.class, afo.k);
   private final bku cd = new bku(this.an, ca, cc);
   @Nullable
   private btb ce;

   public cbn(bkm<? extends cbn> $$0, crs $$1) {
      super($$0, $$1);
      this.I = true;
      this.a(ecr.j, -1.0F);
      this.a(ecr.i, 0.0F);
      this.a(ecr.n, 0.0F);
      this.a(ecr.o, 0.0F);
   }

   public static boolean c(bkm<cbn> $$0, crt $$1, blc $$2, ht $$3, ato $$4) {
      ht.a $$5 = $$3.j();

      do {
         $$5.c(hx.b);
      } while ($$1.b_($$5).a(arh.b));

      return $$1.a_($$5).i();
   }

   @Override
   public void a(afm<?> $$0) {
      if (ca.equals($$0) && this.dL().B) {
         this.cd.a();
      }

      super.a($$0);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(ca, 0);
      this.an.a(cb, false);
      this.an.a(cc, false);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      this.cd.a($$0);
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.cd.b($$0);
   }

   @Override
   public boolean i() {
      return this.cd.d();
   }

   @Override
   public boolean g() {
      return this.bv() && !this.n_();
   }

   @Override
   public void a(@Nullable aqo $$0) {
      this.cd.a(true);
      if ($$0 != null) {
         this.dL().a(null, this, aqn.wv, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   protected void z() {
      this.bO.a(1, new bsm(this, 1.65));
      this.bO.a(2, new brf(this, 1.0));
      this.ce = new btb(this, 1.4, bZ, false);
      this.bO.a(3, this.ce);
      this.bO.a(4, new cbn.a(this, 1.0));
      this.bO.a(5, new brs(this, 1.0));
      this.bO.a(7, new bsq(this, 1.0, 60));
      this.bO.a(8, new bsb(this, cdm.class, 8.0F));
      this.bO.a(8, new bso(this));
      this.bO.a(9, new bsb(this, cbn.class, 8.0F));
   }

   public void w(boolean $$0) {
      this.an.b(cb, $$0);
      bma $$1 = this.a(bme.m);
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
   public boolean a(ecg $$0) {
      return $$0.a(arh.b);
   }

   @Override
   protected Vector3f a(bki $$0, bkj $$1, float $$2) {
      float $$3 = Math.min(0.25F, this.aQ.a());
      float $$4 = this.aQ.b();
      float $$5 = 0.12F * ati.b($$4 * 1.5F) * 2.0F * $$3;
      return new Vector3f(0.0F, $$1.b + $$5 * $$2, 0.0F);
   }

   @Override
   public boolean a(crv $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public bky cN() {
      return (bky)(this.i() && this.cQ() instanceof cdm $$0 && $$0.b(cle.ng) ? $$0 : super.cN());
   }

   @Override
   public eji b(bky $$0) {
      eji[] $$1 = new eji[]{
         a((double)this.df(), (double)$$0.df(), $$0.dB()),
         a((double)this.df(), (double)$$0.df(), $$0.dB() - 22.5F),
         a((double)this.df(), (double)$$0.df(), $$0.dB() + 22.5F),
         a((double)this.df(), (double)$$0.df(), $$0.dB() - 45.0F),
         a((double)this.df(), (double)$$0.df(), $$0.dB() + 45.0F)
      };
      Set<ht> $$2 = Sets.newLinkedHashSet();
      double $$3 = this.cG().e;
      double $$4 = this.cG().b - 0.5;
      ht.a $$5 = new ht.a();

      for (eji $$6 : $$1) {
         $$5.b(this.dq() + $$6.c, $$3, this.dw() + $$6.e);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.i());
            $$5.c(hx.a);
         }
      }

      for (ht $$8 : $$2) {
         if (!this.dL().b_($$8).a(arh.b)) {
            double $$9 = this.dL().i($$8);
            if (cfi.a($$9)) {
               eji $$10 = eji.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fA().iterator();

               while (var14.hasNext()) {
                  blk $$11 = (blk)var14.next();
                  ejd $$12 = $$0.e($$11);
                  if (cfi.a(this.dL(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new eji(this.dq(), this.cG().e, this.dw());
   }

   @Override
   protected void a(cdm $$0, eji $$1) {
      this.a($$0.dB(), $$0.dD() * 0.5F);
      this.N = this.aU = this.aW = this.dB();
      this.cd.b();
      super.a($$0, $$1);
   }

   @Override
   protected eji b(cdm $$0, eji $$1) {
      return new eji(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cdm $$0) {
      return (float)(this.b(bme.m) * (double)(this.s() ? 0.35F : 0.55F) * (double)this.cd.c());
   }

   @Override
   protected float aK() {
      return this.Z + 0.6F;
   }

   @Override
   protected void b(ht $$0, dgw $$1) {
      this.a(this.bl() ? aqn.wt : aqn.ws, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.cd.a(this.ef());
   }

   @Override
   protected void a(double $$0, boolean $$1, dgw $$2, ht $$3) {
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
         this.a(aqn.wo, 1.0F, this.eW());
      } else if (this.gb() && this.ag.a(60) == 0) {
         this.a(aqn.wp, 1.0F, this.eW());
      }

      if (!this.fU()) {
         boolean $$2;
         boolean var10000;
         label36: {
            dgw $$0 = this.dL().a_(this.dl());
            dgw $$1 = this.bh();
            $$2 = $$0.a(arc.aT) || $$1.a(arc.aT) || this.b(arh.b) > 0.0;
            if (this.cY() instanceof cbn $$3 && $$3.s()) {
               var10000 = true;
               break label36;
            }

            var10000 = false;
         }

         boolean $$4 = var10000;
         this.w(!$$2 || $$4);
      }

      super.l();
      this.ge();
      this.aO();
   }

   private boolean y() {
      return this.ce != null && this.ce.i();
   }

   @Override
   protected boolean B() {
      return true;
   }

   private void ge() {
      if (this.bl()) {
         ejn $$0 = ejn.a(this);
         if ($$0.a(czi.d, this.dl(), true) && !this.dL().b_(this.dl().c()).a(arh.b)) {
            this.c(true);
         } else {
            this.f(this.do().a(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static bmd.a t() {
      return bla.A().a(bme.m, 0.175F).a(bme.g, 16.0);
   }

   @Override
   protected aqm w() {
      return !this.gb() && !this.y() ? aqn.wn : null;
   }

   @Override
   protected aqm d(bjg $$0) {
      return aqn.wr;
   }

   @Override
   protected aqm m_() {
      return aqn.wq;
   }

   @Override
   protected boolean r(bki $$0) {
      return !this.bO() && !this.a(arh.b);
   }

   @Override
   public boolean fg() {
      return true;
   }

   @Override
   public boolean bM() {
      return false;
   }

   @Override
   protected buh b(crs $$0) {
      return new cbn.b(this, $$0);
   }

   @Override
   public float a(ht $$0, crv $$1) {
      if ($$1.a_($$0).u().a(arh.b)) {
         return 10.0F;
      } else {
         return this.bl() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public cbn b(ama $$0, bkd $$1) {
      return bkm.aV.a((crs)$$0);
   }

   @Override
   public boolean m(clb $$0) {
      return bY.a($$0);
   }

   @Override
   protected void ex() {
      super.ex();
      if (this.i()) {
         this.a(cle.mZ);
      }
   }

   @Override
   public biq b(cdm $$0, bip $$1) {
      boolean $$2 = this.m($$0.b($$1));
      if (!$$2 && this.i() && !this.bO() && !$$0.fI()) {
         if (!this.dL().B) {
            $$0.n(this);
         }

         return biq.a(this.dL().B);
      } else {
         biq $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            clb $$4 = $$0.b($$1);
            return $$4.a(cle.mZ) ? $$4.a($$0, this, $$1) : biq.d;
         } else {
            if ($$2 && !this.aS()) {
               this.dL().a(null, this.dq(), this.ds(), this.dw(), aqn.wu, this.da(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public eji cI() {
      return new eji(0.0, (double)(0.6F * this.cH()), (double)(this.df() * 0.4F));
   }

   @Nullable
   @Override
   public blr a(csh $$0, bio $$1, blc $$2, @Nullable blr $$3, @Nullable rz $$4) {
      if (this.n_()) {
         return super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         ato $$5 = $$0.E_();
         if ($$5.a(30) == 0) {
            bla $$6 = bkm.bs.a((crs)$$0.C());
            if ($$6 != null) {
               $$3 = this.a($$0, $$1, $$6, new cbt.b(cbt.a($$5), false));
               $$6.a(bkn.a, new clb(cle.ng));
               this.a(null);
            }
         } else if ($$5.a(10) == 0) {
            bkd $$7 = bkm.aV.a((crs)$$0.C());
            if ($$7 != null) {
               $$7.c_(-24000);
               $$3 = this.a($$0, $$1, $$7, null);
            }
         } else {
            $$3 = new bkd.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   private blr a(csh $$0, bio $$1, bla $$2, @Nullable blr $$3) {
      $$2.b(this.dq(), this.ds(), this.dw(), this.dB(), 0.0F);
      $$2.a($$0, $$1, blc.g, $$3, null);
      $$2.a(this, true);
      return new bkd.a(0.0F);
   }

   static class a extends bsg {
      private final cbn g;

      a(cbn $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public ht k() {
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
      protected boolean a(crv $$0, ht $$1) {
         return $$0.a_($$1).a(cuv.H) && $$0.a_($$1.c()).a($$0, $$1, ecw.a);
      }
   }

   static class b extends bug {
      b(cbn $$0, crs $$1) {
         super($$0, $$1);
      }

      @Override
      protected ecx a(int $$0) {
         this.o = new eda();
         this.o.a(true);
         return new ecx(this.o, $$0);
      }

      @Override
      protected boolean a(ecr $$0) {
         return $$0 != ecr.i && $$0 != ecr.o && $$0 != ecr.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(ht $$0) {
         return this.b.a_($$0).a(cuv.H) || super.a($$0);
      }
   }
}
