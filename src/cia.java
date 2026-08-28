import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cia extends cgr {
   public static final float bY = 0.6F;
   public static final float bZ = 32.5F;
   public static final int ca = 80;
   private static final double cf = 7.0;
   private static final double cg = 2.0;
   private static final akl<cia.a> ch = akp.a(cia.class, akn.B);
   private long ci = 0L;
   public final btw cc = new btw();
   public final btw cd = new btw();
   public final btw ce = new btw();
   private int cj;
   private boolean ck = false;

   public cia(bul<? extends cgr> $$0, dfb $$1) {
      super($$0, $$1);
      this.P().a(true);
      this.cj = this.gH();
   }

   @Nullable
   @Override
   public btv a(arn $$0, btv $$1) {
      return bul.c.a($$0, buk.e);
   }

   public static bwh.a q() {
      return cgr.gz().a(bwi.s, 12.0).a(bwi.v, 0.14);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(ch, cia.a.a);
   }

   public boolean t() {
      return this.am.a(ch) != cia.a.a;
   }

   public boolean y() {
      return this.gv().a(this.ci);
   }

   public boolean gu() {
      return this.gv() == cia.a.b && this.ci > (long)cia.a.b.b();
   }

   public cia.a gv() {
      return this.am.a(ch);
   }

   @Override
   protected void ab() {
      super.ab();
      ags.a(this);
   }

   public void a(cia.a $$0) {
      this.am.a(ch, $$0);
   }

   @Override
   public void a(akl<?> $$0) {
      if (ch.equals($$0)) {
         this.ci = 0L;
      }

      super.a($$0);
   }

   @Override
   protected bwc.b<cia> ee() {
      return cib.a();
   }

   @Override
   protected bwc<?> a(Dynamic<?> $$0) {
      return cib.a(this.ee().a($$0));
   }

   @Override
   protected void ac() {
      bon $$0 = bom.a();
      $$0.a("armadilloBrain");
      ((bwc<cia>)this.bF).a((arn)this.dX(), this);
      $$0.c();
      $$0.a("armadilloActivityUpdate");
      cib.a(this);
      $$0.c();
      if (this.bM() && !this.p_() && --this.cj <= 0) {
         if (this.a(ety.aJ, this::b)) {
            this.a(awl.ak, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
            this.a(eag.t);
         }

         this.cj = this.gH();
      }

      super.ac();
   }

   private int gH() {
      return this.af.a(20 * bal.e * 5) + 20 * bal.e * 5;
   }

   @Override
   public void l() {
      super.l();
      if (this.dX().y_()) {
         this.gI();
      }

      if (this.t()) {
         this.ag();
      }

      this.ci++;
   }

   @Override
   public float ek() {
      return this.p_() ? 0.6F : 1.0F;
   }

   private void gI() {
      switch (this.gv()) {
         case a:
            this.cc.a();
            this.cd.a();
            this.ce.a();
            break;
         case b:
            this.cc.a();
            this.cd.b(this.ag);
            this.ce.a();
            break;
         case c:
            this.cc.a();
            this.cd.a();
            if (this.ck) {
               this.ce.a();
               this.ck = false;
            }

            if (this.ci == 0L) {
               this.ce.a(this.ag);
               this.ce.a(cia.a.c.b(), 1.0F);
            } else {
               this.ce.b(this.ag);
            }
            break;
         case d:
            this.cc.b(this.ag);
            this.cd.a();
            this.ce.a();
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 64 && this.dX().C) {
         this.ck = true;
         this.dX().a(this.dC(), this.dE(), this.dI(), awl.am, this.dn(), 1.0F, 1.0F, false);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean l(cwb $$0) {
      return $$0.a(axj.al);
   }

   public static boolean c(bul<cia> $$0, dfc $$1, buk $$2, jh $$3, azs $$4) {
      return $$1.a_($$3.e()).a(axa.bY) && a($$1, $$3);
   }

   public boolean j(bva $$0) {
      if (!this.cS().c(7.0, 2.0, 7.0).c($$0.cS())) {
         return false;
      } else if ($$0.ar().a(axe.d)) {
         return true;
      } else if (this.es() == $$0) {
         return true;
      } else if ($$0 instanceof com $$1) {
         return $$1.R_() ? false : $$1.ck() || $$1.ca();
      } else {
         return false;
      }
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("state", this.gv().c());
      $$0.a("scute_time", this.cj);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.a(cia.a.a($$0.l("state")));
      if ($$0.e("scute_time")) {
         this.cj = $$0.h("scute_time");
      }
   }

   public void gw() {
      if (!this.t()) {
         this.X();
         this.gF();
         this.a(eag.u);
         this.b(awl.ai);
         this.a(cia.a.b);
      }
   }

   public void gx() {
      if (this.t()) {
         this.a(eag.u);
         this.b(awl.al);
         this.a(cia.a.a);
      }
   }

   @Override
   public boolean a(bsu $$0, float $$1) {
      if (this.t()) {
         $$1 = ($$1 - 1.0F) / 2.0F;
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void f(bsu $$0, float $$1) {
      super.f($$0, $$1);
      if (!this.gh() && !this.eH()) {
         if ($$0.d() instanceof bva) {
            this.ed().a(cee.G, true, 80L);
            if (this.gG()) {
               this.gw();
            }
         } else if ($$0.a(axc.G)) {
            this.gx();
         }
      }
   }

   @Override
   public bsd b(com $$0, bsc $$1) {
      cwb $$2 = $$0.b($$1);
      if ($$2.a(cwf.xx) && this.gy()) {
         $$2.a(16, $$0, d($$1));
         return bsd.a;
      } else {
         return (bsd)(this.t() ? bsd.d : super.b($$0, $$1));
      }
   }

   public boolean gy() {
      if (this.p_()) {
         return false;
      } else {
         this.b(new cwb(cwf.or));
         this.a(eag.r);
         this.a(awl.ao);
         return true;
      }
   }

   public boolean gG() {
      return !this.gr() && !this.bo() && !this.M_() && !this.ca() && !this.cb();
   }

   @Override
   public boolean gB() {
      return super.gB() && !this.t();
   }

   @Override
   protected awk w() {
      return this.t() ? null : awl.af;
   }

   @Override
   protected void gA() {
      this.b(awl.ac);
   }

   @Override
   protected awk o_() {
      return awl.ah;
   }

   @Override
   protected awk d(bsu $$0) {
      return this.t() ? awl.ae : awl.ad;
   }

   @Override
   protected void b(jh $$0, dvj $$1) {
      this.a(awl.ag, 0.15F, 1.0F);
   }

   @Override
   public int ae() {
      return this.t() ? 0 : 32;
   }

   @Override
   protected caw J() {
      return new caw(this) {
         @Override
         public void a() {
            if (!cia.this.t()) {
               super.a();
            }
         }
      };
   }

   public static enum a implements bag {
      a("idle", false, 0, 0) {
         @Override
         public boolean a(long $$0) {
            return false;
         }
      },
      b("rolling", true, 10, 1) {
         @Override
         public boolean a(long $$0) {
            return $$0 > 5L;
         }
      },
      c("scared", true, 50, 2) {
         @Override
         public boolean a(long $$0) {
            return true;
         }
      },
      d("unrolling", true, 30, 3) {
         @Override
         public boolean a(long $$0) {
            return $$0 < 26L;
         }
      };

      private static final bag.a<cia.a> f = bag.a(cia.a::values);
      private static final IntFunction<cia.a> g = ayb.a(cia.a::d, values(), ayb.a.a);
      public static final zg<ByteBuf, cia.a> e = ze.a(g, cia.a::d);
      private final String h;
      private final boolean i;
      private final int j;
      private final int k;

      a(final String $$0, final boolean $$1, final int $$2, final int $$3) {
         this.h = $$0;
         this.i = $$1;
         this.j = $$2;
         this.k = $$3;
      }

      public static cia.a a(String $$0) {
         return f.a($$0, a);
      }

      @Override
      public String c() {
         return this.h;
      }

      private int d() {
         return this.k;
      }

      public abstract boolean a(long var1);

      public boolean a() {
         return this.i;
      }

      public int b() {
         return this.j;
      }
   }
}
