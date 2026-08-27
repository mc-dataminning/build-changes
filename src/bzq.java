import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzq extends bum implements biy, bjr {
   private static final UUID bT = UUID.fromString("9e362924-01de-4ddd-a2b2-d0f7a405a174");
   private static final bkf bU = new bkf(bT, "Strider suffocating modifier", -0.34F, bkf.a.b);
   private static final float bW = 0.35F;
   private static final float bX = 0.55F;
   private static final cmb bY = cmb.a(cjd.dh);
   private static final cmb bZ = cmb.a(cjd.dh, cjd.ng);
   private static final aec<Integer> ca = aef.a(bzq.class, aee.b);
   private static final aec<Boolean> cb = aef.a(bzq.class, aee.k);
   private static final aec<Boolean> cc = aef.a(bzq.class, aee.k);
   private final bix cd = new bix(this.an, ca, cc);
   @Nullable
   private bre ce;

   public bzq(bip<? extends bzq> $$0, cpq $$1) {
      super($$0, $$1);
      this.I = true;
      this.a(eas.j, -1.0F);
      this.a(eas.i, 0.0F);
      this.a(eas.n, 0.0F);
      this.a(eas.o, 0.0F);
   }

   public static boolean c(bip<bzq> $$0, cpr $$1, bjf $$2, gw $$3, arx $$4) {
      gw.a $$5 = $$3.j();

      do {
         $$5.c(hc.b);
      } while ($$1.b_($$5).a(apt.b));

      return $$1.a_($$5).i();
   }

   @Override
   public void a(aec<?> $$0) {
      if (ca.equals($$0) && this.dK().B) {
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
   public void b(qu $$0) {
      super.b($$0);
      this.cd.a($$0);
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      this.cd.b($$0);
   }

   @Override
   public boolean i() {
      return this.cd.d();
   }

   @Override
   public boolean g() {
      return this.bv() && !this.i_();
   }

   @Override
   public void a(@Nullable apa $$0) {
      this.cd.a(true);
      if ($$0 != null) {
         this.dK().a(null, this, aoz.wr, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   protected void w() {
      this.bO.a(1, new bqp(this, 1.65));
      this.bO.a(2, new bpi(this, 1.0));
      this.ce = new bre(this, 1.4, bZ, false);
      this.bO.a(3, this.ce);
      this.bO.a(4, new bzq.a(this, 1.0));
      this.bO.a(5, new bpv(this, 1.0));
      this.bO.a(7, new bqt(this, 1.0, 60));
      this.bO.a(8, new bqe(this, cbp.class, 8.0F));
      this.bO.a(8, new bqr(this));
      this.bO.a(9, new bqe(this, bzq.class, 8.0F));
   }

   public void w(boolean $$0) {
      this.an.b(cb, $$0);
      bkd $$1 = this.a(bkh.d);
      if ($$1 != null) {
         $$1.b(bT);
         if ($$0) {
            $$1.b(bU);
         }
      }
   }

   @Override
   public boolean p() {
      return this.an.b(cb);
   }

   @Override
   public boolean a(eah $$0) {
      return $$0.a(apt.b);
   }

   @Override
   protected Vector3f a(bil $$0, bim $$1, float $$2) {
      float $$3 = Math.min(0.25F, this.aQ.a());
      float $$4 = this.aQ.b();
      float $$5 = 0.12F * ars.b($$4 * 1.5F) * 2.0F * $$3;
      return new Vector3f(0.0F, $$1.b + $$5 * $$2, 0.0F);
   }

   @Override
   public boolean a(cpt $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public bjb cN() {
      return (bjb)(this.i() && this.cQ() instanceof cbp $$0 && $$0.b(cjd.ng) ? $$0 : super.cN());
   }

   @Override
   public ehi b(bjb $$0) {
      ehi[] $$1 = new ehi[]{
         a((double)this.df(), (double)$$0.df(), $$0.dA()),
         a((double)this.df(), (double)$$0.df(), $$0.dA() - 22.5F),
         a((double)this.df(), (double)$$0.df(), $$0.dA() + 22.5F),
         a((double)this.df(), (double)$$0.df(), $$0.dA() - 45.0F),
         a((double)this.df(), (double)$$0.df(), $$0.dA() + 45.0F)
      };
      Set<gw> $$2 = Sets.newLinkedHashSet();
      double $$3 = this.cG().e;
      double $$4 = this.cG().b - 0.5;
      gw.a $$5 = new gw.a();

      for (ehi $$6 : $$1) {
         $$5.b(this.dp() + $$6.c, $$3, this.dv() + $$6.e);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.i());
            $$5.c(hc.a);
         }
      }

      for (gw $$8 : $$2) {
         if (!this.dK().b_($$8).a(apt.b)) {
            double $$9 = this.dK().i($$8);
            if (cdl.a($$9)) {
               ehi $$10 = ehi.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fy().iterator();

               while (var14.hasNext()) {
                  bjn $$11 = (bjn)var14.next();
                  ehd $$12 = $$0.e($$11);
                  if (cdl.a(this.dK(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new ehi(this.dp(), this.cG().e, this.dv());
   }

   @Override
   protected void a(cbp $$0, ehi $$1) {
      this.a($$0.dA(), $$0.dC() * 0.5F);
      this.N = this.aU = this.aW = this.dA();
      this.cd.b();
      super.a($$0, $$1);
   }

   @Override
   protected ehi b(cbp $$0, ehi $$1) {
      return new ehi(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cbp $$0) {
      return (float)(this.b(bkh.d) * (double)(this.p() ? 0.35F : 0.55F) * (double)this.cd.c());
   }

   @Override
   protected float aK() {
      return this.Z + 0.6F;
   }

   @Override
   protected void b(gw $$0, dfe $$1) {
      this.a(this.bl() ? aoz.wp : aoz.wo, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.cd.a(this.ee());
   }

   @Override
   protected void a(double $$0, boolean $$1, dfe $$2, gw $$3) {
      this.aO();
      if (this.bl()) {
         this.n();
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void l() {
      if (this.t() && this.ag.a(140) == 0) {
         this.a(aoz.wk, 1.0F, this.eV());
      } else if (this.fX() && this.ag.a(60) == 0) {
         this.a(aoz.wl, 1.0F, this.eV());
      }

      if (!this.fQ()) {
         boolean $$2;
         boolean var10000;
         label36: {
            dfe $$0 = this.dK().a_(this.dk());
            dfe $$1 = this.bh();
            $$2 = $$0.a(apo.aT) || $$1.a(apo.aT) || this.b(apt.b) > 0.0;
            if (this.cY() instanceof bzq $$3 && $$3.p()) {
               var10000 = true;
               break label36;
            }

            var10000 = false;
         }

         boolean $$4 = var10000;
         this.w(!$$2 || $$4);
      }

      super.l();
      this.ga();
      this.aO();
   }

   private boolean t() {
      return this.ce != null && this.ce.i();
   }

   @Override
   protected boolean y() {
      return true;
   }

   private void ga() {
      if (this.bl()) {
         ehn $$0 = ehn.a(this);
         if ($$0.a(cxd.c, this.dk(), true) && !this.dK().b_(this.dk().c()).a(apt.b)) {
            this.c(true);
         } else {
            this.f(this.dn().a(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static bkg.a q() {
      return bjd.x().a(bkh.d, 0.175F).a(bkh.b, 16.0);
   }

   @Override
   protected aoy r() {
      return !this.fX() && !this.t() ? aoz.wj : null;
   }

   @Override
   protected aoy d(bhj $$0) {
      return aoz.wn;
   }

   @Override
   protected aoy h_() {
      return aoz.wm;
   }

   @Override
   protected boolean r(bil $$0) {
      return !this.bO() && !this.a(apt.b);
   }

   @Override
   public boolean fe() {
      return true;
   }

   @Override
   public boolean bM() {
      return false;
   }

   @Override
   protected bsk b(cpq $$0) {
      return new bzq.b(this, $$0);
   }

   @Override
   public float a(gw $$0, cpt $$1) {
      if ($$1.a_($$0).u().a(apt.b)) {
         return 10.0F;
      } else {
         return this.bl() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public bzq b(akn $$0, big $$1) {
      return bip.aV.a((cpq)$$0);
   }

   @Override
   public boolean m(cja $$0) {
      return bY.a($$0);
   }

   @Override
   protected void ew() {
      super.ew();
      if (this.i()) {
         this.a(cjd.mZ);
      }
   }

   @Override
   public bgt b(cbp $$0, bgs $$1) {
      boolean $$2 = this.m($$0.b($$1));
      if (!$$2 && this.i() && !this.bO() && !$$0.fG()) {
         if (!this.dK().B) {
            $$0.n(this);
         }

         return bgt.a(this.dK().B);
      } else {
         bgt $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cja $$4 = $$0.b($$1);
            return $$4.a(cjd.mZ) ? $$4.a($$0, this, $$1) : bgt.d;
         } else {
            if ($$2 && !this.aS()) {
               this.dK().a(null, this.dp(), this.dr(), this.dv(), aoz.wq, this.da(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public ehi cI() {
      return new ehi(0.0, (double)(0.6F * this.cH()), (double)(this.df() * 0.4F));
   }

   @Nullable
   @Override
   public bju a(cqf $$0, bgr $$1, bjf $$2, @Nullable bju $$3, @Nullable qu $$4) {
      if (this.i_()) {
         return super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         arx $$5 = $$0.y_();
         if ($$5.a(30) == 0) {
            bjd $$6 = bip.bs.a((cpq)$$0.C());
            if ($$6 != null) {
               $$3 = this.a($$0, $$1, $$6, new bzw.b(bzw.a($$5), false));
               $$6.a(biq.a, new cja(cjd.ng));
               this.a(null);
            }
         } else if ($$5.a(10) == 0) {
            big $$7 = bip.aV.a((cpq)$$0.C());
            if ($$7 != null) {
               $$7.c_(-24000);
               $$3 = this.a($$0, $$1, $$7, null);
            }
         } else {
            $$3 = new big.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   private bju a(cqf $$0, bgr $$1, bjd $$2, @Nullable bju $$3) {
      $$2.b(this.dp(), this.dr(), this.dv(), this.dA(), 0.0F);
      $$2.a($$0, $$1, bjf.g, $$3, null);
      $$2.a(this, true);
      return new big.a(0.0F);
   }

   static class a extends bqj {
      private final bzq g;

      a(bzq $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public gw k() {
         return this.e;
      }

      @Override
      public boolean b() {
         return !this.g.bl() && this.a(this.g.dK(), this.e);
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
      protected boolean a(cpt $$0, gw $$1) {
         return $$0.a_($$1).a(csr.H) && $$0.a_($$1.c()).a($$0, $$1, eax.a);
      }
   }

   static class b extends bsj {
      b(bzq $$0, cpq $$1) {
         super($$0, $$1);
      }

      @Override
      protected eay a(int $$0) {
         this.o = new ebb();
         this.o.a(true);
         return new eay(this.o, $$0);
      }

      @Override
      protected boolean a(eas $$0) {
         return $$0 != eas.i && $$0 != eas.o && $$0 != eas.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(gw $$0) {
         return this.b.a_($$0).a(csr.H) || super.a($$0);
      }
   }
}
