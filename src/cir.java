import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cir extends bwu implements bwc, bwx<jq<cis>> {
   private static final aks<Boolean> cf = akw.a(cir.class, aku.k);
   private static final aks<Integer> cg = akw.a(cir.class, aku.b);
   private static final aks<Integer> ch = akw.a(cir.class, aku.b);
   private static final aks<jq<cis>> ci = akw.a(cir.class, aku.y);
   public static final cgo.a cd = ($$0, $$1) -> {
      bvi<?> $$2 = $$0.aq();
      return $$2 == bvi.bb || $$2 == bvi.aY || $$2 == bvi.ab;
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
   private static final bsl cs = baw.a(20, 39);
   @Nullable
   private UUID ct;

   public cir(bvi<? extends cir> $$0, dgz $$1) {
      super($$0, $$1);
      this.b(false, false);
      this.a(euh.f, -1.0F);
      this.a(euh.g, -1.0F);
   }

   @Override
   protected void B() {
      this.bT.a(1, new ccp(this));
      this.bT.a(1, new bwu.a(1.5, axm.G));
      this.bT.a(2, new cea(this));
      this.bT.a(3, new cir.a<>(this, cjv.class, 24.0F, 1.5, 1.5));
      this.bT.a(4, new cdb(this, 0.4F));
      this.bT.a(5, new cdf(this, 1.0, true));
      this.bT.a(6, new cct(this, 1.0, 10.0F, 2.0F));
      this.bT.a(7, new cch(this, 1.0));
      this.bT.a(8, new cei(this, 1.0));
      this.bT.a(9, new ccd(this, 8.0F));
      this.bT.a(10, new cdd(this, cpo.class, 8.0F));
      this.bT.a(10, new cdq(this));
      this.bU.a(1, new ces(this));
      this.bU.a(2, new cet(this));
      this.bU.a(3, new cen(this).a());
      this.bU.a(4, new ceo<>(this, cpo.class, 10, true, false, this::a));
      this.bU.a(5, new cer<>(this, cho.class, false, cd));
      this.bU.a(6, new cer<>(this, cip.class, false, cip.bZ));
      this.bU.a(7, new ceo<>(this, clw.class, false));
      this.bU.a(8, new ceu<>(this, true));
   }

   public alp gA() {
      cis $$0 = this.gB().a();
      if (this.p()) {
         return $$0.b();
      } else {
         return this.ad_() ? $$0.c() : $$0.a();
      }
   }

   public jq<cis> gB() {
      return this.al.a(ci);
   }

   public void j(jq<cis> $$0) {
      this.al.a(ci, $$0);
   }

   public static bxe.a gC() {
      return cho.gt().a(bxf.v, 0.3F).a(bxf.s, 8.0).a(bxf.c, 4.0);
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      ke $$1 = this.dY();
      kd<cis> $$2 = $$1.e(mb.m);
      $$0.a(ci, $$2.a(cit.j).or($$2::a).orElseThrow());
      $$0.a(cf, false);
      $$0.a(cg, cwd.o.a());
      $$0.a(ch, 0);
   }

   @Override
   protected void b(jh $$0, dxo $$1) {
      this.a(awv.DI, 0.15F, 1.0F);
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      $$0.a("CollarColor", (byte)this.gE().a());
      this.gB().e().ifPresent($$1 -> $$0.a("variant", $$1.a().toString()));
      this.a_($$0);
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      Optional.ofNullable(alp.c($$0.l("variant"))).map($$0x -> alo.a(mb.m, $$0x)).flatMap($$0x -> this.dY().e(mb.m).a($$0x)).ifPresent(this::j);
      if ($$0.b("CollarColor", 99)) {
         this.a(cwd.a($$0.h("CollarColor")));
      }

      this.a(this.dW(), $$0);
   }

   @Nullable
   @Override
   public bwq a(dhq $$0, bsy $$1, bvh $$2, @Nullable bwq $$3) {
      jq<dib> $$4 = $$0.t(this.dw());
      jq<cis> $$6;
      if ($$3 instanceof cir.b $$5) {
         $$6 = $$5.a;
      } else {
         $$6 = cit.a(this.dY(), $$4);
         $$3 = new cir.b($$6);
      }

      this.j($$6);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected awu u() {
      if (this.ad_()) {
         return awv.DD;
      } else if (this.ae.a(3) == 0) {
         return this.p() && this.eE() < 20.0F ? awv.DJ : awv.DG;
      } else {
         return awv.DB;
      }
   }

   @Override
   protected awu e(btr $$0) {
      return this.h($$0) ? awv.Dz : awv.DF;
   }

   @Override
   protected awu o_() {
      return awv.DC;
   }

   @Override
   protected float fg() {
      return 0.4F;
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dW().C && this.co && !this.cp && !this.gk() && this.aJ()) {
         this.cp = true;
         this.cq = 0.0F;
         this.cr = 0.0F;
         this.dW().a(this, (byte)8);
      }

      if (!this.dW().C) {
         this.a((arx)this.dW(), true);
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.bL()) {
         this.cn = this.cm;
         if (this.gF()) {
            this.cm = this.cm + (1.0F - this.cm) * 0.4F;
         } else {
            this.cm = this.cm + (0.0F - this.cm) * 0.4F;
         }

         if (this.bl()) {
            this.co = true;
            if (this.cp && !this.dW().C) {
               this.dW().a(this, (byte)56);
               this.gG();
            }
         } else if ((this.co || this.cp) && this.cp) {
            if (this.cq == 0.0F) {
               this.a(awv.DH, this.fg(), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
               this.a(eck.u);
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
               float $$0 = (float)this.dD();
               int $$1 = (int)(azu.a((this.cq - 0.4F) * (float) Math.PI) * 7.0F);
               fbr $$2 = this.dz();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.ae.i() * 2.0F - 1.0F) * this.dr() * 0.5F;
                  float $$5 = (this.ae.i() * 2.0F - 1.0F) * this.dr() * 0.5F;
                  this.dW().a(ls.ao, this.dB() + (double)$$4, (double)($$0 + 0.8F), this.dH() + (double)$$5, $$2.d, $$2.e, $$2.f);
               }
            }
         }
      }
   }

   private void gG() {
      this.cp = false;
      this.cq = 0.0F;
      this.cr = 0.0F;
   }

   @Override
   public void a(btr $$0) {
      this.co = false;
      this.cp = false;
      this.cr = 0.0F;
      this.cq = 0.0F;
      super.a($$0);
   }

   public float J(float $$0) {
      return !this.co ? 1.0F : Math.min(0.75F + azu.h($$0, this.cr, this.cq) / 2.0F * 0.25F, 1.0F);
   }

   public float K(float $$0) {
      return azu.h($$0, this.cr, this.cq);
   }

   public float L(float $$0) {
      return azu.h($$0, this.cn, this.cm) * 0.15F * (float) Math.PI;
   }

   @Override
   public int Z() {
      return this.x() ? 20 : super.Z();
   }

   @Override
   public boolean a(arx $$0, btr $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.z(false);
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean e(bvj $$0) {
      return true;
   }

   @Override
   protected void b(arx $$0, btr $$1, float $$2) {
      if (!this.h($$1)) {
         super.b($$0, $$1, $$2);
      } else {
         cxg $$3 = this.af();
         int $$4 = $$3.o();
         int $$5 = $$3.p();
         $$3.a(azu.f($$2), this, bvj.g);
         if (buy.b.a($$4, $$5) != buy.b.a(this.af())) {
            this.a(awv.Dy);
            $$0.a(new lo(ls.T, cxk.oV.n()), this.dB(), this.dD() + 1.0, this.dH(), 20, 0.2, 0.1, 0.2, 0.1);
         }
      }
   }

   private boolean h(btr $$0) {
      return this.af().a(cxk.oW) && !$$0.a(axm.C);
   }

   @Override
   protected void t() {
      if (this.p()) {
         this.g(bxf.s).a(40.0);
         this.x(40.0F);
      } else {
         this.g(bxf.s).a(8.0);
      }
   }

   @Override
   protected void c(btr $$0, float $$1) {
      this.a($$0, $$1, new bvj[]{bvj.g});
   }

   @Override
   public bta b(cpo $$0, bsz $$1) {
      cxg $$2 = $$0.b($$1);
      cxc $$3 = $$2.h();
      if (this.p()) {
         if (this.j($$2) && this.eE() < this.eS()) {
            this.a($$0, $$1, $$2);
            csq $$4 = $$2.a(ku.w);
            float $$5 = $$4 != null ? (float)$$4.a() : 1.0F;
            this.c(2.0F * $$5);
            return bta.a;
         } else {
            if ($$3 instanceof cwe $$6 && this.j($$0)) {
               cwd $$7 = $$6.b();
               if ($$7 != this.gE()) {
                  this.a($$7);
                  $$2.a(1, $$0);
                  return bta.a;
               }

               return super.b($$0, $$1);
            }

            if (this.a($$2, bvj.g) && !this.ag() && this.j($$0) && !this.e_()) {
               this.h($$2.c(1));
               $$2.a(1, $$0);
               return bta.a;
            } else if ($$2.a(cxk.sS) && this.j($$0) && this.ag() && (!dds.a(this.af(), ddr.E) || $$0.b())) {
               $$2.a(1, $$0, d($$1));
               this.a(awv.az);
               cxg $$8 = this.af();
               this.h(cxg.j);
               if (this.dW() instanceof arx $$9) {
                  this.a($$9, $$8);
               }

               return bta.a;
            } else if (this.x() && this.ag() && this.j($$0) && this.af().n() && this.af().b($$2)) {
               $$2.h(1);
               this.a(awv.DA);
               cxg $$10 = this.af();
               int $$11 = (int)((float)$$10.p() * 0.125F);
               $$10.b(Math.max(0, $$10.o() - $$11));
               return bta.a;
            } else {
               bta $$12 = super.b($$0, $$1);
               if (!$$12.a() && this.j($$0)) {
                  this.z(!this.go());
                  this.bn = false;
                  this.bS.o();
                  this.h(null);
                  return bta.a.b();
               } else {
                  return $$12;
               }
            }
         }
      } else if (!this.dW().C && $$2.a(cxk.sw) && !this.ad_()) {
         $$2.a(1, $$0);
         this.g($$0);
         return bta.b;
      } else {
         return super.b($$0, $$1);
      }
   }

   private void g(cpo $$0) {
      if (this.ae.a(3) == 0) {
         this.a($$0);
         this.bS.o();
         this.h(null);
         this.z(true);
         this.dW().a(this, (byte)7);
      } else {
         this.dW().a(this, (byte)6);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 8) {
         this.cp = true;
         this.cq = 0.0F;
         this.cr = 0.0F;
      } else if ($$0 == 56) {
         this.gG();
      } else {
         super.b($$0);
      }
   }

   public float gD() {
      if (this.ad_()) {
         return 1.5393804F;
      } else if (this.p()) {
         float $$0 = this.eS();
         float $$1 = ($$0 - this.eE()) / $$0;
         return (0.55F - $$1 * 0.4F) * (float) Math.PI;
      } else {
         return (float) (Math.PI / 5);
      }
   }

   @Override
   public boolean j(cxg $$0) {
      return $$0.a(axt.ai);
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

   public cwd gE() {
      return cwd.a(this.al.a(cg));
   }

   private void a(cwd $$0) {
      this.al.a(cg, $$0.a());
   }

   @Nullable
   public cir b(arx $$0, bus $$1) {
      cir $$2 = bvi.bM.a($$0, bvh.e);
      if ($$2 != null && $$1 instanceof cir $$3) {
         if (this.ae.h()) {
            $$2.j(this.gB());
         } else {
            $$2.j($$3.gB());
         }

         if (this.p()) {
            $$2.b(this.ab_());
            $$2.b(true, true);
            if (this.ae.h()) {
               $$2.a(this.gE());
            } else {
               $$2.a($$3.gE());
            }
         }
      }

      return $$2;
   }

   public void A(boolean $$0) {
      this.al.a(cf, $$0);
   }

   @Override
   public boolean a(cho $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.p()) {
         return false;
      } else if (!($$0 instanceof cir $$1)) {
         return false;
      } else if (!$$1.p()) {
         return false;
      } else {
         return $$1.x() ? false : this.gy() && $$1.gy();
      }
   }

   public boolean gF() {
      return this.al.a(cf);
   }

   @Override
   public boolean a(bvx $$0, bvx $$1) {
      if ($$0 instanceof cma || $$0 instanceof cmi || $$0 instanceof clh) {
         return false;
      } else if ($$0 instanceof cir $$2) {
         return !$$2.p() || $$2.ah_() != $$1;
      } else {
         if ($$0 instanceof cpo $$3 && $$1 instanceof cpo $$4 && !$$4.a($$3)) {
            return false;
         }

         if ($$0 instanceof cjs $$5 && $$5.gF()) {
            return false;
         }

         if ($$0 instanceof bwu $$6 && $$6.p()) {
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
   public fbr cT() {
      return new fbr(0.0, (double)(0.6F * this.cS()), (double)(this.dr() * 0.4F));
   }

   public static boolean c(bvi<cir> $$0, dha $$1, bvh $$2, jh $$3, bac $$4) {
      return $$1.a_($$3.e()).a(axk.ch) && a($$1, $$3);
   }

   class a<T extends bvx> extends ccc<T> {
      private final cir j;

      public a(final cir $$0, final Class<T> $$1, final float $$2, final double $$3, final double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.b instanceof cjv ? !this.j.p() && this.a((cjv)this.b) : false;
      }

      private boolean a(cjv $$0) {
         return $$0.gs() >= cir.this.ae.a(5);
      }

      @Override
      public void d() {
         cir.this.h(null);
         super.d();
      }

      @Override
      public void a() {
         cir.this.h(null);
         super.a();
      }
   }

   public static class b extends bus.a {
      public final jq<cis> a;

      public b(jq<cis> $$0) {
         super(false);
         this.a = $$0;
      }
   }
}
