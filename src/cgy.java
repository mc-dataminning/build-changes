import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cgy extends bwb implements bwe<jq<cgz>> {
   public static final double cc = 0.6;
   public static final double cd = 0.8;
   public static final double ce = 1.33;
   private static final ako<jq<cgz>> cf = aks.a(cgy.class, akq.x);
   private static final ako<Boolean> cg = aks.a(cgy.class, akq.k);
   private static final ako<Boolean> ch = aks.a(cgy.class, akq.k);
   private static final ako<Integer> ci = aks.a(cgy.class, akq.b);
   private static final alk<cgz> cj = cgz.c;
   @Nullable
   private cgy.a<cor> ck;
   @Nullable
   private cdk cl;
   private float cm;
   private float cn;
   private float co;
   private float cp;
   private boolean cq;
   private float cr;
   private float cs;

   public cgy(bup<? extends cgy> $$0, dff $$1) {
      super($$0, $$1);
      this.gN();
   }

   @Override
   protected void D() {
      this.cl = new cgy.c(this, 0.6, $$0 -> $$0.a(axm.ai), true);
      this.bS.a(1, new cbw(this));
      this.bS.a(1, new bwb.a(1.5));
      this.bS.a(2, new cdh(this));
      this.bS.a(3, new cgy.b(this));
      this.bS.a(4, this.cl);
      this.bS.a(5, new cbp(this, 1.1, 8));
      this.bS.a(6, new cca(this, 1.0, 10.0F, 5.0F));
      this.bS.a(7, new cbq(this, 0.8));
      this.bS.a(8, new cci(this, 0.3F));
      this.bS.a(9, new ccs(this));
      this.bS.a(10, new cbo(this, 0.8));
      this.bS.a(11, new cdp(this, 0.8, 1.0000001E-5F));
      this.bS.a(12, new cck(this, cor.class, 10.0F));
      this.bT.a(1, new cdy<>(this, chp.class, false, null));
      this.bT.a(1, new cdy<>(this, chw.class, false, chw.bY));
   }

   public jq<cgz> gH() {
      return this.am.a(cf);
   }

   public void j(jq<cgz> $$0) {
      this.am.a(cf, $$0);
   }

   public void A(boolean $$0) {
      this.am.a(cg, $$0);
   }

   public boolean gI() {
      return this.am.a(cg);
   }

   void B(boolean $$0) {
      this.am.a(ch, $$0);
   }

   boolean gO() {
      return this.am.a(ch);
   }

   public cvc gJ() {
      return cvc.a(this.am.a(ci));
   }

   private void a(cvc $$0) {
      this.am.a(ci, $$0.a());
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(cf, lz.ai.b(cj));
      $$0.a(cg, false);
      $$0.a(ch, false);
      $$0.a(ci, cvc.o.a());
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      $$0.a("variant", this.gH().e().orElse(cj).a().toString());
      $$0.a("CollarColor", (byte)this.gJ().a());
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      Optional.ofNullable(all.c($$0.l("variant"))).map($$0x -> alk.a(ma.l, $$0x)).flatMap(lz.ai::a).ifPresent(this::j);
      if ($$0.b("CollarColor", 99)) {
         this.a(cvc.a($$0.h("CollarColor")));
      }
   }

   @Override
   public void ac() {
      if (this.M().b()) {
         double $$0 = this.M().c();
         if ($$0 == 0.6) {
            this.b(bvq.f);
            this.h(false);
         } else if ($$0 == 1.33) {
            this.b(bvq.a);
            this.h(true);
         } else {
            this.b(bvq.a);
            this.h(false);
         }
      } else {
         this.b(bvq.a);
         this.h(false);
      }
   }

   @Nullable
   @Override
   protected awn w() {
      if (this.q()) {
         if (this.gF()) {
            return awo.dY;
         } else {
            return this.af.a(4) == 0 ? awo.dZ : awo.dR;
         }
      } else {
         return awo.dS;
      }
   }

   @Override
   public int T() {
      return 120;
   }

   public void gK() {
      this.b(awo.dV);
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.dX;
   }

   @Override
   protected awn o_() {
      return awo.dT;
   }

   public static bwl.a gL() {
      return cgv.gA().a(bwm.s, 10.0).a(bwm.v, 0.3F).a(bwm.c, 3.0);
   }

   @Override
   protected void gB() {
      this.a(awo.dU, 1.0F, 1.0F);
   }

   @Override
   public void l() {
      super.l();
      if (this.cl != null && this.cl.i() && !this.q() && this.ag % 100 == 0) {
         this.a(awo.dW, 1.0F, 1.0F);
      }

      this.gP();
   }

   private void gP() {
      if ((this.gI() || this.gO()) && this.ag % 5 == 0) {
         this.a(awo.dY, 0.6F + 0.4F * (this.af.i() - this.af.i()), 1.0F);
      }

      this.gQ();
      this.gR();
      this.cq = false;
      if (this.gI()) {
         jh $$0 = this.dy();

         for (cor $$2 : this.dY().a(cor.class, new ezm($$0).c(2.0, 2.0, 2.0))) {
            if ($$2.fU()) {
               this.cq = true;
               break;
            }
         }
      }
   }

   public boolean gM() {
      return this.cq;
   }

   private void gQ() {
      this.cn = this.cm;
      this.cp = this.co;
      if (this.gI()) {
         this.cm = Math.min(1.0F, this.cm + 0.15F);
         this.co = Math.min(1.0F, this.co + 0.08F);
      } else {
         this.cm = Math.max(0.0F, this.cm - 0.22F);
         this.co = Math.max(0.0F, this.co - 0.13F);
      }
   }

   private void gR() {
      this.cs = this.cr;
      if (this.gO()) {
         this.cr = Math.min(1.0F, this.cr + 0.1F);
      } else {
         this.cr = Math.max(0.0F, this.cr - 0.13F);
      }
   }

   public float J(float $$0) {
      return azn.h($$0, this.cn, this.cm);
   }

   public float K(float $$0) {
      return azn.h($$0, this.cp, this.co);
   }

   public float L(float $$0) {
      return azn.h($$0, this.cs, this.cr);
   }

   @Nullable
   public cgy b(arq $$0, btz $$1) {
      cgy $$2 = bup.p.a($$0, buo.e);
      if ($$2 != null && $$1 instanceof cgy $$3) {
         if (this.af.h()) {
            $$2.j(this.gH());
         } else {
            $$2.j($$3.gH());
         }

         if (this.q()) {
            $$2.b(this.ab_());
            $$2.b(true, true);
            if (this.af.h()) {
               $$2.a(this.gJ());
            } else {
               $$2.a($$3.gJ());
            }
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cgv $$0) {
      if (!this.q()) {
         return false;
      } else {
         return !($$0 instanceof cgy $$1) ? false : $$1.q() && super.a($$0);
      }
   }

   @Nullable
   @Override
   public bvx a(dfw $$0, bsf $$1, buo $$2, @Nullable bvx $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      boolean $$4 = $$0.ap() > 0.9F;
      axt<cgz> $$5 = $$4 ? axe.b : axe.a;
      lz.ai.a($$5, $$0.E_()).ifPresent(this::j);
      arq $$6 = $$0.E();
      if ($$6.a().a(this.dy(), axp.o).b()) {
         this.j(lz.ai.b(cgz.l));
         this.gb();
      }

      return $$3;
   }

   @Override
   public bsh b(cor $$0, bsg $$1) {
      cwf $$2 = $$0.b($$1);
      cwb $$3 = $$2.h();
      if (this.q()) {
         if (this.j($$0)) {
            if ($$3 instanceof cvd $$4) {
               cvc $$5 = $$4.b();
               if ($$5 != this.gJ()) {
                  if (!this.dY().y_()) {
                     this.a($$5);
                     $$2.a(1, $$0);
                     this.gb();
                  }

                  return bsh.a;
               }
            } else if (this.l($$2) && this.eH() < this.eW()) {
               if (!this.dY().y_()) {
                  this.a($$0, $$1, $$2);
                  crp $$6 = $$2.a(ku.w);
                  this.c($$6 != null ? (float)$$6.a() : 1.0F);
                  this.gB();
               }

               return bsh.a;
            }

            bsh $$7 = super.b($$0, $$1);
            if (!$$7.a()) {
               this.z(!this.gv());
               return bsh.a;
            }

            return $$7;
         }
      } else if (this.l($$2)) {
         if (!this.dY().y_()) {
            this.a($$0, $$1, $$2);
            this.g($$0);
            this.gb();
            this.gB();
         }

         return bsh.a;
      }

      bsh $$8 = super.b($$0, $$1);
      if ($$8.a()) {
         this.gb();
      }

      return $$8;
   }

   @Override
   public boolean l(cwf $$0) {
      return $$0.a(axm.ai);
   }

   @Override
   public boolean h(double $$0) {
      return !this.q() && this.ag > 2400;
   }

   @Override
   public void b(boolean $$0, boolean $$1) {
      super.b($$0, $$1);
      this.gN();
   }

   protected void gN() {
      if (this.ck == null) {
         this.ck = new cgy.a<>(this, cor.class, 16.0F, 0.8, 1.33);
      }

      this.bS.a(this.ck);
      if (!this.q()) {
         this.bS.a(4, this.ck);
      }
   }

   private void g(cor $$0) {
      if (this.af.a(3) == 0) {
         this.a($$0);
         this.z(true);
         this.dY().a(this, (byte)7);
      } else {
         this.dY().a(this, (byte)6);
      }
   }

   @Override
   public boolean cg() {
      return this.ck() || super.cg();
   }

   static class a<T extends bve> extends cbj<T> {
      private final cgy i;

      public a(cgy $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bun.e::test);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return !this.i.q() && super.b();
      }

      @Override
      public boolean c() {
         return !this.i.q() && super.c();
      }
   }

   static class b extends ccc {
      private final cgy a;
      @Nullable
      private cor b;
      @Nullable
      private jh c;
      private int d;

      public b(cgy $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (!this.a.q()) {
            return false;
         } else if (this.a.gv()) {
            return false;
         } else {
            bve $$0 = this.a.T_();
            if ($$0 instanceof cor) {
               this.b = (cor)$$0;
               if (!$$0.fU()) {
                  return false;
               }

               if (this.a.g(this.b) > 100.0) {
                  return false;
               }

               jh $$1 = this.b.dy();
               dvo $$2 = this.a.dY().a_($$1);
               if ($$2.a(axd.S)) {
                  this.c = $$2.d(dic.aF).map($$1x -> $$1.a($$1x.g())).orElseGet(() -> new jh($$1));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (cgy $$1 : this.a.dY().a(cgy.class, new ezm(this.c).g(2.0))) {
            if ($$1 != this.a && ($$1.gI() || $$1.gO())) {
               return true;
            }
         }

         return false;
      }

      @Override
      public boolean c() {
         return this.a.q() && !this.a.gv() && this.b != null && this.b.fU() && this.c != null && !this.h();
      }

      @Override
      public void d() {
         if (this.c != null) {
            this.a.y(false);
            this.a.P().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
         }
      }

      @Override
      public void e() {
         this.a.A(false);
         float $$0 = this.a.dY().f(1.0F);
         if (this.b.gq() >= 100 && (double)$$0 > 0.77 && (double)$$0 < 0.8 && (double)this.a.dY().E_().i() < 0.7) {
            this.i();
         }

         this.d = 0;
         this.a.B(false);
         this.a.P().o();
      }

      private void i() {
         azv $$0 = this.a.eb();
         jh.a $$1 = new jh.a();
         $$1.g(this.a.M_() ? this.a.C().dy() : this.a.dy());
         this.a.b((double)($$1.u() + $$0.a(11) - 5), (double)($$1.v() + $$0.a(5) - 2), (double)($$1.w() + $$0.a(11) - 5), false);
         $$1.g(this.a.dy());
         this.a
            .a(
               euc.aq,
               $$1x -> this.a
                     .dY()
                     .b(
                        new ckz(
                           this.a.dY(),
                           (double)$$1.u() - (double)azn.a(this.a.aX * (float) (Math.PI / 180.0)),
                           (double)$$1.v(),
                           (double)$$1.w() + (double)azn.b(this.a.aX * (float) (Math.PI / 180.0)),
                           $$1x
                        )
                     )
            );
      }

      @Override
      public void a() {
         if (this.b != null && this.c != null) {
            this.a.y(false);
            this.a.P().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
            if (this.a.g(this.b) < 2.5) {
               this.d++;
               if (this.d > this.a(16)) {
                  this.a.A(true);
                  this.a.B(false);
               } else {
                  this.a.a(this.b, 45.0F, 45.0F);
                  this.a.B(true);
               }
            } else {
               this.a.A(false);
            }
         }
      }
   }

   static class c extends cdk {
      @Nullable
      private cor c;
      private final cgy d;

      public c(cgy $$0, double $$1, Predicate<cwf> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.d = $$0;
      }

      @Override
      public void a() {
         super.a();
         if (this.c == null && this.a.eb().a(this.a(600)) == 0) {
            this.c = this.b;
         } else if (this.a.eb().a(this.a(500)) == 0) {
            this.c = null;
         }
      }

      @Override
      protected boolean h() {
         return this.c != null && this.c.equals(this.b) ? false : super.h();
      }

      @Override
      public boolean b() {
         return super.b() && !this.d.q();
      }
   }
}
