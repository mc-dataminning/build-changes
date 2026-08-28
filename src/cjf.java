import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cjf extends chw {
   public static final float bZ = 0.6F;
   public static final float ca = 32.5F;
   public static final int cb = 80;
   private static final double cg = 7.0;
   private static final double ch = 2.0;
   private static final alc<cjf.a> ci = alg.a(cjf.class, ale.B);
   private long cj = 0L;
   public final bvb cd = new bvb();
   public final bvb ce = new bvb();
   public final bvb cf = new bvb();
   private int ck;
   private boolean cl = false;

   public cjf(bvq<? extends chw> $$0, dhh $$1) {
      super($$0, $$1);
      this.L().a(true);
      this.ck = this.gB();
   }

   @Nullable
   @Override
   public bva a(ash $$0, bva $$1) {
      return bvq.e.a($$0, bvp.e);
   }

   public static bxm.a p() {
      return chw.gt().a(bxn.s, 12.0).a(bxn.v, 0.14);
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(ci, cjf.a.a);
   }

   public boolean t() {
      return this.al.a(ci) != cjf.a.a;
   }

   public boolean x() {
      return this.gp().a(this.cj);
   }

   public boolean go() {
      return this.gp() == cjf.a.b && this.cj > (long)cjf.a.b.b();
   }

   public cjf.a gp() {
      return this.al.a(ci);
   }

   @Override
   protected void Y() {
      super.Y();
      ahj.a(this);
   }

   public void a(cjf.a $$0) {
      this.al.a(ci, $$0);
   }

   @Override
   public void a(alc<?> $$0) {
      if (ci.equals($$0)) {
         this.cj = 0L;
      }

      super.a($$0);
   }

   @Override
   protected bxh.b<cjf> ed() {
      return cjg.a();
   }

   @Override
   protected bxh<?> a(Dynamic<?> $$0) {
      return cjg.a(this.ed().a($$0));
   }

   @Override
   protected void a(ash $$0) {
      bps $$1 = bpr.a();
      $$1.a("armadilloBrain");
      ((bxh<cjf>)this.bF).a($$0, this);
      $$1.c();
      $$1.a("armadilloActivityUpdate");
      cjg.a(this);
      $$1.c();
      if (this.bL() && !this.e_() && --this.ck <= 0) {
         if (this.a($$0, ewk.aJ, this::a)) {
            this.a(axf.ak, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            this.a(ecq.t);
         }

         this.ck = this.gB();
      }

      super.a($$0);
   }

   private int gB() {
      return this.ae.a(20 * bbg.e * 5) + 20 * bbg.e * 5;
   }

   @Override
   public void h() {
      super.h();
      if (this.dW().B_()) {
         this.gC();
      }

      if (this.t()) {
         this.ab();
      }

      this.cj++;
   }

   @Override
   public float ej() {
      return this.e_() ? 0.6F : 1.0F;
   }

   private void gC() {
      switch (this.gp()) {
         case a:
            this.cd.a();
            this.ce.a();
            this.cf.a();
            break;
         case b:
            this.cd.a();
            this.ce.b(this.af);
            this.cf.a();
            break;
         case c:
            this.cd.a();
            this.ce.a();
            if (this.cl) {
               this.cf.a();
               this.cl = false;
            }

            if (this.cj == 0L) {
               this.cf.a(this.af);
               this.cf.a(cjf.a.c.b(), 1.0F);
            } else {
               this.cf.b(this.af);
            }
            break;
         case d:
            this.cd.b(this.af);
            this.ce.a();
            this.cf.a();
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 64 && this.dW().C) {
         this.cl = true;
         this.dW().a(this.dB(), this.dD(), this.dH(), axf.am, this.dn(), 1.0F, 1.0F, false);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean j(cxo $$0) {
      return $$0.a(ayd.an);
   }

   public static boolean c(bvq<cjf> $$0, dhi $$1, bvp $$2, jh $$3, bam $$4) {
      return $$1.a_($$3.e()).a(axu.bZ) && a($$1, $$3);
   }

   public boolean j(bwf $$0) {
      if (!this.cR().c(7.0, 2.0, 7.0).c($$0.cR())) {
         return false;
      } else if ($$0.aq().a(axy.d)) {
         return true;
      } else if (this.eq() == $$0) {
         return true;
      } else if ($$0 instanceof cpw $$1) {
         return $$1.aa_() ? false : $$1.cj() || $$1.bZ();
      } else {
         return false;
      }
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("state", this.gp().c());
      $$0.a("scute_time", this.ck);
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.a(cjf.a.a($$0.l("state")));
      if ($$0.e("scute_time")) {
         this.ck = $$0.h("scute_time");
      }
   }

   public void gq() {
      if (!this.t()) {
         this.U();
         this.gz();
         this.a(ecq.u);
         this.b(axf.ai);
         this.a(cjf.a.b);
      }
   }

   public void gr() {
      if (this.t()) {
         this.a(ecq.u);
         this.b(axf.al);
         this.a(cjf.a.a);
      }
   }

   @Override
   public boolean a(ash $$0, btz $$1, float $$2) {
      if (this.t()) {
         $$2 = ($$2 - 1.0F) / 2.0F;
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected void b(ash $$0, btz $$1, float $$2) {
      super.b($$0, $$1, $$2);
      if (!this.gb() && !this.eF()) {
         if ($$1.d() instanceof bwf) {
            this.ec().a(cfj.G, true, 80L);
            if (this.gA()) {
               this.gq();
            }
         } else if ($$1.a(axw.G)) {
            this.gr();
         }
      }
   }

   @Override
   public bti b(cpw $$0, bth $$1) {
      cxo $$2 = $$0.b($$1);
      if ($$2.a(cxs.yl) && this.gs()) {
         $$2.a(16, $$0, d($$1));
         return bti.a;
      } else {
         return (bti)(this.t() ? bti.d : super.b($$0, $$1));
      }
   }

   public boolean gs() {
      if (this.e_()) {
         return false;
      } else {
         if (this.dW() instanceof ash $$0) {
            this.a($$0, new cxo(cxs.oM));
            this.a(ecq.r);
            this.a(axf.ao);
         }

         return true;
      }
   }

   public boolean gA() {
      return !this.gl() && !this.bn() && !this.P_() && !this.bZ() && !this.ca();
   }

   @Override
   public boolean gv() {
      return super.gv() && !this.t();
   }

   @Override
   protected axe u() {
      return this.t() ? null : axf.af;
   }

   @Override
   protected void gu() {
      this.b(axf.ac);
   }

   @Override
   protected axe o_() {
      return axf.ah;
   }

   @Override
   protected axe e(btz $$0) {
      return this.t() ? axf.ae : axf.ad;
   }

   @Override
   protected void b(jh $$0, dxu $$1) {
      this.a(axf.ag, 0.15F, 1.0F);
   }

   @Override
   public int aa() {
      return this.t() ? 0 : 32;
   }

   @Override
   protected ccb G() {
      return new ccb(this) {
         @Override
         public void a() {
            if (!cjf.this.t()) {
               super.a();
            }
         }
      };
   }

   public static enum a implements bba {
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

      private static final bba.a<cjf.a> f = bba.a(cjf.a::values);
      private static final IntFunction<cjf.a> g = ayv.a(cjf.a::d, values(), ayv.a.a);
      public static final zt<ByteBuf, cjf.a> e = zr.a(g, cjf.a::d);
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

      public static cjf.a a(String $$0) {
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
