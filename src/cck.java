import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cck extends cbd {
   public static final float bX = 0.6F;
   public static final float bY = 32.5F;
   public static final int ca = 80;
   private static final double ce = 7.0;
   private static final double cf = 2.0;
   private static final aim<cck.a> cg = aiq.a(cck.class, aio.z);
   private long ch = 0L;
   public final bos cb = new bos();
   public final bos cc = new bos();
   public final bos cd = new bos();
   private int ci;
   private boolean cj = false;

   public cck(bpc<? extends cbd> $$0, cwz $$1) {
      super($$0, $$1);
      this.K().a(true);
      this.ci = this.gz();
   }

   @Nullable
   @Override
   public bor a(apf $$0, bor $$1) {
      return bpc.d.a((cwz)$$0);
   }

   public static bqu.a r() {
      return bpq.A().a(bqv.q, 12.0).a(bqv.r, 0.14);
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(cg, cck.a.a);
   }

   public boolean s() {
      return this.an.a(cg) != cck.a.a;
   }

   public boolean y() {
      return this.gt().a(this.ch);
   }

   public boolean gn() {
      return this.gt() == cck.a.b && this.ch > (long)cck.a.b.b();
   }

   public cck.a gt() {
      return this.an.a(cg);
   }

   @Override
   protected void X() {
      super.X();
      aew.a(this);
   }

   public void a(cck.a $$0) {
      this.an.a(cg, $$0);
   }

   @Override
   public void a(aim<?> $$0) {
      if (cg.equals($$0)) {
         this.ch = 0L;
      }

      super.a($$0);
   }

   @Override
   protected bqp.b<cck> dQ() {
      return ccl.a();
   }

   @Override
   protected bqp<?> a(Dynamic<?> $$0) {
      return ccl.a(this.dQ().a($$0));
   }

   @Override
   protected void Y() {
      this.dM().ae().a("armadilloBrain");
      ((bqp<cck>)this.bC).a((apf)this.dM(), this);
      this.dM().ae().c();
      this.dM().ae().a("armadilloActivityUpdate");
      ccl.a(this);
      this.dM().ae().c();
      if (this.bA() && !this.o_() && --this.ci <= 0) {
         this.a(aty.ak, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
         this.a(cqn.op);
         this.b(drn.t);
         this.ci = this.gz();
      }

      super.Y();
   }

   private int gz() {
      return this.ag.a(20 * axv.e * 5) + 20 * axv.e * 5;
   }

   @Override
   public void l() {
      super.l();
      if (this.dM().x_()) {
         this.gA();
      }

      if (this.s()) {
         this.ab();
      }

      this.ch++;
   }

   @Override
   public float ea() {
      return this.o_() ? 0.6F : 1.0F;
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
               this.cd.a(cck.a.c.b(), 1.0F);
            } else {
               this.cd.b(this.ah);
            }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 64 && this.dM().B) {
         this.cj = true;
         this.dM().a(this.dr(), this.dt(), this.dx(), aty.am, this.db(), 1.0F, 1.0F, false);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean o(cqk $$0) {
      return ccl.a.a($$0);
   }

   public static boolean c(bpc<cck> $$0, cxa $$1, bps $$2, ib $$3, axd $$4) {
      return $$1.a_($$3.d()).a(aun.bR) && a($$1, $$3);
   }

   public boolean j(bpo $$0) {
      if (!this.cH().c(7.0, 2.0, 7.0).c($$0.cH())) {
         return false;
      } else if ($$0.ai().a(auq.d)) {
         return true;
      } else if (this.ej() == $$0) {
         return true;
      } else if ($$0 instanceof cis $$1) {
         return $$1.N_() ? false : $$1.bY() || $$1.bO();
      } else {
         return false;
      }
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("state", this.gt().c());
      $$0.a("scute_time", this.ci);
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      this.a(cck.a.a($$0.l("state")));
      if ($$0.e("scute_time")) {
         this.ci = $$0.h("scute_time");
      }
   }

   public void gu() {
      if (!this.s()) {
         this.T();
         this.gs();
         this.b(drn.u);
         this.b(aty.ai);
         this.a(cck.a.b);
      }
   }

   public void gv() {
      if (this.s()) {
         this.b(drn.u);
         this.b(aty.al);
         this.a(cck.a.a);
      }
   }

   @Override
   public boolean a(bnv $$0, float $$1) {
      if (this.s()) {
         $$1 = ($$1 - 1.0F) / 2.0F;
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void f(bnv $$0, float $$1) {
      super.f($$0, $$1);
      if (!this.gd()) {
         if ($$0.d() instanceof bpo) {
            this.dP().a(byr.G, true, 80L);
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
   public bnc b(cis $$0, bnb $$1) {
      cqk $$2 = $$0.b($$1);
      if ($$2.a(cqn.xm)) {
         $$2.a(16, $$0, d($$1));
         this.gx();
         return bnc.a(this.dM().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(int $$0, boolean $$1) {
      if (this.o_() && $$1) {
         this.b(aty.ac);
      }

      super.a($$0, $$1);
   }

   public void gx() {
      this.b(new cqk(cqn.op));
      this.b(drn.r);
      this.a(aty.ao);
   }

   public boolean gy() {
      return !this.gk() && !this.bg() && !this.gb() && !this.bO() && !this.bP();
   }

   @Override
   public void g(@Nullable cis $$0) {
      super.g($$0);
      this.b(aty.ac);
   }

   @Override
   public boolean go() {
      return super.go() && !this.s();
   }

   @Override
   public atx d(cqk $$0) {
      return aty.ac;
   }

   @Override
   protected atx v() {
      return this.s() ? null : aty.af;
   }

   @Override
   protected atx n_() {
      return aty.ah;
   }

   @Override
   protected atx d(bnv $$0) {
      return this.s() ? aty.ae : aty.ad;
   }

   @Override
   protected void b(ib $$0, dmz $$1) {
      this.a(aty.ag, 0.15F, 1.0F);
   }

   @Override
   public int aa() {
      return this.s() ? 0 : 32;
   }

   @Override
   protected bvj E() {
      return new bvj(this) {
         @Override
         public void a() {
            if (!cck.this.s()) {
               super.a();
            }
         }
      };
   }

   public static enum a implements axq {
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

      private static final axq.a<cck.a> f = axq.a(cck.a::values);
      private static final IntFunction<cck.a> g = avn.a(cck.a::d, values(), avn.a.a);
      public static final xs<ByteBuf, cck.a> e = xq.a(g, cck.a::d);
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

      public static cck.a a(String $$0) {
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
