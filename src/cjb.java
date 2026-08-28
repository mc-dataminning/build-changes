import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cjb extends chs {
   public static final float bZ = 0.6F;
   public static final float ca = 32.5F;
   public static final int cb = 80;
   private static final double cg = 7.0;
   private static final double ch = 2.0;
   private static final alc<cjb.a> ci = alg.a(cjb.class, ale.B);
   private long cj = 0L;
   public final bux cd = new bux();
   public final bux ce = new bux();
   public final bux cf = new bux();
   private int ck;
   private boolean cl = false;

   public cjb(bvm<? extends chs> $$0, dha $$1) {
      super($$0, $$1);
      this.L().a(true);
      this.ck = this.gz();
   }

   @Nullable
   @Override
   public buw a(ash $$0, buw $$1) {
      return bvm.e.a($$0, bvl.e);
   }

   public static bxi.a p() {
      return chs.gr().a(bxj.s, 12.0).a(bxj.v, 0.14);
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(ci, cjb.a.a);
   }

   public boolean t() {
      return this.al.a(ci) != cjb.a.a;
   }

   public boolean x() {
      return this.gn().a(this.cj);
   }

   public boolean gm() {
      return this.gn() == cjb.a.b && this.cj > (long)cjb.a.b.b();
   }

   public cjb.a gn() {
      return this.al.a(ci);
   }

   @Override
   protected void Y() {
      super.Y();
      ahj.a(this);
   }

   public void a(cjb.a $$0) {
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
   protected bxd.b<cjb> ec() {
      return cjc.a();
   }

   @Override
   protected bxd<?> a(Dynamic<?> $$0) {
      return cjc.a(this.ec().a($$0));
   }

   @Override
   protected void a(ash $$0) {
      bpo $$1 = bpn.a();
      $$1.a("armadilloBrain");
      ((bxd<cjb>)this.bF).a($$0, this);
      $$1.c();
      $$1.a("armadilloActivityUpdate");
      cjc.a(this);
      $$1.c();
      if (this.bL() && !this.e_() && --this.ck <= 0) {
         if (this.a($$0, ewd.aJ, this::a)) {
            this.a(axf.ak, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            this.a(ecj.t);
         }

         this.ck = this.gz();
      }

      super.a($$0);
   }

   private int gz() {
      return this.ae.a(20 * bbg.e * 5) + 20 * bbg.e * 5;
   }

   @Override
   public void h() {
      super.h();
      if (this.dV().B_()) {
         this.gA();
      }

      if (this.t()) {
         this.ab();
      }

      this.cj++;
   }

   @Override
   public float ei() {
      return this.e_() ? 0.6F : 1.0F;
   }

   private void gA() {
      switch (this.gn()) {
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
               this.cf.a(cjb.a.c.b(), 1.0F);
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
      if ($$0 == 64 && this.dV().C) {
         this.cl = true;
         this.dV().a(this.dA(), this.dC(), this.dG(), axf.am, this.dm(), 1.0F, 1.0F, false);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean j(cxk $$0) {
      return $$0.a(ayd.an);
   }

   public static boolean c(bvm<cjb> $$0, dhb $$1, bvl $$2, jh $$3, bam $$4) {
      return $$1.a_($$3.e()).a(axu.bZ) && a($$1, $$3);
   }

   public boolean j(bwb $$0) {
      if (!this.cR().c(7.0, 2.0, 7.0).c($$0.cR())) {
         return false;
      } else if ($$0.aq().a(axy.d)) {
         return true;
      } else if (this.ep() == $$0) {
         return true;
      } else if ($$0 instanceof cps $$1) {
         return $$1.aa_() ? false : $$1.cj() || $$1.bZ();
      } else {
         return false;
      }
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("state", this.gn().c());
      $$0.a("scute_time", this.ck);
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.a(cjb.a.a($$0.l("state")));
      if ($$0.e("scute_time")) {
         this.ck = $$0.h("scute_time");
      }
   }

   public void go() {
      if (!this.t()) {
         this.U();
         this.gx();
         this.a(ecj.u);
         this.b(axf.ai);
         this.a(cjb.a.b);
      }
   }

   public void gp() {
      if (this.t()) {
         this.a(ecj.u);
         this.b(axf.al);
         this.a(cjb.a.a);
      }
   }

   @Override
   public boolean a(ash $$0, btv $$1, float $$2) {
      if (this.t()) {
         $$2 = ($$2 - 1.0F) / 2.0F;
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected void b(ash $$0, btv $$1, float $$2) {
      super.b($$0, $$1, $$2);
      if (!this.fZ() && !this.eE()) {
         if ($$1.d() instanceof bwb) {
            this.eb().a(cff.G, true, 80L);
            if (this.gy()) {
               this.go();
            }
         } else if ($$1.a(axw.G)) {
            this.gp();
         }
      }
   }

   @Override
   public bte b(cps $$0, btd $$1) {
      cxk $$2 = $$0.b($$1);
      if ($$2.a(cxo.yl) && this.gq()) {
         $$2.a(16, $$0, d($$1));
         return bte.a;
      } else {
         return (bte)(this.t() ? bte.d : super.b($$0, $$1));
      }
   }

   public boolean gq() {
      if (this.e_()) {
         return false;
      } else {
         if (this.dV() instanceof ash $$0) {
            this.a($$0, new cxk(cxo.oM));
            this.a(ecj.r);
            this.a(axf.ao);
         }

         return true;
      }
   }

   public boolean gy() {
      return !this.gj() && !this.bn() && !this.P_() && !this.bZ() && !this.ca();
   }

   @Override
   public boolean gt() {
      return super.gt() && !this.t();
   }

   @Override
   protected axe u() {
      return this.t() ? null : axf.af;
   }

   @Override
   protected void gs() {
      this.b(axf.ac);
   }

   @Override
   protected axe o_() {
      return axf.ah;
   }

   @Override
   protected axe e(btv $$0) {
      return this.t() ? axf.ae : axf.ad;
   }

   @Override
   protected void b(jh $$0, dxn $$1) {
      this.a(axf.ag, 0.15F, 1.0F);
   }

   @Override
   public int aa() {
      return this.t() ? 0 : 32;
   }

   @Override
   protected cbx G() {
      return new cbx(this) {
         @Override
         public void a() {
            if (!cjb.this.t()) {
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

      private static final bba.a<cjb.a> f = bba.a(cjb.a::values);
      private static final IntFunction<cjb.a> g = ayv.a(cjb.a::d, values(), ayv.a.a);
      public static final zt<ByteBuf, cjb.a> e = zr.a(g, cjb.a::d);
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

      public static cjb.a a(String $$0) {
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
