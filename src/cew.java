import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cew extends cfq {
   private static final ajp<ja> d = ajt.a(cew.class, ajr.o);
   private static final ajp<Boolean> e = ajt.a(cew.class, ajr.k);
   private static final ajp<Integer> ca = ajt.a(cew.class, ajr.b);
   static final cdp cb = cdp.b().a(10.0).d();
   public static final int b = 4800;
   private static final int cc = 2400;
   public static final Predicate<cir> c = $$0 -> !$$0.y() && $$0.bD() && $$0.be();

   public cew(bsj<? extends cew> $$0, dcd $$1) {
      super($$0, $$1);
      this.bR = new bzb(this, 85, 10, 0.02F, 0.1F, true);
      this.bQ = new bza(this, 10);
      this.a_(true);
   }

   @Nullable
   @Override
   public btr a(dcs $$0, bqb $$1, btc $$2, @Nullable btr $$3) {
      this.j(this.ck());
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

   public boolean u() {
      return this.ao.a(e);
   }

   public void w(boolean $$0) {
      this.ao.a(e, $$0);
   }

   public int y() {
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
      $$0.a("GotFish", this.u());
      $$0.a("Moistness", this.y());
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
      this.bU.a(0, new bzh(this));
      this.bU.a(0, new cbg(this));
      this.bU.a(1, new cew.a(this));
      this.bU.a(2, new cew.b(this, 4.0));
      this.bU.a(4, new cau(this, 1.0, 10));
      this.bU.a(4, new car(this));
      this.bU.a(5, new cae(this, cmh.class, 6.0F));
      this.bU.a(5, new bzm(this, 10));
      this.bU.a(6, new cag(this, 1.2F, true));
      this.bU.a(8, new cew.c());
      this.bU.a(8, new bzr(this));
      this.bU.a(9, new bzd<>(this, cjj.class, 8.0F, 1.0, 1.0));
      this.bV.a(1, new cbo(this, cjj.class).a());
   }

   public static buf.a gn() {
      return bta.A().a(bug.s, 10.0).a(bug.v, 1.2F).a(bug.c, 3.0);
   }

   @Override
   protected cck b(dcd $$0) {
      return new ccm(this, $$0);
   }

   @Override
   public void gg() {
      this.a(avf.gX, 1.0F, 1.0F);
   }

   @Override
   public int ck() {
      return 4800;
   }

   @Override
   protected int n(int $$0) {
      return this.ck();
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
   protected boolean o(bsd $$0) {
      return true;
   }

   @Override
   public boolean f(cua $$0) {
      bsk $$1 = bta.h($$0);
      return !this.a($$1).e() ? false : $$1 == bsk.a && super.f($$0);
   }

   @Override
   protected void b(cir $$0) {
      if (this.a(bsk.a).e()) {
         cua $$1 = $$0.p();
         if (this.j($$1)) {
            this.a($$0);
            this.a(bsk.a, $$1);
            this.f(bsk.a);
            this.a($$0, $$1.H());
            $$0.ao();
         }
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.gc()) {
         this.j(this.ck());
      } else {
         if (this.bg()) {
            this.c(2400);
         } else {
            this.c(this.y() - 1);
            if (this.y() <= 0) {
               this.a(this.dQ().s(), 1.0F);
            }

            if (this.aE()) {
               this.h(this.ds().b((double)((this.ah.i() * 2.0F - 1.0F) * 0.2F), 0.5, (double)((this.ah.i() * 2.0F - 1.0F) * 0.2F)));
               this.s(this.ah.i() * 360.0F);
               this.d(false);
               this.av = true;
            }
         }

         if (this.dP().B && this.be() && this.ds().g() > 0.03) {
            evz $$0 = this.g(0.0F);
            float $$1 = aye.b(this.dF() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = aye.a(this.dF() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$3 = 1.2F - this.ah.i() * 0.7F;

            for (int $$4 = 0; $$4 < 2; $$4++) {
               this.dP()
                  .a(lj.as, this.du() - $$0.c * (double)$$3 + (double)$$1, this.dw() - $$0.d, this.dA() - $$0.e * (double)$$3 + (double)$$2, 0.0, 0.0, 0.0);
               this.dP()
                  .a(lj.as, this.du() - $$0.c * (double)$$3 - (double)$$1, this.dw() - $$0.d, this.dA() - $$0.e * (double)$$3 - (double)$$2, 0.0, 0.0, 0.0);
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
         this.dP().a($$0, this.d(1.0), this.dx() + 0.2, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected bqd b(cmh $$0, bqc $$1) {
      cua $$2 = $$0.b($$1);
      if (!$$2.e() && $$2.a(awd.aP)) {
         if (!this.dP().B) {
            this.a(avf.gZ, 1.0F, 1.0F);
         }

         this.w(true);
         $$2.a(1, $$0);
         return bqd.a(this.dP().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.ha;
   }

   @Nullable
   @Override
   protected ave o_() {
      return avf.gY;
   }

   @Nullable
   @Override
   protected ave v() {
      return this.be() ? avf.gW : avf.gV;
   }

   @Override
   protected ave aQ() {
      return avf.hd;
   }

   @Override
   protected ave aP() {
      return avf.he;
   }

   protected boolean go() {
      ja $$0 = this.K().h();
      return $$0 != null ? $$0.a(this.dn(), 12.0) : false;
   }

   @Override
   public void a(evz $$0) {
      if (this.db() && this.be()) {
         this.a(this.fj(), $$0);
         this.a(btd.a, this.ds());
         this.h(this.ds().a(0.9));
         if (this.p() == null) {
            this.h(this.ds().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public boolean a(cmh $$0) {
      return true;
   }

   static class a extends bzw {
      private final cew a;
      private boolean b;

      a(cew $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bzw.a.a, bzw.a.b));
      }

      @Override
      public boolean Q_() {
         return false;
      }

      @Override
      public boolean a() {
         return this.a.u() && this.a.cl() >= 100;
      }

      @Override
      public boolean b() {
         ja $$0 = this.a.s();
         return !ja.a((double)$$0.u(), this.a.dw(), (double)$$0.w()).a(this.a.dn(), 4.0) && !this.b && this.a.cl() >= 100;
      }

      @Override
      public void c() {
         if (this.a.dP() instanceof aqk) {
            aqk $$0 = (aqk)this.a.dP();
            this.b = false;
            this.a.K().n();
            ja $$1 = this.a.dp();
            ja $$2 = $$0.a(awg.b, $$1, 50, false);
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
         if (ja.a((double)$$0.u(), this.a.dw(), (double)$$0.w()).a(this.a.dn(), 4.0) || this.b) {
            this.a.w(false);
         }
      }

      @Override
      public void e() {
         dcd $$0 = this.a.dP();
         if (this.a.go() || this.a.K().l()) {
            evz $$1 = evz.b(this.a.s());
            evz $$2 = cdt.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = cdt.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               ja $$3 = ja.a($$2);
               if (!$$0.b_($$3).a(awa.a) || !$$0.a_($$3).a(eoq.b)) {
                  $$2 = cdt.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
               }
            }

            if ($$2 == null) {
               this.b = true;
               return;
            }

            this.a.G().a($$2.c, $$2.d, $$2.e, (float)(this.a.ab() + 20), (float)this.a.aa());
            this.a.K().a($$2.c, $$2.d, $$2.e, 1.3);
            if ($$0.z.a(this.a(80)) == 0) {
               $$0.a(this.a, (byte)38);
            }
         }
      }
   }

   static class b extends bzw {
      private final cew a;
      private final double b;
      @Nullable
      private cmh c;

      b(cew $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(bzw.a.a, bzw.a.b));
      }

      @Override
      public boolean a() {
         this.c = this.a.dP().a(cew.cb, this.a);
         return this.c == null ? false : this.c.cc() && this.a.p() != this.c;
      }

      @Override
      public boolean b() {
         return this.c != null && this.c.cc() && this.a.g(this.c) < 256.0;
      }

      @Override
      public void c() {
         this.c.b(new brl(brn.D, 100), this.a);
      }

      @Override
      public void d() {
         this.c = null;
         this.a.K().n();
      }

      @Override
      public void e() {
         this.a.G().a(this.c, (float)(this.a.ab() + 20), (float)this.a.aa());
         if (this.a.g(this.c) < 6.25) {
            this.a.K().n();
         } else {
            this.a.K().a(this.c, this.b);
         }

         if (this.c.cc() && this.c.dP().z.a(6) == 0) {
            this.c.b(new brl(brn.D, 100), this.a);
         }
      }
   }

   class c extends bzw {
      private int b;

      @Override
      public boolean a() {
         if (this.b > cew.this.ai) {
            return false;
         } else {
            List<cir> $$0 = cew.this.dP().a(cir.class, cew.this.cK().c(8.0, 8.0, 8.0), cew.c);
            return !$$0.isEmpty() || !cew.this.a(bsk.a).e();
         }
      }

      @Override
      public void c() {
         List<cir> $$0 = cew.this.dP().a(cir.class, cew.this.cK().c(8.0, 8.0, 8.0), cew.c);
         if (!$$0.isEmpty()) {
            cew.this.K().a($$0.get(0), 1.2F);
            cew.this.a(avf.hc, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void d() {
         cua $$0 = cew.this.a(bsk.a);
         if (!$$0.e()) {
            this.a($$0);
            cew.this.a(bsk.a, cua.l);
            this.b = cew.this.ai + cew.this.ah.a(100);
         }
      }

      @Override
      public void e() {
         List<cir> $$0 = cew.this.dP().a(cir.class, cew.this.cK().c(8.0, 8.0, 8.0), cew.c);
         cua $$1 = cew.this.a(bsk.a);
         if (!$$1.e()) {
            this.a($$1);
            cew.this.a(bsk.a, cua.l);
         } else if (!$$0.isEmpty()) {
            cew.this.K().a($$0.get(0), 1.2F);
         }
      }

      private void a(cua $$0) {
         if (!$$0.e()) {
            double $$1 = cew.this.dy() - 0.3F;
            cir $$2 = new cir(cew.this.dP(), cew.this.du(), $$1, cew.this.dA(), $$0);
            $$2.b(40);
            $$2.b(cew.this);
            float $$3 = 0.3F;
            float $$4 = cew.this.ah.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * cew.this.ah.i();
            $$2.o(
               (double)(0.3F * -aye.a(cew.this.dF() * (float) (Math.PI / 180.0)) * aye.b(cew.this.dH() * (float) (Math.PI / 180.0)) + aye.b($$4) * $$5),
               (double)(0.3F * aye.a(cew.this.dH() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * aye.b(cew.this.dF() * (float) (Math.PI / 180.0)) * aye.b(cew.this.dH() * (float) (Math.PI / 180.0)) + aye.a($$4) * $$5)
            );
            cew.this.dP().b($$2);
         }
      }
   }
}
