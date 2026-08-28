import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cgo extends cff {
   public static final float bY = 0.6F;
   public static final float bZ = 32.5F;
   public static final int cb = 80;
   private static final double cf = 7.0;
   private static final double cg = 2.0;
   private static final akk<cgo.a> ch = ako.a(cgo.class, akm.B);
   private long ci = 0L;
   public final bsp cc = new bsp();
   public final bsp cd = new bsp();
   public final bsp ce = new bsp();
   private int cj;
   private boolean ck = false;

   public cgo(bta<? extends cff> $$0, dby $$1) {
      super($$0, $$1);
      this.K().a(true);
      this.cj = this.gC();
   }

   @Nullable
   @Override
   public bso a(arf $$0, bso $$1) {
      return bta.c.a((dby)$$0);
   }

   public static buw.a s() {
      return btr.A().a(bux.q, 12.0).a(bux.r, 0.14);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(ch, cgo.a.a);
   }

   public boolean u() {
      return this.ao.a(ch) != cgo.a.a;
   }

   public boolean y() {
      return this.gw().a(this.ci);
   }

   public boolean gq() {
      return this.gw() == cgo.a.b && this.ci > (long)cgo.a.b.b();
   }

   public cgo.a gw() {
      return this.ao.a(ch);
   }

   @Override
   protected void Y() {
      super.Y();
      agt.a(this);
   }

   public void a(cgo.a $$0) {
      this.ao.a(ch, $$0);
   }

   @Override
   public void a(akk<?> $$0) {
      if (ch.equals($$0)) {
         this.ci = 0L;
      }

      super.a($$0);
   }

   @Override
   protected bur.b<cgo> dT() {
      return cgp.a();
   }

   @Override
   protected bur<?> a(Dynamic<?> $$0) {
      return cgp.a(this.dT().a($$0));
   }

   @Override
   protected void Z() {
      this.dP().ag().a("armadilloBrain");
      ((bur<cgo>)this.bD).a((arf)this.dP(), this);
      this.dP().ag().c();
      this.dP().ag().a("armadilloActivityUpdate");
      cgp.a(this);
      this.dP().ag().c();
      if (this.bD() && !this.p_() && --this.cj <= 0) {
         this.a(awa.ak, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
         this.a(cus.oq);
         this.a(dwv.t);
         this.cj = this.gC();
      }

      super.Z();
   }

   private int gC() {
      return this.ah.a(20 * azz.e * 5) + 20 * azz.e * 5;
   }

   @Override
   public void l() {
      super.l();
      if (this.dP().x_()) {
         this.gD();
      }

      if (this.u()) {
         this.ad();
      }

      this.ci++;
   }

   @Override
   public float ed() {
      return this.p_() ? 0.6F : 1.0F;
   }

   private void gD() {
      switch (this.gw()) {
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
               this.ce.a(cgo.a.c.b(), 1.0F);
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
         this.dP().a(this.du(), this.dw(), this.dA(), awa.am, this.de(), 1.0F, 1.0F, false);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean o(cup $$0) {
      return $$0.a(awy.ai);
   }

   public static boolean c(bta<cgo> $$0, dbz $$1, btt $$2, iz $$3, azh $$4) {
      return $$1.a_($$3.d()).a(awp.bX) && a($$1, $$3);
   }

   public boolean j(btp $$0) {
      if (!this.cK().c(7.0, 2.0, 7.0).c($$0.cK())) {
         return false;
      } else if ($$0.ak().a(awt.d)) {
         return true;
      } else if (this.em() == $$0) {
         return true;
      } else if ($$0 instanceof cmx $$1) {
         return $$1.N_() ? false : $$1.cb() || $$1.bR();
      } else {
         return false;
      }
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      $$0.a("state", this.gw().c());
      $$0.a("scute_time", this.cj);
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      this.a(cgo.a.a($$0.l("state")));
      if ($$0.e("scute_time")) {
         this.cj = $$0.h("scute_time");
      }
   }

   public void gx() {
      if (!this.u()) {
         this.U();
         this.gv();
         this.a(dwv.u);
         this.b(awa.ai);
         this.a(cgo.a.b);
      }
   }

   public void gy() {
      if (this.u()) {
         this.a(dwv.u);
         this.b(awa.al);
         this.a(cgo.a.a);
      }
   }

   @Override
   public boolean a(brn $$0, float $$1) {
      if (this.u()) {
         $$1 = ($$1 - 1.0F) / 2.0F;
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void f(brn $$0, float $$1) {
      super.f($$0, $$1);
      if (!this.gg() && !this.eB()) {
         if ($$0.d() instanceof btp) {
            this.dS().a(cct.G, true, 80L);
            if (this.gB()) {
               this.gx();
            }
         } else if (this.gz()) {
            this.gy();
         }
      }
   }

   public boolean gz() {
      return this.bQ() || this.dE();
   }

   @Override
   public bqu b(cmx $$0, bqt $$1) {
      cup $$2 = $$0.b($$1);
      if ($$2.a(cus.xr) && this.gA()) {
         $$2.a(16, $$0, d($$1));
         return bqu.a(this.dP().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(int $$0, boolean $$1) {
      if (this.p_() && $$1) {
         this.b(awa.ac);
      }

      super.a($$0, $$1);
   }

   public boolean gA() {
      if (this.p_()) {
         return false;
      } else {
         this.b(new cup(cus.oq));
         this.a(dwv.r);
         this.a(awa.ao);
         return true;
      }
   }

   public boolean gB() {
      return !this.gn() && !this.bi() && !this.gd() && !this.bR() && !this.bS();
   }

   @Override
   public void g(@Nullable cmx $$0) {
      super.g($$0);
      this.b(awa.ac);
   }

   @Override
   public boolean gr() {
      return super.gr() && !this.u();
   }

   @Override
   public avz d(cup $$0) {
      return awa.ac;
   }

   @Override
   protected avz v() {
      return this.u() ? null : awa.af;
   }

   @Override
   protected avz o_() {
      return awa.ah;
   }

   @Override
   protected avz d(brn $$0) {
      return this.u() ? awa.ae : awa.ad;
   }

   @Override
   protected void b(iz $$0, dsc $$1) {
      this.a(awa.ag, 0.15F, 1.0F);
   }

   @Override
   public int ab() {
      return this.u() ? 0 : 32;
   }

   @Override
   protected bzl E() {
      return new bzl(this) {
         @Override
         public void a() {
            if (!cgo.this.u()) {
               super.a();
            }
         }
      };
   }

   public static enum a implements azu {
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

      private static final azu.a<cgo.a> f = azu.a(cgo.a::values);
      private static final IntFunction<cgo.a> g = axp.a(cgo.a::d, values(), axp.a.a);
      public static final zn<ByteBuf, cgo.a> e = zl.a(g, cgo.a::d);
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

      public static cgo.a a(String $$0) {
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
