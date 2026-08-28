import com.mojang.serialization.Codec;
import java.util.UUID;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cfi extends ceo implements bty<cfi.g> {
   public static final double ca = 0.6;
   public static final double cb = 0.8;
   public static final double cd = 1.0;
   public static final double ce = 2.2;
   public static final double cf = 1.4;
   private static final ajp<Integer> cg = ajt.a(cfi.class, ajr.b);
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

   public cfi(bsj<? extends cfi> $$0, dcd $$1) {
      super($$0, $$1);
      this.bS = new cfi.c(this);
      this.bR = new cfi.d(this);
      this.i(0.0);
   }

   @Override
   protected void z() {
      this.bU.a(1, new bzq(this));
      this.bU.a(1, new bzl(this, this.dP()));
      this.bU.a(1, new cfi.e(this, 2.2));
      this.bU.a(2, new bzi(this, 0.8));
      this.bU.a(3, new cbe(this, 1.0, $$0 -> $$0.a(awd.as), false));
      this.bU.a(4, new cfi.a<>(this, cmh.class, 8.0F, 2.2, 2.2));
      this.bU.a(4, new cfi.a<>(this, cfr.class, 10.0F, 2.2, 2.2));
      this.bU.a(4, new cfi.a<>(this, cjn.class, 4.0F, 2.2, 2.2));
      this.bU.a(5, new cfi.f(this));
      this.bU.a(6, new cbj(this, 0.6));
      this.bU.a(11, new cae(this, cmh.class, 10.0F));
   }

   @Override
   protected float fd() {
      float $$0 = 0.3F;
      if (this.Q || this.bR.b() && this.bR.e() > this.dw() + 0.5) {
         $$0 = 0.5F;
      }

      eop $$1 = this.bT.j();
      if ($$1 != null && !$$1.c()) {
         evz $$2 = $$1.a(this);
         if ($$2.d > this.dw() + 0.5) {
            $$0 = 0.5F;
         }
      }

      if (this.bR.c() <= 0.6) {
         $$0 = 0.2F;
      }

      return super.x($$0 / 0.42F);
   }

   @Override
   protected void ff() {
      super.ff();
      double $$0 = this.bR.c();
      if ($$0 > 0.0) {
         double $$1 = this.ds().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new evz(0.0, 0.0, 1.0));
         }
      }

      if (!this.dP().B) {
         this.dP().a(this, (byte)1);
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
         this.a(this.y(), this.fa(), ((this.ah.i() - this.ah.i()) * 0.2F + 1.0F) * 0.8F);
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
      $$0.a(cg, cfi.g.a.j);
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

      if (this.aE()) {
         if (!this.cp) {
            this.s(false);
            this.gw();
         }

         if (this.gn() == cfi.g.g && this.cq == 0) {
            bsy $$0 = this.p();
            if ($$0 != null && this.g((bsd)$$0) < 16.0) {
               this.c($$0.du(), $$0.dA());
               this.bR.a($$0.du(), $$0.dw(), $$0.dA(), this.bR.c());
               this.s();
               this.cp = true;
            }
         }

         cfi.c $$1 = (cfi.c)this.bS;
         if (!$$1.c()) {
            if (this.bR.b() && this.cq == 0) {
               eop $$2 = this.bT.j();
               evz $$3 = new evz(this.bR.d(), this.bR.e(), this.bR.f());
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

      this.cp = this.aE();
   }

   @Override
   public boolean bq() {
      return false;
   }

   private void c(double $$0, double $$1) {
      this.s((float)(aye.d($$1 - this.dA(), $$0 - this.du()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gt() {
      ((cfi.c)this.bS).a(true);
   }

   private void gu() {
      ((cfi.c)this.bS).a(false);
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

   public static buf.a u() {
      return bta.A().a(bug.s, 3.0).a(bug.v, 0.3F).a(bug.c, 3.0);
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
      this.a(cfi.g.a($$0.h("RabbitType")));
      this.cr = $$0.h("MoreCarrotTicks");
   }

   protected ave y() {
      return avf.vb;
   }

   @Override
   protected ave v() {
      return avf.uX;
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.va;
   }

   @Override
   protected ave o_() {
      return avf.uZ;
   }

   @Override
   public void gg() {
      if (this.gn() == cfi.g.g) {
         this.a(avf.uY, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
      }
   }

   @Override
   public avg de() {
      return this.gn() == cfi.g.g ? avg.f : avg.g;
   }

   @Nullable
   public cfi b(aqk $$0, brx $$1) {
      cfi $$2 = bsj.aG.a((dcd)$$0);
      if ($$2 != null) {
         cfi.g $$3;
         $$3 = a($$0, this.dp());
         label16:
         if (this.ah.a(20) != 0) {
            if ($$1 instanceof cfi $$4 && this.ah.h()) {
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
   public boolean o(cua $$0) {
      return $$0.a(awd.as);
   }

   public cfi.g gn() {
      return cfi.g.a(this.ao.a(cg));
   }

   public void a(cfi.g $$0) {
      if ($$0 == cfi.g.g) {
         this.f(bug.a).a(8.0);
         this.bU.a(4, new cag(this, 1.4, true));
         this.bV.a(1, new cbo(this).a());
         this.bV.a(2, new cbp<>(this, cmh.class, true));
         this.bV.a(2, new cbp<>(this, cfr.class, true));
         this.f(bug.c).d(new bue(ck, "Evil rabbit strength", 5.0, bue.a.a));
         if (!this.ag()) {
            this.b(wu.c(ac.a("entity", ch)));
         }
      } else {
         this.f(bug.c).b(ck);
      }

      this.ao.a(cg, $$0.j);
   }

   @Nullable
   @Override
   public btr a(dcs $$0, bqb $$1, btc $$2, @Nullable btr $$3) {
      cfi.g $$4 = a($$0, this.dp());
      if ($$3 instanceof cfi.b) {
         $$4 = ((cfi.b)$$3).a;
      } else {
         $$3 = new cfi.b($$4);
      }

      this.a($$4);
      return super.a($$0, $$1, $$2, $$3);
   }

   private static cfi.g a(dce $$0, ja $$1) {
      jj<ddd> $$2 = $$0.t($$1);
      int $$3 = $$0.E_().a(100);
      if ($$2.a(avt.al)) {
         return $$3 < 80 ? cfi.g.b : cfi.g.d;
      } else if ($$2.a(avt.ak)) {
         return cfi.g.e;
      } else {
         return $$3 < 50 ? cfi.g.a : ($$3 < 90 ? cfi.g.f : cfi.g.c);
      }
   }

   public static boolean c(bsj<cfi> $$0, dce $$1, btc $$2, ja $$3, aym $$4) {
      return $$1.a_($$3.d()).a(avu.cd) && a((dbg)$$1, $$3);
   }

   boolean gx() {
      return this.cr <= 0;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 1) {
         this.br();
         this.co = 10;
         this.cn = 0;
      } else {
         super.b($$0);
      }
   }

   @Override
   public evz cM() {
      return new evz(0.0, (double)(0.6F * this.cL()), (double)(this.dj() * 0.4F));
   }

   static class a<T extends bsy> extends bzd<T> {
      private final cfi i;

      public a(cfi $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gn() != cfi.g.g && super.a();
      }
   }

   public static class b extends brx.a {
      public final cfi.g a;

      public b(cfi.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends byx {
      private final cfi b;
      private boolean c;

      public c(cfi $$0) {
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

   static class d extends byz {
      private final cfi l;
      private double m;

      public d(cfi $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aE() && !this.l.bn && !((cfi.c)this.l.bS).c()) {
            this.l.i(0.0);
         } else if (this.b()) {
            this.l.i(this.m);
         }

         super.a();
      }

      @Override
      public void a(double $$0, double $$1, double $$2, double $$3) {
         if (this.l.be()) {
            $$3 = 1.5;
         }

         super.a($$0, $$1, $$2, $$3);
         if ($$3 > 0.0) {
            this.m = $$3;
         }
      }
   }

   static class e extends cap {
      private final cfi h;

      public e(cfi $$0, double $$1) {
         super($$0, $$1);
         this.h = $$0;
      }

      @Override
      public void e() {
         super.e();
         this.h.i(this.c);
      }
   }

   static class f extends caj {
      private final cfi g;
      private boolean h;
      private boolean i;

      public f(cfi $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         if (this.c <= 0) {
            if (!this.g.dP().ab().b(dbz.c)) {
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
         this.g.G().a((double)this.e.u() + 0.5, (double)(this.e.v() + 1), (double)this.e.w() + 0.5, 10.0F, (float)this.g.aa());
         if (this.m()) {
            dcd $$0 = this.g.dP();
            ja $$1 = this.e.c();
            dsh $$2 = $$0.a_($$1);
            dff $$3 = $$2.b();
            if (this.i && $$3 instanceof dfx) {
               int $$4 = $$2.c(dfx.f);
               if ($$4 == 0) {
                  $$0.a($$1, dfh.a.o(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.a(dfx.f, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(dxa.c, $$1, dxa.a.a(this.g));
                  $$0.c(2001, $$1, dff.i($$2));
               }

               this.g.cr = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(dcg $$0, ja $$1) {
         dsh $$2 = $$0.a_($$1);
         if ($$2.a(dfh.cC) && this.h && !this.i) {
            $$2 = $$0.a_($$1.c());
            if ($$2.b() instanceof dfx && ((dfx)$$2.b()).h($$2)) {
               this.i = true;
               return true;
            }
         }

         return false;
      }
   }

   public static enum g implements ayz {
      a(0, "brown"),
      b(1, "white"),
      c(2, "black"),
      d(3, "white_splotched"),
      e(4, "gold"),
      f(5, "salt"),
      g(99, "evil");

      private static final IntFunction<cfi.g> i = awu.a(cfi.g::a, values(), a);
      public static final Codec<cfi.g> h = ayz.a(cfi.g::values);
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

      public static cfi.g a(int $$0) {
         return i.apply($$0);
      }
   }
}
