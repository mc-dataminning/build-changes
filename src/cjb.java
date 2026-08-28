import java.util.EnumSet;
import javax.annotation.Nullable;

public class cjb extends ckg implements cjr {
   public static final float b = 0.03F;
   boolean cd;
   protected final ccm c;
   protected final ccj d;

   public cjb(bsj<? extends cjb> $$0, dcd $$1) {
      super($$0, $$1);
      this.bR = new cjb.d(this);
      this.a(eos.j, 0.0F);
      this.c = new ccm(this, $$1);
      this.d = new ccj(this, $$1);
   }

   public static buf.a s() {
      return ckg.gr().a(bug.B, 1.0);
   }

   @Override
   protected void u() {
      this.bU.a(1, new cjb.c(this, 1.0));
      this.bU.a(2, new cjb.f(this, 1.0, 40, 10.0F));
      this.bU.a(2, new cjb.a(this, 1.0, false));
      this.bU.a(5, new cjb.b(this, 1.0));
      this.bU.a(6, new cjb.e(this, 1.0, this.dP().z_()));
      this.bU.a(7, new cat(this, 1.0));
      this.bV.a(1, new cbo(this, cjb.class).a(cki.class));
      this.bV.a(2, new cbp<>(this, cmh.class, 10, true, false, this::j));
      this.bV.a(3, new cbp<>(this, clp.class, false));
      this.bV.a(3, new cbp<>(this, cfa.class, true));
      this.bV.a(3, new cbp<>(this, cga.class, true, false));
      this.bV.a(5, new cbp<>(this, cfp.class, 10, true, false, cfp.ca));
   }

   @Override
   public btr a(dcs $$0, bqb $$1, btc $$2, @Nullable btr $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      if (this.a(bsk.b).e() && $$0.E_().i() < 0.03F) {
         this.a(bsk.b, new cua(cud.vU));
         this.f(bsk.b);
      }

      return $$3;
   }

   public static boolean a(bsj<cjb> $$0, dcs $$1, btc $$2, ja $$3, aym $$4) {
      if (!$$1.b_($$3.d()).a(awa.a) && !btc.a($$2)) {
         return false;
      } else {
         jj<ddd> $$5 = $$1.t($$3);
         boolean $$6 = $$1.al() != bqa.a && (btc.b($$2) || a($$1, $$3, $$4)) && (btc.a($$2) || $$1.b_($$3).a(awa.a));
         if ($$6 && btc.a($$2)) {
            return true;
         } else {
            return $$5.a(avt.ap) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
         }
      }
   }

   private static boolean a(dce $$0, ja $$1) {
      return $$1.v() < $$0.z_() - 5;
   }

   @Override
   protected boolean y() {
      return false;
   }

   @Override
   protected ave v() {
      return this.be() ? avf.hE : avf.hD;
   }

   @Override
   protected ave d(bqw $$0) {
      return this.be() ? avf.hI : avf.hH;
   }

   @Override
   protected ave o_() {
      return this.be() ? avf.hG : avf.hF;
   }

   @Override
   protected ave gn() {
      return avf.hK;
   }

   @Override
   protected ave aP() {
      return avf.hL;
   }

   @Override
   protected cua go() {
      return cua.l;
   }

