import com.mojang.serialization.Codec;
import java.util.UUID;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cfl extends cer implements bub<cfl.g> {
   public static final double ca = 0.6;
   public static final double cb = 0.8;
   public static final double cd = 1.0;
   public static final double ce = 2.2;
   public static final double cf = 1.4;
   private static final ajp<Integer> cg = ajt.a(cfl.class, ajr.b);
   private static final akk ch = new akk("killer_bunny");
   private static final int ci = 3;
   private static final int cj = 5;
   private static final UUID ck = UUID.fromString("6555be74-63b3-41f1-a245-77833b3c2562");
   private static final int cl = 8;
   private static final int cm = 40;
   private int cn;
   private int co;
   private boolean cp;
   private int cq;
   int cr;

   public cfl(bsm<? extends cfl> $$0, dcf $$1) {
      super($$0, $$1);
      this.bS = new cfl.c(this);
      this.bR = new cfl.d(this);
      this.i(0.0);
   }

   @Override
   protected void z() {
      this.bU.a(1, new bzt(this));
      this.bU.a(1, new bzo(this, this.dQ()));
      this.bU.a(1, new cfl.e(this, 2.2));
      this.bU.a(2, new bzl(this, 0.8));
      this.bU.a(3, new cbh(this, 1.0, $$0 -> $$0.a(awf.as), false));
      this.bU.a(4, new cfl.a<>(this, cmk.class, 8.0F, 2.2, 2.2));
      this.bU.a(4, new cfl.a<>(this, cfu.class, 10.0F, 2.2, 2.2));
      this.bU.a(4, new cfl.a<>(this, cjq.class, 4.0F, 2.2, 2.2));
      this.bU.a(5, new cfl.f(this));
      this.bU.a(6, new cbm(this, 0.6));
      this.bU.a(11, new cah(this, cmk.class, 10.0F));
   }

   @Override
   protected float fe() {
      float $$0 = 0.3F;
      if (this.Q || this.bR.b() && this.bR.e() > this.dx() + 0.5) {
         $$0 = 0.5F;
      }

      eov $$1 = this.bT.j();
      if ($$1 != null && !$$1.c()) {
         ewf $$2 = $$1.a(this);
         if ($$2.d > this.dx() + 0.5) {
            $$0 = 0.5F;
         }
      }

      if (this.bR.c() <= 0.6) {
         $$0 = 0.2F;
      }

      return super.x($$0 / 0.42F);
   }

   @Override
   protected void fg() {
      super.fg();
      double $$0 = this.bR.c();
      if ($$0 > 0.0) {
         double $$1 = this.dt().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new ewf(0.0, 0.0, 1.0));
         }
      }

      if (!this.dQ().B) {
         this.dQ().a(this, (byte)1);
      }
   }

   public float H(float $$0) {
      return this.co == 0 ? 0.0F : ((float)this.cn + $$0) / (float)this.co;
   }

   public void i(double $$0) {
      this.K().a($$0);
      this.bR.a(this.bR.d(), this.bR.e(), this.bR.f(), $$0);
   }

   @Override
   public void s(boolean $$0) {
      super.s($$0);
      if ($$0) {
         this.a(this.y(), this.fb(), ((this.ah.i() - this.ah.i()) * 0.2F + 1.0F) * 0.8F);
      }
   }

   @Override
   public void s() {
      this.s(true);
      this.co = 10;
      this.cn = 0;
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(cg, cfl.g.a.j);
   }

   @Override
   public void Z() {
      if (this.cq > 0) {
         this.cq--;
      }

      if (this.cr > 0) {
         this.cr = this.cr - this.ah.a(3);
         if (this.cr < 0) {
            this.cr = 0;
         }
      }

      if (this.aF()) {
         if (!this.cp) {
            this.s(false);
            this.gx();
         }

         if (this.go() == cfl.g.g && this.cq == 0) {
            btb $$0 = this.p();
            if ($$0 != null && this.g((bsg)$$0) < 16.0) {
               this.c($$0.dv(), $$0.dB());
               this.bR.a($$0.dv(), $$0.dx(), $$0.dB(), this.bR.c());
               this.s();
               this.cp = true;
            }
         }

         cfl.c $$1 = (cfl.c)this.bS;
         if (!$$1.c()) {
            if (this.bR.b() && this.cq == 0) {
               eov $$2 = this.bT.j();
               ewf $$3 = new ewf(this.bR.d(), this.bR.e(), this.bR.f());
               if ($$2 != null && !$$2.c()) {
                  $$3 = $$2.a(this);
               }

               this.c($$3.c, $$3.e);
               this.s();
            }
         } else if (!$$1.d()) {
            this.gu();
         }
      }

      this.cp = this.aF();
   }

   @Override
   public boolean br() {
      return false;
   }

   private void c(double $$0, double $$1) {
      this.s((float)(ayg.d($$1 - this.dB(), $$0 - this.dv()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gu() {
      ((cfl.c)this.bS).a(true);
   }

   private void gv() {
      ((cfl.c)this.bS).a(false);
   }

   private void gw() {
      if (this.bR.c() < 2.2) {
         this.cq = 10;
      } else {
         this.cq = 1;
      }
   }

   private void gx() {
      this.gw();
      this.gv();
   }

   @Override
   public void n_() {
      super.n_();
      if (this.cn != this.co) {
         this.cn++;
      } else if (this.co != 0) {
         this.cn = 0;
         this.co = 0;
         this.s(false);
      }
   }

   public static bui.a u() {
      return btd.A().a(buj.s, 3.0).a(buj.v, 0.3F).a(buj.c, 3.0);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("RabbitType", this.go().j);
      $$0.a("MoreCarrotTicks", this.cr);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a(cfl.g.a($$0.h("RabbitType")));
      this.cr = $$0.h("MoreCarrotTicks");
   }

   protected avg y() {
      return avh.vb;
   }

   @Override
   protected avg v() {
      return avh.uX;
   }

   @Override
   protected avg d(bqz $$0) {
      return avh.va;
   }

   @Override
   protected avg o_() {
      return avh.uZ;
   }

   @Override
   public void gh() {
      if (this.go() == cfl.g.g) {
         this.a(avh.uY, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
      }
   }

   @Override
   public avi df() {
      return this.go() == cfl.g.g ? avi.f : avi.g;
   }

   @Nullable
   public cfl b(aqm $$0, bsa $$1) {
      cfl $$2 = bsm.aG.a((dcf)$$0);
      if ($$2 != null) {
         cfl.g $$3;
         $$3 = a($$0, this.dq());
         label16:
         if (this.ah.a(20) != 0) {
            if ($$1 instanceof cfl $$4 && this.ah.h()) {
               $$3 = $$4.go();
               break label16;
            }

            $$3 = this.go();
         }

         $$2.a($$3);
      }

      return $$2;
   }

   @Override
   public boolean o(cuc $$0) {
      return $$0.a(awf.as);
   }

   public cfl.g go() {
      return cfl.g.a(this.ao.a(cg));
   }

   public void a(cfl.g $$0) {
      if ($$0 == cfl.g.g) {
         this.f(buj.a).a(8.0);
         this.bU.a(4, new caj(this, 1.4, true));
         this.bV.a(1, new cbr(this).a());
         this.bV.a(2, new cbs<>(this, cmk.class, true));
         this.bV.a(2, new cbs<>(this, cfu.class, true));
         this.f(buj.c).d(new buh(ck, "Evil rabbit strength", 5.0, buh.a.a));
         if (!this.ah()) {
            this.b(wu.c(ac.a("entity", ch)));
         }
      } else {
         this.f(buj.c).b(ck);
      }

      this.ao.a(cg, $$0.j);
   }

   @Nullable
   @Override
   public btu a(dcu $$0, bqe $$1, btf $$2, @Nullable btu $$3) {
      cfl.g $$4 = a($$0, this.dq());
      if ($$3 instanceof cfl.b) {
         $$4 = ((cfl.b)$$3).a;
      } else {
         $$3 = new cfl.b($$4);
      }

      this.a($$4);
      return super.a($$0, $$1, $$2, $$3);
   }

   private static cfl.g a(dcg $$0, ja $$1) {
      jj<ddf> $$2 = $$0.t($$1);
      int $$3 = $$0.E_().a(100);
      if ($$2.a(avv.al)) {
         return $$3 < 80 ? cfl.g.b : cfl.g.d;
      } else if ($$2.a(avv.ak)) {
         return cfl.g.e;
      } else {
         return $$3 < 50 ? cfl.g.a : ($$3 < 90 ? cfl.g.f : cfl.g.c);
      }
   }

   public static boolean c(bsm<cfl> $$0, dcg $$1, btf $$2, ja $$3, ayo $$4) {
      return $$1.a_($$3.d()).a(avw.cd) && a((dbi)$$1, $$3);
   }

   boolean gy() {
      return this.cr <= 0;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 1) {
         this.bs();
         this.co = 10;
         this.cn = 0;
      } else {
         super.b($$0);
      }
   }

   @Override
   public ewf cN() {
      return new ewf(0.0, (double)(0.6F * this.cM()), (double)(this.dk() * 0.4F));
   }

   static class a<T extends btb> extends bzg<T> {
      private final cfl i;

      public a(cfl $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.go() != cfl.g.g && super.a();
      }
   }

   public static class b extends bsa.a {
      public final cfl.g a;

      public b(cfl.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends bza {
      private final cfl b;
      private boolean c;

      public c(cfl $$0) {
         super($$0);
         this.b = $$0;
      }

      public boolean c() {
         return this.a;
      }

      public boolean d() {
         return this.c;
      }

      public void a(boolean $$0) {
         this.c = $$0;
      }

      @Override
      public void b() {
         if (this.a) {
            this.b.s();
            this.a = false;
         }
      }
   }

   static class d extends bzc {
      private final cfl l;
      private double m;

      public d(cfl $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aF() && !this.l.bn && !((cfl.c)this.l.bS).c()) {
            this.l.i(0.0);
         } else if (this.b()) {
            this.l.i(this.m);
         }

         super.a();
      }

      @Override
      public void a(double $$0, double $$1, double $$2, double $$3) {
         if (this.l.bf()) {
            $$3 = 1.5;
         }

         super.a($$0, $$1, $$2, $$3);
         if ($$3 > 0.0) {
            this.m = $$3;
         }
      }
   }

   static class e extends cas {
      private final cfl h;

      public e(cfl $$0, double $$1) {
         super($$0, $$1);
         this.h = $$0;
      }

      @Override
      public void e() {
         super.e();
         this.h.i(this.c);
      }
   }

   static class f extends cam {
      private final cfl g;
      private boolean h;
      private boolean i;

      public f(cfl $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         if (this.c <= 0) {
            if (!this.g.dQ().ab().b(dcb.c)) {
               return false;
            }

            this.i = false;
            this.h = this.g.gy();
         }

         return super.a();
      }

      @Override
      public boolean b() {
         return this.i && super.b();
      }

      @Override
      public void e() {
         super.e();
         this.g.G().a((double)this.e.u() + 0.5, (double)(this.e.v() + 1), (double)this.e.w() + 0.5, 10.0F, (float)this.g.aa());
         if (this.m()) {
            dcf $$0 = this.g.dQ();
            ja $$1 = this.e.c();
            dsk $$2 = $$0.a_($$1);
            dfh $$3 = $$2.b();
            if (this.i && $$3 instanceof dfz) {
               int $$4 = $$2.c(dfz.f);
               if ($$4 == 0) {
                  $$0.a($$1, dfj.a.o(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.a(dfz.f, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(dxg.c, $$1, dxg.a.a(this.g));
                  $$0.c(2001, $$1, dfh.i($$2));
               }

               this.g.cr = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(dci $$0, ja $$1) {
         dsk $$2 = $$0.a_($$1);
         if ($$2.a(dfj.cC) && this.h && !this.i) {
            $$2 = $$0.a_($$1.c());
            if ($$2.b() instanceof dfz && ((dfz)$$2.b()).h($$2)) {
               this.i = true;
               return true;
            }
         }

         return false;
      }
   }

   public static enum g implements azc {
      a(0, "brown"),
      b(1, "white"),
      c(2, "black"),
      d(3, "white_splotched"),
      e(4, "gold"),
      f(5, "salt"),
      g(99, "evil");

      private static final IntFunction<cfl.g> i = aww.a(cfl.g::a, values(), a);
      public static final Codec<cfl.g> h = azc.a(cfl.g::values);
      final int j;
      private final String k;

      private g(final int $$0, final String $$1) {
         this.j = $$0;
         this.k = $$1;
      }

      @Override
      public String c() {
         return this.k;
      }

      public int a() {
         return this.j;
      }

      public static cfl.g a(int $$0) {
         return i.apply($$0);
      }
   }
}
