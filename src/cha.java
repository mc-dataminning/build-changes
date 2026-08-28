import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cha extends bwd implements bwg<jr<chb>> {
   public static final double cc = 0.6;
   public static final double cd = 0.8;
   public static final double ce = 1.33;
   private static final ajy<jr<chb>> cf = akc.a(cha.class, aka.x);
   private static final ajy<Boolean> cg = akc.a(cha.class, aka.k);
   private static final ajy<Boolean> ch = akc.a(cha.class, aka.k);
   private static final ajy<Integer> ci = akc.a(cha.class, aka.b);
   private static final aku<chb> cj = chb.c;
   @Nullable
   private cha.a<cow> ck;
   @Nullable
   private cdm cl;
   private float cm;
   private float cn;
   private float co;
   private float cp;
   private boolean cq;
   private float cr;
   private float cs;

   public cha(bur<? extends cha> $$0, dgh $$1) {
      super($$0, $$1);
      this.gK();
   }

   @Override
   protected void E() {
      this.cl = new cha.c(this, 0.6, $$0 -> $$0.a(awy.ah), true);
      this.bS.a(1, new cby(this));
      this.bS.a(1, new bwd.a(1.5));
      this.bS.a(2, new cdj(this));
      this.bS.a(3, new cha.b(this));
      this.bS.a(4, this.cl);
      this.bS.a(5, new cbr(this, 1.1, 8));
      this.bS.a(6, new ccc(this, 1.0, 10.0F, 5.0F));
      this.bS.a(7, new cbs(this, 0.8));
      this.bS.a(8, new cck(this, 0.3F));
      this.bS.a(9, new ccu(this));
      this.bS.a(10, new cbq(this, 0.8));
      this.bS.a(11, new cdr(this, 0.8, 1.0000001E-5F));
      this.bS.a(12, new ccm(this, cow.class, 10.0F));
      this.bT.a(1, new cea<>(this, chr.class, false, null));
      this.bT.a(1, new cea<>(this, chy.class, false, chy.bY));
   }

   public jr<chb> gE() {
      return this.al.a(cf);
   }

   public void j(jr<chb> $$0) {
      this.al.a(cf, $$0);
   }

   public void A(boolean $$0) {
      this.al.a(cg, $$0);
   }

   public boolean gF() {
      return this.al.a(cg);
   }

   void B(boolean $$0) {
      this.al.a(ch, $$0);
   }

   boolean gL() {
      return this.al.a(ch);
   }

   public cvl gG() {
      return cvl.a(this.al.a(ci));
   }

   private void a(cvl $$0) {
      this.al.a(ci, $$0.a());
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(cf, mb.ai.b(cj));
      $$0.a(cg, false);
      $$0.a(ch, false);
      $$0.a(ci, cvl.o.a());
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("variant", this.gE().e().orElse(cj).a().toString());
      $$0.a("CollarColor", (byte)this.gG().a());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      Optional.ofNullable(akv.c($$0.l("variant"))).map($$0x -> aku.a(mc.l, $$0x)).flatMap(mb.ai::a).ifPresent(this::j);
      if ($$0.b("CollarColor", 99)) {
         this.a(cvl.a($$0.h("CollarColor")));
      }
   }

   @Override
   public void a(ard $$0) {
      if (this.N().b()) {
         double $$1 = this.N().c();
         if ($$1 == 0.6) {
            this.b(bvs.f);
            this.h(false);
         } else if ($$1 == 1.33) {
            this.b(bvs.a);
            this.h(true);
         } else {
            this.b(bvs.a);
            this.h(false);
         }
      } else {
         this.b(bvs.a);
         this.h(false);
      }
   }

   @Nullable
   @Override
   protected avz u() {
      if (this.p()) {
         if (this.gC()) {
            return awa.dZ;
         } else {
            return this.ae.a(4) == 0 ? awa.ea : awa.dS;
         }
      } else {
         return awa.dT;
      }
   }

   @Override
   public int T() {
      return 120;
   }

   public void gH() {
      this.b(awa.dW);
   }

   @Override
   protected avz e(bta $$0) {
      return awa.dY;
   }

   @Override
   protected avz o_() {
      return awa.dU;
   }

   public static bwn.a gI() {
      return cgx.gx().a(bwo.s, 10.0).a(bwo.v, 0.3F).a(bwo.c, 3.0);
   }

   @Override
   protected void gy() {
      this.a(awa.dV, 1.0F, 1.0F);
   }

   @Override
   public void h() {
      super.h();
      if (this.cl != null && this.cl.i() && !this.p() && this.af % 100 == 0) {
         this.a(awa.dX, 1.0F, 1.0F);
      }

      this.gM();
   }

   private void gM() {
      if ((this.gF() || this.gL()) && this.af % 5 == 0) {
         this.a(awa.dZ, 0.6F + 0.4F * (this.ae.i() - this.ae.i()), 1.0F);
      }

      this.gN();
      this.gO();
      this.cq = false;
      if (this.gF()) {
         ji $$0 = this.dv();

         for (cow $$2 : this.dV().a(cow.class, new fau($$0).c(2.0, 2.0, 2.0))) {
            if ($$2.fR()) {
               this.cq = true;
               break;
            }
         }
      }
   }

   public boolean gJ() {
      return this.cq;
   }

   private void gN() {
      this.cn = this.cm;
      this.cp = this.co;
      if (this.gF()) {
         this.cm = Math.min(1.0F, this.cm + 0.15F);
         this.co = Math.min(1.0F, this.co + 0.08F);
      } else {
         this.cm = Math.max(0.0F, this.cm - 0.22F);
         this.co = Math.max(0.0F, this.co - 0.13F);
      }
   }

   private void gO() {
      this.cs = this.cr;
      if (this.gL()) {
         this.cr = Math.min(1.0F, this.cr + 0.1F);
      } else {
         this.cr = Math.max(0.0F, this.cr - 0.13F);
      }
   }

   public float J(float $$0) {
      return ayz.h($$0, this.cn, this.cm);
   }

   public float K(float $$0) {
      return ayz.h($$0, this.cp, this.co);
   }

   public float L(float $$0) {
      return ayz.h($$0, this.cs, this.cr);
   }

   @Nullable
   public cha b(ard $$0, bub $$1) {
      cha $$2 = bur.u.a($$0, buq.e);
      if ($$2 != null && $$1 instanceof cha $$3) {
         if (this.ae.h()) {
            $$2.j(this.gE());
         } else {
            $$2.j($$3.gE());
         }

         if (this.p()) {
            $$2.b(this.aa_());
            $$2.a(true, true);
            cvl $$4 = this.gG();
            cvl $$5 = $$3.gG();
            $$2.a(cvl.a($$0, $$4, $$5));
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cgx $$0) {
      if (!this.p()) {
         return false;
      } else {
         return !($$0 instanceof cha $$1) ? false : $$1.p() && super.a($$0);
      }
   }

   @Nullable
   @Override
   public bvz a(dgy $$0, bsh $$1, buq $$2, @Nullable bvz $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      boolean $$4 = $$0.ar() > 0.9F;
      axf<chb> $$5 = $$4 ? awq.b : awq.a;
      mb.ai.a($$5, $$0.H_()).ifPresent(this::j);
      ard $$6 = $$0.a();
      if ($$6.b().a(this.dv(), axb.o).b()) {
         this.j(mb.ai.b(chb.l));
         this.fY();
      }

      return $$3;
   }

   @Override
   public bsj b(cow $$0, bsi $$1) {
      cwo $$2 = $$0.b($$1);
      cwk $$3 = $$2.h();
      if (this.p()) {
         if (this.j($$0)) {
            if ($$3 instanceof cvm $$4) {
               cvl $$5 = $$4.b();
               if ($$5 != this.gG()) {
                  if (!this.dV().B_()) {
                     this.a($$5);
                     $$2.a(1, $$0);
                     this.fY();
                  }

                  return bsj.a;
               }
            } else if (this.j($$2) && this.eD() < this.eS()) {
               if (!this.dV().B_()) {
                  this.a($$0, $$1, $$2);
                  cry $$6 = $$2.a(kv.w);
                  this.c($$6 != null ? (float)$$6.a() : 1.0F);
                  this.gy();
               }

               return bsj.a;
            }

            bsj $$7 = super.b($$0, $$1);
            if (!$$7.a()) {
               this.z(!this.gs());
               return bsj.a;
            }

            return $$7;
         }
      } else if (this.j($$2)) {
         if (!this.dV().B_()) {
            this.a($$0, $$1, $$2);
            this.g($$0);
            this.fY();
            this.gy();
         }

         return bsj.a;
      }

      bsj $$8 = super.b($$0, $$1);
      if ($$8.a()) {
         this.fY();
      }

      return $$8;
   }

   @Override
   public boolean j(cwo $$0) {
      return $$0.a(awy.ah);
   }

   @Override
   public boolean h(double $$0) {
      return !this.p() && this.af > 2400;
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      super.a($$0, $$1);
      this.gK();
   }

   protected void gK() {
      if (this.ck == null) {
         this.ck = new cha.a<>(this, cow.class, 16.0F, 0.8, 1.33);
      }

      this.bS.a(this.ck);
      if (!this.p()) {
         this.bS.a(4, this.ck);
      }
   }

   private void g(cow $$0) {
      if (this.ae.a(3) == 0) {
         this.a($$0);
         this.z(true);
         this.dV().a(this, (byte)7);
      } else {
         this.dV().a(this, (byte)6);
      }
   }

   @Override
   public boolean ce() {
      return this.ci() || super.ce();
   }

   static class a<T extends bvg> extends cbl<T> {
      private final cha i;

      public a(cha $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bup.e::test);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return !this.i.p() && super.b();
      }

      @Override
      public boolean c() {
         return !this.i.p() && super.c();
      }
   }

   static class b extends cce {
      private final cha a;
      @Nullable
      private cow b;
      @Nullable
      private ji c;
      private int d;

      public b(cha $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (!this.a.p()) {
            return false;
         } else if (this.a.gs()) {
            return false;
         } else {
            bvg $$0 = this.a.ag_();
            if ($$0 instanceof cow) {
               this.b = (cow)$$0;
               if (!$$0.fR()) {
                  return false;
               }

               if (this.a.g(this.b) > 100.0) {
                  return false;
               }

               ji $$1 = this.b.dv();
               dww $$2 = this.a.dV().a_($$1);
               if ($$2.a(awp.T)) {
                  this.c = $$2.d(dje.aF).map($$1x -> $$1.a($$1x.g())).orElseGet(() -> new ji($$1));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (cha $$1 : this.a.dV().a(cha.class, new fau(this.c).g(2.0))) {
            if ($$1 != this.a && ($$1.gF() || $$1.gL())) {
               return true;
            }
         }

         return false;
      }

      @Override
      public boolean c() {
         return this.a.p() && !this.a.gs() && this.b != null && this.b.fR() && this.c != null && !this.h();
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
         float $$0 = this.a.dV().f(1.0F);
         if (this.b.gn() >= 100 && (double)$$0 > 0.77 && (double)$$0 < 0.8 && (double)this.a.dV().H_().i() < 0.7) {
            this.i();
         }

         this.d = 0;
         this.a.B(false);
         this.a.P().m();
      }

      private void i() {
         azh $$0 = this.a.dY();
         ji.a $$1 = new ji.a();
         $$1.g(this.a.P_() ? this.a.D().dv() : this.a.dv());
         this.a.b((double)($$1.u() + $$0.a(11) - 5), (double)($$1.v() + $$0.a(5) - 2), (double)($$1.w() + $$0.a(11) - 5), false);
         $$1.g(this.a.dv());
         this.a
            .a(
               a(this.a),
               evm.aq,
               ($$1x, $$2) -> $$1x.b(
                     new clb(
                        $$1x,
                        (double)$$1.u() - (double)ayz.a(this.a.aX * (float) (Math.PI / 180.0)),
                        (double)$$1.v(),
                        (double)$$1.w() + (double)ayz.b(this.a.aX * (float) (Math.PI / 180.0)),
                        $$2
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

   static class c extends cdm {
      @Nullable
      private cow c;
      private final cha d;

      public c(cha $$0, double $$1, Predicate<cwo> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.d = $$0;
      }

      @Override
      public void a() {
         super.a();
         if (this.c == null && this.a.dY().a(this.a(600)) == 0) {
            this.c = this.b;
         } else if (this.a.dY().a(this.a(500)) == 0) {
            this.c = null;
         }
      }

      @Override
      protected boolean h() {
         return this.c != null && this.c.equals(this.b) ? false : super.h();
      }

      @Override
      public boolean b() {
         return super.b() && !this.d.p();
      }
   }
}
