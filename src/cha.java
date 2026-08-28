import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cha extends bwd implements bwg<jr<chb>> {
   public static final double cc = 0.6;
   public static final double cd = 0.8;
   public static final double ce = 1.33;
   private static final ajx<jr<chb>> cf = akb.a(cha.class, ajz.x);
   private static final ajx<Boolean> cg = akb.a(cha.class, ajz.k);
   private static final ajx<Boolean> ch = akb.a(cha.class, ajz.k);
   private static final ajx<Integer> ci = akb.a(cha.class, ajz.b);
   private static final akt<chb> cj = chb.c;
   @Nullable
   private cha.a<cox> ck;
   @Nullable
   private cdm cl;
   private float cm;
   private float cn;
   private float co;
   private float cp;
   private boolean cq;
   private float cr;
   private float cs;

   public cha(bur<? extends cha> $$0, dgi $$1) {
      super($$0, $$1);
      this.gH();
   }

   @Override
   protected void B() {
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
      this.bS.a(12, new ccm(this, cox.class, 10.0F));
      this.bT.a(1, new cea<>(this, chr.class, false, null));
      this.bT.a(1, new cea<>(this, chy.class, false, chy.bY));
   }

   public jr<chb> gB() {
      return this.al.a(cf);
   }

   public void j(jr<chb> $$0) {
      this.al.a(cf, $$0);
   }

   public void A(boolean $$0) {
      this.al.a(cg, $$0);
   }

   public boolean gC() {
      return this.al.a(cg);
   }

   void B(boolean $$0) {
      this.al.a(ch, $$0);
   }

   boolean gI() {
      return this.al.a(ch);
   }

   public cvm gD() {
      return cvm.a(this.al.a(ci));
   }

   private void a(cvm $$0) {
      this.al.a(ci, $$0.a());
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(cf, mb.ai.b(cj));
      $$0.a(cg, false);
      $$0.a(ch, false);
      $$0.a(ci, cvm.o.a());
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("variant", this.gB().e().orElse(cj).a().toString());
      $$0.a("CollarColor", (byte)this.gD().a());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      Optional.ofNullable(aku.c($$0.l("variant"))).map($$0x -> akt.a(mc.l, $$0x)).flatMap(mb.ai::a).ifPresent(this::j);
      if ($$0.b("CollarColor", 99)) {
         this.a(cvm.a($$0.h("CollarColor")));
      }
   }

   @Override
   public void a(arc $$0) {
      if (this.I().b()) {
         double $$1 = this.I().c();
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
         if (this.gz()) {
            return awa.dZ;
         } else {
            return this.ae.a(4) == 0 ? awa.ea : awa.dS;
         }
      } else {
         return awa.dT;
      }
   }

   @Override
   public int Q() {
      return 120;
   }

   public void gE() {
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

   public static bwn.a gF() {
      return cgx.gu().a(bwo.s, 10.0).a(bwo.v, 0.3F).a(bwo.c, 3.0);
   }

   @Override
   protected void gv() {
      this.a(awa.dV, 1.0F, 1.0F);
   }

   @Override
   public void h() {
      super.h();
      if (this.cl != null && this.cl.i() && !this.p() && this.af % 100 == 0) {
         this.a(awa.dX, 1.0F, 1.0F);
      }

      this.gJ();
   }

   private void gJ() {
      if ((this.gC() || this.gI()) && this.af % 5 == 0) {
         this.a(awa.dZ, 0.6F + 0.4F * (this.ae.i() - this.ae.i()), 1.0F);
      }

      this.gK();
      this.gL();
      this.cq = false;
      if (this.gC()) {
         ji $$0 = this.dw();

         for (cox $$2 : this.dW().a(cox.class, new fav($$0).c(2.0, 2.0, 2.0))) {
            if ($$2.fR()) {
               this.cq = true;
               break;
            }
         }
      }
   }

   public boolean gG() {
      return this.cq;
   }

   private void gK() {
      this.cn = this.cm;
      this.cp = this.co;
      if (this.gC()) {
         this.cm = Math.min(1.0F, this.cm + 0.15F);
         this.co = Math.min(1.0F, this.co + 0.08F);
      } else {
         this.cm = Math.max(0.0F, this.cm - 0.22F);
         this.co = Math.max(0.0F, this.co - 0.13F);
      }
   }

   private void gL() {
      this.cs = this.cr;
      if (this.gI()) {
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
   public cha b(arc $$0, bub $$1) {
      cha $$2 = bur.u.a($$0, buq.e);
      if ($$2 != null && $$1 instanceof cha $$3) {
         if (this.ae.h()) {
            $$2.j(this.gB());
         } else {
            $$2.j($$3.gB());
         }

         if (this.p()) {
            $$2.b(this.aa_());
            $$2.b(true, true);
            cvm $$4 = this.gD();
            cvm $$5 = $$3.gD();
            $$2.a(cvm.a($$0, $$4, $$5));
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
   public bvz a(dgz $$0, bsh $$1, buq $$2, @Nullable bvz $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      boolean $$4 = $$0.ar() > 0.9F;
      axf<chb> $$5 = $$4 ? awq.b : awq.a;
      mb.ai.a($$5, $$0.H_()).ifPresent(this::j);
      arc $$6 = $$0.a();
      if ($$6.b().a(this.dw(), axb.o).b()) {
         this.j(mb.ai.b(chb.l));
         this.aj();
      }

      return $$3;
   }

   @Override
   public bsj b(cox $$0, bsi $$1) {
      cwp $$2 = $$0.b($$1);
      cwl $$3 = $$2.h();
      if (this.p()) {
         if (this.j($$0)) {
            if ($$3 instanceof cvn $$4) {
               cvm $$5 = $$4.b();
               if ($$5 != this.gD()) {
                  if (!this.dW().B_()) {
                     this.a($$5);
                     $$2.a(1, $$0);
                     this.aj();
                  }

                  return bsj.a;
               }
            } else if (this.j($$2) && this.eE() < this.eS()) {
               if (!this.dW().B_()) {
                  this.a($$0, $$1, $$2);
                  crz $$6 = $$2.a(kv.w);
                  this.c($$6 != null ? (float)$$6.a() : 1.0F);
                  this.gv();
               }

               return bsj.a;
            }

            bsj $$7 = super.b($$0, $$1);
            if (!$$7.a()) {
               this.z(!this.gp());
               return bsj.a;
            }

            return $$7;
         }
      } else if (this.j($$2)) {
         if (!this.dW().B_()) {
            this.a($$0, $$1, $$2);
            this.g($$0);
            this.aj();
            this.gv();
         }

         return bsj.a;
      }

      bsj $$8 = super.b($$0, $$1);
      if ($$8.a()) {
         this.aj();
      }

      return $$8;
   }

   @Override
   public boolean j(cwp $$0) {
      return $$0.a(awy.ah);
   }

   @Override
   public boolean h(double $$0) {
      return !this.p() && this.af > 2400;
   }

   @Override
   public void b(boolean $$0, boolean $$1) {
      super.b($$0, $$1);
      this.gH();
   }

   protected void gH() {
      if (this.ck == null) {
         this.ck = new cha.a<>(this, cox.class, 16.0F, 0.8, 1.33);
      }

      this.bS.a(this.ck);
      if (!this.p()) {
         this.bS.a(4, this.ck);
      }
   }

   private void g(cox $$0) {
      if (this.ae.a(3) == 0) {
         this.a($$0);
         this.z(true);
         this.dW().a(this, (byte)7);
      } else {
         this.dW().a(this, (byte)6);
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
      private cox b;
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
         } else if (this.a.gp()) {
            return false;
         } else {
            bvg $$0 = this.a.ag_();
            if ($$0 instanceof cox) {
               this.b = (cox)$$0;
               if (!$$0.fR()) {
                  return false;
               }

               if (this.a.g(this.b) > 100.0) {
                  return false;
               }

               ji $$1 = this.b.dw();
               dwx $$2 = this.a.dW().a_($$1);
               if ($$2.a(awp.T)) {
                  this.c = $$2.d(djf.aF).map($$1x -> $$1.a($$1x.g())).orElseGet(() -> new ji($$1));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (cha $$1 : this.a.dW().a(cha.class, new fav(this.c).g(2.0))) {
            if ($$1 != this.a && ($$1.gC() || $$1.gI())) {
               return true;
            }
         }

         return false;
      }

      @Override
      public boolean c() {
         return this.a.p() && !this.a.gp() && this.b != null && this.b.fR() && this.c != null && !this.h();
      }

      @Override
      public void d() {
         if (this.c != null) {
            this.a.y(false);
            this.a.L().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
         }
      }

      @Override
      public void e() {
         this.a.A(false);
         float $$0 = this.a.dW().f(1.0F);
         if (this.b.gn() >= 100 && (double)$$0 > 0.77 && (double)$$0 < 0.8 && (double)this.a.dW().H_().i() < 0.7) {
            this.i();
         }

         this.d = 0;
         this.a.B(false);
         this.a.L().m();
      }

      private void i() {
         azh $$0 = this.a.dZ();
         ji.a $$1 = new ji.a();
         $$1.g(this.a.P_() ? this.a.A().dw() : this.a.dw());
         this.a.b((double)($$1.u() + $$0.a(11) - 5), (double)($$1.v() + $$0.a(5) - 2), (double)($$1.w() + $$0.a(11) - 5), false);
         $$1.g(this.a.dw());
         this.a
            .a(
               a(this.a),
               evn.aq,
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
            this.a.L().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
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
      private cox c;
      private final cha d;

      public c(cha $$0, double $$1, Predicate<cwp> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.d = $$0;
      }

      @Override
      public void a() {
         super.a();
         if (this.c == null && this.a.dZ().a(this.a(600)) == 0) {
            this.c = this.b;
         } else if (this.a.dZ().a(this.a(500)) == 0) {
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
