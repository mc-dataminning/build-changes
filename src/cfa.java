import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfa extends cfu {
   private static final ajp<ja> d = ajt.a(cfa.class, ajr.o);
   private static final ajp<Boolean> e = ajt.a(cfa.class, ajr.k);
   private static final ajp<Integer> ca = ajt.a(cfa.class, ajr.b);
   static final cdt cb = cdt.b().a(10.0).d();
   public static final int b = 4800;
   private static final int cc = 2400;
   public static final Predicate<civ> c = $$0 -> !$$0.y() && $$0.bF() && $$0.bg();

   public cfa(bsn<? extends cfa> $$0, dcg $$1) {
      super($$0, $$1);
      this.bR = new bzf(this, 85, 10, 0.02F, 0.1F, true);
      this.bQ = new bze(this, 10);
      this.a_(true);
   }

   @Nullable
   @Override
   public btv a(dcv $$0, bqf $$1, btg $$2, @Nullable btv $$3) {
      this.j(this.cm());
      this.t(0.0F);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(int $$0) {
   }

   public void h(ja $$0) {
      this.ao.a(d, $$0);
   }

   public ja s() {
      return this.ao.a(d);
   }

   public boolean t() {
      return this.ao.a(e);
   }

   public void w(boolean $$0) {
      this.ao.a(e, $$0);
   }

   public int x() {
      return this.ao.a(ca);
   }

   public void c(int $$0) {
      this.ao.a(ca, $$0);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(d, ja.c);
      $$0.a(e, false);
      $$0.a(ca, 2400);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("TreasurePosX", this.s().u());
      $$0.a("TreasurePosY", this.s().v());
      $$0.a("TreasurePosZ", this.s().w());
      $$0.a("GotFish", this.t());
      $$0.a("Moistness", this.x());
   }

   @Override
   public void a(tx $$0) {
      int $$1 = $$0.h("TreasurePosX");
      int $$2 = $$0.h("TreasurePosY");
      int $$3 = $$0.h("TreasurePosZ");
      this.h(new ja($$1, $$2, $$3));
      super.a($$0);
      this.w($$0.q("GotFish"));
      this.c($$0.h("Moistness"));
   }

   @Override
   protected void z() {
      this.bU.a(0, new bzl(this));
      this.bU.a(0, new cbk(this));
      this.bU.a(1, new cfa.a(this));
      this.bU.a(2, new cfa.b(this, 4.0));
      this.bU.a(4, new cay(this, 1.0, 10));
      this.bU.a(4, new cav(this));
      this.bU.a(5, new cai(this, cml.class, 6.0F));
      this.bU.a(5, new bzq(this, 10));
      this.bU.a(6, new cak(this, 1.2F, true));
      this.bU.a(8, new cfa.c());
      this.bU.a(8, new bzv(this));
      this.bU.a(9, new bzh<>(this, cjn.class, 8.0F, 1.0, 1.0));
      this.bV.a(1, new cbs(this, cjn.class).a());
   }

   public static buj.a gn() {
      return bte.A().a(buk.s, 10.0).a(buk.v, 1.2F).a(buk.c, 3.0);
   }

   @Override
   protected cco b(dcg $$0) {
      return new ccq(this, $$0);
   }

   @Override
   public void gg() {
      this.a(avh.gX, 1.0F, 1.0F);
   }

   @Override
   public int cm() {
      return 4800;
   }

   @Override
   protected int n(int $$0) {
      return this.cm();
   }

   @Override
   public int aa() {
      return 1;
   }

   @Override
   public int ab() {
      return 1;
   }

   @Override
   protected boolean o(bsh $$0) {
      return true;
   }

   @Override
   public boolean f(cud $$0) {
      bso $$1 = this.h($$0);
      return !this.a($$1).e() ? false : $$1 == bso.a && super.f($$0);
   }

   @Override
   protected void b(civ $$0) {
      if (this.a(bso.a).e()) {
         cud $$1 = $$0.p();
         if (this.j($$1)) {
            this.a($$0);
            this.a(bso.a, $$1);
            this.e(bso.a);
            this.a($$0, $$1.H());
            $$0.aq();
         }
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.gc()) {
         this.j(this.cm());
      } else {
         if (this.bi()) {
            this.c(2400);
         } else {
            this.c(this.x() - 1);
            if (this.x() <= 0) {
               this.a(this.dS().s(), 1.0F);
            }

            if (this.aG()) {
               this.j(this.du().b((double)((this.ah.i() * 2.0F - 1.0F) * 0.2F), 0.5, (double)((this.ah.i() * 2.0F - 1.0F) * 0.2F)));
               this.s(this.ah.i() * 360.0F);
               this.e(false);
               this.av = true;
            }
         }

         if (this.dR().B && this.bg() && this.du().g() > 0.03) {
            ewh $$0 = this.g(0.0F);
            float $$1 = ayg.b(this.dH() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = ayg.a(this.dH() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$3 = 1.2F - this.ah.i() * 0.7F;

            for (int $$4 = 0; $$4 < 2; $$4++) {
               this.dR()
                  .a(lj.as, this.dw() - $$0.c * (double)$$3 + (double)$$1, this.dy() - $$0.d, this.dC() - $$0.e * (double)$$3 + (double)$$2, 0.0, 0.0, 0.0);
               this.dR()
                  .a(lj.as, this.dw() - $$0.c * (double)$$3 - (double)$$1, this.dy() - $$0.d, this.dC() - $$0.e * (double)$$3 - (double)$$2, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 38) {
         this.a(lj.O);
      } else {
         super.b($$0);
      }
   }

   private void a(lh $$0) {
      for (int $$1 = 0; $$1 < 7; $$1++) {
         double $$2 = this.ah.k() * 0.01;
         double $$3 = this.ah.k() * 0.01;
         double $$4 = this.ah.k() * 0.01;
         this.dR().a($$0, this.d(1.0), this.dz() + 0.2, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected bqh b(cml $$0, bqg $$1) {
      cud $$2 = $$0.b($$1);
      if (!$$2.e() && $$2.a(awf.aP)) {
         if (!this.dR().B) {
            this.a(avh.gZ, 1.0F, 1.0F);
         }

         this.w(true);
         $$2.a(1, $$0);
         return bqh.a(this.dR().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected avg d(bra $$0) {
      return avh.ha;
   }

   @Nullable
   @Override
   protected avg n_() {
      return avh.gY;
   }

   @Nullable
   @Override
   protected avg v() {
      return this.bg() ? avh.gW : avh.gV;
   }

   @Override
   protected avg aS() {
      return avh.hd;
   }

   @Override
   protected avg aR() {
      return avh.he;
   }

   protected boolean go() {
      ja $$0 = this.J().h();
      return $$0 != null ? $$0.a(this.dp(), 12.0) : false;
   }

   @Override
   public void a(ewh $$0) {
      if (this.dd() && this.bg()) {
         this.a(this.fl(), $$0);
         this.a(bth.a, this.du());
         this.j(this.du().a(0.9));
         if (this.p() == null) {
            this.j(this.du().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public boolean a(cml $$0) {
      return true;
   }

   static class a extends caa {
      private final cfa a;
      private boolean b;

      a(cfa $$0) {
         this.a = $$0;
         this.a(EnumSet.of(caa.a.a, caa.a.b));
      }

      @Override
      public boolean Q_() {
         return false;
      }

      @Override
      public boolean a() {
         return this.a.t() && this.a.cn() >= 100;
      }

      @Override
      public boolean b() {
         ja $$0 = this.a.s();
         return !ja.a((double)$$0.u(), this.a.dy(), (double)$$0.w()).a(this.a.dp(), 4.0) && !this.b && this.a.cn() >= 100;
      }

      @Override
      public void c() {
         if (this.a.dR() instanceof aqm) {
            aqm $$0 = (aqm)this.a.dR();
            this.b = false;
            this.a.J().n();
            ja $$1 = this.a.dr();
            ja $$2 = $$0.a(awi.b, $$1, 50, false);
            if ($$2 != null) {
               this.a.h($$2);
               $$0.a(this.a, (byte)38);
            } else {
               this.b = true;
            }
         }
      }

      @Override
      public void d() {
         ja $$0 = this.a.s();
         if (ja.a((double)$$0.u(), this.a.dy(), (double)$$0.w()).a(this.a.dp(), 4.0) || this.b) {
            this.a.w(false);
         }
      }

      @Override
      public void e() {
         dcg $$0 = this.a.dR();
         if (this.a.go() || this.a.J().l()) {
            ewh $$1 = ewh.b(this.a.s());
            ewh $$2 = cdx.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = cdx.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               ja $$3 = ja.a($$2);
               if (!$$0.b_($$3).a(awc.a) || !$$0.a_($$3).a(eoy.b)) {
                  $$2 = cdx.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
               }
            }

            if ($$2 == null) {
               this.b = true;
               return;
            }

            this.a.F().a($$2.c, $$2.d, $$2.e, (float)(this.a.ab() + 20), (float)this.a.aa());
            this.a.J().a($$2.c, $$2.d, $$2.e, 1.3);
            if ($$0.z.a(this.a(80)) == 0) {
               $$0.a(this.a, (byte)38);
            }
         }
      }
   }

   static class b extends caa {
      private final cfa a;
      private final double b;
      @Nullable
      private cml c;

      b(cfa $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(caa.a.a, caa.a.b));
      }

      @Override
      public boolean a() {
         this.c = this.a.dR().a(cfa.cb, this.a);
         return this.c == null ? false : this.c.ce() && this.a.p() != this.c;
      }

      @Override
      public boolean b() {
         return this.c != null && this.c.ce() && this.a.g(this.c) < 256.0;
      }

      @Override
      public void c() {
         this.c.b(new brp(brr.D, 100), this.a);
      }

      @Override
      public void d() {
         this.c = null;
         this.a.J().n();
      }

      @Override
      public void e() {
         this.a.F().a(this.c, (float)(this.a.ab() + 20), (float)this.a.aa());
         if (this.a.g(this.c) < 6.25) {
            this.a.J().n();
         } else {
            this.a.J().a(this.c, this.b);
         }

         if (this.c.ce() && this.c.dR().z.a(6) == 0) {
            this.c.b(new brp(brr.D, 100), this.a);
         }
      }
   }

   class c extends caa {
      private int b;

      @Override
      public boolean a() {
         if (this.b > cfa.this.ai) {
            return false;
         } else {
            List<civ> $$0 = cfa.this.dR().a(civ.class, cfa.this.cM().c(8.0, 8.0, 8.0), cfa.c);
            return !$$0.isEmpty() || !cfa.this.a(bso.a).e();
         }
      }

      @Override
      public void c() {
         List<civ> $$0 = cfa.this.dR().a(civ.class, cfa.this.cM().c(8.0, 8.0, 8.0), cfa.c);
         if (!$$0.isEmpty()) {
            cfa.this.J().a($$0.get(0), 1.2F);
            cfa.this.a(avh.hc, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void d() {
         cud $$0 = cfa.this.a(bso.a);
         if (!$$0.e()) {
            this.a($$0);
            cfa.this.a(bso.a, cud.l);
            this.b = cfa.this.ai + cfa.this.ah.a(100);
         }
      }

      @Override
      public void e() {
         List<civ> $$0 = cfa.this.dR().a(civ.class, cfa.this.cM().c(8.0, 8.0, 8.0), cfa.c);
         cud $$1 = cfa.this.a(bso.a);
         if (!$$1.e()) {
            this.a($$1);
            cfa.this.a(bso.a, cud.l);
         } else if (!$$0.isEmpty()) {
            cfa.this.J().a($$0.get(0), 1.2F);
         }
      }

      private void a(cud $$0) {
         if (!$$0.e()) {
            double $$1 = cfa.this.dA() - 0.3F;
            civ $$2 = new civ(cfa.this.dR(), cfa.this.dw(), $$1, cfa.this.dC(), $$0);
            $$2.b(40);
            $$2.b(cfa.this);
            float $$3 = 0.3F;
            float $$4 = cfa.this.ah.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * cfa.this.ah.i();
            $$2.o(
               (double)(0.3F * -ayg.a(cfa.this.dH() * (float) (Math.PI / 180.0)) * ayg.b(cfa.this.dJ() * (float) (Math.PI / 180.0)) + ayg.b($$4) * $$5),
               (double)(0.3F * ayg.a(cfa.this.dJ() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * ayg.b(cfa.this.dH() * (float) (Math.PI / 180.0)) * ayg.b(cfa.this.dJ() * (float) (Math.PI / 180.0)) + ayg.a($$4) * $$5)
            );
            cfa.this.dR().b($$2);
         }
      }
   }
}
