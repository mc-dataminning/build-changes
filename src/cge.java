import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cge extends cfd {
   private static final akj<iz> bZ = akn.a(cge.class, akl.o);
   private static final akj<Boolean> cb = akn.a(cge.class, akl.k);
   private static final akj<Boolean> cc = akn.a(cge.class, akl.k);
   private static final akj<iz> cd = akn.a(cge.class, akl.o);
   private static final akj<Boolean> ce = akn.a(cge.class, akl.k);
   private static final akj<Boolean> cf = akn.a(cge.class, akl.k);
   private static final float cg = 0.3F;
   private static final bsv ch = bsy.bh.n().a(bsu.a().a(bst.a, 0.0F, bsy.bh.m(), -0.25F)).a(0.3F);
   int ci;
   public static final Predicate<btn> bY = $$0 -> $$0.p_() && !$$0.be();

   public cge(bsy<? extends cge> $$0, dbw $$1) {
      super($$0, $$1);
      this.a(eok.j, 0.0F);
      this.a(eok.t, -1.0F);
      this.a(eok.s, -1.0F);
      this.a(eok.r, -1.0F);
      this.bP = new cge.e(this);
   }

   public void i(iz $$0) {
      this.ao.a(bZ, $$0);
   }

   iz gq() {
      return this.ao.a(bZ);
   }

   void j(iz $$0) {
      this.ao.a(cd, $$0);
   }

   iz gw() {
      return this.ao.a(cd);
   }

   public boolean s() {
      return this.ao.a(cb);
   }

   void w(boolean $$0) {
      this.ao.a(cb, $$0);
   }

   public boolean u() {
      return this.ao.a(cc);
   }

   void x(boolean $$0) {
      this.ci = $$0 ? 1 : 0;
      this.ao.a(cc, $$0);
   }

   boolean gx() {
      return this.ao.a(ce);
   }

   void y(boolean $$0) {
      this.ao.a(ce, $$0);
   }

   boolean gy() {
      return this.ao.a(cf);
   }

   void z(boolean $$0) {
      this.ao.a(cf, $$0);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bZ, iz.c);
      $$0.a(cb, false);
      $$0.a(cd, iz.c);
      $$0.a(ce, false);
      $$0.a(cf, false);
      $$0.a(cc, false);
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("HomePosX", this.gq().u());
      $$0.a("HomePosY", this.gq().v());
      $$0.a("HomePosZ", this.gq().w());
      $$0.a("HasEgg", this.s());
      $$0.a("TravelPosX", this.gw().u());
      $$0.a("TravelPosY", this.gw().v());
      $$0.a("TravelPosZ", this.gw().w());
   }

   @Override
   public void a(ur $$0) {
      int $$1 = $$0.h("HomePosX");
      int $$2 = $$0.h("HomePosY");
      int $$3 = $$0.h("HomePosZ");
      this.i(new iz($$1, $$2, $$3));
      super.a($$0);
      this.w($$0.q("HasEgg"));
      int $$4 = $$0.h("TravelPosX");
      int $$5 = $$0.h("TravelPosY");
      int $$6 = $$0.h("TravelPosZ");
      this.j(new iz($$4, $$5, $$6));
   }

   @Nullable
   @Override
   public bug a(dcl $$0, bqq $$1, btr $$2, @Nullable bug $$3) {
      this.i(this.dp());
      this.j(iz.c);
      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean c(bsy<cge> $$0, dbx $$1, btr $$2, iz $$3, azf $$4) {
      return $$3.v() < $$1.z_() + 4 && dnp.a($$1, $$3) && a($$1, $$3);
   }

   @Override
   protected void z() {
      this.bS.a(0, new cge.f(this, 1.2));
      this.bS.a(1, new cge.a(this, 1.0));
      this.bS.a(1, new cge.d(this, 1.0));
      this.bS.a(2, new cbt(this, 1.1, $$0 -> $$0.a(awx.av), false));
      this.bS.a(3, new cge.c(this, 1.0));
      this.bS.a(4, new cge.b(this, 1.0));
      this.bS.a(7, new cge.i(this, 1.0));
      this.bS.a(8, new cat(this, cmv.class, 8.0F));
      this.bS.a(9, new cge.h(this, 1.0, 100));
   }

   public static buu.a y() {
      return btp.A().a(buv.q, 30.0).a(buv.r, 0.25).a(buv.v, 1.0);
   }

   @Override
   public boolean cC() {
      return false;
   }

   @Override
   public int P() {
      return 200;
   }

   @Nullable
   @Override
   protected avy v() {
      return !this.be() && this.aE() && !this.p_() ? avz.Ac : super.v();
   }

   @Override
   protected void e(float $$0) {
      super.e($$0 * 1.5F);
   }

   @Override
   protected avy aP() {
      return avz.An;
   }

   @Nullable
   @Override
   protected avy d(brl $$0) {
      return this.p_() ? avz.Aj : avz.Ai;
   }

   @Nullable
   @Override
   protected avy o_() {
      return this.p_() ? avz.Ae : avz.Ad;
   }

   @Override
   protected void b(iz $$0, dsa $$1) {
      avy $$2 = this.p_() ? avz.Am : avz.Al;
      this.a($$2, 0.15F, 1.0F);
   }

   @Override
   public boolean gr() {
      return super.gr() && !this.s();
   }

   @Override
   protected float aO() {
      return this.aa + 0.15F;
   }

   @Override
   public float ed() {
      return this.p_() ? 0.3F : 1.0F;
   }

   @Override
   protected ccz b(dbw $$0) {
      return new cge.g(this, $$0);
   }

   @Nullable
   @Override
   public bsm a(are $$0, bsm $$1) {
      return bsy.bh.a((dbw)$$0);
   }

   @Override
   public boolean o(cun $$0) {
      return $$0.a(awx.av);
   }

   @Override
   public float a(iz $$0, dbz $$1) {
      if (!this.gx() && $$1.b_($$0).a(awu.a)) {
         return 10.0F;
      } else {
         return dnp.a($$1, $$0) ? 10.0F : $$1.w($$0);
      }
   }

   @Override
   public void n_() {
      super.n_();
      if (this.bD() && this.u() && this.ci >= 1 && this.ci % 5 == 0) {
         iz $$0 = this.dp();
         if (dnp.a(this.dP(), $$0)) {
            this.dP().c(2001, $$0, dex.i(this.dP().a_($$0.d())));
            this.a(dwt.u);
         }
      }
   }

   @Override
   protected void k() {
      super.k();
      if (!this.p_() && this.dP().ab().b(dbs.f)) {
         this.a(cuq.op, 1);
      }
   }

   @Override
   public void a(evp $$0) {
      if (this.da() && this.be()) {
         this.a(0.1F, $$0);
         this.a(bts.a, this.ds());
         this.h(this.ds().a(0.9));
         if (this.p() == null && (!this.gx() || !this.gq().a(this.dn(), 20.0))) {
            this.h(this.ds().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public boolean a(cmv $$0) {
      return false;
   }

   @Override
   public void a(are $$0, btm $$1) {
      this.a(this.dQ().b(), Float.MAX_VALUE);
   }

   @Override
   public bsv e(btz $$0) {
      return this.p_() ? ch : super.e($$0);
   }

   static class a extends bzx {
      private final cge d;

      a(cge $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && !this.d.s();
      }

      @Override
      protected void g() {
         arf $$0 = this.a.gt();
         if ($$0 == null && this.c.gt() != null) {
            $$0 = this.c.gt();
         }

         if ($$0 != null) {
            $$0.a(awj.P);
            am.p.a($$0, this.a, this.c, null);
         }

         this.d.w(true);
         this.a.c_(6000);
         this.c.c_(6000);
         this.a.gv();
         this.c.gv();
         azf $$1 = this.a.el();
         if (this.b.ab().b(dbs.f)) {
            this.b.b(new btd(this.b, this.a.du(), this.a.dw(), this.a.dA(), $$1.a(7) + 1));
         }
      }
   }

   static class b extends cal {
      private final cge a;
      private final double b;
      private boolean c;
      private int d;
      private static final int e = 600;

      b(cge $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean a() {
         if (this.a.p_()) {
            return false;
         } else if (this.a.s()) {
            return true;
         } else {
            return this.a.el().a(b(700)) != 0 ? false : !this.a.gq().a(this.a.dn(), 64.0);
         }
      }

      @Override
      public void c() {
         this.a.y(true);
         this.c = false;
         this.d = 0;
      }

      @Override
      public void d() {
         this.a.y(false);
      }

      @Override
      public boolean b() {
         return !this.a.gq().a(this.a.dn(), 7.0) && !this.c && this.d <= this.a(600);
      }

      @Override
      public void e() {
         iz $$0 = this.a.gq();
         boolean $$1 = $$0.a(this.a.dn(), 16.0);
         if ($$1) {
            this.d++;
         }

         if (this.a.K().l()) {
            evp $$2 = evp.c($$0);
            evp $$3 = cei.a(this.a, 16, 3, $$2, (float) (Math.PI / 10));
            if ($$3 == null) {
               $$3 = cei.a(this.a, 8, 7, $$2, (float) (Math.PI / 2));
            }

            if ($$3 != null && !$$1 && !this.a.dP().a_(iz.a($$3)).a(dez.G)) {
               $$3 = cei.a(this.a, 16, 5, $$2, (float) (Math.PI / 2));
            }

            if ($$3 == null) {
               this.c = true;
               return;
            }

            this.a.K().a($$3.c, $$3.d, $$3.e, this.b);
         }
      }
   }

   static class c extends cay {
      private static final int g = 1200;
      private final cge h;

      c(cge $$0, double $$1) {
         super($$0, $$0.p_() ? 2.0 : $$1, 24);
         this.h = $$0;
         this.f = -1;
      }

      @Override
      public boolean b() {
         return !this.h.be() && this.d <= 1200 && this.a(this.h.dP(), this.e);
      }

      @Override
      public boolean a() {
         if (this.h.p_() && !this.h.be()) {
            return super.a();
         } else {
            return !this.h.gx() && !this.h.be() && !this.h.s() ? super.a() : false;
         }
      }

      @Override
      public boolean l() {
         return this.d % 160 == 0;
      }

      @Override
      protected boolean a(dbz $$0, iz $$1) {
         return $$0.a_($$1).a(dez.G);
      }
   }

   static class d extends cay {
      private final cge g;

      d(cge $$0, double $$1) {
         super($$0, $$1, 16);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         return this.g.s() && this.g.gq().a(this.g.dn(), 9.0) ? super.a() : false;
      }

      @Override
      public boolean b() {
         return super.b() && this.g.s() && this.g.gq().a(this.g.dn(), 9.0);
      }

      @Override
      public void e() {
         super.e();
         iz $$0 = this.g.dp();
         if (!this.g.be() && this.m()) {
            if (this.g.ci < 1) {
               this.g.x(true);
            } else if (this.g.ci > this.a(200)) {
               dbw $$1 = this.g.dP();
               $$1.a(null, $$0, avz.Ak, awa.e, 0.3F, 0.9F + $$1.z.i() * 0.2F);
               iz $$2 = this.e.c();
               dsa $$3 = dez.mf.o().a(dnp.f, Integer.valueOf(this.g.ah.a(4) + 1));
               $$1.a($$2, $$3, 3);
               $$1.a(dwt.i, $$2, dwt.a.a(this.g, $$3));
               this.g.w(false);
               this.g.x(false);
               this.g.t(600);
            }

            if (this.g.u()) {
               this.g.ci++;
            }
         }
      }

      @Override
      protected boolean a(dbz $$0, iz $$1) {
         return !$$0.u($$1.c()) ? false : dnp.b($$0, $$1);
      }
   }

   static class e extends bzo {
      private final cge l;

      e(cge $$0) {
         super($$0);
         this.l = $$0;
      }

      private void g() {
         if (this.l.be()) {
            this.l.h(this.l.ds().b(0.0, 0.005, 0.0));
            if (!this.l.gq().a(this.l.dn(), 16.0)) {
               this.l.y(Math.max(this.l.fn() / 2.0F, 0.08F));
            }

            if (this.l.p_()) {
               this.l.y(Math.max(this.l.fn() / 3.0F, 0.06F));
            }
         } else if (this.l.aE()) {
            this.l.y(Math.max(this.l.fn() / 2.0F, 0.06F));
         }
      }

      @Override
      public void a() {
         this.g();
         if (this.k == bzo.a.b && !this.l.K().l()) {
            double $$0 = this.e - this.l.du();
            double $$1 = this.f - this.l.dw();
            double $$2 = this.g - this.l.dA();
            double $$3 = Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
            if ($$3 < 1.0E-5F) {
               this.d.y(0.0F);
            } else {
               $$1 /= $$3;
               float $$4 = (float)(ayx.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.r(this.a(this.l.dF(), $$4, 90.0F));
               this.l.aY = this.l.dF();
               float $$5 = (float)(this.h * this.l.g(buv.r));
               this.l.y(ayx.i(0.125F, this.l.fn(), $$5));
               this.l.h(this.l.ds().b(0.0, (double)this.l.fn() * $$1 * 0.1, 0.0));
            }
         } else {
            this.l.y(0.0F);
         }
      }
   }

   static class f extends cbe {
      f(cge $$0, double $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a() {
         if (!this.h()) {
            return false;
         } else {
            iz $$0 = this.a(this.b.dP(), this.b, 7);
            if ($$0 != null) {
               this.d = (double)$$0.u();
               this.e = (double)$$0.v();
               this.f = (double)$$0.w();
               return true;
            } else {
               return this.i();
            }
         }
      }
   }

   static class g extends ccw {
      g(cge $$0, dbw $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a(iz $$0) {
         if (this.a instanceof cge $$1 && $$1.gy()) {
            return this.b.a_($$0).a(dez.G);
         }

         return !this.b.a_($$0.d()).i();
      }
   }

   static class h extends cbi {
      private final cge i;

      h(cge $$0, double $$1, int $$2) {
         super($$0, $$1, $$2);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return !this.b.be() && !this.i.gx() && !this.i.s() ? super.a() : false;
      }
   }

   static class i extends cal {
      private final cge a;
      private final double b;
      private boolean c;

      i(cge $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean a() {
         return !this.a.gx() && !this.a.s() && this.a.be();
      }

      @Override
      public void c() {
         int $$0 = 512;
         int $$1 = 4;
         azf $$2 = this.a.ah;
         int $$3 = $$2.a(1025) - 512;
         int $$4 = $$2.a(9) - 4;
         int $$5 = $$2.a(1025) - 512;
         if ((double)$$4 + this.a.dw() > (double)(this.a.dP().z_() - 1)) {
            $$4 = 0;
         }

         iz $$6 = iz.a((double)$$3 + this.a.du(), (double)$$4 + this.a.dw(), (double)$$5 + this.a.dA());
         this.a.j($$6);
         this.a.z(true);
         this.c = false;
      }

      @Override
      public void e() {
         if (this.a.K().l()) {
            evp $$0 = evp.c(this.a.gw());
            evp $$1 = cei.a(this.a, 16, 3, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = cei.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 != null) {
               int $$2 = ayx.a($$1.c);
               int $$3 = ayx.a($$1.e);
               int $$4 = 34;
               if (!this.a.dP().b($$2 - 34, $$3 - 34, $$2 + 34, $$3 + 34)) {
                  $$1 = null;
               }
            }

            if ($$1 == null) {
               this.c = true;
               return;
            }

            this.a.K().a($$1.c, $$1.d, $$1.e, this.b);
         }
      }

      @Override
      public boolean b() {
         return !this.a.K().l() && !this.c && !this.a.gx() && !this.a.gu() && !this.a.s();
      }

      @Override
      public void d() {
         this.a.z(false);
         super.d();
      }
   }
}
