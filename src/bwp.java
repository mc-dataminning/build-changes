import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public class bwp extends brl implements bfw, bgq {
   private static final UUID bT = UUID.fromString("9e362924-01de-4ddd-a2b2-d0f7a405a174");
   private static final bhe bU = new bhe(bT, "Strider suffocating modifier", -0.34F, bhe.a.b);
   private static final float bW = 0.35F;
   private static final float bX = 0.55F;
   private static final ciz bY = ciz.a(cgc.dh);
   private static final ciz bZ = ciz.a(cgc.dh, cgc.ng);
   private static final aby<Integer> ca = acb.a(bwp.class, aca.b);
   private static final aby<Boolean> cb = acb.a(bwp.class, aca.k);
   private static final aby<Boolean> cc = acb.a(bwp.class, aca.k);
   private final bfv cd = new bfv(this.am, ca, cc);
   @Nullable
   private bod ce;
   @Nullable
   private bno cf;

   public bwp(bfn<? extends bwp> $$0, cmm $$1) {
      super($$0, $$1);
      this.H = true;
      this.a(dxp.j, -1.0F);
      this.a(dxp.i, 0.0F);
      this.a(dxp.n, 0.0F);
      this.a(dxp.o, 0.0F);
   }

   public static boolean c(bfn<bwp> $$0, cmn $$1, bgd $$2, gu $$3, apf $$4) {
      gu.a $$5 = $$3.j();

      do {
         $$5.c(ha.b);
      } while ($$1.b_($$5).a(anb.b));

      return $$1.a_($$5).i();
   }

   @Override
   public void a(aby<?> $$0) {
      if (ca.equals($$0) && this.dI().B) {
         this.cd.a();
      }

      super.a($$0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.am.a(ca, 0);
      this.am.a(cb, false);
      this.am.a(cc, false);
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
      return this.bs() && !this.h_();
   }

   @Override
   public void a(@Nullable ami $$0) {
      this.cd.a(true);
      if ($$0 != null) {
         this.dI().a(null, this, amh.wr, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   protected void x() {
      this.cf = new bno(this, 1.65);
      this.bO.a(1, this.cf);
      this.bO.a(2, new bmh(this, 1.0));
      this.ce = new bod(this, 1.4, bZ, false);
      this.bO.a(3, this.ce);
      this.bO.a(4, new bwp.a(this, 1.0));
      this.bO.a(5, new bmu(this, 1.0));
      this.bO.a(7, new bns(this, 1.0, 60));
      this.bO.a(8, new bnd(this, byo.class, 8.0F));
      this.bO.a(8, new bnq(this));
      this.bO.a(9, new bnd(this, bwp.class, 8.0F));
   }

   public void w(boolean $$0) {
      this.am.b(cb, $$0);
      bhc $$1 = this.a(bhg.d);
      if ($$1 != null) {
         $$1.b(bT);
         if ($$0) {
            $$1.b(bU);
         }
      }
   }

   public boolean q() {
      return this.am.b(cb);
   }

   @Override
   public boolean a(dxe $$0) {
      return $$0.a(anb.b);
   }

   @Override
   public double bx() {
      float $$0 = Math.min(0.25F, this.aR.a());
      float $$1 = this.aR.b();
      return (double)this.de() - 0.19 + (double)(0.12F * apa.b($$1 * 1.5F) * 2.0F * $$0);
   }

   @Override
   public boolean a(cmp $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public bfz cL() {
      if (this.cO() instanceof byo $$0 && ($$0.eO().a(cgc.ng) || $$0.eP().a(cgc.ng))) {
         return $$0;
      }

      return null;
   }

   @Override
   public eei b(bfz $$0) {
      eei[] $$1 = new eei[]{
         a((double)this.dd(), (double)$$0.dd(), $$0.dy()),
         a((double)this.dd(), (double)$$0.dd(), $$0.dy() - 22.5F),
         a((double)this.dd(), (double)$$0.dd(), $$0.dy() + 22.5F),
         a((double)this.dd(), (double)$$0.dd(), $$0.dy() - 45.0F),
         a((double)this.dd(), (double)$$0.dd(), $$0.dy() + 45.0F)
      };
      Set<gu> $$2 = Sets.newLinkedHashSet();
      double $$3 = this.cE().e;
      double $$4 = this.cE().b - 0.5;
      gu.a $$5 = new gu.a();

      for (eei $$6 : $$1) {
         $$5.b(this.dn() + $$6.c, $$3, this.dt() + $$6.e);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.i());
            $$5.c(ha.a);
         }
      }

      for (gu $$8 : $$2) {
         if (!this.dI().b_($$8).a(anb.b)) {
            double $$9 = this.dI().i($$8);
            if (cak.a($$9)) {
               eei $$10 = eei.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fv().iterator();

               while (var14.hasNext()) {
                  bgl $$11 = (bgl)var14.next();
                  eed $$12 = $$0.g($$11);
                  if (cak.a(this.dI(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new eei(this.dn(), this.cE().e, this.dt());
   }

   @Override
   protected void a(byo $$0, eei $$1) {
      this.a($$0.dy(), $$0.dA() * 0.5F);
      this.M = this.aV = this.aX = this.dy();
      this.cd.b();
      super.a($$0, $$1);
   }

   @Override
   protected eei b(byo $$0, eei $$1) {
      return new eei(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(byo $$0) {
      return (float)(this.b(bhg.d) * (double)(this.q() ? 0.35F : 0.55F) * (double)this.cd.c());
   }

   @Override
   protected float aI() {
      return this.Y + 0.6F;
   }

   @Override
   protected void b(gu $$0, dcb $$1) {
      this.a(this.bi() ? amh.wp : amh.wo, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.cd.a(this.ec());
   }

   @Override
   protected void a(double $$0, boolean $$1, dcb $$2, gu $$3) {
      this.aM();
      if (this.bi()) {
         this.n();
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void l() {
      if (this.fY() && this.af.a(140) == 0) {
         this.a(amh.wk, 1.0F, this.eS());
      } else if (this.w() && this.af.a(60) == 0) {
         this.a(amh.wl, 1.0F, this.eS());
      }

      if (!this.fQ()) {
         boolean $$2;
         boolean var10000;
         label36: {
            dcb $$0 = this.dI().a_(this.di());
            dcb $$1 = this.be();
            $$2 = $$0.a(amw.aS) || $$1.a(amw.aS) || this.b(anb.b) > 0.0;
            if (this.cW() instanceof bwp $$3 && $$3.q()) {
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
      this.aM();
   }

   private boolean w() {
      return this.cf != null && this.cf.k();
   }

   private boolean fY() {
      return this.ce != null && this.ce.i();
   }

   @Override
   protected boolean z() {
      return true;
   }

   private void ge() {
      if (this.bi()) {
         een $$0 = een.a(this);
         if ($$0.a(cua.c, this.di(), true) && !this.dI().b_(this.di().c()).a(anb.b)) {
            this.c(true);
         } else {
            this.f(this.dl().a(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static bhf.a r() {
      return bgb.y().a(bhg.d, 0.175F).a(bhg.b, 16.0);
   }

   @Override
   protected amg s() {
      return !this.w() && !this.fY() ? amh.wj : null;
   }

   @Override
   protected amg d(ben $$0) {
      return amh.wn;
   }

   @Override
   protected amg g_() {
      return amh.wm;
   }

   @Override
   protected boolean o(bfj $$0) {
      return !this.bN() && !this.a(anb.b);
   }

   @Override
   public boolean fb() {
      return true;
   }

   @Override
   public boolean bL() {
      return false;
   }

   @Override
   protected bpj b(cmm $$0) {
      return new bwp.b(this, $$0);
   }

   @Override
   public float a(gu $$0, cmp $$1) {
      if ($$1.a_($$0).u().a(anb.b)) {
         return 10.0F;
      } else {
         return this.bi() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public bwp b(aif $$0, bfe $$1) {
      return bfn.aV.a((cmm)$$0);
   }

   @Override
   public boolean m(cfz $$0) {
      return bY.a($$0);
   }

   @Override
   protected void eu() {
      super.eu();
      if (this.i()) {
         this.a(cgc.mZ);
      }
   }

   @Override
   public bdx b(byo $$0, bdw $$1) {
      boolean $$2 = this.m($$0.b($$1));
      if (!$$2 && this.i() && !this.bN() && !$$0.fD()) {
         if (!this.dI().B) {
            $$0.k(this);
         }

         return bdx.a(this.dI().B);
      } else {
         bdx $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cfz $$4 = $$0.b($$1);
            return $$4.a(cgc.mZ) ? $$4.a($$0, this, $$1) : bdx.d;
         } else {
            if ($$2 && !this.aQ()) {
               this.dI().a(null, this.dn(), this.dp(), this.dt(), amh.wq, this.cY(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public eei cG() {
      return new eei(0.0, (double)(0.6F * this.cF()), (double)(this.dd() * 0.4F));
   }

   @Nullable
   @Override
   public bgt a(cnb $$0, bdv $$1, bgd $$2, @Nullable bgt $$3, @Nullable qr $$4) {
      if (this.h_()) {
         return super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         apf $$5 = $$0.y_();
         if ($$5.a(30) == 0) {
            bgb $$6 = bfn.bs.a((cmm)$$0.C());
            if ($$6 != null) {
               $$3 = this.a($$0, $$1, $$6, new bwv.b(bwv.a($$5), false));
               $$6.a(bfo.a, new cfz(cgc.ng));
               this.a(null);
            }
         } else if ($$5.a(10) == 0) {
            bfe $$7 = bfn.aV.a((cmm)$$0.C());
            if ($$7 != null) {
               $$7.c_(-24000);
               $$3 = this.a($$0, $$1, $$7, null);
            }
         } else {
            $$3 = new bfe.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   private bgt a(cnb $$0, bdv $$1, bgb $$2, @Nullable bgt $$3) {
      $$2.b(this.dn(), this.dp(), this.dt(), this.dy(), 0.0F);
      $$2.a($$0, $$1, bgd.g, $$3, null);
      $$2.a(this, true);
      return new bfe.a(0.0F);
   }

   static class a extends bni {
      private final bwp g;

      a(bwp $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public gu k() {
         return this.e;
      }

      @Override
      public boolean b() {
         return !this.g.bi() && this.a(this.g.dI(), this.e);
      }

      @Override
      public boolean a() {
         return !this.g.bi() && super.a();
      }

      @Override
      public boolean l() {
         return this.d % 20 == 0;
      }

      @Override
      protected boolean a(cmp $$0, gu $$1) {
         return $$0.a_($$1).a(cpo.H) && $$0.a_($$1.c()).a($$0, $$1, dxu.a);
      }
   }

   static class b extends bpi {
      b(bwp $$0, cmm $$1) {
         super($$0, $$1);
      }

      @Override
      protected dxv a(int $$0) {
         this.o = new dxy();
         this.o.a(true);
         return new dxv(this.o, $$0);
      }

      @Override
      protected boolean a(dxp $$0) {
         return $$0 != dxp.i && $$0 != dxp.o && $$0 != dxp.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(gu $$0) {
         return this.b.a_($$0).a(cpo.H) || super.a($$0);
      }
   }
}
