import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cfp extends ceg {
   public static final float bY = 0.6F;
   public static final float bZ = 32.5F;
   public static final int cb = 80;
   private static final double cf = 7.0;
   private static final double cg = 2.0;
   private static final ajs<cfp.a> ch = ajw.a(cfp.class, aju.B);
   private long ci = 0L;
   public final brr cc = new brr();
   public final brr cd = new brr();
   public final brr ce = new brr();
   private int cj;
   private boolean ck = false;

   public cfp(bsc<? extends ceg> $$0, daz $$1) {
      super($$0, $$1);
      this.K().a(true);
      this.cj = this.gB();
   }

   @Nullable
   @Override
   public brq a(aqn $$0, brq $$1) {
      return bsc.c.a((daz)$$0);
   }

   public static btx.a s() {
      return bss.A().a(bty.q, 12.0).a(bty.r, 0.14);
   }

   @Override
   protected void a(ajw.a $$0) {
      super.a($$0);
      $$0.a(ch, cfp.a.a);
   }

   public boolean u() {
      return this.ao.a(ch) != cfp.a.a;
   }

   public boolean y() {
      return this.gv().a(this.ci);
   }

   public boolean gp() {
      return this.gv() == cfp.a.b && this.ci > (long)cfp.a.b.b();
   }

   public cfp.a gv() {
      return this.ao.a(ch);
   }

   @Override
   protected void X() {
      super.X();
      agb.a(this);
   }

   public void a(cfp.a $$0) {
      this.ao.a(ch, $$0);
   }

   @Override
   public void a(ajs<?> $$0) {
      if (ch.equals($$0)) {
         this.ci = 0L;
      }

      super.a($$0);
   }

   @Override
   protected bts.b<cfp> dT() {
      return cfq.a();
   }

   @Override
   protected bts<?> a(Dynamic<?> $$0) {
      return cfq.a(this.dT().a($$0));
   }

   @Override
   protected void Y() {
      this.dP().af().a("armadilloBrain");
      ((bts<cfp>)this.bD).a((aqn)this.dP(), this);
      this.dP().af().c();
      this.dP().af().a("armadilloActivityUpdate");
      cfq.a(this);
      this.dP().af().c();
      if (this.bD() && !this.p_() && --this.cj <= 0) {
         this.a(avi.ak, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
         this.a(ctt.oq);
         this.a(dvw.t);
         this.cj = this.gB();
      }

      super.Y();
   }

   private int gB() {
      return this.ah.a(20 * aze.e * 5) + 20 * aze.e * 5;
   }

   @Override
   public void l() {
      super.l();
      if (this.dP().x_()) {
         this.gC();
      }

      if (this.u()) {
         this.ab();
      }

      this.ci++;
   }

   @Override
   public float ed() {
      return this.p_() ? 0.6F : 1.0F;
   }

   private void gC() {
      switch (this.gv()) {
         case a:
            this.cc.a();
            this.cd.a();
            this.ce.a();
            break;
         case b:
            this.cc.a();
            this.cd.b(this.ai);
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
               this.ce.a(this.ai);
               this.ce.a(cfp.a.c.b(), 1.0F);
            } else {
               this.ce.b(this.ai);
            }
            break;
         case d:
            this.cc.b(this.ai);
            this.cd.a();
            this.ce.a();
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 64 && this.dP().B) {
         this.ck = true;
         this.dP().a(this.du(), this.dw(), this.dA(), avi.am, this.de(), 1.0F, 1.0F, false);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean o(ctq $$0) {
      return $$0.a(awf.ai);
   }

   public static boolean c(bsc<cfp> $$0, dba $$1, bsu $$2, io $$3, aym $$4) {
      return $$1.a_($$3.d()).a(avx.bX) && a($$1, $$3);
   }

   public boolean j(bsq $$0) {
      if (!this.cK().c(7.0, 2.0, 7.0).c($$0.cK())) {
         return false;
      } else if ($$0.ak().a(awa.d)) {
         return true;
      } else if (this.em() == $$0) {
         return true;
      } else if ($$0 instanceof cly $$1) {
         return $$1.N_() ? false : $$1.cb() || $$1.bR();
      } else {
         return false;
      }
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("state", this.gv().c());
      $$0.a("scute_time", this.cj);
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.a(cfp.a.a($$0.l("state")));
      if ($$0.e("scute_time")) {
         this.cj = $$0.h("scute_time");
      }
   }

   public void gw() {
      if (!this.u()) {
         this.T();
         this.gu();
         this.a(dvw.u);
         this.b(avi.ai);
         this.a(cfp.a.b);
      }
   }

   public void gx() {
      if (this.u()) {
         this.a(dvw.u);
         this.b(avi.al);
         this.a(cfp.a.a);
      }
   }

   @Override
   public boolean a(bqp $$0, float $$1) {
      if (this.u()) {
         $$1 = ($$1 - 1.0F) / 2.0F;
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void f(bqp $$0, float $$1) {
      super.f($$0, $$1);
      if (!this.gf()) {
         if ($$0.d() instanceof bsq) {
            this.dS().a(cbu.G, true, 80L);
            if (this.gA()) {
               this.gw();
            }
         } else if (this.gy()) {
            this.gx();
         }
      }
   }

   public boolean gy() {
      return this.bQ() || this.dE();
   }

   @Override
   public bpw b(cly $$0, bpv $$1) {
      ctq $$2 = $$0.b($$1);
      if ($$2.a(ctt.xr) && this.gz()) {
         $$2.a(16, $$0, d($$1));
         return bpw.a(this.dP().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(int $$0, boolean $$1) {
      if (this.p_() && $$1) {
         this.b(avi.ac);
      }

      super.a($$0, $$1);
   }

   public boolean gz() {
      if (this.p_()) {
         return false;
      } else {
         this.b(new ctq(ctt.oq));
         this.a(dvw.r);
         this.a(avi.ao);
         return true;
      }
   }

   public boolean gA() {
      return !this.gm() && !this.bi() && !this.gc() && !this.bR() && !this.bS();
   }

   @Override
   public void g(@Nullable cly $$0) {
      super.g($$0);
      this.b(avi.ac);
   }

   @Override
   public boolean gq() {
      return super.gq() && !this.u();
   }

   @Override
   public avh d(ctq $$0) {
      return avi.ac;
   }

   @Override
   protected avh v() {
      return this.u() ? null : avi.af;
   }

   @Override
   protected avh o_() {
      return avi.ah;
   }

   @Override
   protected avh d(bqp $$0) {
      return this.u() ? avi.ae : avi.ad;
   }

   @Override
   protected void b(io $$0, drd $$1) {
      this.a(avi.ag, 0.15F, 1.0F);
   }

   @Override
   public int aa() {
      return this.u() ? 0 : 32;
   }

   @Override
   protected bym E() {
      return new bym(this) {
         @Override
         public void a() {
            if (!cfp.this.u()) {
               super.a();
            }
         }
      };
   }

   public static enum a implements ayz {
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

      private static final ayz.a<cfp.a> f = ayz.a(cfp.a::values);
      private static final IntFunction<cfp.a> g = aww.a(cfp.a::d, values(), aww.a.a);
      public static final yv<ByteBuf, cfp.a> e = yt.a(g, cfp.a::d);
      private final String h;
      private final boolean i;
      private final int j;
      private final int k;

      a(String $$0, boolean $$1, int $$2, int $$3) {
         this.h = $$0;
         this.i = $$1;
         this.j = $$2;
         this.k = $$3;
      }

      public static cfp.a a(String $$0) {
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
