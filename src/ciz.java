import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class ciz extends bxc implements bwk, bxf<jq<cja>> {
   private static final alc<Boolean> cf = alg.a(ciz.class, ale.k);
   private static final alc<Integer> cg = alg.a(ciz.class, ale.b);
   private static final alc<Integer> ch = alg.a(ciz.class, ale.b);
   private static final alc<jq<cja>> ci = alg.a(ciz.class, ale.y);
   public static final cgw.a cd = ($$0, $$1) -> {
      bvq<?> $$2 = $$0.aq();
      return $$2 == bvq.bb || $$2 == bvq.aY || $$2 == bvq.ab;
   };
   private static final float cj = 8.0F;
   private static final float ck = 40.0F;
   private static final float cl = 0.125F;
   public static final float ce = (float) (Math.PI / 5);
   private float cm;
   private float cn;
   private boolean co;
   private boolean cp;
   private float cq;
   private float cr;
   private static final bst cs = bbg.a(20, 39);
   @Nullable
   private UUID ct;

   public ciz(bvq<? extends ciz> $$0, dhh $$1) {
      super($$0, $$1);
      this.b(false, false);
      this.a(eun.f, -1.0F);
      this.a(eun.g, -1.0F);
   }

   @Override
   protected void B() {
      this.bT.a(1, new ccx(this));
      this.bT.a(1, new bxc.a(1.5, axw.G));
      this.bT.a(2, new cei(this));
      this.bT.a(3, new ciz.a<>(this, ckd.class, 24.0F, 1.5, 1.5));
      this.bT.a(4, new cdj(this, 0.4F));
      this.bT.a(5, new cdn(this, 1.0, true));
      this.bT.a(6, new cdb(this, 1.0, 10.0F, 2.0F));
      this.bT.a(7, new ccp(this, 1.0));
      this.bT.a(8, new ceq(this, 1.0));
      this.bT.a(9, new ccl(this, 8.0F));
      this.bT.a(10, new cdl(this, cpw.class, 8.0F));
      this.bT.a(10, new cdy(this));
      this.bU.a(1, new cfa(this));
      this.bU.a(2, new cfb(this));
      this.bU.a(3, new cev(this).a());
      this.bU.a(4, new cew<>(this, cpw.class, 10, true, false, this::a));
      this.bU.a(5, new cez<>(this, chw.class, false, cd));
      this.bU.a(6, new cez<>(this, cix.class, false, cix.bZ));
      this.bU.a(7, new cew<>(this, cme.class, false));
      this.bU.a(8, new cfc<>(this, true));
   }

   public alz gy() {
      cja $$0 = this.gz().a();
      if (this.p()) {
         return $$0.b();
      } else {
         return this.ad_() ? $$0.c() : $$0.a();
      }
   }

   public jq<cja> gz() {
      return this.al.a(ci);
   }

   public void j(jq<cja> $$0) {
      this.al.a(ci, $$0);
   }

   public static bxm.a gA() {
      return chw.gr().a(bxn.v, 0.3F).a(bxn.s, 8.0).a(bxn.c, 4.0);
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      ke $$1 = this.dX();
      kd<cja> $$2 = $$1.e(mb.m);
      $$0.a(ci, $$2.a(cjb.j).or($$2::a).orElseThrow());
      $$0.a(cf, false);
      $$0.a(cg, cwl.o.a());
      $$0.a(ch, 0);
   }

   @Override
   protected void b(jh $$0, dxu $$1) {
      this.a(axf.Ds, 0.15F, 1.0F);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("CollarColor", (byte)this.gC().a());
      this.gz().e().ifPresent($$1 -> $$0.a("variant", $$1.a().toString()));
      this.a_($$0);
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      Optional.ofNullable(alz.c($$0.l("variant"))).map($$0x -> aly.a(mb.m, $$0x)).flatMap($$0x -> this.dX().e(mb.m).a($$0x)).ifPresent(this::j);
      if ($$0.b("CollarColor", 99)) {
         this.a(cwl.a($$0.h("CollarColor")));
      }

      this.a(this.dV(), $$0);
   }

   @Nullable
   @Override
   public bwy a(dhy $$0, btg $$1, bvp $$2, @Nullable bwy $$3) {
      jq<dij> $$4 = $$0.t(this.dv());
      jq<cja> $$6;
      if ($$3 instanceof ciz.b $$5) {
         $$6 = $$5.a;
      } else {
         $$6 = cjb.a(this.dX(), $$4);
         $$3 = new ciz.b($$6);
      }

      this.j($$6);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected axe u() {
      if (this.ad_()) {
         return axf.Dn;
      } else if (this.ae.a(3) == 0) {
         return this.p() && this.eD() < 20.0F ? axf.Dt : axf.Dq;
      } else {
         return axf.Dl;
      }
   }

   @Override
   protected axe e(btz $$0) {
      return this.h($$0) ? axf.Dj : axf.Dp;
   }

   @Override
   protected axe o_() {
      return axf.Dm;
   }

   @Override
   protected float fe() {
      return 0.4F;
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dV().C && this.co && !this.cp && !this.gi() && this.aJ()) {
         this.cp = true;
         this.cq = 0.0F;
         this.cr = 0.0F;
         this.dV().a(this, (byte)8);
      }

      if (!this.dV().C) {
         this.a((ash)this.dV(), true);
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.bL()) {
         this.cn = this.cm;
         if (this.gD()) {
            this.cm = this.cm + (1.0F - this.cm) * 0.4F;
         } else {
            this.cm = this.cm + (0.0F - this.cm) * 0.4F;
         }

         if (this.bl()) {
            this.co = true;
            if (this.cp && !this.dV().C) {
               this.dV().a(this, (byte)56);
               this.gE();
            }
         } else if ((this.co || this.cp) && this.cp) {
            if (this.cq == 0.0F) {
               this.a(axf.Dr, this.fe(), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
               this.a(ecq.u);
            }

            this.cr = this.cq;
            this.cq += 0.05F;
            if (this.cr >= 2.0F) {
               this.co = false;
               this.cp = false;
               this.cr = 0.0F;
               this.cq = 0.0F;
            }

            if (this.cq > 0.4F) {
               float $$0 = (float)this.dC();
               int $$1 = (int)(bae.a((this.cq - 0.4F) * (float) Math.PI) * 7.0F);
               fbx $$2 = this.dy();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.ae.i() * 2.0F - 1.0F) * this.dq() * 0.5F;
                  float $$5 = (this.ae.i() * 2.0F - 1.0F) * this.dq() * 0.5F;
                  this.dV().a(ls.an, this.dA() + (double)$$4, (double)($$0 + 0.8F), this.dG() + (double)$$5, $$2.d, $$2.e, $$2.f);
               }
            }
         }
      }
   }

   private void gE() {
      this.cp = false;
      this.cq = 0.0F;
      this.cr = 0.0F;
   }

   @Override
   public void a(btz $$0) {
      this.co = false;
      this.cp = false;
      this.cr = 0.0F;
      this.cq = 0.0F;
      super.a($$0);
   }

   public float J(float $$0) {
      return !this.co ? 1.0F : Math.min(0.75F + bae.h($$0, this.cr, this.cq) / 2.0F * 0.25F, 1.0F);
   }

   public float K(float $$0) {
      return bae.h($$0, this.cr, this.cq);
   }

   public float L(float $$0) {
      return bae.h($$0, this.cn, this.cm) * 0.15F * (float) Math.PI;
   }

   @Override
   public int Z() {
      return this.x() ? 20 : super.Z();
   }

   @Override
   public boolean a(ash $$0, btz $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.z(false);
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean e(bvr $$0) {
      return true;
   }

   @Override
   protected void b(ash $$0, btz $$1, float $$2) {
      if (!this.h($$1)) {
         super.b($$0, $$1, $$2);
      } else {
         cxo $$3 = this.af();
         int $$4 = $$3.o();
         int $$5 = $$3.p();
         $$3.a(bae.f($$2), this, bvr.g);
         if (bvg.b.a($$4, $$5) != bvg.b.a(this.af())) {
            this.a(axf.Di);
            $$0.a(new lo(ls.S, cxs.oM.n()), this.dA(), this.dC() + 1.0, this.dG(), 20, 0.2, 0.1, 0.2, 0.1);
         }
      }
   }

   private boolean h(btz $$0) {
      return this.af().a(cxs.oN) && !$$0.a(axw.C);
   }

   @Override
   protected void t() {
      if (this.p()) {
         this.g(bxn.s).a(40.0);
         this.x(40.0F);
      } else {
         this.g(bxn.s).a(8.0);
      }
   }

   @Override
   protected void c(btz $$0, float $$1) {
      this.a($$0, $$1, new bvr[]{bvr.g});
   }

   @Override
   public bti b(cpw $$0, bth $$1) {
      cxo $$2 = $$0.b($$1);
      cxk $$3 = $$2.h();
      if (this.p()) {
         if (this.j($$2) && this.eD() < this.eR()) {
            this.a($$0, $$1, $$2);
            csy $$4 = $$2.a(ku.w);
            float $$5 = $$4 != null ? (float)$$4.a() : 1.0F;
            this.c(2.0F * $$5);
            return bti.a;
         } else {
            if ($$3 instanceof cwm $$6 && this.j($$0)) {
               cwl $$7 = $$6.b();
               if ($$7 != this.gC()) {
                  this.a($$7);
                  $$2.a(1, $$0);
                  return bti.a;
               }

               return super.b($$0, $$1);
            }

            if (this.a($$2, bvr.g) && !this.ag() && this.j($$0) && !this.e_()) {
               this.h($$2.c(1));
               $$2.a(1, $$0);
               return bti.a;
            } else if ($$2.a(cxs.sJ) && this.j($$0) && this.ag() && (!dea.a(this.af(), ddz.E) || $$0.b())) {
               $$2.a(1, $$0, d($$1));
               this.a(axf.az);
               cxo $$8 = this.af();
               this.h(cxo.k);
               if (this.dV() instanceof ash $$9) {
                  this.a($$9, $$8);
               }

               return bti.a;
            } else if (this.x() && this.ag() && this.j($$0) && this.af().n() && this.af().b($$2)) {
               $$2.h(1);
               this.a(axf.Dk);
               cxo $$10 = this.af();
               int $$11 = (int)((float)$$10.p() * 0.125F);
               $$10.b(Math.max(0, $$10.o() - $$11));
               return bti.a;
            } else {
               bti $$12 = super.b($$0, $$1);
               if (!$$12.a() && this.j($$0)) {
                  this.z(!this.gm());
                  this.bn = false;
                  this.bS.o();
                  this.h(null);
                  return bti.a.b();
               } else {
                  return $$12;
               }
            }
         }
      } else if (!this.dV().C && $$2.a(cxs.sn) && !this.ad_()) {
         $$2.a(1, $$0);
         this.g($$0);
         return bti.b;
      } else {
         return super.b($$0, $$1);
      }
   }

   private void g(cpw $$0) {
      if (this.ae.a(3) == 0) {
         this.a($$0);
         this.bS.o();
         this.h(null);
         this.z(true);
         this.dV().a(this, (byte)7);
      } else {
         this.dV().a(this, (byte)6);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 8) {
         this.cp = true;
         this.cq = 0.0F;
         this.cr = 0.0F;
      } else if ($$0 == 56) {
         this.gE();
      } else {
         super.b($$0);
      }
   }

   public float gB() {
      if (this.ad_()) {
         return 1.5393804F;
      } else if (this.p()) {
         float $$0 = this.eR();
         float $$1 = ($$0 - this.eD()) / $$0;
         return (0.55F - $$1 * 0.4F) * (float) Math.PI;
      } else {
         return (float) (Math.PI / 5);
      }
   }

   @Override
   public boolean j(cxo $$0) {
      return $$0.a(ayd.ai);
   }

   @Override
   public int ad() {
      return 8;
   }

   @Override
   public int a() {
      return this.al.a(ch);
   }

   @Override
   public void a(int $$0) {
      this.al.a(ch, $$0);
   }

   @Override
   public void c() {
      this.a(cs.a(this.ae));
   }

   @Nullable
   @Override
   public UUID b() {
      return this.ct;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.ct = $$0;
   }

   public cwl gC() {
      return cwl.a(this.al.a(cg));
   }

   private void a(cwl $$0) {
      this.al.a(cg, $$0.a());
   }

   @Nullable
   public ciz b(ash $$0, bva $$1) {
      ciz $$2 = bvq.bM.a($$0, bvp.e);
      if ($$2 != null && $$1 instanceof ciz $$3) {
         if (this.ae.h()) {
            $$2.j(this.gz());
         } else {
            $$2.j($$3.gz());
         }

         if (this.p()) {
            $$2.b(this.ab_());
            $$2.b(true, true);
            if (this.ae.h()) {
               $$2.a(this.gC());
            } else {
               $$2.a($$3.gC());
            }
         }
      }

      return $$2;
   }

   public void A(boolean $$0) {
      this.al.a(cf, $$0);
   }

   @Override
   public boolean a(chw $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.p()) {
         return false;
      } else if (!($$0 instanceof ciz $$1)) {
         return false;
      } else if (!$$1.p()) {
         return false;
      } else {
         return $$1.x() ? false : this.gw() && $$1.gw();
      }
   }

   public boolean gD() {
      return this.al.a(cf);
   }

   @Override
   public boolean a(bwf $$0, bwf $$1) {
      if ($$0 instanceof cmi || $$0 instanceof cmq || $$0 instanceof clp) {
         return false;
      } else if ($$0 instanceof ciz $$2) {
         return !$$2.p() || $$2.ah_() != $$1;
      } else {
         if ($$0 instanceof cpw $$3 && $$1 instanceof cpw $$4 && !$$4.a($$3)) {
            return false;
         }

         if ($$0 instanceof cka $$5 && $$5.gD()) {
            return false;
         }

         if ($$0 instanceof bxc $$6 && $$6.p()) {
            return false;
         }

         return true;
      }
   }

   @Override
   public boolean y() {
      return !this.ad_();
   }

   @Override
   public fbx cT() {
      return new fbx(0.0, (double)(0.6F * this.cS()), (double)(this.dq() * 0.4F));
   }

   public static boolean c(bvq<ciz> $$0, dhi $$1, bvp $$2, jh $$3, bam $$4) {
      return $$1.a_($$3.e()).a(axu.ch) && a($$1, $$3);
   }

   class a<T extends bwf> extends cck<T> {
      private final ciz j;

      public a(final ciz $$0, final Class<T> $$1, final float $$2, final double $$3, final double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.b instanceof ckd ? !this.j.p() && this.a((ckd)this.b) : false;
      }

      private boolean a(ckd $$0) {
         return $$0.gq() >= ciz.this.ae.a(5);
      }

      @Override
      public void d() {
         ciz.this.h(null);
         super.d();
      }

      @Override
      public void a() {
         ciz.this.h(null);
         super.a();
      }
   }

   public static class b extends bva.a {
      public final jq<cja> a;

      public b(jq<cja> $$0) {
         super(false);
         this.a = $$0;
      }
   }
}
