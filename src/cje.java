import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cje extends cja implements bwg<cje.d>, cmb {
   private static final int bY = 5;
   private static final ajy<Integer> bZ = akc.a(cje.class, aka.b);
   private static final ajy<Integer> ca = akc.a(cje.class, aka.b);
   private static final bun cc = bur.ax.n().a(bum.a().a(bul.a, 0.0F, bur.ax.m() - 0.8125F, -0.3F)).a(0.5F);
   boolean cd;
   @Nullable
   private cje ce;
   @Nullable
   private cje cf;

   public cje(bur<? extends cje> $$0, dgh $$1) {
      super($$0, $$1);
      this.P().a(40.0F);
   }

   public boolean gv() {
      return false;
   }

   private void w(int $$0) {
      this.al.a(bZ, Math.max(1, Math.min(5, $$0)));
   }

   private void b(azh $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.w(1 + $$0.a($$1));
   }

   public int gw() {
      return this.al.a(bZ);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("Variant", this.gF().g);
      $$0.a("Strength", this.gw());
   }

   @Override
   public void a(tq $$0) {
      this.w($$0.h("Strength"));
      super.a($$0);
      this.a(cje.d.a($$0.h("Variant")));
   }

   @Override
   protected void E() {
      this.bS.a(0, new cby(this));
      this.bS.a(1, new cdi(this, 1.2));
      this.bS.a(2, new ccl(this, 2.1F));
      this.bS.a(3, new cdd(this, 1.25, 40, 20.0F));
      this.bS.a(3, new ccx(this, 1.2));
      this.bS.a(4, new cbq(this, 1.0));
      this.bS.a(5, new cdm(this, 1.25, $$0 -> $$0.a(awy.ar), false));
      this.bS.a(6, new ccd(this, 1.0));
      this.bS.a(7, new cdr(this, 0.7));
      this.bS.a(8, new ccm(this, cow.class, 6.0F));
      this.bS.a(9, new ccz(this));
      this.bT.a(1, new cje.c(this));
      this.bT.a(2, new cje.a(this));
   }

   public static bwn.a gE() {
      return p();
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(bZ, 0);
      $$0.a(ca, 0);
   }

   public cje.d gF() {
      return cje.d.a(this.al.a(ca));
   }

   public void a(cje.d $$0) {
      this.al.a(ca, $$0.g);
   }

   @Override
   public boolean j(cwo $$0) {
      return $$0.a(awy.aq);
   }

   @Override
   protected boolean a(cow $$0, cwo $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(cws.qb)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(djn.iH.j())) {
         $$2 = 90;
         $$3 = 6;
         $$4 = 10.0F;
         if (this.gJ() && this.Y_() == 0 && this.gz()) {
            $$5 = true;
            this.f($$0);
         }
      }

      if (this.eD() < this.eS() && $$4 > 0.0F) {
         this.c($$4);
         $$5 = true;
      }

      if (this.e_() && $$2 > 0) {
         this.dV().a(lt.P, this.d(1.0), this.dD() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dV().C) {
            this.b_($$2);
         }

         $$5 = true;
      }

      if ($$3 > 0 && ($$5 || !this.gJ()) && this.gP() < this.gV()) {
         $$5 = true;
         if (!this.dV().C) {
            this.u($$3);
         }
      }

      if ($$5 && !this.bb()) {
         avz $$6 = this.gu();
         if ($$6 != null) {
            this.dV().a(null, this.dA(), this.dC(), this.dG(), this.gu(), this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
         }
      }

      return $$5;
   }

   @Override
   public boolean fi() {
      return this.eE() || this.gM();
   }

   @Nullable
   @Override
   public bvz a(dgy $$0, bsh $$1, buq $$2, @Nullable bvz $$3) {
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
   protected boolean gt() {
      return false;
   }

   @Override
   protected avz gT() {
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
   protected avz gu() {
      return awa.oA;
   }

   @Override
   protected void b(ji $$0, dww $$1) {
      this.a(awa.oD, 0.15F, 1.0F);
   }

   @Override
   protected void x() {
      this.a(awa.oy, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
   }

   @Override
   public int af_() {
      return this.t() ? this.gw() : 0;
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
   public int gV() {
      return 30;
   }

   @Override
   public boolean a(cgx $$0) {
      return $$0 != this && $$0 instanceof cje && this.hb() && ((cje)$$0).hb();
   }

   @Nullable
   public cje b(ard $$0, bub $$1) {
      cje $$2 = this.gG();
      if ($$2 != null) {
         this.a($$1, $$2);
         cje $$3 = (cje)$$1;
         int $$4 = this.ae.a(Math.max(this.gw(), $$3.gw())) + 1;
         if (this.ae.i() < 0.03F) {
            $$4++;
         }

         $$2.w($$4);
         $$2.a(this.ae.h() ? this.gF() : $$3.gF());
      }

      return $$2;
   }

   @Nullable
   protected cje gG() {
      return bur.ax.a(this.dV(), buq.e);
   }

   private void k(bvg $$0) {
      cpo $$1 = new cpo(this.dV(), this);
      double $$2 = $$0.dA() - this.dA();
      double $$3 = $$0.e(0.3333333333333333) - $$1.dC();
      double $$4 = $$0.dG() - this.dG();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      if (this.dV() instanceof ard $$6) {
         cpp.a($$1, $$6, cwo.j, $$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      }

      if (!this.bb()) {
         this.dV().a(null, this.dA(), this.dC(), this.dG(), awa.oC, this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
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
               for (buk $$4 : this.dc()) {
                  $$4.a($$2, (float)$$3);
               }
            }
         }

         this.eO();
         return true;
      }
   }

   public void gH() {
      if (this.ce != null) {
         this.ce.cf = null;
      }

      this.ce = null;
   }

   public void a(cje $$0) {
      this.ce = $$0;
      this.ce.cf = this;
   }

   public boolean gI() {
      return this.cf != null;
   }

   public boolean he() {
      return this.ce != null;
   }

   @Nullable
   public cje hf() {
      return this.ce;
   }

   @Override
   protected double gr() {
      return 2.0;
   }

   @Override
   protected void g(ard $$0) {
      if (!this.he() && this.e_()) {
         super.g($$0);
      }
   }

   @Override
   public boolean gW() {
      return false;
   }

   @Override
   public void a(bvg $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public faz cT() {
      return new faz(0.0, 0.75 * (double)this.cS(), (double)this.dq() * 0.5);
   }

   @Override
   public bun e(bvs $$0) {
      return this.e_() ? cc : super.e($$0);
   }

   @Override
   protected faz a(buk $$0, bun $$1, float $$2) {
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
