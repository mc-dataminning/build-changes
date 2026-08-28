import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cje extends cja implements bwg<cje.d>, cmb {
   private static final int bY = 5;
   private static final ajx<Integer> bZ = akb.a(cje.class, ajz.b);
   private static final ajx<Integer> ca = akb.a(cje.class, ajz.b);
   private static final bun cc = bur.ay.n().a(bum.a().a(bul.a, 0.0F, bur.ay.m() - 0.8125F, -0.3F)).a(0.5F);
   boolean cd;
   @Nullable
   private cje ce;
   @Nullable
   private cje cf;

   public cje(bur<? extends cje> $$0, dgi $$1) {
      super($$0, $$1);
      this.L().a(40.0F);
   }

   public boolean gs() {
      return false;
   }

   private void w(int $$0) {
      this.al.a(bZ, Math.max(1, Math.min(5, $$0)));
   }

   private void b(azh $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.w(1 + $$0.a($$1));
   }

   public int gt() {
      return this.al.a(bZ);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("Variant", this.gC().g);
      $$0.a("Strength", this.gt());
   }

   @Override
   public void a(tq $$0) {
      this.w($$0.h("Strength"));
      super.a($$0);
      this.a(cje.d.a($$0.h("Variant")));
   }

   @Override
   protected void B() {
      this.bS.a(0, new cby(this));
      this.bS.a(1, new cdi(this, 1.2));
      this.bS.a(2, new ccl(this, 2.1F));
      this.bS.a(3, new cdd(this, 1.25, 40, 20.0F));
      this.bS.a(3, new ccx(this, 1.2));
      this.bS.a(4, new cbq(this, 1.0));
      this.bS.a(5, new cdm(this, 1.25, $$0 -> $$0.a(awy.ar), false));
      this.bS.a(6, new ccd(this, 1.0));
      this.bS.a(7, new cdr(this, 0.7));
      this.bS.a(8, new ccm(this, cox.class, 6.0F));
      this.bS.a(9, new ccz(this));
      this.bT.a(1, new cje.c(this));
      this.bT.a(2, new cje.a(this));
   }

   public static bwn.a gB() {
      return p();
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bZ, 0);
      $$0.a(ca, 0);
   }

   public cje.d gC() {
      return cje.d.a(this.al.a(ca));
   }

   public void a(cje.d $$0) {
      this.al.a(ca, $$0.g);
   }

   @Override
   public boolean j(cwp $$0) {
      return $$0.a(awy.aq);
   }

   @Override
   protected boolean a(cox $$0, cwp $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(cwt.qb)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(djo.iH.j())) {
         $$2 = 90;
         $$3 = 6;
         $$4 = 10.0F;
         if (this.gG() && this.Y_() == 0 && this.gw()) {
            $$5 = true;
            this.f($$0);
         }
      }

      if (this.eE() < this.eS() && $$4 > 0.0F) {
         this.c($$4);
         $$5 = true;
      }

      if (this.e_() && $$2 > 0) {
         this.dW().a(lt.P, this.d(1.0), this.dE() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dW().C) {
            this.b_($$2);
         }

         $$5 = true;
      }

      if ($$3 > 0 && ($$5 || !this.gG()) && this.gM() < this.gS()) {
         $$5 = true;
         if (!this.dW().C) {
            this.u($$3);
         }
      }

      if ($$5 && !this.bb()) {
         avz $$6 = this.gr();
         if ($$6 != null) {
            this.dW().a(null, this.dB(), this.dD(), this.dH(), this.gr(), this.dn(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
         }
      }

      return $$5;
   }

   @Override
   public boolean fi() {
      return this.eF() || this.gJ();
   }

   @Nullable
   @Override
   public bvz a(dgz $$0, bsh $$1, buq $$2, @Nullable bvz $$3) {
      azh $$4 = $$0.H_();
      this.b($$4);
      cje.d $$5;
      if ($$3 instanceof cje.b) {
         $$5 = ((cje.b)$$3).a;
      } else {
         $$5 = af.a(cje.d.values(), $$4);
         $$3 = new cje.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean gq() {
      return false;
   }

   @Override
   protected avz gQ() {
      return awa.ox;
   }

   @Override
   protected avz u() {
      return awa.ow;
   }

   @Override
   protected avz e(bta $$0) {
      return awa.oB;
   }

   @Override
   protected avz o_() {
      return awa.oz;
   }

   @Nullable
   @Override
   protected avz gr() {
      return awa.oA;
   }

   @Override
   protected void b(ji $$0, dwx $$1) {
      this.a(awa.oD, 0.15F, 1.0F);
   }

   @Override
   protected void x() {
      this.a(awa.oy, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
   }

   @Override
   public int af_() {
      return this.t() ? this.gt() : 0;
   }

   @Override
   public boolean e(bus $$0) {
      return true;
   }

   @Override
   public boolean f() {
      return false;
   }

   @Override
   public int gS() {
      return 30;
   }

   @Override
   public boolean a(cgx $$0) {
      return $$0 != this && $$0 instanceof cje && this.gY() && ((cje)$$0).gY();
   }

   @Nullable
   public cje b(arc $$0, bub $$1) {
      cje $$2 = this.gD();
      if ($$2 != null) {
         this.a($$1, $$2);
         cje $$3 = (cje)$$1;
         int $$4 = this.ae.a(Math.max(this.gt(), $$3.gt())) + 1;
         if (this.ae.i() < 0.03F) {
            $$4++;
         }

         $$2.w($$4);
         $$2.a(this.ae.h() ? this.gC() : $$3.gC());
      }

      return $$2;
   }

   @Nullable
   protected cje gD() {
      return bur.ay.a(this.dW(), buq.e);
   }

   private void k(bvg $$0) {
      cpp $$1 = new cpp(this.dW(), this);
      double $$2 = $$0.dB() - this.dB();
      double $$3 = $$0.e(0.3333333333333333) - $$1.dD();
      double $$4 = $$0.dH() - this.dH();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      if (this.dW() instanceof arc $$6) {
         cpq.a($$1, $$6, cwp.j, $$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      }

      if (!this.bb()) {
         this.dW().a(null, this.dB(), this.dD(), this.dH(), awa.oC, this.dn(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
      }

      this.cd = true;
   }

   void E(boolean $$0) {
      this.cd = $$0;
   }

   @Override
   public boolean a(float $$0, float $$1, bta $$2) {
      int $$3 = this.f($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0F) {
            this.a($$2, (float)$$3);
            if (this.ca()) {
               for (buk $$4 : this.dd()) {
                  $$4.a($$2, (float)$$3);
               }
            }
         }

         this.eO();
         return true;
      }
   }

   public void gE() {
      if (this.ce != null) {
         this.ce.cf = null;
      }

      this.ce = null;
   }

   public void a(cje $$0) {
      this.ce = $$0;
      this.ce.cf = this;
   }

   public boolean gF() {
      return this.cf != null;
   }

   public boolean hb() {
      return this.ce != null;
   }

   @Nullable
   public cje hc() {
      return this.ce;
   }

   @Override
   protected double go() {
      return 2.0;
   }

   @Override
   protected void g(arc $$0) {
      if (!this.hb() && this.e_()) {
         super.g($$0);
      }
   }

   @Override
   public boolean gT() {
      return false;
   }

   @Override
   public void a(bvg $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public fba cT() {
      return new fba(0.0, 0.75 * (double)this.cS(), (double)this.dr() * 0.5);
   }

   @Override
   public bun e(bvs $$0) {
      return this.e_() ? cc : super.e($$0);
   }

   @Override
   protected fba a(buk $$0, bun $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   static class a extends cdx<cia> {
      public a(cje $$0) {
         super($$0, cia.class, 16, false, true, ($$0x, $$1) -> !((cia)$$0x).p());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends bub.a {
      public final cje.d a;

      b(cje.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends cdw {
      public c(cje $$0) {
         super($$0);
      }

      @Override
      public boolean c() {
         if (this.e instanceof cje $$0 && $$0.cd) {
            $$0.E(false);
            return false;
         }

         return super.c();
      }
   }

   public static enum d implements azv {
      a(0, "creamy"),
      b(1, "white"),
      c(2, "brown"),
      d(3, "gray");

      public static final Codec<cje.d> e = azv.a(cje.d::values);
      private static final IntFunction<cje.d> f = axq.a(cje.d::a, values(), axq.a.c);
      final int g;
      private final String h;

      private d(final int $$0, final String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.g;
      }

      public static cje.d a(int $$0) {
         return f.apply($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
