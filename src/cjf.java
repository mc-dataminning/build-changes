import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cjf extends cjb implements bwh<cjf.d>, cmc {
   private static final int bY = 5;
   private static final ajy<Integer> bZ = akc.a(cjf.class, aka.b);
   private static final ajy<Integer> ca = akc.a(cjf.class, aka.b);
   private static final buo cc = bus.ax.n().a(bun.a().a(bum.a, 0.0F, bus.ax.m() - 0.8125F, -0.3F)).a(0.5F);
   boolean cd;
   @Nullable
   private cjf ce;
   @Nullable
   private cjf cf;

   public cjf(bus<? extends cjf> $$0, dgi $$1) {
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
      this.a(cjf.d.a($$0.h("Variant")));
   }

   @Override
   protected void E() {
      this.bS.a(0, new cbz(this));
      this.bS.a(1, new cdj(this, 1.2));
      this.bS.a(2, new ccm(this, 2.1F));
      this.bS.a(3, new cde(this, 1.25, 40, 20.0F));
      this.bS.a(3, new ccy(this, 1.2));
      this.bS.a(4, new cbr(this, 1.0));
      this.bS.a(5, new cdn(this, 1.25, $$0 -> $$0.a(awy.ar), false));
      this.bS.a(6, new cce(this, 1.0));
      this.bS.a(7, new cds(this, 0.7));
      this.bS.a(8, new ccn(this, cox.class, 6.0F));
      this.bS.a(9, new cda(this));
      this.bT.a(1, new cjf.c(this));
      this.bT.a(2, new cjf.a(this));
   }

   public static bwo.a gE() {
      return p();
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(bZ, 0);
      $$0.a(ca, 0);
   }

   public cjf.d gF() {
      return cjf.d.a(this.al.a(ca));
   }

   public void a(cjf.d $$0) {
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
   public bwa a(dgz $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      azh $$4 = $$0.H_();
      this.b($$4);
      cjf.d $$5;
      if ($$3 instanceof cjf.b) {
         $$5 = ((cjf.b)$$3).a;
      } else {
         $$5 = af.a(cjf.d.values(), $$4);
         $$3 = new cjf.b($$5);
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
   protected avz e(btb $$0) {
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
   protected void b(ji $$0, dwx $$1) {
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
   public boolean e(but $$0) {
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
   public boolean a(cgy $$0) {
      return $$0 != this && $$0 instanceof cjf && this.hb() && ((cjf)$$0).hb();
   }

   @Nullable
   public cjf b(ard $$0, buc $$1) {
      cjf $$2 = this.gG();
      if ($$2 != null) {
         this.a($$1, $$2);
         cjf $$3 = (cjf)$$1;
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
   protected cjf gG() {
      return bus.ax.a(this.dV(), bur.e);
   }

   private void k(bvh $$0) {
      cpp $$1 = new cpp(this.dV(), this);
      double $$2 = $$0.dA() - this.dA();
      double $$3 = $$0.e(0.3333333333333333) - $$1.dC();
      double $$4 = $$0.dG() - this.dG();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      if (this.dV() instanceof ard $$6) {
         cpq.a($$1, $$6, cwp.j, $$2, $$3 + $$5, $$4, 1.5F, 10.0F);
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
   public boolean a(float $$0, float $$1, btb $$2) {
      int $$3 = this.f($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0F) {
            this.a($$2, (float)$$3);
            if (this.ca()) {
               for (bul $$4 : this.dc()) {
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

   public void a(cjf $$0) {
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
   public cjf hf() {
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
   public void a(bvh $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public fba cT() {
      return new fba(0.0, 0.75 * (double)this.cS(), (double)this.dq() * 0.5);
   }

   @Override
   public buo e(bvt $$0) {
      return this.e_() ? cc : super.e($$0);
   }

   @Override
   protected fba a(bul $$0, buo $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   static class a extends cdy<cib> {
      public a(cjf $$0) {
         super($$0, cib.class, 16, false, true, ($$0x, $$1) -> !((cib)$$0x).p());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends buc.a {
      public final cjf.d a;

      b(cjf.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends cdx {
      public c(cjf $$0) {
         super($$0);
      }

      @Override
      public boolean c() {
         if (this.e instanceof cjf $$0 && $$0.cd) {
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

      public static final Codec<cjf.d> e = azv.a(cjf.d::values);
      private static final IntFunction<cjf.d> f = axq.a(cjf.d::a, values(), axq.a.c);
      final int g;
      private final String h;

      private d(final int $$0, final String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.g;
      }

      public static cjf.d a(int $$0) {
         return f.apply($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
