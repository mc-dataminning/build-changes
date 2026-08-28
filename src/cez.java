import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cez extends cft {
   private static final ajp<ja> d = ajt.a(cez.class, ajr.o);
   private static final ajp<Boolean> e = ajt.a(cez.class, ajr.k);
   private static final ajp<Integer> ca = ajt.a(cez.class, ajr.b);
   static final cds cb = cds.b().a(10.0).d();
   public static final int b = 4800;
   private static final int cc = 2400;
   public static final Predicate<ciu> c = $$0 -> !$$0.y() && $$0.bE() && $$0.bf();

   public cez(bsm<? extends cez> $$0, dcf $$1) {
      super($$0, $$1);
      this.bR = new bze(this, 85, 10, 0.02F, 0.1F, true);
      this.bQ = new bzd(this, 10);
      this.a_(true);
   }

   @Nullable
   @Override
   public btu a(dcu $$0, bqe $$1, btf $$2, @Nullable btu $$3) {
      this.j(this.cl());
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
      this.bU.a(0, new bzk(this));
      this.bU.a(0, new cbj(this));
      this.bU.a(1, new cez.a(this));
      this.bU.a(2, new cez.b(this, 4.0));
      this.bU.a(4, new cax(this, 1.0, 10));
      this.bU.a(4, new cau(this));
      this.bU.a(5, new cah(this, cmk.class, 6.0F));
      this.bU.a(5, new bzp(this, 10));
      this.bU.a(6, new caj(this, 1.2F, true));
      this.bU.a(8, new cez.c());
      this.bU.a(8, new bzu(this));
      this.bU.a(9, new bzg<>(this, cjm.class, 8.0F, 1.0, 1.0));
      this.bV.a(1, new cbr(this, cjm.class).a());
   }

   public static bui.a go() {
      return btd.A().a(buj.s, 10.0).a(buj.v, 1.2F).a(buj.c, 3.0);
   }

   @Override
   protected ccn b(dcf $$0) {
      return new ccp(this, $$0);
   }

   @Override
   public void gh() {
      this.a(avh.gX, 1.0F, 1.0F);
   }

   @Override
   public int cl() {
      return 4800;
   }

   @Override
   protected int n(int $$0) {
      return this.cl();
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
   protected boolean o(bsg $$0) {
      return true;
   }

   @Override
   public boolean f(cuc $$0) {
      bsn $$1 = btd.h($$0);
      return !this.a($$1).e() ? false : $$1 == bsn.a && super.f($$0);
   }

   @Override
   protected void b(ciu $$0) {
      if (this.a(bsn.a).e()) {
         cuc $$1 = $$0.p();
         if (this.j($$1)) {
            this.a($$0);
            this.a(bsn.a, $$1);
            this.f(bsn.a);
            this.a($$0, $$1.H());
            $$0.ap();
         }
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.gd()) {
         this.j(this.cl());
      } else {
         if (this.bh()) {
            this.c(2400);
         } else {
            this.c(this.y() - 1);
            if (this.y() <= 0) {
               this.a(this.dR().s(), 1.0F);
            }

            if (this.aF()) {
               this.i(this.dt().b((double)((this.ah.i() * 2.0F - 1.0F) * 0.2F), 0.5, (double)((this.ah.i() * 2.0F - 1.0F) * 0.2F)));
               this.s(this.ah.i() * 360.0F);
               this.d(false);
               this.av = true;
            }
         }

         if (this.dQ().B && this.bf() && this.dt().g() > 0.03) {
            ewf $$0 = this.g(0.0F);
            float $$1 = ayg.b(this.dG() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = ayg.a(this.dG() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$3 = 1.2F - this.ah.i() * 0.7F;

            for (int $$4 = 0; $$4 < 2; $$4++) {
               this.dQ()
                  .a(lj.as, this.dv() - $$0.c * (double)$$3 + (double)$$1, this.dx() - $$0.d, this.dB() - $$0.e * (double)$$3 + (double)$$2, 0.0, 0.0, 0.0);
               this.dQ()
                  .a(lj.as, this.dv() - $$0.c * (double)$$3 - (double)$$1, this.dx() - $$0.d, this.dB() - $$0.e * (double)$$3 - (double)$$2, 0.0, 0.0, 0.0);
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
         this.dQ().a($$0, this.d(1.0), this.dy() + 0.2, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected bqg b(cmk $$0, bqf $$1) {
      cuc $$2 = $$0.b($$1);
      if (!$$2.e() && $$2.a(awf.aP)) {
         if (!this.dQ().B) {
            this.a(avh.gZ, 1.0F, 1.0F);
         }

         this.w(true);
         $$2.a(1, $$0);
         return bqg.a(this.dQ().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected avg d(bqz $$0) {
      return avh.ha;
   }

   @Nullable
   @Override
   protected avg o_() {
      return avh.gY;
   }

   @Nullable
   @Override
   protected avg v() {
      return this.bf() ? avh.gW : avh.gV;
   }

   @Override
   protected avg aR() {
      return avh.hd;
   }

   @Override
   protected avg aQ() {
      return avh.he;
   }

   protected boolean gp() {
      ja $$0 = this.K().h();
      return $$0 != null ? $$0.a(this.do(), 12.0) : false;
   }

   @Override
   public void a(ewf $$0) {
      if (this.dc() && this.bf()) {
         this.a(this.fk(), $$0);
         this.a(btg.a, this.dt());
         this.i(this.dt().a(0.9));
         if (this.p() == null) {
            this.i(this.dt().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public boolean a(cmk $$0) {
      return true;
   }

   static class a extends bzz {
      private final cez a;
      private boolean b;

      a(cez $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bzz.a.a, bzz.a.b));
      }

      @Override
      public boolean Q_() {
         return false;
      }

      @Override
      public boolean a() {
         return this.a.u() && this.a.cm() >= 100;
      }

      @Override
      public boolean b() {
         ja $$0 = this.a.s();
         return !ja.a((double)$$0.u(), this.a.dx(), (double)$$0.w()).a(this.a.do(), 4.0) && !this.b && this.a.cm() >= 100;
      }

      @Override
      public void c() {
         if (this.a.dQ() instanceof aqm) {
            aqm $$0 = (aqm)this.a.dQ();
            this.b = false;
            this.a.K().n();
            ja $$1 = this.a.dq();
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
         if (ja.a((double)$$0.u(), this.a.dx(), (double)$$0.w()).a(this.a.do(), 4.0) || this.b) {
            this.a.w(false);
         }
      }

      @Override
      public void e() {
         dcf $$0 = this.a.dQ();
         if (this.a.gp() || this.a.K().l()) {
            ewf $$1 = ewf.b(this.a.s());
            ewf $$2 = cdw.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = cdw.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               ja $$3 = ja.a($$2);
               if (!$$0.b_($$3).a(awc.a) || !$$0.a_($$3).a(eow.b)) {
                  $$2 = cdw.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
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

   static class b extends bzz {
      private final cez a;
      private final double b;
      @Nullable
      private cmk c;

      b(cez $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(bzz.a.a, bzz.a.b));
      }

      @Override
      public boolean a() {
         this.c = this.a.dQ().a(cez.cb, this.a);
         return this.c == null ? false : this.c.cd() && this.a.p() != this.c;
      }

      @Override
      public boolean b() {
         return this.c != null && this.c.cd() && this.a.g(this.c) < 256.0;
      }

      @Override
      public void c() {
         this.c.b(new bro(brq.D, 100), this.a);
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

         if (this.c.cd() && this.c.dQ().z.a(6) == 0) {
            this.c.b(new bro(brq.D, 100), this.a);
         }
      }
   }

   class c extends bzz {
      private int b;

      @Override
      public boolean a() {
         if (this.b > cez.this.ai) {
            return false;
         } else {
            List<ciu> $$0 = cez.this.dQ().a(ciu.class, cez.this.cL().c(8.0, 8.0, 8.0), cez.c);
            return !$$0.isEmpty() || !cez.this.a(bsn.a).e();
         }
      }

      @Override
      public void c() {
         List<ciu> $$0 = cez.this.dQ().a(ciu.class, cez.this.cL().c(8.0, 8.0, 8.0), cez.c);
         if (!$$0.isEmpty()) {
            cez.this.K().a($$0.get(0), 1.2F);
            cez.this.a(avh.hc, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void d() {
         cuc $$0 = cez.this.a(bsn.a);
         if (!$$0.e()) {
            this.a($$0);
            cez.this.a(bsn.a, cuc.l);
            this.b = cez.this.ai + cez.this.ah.a(100);
         }
      }

      @Override
      public void e() {
         List<ciu> $$0 = cez.this.dQ().a(ciu.class, cez.this.cL().c(8.0, 8.0, 8.0), cez.c);
         cuc $$1 = cez.this.a(bsn.a);
         if (!$$1.e()) {
            this.a($$1);
            cez.this.a(bsn.a, cuc.l);
         } else if (!$$0.isEmpty()) {
            cez.this.K().a($$0.get(0), 1.2F);
         }
      }

      private void a(cuc $$0) {
         if (!$$0.e()) {
            double $$1 = cez.this.dz() - 0.3F;
            ciu $$2 = new ciu(cez.this.dQ(), cez.this.dv(), $$1, cez.this.dB(), $$0);
            $$2.b(40);
            $$2.b(cez.this);
            float $$3 = 0.3F;
            float $$4 = cez.this.ah.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * cez.this.ah.i();
            $$2.o(
               (double)(0.3F * -ayg.a(cez.this.dG() * (float) (Math.PI / 180.0)) * ayg.b(cez.this.dI() * (float) (Math.PI / 180.0)) + ayg.b($$4) * $$5),
               (double)(0.3F * ayg.a(cez.this.dI() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * ayg.b(cez.this.dG() * (float) (Math.PI / 180.0)) * ayg.b(cez.this.dI() * (float) (Math.PI / 180.0)) + ayg.a($$4) * $$5)
            );
            cez.this.dQ().b($$2);
         }
      }
   }
}
