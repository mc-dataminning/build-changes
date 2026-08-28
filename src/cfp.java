import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfp extends ceo {
   private static final ajp<ja> cb = ajt.a(cfp.class, ajr.o);
   private static final ajp<Boolean> cd = ajt.a(cfp.class, ajr.k);
   private static final ajp<Boolean> ce = ajt.a(cfp.class, ajr.k);
   private static final ajp<ja> cf = ajt.a(cfp.class, ajr.o);
   private static final ajp<Boolean> cg = ajt.a(cfp.class, ajr.k);
   private static final ajp<Boolean> ch = ajt.a(cfp.class, ajr.k);
   private static final float ci = 0.3F;
   private static final bsg cj = bsj.bh.n().a(bsf.a().a(bse.a, 0.0F, bsj.bh.m(), -0.25F)).a(0.3F);
   int ck;
   public static final Predicate<bsy> ca = $$0 -> $$0.p_() && !$$0.be();

   public cfp(bsj<? extends cfp> $$0, dcd $$1) {
      super($$0, $$1);
      this.a(eos.j, 0.0F);
      this.a(eos.t, -1.0F);
      this.a(eos.s, -1.0F);
      this.a(eos.r, -1.0F);
      this.bR = new cfp.e(this);
   }

   public void h(ja $$0) {
      this.ao.a(cb, $$0);
   }

   ja gn() {
      return this.ao.a(cb);
   }

   void i(ja $$0) {
      this.ao.a(cf, $$0);
   }

   ja gt() {
      return this.ao.a(cf);
   }

   public boolean s() {
      return this.ao.a(cd);
   }

   void w(boolean $$0) {
      this.ao.a(cd, $$0);
   }

   public boolean u() {
      return this.ao.a(ce);
   }

   void x(boolean $$0) {
      this.ck = $$0 ? 1 : 0;
      this.ao.a(ce, $$0);
   }

   boolean gu() {
      return this.ao.a(cg);
   }

   void y(boolean $$0) {
      this.ao.a(cg, $$0);
   }

   boolean gv() {
      return this.ao.a(ch);
   }

   void z(boolean $$0) {
      this.ao.a(ch, $$0);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(cb, ja.c);
      $$0.a(cd, false);
      $$0.a(cf, ja.c);
      $$0.a(cg, false);
      $$0.a(ch, false);
      $$0.a(ce, false);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("HomePosX", this.gn().u());
      $$0.a("HomePosY", this.gn().v());
      $$0.a("HomePosZ", this.gn().w());
      $$0.a("HasEgg", this.s());
      $$0.a("TravelPosX", this.gt().u());
      $$0.a("TravelPosY", this.gt().v());
      $$0.a("TravelPosZ", this.gt().w());
   }

   @Override
   public void a(tx $$0) {
      int $$1 = $$0.h("HomePosX");
      int $$2 = $$0.h("HomePosY");
      int $$3 = $$0.h("HomePosZ");
      this.h(new ja($$1, $$2, $$3));
      super.a($$0);
      this.w($$0.q("HasEgg"));
      int $$4 = $$0.h("TravelPosX");
      int $$5 = $$0.h("TravelPosY");
      int $$6 = $$0.h("TravelPosZ");
      this.i(new ja($$4, $$5, $$6));
   }

   @Nullable
   @Override
   public btr a(dcs $$0, bqb $$1, btc $$2, @Nullable btr $$3) {
      this.h(this.dp());
      this.i(ja.c);
      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean c(bsj<cfp> $$0, dce $$1, btc $$2, ja $$3, aym $$4) {
      return $$3.v() < $$1.z_() + 4 && dnx.a($$1, $$3) && a($$1, $$3);
   }

   @Override
   protected void z() {
      this.bU.a(0, new cfp.f(this, 1.2));
      this.bU.a(1, new cfp.a(this, 1.0));
      this.bU.a(1, new cfp.d(this, 1.0));
      this.bU.a(2, new cbe(this, 1.1, $$0 -> $$0.a(awd.av), false));
      this.bU.a(3, new cfp.c(this, 1.0));
      this.bU.a(4, new cfp.b(this, 1.0));
      this.bU.a(7, new cfp.i(this, 1.0));
      this.bU.a(8, new cae(this, cmh.class, 8.0F));
      this.bU.a(9, new cfp.h(this, 1.0, 100));
   }

   public static buf.a y() {
      return bta.A().a(bug.s, 30.0).a(bug.v, 0.25).a(bug.B, 1.0);
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
   protected ave v() {
      return !this.be() && this.aE() && !this.p_() ? avf.Af : super.v();
   }

   @Override
   protected void f(float $$0) {
      super.f($$0 * 1.5F);
   }

   @Override
   protected ave aP() {
      return avf.Aq;
   }

   @Nullable
   @Override
   protected ave d(bqw $$0) {
      return this.p_() ? avf.Am : avf.Al;
   }

   @Nullable
   @Override
   protected ave o_() {
      return this.p_() ? avf.Ah : avf.Ag;
   }

   @Override
   protected void b(ja $$0, dsh $$1) {
      ave $$2 = this.p_() ? avf.Ap : avf.Ao;
      this.a($$2, 0.15F, 1.0F);
   }

   @Override
   public boolean go() {
      return super.go() && !this.s();
   }

   @Override
   protected float aO() {
      return this.aa + 0.15F;
   }

   @Override
   public float ea() {
      return this.p_() ? 0.3F : 1.0F;
   }

   @Override
   protected cck b(dcd $$0) {
      return new cfp.g(this, $$0);
   }

   @Nullable
   @Override
   public brx a(aqk $$0, brx $$1) {
      return bsj.bh.a((dcd)$$0);
   }

   @Override
   public boolean o(cua $$0) {
      return $$0.a(awd.av);
   }

   @Override
   public float a(ja $$0, dcg $$1) {
      if (!this.gu() && $$1.b_($$0).a(awa.a)) {
         return 10.0F;
      } else {
         return dnx.a($$1, $$0) ? 10.0F : $$1.w($$0);
      }
   }

   @Override
   public void n_() {
      super.n_();
      if (this.bD() && this.u() && this.ck >= 1 && this.ck % 5 == 0) {
         ja $$0 = this.dp();
         if (dnx.a(this.dP(), $$0)) {
            this.dP().c(2001, $$0, dff.i(this.dP().a_($$0.d())));
            this.a(dxa.u);
         }
      }
   }

   @Override
   protected void k() {
      super.k();
      if (!this.p_() && this.dP().ab().b(dbz.f)) {
         this.a(cud.op, 1);
      }
   }

   @Override
   public void a(evz $$0) {
      if (this.da() && this.be()) {
         this.a(0.1F, $$0);
         this.a(btd.a, this.ds());
         this.h(this.ds().a(0.9));
         if (this.p() == null && (!this.gu() || !this.gn().a(this.dn(), 20.0))) {
            this.h(this.ds().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public boolean a(cmh $$0) {
      return false;
   }

   @Override
   public void a(aqk $$0, bsx $$1) {
      this.a(this.dQ().c(), Float.MAX_VALUE);
   }

   @Override
   public bsg e(btk $$0) {
      return this.p_() ? cj : super.e($$0);
   }

   static class a extends bzi {
      private final cfp d;

      a(cfp $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && !this.d.s();
      }

      @Override
      protected void g() {
         aql $$0 = this.a.gq();
         if ($$0 == null && this.c.gq() != null) {
            $$0 = this.c.gq();
         }

         if ($$0 != null) {
            $$0.a(avp.P);
            am.p.a($$0, this.a, this.c, null);
         }

         this.d.w(true);
         this.a.c_(6000);
         this.c.c_(6000);
         this.a.gs();
         this.c.gs();
         aym $$1 = this.a.dS();
         if (this.b.ab().b(dbz.f)) {
            this.b.b(new bso(this.b, this.a.du(), this.a.dw(), this.a.dA(), $$1.a(7) + 1));
         }
      }
   }

   static class b extends bzw {
      private final cfp a;
      private final double b;
      private boolean c;
      private int d;
      private static final int e = 600;

      b(cfp $$0, double $$1) {
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
            return this.a.dS().a(b(700)) != 0 ? false : !this.a.gn().a(this.a.dn(), 64.0);
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
         return !this.a.gn().a(this.a.dn(), 7.0) && !this.c && this.d <= this.a(600);
      }

      @Override
      public void e() {
         ja $$0 = this.a.gn();
         boolean $$1 = $$0.a(this.a.dn(), 16.0);
         if ($$1) {
            this.d++;
         }

         if (this.a.K().l()) {
            evz $$2 = evz.c($$0);
            evz $$3 = cdt.a(this.a, 16, 3, $$2, (float) (Math.PI / 10));
            if ($$3 == null) {
               $$3 = cdt.a(this.a, 8, 7, $$2, (float) (Math.PI / 2));
            }

            if ($$3 != null && !$$1 && !this.a.dP().a_(ja.a($$3)).a(dfh.G)) {
               $$3 = cdt.a(this.a, 16, 5, $$2, (float) (Math.PI / 2));
            }

            if ($$3 == null) {
               this.c = true;
               return;
            }

            this.a.K().a($$3.c, $$3.d, $$3.e, this.b);
         }
      }
   }

   static class c extends caj {
      private static final int g = 1200;
      private final cfp h;

      c(cfp $$0, double $$1) {
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
            return !this.h.gu() && !this.h.be() && !this.h.s() ? super.a() : false;
         }
      }

      @Override
      public boolean l() {
         return this.d % 160 == 0;
      }

      @Override
      protected boolean a(dcg $$0, ja $$1) {
         return $$0.a_($$1).a(dfh.G);
      }
   }

   static class d extends caj {
      private final cfp g;

      d(cfp $$0, double $$1) {
         super($$0, $$1, 16);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         return this.g.s() && this.g.gn().a(this.g.dn(), 9.0) ? super.a() : false;
      }

      @Override
      public boolean b() {
         return super.b() && this.g.s() && this.g.gn().a(this.g.dn(), 9.0);
      }

      @Override
      public void e() {
         super.e();
         ja $$0 = this.g.dp();
         if (!this.g.be() && this.m()) {
            if (this.g.ck < 1) {
               this.g.x(true);
            } else if (this.g.ck > this.a(200)) {
               dcd $$1 = this.g.dP();
               $$1.a(null, $$0, avf.An, avg.e, 0.3F, 0.9F + $$1.z.i() * 0.2F);
               ja $$2 = this.e.c();
               dsh $$3 = dfh.mf.o().a(dnx.f, Integer.valueOf(this.g.ah.a(4) + 1));
               $$1.a($$2, $$3, 3);
               $$1.a(dxa.i, $$2, dxa.a.a(this.g, $$3));
               this.g.w(false);
               this.g.x(false);
               this.g.s(600);
            }

            if (this.g.u()) {
               this.g.ck++;
            }
         }
      }

      @Override
      protected boolean a(dcg $$0, ja $$1) {
         return !$$0.u($$1.c()) ? false : dnx.b($$0, $$1);
      }
   }

   static class e extends byz {
      private final cfp l;

      e(cfp $$0) {
         super($$0);
         this.l = $$0;
      }

      private void g() {
         if (this.l.be()) {
            this.l.h(this.l.ds().b(0.0, 0.005, 0.0));
            if (!this.l.gn().a(this.l.dn(), 16.0)) {
               this.l.z(Math.max(this.l.fj() / 2.0F, 0.08F));
            }

            if (this.l.p_()) {
               this.l.z(Math.max(this.l.fj() / 3.0F, 0.06F));
            }
         } else if (this.l.aE()) {
            this.l.z(Math.max(this.l.fj() / 2.0F, 0.06F));
         }
      }

      @Override
      public void a() {
         this.g();
         if (this.k == byz.a.b && !this.l.K().l()) {
            double $$0 = this.e - this.l.du();
            double $$1 = this.f - this.l.dw();
            double $$2 = this.g - this.l.dA();
            double $$3 = Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
            if ($$3 < 1.0E-5F) {
               this.d.z(0.0F);
            } else {
               $$1 /= $$3;
               float $$4 = (float)(aye.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.s(this.a(this.l.dF(), $$4, 90.0F));
               this.l.aY = this.l.dF();
               float $$5 = (float)(this.h * this.l.g(bug.v));
               this.l.z(aye.i(0.125F, this.l.fj(), $$5));
               this.l.h(this.l.ds().b(0.0, (double)this.l.fj() * $$1 * 0.1, 0.0));
            }
         } else {
            this.l.z(0.0F);
         }
      }
   }

   static class f extends cap {
      f(cfp $$0, double $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a() {
         if (!this.h()) {
            return false;
         } else {
            ja $$0 = this.a(this.b.dP(), this.b, 7);
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

   static class g extends cch {
      g(cfp $$0, dcd $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a(ja $$0) {
         if (this.a instanceof cfp $$1 && $$1.gv()) {
            return this.b.a_($$0).a(dfh.G);
         }

         return !this.b.a_($$0.d()).i();
      }
   }

   static class h extends cat {
      private final cfp i;

      h(cfp $$0, double $$1, int $$2) {
         super($$0, $$1, $$2);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return !this.b.be() && !this.i.gu() && !this.i.s() ? super.a() : false;
      }
   }

   static class i extends bzw {
      private final cfp a;
      private final double b;
      private boolean c;

      i(cfp $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean a() {
         return !this.a.gu() && !this.a.s() && this.a.be();
      }

      @Override
      public void c() {
         int $$0 = 512;
         int $$1 = 4;
         aym $$2 = this.a.ah;
         int $$3 = $$2.a(1025) - 512;
         int $$4 = $$2.a(9) - 4;
         int $$5 = $$2.a(1025) - 512;
         if ((double)$$4 + this.a.dw() > (double)(this.a.dP().z_() - 1)) {
            $$4 = 0;
         }

         ja $$6 = ja.a((double)$$3 + this.a.du(), (double)$$4 + this.a.dw(), (double)$$5 + this.a.dA());
         this.a.i($$6);
         this.a.z(true);
         this.c = false;
      }

      @Override
      public void e() {
         if (this.a.K().l()) {
            evz $$0 = evz.c(this.a.gt());
            evz $$1 = cdt.a(this.a, 16, 3, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = cdt.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 != null) {
               int $$2 = aye.a($$1.c);
               int $$3 = aye.a($$1.e);
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
         return !this.a.K().l() && !this.c && !this.a.gu() && !this.a.gr() && !this.a.s();
      }

      @Override
      public void d() {
         this.a.z(false);
         super.d();
      }
   }
}
