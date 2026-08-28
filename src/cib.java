import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cib extends bwe implements bvm, bwh<jq<cic>> {
   private static final akm<Boolean> ce = akq.a(cib.class, ako.k);
   private static final akm<Integer> cf = akq.a(cib.class, ako.b);
   private static final akm<Integer> cg = akq.a(cib.class, ako.b);
   private static final akm<jq<cic>> ch = akq.a(cib.class, ako.y);
   public static final cfy.a cc = ($$0, $$1) -> {
      bus<?> $$2 = $$0.aq();
      return $$2 == bus.aX || $$2 == bus.aU || $$2 == bus.Z;
   };
   private static final float ci = 8.0F;
   private static final float cj = 40.0F;
   private static final float ck = 0.125F;
   public static final float cd = (float) (Math.PI / 5);
   private float cl;
   private float cm;
   private boolean cn;
   private boolean co;
   private float cp;
   private float cq;
   private static final brv cr = bao.a(20, 39);
   @Nullable
   private UUID cs;

   public cib(bus<? extends cib> $$0, dfm $$1) {
      super($$0, $$1);
      this.b(false, false);
      this.a(esm.f, -1.0F);
      this.a(esm.g, -1.0F);
   }

   @Override
   protected void B() {
      this.bS.a(1, new cbz(this));
      this.bS.a(1, new bwe.a(1.5, axe.G));
      this.bS.a(2, new cdk(this));
      this.bS.a(3, new cib.a<>(this, cjf.class, 24.0F, 1.5, 1.5));
      this.bS.a(4, new ccl(this, 0.4F));
      this.bS.a(5, new ccp(this, 1.0, true));
      this.bS.a(6, new ccd(this, 1.0, 10.0F, 2.0F));
      this.bS.a(7, new cbr(this, 1.0));
      this.bS.a(8, new cds(this, 1.0));
      this.bS.a(9, new cbn(this, 8.0F));
      this.bS.a(10, new ccn(this, cou.class, 8.0F));
      this.bS.a(10, new cda(this));
      this.bT.a(1, new cec(this));
      this.bT.a(2, new ced(this));
      this.bT.a(3, new cdx(this).a());
      this.bT.a(4, new cdy<>(this, cou.class, 10, true, false, this::a));
      this.bT.a(5, new ceb<>(this, cgy.class, false, cc));
      this.bT.a(6, new ceb<>(this, chz.class, false, chz.bY));
      this.bT.a(7, new cdy<>(this, clg.class, false));
      this.bT.a(8, new cee<>(this, true));
   }

   public alj gy() {
      cic $$0 = this.gz().a();
      if (this.n()) {
         return $$0.b();
      } else {
         return this.ac_() ? $$0.c() : $$0.a();
      }
   }

   public jq<cic> gz() {
      return this.al.a(ch);
   }

   public void j(jq<cic> $$0) {
      this.al.a(ch, $$0);
   }

   public static bwo.a gA() {
      return cgy.gr().a(bwp.v, 0.3F).a(bwp.s, 8.0).a(bwp.c, 4.0);
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      ke $$1 = this.dX();
      kd<cic> $$2 = $$1.e(ma.m);
      $$0.a(ch, $$2.a(cid.j).or($$2::a).orElseThrow());
      $$0.a(ce, false);
      $$0.a(cf, cvj.o.a());
      $$0.a(cg, 0);
   }

   @Override
   protected void b(jh $$0, dvv $$1) {
      this.a(awn.CX, 0.15F, 1.0F);
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      $$0.a("CollarColor", (byte)this.gC().a());
      this.gz().e().ifPresent($$1 -> $$0.a("variant", $$1.a().toString()));
      this.a_($$0);
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      Optional.ofNullable(alj.c($$0.l("variant"))).map($$0x -> ali.a(ma.m, $$0x)).flatMap($$0x -> this.dX().e(ma.m).a($$0x)).ifPresent(this::j);
      if ($$0.b("CollarColor", 99)) {
         this.a(cvj.a($$0.h("CollarColor")));
      }

      this.a(this.dV(), $$0);
   }

   @Nullable
   @Override
   public bwa a(dgd $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      jq<dgo> $$4 = $$0.t(this.dv());
      jq<cic> $$6;
      if ($$3 instanceof cib.b $$5) {
         $$6 = $$5.a;
      } else {
         $$6 = cid.a(this.dX(), $$4);
         $$3 = new cib.b($$6);
      }

      this.j($$6);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected awm t() {
      if (this.ac_()) {
         return awn.CS;
      } else if (this.ae.a(3) == 0) {
         return this.n() && this.eD() < 20.0F ? awn.CY : awn.CV;
      } else {
         return awn.CQ;
      }
   }

   @Override
   protected awm e(btb $$0) {
      return this.h($$0) ? awn.CO : awn.CU;
   }

   @Override
   protected awm n_() {
      return awn.CR;
   }

   @Override
   protected float fe() {
      return 0.4F;
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dV().C && this.cn && !this.co && !this.gi() && this.aJ()) {
         this.co = true;
         this.cp = 0.0F;
         this.cq = 0.0F;
         this.dV().a(this, (byte)8);
      }

      if (!this.dV().C) {
         this.a((arp)this.dV(), true);
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.bL()) {
         this.cm = this.cl;
         if (this.gD()) {
            this.cl = this.cl + (1.0F - this.cl) * 0.4F;
         } else {
            this.cl = this.cl + (0.0F - this.cl) * 0.4F;
         }

         if (this.bl()) {
            this.cn = true;
            if (this.co && !this.dV().C) {
               this.dV().a(this, (byte)56);
               this.gE();
            }
         } else if ((this.cn || this.co) && this.co) {
            if (this.cp == 0.0F) {
               this.a(awn.CW, this.fe(), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
               this.a(ear.u);
            }

            this.cq = this.cp;
            this.cp += 0.05F;
            if (this.cq >= 2.0F) {
               this.cn = false;
               this.co = false;
               this.cq = 0.0F;
               this.cp = 0.0F;
            }

            if (this.cp > 0.4F) {
               float $$0 = (float)this.dC();
               int $$1 = (int)(azm.a((this.cp - 0.4F) * (float) Math.PI) * 7.0F);
               ezy $$2 = this.dy();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.ae.i() * 2.0F - 1.0F) * this.dq() * 0.5F;
                  float $$5 = (this.ae.i() * 2.0F - 1.0F) * this.dq() * 0.5F;
                  this.dV().a(ls.am, this.dA() + (double)$$4, (double)($$0 + 0.8F), this.dG() + (double)$$5, $$2.d, $$2.e, $$2.f);
               }
            }
         }
      }
   }

   private void gE() {
      this.co = false;
      this.cp = 0.0F;
      this.cq = 0.0F;
   }

   @Override
   public void a(btb $$0) {
      this.cn = false;
      this.co = false;
      this.cq = 0.0F;
      this.cp = 0.0F;
      super.a($$0);
   }

   public float J(float $$0) {
      return !this.cn ? 1.0F : Math.min(0.75F + azm.h($$0, this.cq, this.cp) / 2.0F * 0.25F, 1.0F);
   }

   public float K(float $$0) {
      return azm.h($$0, this.cq, this.cp);
   }

   public float L(float $$0) {
      return azm.h($$0, this.cm, this.cl) * 0.15F * (float) Math.PI;
   }

   @Override
   public int Z() {
      return this.v() ? 20 : super.Z();
   }

   @Override
   public boolean a(arp $$0, btb $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.z(false);
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean e(but $$0) {
      return true;
   }

   @Override
   protected void b(arp $$0, btb $$1, float $$2) {
      if (!this.h($$1)) {
         super.b($$0, $$1, $$2);
      } else {
         cwm $$3 = this.af();
         int $$4 = $$3.o();
         int $$5 = $$3.p();
         $$3.a(azm.f($$2), this, but.g);
         if (bui.b.a($$4, $$5) != bui.b.a(this.af())) {
            this.a(awn.CN);
            $$0.a(new lo(ls.S, cwq.or.o()), this.dA(), this.dC() + 1.0, this.dG(), 20, 0.2, 0.1, 0.2, 0.1);
         }
      }
   }

   private boolean h(btb $$0) {
      return this.af().a(cwq.os) && !$$0.a(axe.C);
   }

   @Override
   protected void q() {
      if (this.n()) {
         this.g(bwp.s).a(40.0);
         this.x(40.0F);
      } else {
         this.g(bwp.s).a(8.0);
      }
   }

   @Override
   protected void c(btb $$0, float $$1) {
      this.a($$0, $$1, new but[]{but.g});
   }

   @Override
   public bsk b(cou $$0, bsj $$1) {
      cwm $$2 = $$0.b($$1);
      cwi $$3 = $$2.h();
      if (this.n()) {
         if (this.j($$2) && this.eD() < this.eR()) {
            this.a($$0, $$1, $$2);
            crw $$4 = $$2.a(ku.w);
            float $$5 = $$4 != null ? (float)$$4.a() : 1.0F;
            this.c(2.0F * $$5);
            return bsk.a;
         } else {
            if ($$3 instanceof cvk $$6 && this.j($$0)) {
               cvj $$7 = $$6.b();
               if ($$7 != this.gC()) {
                  this.a($$7);
                  $$2.a(1, $$0);
                  return bsk.a;
               }

               return super.b($$0, $$1);
            }

            if (this.a($$2, but.g) && !this.ag() && this.j($$0) && !this.e_()) {
               this.h($$2.c(1));
               $$2.a(1, $$0);
               return bsk.a;
            } else if ($$2.a(cwq.sm) && this.j($$0) && this.ag() && (!dcf.a(this.af(), dce.E) || $$0.b())) {
               $$2.a(1, $$0, d($$1));
               this.a(awn.az);
               cwm $$8 = this.af();
               this.h(cwm.k);
               if (this.dV() instanceof arp $$9) {
                  this.a($$9, $$8);
               }

               return bsk.a;
            } else if (this.v() && this.ag() && this.j($$0) && this.af().n() && this.af().b($$2)) {
               $$2.h(1);
               this.a(awn.CP);
               cwm $$10 = this.af();
               int $$11 = (int)((float)$$10.p() * 0.125F);
               $$10.b(Math.max(0, $$10.o() - $$11));
               return bsk.a;
            } else {
               bsk $$12 = super.b($$0, $$1);
               if (!$$12.a() && this.j($$0)) {
                  this.z(!this.gm());
                  this.bm = false;
                  this.bR.o();
                  this.h(null);
                  return bsk.a.b();
               } else {
                  return $$12;
               }
            }
         }
      } else if (!this.dV().C && $$2.a(cwq.rQ) && !this.ac_()) {
         $$2.a(1, $$0);
         this.g($$0);
         return bsk.b;
      } else {
         return super.b($$0, $$1);
      }
   }

   private void g(cou $$0) {
      if (this.ae.a(3) == 0) {
         this.a($$0);
         this.bR.o();
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
         this.co = true;
         this.cp = 0.0F;
         this.cq = 0.0F;
      } else if ($$0 == 56) {
         this.gE();
      } else {
         super.b($$0);
      }
   }

   public float gB() {
      if (this.ac_()) {
         return 1.5393804F;
      } else if (this.n()) {
         float $$0 = this.eR();
         float $$1 = ($$0 - this.eD()) / $$0;
         return (0.55F - $$1 * 0.4F) * (float) Math.PI;
      } else {
         return (float) (Math.PI / 5);
      }
   }

   @Override
   public boolean j(cwm $$0) {
      return $$0.a(axl.ah);
   }

   @Override
   public int ad() {
      return 8;
   }

   @Override
   public int a() {
      return this.al.a(cg);
   }

   @Override
   public void a(int $$0) {
      this.al.a(cg, $$0);
   }

   @Override
   public void c() {
      this.a(cr.a(this.ae));
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cs;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cs = $$0;
   }

   public cvj gC() {
      return cvj.a(this.al.a(cf));
   }

   private void a(cvj $$0) {
      this.al.a(cf, $$0.a());
   }

   @Nullable
   public cib b(arp $$0, buc $$1) {
      cib $$2 = bus.bI.a($$0, bur.e);
      if ($$2 != null && $$1 instanceof cib $$3) {
         if (this.ae.h()) {
            $$2.j(this.gz());
         } else {
            $$2.j($$3.gz());
         }

         if (this.n()) {
            $$2.b(this.Z_());
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
      this.al.a(ce, $$0);
   }

   @Override
   public boolean a(cgy $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.n()) {
         return false;
      } else if (!($$0 instanceof cib $$1)) {
         return false;
      } else if (!$$1.n()) {
         return false;
      } else {
         return $$1.v() ? false : this.gw() && $$1.gw();
      }
   }

   public boolean gD() {
      return this.al.a(ce);
   }

   @Override
   public boolean a(bvh $$0, bvh $$1) {
      if ($$0 instanceof clk || $$0 instanceof cls || $$0 instanceof ckr) {
         return false;
      } else if ($$0 instanceof cib $$2) {
         return !$$2.n() || $$2.ag_() != $$1;
      } else {
         if ($$0 instanceof cou $$3 && $$1 instanceof cou $$4 && !$$4.a($$3)) {
            return false;
         }

         if ($$0 instanceof cjc $$5 && $$5.gD()) {
            return false;
         }

         if ($$0 instanceof bwe $$6 && $$6.n()) {
            return false;
         }

         return true;
      }
   }

   @Override
   public boolean y() {
      return !this.ac_();
   }

   @Override
   public ezy cT() {
      return new ezy(0.0, (double)(0.6F * this.cS()), (double)(this.dq() * 0.4F));
   }

   public static boolean c(bus<cib> $$0, dfn $$1, bur $$2, jh $$3, azu $$4) {
      return $$1.a_($$3.e()).a(axc.cg) && a($$1, $$3);
   }

   class a<T extends bvh> extends cbm<T> {
      private final cib j;

      public a(final cib $$0, final Class<T> $$1, final float $$2, final double $$3, final double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.b instanceof cjf ? !this.j.n() && this.a((cjf)this.b) : false;
      }

      private boolean a(cjf $$0) {
         return $$0.gq() >= cib.this.ae.a(5);
      }

      @Override
      public void d() {
         cib.this.h(null);
         super.d();
      }

      @Override
      public void a() {
         cib.this.h(null);
         super.a();
      }
   }

   public static class b extends buc.a {
      public final jq<cic> a;

      public b(jq<cic> $$0) {
         super(false);
         this.a = $$0;
      }
   }
}
