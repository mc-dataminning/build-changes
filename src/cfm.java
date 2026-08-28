import com.mojang.serialization.Codec;
import java.util.UUID;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cfm extends ces implements buc<cfm.g> {
   public static final double ca = 0.6;
   public static final double cb = 0.8;
   public static final double cd = 1.0;
   public static final double ce = 2.2;
   public static final double cf = 1.4;
   private static final ajp<Integer> cg = ajt.a(cfm.class, ajr.b);
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

   public cfm(bsn<? extends cfm> $$0, dcg $$1) {
      super($$0, $$1);
      this.bS = new cfm.c(this);
      this.bR = new cfm.d(this);
      this.i(0.0);
   }

   @Override
   protected void z() {
      this.bU.a(1, new bzu(this));
      this.bU.a(1, new bzp(this, this.dR()));
      this.bU.a(1, new cfm.e(this, 2.2));
      this.bU.a(2, new bzm(this, 0.8));
      this.bU.a(3, new cbi(this, 1.0, $$0 -> $$0.a(awf.as), false));
      this.bU.a(4, new cfm.a<>(this, cml.class, 8.0F, 2.2, 2.2));
      this.bU.a(4, new cfm.a<>(this, cfv.class, 10.0F, 2.2, 2.2));
      this.bU.a(4, new cfm.a<>(this, cjr.class, 4.0F, 2.2, 2.2));
      this.bU.a(5, new cfm.f(this));
      this.bU.a(6, new cbn(this, 0.6));
      this.bU.a(11, new cai(this, cml.class, 10.0F));
   }

   @Override
   protected float ff() {
      float $$0 = 0.3F;
      if (this.Q || this.bR.b() && this.bR.e() > this.dy() + 0.5) {
         $$0 = 0.5F;
      }

      eox $$1 = this.bT.j();
      if ($$1 != null && !$$1.c()) {
         ewh $$2 = $$1.a(this);
         if ($$2.d > this.dy() + 0.5) {
            $$0 = 0.5F;
         }
      }

      if (this.bR.c() <= 0.6) {
         $$0 = 0.2F;
      }

      return super.x($$0 / 0.42F);
   }

   @Override
   protected void fh() {
      super.fh();
      double $$0 = this.bR.c();
      if ($$0 > 0.0) {
         double $$1 = this.du().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new ewh(0.0, 0.0, 1.0));
         }
      }

      if (!this.dR().B) {
         this.dR().a(this, (byte)1);
      }
   }

   public float H(float $$0) {
      return this.co == 0 ? 0.0F : ((float)this.cn + $$0) / (float)this.co;
   }

   public void i(double $$0) {
      this.J().a($$0);
      this.bR.a(this.bR.d(), this.bR.e(), this.bR.f(), $$0);
   }

   @Override
   public void t(boolean $$0) {
      super.t($$0);
      if ($$0) {
         this.a(this.x(), this.fc(), ((this.ah.i() - this.ah.i()) * 0.2F + 1.0F) * 0.8F);
      }
   }

   @Override
   public void s() {
      this.t(true);
      this.co = 10;
      this.cn = 0;
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(cg, cfm.g.a.j);
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

      if (this.aG()) {
         if (!this.cp) {
            this.t(false);
            this.gw();
         }

         if (this.gn() == cfm.g.g && this.cq == 0) {
            btc $$0 = this.p();
            if ($$0 != null && this.g((bsh)$$0) < 16.0) {
               this.c($$0.dw(), $$0.dC());
               this.bR.a($$0.dw(), $$0.dy(), $$0.dC(), this.bR.c());
               this.s();
               this.cp = true;
            }
         }

         cfm.c $$1 = (cfm.c)this.bS;
         if (!$$1.c()) {
            if (this.bR.b() && this.cq == 0) {
               eox $$2 = this.bT.j();
               ewh $$3 = new ewh(this.bR.d(), this.bR.e(), this.bR.f());
               if ($$2 != null && !$$2.c()) {
                  $$3 = $$2.a(this);
               }

               this.c($$3.c, $$3.e);
               this.s();
            }
         } else if (!$$1.d()) {
            this.gt();
         }
      }

      this.cp = this.aG();
   }

   @Override
   public boolean bs() {
      return false;
   }

   private void c(double $$0, double $$1) {
      this.s((float)(ayg.d($$1 - this.dC(), $$0 - this.dw()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gt() {
      ((cfm.c)this.bS).a(true);
   }

   private void gu() {
      ((cfm.c)this.bS).a(false);
   }

   private void gv() {
      if (this.bR.c() < 2.2) {
         this.cq = 10;
      } else {
         this.cq = 1;
      }
   }

   private void gw() {
      this.gv();
      this.gu();
   }

   @Override
   public void m_() {
      super.m_();
      if (this.cn != this.co) {
         this.cn++;
      } else if (this.co != 0) {
         this.cn = 0;
         this.co = 0;
         this.t(false);
      }
   }

   public static buj.a t() {
      return bte.A().a(buk.s, 3.0).a(buk.v, 0.3F).a(buk.c, 3.0);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("RabbitType", this.gn().j);
      $$0.a("MoreCarrotTicks", this.cr);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a(cfm.g.a($$0.h("RabbitType")));
      this.cr = $$0.h("MoreCarrotTicks");
   }

   protected avg x() {
      return avh.vb;
   }

   @Override
   protected avg v() {
      return avh.uX;
   }

   @Override
   protected avg d(bra $$0) {
      return avh.va;
   }

   @Override
   protected avg n_() {
      return avh.uZ;
   }

   @Override
   public void gg() {
      if (this.gn() == cfm.g.g) {
         this.a(avh.uY, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
      }
   }

   @Override
   public avi dg() {
      return this.gn() == cfm.g.g ? avi.f : avi.g;
   }

   @Nullable
   public cfm b(aqm $$0, bsb $$1) {
      cfm $$2 = bsn.aG.a((dcg)$$0);
      if ($$2 != null) {
         cfm.g $$3;
         $$3 = a($$0, this.dr());
         label16:
         if (this.ah.a(20) != 0) {
            if ($$1 instanceof cfm $$4 && this.ah.h()) {
               $$3 = $$4.gn();
               break label16;
            }

            $$3 = this.gn();
         }

         $$2.a($$3);
      }

      return $$2;
   }

   @Override
   public boolean o(cud $$0) {
      return $$0.a(awf.as);
   }

   public cfm.g gn() {
      return cfm.g.a(this.ao.a(cg));
   }

   public void a(cfm.g $$0) {
      if ($$0 == cfm.g.g) {
         this.f(buk.a).a(8.0);
         this.bU.a(4, new cak(this, 1.4, true));
         this.bV.a(1, new cbs(this).a());
         this.bV.a(2, new cbt<>(this, cml.class, true));
         this.bV.a(2, new cbt<>(this, cfv.class, true));
         this.f(buk.c).b(new bui(ck, "Evil rabbit strength", 5.0, bui.a.a));
         if (!this.ai()) {
            this.b(wu.c(ac.a("entity", ch)));
         }
      } else {
         this.f(buk.c).b(ck);
      }

      this.ao.a(cg, $$0.j);
   }

   @Nullable
   @Override
   public btv a(dcv $$0, bqf $$1, btg $$2, @Nullable btv $$3) {
      cfm.g $$4 = a($$0, this.dr());
      if ($$3 instanceof cfm.b) {
         $$4 = ((cfm.b)$$3).a;
      } else {
         $$3 = new cfm.b($$4);
      }

      this.a($$4);
      return super.a($$0, $$1, $$2, $$3);
   }

   private static cfm.g a(dch $$0, ja $$1) {
      jj<ddg> $$2 = $$0.t($$1);
      int $$3 = $$0.E_().a(100);
      if ($$2.a(avv.al)) {
         return $$3 < 80 ? cfm.g.b : cfm.g.d;
      } else if ($$2.a(avv.ak)) {
         return cfm.g.e;
      } else {
         return $$3 < 50 ? cfm.g.a : ($$3 < 90 ? cfm.g.f : cfm.g.c);
      }
   }

   public static boolean c(bsn<cfm> $$0, dch $$1, btg $$2, ja $$3, ayo $$4) {
      return $$1.a_($$3.d()).a(avw.cd) && a((dbj)$$1, $$3);
   }

   boolean gx() {
      return this.cr <= 0;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 1) {
         this.bt();
         this.co = 10;
         this.cn = 0;
      } else {
         super.b($$0);
      }
   }

   @Override
   public ewh cO() {
      return new ewh(0.0, (double)(0.6F * this.cN()), (double)(this.dl() * 0.4F));
   }

   static class a<T extends btc> extends bzh<T> {
      private final cfm i;

      public a(cfm $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gn() != cfm.g.g && super.a();
      }
   }

   public static class b extends bsb.a {
      public final cfm.g a;

      public b(cfm.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends bzb {
      private final cfm b;
      private boolean c;

      public c(cfm $$0) {
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

   static class d extends bzd {
      private final cfm l;
      private double m;

      public d(cfm $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aG() && !this.l.bo && !((cfm.c)this.l.bS).c()) {
            this.l.i(0.0);
         } else if (this.b()) {
            this.l.i(this.m);
         }

         super.a();
      }

      @Override
      public void a(double $$0, double $$1, double $$2, double $$3) {
         if (this.l.bg()) {
            $$3 = 1.5;
         }

         super.a($$0, $$1, $$2, $$3);
         if ($$3 > 0.0) {
            this.m = $$3;
         }
      }
   }

   static class e extends cat {
      private final cfm h;

      public e(cfm $$0, double $$1) {
         super($$0, $$1);
         this.h = $$0;
      }

      @Override
      public void e() {
         super.e();
         this.h.i(this.c);
      }
   }

   static class f extends can {
      private final cfm g;
      private boolean h;
      private boolean i;

      public f(cfm $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         if (this.c <= 0) {
            if (!this.g.dR().ab().b(dcc.c)) {
               return false;
            }

            this.i = false;
            this.h = this.g.gx();
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
         this.g.F().a((double)this.e.u() + 0.5, (double)(this.e.v() + 1), (double)this.e.w() + 0.5, 10.0F, (float)this.g.aa());
         if (this.m()) {
            dcg $$0 = this.g.dR();
            ja $$1 = this.e.c();
            dsl $$2 = $$0.a_($$1);
            dfi $$3 = $$2.b();
            if (this.i && $$3 instanceof dga) {
               int $$4 = $$2.c(dga.f);
               if ($$4 == 0) {
                  $$0.a($$1, dfk.a.o(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.a(dga.f, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(dxh.c, $$1, dxh.a.a(this.g));
                  $$0.c(2001, $$1, dfi.i($$2));
               }

               this.g.cr = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(dcj $$0, ja $$1) {
         dsl $$2 = $$0.a_($$1);
         if ($$2.a(dfk.cC) && this.h && !this.i) {
            $$2 = $$0.a_($$1.c());
            if ($$2.b() instanceof dga && ((dga)$$2.b()).h($$2)) {
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

      private static final IntFunction<cfm.g> i = aww.a(cfm.g::a, values(), a);
      public static final Codec<cfm.g> h = azc.a(cfm.g::values);
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

      public static cfm.g a(int $$0) {
         return i.apply($$0);
      }
   }
}