   @Override
   protected void a(aym $$0, bqb $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(bsk.a, new cua(cud.vS));
         } else {
            this.a(bsk.a, new cua(cud.qV));
         }
      }
   }

   @Override
   protected boolean b(cua $$0, cua $$1) {
      if ($$1.a(cud.vU)) {
         return false;
      } else if ($$1.a(cud.vS)) {
         return $$0.a(cud.vS) ? $$0.n() < $$1.n() : false;
      } else {
         return $$0.a(cud.vS) ? true : super.b($$0, $$1);
      }
   }

   @Override
   protected boolean gp() {
      return false;
   }

   @Override
   public boolean a(dcg $$0) {
      return $$0.f(this);
   }

   public boolean j(@Nullable bsy $$0) {
      return $$0 != null ? !this.dP().R() || $$0.be() : false;
   }

   @Override
   public boolean cC() {
      return !this.cc();
   }

   boolean gx() {
      if (this.cd) {
         return true;
      } else {
         bsy $$0 = this.p();
         return $$0 != null && $$0.be();
      }
   }

   @Override
   public void a(evz $$0) {
      if (this.da() && this.be() && this.gx()) {
         this.a(0.01F, $$0);
         this.a(btd.a, this.ds());
         this.h(this.ds().a(0.9));
      } else {
         super.a($$0);
      }
   }

   @Override
   public void bk() {
      if (!this.dP().B) {
         if (this.db() && this.be() && this.gx()) {
            this.bT = this.c;
            this.i(true);
         } else {
            this.bT = this.d;
            this.i(false);
         }
      }
   }

   @Override
   public boolean cd() {
      return this.cc();
   }

   protected boolean gq() {
      eop $$0 = this.K().j();
      if ($$0 != null) {
         ja $$1 = $$0.l();
         if ($$1 != null) {
            double $$2 = this.i((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            if ($$2 < 4.0) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public void a(bsy $$0, float $$1) {
      cnm $$2 = new cnm(this.dP(), this, new cua(cud.vS));
      double $$3 = $$0.du() - this.du();
      double $$4 = $$0.e(0.3333333333333333) - $$2.dw();
      double $$5 = $$0.dA() - this.dA();
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      $$2.c($$3, $$4 + $$6 * 0.2F, $$5, 1.6F, (float)(14 - this.dP().al().a() * 4));
      this.a(avf.hJ, 1.0F, 1.0F / (this.dS().i() * 0.4F + 0.8F));
      this.dP().b($$2);
   }

   public void w(boolean $$0) {
      this.cd = $$0;
   }

   static class a extends cbl {
      private final cjb b;

      public a(cjb $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.b.j(this.b.p());
      }

      @Override
      public boolean b() {
         return super.b() && this.b.j(this.b.p());
      }
   }

   static class b extends caj {
      private final cjb g;

      public b(cjb $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && !this.g.dP().R() && this.g.be() && this.g.dw() >= (double)(this.g.dP().z_() - 3);
      }

      @Override
      public boolean b() {
         return super.b();
      }

      @Override
      protected boolean a(dcg $$0, ja $$1) {
         ja $$2 = $$1.c();
         return $$0.u($$2) && $$0.u($$2.c()) ? $$0.a_($$1).a($$0, $$1, this.g) : false;
      }

      @Override
      public void c() {
         this.g.w(false);
         this.g.bT = this.g.d;
         super.c();
      }

      @Override
      public void d() {
         super.d();
      }
   }

   static class c extends bzw {
      private final bth a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final dcd f;

      public c(bth $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dP();
         this.a(EnumSet.of(bzw.a.a));
      }

      @Override
      public boolean a() {
         if (!this.f.R()) {
            return false;
         } else if (this.a.be()) {
            return false;
         } else {
            evz $$0 = this.h();
            if ($$0 == null) {
               return false;
            } else {
               this.b = $$0.c;
               this.c = $$0.d;
               this.d = $$0.e;
               return true;
            }
         }
      }

      @Override
      public boolean b() {
         return !this.a.K().l();
      }

      @Override
      public void c() {
         this.a.K().a(this.b, this.c, this.d, this.e);
      }

      @Nullable
      private evz h() {
         aym $$0 = this.a.dS();
         ja $$1 = this.a.dp();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            ja $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(dfh.G)) {
               return evz.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends byz {
      private final cjb l;

      public d(cjb $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         bsy $$0 = this.l.p();
         if (this.l.gx() && this.l.be()) {
            if ($$0 != null && $$0.dw() > this.l.dw() || this.l.cd) {
               this.l.h(this.l.ds().b(0.0, 0.002, 0.0));
            }

            if (this.k != byz.a.b || this.l.K().l()) {
               this.l.z(0.0F);
               return;
            }

            double $$1 = this.e - this.l.du();
            double $$2 = this.f - this.l.dw();
            double $$3 = this.g - this.l.dA();
            double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
            $$2 /= $$4;
            float $$5 = (float)(aye.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.s(this.a(this.l.dF(), $$5, 90.0F));
            this.l.aY = this.l.dF();
            float $$6 = (float)(this.h * this.l.g(bug.v));
            float $$7 = aye.i(0.125F, this.l.fj(), $$6);
            this.l.z($$7);
            this.l.h(this.l.ds().b((double)$$7 * $$1 * 0.005, (double)$$7 * $$2 * 0.1, (double)$$7 * $$3 * 0.005));
         } else {
            if (!this.l.aE()) {
               this.l.h(this.l.ds().b(0.0, -0.008, 0.0));
            }

            super.a();
         }
      }
   }

   static class e extends bzw {
      private final cjb a;
      private final double b;
      private final int c;
      private boolean d;

      public e(cjb $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean a() {
         return !this.a.dP().R() && this.a.be() && this.a.dw() < (double)(this.c - 2);
      }

      @Override
      public boolean b() {
         return this.a() && !this.d;
      }

      @Override
      public void e() {
         if (this.a.dw() < (double)(this.c - 1) && (this.a.K().l() || this.a.gq())) {
            evz $$0 = cdt.a(this.a, 4, 8, new evz(this.a.du(), (double)(this.c - 1), this.a.dA()), (float) (Math.PI / 2));
            if ($$0 == null) {
               this.d = true;
               return;
            }

            this.a.K().a($$0.c, $$0.d, $$0.e, this.b);
         }
      }

      @Override
      public void c() {
         this.a.w(true);
         this.d = false;
      }

      @Override
      public void d() {
         this.a.w(false);
      }
   }

   static class f extends cav {
      private final cjb a;

      public f(cjr $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (cjb)$$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.a.eT().a(cud.vS);
      }

      @Override
      public void c() {
         super.c();
         this.a.v(true);
         this.a.c(bqc.a);
      }

      @Override
      public void d() {
         super.d();
         this.a.fx();
         this.a.v(false);
      }
   }
}
