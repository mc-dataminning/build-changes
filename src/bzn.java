import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzn extends buj implements biv, bjo {
   private static final UUID bT = UUID.fromString("9e362924-01de-4ddd-a2b2-d0f7a405a174");
   private static final bkc bU = new bkc(bT, "Strider suffocating modifier", -0.34F, bkc.a.b);
   private static final float bW = 0.35F;
   private static final float bX = 0.55F;
   private static final clx bY = clx.a(cja.dh);
   private static final clx bZ = clx.a(cja.dh, cja.ng);
   private static final adz<Integer> ca = aec.a(bzn.class, aeb.b);
   private static final adz<Boolean> cb = aec.a(bzn.class, aeb.k);
   private static final adz<Boolean> cc = aec.a(bzn.class, aeb.k);
   private final biu cd = new biu(this.an, ca, cc);
   @Nullable
   private brb ce;

   public bzn(bim<? extends bzn> $$0, cpl $$1) {
      super($$0, $$1);
      this.I = true;
      this.a(ean.j, -1.0F);
      this.a(ean.i, 0.0F);
      this.a(ean.n, 0.0F);
      this.a(ean.o, 0.0F);
   }

   public static boolean c(bim<bzn> $$0, cpm $$1, bjc $$2, gu $$3, aru $$4) {
      gu.a $$5 = $$3.j();

      do {
         $$5.c(ha.b);
      } while ($$1.b_($$5).a(apq.b));

      return $$1.a_($$5).i();
   }

   @Override
   public void a(adz<?> $$0) {
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
   public void b(qr $$0) {
      super.b($$0);
      this.cd.a($$0);
   }

   @Override
   public void a(qr $$0) {
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
   public void a(@Nullable aox $$0) {
      this.cd.a(true);
      if ($$0 != null) {
         this.dK().a(null, this, aow.wr, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   protected void w() {
      this.bO.a(1, new bqm(this, 1.65));
      this.bO.a(2, new bpf(this, 1.0));
      this.ce = new brb(this, 1.4, bZ, false);
      this.bO.a(3, this.ce);
      this.bO.a(4, new bzn.a(this, 1.0));
      this.bO.a(5, new bps(this, 1.0));
      this.bO.a(7, new bqq(this, 1.0, 60));
      this.bO.a(8, new bqb(this, cbm.class, 8.0F));
      this.bO.a(8, new bqo(this));
      this.bO.a(9, new bqb(this, bzn.class, 8.0F));
   }

   public void w(boolean $$0) {
      this.an.b(cb, $$0);
      bka $$1 = this.a(bke.d);
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
   public boolean a(eac $$0) {
      return $$0.a(apq.b);
   }

   @Override
   protected Vector3f a(bii $$0, bij $$1, float $$2) {
      float $$3 = Math.min(0.25F, this.aQ.a());
      float $$4 = this.aQ.b();
      float $$5 = 0.12F * arp.b($$4 * 1.5F) * 2.0F * $$3;
      return new Vector3f(0.0F, $$1.b + $$5 * $$2, 0.0F);
   }

   @Override
   public boolean a(cpo $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public biy cN() {
      return (biy)(this.i() && this.cQ() instanceof cbm $$0 && $$0.b(cja.ng) ? $$0 : super.cN());
   }

   @Override
   public ehd b(biy $$0) {
      ehd[] $$1 = new ehd[]{
         a((double)this.df(), (double)$$0.df(), $$0.dA()),
         a((double)this.df(), (double)$$0.df(), $$0.dA() - 22.5F),
         a((double)this.df(), (double)$$0.df(), $$0.dA() + 22.5F),
         a((double)this.df(), (double)$$0.df(), $$0.dA() - 45.0F),
         a((double)this.df(), (double)$$0.df(), $$0.dA() + 45.0F)
      };
      Set<gu> $$2 = Sets.newLinkedHashSet();
      double $$3 = this.cG().e;
      double $$4 = this.cG().b - 0.5;
      gu.a $$5 = new gu.a();

      for (ehd $$6 : $$1) {
         $$5.b(this.dp() + $$6.c, $$3, this.dv() + $$6.e);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.i());
            $$5.c(ha.a);
         }
      }

      for (gu $$8 : $$2) {
         if (!this.dK().b_($$8).a(apq.b)) {
            double $$9 = this.dK().i($$8);
            if (cdi.a($$9)) {
               ehd $$10 = ehd.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fy().iterator();

               while (var14.hasNext()) {
                  bjk $$11 = (bjk)var14.next();
                  egy $$12 = $$0.e($$11);
                  if (cdi.a(this.dK(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new ehd(this.dp(), this.cG().e, this.dv());
   }

   @Override
   protected void a(cbm $$0, ehd $$1) {
      this.a($$0.dA(), $$0.dC() * 0.5F);
      this.N = this.aU = this.aW = this.dA();
      this.cd.b();
      super.a($$0, $$1);
   }

   @Override
   protected ehd b(cbm $$0, ehd $$1) {
      return new ehd(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cbm $$0) {
      return (float)(this.b(bke.d) * (double)(this.p() ? 0.35F : 0.55F) * (double)this.cd.c());
   }

   @Override
   protected float aK() {
      return this.Z + 0.6F;
   }

   @Override
   protected void b(gu $$0, dez $$1) {
      this.a(this.bl() ? aow.wp : aow.wo, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.cd.a(this.ee());
   }

   @Override
   protected void a(double $$0, boolean $$1, dez $$2, gu $$3) {
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
         this.a(aow.wk, 1.0F, this.eV());
      } else if (this.fX() && this.ag.a(60) == 0) {
         this.a(aow.wl, 1.0F, this.eV());
      }

      if (!this.fQ()) {
         boolean $$2;
         boolean var10000;
         label36: {
            dez $$0 = this.dK().a_(this.dk());
            dez $$1 = this.bh();
            $$2 = $$0.a(apl.aT) || $$1.a(apl.aT) || this.b(apq.b) > 0.0;
            if (this.cY() instanceof bzn $$3 && $$3.p()) {
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
         ehi $$0 = ehi.a(this);
         if ($$0.a(cwy.c, this.dk(), true) && !this.dK().b_(this.dk().c()).a(apq.b)) {
            this.c(true);
         } else {
            this.f(this.dn().a(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static bkd.a q() {
      return bja.x().a(bke.d, 0.175F).a(bke.b, 16.0);
   }

   @Override
   protected aov r() {
      return !this.fX() && !this.t() ? aow.wj : null;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.wn;
   }

   @Override
   protected aov h_() {
      return aow.wm;
   }

   @Override
   protected boolean r(bii $$0) {
      return !this.bO() && !this.a(apq.b);
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
   protected bsh b(cpl $$0) {
      return new bzn.b(this, $$0);
   }

   @Override
   public float a(gu $$0, cpo $$1) {
      if ($$1.a_($$0).u().a(apq.b)) {
         return 10.0F;
      } else {
         return this.bl() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public bzn b(akk $$0, bid $$1) {
      return bim.aV.a((cpl)$$0);
   }

   @Override
   public boolean m(cix $$0) {
      return bY.a($$0);
   }

   @Override
   protected void ew() {
      super.ew();
      if (this.i()) {
         this.a(cja.mZ);
      }
   }

   @Override
   public bgq b(cbm $$0, bgp $$1) {
      boolean $$2 = this.m($$0.b($$1));
      if (!$$2 && this.i() && !this.bO() && !$$0.fG()) {
         if (!this.dK().B) {
            $$0.n(this);
         }

         return bgq.a(this.dK().B);
      } else {
         bgq $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cix $$4 = $$0.b($$1);
            return $$4.a(cja.mZ) ? $$4.a($$0, this, $$1) : bgq.d;
         } else {
            if ($$2 && !this.aS()) {
               this.dK().a(null, this.dp(), this.dr(), this.dv(), aow.wq, this.da(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public ehd cI() {
      return new ehd(0.0, (double)(0.6F * this.cH()), (double)(this.df() * 0.4F));
   }

   @Nullable
   @Override
   public bjr a(cqa $$0, bgo $$1, bjc $$2, @Nullable bjr $$3, @Nullable qr $$4) {
      if (this.i_()) {
         return super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         aru $$5 = $$0.y_();
         if ($$5.a(30) == 0) {
            bja $$6 = bim.bs.a((cpl)$$0.C());
            if ($$6 != null) {
               $$3 = this.a($$0, $$1, $$6, new bzt.b(bzt.a($$5), false));
               $$6.a(bin.a, new cix(cja.ng));
               this.a(null);
            }
         } else if ($$5.a(10) == 0) {
            bid $$7 = bim.aV.a((cpl)$$0.C());
            if ($$7 != null) {
               $$7.c_(-24000);
               $$3 = this.a($$0, $$1, $$7, null);
            }
         } else {
            $$3 = new bid.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   private bjr a(cqa $$0, bgo $$1, bja $$2, @Nullable bjr $$3) {
      $$2.b(this.dp(), this.dr(), this.dv(), this.dA(), 0.0F);
      $$2.a($$0, $$1, bjc.g, $$3, null);
      $$2.a(this, true);
      return new bid.a(0.0F);
   }

   static class a extends bqg {
      private final bzn g;

      a(bzn $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public gu k() {
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
      protected boolean a(cpo $$0, gu $$1) {
         return $$0.a_($$1).a(csm.H) && $$0.a_($$1.c()).a($$0, $$1, eas.a);
      }
   }

   static class b extends bsg {
      b(bzn $$0, cpl $$1) {
         super($$0, $$1);
      }

      @Override
      protected eat a(int $$0) {
         this.o = new eaw();
         this.o.a(true);
         return new eat(this.o, $$0);
      }

      @Override
      protected boolean a(ean $$0) {
         return $$0 != ean.i && $$0 != ean.o && $$0 != ean.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(gu $$0) {
         return this.b.a_($$0).a(csm.H) || super.a($$0);
      }
   }
}
