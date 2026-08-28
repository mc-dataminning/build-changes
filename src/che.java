import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class che extends cfv {
   public static final float bZ = 0.6F;
   public static final float ca = 32.5F;
   public static final int cb = 80;
   private static final double cg = 7.0;
   private static final double ch = 2.0;
   private static final akg<che.a> ci = akk.a(che.class, aki.B);
   private long cj = 0L;
   public final btd cd = new btd();
   public final btd ce = new btd();
   public final btd cf = new btd();
   private int ck;
   private boolean cl = false;

   public che(btq<? extends cfv> $$0, dds $$1) {
      super($$0, $$1);
      this.P().a(true);
      this.ck = this.gB();
   }

   @Nullable
   @Override
   public btc a(arg $$0, btc $$1) {
      return btq.c.a($$0, btp.e);
   }

   public static bvl.a q() {
      return cfv.gt().a(bvm.s, 12.0).a(bvm.v, 0.14);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(ci, che.a.a);
   }

   public boolean t() {
      return this.am.a(ci) != che.a.a;
   }

   public boolean y() {
      return this.gp().a(this.cj);
   }

   public boolean go() {
      return this.gp() == che.a.b && this.cj > (long)che.a.b.b();
   }

   public che.a gp() {
      return this.am.a(ci);
   }

   @Override
   protected void ac() {
      super.ac();
      agn.a(this);
   }

   public void a(che.a $$0) {
      this.am.a(ci, $$0);
   }

   @Override
   public void a(akg<?> $$0) {
      if (ci.equals($$0)) {
         this.cj = 0L;
      }

      super.a($$0);
   }

   @Override
   protected bvg.b<che> dY() {
      return chf.a();
   }

   @Override
   protected bvg<?> a(Dynamic<?> $$0) {
      return chf.a(this.dY().a($$0));
   }

   @Override
   protected void ad() {
      this.dS().ah().a("armadilloBrain");
      ((bvg<che>)this.bC).a((arg)this.dS(), this);
      this.dS().ah().c();
      this.dS().ah().a("armadilloActivityUpdate");
      chf.a(this);
      this.dS().ah().c();
      if (this.bI() && !this.o_() && --this.ck <= 0) {
         this.a(awd.ak, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
         this.a(cvo.or);
         this.a(dyx.t);
         this.ck = this.gB();
      }

      super.ad();
   }

   private int gB() {
      return this.af.a(20 * bad.e * 5) + 20 * bad.e * 5;
   }

   @Override
   public void l() {
      super.l();
      if (this.dS().w_()) {
         this.gC();
      }

      if (this.t()) {
         this.ah();
      }

      this.cj++;
   }

   @Override
   public float ee() {
      return this.o_() ? 0.6F : 1.0F;
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
            this.ce.b(this.ag);
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
               this.cf.a(this.ag);
               this.cf.a(che.a.c.b(), 1.0F);
            } else {
               this.cf.b(this.ag);
            }
            break;
         case d:
            this.cd.b(this.ag);
            this.ce.a();
            this.cf.a();
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 64 && this.dS().B) {
         this.cl = true;
         this.dS().a(this.dx(), this.dz(), this.dD(), awd.am, this.di(), 1.0F, 1.0F, false);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean p(cvl $$0) {
      return $$0.a(axb.ai);
   }

   public static boolean c(btq<che> $$0, ddt $$1, btp $$2, je $$3, azk $$4) {
      return $$1.a_($$3.e()).a(aws.bY) && a($$1, $$3);
   }

   public boolean j(buf $$0) {
      if (!this.cO().c(7.0, 2.0, 7.0).c($$0.cO())) {
         return false;
      } else if ($$0.ao().a(aww.d)) {
         return true;
      } else if (this.em() == $$0) {
         return true;
      } else if ($$0 instanceof cnp $$1) {
         return $$1.P_() ? false : $$1.cg() || $$1.bW();
      } else {
         return false;
      }
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("state", this.gp().c());
      $$0.a("scute_time", this.ck);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.a(che.a.a($$0.l("state")));
      if ($$0.e("scute_time")) {
         this.ck = $$0.h("scute_time");
      }
   }

   public void gq() {
      if (!this.t()) {
         this.Y();
         this.gz();
         this.a(dyx.u);
         this.b(awd.ai);
         this.a(che.a.b);
      }
   }

   public void gr() {
      if (this.t()) {
         this.a(dyx.u);
         this.b(awd.al);
         this.a(che.a.a);
      }
   }

   @Override
   public boolean a(bsb $$0, float $$1) {
      if (this.t()) {
         $$1 = ($$1 - 1.0F) / 2.0F;
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void f(bsb $$0, float $$1) {
      super.f($$0, $$1);
      if (!this.gd() && !this.eB()) {
         if ($$0.d() instanceof buf) {
            this.dX().a(cdi.G, true, 80L);
            if (this.gA()) {
               this.gq();
            }
         } else if ($$0.a(awu.G)) {
            this.gr();
         }
      }
   }

   @Override
   public brk b(cnp $$0, brj $$1) {
      cvl $$2 = $$0.b($$1);
      if ($$2.a(cvo.xx) && this.gs()) {
         $$2.a(16, $$0, d($$1));
         return brk.a;
      } else {
         return (brk)(this.t() ? brk.d : super.b($$0, $$1));
      }
   }

   public boolean gs() {
      if (this.o_()) {
         return false;
      } else {
         this.b(new cvl(cvo.or));
         this.a(dyx.r);
         this.a(awd.ao);
         return true;
      }
   }

   public boolean gA() {
      return !this.gl() && !this.bm() && !this.K_() && !this.bW() && !this.bX();
   }

   @Override
   public boolean gv() {
      return super.gv() && !this.t();
   }

   @Override
   protected awc w() {
      return this.t() ? null : awd.af;
   }

   @Override
   protected void gu() {
      this.b(awd.ac);
   }

   @Override
   protected awc n_() {
      return awd.ah;
   }

   @Override
   protected awc d(bsb $$0) {
      return this.t() ? awd.ae : awd.ad;
   }

   @Override
   protected void b(je $$0, dua $$1) {
      this.a(awd.ag, 0.15F, 1.0F);
   }

   @Override
   public int ag() {
      return this.t() ? 0 : 32;
   }

   @Override
   protected caa J() {
      return new caa(this) {
         @Override
         public void a() {
            if (!che.this.t()) {
               super.a();
            }
         }
      };
   }

   public static enum a implements azy {
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

      private static final azy.a<che.a> f = azy.a(che.a::values);
      private static final IntFunction<che.a> g = axt.a(che.a::d, values(), axt.a.a);
      public static final zb<ByteBuf, che.a> e = yz.a(g, che.a::d);
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

      public static che.a a(String $$0) {
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
