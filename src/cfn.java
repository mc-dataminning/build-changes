import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cfn extends cee {
   public static final float bY = 0.6F;
   public static final float bZ = 32.5F;
   public static final int cb = 80;
   private static final double cf = 7.0;
   private static final double cg = 2.0;
   private static final ajr<cfn.a> ch = ajv.a(cfn.class, ajt.B);
   private long ci = 0L;
   public final brp cc = new brp();
   public final brp cd = new brp();
   public final brp ce = new brp();
   private int cj;
   private boolean ck = false;

   public cfn(bsa<? extends cee> $$0, dax $$1) {
      super($$0, $$1);
      this.K().a(true);
      this.cj = this.gB();
   }

   @Nullable
   @Override
   public bro a(aqm $$0, bro $$1) {
      return bsa.c.a((dax)$$0);
   }

   public static btv.a s() {
      return bsq.A().a(btw.q, 12.0).a(btw.r, 0.14);
   }

   @Override
   protected void a(ajv.a $$0) {
      super.a($$0);
      $$0.a(ch, cfn.a.a);
   }

   public boolean u() {
      return this.ao.a(ch) != cfn.a.a;
   }

   public boolean y() {
      return this.gv().a(this.ci);
   }

   public boolean gp() {
      return this.gv() == cfn.a.b && this.ci > (long)cfn.a.b.b();
   }

   public cfn.a gv() {
      return this.ao.a(ch);
   }

   @Override
   protected void X() {
      super.X();
      aga.a(this);
   }

   public void a(cfn.a $$0) {
      this.ao.a(ch, $$0);
   }

   @Override
   public void a(ajr<?> $$0) {
      if (ch.equals($$0)) {
         this.ci = 0L;
      }

      super.a($$0);
   }

   @Override
   protected btq.b<cfn> dT() {
      return cfo.a();
   }

   @Override
   protected btq<?> a(Dynamic<?> $$0) {
      return cfo.a(this.dT().a($$0));
   }

   @Override
   protected void Y() {
      this.dP().af().a("armadilloBrain");
      ((btq<cfn>)this.bE).a((aqm)this.dP(), this);
      this.dP().af().c();
      this.dP().af().a("armadilloActivityUpdate");
      cfo.a(this);
      this.dP().af().c();
      if (this.bD() && !this.p_() && --this.cj <= 0) {
         this.a(avh.ak, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
         this.a(ctr.oq);
         this.a(dvu.t);
         this.cj = this.gB();
      }

      super.Y();
   }

   private int gB() {
      return this.ah.a(20 * azc.e * 5) + 20 * azc.e * 5;
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
         case d:
            this.cc.b(this.ai);
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
               this.ce.a(cfn.a.c.b(), 1.0F);
            } else {
               this.ce.b(this.ai);
            }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 64 && this.dP().B) {
         this.ck = true;
         this.dP().a(this.du(), this.dw(), this.dA(), avh.am, this.de(), 1.0F, 1.0F, false);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean o(cto $$0) {
      return $$0.a(awe.ai);
   }

   public static boolean c(bsa<cfn> $$0, day $$1, bss $$2, io $$3, ayk $$4) {
      return $$1.a_($$3.d()).a(avw.bX) && a($$1, $$3);
   }

   public boolean j(bso $$0) {
      if (!this.cK().c(7.0, 2.0, 7.0).c($$0.cK())) {
         return false;
      } else if ($$0.ak().a(avz.d)) {
         return true;
      } else if (this.em() == $$0) {
         return true;
      } else if ($$0 instanceof clw $$1) {
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
      this.a(cfn.a.a($$0.l("state")));
      if ($$0.e("scute_time")) {
         this.cj = $$0.h("scute_time");
      }
   }

   public void gw() {
      if (!this.u()) {
         this.T();
         this.gu();
         this.a(dvu.u);
         this.b(avh.ai);
         this.a(cfn.a.b);
      }
   }

   public void gx() {
      if (this.u()) {
         this.a(dvu.u);
         this.b(avh.al);
         this.a(cfn.a.a);
      }
   }

   @Override
   public boolean a(bqn $$0, float $$1) {
      if (this.u()) {
         $$1 = ($$1 - 1.0F) / 2.0F;
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void f(bqn $$0, float $$1) {
      super.f($$0, $$1);
      if (!this.gf()) {
         if ($$0.d() instanceof bso) {
            this.dS().a(cbs.G, true, 80L);
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
   public bpu b(clw $$0, bpt $$1) {
      cto $$2 = $$0.b($$1);
      if ($$2.a(ctr.xr) && this.gz()) {
         $$2.a(16, $$0, d($$1));
         return bpu.a(this.dP().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(int $$0, boolean $$1) {
      if (this.p_() && $$1) {
         this.b(avh.ac);
      }

      super.a($$0, $$1);
   }

   public boolean gz() {
      if (this.p_()) {
         return false;
      } else {
         this.b(new cto(ctr.oq));
         this.a(dvu.r);
         this.a(avh.ao);
         return true;
      }
   }

   public boolean gA() {
      return !this.gm() && !this.bi() && !this.gc() && !this.bR() && !this.bS();
   }

   @Override
   public void g(@Nullable clw $$0) {
      super.g($$0);
      this.b(avh.ac);
   }

   @Override
   public boolean gq() {
      return super.gq() && !this.u();
   }

   @Override
   public avg d(cto $$0) {
      return avh.ac;
   }

   @Override
   protected avg v() {
      return this.u() ? null : avh.af;
   }

   @Override
   protected avg o_() {
      return avh.ah;
   }

   @Override
   protected avg d(bqn $$0) {
      return this.u() ? avh.ae : avh.ad;
   }

   @Override
   protected void b(io $$0, drb $$1) {
      this.a(avh.ag, 0.15F, 1.0F);
   }

   @Override
   public int aa() {
      return this.u() ? 0 : 32;
   }

   @Override
   protected byk E() {
      return new byk(this) {
         @Override
         public void a() {
            if (!cfn.this.u()) {
               super.a();
            }
         }
      };
   }

   public static enum a implements ayx {
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

      private static final ayx.a<cfn.a> f = ayx.a(cfn.a::values);
      private static final IntFunction<cfn.a> g = awv.a(cfn.a::d, values(), awv.a.a);
      public static final yv<ByteBuf, cfn.a> e = yt.a(g, cfn.a::d);
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

      public static cfn.a a(String $$0) {
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
