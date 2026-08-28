import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class chy extends bwb implements bvj, bwe<jq<chz>> {
   private static final ako<Boolean> ce = aks.a(chy.class, akq.k);
   private static final ako<Integer> cf = aks.a(chy.class, akq.b);
   private static final ako<Integer> cg = aks.a(chy.class, akq.b);
   private static final ako<jq<chz>> ch = aks.a(chy.class, akq.y);
   public static final Predicate<bve> cc = $$0 -> {
      bup<?> $$1 = $$0.ar();
      return $$1 == bup.aJ || $$1 == bup.aG || $$1 == bup.Q;
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
   private static final brs cr = bap.a(20, 39);
   @Nullable
   private UUID cs;

   public chy(bup<? extends chy> $$0, dff $$1) {
      super($$0, $$1);
      this.b(false, false);
      this.a(esf.f, -1.0F);
      this.a(esf.g, -1.0F);
   }

   @Override
   protected void D() {
      this.bS.a(1, new cbw(this));
      this.bS.a(1, new bwb.a(1.5, axf.G));
      this.bS.a(2, new cdh(this));
      this.bS.a(3, new chy.a<>(this, cjc.class, 24.0F, 1.5, 1.5));
      this.bS.a(4, new cci(this, 0.4F));
      this.bS.a(5, new ccm(this, 1.0, true));
      this.bS.a(6, new cca(this, 1.0, 10.0F, 2.0F));
      this.bS.a(7, new cbo(this, 1.0));
      this.bS.a(8, new cdp(this, 1.0));
      this.bS.a(9, new cbk(this, 8.0F));
      this.bS.a(10, new cck(this, cor.class, 8.0F));
      this.bS.a(10, new ccx(this));
      this.bT.a(1, new cdz(this));
      this.bT.a(2, new cea(this));
      this.bT.a(3, new cdu(this).a());
      this.bT.a(4, new cdv<>(this, cor.class, 10, true, false, this::a_));
      this.bT.a(5, new cdy<>(this, cgv.class, false, cc));
      this.bT.a(6, new cdy<>(this, chw.class, false, chw.bY));
      this.bT.a(7, new cdv<>(this, cld.class, false));
      this.bT.a(8, new ceb<>(this, true));
   }

   public all gH() {
      chz $$0 = this.gI().a();
      if (this.q()) {
         return $$0.b();
      } else {
         return this.ae_() ? $$0.c() : $$0.a();
      }
   }

   public jq<chz> gI() {
      return this.am.a(ch);
   }

   public void j(jq<chz> $$0) {
      this.am.a(ch, $$0);
   }

   public static bwl.a gJ() {
      return cgv.gA().a(bwm.v, 0.3F).a(bwm.s, 8.0).a(bwm.c, 4.0);
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      ke $$1 = this.ea();
      kd<chz> $$2 = $$1.e(ma.m);
      $$0.a(ch, $$2.a(cia.j).or($$2::a).orElseThrow());
      $$0.a(ce, false);
      $$0.a(cf, cvc.o.a());
      $$0.a(cg, 0);
   }

   @Override
   protected void b(jh $$0, dvo $$1) {
      this.a(awo.CX, 0.15F, 1.0F);
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      $$0.a("CollarColor", (byte)this.gL().a());
      this.gI().e().ifPresent($$1 -> $$0.a("variant", $$1.a().toString()));
      this.a_($$0);
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      Optional.ofNullable(all.c($$0.l("variant"))).map($$0x -> alk.a(ma.m, $$0x)).flatMap($$0x -> this.ea().e(ma.m).a($$0x)).ifPresent(this::j);
      if ($$0.b("CollarColor", 99)) {
         this.a(cvc.a($$0.h("CollarColor")));
      }

      this.a(this.dY(), $$0);
   }

   @Nullable
   @Override
   public bvx a(dfw $$0, bsf $$1, buo $$2, @Nullable bvx $$3) {
      jq<dgh> $$4 = $$0.t(this.dy());
      jq<chz> $$6;
      if ($$3 instanceof chy.b $$5) {
         $$6 = $$5.a;
      } else {
         $$6 = cia.a(this.ea(), $$4);
         $$3 = new chy.b($$6);
      }

      this.j($$6);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected awn w() {
      if (this.ae_()) {
         return awo.CS;
      } else if (this.af.a(3) == 0) {
         return this.q() && this.eH() < 20.0F ? awo.CY : awo.CV;
      } else {
         return awo.CQ;
      }
   }

   @Override
   protected awn d(bsy $$0) {
      return this.g($$0) ? awo.CO : awo.CU;
   }

   @Override
   protected awn o_() {
      return awo.CR;
   }

   @Override
   protected float fj() {
      return 0.4F;
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dY().C && this.cn && !this.co && !this.gr() && this.aL()) {
         this.co = true;
         this.cp = 0.0F;
         this.cq = 0.0F;
         this.dY().a(this, (byte)8);
      }

      if (!this.dY().C) {
         this.a((arq)this.dY(), true);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.bN()) {
         this.cm = this.cl;
         if (this.gM()) {
            this.cl = this.cl + (1.0F - this.cl) * 0.4F;
         } else {
            this.cl = this.cl + (0.0F - this.cl) * 0.4F;
         }

         if (this.bn()) {
            this.cn = true;
            if (this.co && !this.dY().C) {
               this.dY().a(this, (byte)56);
               this.gN();
            }
         } else if ((this.cn || this.co) && this.co) {
            if (this.cp == 0.0F) {
               this.a(awo.CW, this.fj(), (this.af.i() - this.af.i()) * 0.2F + 1.0F);
               this.a(eak.u);
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
               float $$0 = (float)this.dF();
               int $$1 = (int)(azn.a((this.cp - 0.4F) * (float) Math.PI) * 7.0F);
               ezr $$2 = this.dB();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.af.i() * 2.0F - 1.0F) * this.dt() * 0.5F;
                  float $$5 = (this.af.i() * 2.0F - 1.0F) * this.dt() * 0.5F;
                  this.dY().a(ls.am, this.dD() + (double)$$4, (double)($$0 + 0.8F), this.dJ() + (double)$$5, $$2.d, $$2.e, $$2.f);
               }
            }
         }
      }
   }

   private void gN() {
      this.co = false;
      this.cp = 0.0F;
      this.cq = 0.0F;
   }

   @Override
   public void a(bsy $$0) {
      this.cn = false;
      this.co = false;
      this.cq = 0.0F;
      this.cp = 0.0F;
      super.a($$0);
   }

   public float J(float $$0) {
      return !this.cn ? 1.0F : Math.min(0.75F + azn.h($$0, this.cq, this.cp) / 2.0F * 0.25F, 1.0F);
   }

   public float K(float $$0) {
      return azn.h($$0, this.cq, this.cp);
   }

   public float L(float $$0) {
      return azn.h($$0, this.cm, this.cl) * 0.15F * (float) Math.PI;
   }

   @Override
   public int ad() {
      return this.y() ? 20 : super.ad();
   }

   @Override
   public boolean a(bsy $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dY().C) {
            this.z(false);
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public boolean e(buq $$0) {
      return true;
   }

   @Override
   protected void f(bsy $$0, float $$1) {
      if (!this.g($$0)) {
         super.f($$0, $$1);
      } else {
         cwf $$2 = this.ak();
         int $$3 = $$2.o();
         int $$4 = $$2.p();
         $$2.a(azn.f($$1), this, buq.g);
         if (buf.b.a($$3, $$4) != buf.b.a(this.ak())) {
            this.a(awo.CN);
            if (this.dY() instanceof arq $$5) {
               $$5.a(new lo(ls.S, cwj.or.o()), this.dD(), this.dF() + 1.0, this.dJ(), 20, 0.2, 0.1, 0.2, 0.1);
            }
         }
      }
   }

   private boolean g(bsy $$0) {
      return this.ak().a(cwj.os) && !$$0.a(axf.C);
   }

   @Override
   protected void t() {
      if (this.q()) {
         this.g(bwm.s).a(40.0);
         this.x(40.0F);
      } else {
         this.g(bwm.s).a(8.0);
      }
   }

   @Override
   protected void b(bsy $$0, float $$1) {
      this.a($$0, $$1, new buq[]{buq.g});
   }

   @Override
   public bsh b(cor $$0, bsg $$1) {
      cwf $$2 = $$0.b($$1);
      cwb $$3 = $$2.h();
      if (this.q()) {
         if (this.l($$2) && this.eH() < this.eW()) {
            $$2.a(1, $$0);
            crp $$4 = $$2.a(ku.w);
            float $$5 = $$4 != null ? (float)$$4.a() : 1.0F;
            this.c(2.0F * $$5);
            return bsh.a;
         } else {
            if ($$3 instanceof cvd $$6 && this.j($$0)) {
               cvc $$7 = $$6.b();
               if ($$7 != this.gL()) {
                  this.a($$7);
                  $$2.a(1, $$0);
                  return bsh.a;
               }

               return super.b($$0, $$1);
            }

            if (this.a($$2, buq.g) && !this.al() && this.j($$0) && !this.p_()) {
               this.j($$2.c(1));
               $$2.a(1, $$0);
               return bsh.a;
            } else if ($$2.a(cwj.sm) && this.j($$0) && this.al() && (!dby.a(this.ak(), dbx.E) || $$0.f())) {
               $$2.a(1, $$0, d($$1));
               this.a(awo.az);
               cwf $$8 = this.ak();
               this.j(cwf.k);
               this.b($$8);
               return bsh.a;
            } else if (this.y() && this.al() && this.j($$0) && this.ak().n() && this.ak().b($$2)) {
               $$2.h(1);
               this.a(awo.CP);
               cwf $$9 = this.ak();
               int $$10 = (int)((float)$$9.p() * 0.125F);
               $$9.b(Math.max(0, $$9.o() - $$10));
               return bsh.a;
            } else {
               bsh $$11 = super.b($$0, $$1);
               if (!$$11.a() && this.j($$0)) {
                  this.z(!this.gv());
                  this.bn = false;
                  this.bR.o();
                  this.h(null);
                  return bsh.a.b();
               } else {
                  return $$11;
               }
            }
         }
      } else if (!this.dY().C && $$2.a(cwj.rQ) && !this.ae_()) {
         $$2.a(1, $$0);
         this.g($$0);
         return bsh.b;
      } else {
         return super.b($$0, $$1);
      }
   }

   private void g(cor $$0) {
      if (this.af.a(3) == 0) {
         this.a($$0);
         this.bR.o();
         this.h(null);
         this.z(true);
         this.dY().a(this, (byte)7);
      } else {
         this.dY().a(this, (byte)6);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 8) {
         this.co = true;
         this.cp = 0.0F;
         this.cq = 0.0F;
      } else if ($$0 == 56) {
         this.gN();
      } else {
         super.b($$0);
      }
   }

   public float gK() {
      if (this.ae_()) {
         return 1.5393804F;
      } else if (this.q()) {
         float $$0 = this.eW();
         float $$1 = ($$0 - this.eH()) / $$0;
         return (0.55F - $$1 * 0.4F) * (float) Math.PI;
      } else {
         return (float) (Math.PI / 5);
      }
   }

   @Override
   public boolean l(cwf $$0) {
      return $$0.a(axm.ah);
   }

   @Override
   public int aj() {
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

   public cvc gL() {
      return cvc.a(this.am.a(cf));
   }

   private void a(cvc $$0) {
      this.am.a(cf, $$0.a());
   }

   @Nullable
   public chy b(arq $$0, btz $$1) {
      chy $$2 = bup.bs.a($$0, buo.e);
      if ($$2 != null && $$1 instanceof chy $$3) {
         if (this.af.h()) {
            $$2.j(this.gI());
         } else {
            $$2.j($$3.gI());
         }

         if (this.q()) {
            $$2.b(this.ab_());
            $$2.b(true, true);
            if (this.af.h()) {
               $$2.a(this.gL());
            } else {
               $$2.a($$3.gL());
            }
         }
      }

      return $$2;
   }

   public void A(boolean $$0) {
      this.am.a(ce, $$0);
   }

   @Override
   public boolean a(cgv $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.q()) {
         return false;
      } else if (!($$0 instanceof chy $$1)) {
         return false;
      } else if (!$$1.q()) {
         return false;
      } else {
         return $$1.y() ? false : this.gF() && $$1.gF();
      }
   }

   public boolean gM() {
      return this.am.a(ce);
   }

   @Override
   public boolean a(bve $$0, bve $$1) {
      if ($$0 instanceof clh || $$0 instanceof clp || $$0 instanceof cko) {
         return false;
      } else if ($$0 instanceof chy $$2) {
         return !$$2.q() || $$2.T_() != $$1;
      } else {
         if ($$0 instanceof cor $$3 && $$1 instanceof cor $$4 && !$$4.a($$3)) {
            return false;
         }

         if ($$0 instanceof ciz $$5 && $$5.gM()) {
            return false;
         }

         if ($$0 instanceof bwb $$6 && $$6.q()) {
            return false;
         }

         return true;
      }
   }

   @Override
   public boolean A() {
      return !this.ae_();
   }

   @Override
   public ezr cV() {
      return new ezr(0.0, (double)(0.6F * this.cU()), (double)(this.dt() * 0.4F));
   }

   public static boolean c(bup<chy> $$0, dfg $$1, buo $$2, jh $$3, azv $$4) {
      return $$1.a_($$3.e()).a(axd.cg) && a($$1, $$3);
   }

   class a<T extends bve> extends cbj<T> {
      private final chy j;

      public a(final chy $$0, final Class<T> $$1, final float $$2, final double $$3, final double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.b instanceof cjc ? !this.j.q() && this.a((cjc)this.b) : false;
      }

      private boolean a(cjc $$0) {
         return $$0.gz() >= chy.this.af.a(5);
      }

      @Override
      public void d() {
         chy.this.h(null);
         super.d();
      }

      @Override
      public void a() {
         chy.this.h(null);
         super.a();
      }
   }

   public static class b extends btz.a {
      public final jq<chz> a;

      public b(jq<chz> $$0) {
         super(false);
         this.a = $$0;
      }
   }
}
