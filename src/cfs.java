import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfs extends cer {
   private static final ajp<ja> cb = ajt.a(cfs.class, ajr.o);
   private static final ajp<Boolean> cd = ajt.a(cfs.class, ajr.k);
   private static final ajp<Boolean> ce = ajt.a(cfs.class, ajr.k);
   private static final ajp<ja> cf = ajt.a(cfs.class, ajr.o);
   private static final ajp<Boolean> cg = ajt.a(cfs.class, ajr.k);
   private static final ajp<Boolean> ch = ajt.a(cfs.class, ajr.k);
   private static final float ci = 0.3F;
   private static final bsj cj = bsm.bh.n().a(bsi.a().a(bsh.a, 0.0F, bsm.bh.m(), -0.25F)).a(0.3F);
   int ck;
   public static final Predicate<btb> ca = $$0 -> $$0.p_() && !$$0.bf();

   public cfs(bsm<? extends cfs> $$0, dcf $$1) {
      super($$0, $$1);
      this.a(eoy.j, 0.0F);
      this.a(eoy.t, -1.0F);
      this.a(eoy.s, -1.0F);
      this.a(eoy.r, -1.0F);
      this.bR = new cfs.e(this);
   }

   public void h(ja $$0) {
      this.ao.a(cb, $$0);
   }

   ja go() {
      return this.ao.a(cb);
   }

   void i(ja $$0) {
      this.ao.a(cf, $$0);
   }

   ja gu() {
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

   boolean gv() {
      return this.ao.a(cg);
   }

   void y(boolean $$0) {
      this.ao.a(cg, $$0);
   }

   boolean gw() {
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
      $$0.a("HomePosX", this.go().u());
      $$0.a("HomePosY", this.go().v());
      $$0.a("HomePosZ", this.go().w());
      $$0.a("HasEgg", this.s());
      $$0.a("TravelPosX", this.gu().u());
      $$0.a("TravelPosY", this.gu().v());
      $$0.a("TravelPosZ", this.gu().w());
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
   public btu a(dcu $$0, bqe $$1, btf $$2, @Nullable btu $$3) {
      this.h(this.dq());
      this.i(ja.c);
      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean c(bsm<cfs> $$0, dcg $$1, btf $$2, ja $$3, ayo $$4) {
      return $$3.v() < $$1.z_() + 4 && dnz.a($$1, $$3) && a($$1, $$3);
   }

   @Override
   protected void z() {
      this.bU.a(0, new cfs.f(this, 1.2));
      this.bU.a(1, new cfs.a(this, 1.0));
      this.bU.a(1, new cfs.d(this, 1.0));
      this.bU.a(2, new cbh(this, 1.1, $$0 -> $$0.a(awf.av), false));
      this.bU.a(3, new cfs.c(this, 1.0));
      this.bU.a(4, new cfs.b(this, 1.0));
      this.bU.a(7, new cfs.i(this, 1.0));
      this.bU.a(8, new cah(this, cmk.class, 8.0F));
      this.bU.a(9, new cfs.h(this, 1.0, 100));
   }

   public static bui.a y() {
      return btd.A().a(buj.s, 30.0).a(buj.v, 0.25).a(buj.B, 1.0);
   }

   @Override
   public boolean cD() {
      return false;
   }

   @Override
   public int P() {
      return 200;
   }

   @Nullable
   @Override
   protected avg v() {
      return !this.bf() && this.aF() && !this.p_() ? avh.Af : super.v();
   }

   @Override
   protected void f(float $$0) {
      super.f($$0 * 1.5F);
   }

   @Override
   protected avg aQ() {
      return avh.Aq;
   }

   @Nullable
   @Override
   protected avg d(bqz $$0) {
      return this.p_() ? avh.Am : avh.Al;
   }

   @Nullable
   @Override
   protected avg o_() {
      return this.p_() ? avh.Ah : avh.Ag;
   }

   @Override
   protected void b(ja $$0, dsk $$1) {
      avg $$2 = this.p_() ? avh.Ap : avh.Ao;
      this.a($$2, 0.15F, 1.0F);
   }

   @Override
   public boolean gp() {
      return super.gp() && !this.s();
   }

   @Override
   protected float aP() {
      return this.aa + 0.15F;
   }

   @Override
   public float eb() {
      return this.p_() ? 0.3F : 1.0F;
   }

   @Override
   protected ccn b(dcf $$0) {
      return new cfs.g(this, $$0);
   }

   @Nullable
   @Override
   public bsa a(aqm $$0, bsa $$1) {
      return bsm.bh.a((dcf)$$0);
   }

   @Override
   public boolean o(cuc $$0) {
      return $$0.a(awf.av);
   }

   @Override
   public float a(ja $$0, dci $$1) {
      if (!this.gv() && $$1.b_($$0).a(awc.a)) {
         return 10.0F;
      } else {
         return dnz.a($$1, $$0) ? 10.0F : $$1.w($$0);
      }
   }

   @Override
   public void n_() {
      super.n_();
      if (this.bE() && this.u() && this.ck >= 1 && this.ck % 5 == 0) {
         ja $$0 = this.dq();
         if (dnz.a(this.dQ(), $$0)) {
            this.dQ().c(2001, $$0, dfh.i(this.dQ().a_($$0.d())));
            this.a(dxg.u);
         }
      }
   }

   @Override
   protected void k() {
      super.k();
      if (!this.p_() && this.dQ().ab().b(dcb.f)) {
         this.a(cuf.op, 1);
      }
   }

   @Override
   public void a(ewf $$0) {
      if (this.db() && this.bf()) {
         this.a(0.1F, $$0);
         this.a(btg.a, this.dt());
         this.i(this.dt().a(0.9));
         if (this.p() == null && (!this.gv() || !this.go().a(this.do(), 20.0))) {
            this.i(this.dt().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public boolean a(cmk $$0) {
      return false;
   }

   @Override
   public void a(aqm $$0, bta $$1) {
      this.a(this.dR().c(), Float.MAX_VALUE);
   }

   @Override
   public bsj e(btn $$0) {
      return this.p_() ? cj : super.e($$0);
   }

   static class a extends bzl {
      private final cfs d;

      a(cfs $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && !this.d.s();
      }

      @Override
      protected void g() {
         aqn $$0 = this.a.gr();
         if ($$0 == null && this.c.gr() != null) {
            $$0 = this.c.gr();
         }

         if ($$0 != null) {
            $$0.a(avr.P);
            am.p.a($$0, this.a, this.c, null);
         }

         this.d.w(true);
         this.a.c_(6000);
         this.c.c_(6000);
         this.a.gt();
         this.c.gt();
         ayo $$1 = this.a.dT();
         if (this.b.ab().b(dcb.f)) {
            this.b.b(new bsr(this.b, this.a.dv(), this.a.dx(), this.a.dB(), $$1.a(7) + 1));
         }
      }
   }

   static class b extends bzz {
      private final cfs a;
      private final double b;
      private boolean c;
      private int d;
      private static final int e = 600;

      b(cfs $$0, double $$1) {
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
            return this.a.dT().a(b(700)) != 0 ? false : !this.a.go().a(this.a.do(), 64.0);
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
         return !this.a.go().a(this.a.do(), 7.0) && !this.c && this.d <= this.a(600);
      }

      @Override
      public void e() {
         ja $$0 = this.a.go();
         boolean $$1 = $$0.a(this.a.do(), 16.0);
         if ($$1) {
            this.d++;
         }

         if (this.a.K().l()) {
            ewf $$2 = ewf.c($$0);
            ewf $$3 = cdw.a(this.a, 16, 3, $$2, (float) (Math.PI / 10));
            if ($$3 == null) {
               $$3 = cdw.a(this.a, 8, 7, $$2, (float) (Math.PI / 2));
            }

            if ($$3 != null && !$$1 && !this.a.dQ().a_(ja.a($$3)).a(dfj.G)) {
               $$3 = cdw.a(this.a, 16, 5, $$2, (float) (Math.PI / 2));
            }

            if ($$3 == null) {
               this.c = true;
               return;
            }

            this.a.K().a($$3.c, $$3.d, $$3.e, this.b);
         }
      }
   }

   static class c extends cam {
      private static final int g = 1200;
      private final cfs h;

      c(cfs $$0, double $$1) {
         super($$0, $$0.p_() ? 2.0 : $$1, 24);
         this.h = $$0;
         this.f = -1;
      }

      @Override
      public boolean b() {
         return !this.h.bf() && this.d <= 1200 && this.a(this.h.dQ(), this.e);
      }

      @Override
      public boolean a() {
         if (this.h.p_() && !this.h.bf()) {
            return super.a();
         } else {
            return !this.h.gv() && !this.h.bf() && !this.h.s() ? super.a() : false;
         }
      }

      @Override
      public boolean l() {
         return this.d % 160 == 0;
      }

      @Override
      protected boolean a(dci $$0, ja $$1) {
         return $$0.a_($$1).a(dfj.G);
      }
   }

   static class d extends cam {
      private final cfs g;

      d(cfs $$0, double $$1) {
         super($$0, $$1, 16);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         return this.g.s() && this.g.go().a(this.g.do(), 9.0) ? super.a() : false;
      }

      @Override
      public boolean b() {
         return super.b() && this.g.s() && this.g.go().a(this.g.do(), 9.0);
      }

      @Override
      public void e() {
         super.e();
         ja $$0 = this.g.dq();
         if (!this.g.bf() && this.m()) {
            if (this.g.ck < 1) {
               this.g.x(true);
            } else if (this.g.ck > this.a(200)) {
               dcf $$1 = this.g.dQ();
               $$1.a(null, $$0, avh.An, avi.e, 0.3F, 0.9F + $$1.z.i() * 0.2F);
               ja $$2 = this.e.c();
               dsk $$3 = dfj.mf.o().a(dnz.f, Integer.valueOf(this.g.ah.a(4) + 1));
               $$1.a($$2, $$3, 3);
               $$1.a(dxg.i, $$2, dxg.a.a(this.g, $$3));
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
      protected boolean a(dci $$0, ja $$1) {
         return !$$0.u($$1.c()) ? false : dnz.b($$0, $$1);
      }
   }

   static class e extends bzc {
      private final cfs l;

      e(cfs $$0) {
         super($$0);
         this.l = $$0;
      }

      private void g() {
         if (this.l.bf()) {
            this.l.i(this.l.dt().b(0.0, 0.005, 0.0));
            if (!this.l.go().a(this.l.do(), 16.0)) {
               this.l.z(Math.max(this.l.fk() / 2.0F, 0.08F));
            }

            if (this.l.p_()) {
               this.l.z(Math.max(this.l.fk() / 3.0F, 0.06F));
            }
         } else if (this.l.aF()) {
            this.l.z(Math.max(this.l.fk() / 2.0F, 0.06F));
         }
      }

      @Override
      public void a() {
         this.g();
         if (this.k == bzc.a.b && !this.l.K().l()) {
            double $$0 = this.e - this.l.dv();
            double $$1 = this.f - this.l.dx();
            double $$2 = this.g - this.l.dB();
            double $$3 = Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
            if ($$3 < 1.0E-5F) {
               this.d.z(0.0F);
            } else {
               $$1 /= $$3;
               float $$4 = (float)(ayg.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.s(this.a(this.l.dG(), $$4, 90.0F));
               this.l.aY = this.l.dG();
               float $$5 = (float)(this.h * this.l.g(buj.v));
               this.l.z(ayg.i(0.125F, this.l.fk(), $$5));
               this.l.i(this.l.dt().b(0.0, (double)this.l.fk() * $$1 * 0.1, 0.0));
            }
         } else {
            this.l.z(0.0F);
         }
      }
   }

   static class f extends cas {
      f(cfs $$0, double $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a() {
         if (!this.h()) {
            return false;
         } else {
            ja $$0 = this.a(this.b.dQ(), this.b, 7);
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

   static class g extends cck {
      g(cfs $$0, dcf $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a(ja $$0) {
         if (this.a instanceof cfs $$1 && $$1.gw()) {
            return this.b.a_($$0).a(dfj.G);
         }

         return !this.b.a_($$0.d()).i();
      }
   }

   static class h extends caw {
      private final cfs i;

      h(cfs $$0, double $$1, int $$2) {
         super($$0, $$1, $$2);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return !this.b.bf() && !this.i.gv() && !this.i.s() ? super.a() : false;
      }
   }

   static class i extends bzz {
      private final cfs a;
      private final double b;
      private boolean c;

      i(cfs $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean a() {
         return !this.a.gv() && !this.a.s() && this.a.bf();
      }

      @Override
      public void c() {
         int $$0 = 512;
         int $$1 = 4;
         ayo $$2 = this.a.ah;
         int $$3 = $$2.a(1025) - 512;
         int $$4 = $$2.a(9) - 4;
         int $$5 = $$2.a(1025) - 512;
         if ((double)$$4 + this.a.dx() > (double)(this.a.dQ().z_() - 1)) {
            $$4 = 0;
         }

         ja $$6 = ja.a((double)$$3 + this.a.dv(), (double)$$4 + this.a.dx(), (double)$$5 + this.a.dB());
         this.a.i($$6);
         this.a.z(true);
         this.c = false;
      }

      @Override
      public void e() {
         if (this.a.K().l()) {
            ewf $$0 = ewf.c(this.a.gu());
            ewf $$1 = cdw.a(this.a, 16, 3, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = cdw.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 != null) {
               int $$2 = ayg.a($$1.c);
               int $$3 = ayg.a($$1.e);
               int $$4 = 34;
               if (!this.a.dQ().b($$2 - 34, $$3 - 34, $$2 + 34, $$3 + 34)) {
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
         return !this.a.K().l() && !this.c && !this.a.gv() && !this.a.gs() && !this.a.s();
      }

      @Override
      public void d() {
         this.a.z(false);
         super.d();
      }
   }
}
