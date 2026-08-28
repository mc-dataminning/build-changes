import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class chz extends bwc implements bvk, bwf<jr<cia>> {
   private static final ajx<Boolean> ce = akb.a(chz.class, ajz.k);
   private static final ajx<Integer> cf = akb.a(chz.class, ajz.b);
   private static final ajx<Integer> cg = akb.a(chz.class, ajz.b);
   private static final ajx<jr<cia>> ch = akb.a(chz.class, ajz.y);
   public static final cfw.a cc = ($$0, $$1) -> {
      buq<?> $$2 = $$0.aq();
      return $$2 == buq.ba || $$2 == buq.aX || $$2 == buq.aa;
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
   private static final brt cr = baa.a(20, 39);
   @Nullable
   private UUID cs;

   public chz(buq<? extends chz> $$0, dgg $$1) {
      super($$0, $$1);
      this.b(false, false);
      this.a(eto.f, -1.0F);
      this.a(eto.g, -1.0F);
   }

   @Override
   protected void B() {
      this.bS.a(1, new cbx(this));
      this.bS.a(1, new bwc.a(1.5, awq.G));
      this.bS.a(2, new cdi(this));
      this.bS.a(3, new chz.a<>(this, cjd.class, 24.0F, 1.5, 1.5));
      this.bS.a(4, new ccj(this, 0.4F));
      this.bS.a(5, new ccn(this, 1.0, true));
      this.bS.a(6, new ccb(this, 1.0, 10.0F, 2.0F));
      this.bS.a(7, new cbp(this, 1.0));
      this.bS.a(8, new cdq(this, 1.0));
      this.bS.a(9, new cbl(this, 8.0F));
      this.bS.a(10, new ccl(this, cov.class, 8.0F));
      this.bS.a(10, new ccy(this));
      this.bT.a(1, new cea(this));
      this.bT.a(2, new ceb(this));
      this.bT.a(3, new cdv(this).a());
      this.bT.a(4, new cdw<>(this, cov.class, 10, true, false, this::a));
      this.bT.a(5, new cdz<>(this, cgw.class, false, cc));
      this.bT.a(6, new cdz<>(this, chx.class, false, chx.bY));
      this.bT.a(7, new cdw<>(this, cle.class, false));
      this.bT.a(8, new cec<>(this, true));
   }

   public aku gB() {
      cia $$0 = this.gC().a();
      if (this.p()) {
         return $$0.b();
      } else {
         return this.ac_() ? $$0.c() : $$0.a();
      }
   }

   public jr<cia> gC() {
      return this.al.a(ch);
   }

   public void j(jr<cia> $$0) {
      this.al.a(ch, $$0);
   }

   public static bwm.a gD() {
      return cgw.gu().a(bwn.v, 0.3F).a(bwn.s, 8.0).a(bwn.c, 4.0);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      kf $$1 = this.dY();
      ke<cia> $$2 = $$1.e(mc.m);
      $$0.a(ch, $$2.a(cib.j).or($$2::a).orElseThrow());
      $$0.a(ce, false);
      $$0.a(cf, cvk.o.a());
      $$0.a(cg, 0);
   }

   @Override
   protected void b(ji $$0, dwv $$1) {
      this.a(avz.DH, 0.15F, 1.0F);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("CollarColor", (byte)this.gF().a());
      this.gC().e().ifPresent($$1 -> $$0.a("variant", $$1.a().toString()));
      this.a_($$0);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      Optional.ofNullable(aku.c($$0.l("variant"))).map($$0x -> akt.a(mc.m, $$0x)).flatMap($$0x -> this.dY().e(mc.m).a($$0x)).ifPresent(this::j);
      if ($$0.b("CollarColor", 99)) {
         this.a(cvk.a($$0.h("CollarColor")));
      }

      this.a(this.dW(), $$0);
   }

   @Nullable
   @Override
   public bvy a(dgx $$0, bsg $$1, bup $$2, @Nullable bvy $$3) {
      jr<dhi> $$4 = $$0.t(this.dw());
      jr<cia> $$6;
      if ($$3 instanceof chz.b $$5) {
         $$6 = $$5.a;
      } else {
         $$6 = cib.a(this.dY(), $$4);
         $$3 = new chz.b($$6);
      }

      this.j($$6);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected avy u() {
      if (this.ac_()) {
         return avz.DC;
      } else if (this.ae.a(3) == 0) {
         return this.p() && this.eE() < 20.0F ? avz.DI : avz.DF;
      } else {
         return avz.DA;
      }
   }

   @Override
   protected avy e(bsz $$0) {
      return this.j($$0) ? avz.Dy : avz.DE;
   }

   @Override
   protected avy o_() {
      return avz.DB;
   }

   @Override
   protected float fg() {
      return 0.4F;
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dW().C && this.cn && !this.co && !this.gl() && this.aJ()) {
         this.co = true;
         this.cp = 0.0F;
         this.cq = 0.0F;
         this.dW().a(this, (byte)8);
      }

      if (!this.dW().C) {
         this.a((arc)this.dW(), true);
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.bL()) {
         this.cm = this.cl;
         if (this.gG()) {
            this.cl = this.cl + (1.0F - this.cl) * 0.4F;
         } else {
            this.cl = this.cl + (0.0F - this.cl) * 0.4F;
         }

         if (this.bl()) {
            this.cn = true;
            if (this.co && !this.dW().C) {
               this.dW().a(this, (byte)56);
               this.gH();
            }
         } else if ((this.cn || this.co) && this.co) {
            if (this.cp == 0.0F) {
               this.a(avz.DG, this.fg(), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
               this.a(ebr.u);
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
               float $$0 = (float)this.dD();
               int $$1 = (int)(ayy.a((this.cp - 0.4F) * (float) Math.PI) * 7.0F);
               fay $$2 = this.dz();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.ae.i() * 2.0F - 1.0F) * this.dr() * 0.5F;
                  float $$5 = (this.ae.i() * 2.0F - 1.0F) * this.dr() * 0.5F;
                  this.dW().a(lt.ao, this.dB() + (double)$$4, (double)($$0 + 0.8F), this.dH() + (double)$$5, $$2.d, $$2.e, $$2.f);
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
   public void a(bsz $$0) {
      this.cn = false;
      this.co = false;
      this.cq = 0.0F;
      this.cp = 0.0F;
      super.a($$0);
   }

   public float J(float $$0) {
      return !this.cn ? 1.0F : Math.min(0.75F + ayy.h($$0, this.cq, this.cp) / 2.0F * 0.25F, 1.0F);
   }

   public float K(float $$0) {
      return ayy.h($$0, this.cq, this.cp);
   }

   public float L(float $$0) {
      return ayy.h($$0, this.cm, this.cl) * 0.15F * (float) Math.PI;
   }

   @Override
   public int aa() {
      return this.x() ? 20 : super.aa();
   }

   @Override
   public boolean a(arc $$0, bsz $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.z(false);
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean e(bur $$0) {
      return true;
   }

   @Override
   protected void b(arc $$0, bsz $$1, float $$2) {
      if (!this.j($$1)) {
         super.b($$0, $$1, $$2);
      } else {
         cwn $$3 = this.ag();
         int $$4 = $$3.o();
         int $$5 = $$3.p();
         $$3.a(ayy.f($$2), this, bur.g);
         if (bug.b.a($$4, $$5) != bug.b.a(this.ag())) {
            this.a(avz.Dx);
            $$0.a(new lp(lt.T, cwr.oV.n()), this.dB(), this.dD() + 1.0, this.dH(), 20, 0.2, 0.1, 0.2, 0.1);
         }
      }
   }

   private boolean j(bsz $$0) {
      return this.ag().a(cwr.oW) && !$$0.a(awq.C);
   }

   @Override
   protected void t() {
      if (this.p()) {
         this.g(bwn.s).a(40.0);
         this.x(40.0F);
      } else {
         this.g(bwn.s).a(8.0);
      }
   }

   @Override
   protected void c(bsz $$0, float $$1) {
      this.a($$0, $$1, new bur[]{bur.g});
   }

   @Override
   public bsi b(cov $$0, bsh $$1) {
      cwn $$2 = $$0.b($$1);
      cwj $$3 = $$2.h();
      if (this.p()) {
         if (this.j($$2) && this.eE() < this.eS()) {
            this.a($$0, $$1, $$2);
            crx $$4 = $$2.a(kv.w);
            float $$5 = $$4 != null ? (float)$$4.a() : 1.0F;
            this.c(2.0F * $$5);
            return bsi.a;
         } else {
            if ($$3 instanceof cvl $$6 && this.j($$0)) {
               cvk $$7 = $$6.b();
               if ($$7 != this.gF()) {
                  this.a($$7);
                  $$2.a(1, $$0);
                  return bsi.a;
               }

               return super.b($$0, $$1);
            }

            if (this.a($$2, bur.g) && !this.ai() && this.j($$0) && !this.e_()) {
               this.h($$2.c(1));
               $$2.a(1, $$0);
               return bsi.a;
            } else if ($$2.a(cwr.sS) && this.j($$0) && this.ai() && (!dcz.a(this.ag(), dcy.E) || $$0.b())) {
               $$2.a(1, $$0, d($$1));
               this.a(avz.az);
               cwn $$8 = this.ag();
               this.h(cwn.j);
               if (this.dW() instanceof arc $$9) {
                  this.a($$9, $$8);
               }

               return bsi.a;
            } else if (this.x() && this.ai() && this.j($$0) && this.ag().n() && this.ag().b($$2)) {
               $$2.h(1);
               this.a(avz.Dz);
               cwn $$10 = this.ag();
               int $$11 = (int)((float)$$10.p() * 0.125F);
               $$10.b(Math.max(0, $$10.o() - $$11));
               return bsi.a;
            } else {
               bsi $$12 = super.b($$0, $$1);
               if (!$$12.a() && this.j($$0)) {
                  this.z(!this.gp());
                  this.bm = false;
                  this.bR.m();
                  this.h(null);
                  return bsi.a.b();
               } else {
                  return $$12;
               }
            }
         }
      } else if (!this.dW().C && $$2.a(cwr.sw) && !this.ac_()) {
         $$2.a(1, $$0);
         this.g($$0);
         return bsi.b;
      } else {
         return super.b($$0, $$1);
      }
   }

   private void g(cov $$0) {
      if (this.ae.a(3) == 0) {
         this.a($$0);
         this.bR.m();
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
         this.co = true;
         this.cp = 0.0F;
         this.cq = 0.0F;
      } else if ($$0 == 56) {
         this.gH();
      } else {
         super.b($$0);
      }
   }

   public float gE() {
      if (this.ac_()) {
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
   public boolean j(cwn $$0) {
      return $$0.a(awx.ag);
   }

   @Override
   public int af() {
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

   public cvk gF() {
      return cvk.a(this.al.a(cf));
   }

   private void a(cvk $$0) {
      this.al.a(cf, $$0.a());
   }

   @Nullable
   public chz b(arc $$0, bua $$1) {
      chz $$2 = buq.bL.a($$0, bup.e);
      if ($$2 != null && $$1 instanceof chz $$3) {
         if (this.ae.h()) {
            $$2.j(this.gC());
         } else {
            $$2.j($$3.gC());
         }

         if (this.p()) {
            $$2.b(this.aa_());
            $$2.b(true, true);
            cvk $$4 = this.gF();
            cvk $$5 = $$3.gF();
            $$2.a(cvk.a($$0, $$4, $$5));
         }
      }

      return $$2;
   }

   public void A(boolean $$0) {
      this.al.a(ce, $$0);
   }

   @Override
   public boolean a(cgw $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.p()) {
         return false;
      } else if (!($$0 instanceof chz $$1)) {
         return false;
      } else if (!$$1.p()) {
         return false;
      } else {
         return $$1.x() ? false : this.gz() && $$1.gz();
      }
   }

   public boolean gG() {
      return this.al.a(ce);
   }

   @Override
   public boolean a(bvf $$0, bvf $$1) {
      if ($$0 instanceof cli || $$0 instanceof clq || $$0 instanceof ckp) {
         return false;
      } else if ($$0 instanceof chz $$2) {
         return !$$2.p() || $$2.ag_() != $$1;
      } else {
         if ($$0 instanceof cov $$3 && $$1 instanceof cov $$4 && !$$4.a($$3)) {
            return false;
         }

         if ($$0 instanceof cja $$5 && $$5.gG()) {
            return false;
         }

         if ($$0 instanceof bwc $$6 && $$6.p()) {
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
   public fay cT() {
      return new fay(0.0, (double)(0.6F * this.cS()), (double)(this.dr() * 0.4F));
   }

   public static boolean c(buq<chz> $$0, dgh $$1, bup $$2, ji $$3, azg $$4) {
      return $$1.a_($$3.e()).a(awo.ch) && a($$1, $$3);
   }

   class a<T extends bvf> extends cbk<T> {
      private final chz j;

      public a(final chz $$0, final Class<T> $$1, final float $$2, final double $$3, final double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.b instanceof cjd ? !this.j.p() && this.a((cjd)this.b) : false;
      }

      private boolean a(cjd $$0) {
         return $$0.gt() >= chz.this.ae.a(5);
      }

      @Override
      public void d() {
         chz.this.h(null);
         super.d();
      }

      @Override
      public void a() {
         chz.this.h(null);
         super.a();
      }
   }

   public static class b extends bua.a {
      public final jr<cia> a;

      public b(jr<cia> $$0) {
         super(false);
         this.a = $$0;
      }
   }
}
