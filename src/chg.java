import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class chg extends bvj implements bus, bvm<jo<chh>> {
   private static final akh<Boolean> ce = akl.a(chg.class, akj.k);
   private static final akh<Integer> cf = akl.a(chg.class, akj.b);
   private static final akh<Integer> cg = akl.a(chg.class, akj.b);
   private static final akh<jo<chh>> ch = akl.a(chg.class, akj.y);
   public static final Predicate<bun> cc = $$0 -> {
      bty<?> $$1 = $$0.ao();
      return $$1 == bty.aJ || $$1 == bty.aG || $$1 == bty.Q;
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
   private static final brd cr = bag.a(20, 39);
   @Nullable
   private UUID cs;

   public chg(bty<? extends chg> $$0, dej $$1) {
      super($$0, $$1);
      this.b(false, false);
      this.a(erk.f, -1.0F);
      this.a(erk.g, -1.0F);
   }

   @Override
   protected void D() {
      this.bS.a(1, new cbe(this));
      this.bS.a(1, new bvj.a(1.5, awx.G));
      this.bS.a(2, new ccp(this));
      this.bS.a(3, new chg.a<>(this, cik.class, 24.0F, 1.5, 1.5));
      this.bS.a(4, new cbq(this, 0.4F));
      this.bS.a(5, new cbu(this, 1.0, true));
      this.bS.a(6, new cbi(this, 1.0, 10.0F, 2.0F));
      this.bS.a(7, new caw(this, 1.0));
      this.bS.a(8, new ccx(this, 1.0));
      this.bS.a(9, new cas(this, 8.0F));
      this.bS.a(10, new cbs(this, cnx.class, 8.0F));
      this.bS.a(10, new ccf(this));
      this.bT.a(1, new cdh(this));
      this.bT.a(2, new cdi(this));
      this.bT.a(3, new cdc(this).a());
      this.bT.a(4, new cdd<>(this, cnx.class, 10, true, false, this::a_));
      this.bT.a(5, new cdg<>(this, cgd.class, false, cc));
      this.bT.a(6, new cdg<>(this, che.class, false, che.bY));
      this.bT.a(7, new cdd<>(this, ckl.class, false));
      this.bT.a(8, new cdj<>(this, true));
   }

   public ale gA() {
      chh $$0 = this.gB().a();
      if (this.q()) {
         return $$0.b();
      } else {
         return this.ad_() ? $$0.c() : $$0.a();
      }
   }

   public jo<chh> gB() {
      return this.am.a(ch);
   }

   public void j(jo<chh> $$0) {
      this.am.a(ch, $$0);
   }

   public static bvt.a gC() {
      return cgd.gt().a(bvu.v, 0.3F).a(bvu.s, 8.0).a(bvu.c, 4.0);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      kc $$1 = this.dU();
      kb<chh> $$2 = $$1.e(lw.m);
      $$0.a(ch, $$2.a(chi.j).or($$2::a).orElseThrow());
      $$0.a(ce, false);
      $$0.a(cf, cum.o.a());
      $$0.a(cg, 0);
   }

   @Override
   protected void b(jf $$0, dus $$1) {
      this.a(awg.CZ, 0.15F, 1.0F);
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      $$0.a("CollarColor", (byte)this.gE().a());
      this.gB().e().ifPresent($$1 -> $$0.a("variant", $$1.a().toString()));
      this.a_($$0);
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      Optional.ofNullable(ale.c($$0.l("variant"))).map($$0x -> ald.a(lw.m, $$0x)).flatMap($$0x -> this.dU().e(lw.m).a($$0x)).ifPresent(this::j);
      if ($$0.b("CollarColor", 99)) {
         this.a(cum.a($$0.h("CollarColor")));
      }

      this.a(this.dS(), $$0);
   }

   @Nullable
   @Override
   public bvf a(dez $$0, brq $$1, btx $$2, @Nullable bvf $$3) {
      jo<dfk> $$4 = $$0.t(this.ds());
      jo<chh> $$6;
      if ($$3 instanceof chg.b $$5) {
         $$6 = $$5.a;
      } else {
         $$6 = chi.a(this.dU(), $$4);
         $$3 = new chg.b($$6);
      }

      this.j($$6);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected awf w() {
      if (this.ad_()) {
         return awg.CU;
      } else if (this.af.a(3) == 0) {
         return this.q() && this.eB() < 20.0F ? awg.Da : awg.CX;
      } else {
         return awg.CS;
      }
   }

   @Override
   protected awf d(bsj $$0) {
      return this.g($$0) ? awg.CQ : awg.CW;
   }

   @Override
   protected awf o_() {
      return awg.CT;
   }

   @Override
   protected float fd() {
      return 0.4F;
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dS().B && this.cn && !this.co && !this.gk() && this.aH()) {
         this.co = true;
         this.cp = 0.0F;
         this.cq = 0.0F;
         this.dS().a(this, (byte)8);
      }

      if (!this.dS().B) {
         this.a((arj)this.dS(), true);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.bI()) {
         this.cm = this.cl;
         if (this.gG()) {
            this.cl = this.cl + (1.0F - this.cl) * 0.4F;
         } else {
            this.cl = this.cl + (0.0F - this.cl) * 0.4F;
         }

         if (this.bk()) {
            this.cn = true;
            if (this.co && !this.dS().B) {
               this.dS().a(this, (byte)56);
               this.gH();
            }
         } else if ((this.cn || this.co) && this.co) {
            if (this.cp == 0.0F) {
               this.a(awg.CY, this.fd(), (this.af.i() - this.af.i()) * 0.2F + 1.0F);
               this.a(dzp.u);
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
               float $$0 = (float)this.dz();
               int $$1 = (int)(azf.a((this.cp - 0.4F) * (float) Math.PI) * 7.0F);
               eyw $$2 = this.dv();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.af.i() * 2.0F - 1.0F) * this.dn() * 0.5F;
                  float $$5 = (this.af.i() * 2.0F - 1.0F) * this.dn() * 0.5F;
                  this.dS().a(lo.am, this.dx() + (double)$$4, (double)($$0 + 0.8F), this.dD() + (double)$$5, $$2.d, $$2.e, $$2.f);
               }
            }
         }
      }
   }

   private void gH() {
      this.co = false;
      this.cp = 0.0F;
      this.cq = 0.0F;
   }

   @Override
   public void a(bsj $$0) {
      this.cn = false;
      this.co = false;
      this.cq = 0.0F;
      this.cp = 0.0F;
      super.a($$0);
   }

   public float J(float $$0) {
      return !this.cn ? 1.0F : Math.min(0.75F + azf.h($$0, this.cq, this.cp) / 2.0F * 0.25F, 1.0F);
   }

   public float K(float $$0) {
      return azf.h($$0, this.cq, this.cp);
   }

   public float L(float $$0) {
      return azf.h($$0, this.cm, this.cl) * 0.15F * (float) Math.PI;
   }

   @Override
   public int ad() {
      return this.y() ? 20 : super.ad();
   }

   @Override
   public boolean a(bsj $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dS().B) {
            this.z(false);
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public boolean e(btz $$0) {
      return true;
   }

   @Override
   protected void f(bsj $$0, float $$1) {
      if (!this.g($$0)) {
         super.f($$0, $$1);
      } else {
         cvs $$2 = this.fT();
         int $$3 = $$2.o();
         int $$4 = $$2.p();
         $$2.a(azf.f($$1), this, btz.g);
         if (bto.b.a($$3, $$4) != bto.b.a(this.fT())) {
            this.a(awg.CP);
            if (this.dS() instanceof arj $$5) {
               $$5.a(new lk(lo.S, cvw.or.v()), this.dx(), this.dz() + 1.0, this.dD(), 20, 0.2, 0.1, 0.2, 0.1);
            }
         }
      }
   }

   private boolean g(bsj $$0) {
      return this.gF() && !$$0.a(awx.C);
   }

   @Override
   protected void t() {
      if (this.q()) {
         this.g(bvu.s).a(40.0);
         this.x(40.0F);
      } else {
         this.g(bvu.s).a(8.0);
      }
   }

   @Override
   protected void b(bsj $$0, float $$1) {
      this.a($$0, $$1, new btz[]{btz.g});
   }

   @Override
   public brs b(cnx $$0, brr $$1) {
      cvs $$2 = $$0.b($$1);
      cvn $$3 = $$2.h();
      if (this.q()) {
         if (this.n($$2) && this.eB() < this.eQ()) {
            $$2.a(1, $$0);
            cqw $$4 = $$2.a(ks.v);
            float $$5 = $$4 != null ? (float)$$4.a() : 1.0F;
            this.c(2.0F * $$5);
            return brs.a;
         } else {
            if ($$3 instanceof cun $$6 && this.j($$0)) {
               cum $$7 = $$6.c();
               if ($$7 != this.gE()) {
                  this.a($$7);
                  $$2.a(1, $$0);
                  return brs.a;
               }

               return super.b($$0, $$1);
            }

            if ($$2.a(cvw.os) && this.j($$0) && this.fT().f() && !this.p_()) {
               this.l($$2.c(1));
               $$2.a(1, $$0);
               return brs.a;
            } else if ($$2.a(cvw.rW) && this.j($$0) && this.gF() && (!dbp.a(this.fT(), dbo.E) || $$0.f())) {
               $$2.a(1, $$0, d($$1));
               this.a(awg.az);
               cvs $$8 = this.fT();
               this.l(cvs.k);
               this.b($$8);
               return brs.a;
            } else if (this.y() && this.gF() && this.j($$0) && this.fT().n() && this.fT().b($$2)) {
               $$2.h(1);
               this.a(awg.CR);
               cvs $$9 = this.fT();
               int $$10 = (int)((float)$$9.p() * 0.125F);
               $$9.b(Math.max(0, $$9.o() - $$10));
               return brs.a;
            } else {
               brs $$11 = super.b($$0, $$1);
               if (!$$11.a() && this.j($$0)) {
                  this.z(!this.go());
                  this.bj = false;
                  this.bR.o();
                  this.h(null);
                  return brs.a.b();
               } else {
                  return $$11;
               }
            }
         }
      } else if (!this.dS().B && $$2.a(cvw.rA) && !this.ad_()) {
         $$2.a(1, $$0);
         this.g($$0);
         return brs.b;
      } else {
         return super.b($$0, $$1);
      }
   }

   private void g(cnx $$0) {
      if (this.af.a(3) == 0) {
         this.a($$0);
         this.bR.o();
         this.h(null);
         this.z(true);
         this.dS().a(this, (byte)7);
      } else {
         this.dS().a(this, (byte)6);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 8) {
         this.co = true;
         this.cp = 0.0F;
         this.cq = 0.0F;
      } else if ($$0 == 56) {
         this.gH();
      } else {
         super.b($$0);
      }
   }

   public float gD() {
      if (this.ad_()) {
         return 1.5393804F;
      } else if (this.q()) {
         float $$0 = this.eQ();
         float $$1 = ($$0 - this.eB()) / $$0;
         return (0.55F - $$1 * 0.4F) * (float) Math.PI;
      } else {
         return (float) (Math.PI / 5);
      }
   }

   @Override
   public boolean n(cvs $$0) {
      return $$0.a(axe.ad);
   }

   @Override
   public int fS() {
      return 8;
   }

   @Override
   public int a() {
      return this.am.a(cg);
   }

   @Override
   public void a(int $$0) {
      this.am.a(cg, $$0);
   }

   @Override
   public void c() {
      this.a(cr.a(this.af));
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

   public cum gE() {
      return cum.a(this.am.a(cf));
   }

   public boolean gF() {
      return this.fT().a(cvw.os);
   }

   private void a(cum $$0) {
      this.am.a(cf, $$0.a());
   }

   @Nullable
   public chg b(arj $$0, btk $$1) {
      chg $$2 = bty.bs.a($$0, btx.e);
      if ($$2 != null && $$1 instanceof chg $$3) {
         if (this.af.h()) {
            $$2.j(this.gB());
         } else {
            $$2.j($$3.gB());
         }

         if (this.q()) {
            $$2.b(this.aa_());
            $$2.b(true, true);
            if (this.af.h()) {
               $$2.a(this.gE());
            } else {
               $$2.a($$3.gE());
            }
         }
      }

      return $$2;
   }

   public void A(boolean $$0) {
      this.am.a(ce, $$0);
   }

   @Override
   public boolean a(cgd $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.q()) {
         return false;
      } else if (!($$0 instanceof chg $$1)) {
         return false;
      } else if (!$$1.q()) {
         return false;
      } else {
         return $$1.y() ? false : this.gy() && $$1.gy();
      }
   }

   public boolean gG() {
      return this.am.a(ce);
   }

   @Override
   public boolean a(bun $$0, bun $$1) {
      if ($$0 instanceof ckp || $$0 instanceof ckx || $$0 instanceof cjw) {
         return false;
      } else if ($$0 instanceof chg $$2) {
         return !$$2.q() || $$2.S_() != $$1;
      } else {
         if ($$0 instanceof cnx $$3 && $$1 instanceof cnx $$4 && !$$4.a($$3)) {
            return false;
         }

         if ($$0 instanceof cih $$5 && $$5.gF()) {
            return false;
         }

         if ($$0 instanceof bvj $$6 && $$6.q()) {
            return false;
         }

         return true;
      }
   }

   @Override
   public boolean A() {
      return !this.ad_();
   }

   @Override
   public eyw cQ() {
      return new eyw(0.0, (double)(0.6F * this.cP()), (double)(this.dn() * 0.4F));
   }

   public static boolean c(bty<chg> $$0, dek $$1, btx $$2, jf $$3, azn $$4) {
      return $$1.a_($$3.e()).a(awv.cg) && a($$1, $$3);
   }

   class a<T extends bun> extends car<T> {
      private final chg j;

      public a(final chg $$0, final Class<T> $$1, final float $$2, final double $$3, final double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.b instanceof cik ? !this.j.q() && this.a((cik)this.b) : false;
      }

      private boolean a(cik $$0) {
         return $$0.gs() >= chg.this.af.a(5);
      }

      @Override
      public void d() {
         chg.this.h(null);
         super.d();
      }

      @Override
      public void a() {
         chg.this.h(null);
         super.a();
      }
   }

   public static class b extends btk.a {
      public final jo<chh> a;

      public b(jo<chh> $$0) {
         super(false);
         this.a = $$0;
      }
   }
}
