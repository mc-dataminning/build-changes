import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cie extends cgv {
   public static final float bY = 0.6F;
   public static final float bZ = 32.5F;
   public static final int ca = 80;
   private static final double cf = 7.0;
   private static final double cg = 2.0;
   private static final ako<cie.a> ch = aks.a(cie.class, akq.B);
   private long ci = 0L;
   public final bua cc = new bua();
   public final bua cd = new bua();
   public final bua ce = new bua();
   private int cj;
   private boolean ck = false;

   public cie(bup<? extends cgv> $$0, dff $$1) {
      super($$0, $$1);
      this.P().a(true);
      this.cj = this.gI();
   }

   @Nullable
   @Override
   public btz a(arq $$0, btz $$1) {
      return bup.c.a($$0, buo.e);
   }

   public static bwl.a q() {
      return cgv.gA().a(bwm.s, 12.0).a(bwm.v, 0.14);
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(ch, cie.a.a);
   }

   public boolean t() {
      return this.am.a(ch) != cie.a.a;
   }

   public boolean y() {
      return this.gw().a(this.ci);
   }

   public boolean gv() {
      return this.gw() == cie.a.b && this.ci > (long)cie.a.b.b();
   }

   public cie.a gw() {
      return this.am.a(ch);
   }

   @Override
   protected void ab() {
      super.ab();
      agv.a(this);
   }

   public void a(cie.a $$0) {
      this.am.a(ch, $$0);
   }

   @Override
   public void a(ako<?> $$0) {
      if (ch.equals($$0)) {
         this.ci = 0L;
      }

      super.a($$0);
   }

   @Override
   protected bwg.b<cie> ef() {
      return cif.a();
   }

   @Override
   protected bwg<?> a(Dynamic<?> $$0) {
      return cif.a(this.ef().a($$0));
   }

   @Override
   protected void ac() {
      bor $$0 = boq.a();
      $$0.a("armadilloBrain");
      ((bwg<cie>)this.bF).a((arq)this.dY(), this);
      $$0.c();
      $$0.a("armadilloActivityUpdate");
      cif.a(this);
      $$0.c();
      if (this.bN() && !this.p_() && --this.cj <= 0) {
         if (this.a(euc.aJ, this::b)) {
            this.a(awo.ak, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
            this.a(eak.t);
         }

         this.cj = this.gI();
      }

      super.ac();
   }

   private int gI() {
      return this.af.a(20 * bap.e * 5) + 20 * bap.e * 5;
   }

   @Override
   public void l() {
      super.l();
      if (this.dY().y_()) {
         this.gJ();
      }

      if (this.t()) {
         this.ag();
      }

      this.ci++;
   }

   @Override
   public float el() {
      return this.p_() ? 0.6F : 1.0F;
   }

   private void gJ() {
      switch (this.gw()) {
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
               this.ce.a(cie.a.c.b(), 1.0F);
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
      if ($$0 == 64 && this.dY().C) {
         this.ck = true;
         this.dY().a(this.dD(), this.dF(), this.dJ(), awo.am, this.do(), 1.0F, 1.0F, false);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean l(cwf $$0) {
      return $$0.a(axm.am);
   }

   public static boolean c(bup<cie> $$0, dfg $$1, buo $$2, jh $$3, azv $$4) {
      return $$1.a_($$3.e()).a(axd.bY) && a($$1, $$3);
   }

   public boolean j(bve $$0) {
      if (!this.cT().c(7.0, 2.0, 7.0).c($$0.cT())) {
         return false;
      } else if ($$0.ar().a(axh.d)) {
         return true;
      } else if (this.et() == $$0) {
         return true;
      } else if ($$0 instanceof cor $$1) {
         return $$1.R_() ? false : $$1.cl() || $$1.cb();
      } else {
         return false;
      }
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      $$0.a("state", this.gw().c());
      $$0.a("scute_time", this.cj);
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      this.a(cie.a.a($$0.l("state")));
      if ($$0.e("scute_time")) {
         this.cj = $$0.h("scute_time");
      }
   }

   public void gx() {
      if (!this.t()) {
         this.X();
         this.gG();
         this.a(eak.u);
         this.b(awo.ai);
         this.a(cie.a.b);
      }
   }

   public void gy() {
      if (this.t()) {
         this.a(eak.u);
         this.b(awo.al);
         this.a(cie.a.a);
      }
   }

   @Override
   public boolean a(bsy $$0, float $$1) {
      if (this.t()) {
         $$1 = ($$1 - 1.0F) / 2.0F;
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void f(bsy $$0, float $$1) {
      super.f($$0, $$1);
      if (!this.gi() && !this.eI()) {
         if ($$0.d() instanceof bve) {
            this.ee().a(cei.G, true, 80L);
            if (this.gH()) {
               this.gx();
            }
         } else if ($$0.a(axf.G)) {
            this.gy();
         }
      }
   }

   @Override
   public bsh b(cor $$0, bsg $$1) {
      cwf $$2 = $$0.b($$1);
      if ($$2.a(cwj.xN) && this.gz()) {
         $$2.a(16, $$0, d($$1));
         return bsh.a;
      } else {
         return (bsh)(this.t() ? bsh.d : super.b($$0, $$1));
      }
   }

   public boolean gz() {
      if (this.p_()) {
         return false;
      } else {
         this.b(new cwf(cwj.or));
         this.a(eak.r);
         this.a(awo.ao);
         return true;
      }
   }

   public boolean gH() {
      return !this.gs() && !this.bp() && !this.M_() && !this.cb() && !this.cc();
   }

   @Override
   public boolean gC() {
      return super.gC() && !this.t();
   }

   @Override
   protected awn w() {
      return this.t() ? null : awo.af;
   }

   @Override
   protected void gB() {
      this.b(awo.ac);
   }

   @Override
   protected awn o_() {
      return awo.ah;
   }

   @Override
   protected awn d(bsy $$0) {
      return this.t() ? awo.ae : awo.ad;
   }

   @Override
   protected void b(jh $$0, dvo $$1) {
      this.a(awo.ag, 0.15F, 1.0F);
   }

   @Override
   public int ae() {
      return this.t() ? 0 : 32;
   }

   @Override
   protected cba J() {
      return new cba(this) {
         @Override
         public void a() {
            if (!cie.this.t()) {
               super.a();
            }
         }
      };
   }

   public static enum a implements baj {
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

      private static final baj.a<cie.a> f = baj.a(cie.a::values);
      private static final IntFunction<cie.a> g = aye.a(cie.a::d, values(), aye.a.a);
      public static final zj<ByteBuf, cie.a> e = zh.a(g, cie.a::d);
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

      public static cie.a a(String $$0) {
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
