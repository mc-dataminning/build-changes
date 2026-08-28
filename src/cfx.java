import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cfx extends ceo {
   public static final float ca = 0.6F;
   public static final float cb = 32.5F;
   public static final int cd = 80;
   private static final double ch = 7.0;
   private static final double ci = 2.0;
   private static final ajp<cfx.a> cj = ajt.a(cfx.class, ajr.B);
   private long ck = 0L;
   public final bry ce = new bry();
   public final bry cf = new bry();
   public final bry cg = new bry();
   private int cl;
   private boolean cm = false;

   public cfx(bsj<? extends ceo> $$0, dcd $$1) {
      super($$0, $$1);
      this.K().a(true);
      this.cl = this.gz();
   }

   @Nullable
   @Override
   public brx a(aqk $$0, brx $$1) {
      return bsj.c.a((dcd)$$0);
   }

   public static buf.a s() {
      return bta.A().a(bug.s, 12.0).a(bug.v, 0.14);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(cj, cfx.a.a);
   }

   public boolean u() {
      return this.ao.a(cj) != cfx.a.a;
   }

   public boolean y() {
      return this.gt().a(this.ck);
   }

   public boolean gn() {
      return this.gt() == cfx.a.b && this.ck > (long)cfx.a.b.b();
   }

   public cfx.a gt() {
      return this.ao.a(cj);
   }

   @Override
   protected void Y() {
      super.Y();
      afy.a(this);
   }

   public void a(cfx.a $$0) {
      this.ao.a(cj, $$0);
   }

   @Override
   public void a(ajp<?> $$0) {
      if (cj.equals($$0)) {
         this.ck = 0L;
      }

      super.a($$0);
   }

   @Override
   protected bua.b<cfx> dU() {
      return cfy.a();
   }

   @Override
   protected bua<?> a(Dynamic<?> $$0) {
      return cfy.a(this.dU().a($$0));
   }

   @Override
   protected void Z() {
      this.dP().ag().a("armadilloBrain");
      ((bua<cfx>)this.bF).a((aqk)this.dP(), this);
      this.dP().ag().c();
      this.dP().ag().a("armadilloActivityUpdate");
      cfy.a(this);
      this.dP().ag().c();
      if (this.bD() && !this.p_() && --this.cl <= 0) {
         this.a(avf.ak, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
         this.a(cud.oq);
         this.a(dxa.t);
         this.cl = this.gz();
      }

      super.Z();
   }

   private int gz() {
      return this.ah.a(20 * aze.e * 5) + 20 * aze.e * 5;
   }

   @Override
   public void l() {
      super.l();
      if (this.dP().x_()) {
         this.gA();
      }

      if (this.u()) {
         this.ad();
      }

      this.ck++;
   }

   @Override
   public float ea() {
      return this.p_() ? 0.6F : 1.0F;
   }

   private void gA() {
      switch (this.gt()) {
         case a:
            this.ce.a();
            this.cf.a();
            this.cg.a();
            break;
         case b:
            this.ce.a();
            this.cf.b(this.ai);
            this.cg.a();
            break;
         case c:
            this.ce.a();
            this.cf.a();
            if (this.cm) {
               this.cg.a();
               this.cm = false;
            }

            if (this.ck == 0L) {
               this.cg.a(this.ai);
               this.cg.a(cfx.a.c.b(), 1.0F);
            } else {
               this.cg.b(this.ai);
            }
            break;
         case d:
            this.ce.b(this.ai);
            this.cf.a();
            this.cg.a();
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 64 && this.dP().B) {
         this.cm = true;
         this.dP().a(this.du(), this.dw(), this.dA(), avf.am, this.de(), 1.0F, 1.0F, false);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean o(cua $$0) {
      return $$0.a(awd.ai);
   }

   public static boolean c(bsj<cfx> $$0, dce $$1, btc $$2, ja $$3, aym $$4) {
      return $$1.a_($$3.d()).a(avu.bX) && a($$1, $$3);
   }

   public boolean j(bsy $$0) {
      if (!this.cK().c(7.0, 2.0, 7.0).c($$0.cK())) {
         return false;
      } else if ($$0.ak().a(avy.d)) {
         return true;
      } else if (this.ei() == $$0) {
         return true;
      } else if ($$0 instanceof cmh $$1) {
         return $$1.N_() ? false : $$1.cb() || $$1.bR();
      } else {
         return false;
      }
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("state", this.gt().c());
      $$0.a("scute_time", this.cl);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a(cfx.a.a($$0.l("state")));
      if ($$0.e("scute_time")) {
         this.cl = $$0.h("scute_time");
      }
   }

   public void gu() {
      if (!this.u()) {
         this.U();
         this.gs();
         this.a(dxa.u);
         this.b(avf.ai);
         this.a(cfx.a.b);
      }
   }

   public void gv() {
      if (this.u()) {
         this.a(dxa.u);
         this.b(avf.al);
         this.a(cfx.a.a);
      }
   }

   @Override
   public boolean a(bqw $$0, float $$1) {
      if (this.u()) {
         $$1 = ($$1 - 1.0F) / 2.0F;
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void f(bqw $$0, float $$1) {
      super.f($$0, $$1);
      if (!this.gc() && !this.ex()) {
         if ($$0.d() instanceof bsy) {
            this.dT().a(ccc.G, true, 80L);
            if (this.gy()) {
               this.gu();
            }
         } else if (this.gw()) {
            this.gv();
         }
      }
   }

   public boolean gw() {
      return this.bQ() || this.dE();
   }

   @Override
   public bqd b(cmh $$0, bqc $$1) {
      cua $$2 = $$0.b($$1);
      if ($$2.a(cud.xu) && this.gx()) {
         $$2.a(16, $$0, d($$1));
         return bqd.a(this.dP().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(int $$0, boolean $$1) {
      if (this.p_() && $$1) {
         this.b(avf.ac);
      }

      super.a($$0, $$1);
   }

   public boolean gx() {
      if (this.p_()) {
         return false;
      } else {
         this.b(new cua(cud.oq));
         this.a(dxa.r);
         this.a(avf.ao);
         return true;
      }
   }

   public boolean gy() {
      return !this.gk() && !this.bi() && !this.fZ() && !this.bR() && !this.bS();
   }

   @Override
   public void g(@Nullable cmh $$0) {
      super.g($$0);
      this.b(avf.ac);
   }

   @Override
   public boolean go() {
      return super.go() && !this.u();
   }

   @Override
   public ave d(cua $$0) {
      return avf.ac;
   }

   @Override
   protected ave v() {
      return this.u() ? null : avf.af;
   }

   @Override
   protected ave o_() {
      return avf.ah;
   }

   @Override
   protected ave d(bqw $$0) {
      return this.u() ? avf.ae : avf.ad;
   }

   @Override
   protected void b(ja $$0, dsh $$1) {
      this.a(avf.ag, 0.15F, 1.0F);
   }

   @Override
   public int ab() {
      return this.u() ? 0 : 32;
   }

   @Override
   protected byu E() {
      return new byu(this) {
         @Override
         public void a() {
            if (!cfx.this.u()) {
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

      private static final ayz.a<cfx.a> f = ayz.a(cfx.a::values);
      private static final IntFunction<cfx.a> g = awu.a(cfx.a::d, values(), awu.a.a);
      public static final ys<ByteBuf, cfx.a> e = yq.a(g, cfx.a::d);
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

      public static cfx.a a(String $$0) {
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
