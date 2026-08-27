import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cdk extends ccd {
   public static final float bX = 0.6F;
   public static final float bY = 32.5F;
   public static final int ca = 80;
   private static final double ce = 7.0;
   private static final double cf = 2.0;
   private static final aiy<cdk.a> cg = ajc.a(cdk.class, aja.z);
   private long ch = 0L;
   public final bpq cb = new bpq();
   public final bpq cc = new bpq();
   public final bpq cd = new bpq();
   private int ci;
   private boolean cj = false;

   public cdk(bqb<? extends ccd> $$0, cyx $$1) {
      super($$0, $$1);
      this.K().a(true);
      this.ci = this.gz();
   }

   @Nullable
   @Override
   public bpp a(aps $$0, bpp $$1) {
      return bqb.c.a((cyx)$$0);
   }

   public static bru.a r() {
      return bqq.A().a(brv.q, 12.0).a(brv.r, 0.14);
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(cg, cdk.a.a);
   }

   public boolean u() {
      return this.an.a(cg) != cdk.a.a;
   }

   public boolean y() {
      return this.gt().a(this.ch);
   }

   public boolean gn() {
      return this.gt() == cdk.a.b && this.ch > (long)cdk.a.b.b();
   }

   public cdk.a gt() {
      return this.an.a(cg);
   }

   @Override
   protected void X() {
      super.X();
      afi.a(this);
   }

   public void a(cdk.a $$0) {
      this.an.a(cg, $$0);
   }

   @Override
   public void a(aiy<?> $$0) {
      if (cg.equals($$0)) {
         this.ch = 0L;
      }

      super.a($$0);
   }

   @Override
   protected brp.b<cdk> dQ() {
      return cdl.a();
   }

   @Override
   protected brp<?> a(Dynamic<?> $$0) {
      return cdl.a(this.dQ().a($$0));
   }

   @Override
   protected void Y() {
      this.dM().af().a("armadilloBrain");
      ((brp<cdk>)this.bC).a((aps)this.dM(), this);
      this.dM().af().c();
      this.dM().af().a("armadilloActivityUpdate");
      cdl.a(this);
      this.dM().af().c();
      if (this.bA() && !this.p_() && --this.ci <= 0) {
         this.a(aum.ak, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
         this.a(crm.op);
         this.a(dts.t);
         this.ci = this.gz();
      }

      super.Y();
   }

   private int gz() {
      return this.ag.a(20 * ayj.e * 5) + 20 * ayj.e * 5;
   }

   @Override
   public void l() {
      super.l();
      if (this.dM().x_()) {
         this.gA();
      }

      if (this.u()) {
         this.ab();
      }

      this.ch++;
   }

   @Override
   public float ea() {
      return this.p_() ? 0.6F : 1.0F;
   }

   private void gA() {
      switch (this.gt()) {
         case a:
            this.cb.a();
            this.cc.a();
            this.cd.a();
            break;
         case d:
            this.cb.b(this.ah);
            this.cc.a();
            this.cd.a();
            break;
         case b:
            this.cb.a();
            this.cc.b(this.ah);
            this.cd.a();
            break;
         case c:
            this.cb.a();
            this.cc.a();
            if (this.cj) {
               this.cd.a();
               this.cj = false;
            }

            if (this.ch == 0L) {
               this.cd.a(this.ah);
               this.cd.a(cdk.a.c.b(), 1.0F);
            } else {
               this.cd.b(this.ah);
            }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 64 && this.dM().B) {
         this.cj = true;
         this.dM().a(this.dr(), this.dt(), this.dx(), aum.am, this.db(), 1.0F, 1.0F, false);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean o(crj $$0) {
      return cdl.a.a($$0);
   }

   public static boolean c(bqb<cdk> $$0, cyy $$1, bqs $$2, ib $$3, axr $$4) {
      return $$1.a_($$3.d()).a(avc.bR) && a($$1, $$3);
   }

   public boolean j(bqo $$0) {
      if (!this.cH().c(7.0, 2.0, 7.0).c($$0.cH())) {
         return false;
      } else if ($$0.ai().a(avf.d)) {
         return true;
      } else if (this.ej() == $$0) {
         return true;
      } else if ($$0 instanceof cjt $$1) {
         return $$1.N_() ? false : $$1.bY() || $$1.bO();
      } else {
         return false;
      }
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      $$0.a("state", this.gt().c());
      $$0.a("scute_time", this.ci);
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      this.a(cdk.a.a($$0.l("state")));
      if ($$0.e("scute_time")) {
         this.ci = $$0.h("scute_time");
      }
   }

   public void gu() {
      if (!this.u()) {
         this.T();
         this.gs();
         this.a(dts.u);
         this.b(aum.ai);
         this.a(cdk.a.b);
      }
   }

   public void gv() {
      if (this.u()) {
         this.a(dts.u);
         this.b(aum.al);
         this.a(cdk.a.a);
      }
   }

   @Override
   public boolean a(bot $$0, float $$1) {
      if (this.u()) {
         $$1 = ($$1 - 1.0F) / 2.0F;
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void f(bot $$0, float $$1) {
      super.f($$0, $$1);
      if (!this.gd()) {
         if ($$0.d() instanceof bqo) {
            this.dP().a(bzr.G, true, 80L);
            if (this.gy()) {
               this.gu();
            }
         } else if (this.gw()) {
            this.gv();
         }
      }
   }

   public boolean gw() {
      return this.bN() || this.dB();
   }

   @Override
   public boa b(cjt $$0, bnz $$1) {
      crj $$2 = $$0.b($$1);
      if ($$2.a(crm.xn) && this.gx()) {
         $$2.a(16, $$0, d($$1));
         return boa.a(this.dM().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(int $$0, boolean $$1) {
      if (this.p_() && $$1) {
         this.b(aum.ac);
      }

      super.a($$0, $$1);
   }

   public boolean gx() {
      if (this.p_()) {
         return false;
      } else {
         this.b(new crj(crm.op));
         this.a(dts.r);
         this.a(aum.ao);
         return true;
      }
   }

   public boolean gy() {
      return !this.gk() && !this.bg() && !this.gb() && !this.bO() && !this.bP();
   }

   @Override
   public void g(@Nullable cjt $$0) {
      super.g($$0);
      this.b(aum.ac);
   }

   @Override
   public boolean go() {
      return super.go() && !this.u();
   }

   @Override
   public aul d(crj $$0) {
      return aum.ac;
   }

   @Override
   protected aul v() {
      return this.u() ? null : aum.af;
   }

   @Override
   protected aul o_() {
      return aum.ah;
   }

   @Override
   protected aul d(bot $$0) {
      return this.u() ? aum.ae : aum.ad;
   }

   @Override
   protected void b(ib $$0, doz $$1) {
      this.a(aum.ag, 0.15F, 1.0F);
   }

   @Override
   public int aa() {
      return this.u() ? 0 : 32;
   }

   @Override
   protected bwj E() {
      return new bwj(this) {
         @Override
         public void a() {
            if (!cdk.this.u()) {
               super.a();
            }
         }
      };
   }

   public static enum a implements aye {
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

      private static final aye.a<cdk.a> f = aye.a(cdk.a::values);
      private static final IntFunction<cdk.a> g = awb.a(cdk.a::d, values(), awb.a.a);
      public static final ye<ByteBuf, cdk.a> e = yc.a(g, cdk.a::d);
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

      public static cdk.a a(String $$0) {
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
