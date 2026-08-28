import java.util.EnumSet;

public class cjh extends bsp implements cjf {
   private static final ajp<Boolean> b = ajt.a(cjh.class, ajr.k);
   private int c = 1;

   public cjh(bsj<? extends cjh> $$0, dcd $$1) {
      super($$0, $$1);
      this.bP = 5;
      this.bR = new cjh.b(this);
   }

   @Override
   protected void z() {
      this.bU.a(5, new cjh.d(this));
      this.bU.a(7, new cjh.a(this));
      this.bU.a(7, new cjh.c(this));
      this.bV.a(1, new cbp<>(this, cmh.class, 10, true, false, $$0 -> Math.abs($$0.dw() - this.dw()) <= 4.0));
   }

   public boolean s() {
      return this.ao.a(b);
   }

   public void w(boolean $$0) {
      this.ao.a(b, $$0);
   }

   public int u() {
      return this.c;
   }

   @Override
   protected boolean X() {
      return true;
   }

   private static boolean h(bqw $$0) {
      return $$0.c() instanceof cmx && $$0.d() instanceof cmh;
   }

   @Override
   public boolean b(bqw $$0) {
      return this.cu() && !$$0.a(avw.e) || !h($$0) && super.b($$0);
   }

   @Override
   public boolean a(bqw $$0, float $$1) {
      if (h($$0)) {
         super.a($$0, 1000.0F);
         return true;
      } else {
         return this.b($$0) ? false : super.a($$0, $$1);
      }
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   public static buf.a y() {
      return bta.A().a(bug.s, 10.0).a(bug.m, 100.0);
   }

   @Override
   public avg de() {
      return avg.f;
   }

   @Override
   protected ave v() {
      return avf.kk;
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.km;
   }

   @Override
   protected ave o_() {
      return avf.kl;
   }

   @Override
   protected float fa() {
      return 5.0F;
   }

   public static boolean b(bsj<cjh> $$0, dce $$1, btc $$2, ja $$3, aym $$4) {
      return $$1.al() != bqa.a && $$4.a(20) == 0 && a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public int fM() {
      return 1;
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.c);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.c = $$0.f("ExplosionPower");
      }
   }

   static class a extends bzw {
      private final cjh a;

      public a(cjh $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bzw.a.b));
      }

      @Override
      public boolean a() {
         return true;
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         if (this.a.p() == null) {
            evz $$0 = this.a.ds();
            this.a.s(-((float)aye.d($$0.c, $$0.e)) * (180.0F / (float)Math.PI));
            this.a.aY = this.a.dF();
         } else {
            bsy $$1 = this.a.p();
            double $$2 = 64.0;
            if ($$1.g(this.a) < 4096.0) {
               double $$3 = $$1.du() - this.a.du();
               double $$4 = $$1.dA() - this.a.dA();
               this.a.s(-((float)aye.d($$3, $$4)) * (180.0F / (float)Math.PI));
               this.a.aY = this.a.dF();
            }
         }
      }
   }

   static class b extends byz {
      private final cjh l;
      private int m;

      public b(cjh $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == byz.a.b) {
            if (this.m-- <= 0) {
               this.m = this.m + this.l.dS().a(5) + 2;
               evz $$0 = new evz(this.e - this.l.du(), this.f - this.l.dw(), this.g - this.l.dA());
               double $$1 = $$0.f();
               $$0 = $$0.d();
               if (this.a($$0, aye.c($$1))) {
                  this.l.h(this.l.ds().e($$0.a(0.1)));
               } else {
                  this.k = byz.a.a;
               }
            }
         }
      }

      private boolean a(evz $$0, int $$1) {
         evu $$2 = this.l.cK();

         for (int $$3 = 1; $$3 < $$1; $$3++) {
            $$2 = $$2.c($$0);
            if (!this.l.dP().a(this.l, $$2)) {
               return false;
            }
         }

         return true;
      }
   }

   static class c extends bzw {
      private final cjh b;
      public int a;

      public c(cjh $$0) {
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return this.b.p() != null;
      }

      @Override
      public void c() {
         this.a = 0;
      }

      @Override
      public void d() {
         this.b.w(false);
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         bsy $$0 = this.b.p();
         if ($$0 != null) {
            double $$1 = 64.0;
            if ($$0.g(this.b) < 4096.0 && this.b.F($$0)) {
               dcd $$2 = this.b.dP();
               this.a++;
               if (this.a == 10 && !this.b.aW()) {
                  $$2.a(null, 1015, this.b.dp(), 0);
               }

               if (this.a == 20) {
                  double $$3 = 4.0;
                  evz $$4 = this.b.g(1.0F);
                  double $$5 = $$0.du() - (this.b.du() + $$4.c * 4.0);
                  double $$6 = $$0.e(0.5) - (0.5 + this.b.e(0.5));
                  double $$7 = $$0.dA() - (this.b.dA() + $$4.e * 4.0);
                  if (!this.b.aW()) {
                     $$2.a(null, 1016, this.b.dp(), 0);
                  }

                  cmx $$8 = new cmx($$2, this.b, $$5, $$6, $$7, this.b.u());
                  $$8.a_(this.b.du() + $$4.c * 4.0, this.b.e(0.5) + 0.5, $$8.dA() + $$4.e * 4.0);
                  $$2.b($$8);
                  this.a = -40;
               }
            } else if (this.a > 0) {
               this.a--;
            }

            this.b.w(this.a > 10);
         }
      }
   }

   static class d extends bzw {
      private final cjh a;

      public d(cjh $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bzw.a.a));
      }

      @Override
      public boolean a() {
         byz $$0 = this.a.H();
         if (!$$0.b()) {
            return true;
         } else {
            double $$1 = $$0.d() - this.a.du();
            double $$2 = $$0.e() - this.a.dw();
            double $$3 = $$0.f() - this.a.dA();
            double $$4 = $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
            return $$4 < 1.0 || $$4 > 3600.0;
         }
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void c() {
         aym $$0 = this.a.dS();
         double $$1 = this.a.du() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$2 = this.a.dw() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$3 = this.a.dA() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         this.a.H().a($$1, $$2, $$3, 1.0);
      }
   }
}
