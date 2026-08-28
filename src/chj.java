import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class chj extends cga {
   public static final float bY = 0.6F;
   public static final float bZ = 32.5F;
   public static final int ca = 80;
   private static final double cf = 7.0;
   private static final double cg = 2.0;
   private static final akg<chj.a> ch = akk.a(chj.class, aki.B);
   private long ci = 0L;
   public final bti cc = new bti();
   public final bti cd = new bti();
   public final bti ce = new bti();
   private int cj;
   private boolean ck = false;

   public chj(btv<? extends cga> $$0, deg $$1) {
      super($$0, $$1);
      this.P().a(true);
      this.cj = this.gC();
   }

   @Nullable
   @Override
   public bth a(arh $$0, bth $$1) {
      return btv.c.a($$0, btu.e);
   }

   public static bvq.a q() {
      return cga.gu().a(bvr.s, 12.0).a(bvr.v, 0.14);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(ch, chj.a.a);
   }

   public boolean t() {
      return this.am.a(ch) != chj.a.a;
   }

   public boolean y() {
      return this.gq().a(this.ci);
   }

   public boolean gp() {
      return this.gq() == chj.a.b && this.ci > (long)chj.a.b.b();
   }

   public chj.a gq() {
      return this.am.a(ch);
   }

   @Override
   protected void ac() {
      super.ac();
      agn.a(this);
   }

   public void a(chj.a $$0) {
      this.am.a(ch, $$0);
   }

   @Override
   public void a(akg<?> $$0) {
      if (ch.equals($$0)) {
         this.ci = 0L;
      }

      super.a($$0);
   }

   @Override
   protected bvl.b<chj> dY() {
      return chk.a();
   }

   @Override
   protected bvl<?> a(Dynamic<?> $$0) {
      return chk.a(this.dY().a($$0));
   }

   @Override
   protected void ad() {
      this.dS().ah().a("armadilloBrain");
      ((bvl<chj>)this.bB).a((arh)this.dS(), this);
      this.dS().ah().c();
      this.dS().ah().a("armadilloActivityUpdate");
      chk.a(this);
      this.dS().ah().c();
      if (this.bI() && !this.o_() && --this.cj <= 0) {
         this.a(awe.ak, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
         this.a(cvt.or);
         this.a(dzl.t);
         this.cj = this.gC();
      }

      super.ad();
   }

   private int gC() {
      return this.af.a(20 * bae.e * 5) + 20 * bae.e * 5;
   }

   @Override
   public void l() {
      super.l();
      if (this.dS().w_()) {
         this.gD();
      }

      if (this.t()) {
         this.ah();
      }

      this.ci++;
   }

   @Override
   public float ee() {
      return this.o_() ? 0.6F : 1.0F;
   }

   private void gD() {
      switch (this.gq()) {
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
               this.ce.a(chj.a.c.b(), 1.0F);
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
      if ($$0 == 64 && this.dS().B) {
         this.ck = true;
         this.dS().a(this.dx(), this.dz(), this.dD(), awe.am, this.di(), 1.0F, 1.0F, false);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean n(cvp $$0) {
      return $$0.a(axc.ai);
   }

   public static boolean c(btv<chj> $$0, deh $$1, btu $$2, je $$3, azl $$4) {
      return $$1.a_($$3.e()).a(awt.bY) && a($$1, $$3);
   }

   public boolean j(buk $$0) {
      if (!this.cO().c(7.0, 2.0, 7.0).c($$0.cO())) {
         return false;
      } else if ($$0.ao().a(awx.d)) {
         return true;
      } else if (this.em() == $$0) {
         return true;
      } else if ($$0 instanceof cnu $$1) {
         return $$1.P_() ? false : $$1.cg() || $$1.bW();
      } else {
         return false;
      }
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("state", this.gq().c());
      $$0.a("scute_time", this.cj);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.a(chj.a.a($$0.l("state")));
      if ($$0.e("scute_time")) {
         this.cj = $$0.h("scute_time");
      }
   }

   public void gr() {
      if (!this.t()) {
         this.Y();
         this.gA();
         this.a(dzl.u);
         this.b(awe.ai);
         this.a(chj.a.b);
      }
   }

   public void gs() {
      if (this.t()) {
         this.a(dzl.u);
         this.b(awe.al);
         this.a(chj.a.a);
      }
   }

   @Override
   public boolean a(bsg $$0, float $$1) {
      if (this.t()) {
         $$1 = ($$1 - 1.0F) / 2.0F;
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void f(bsg $$0, float $$1) {
      super.f($$0, $$1);
      if (!this.ge() && !this.eB()) {
         if ($$0.d() instanceof buk) {
            this.dX().a(cdn.G, true, 80L);
            if (this.gB()) {
               this.gr();
            }
         } else if ($$0.a(awv.G)) {
            this.gs();
         }
      }
   }

   @Override
   public brp b(cnu $$0, bro $$1) {
      cvp $$2 = $$0.b($$1);
      if ($$2.a(cvt.xx) && this.gt()) {
         $$2.a(16, $$0, d($$1));
         return brp.a;
      } else {
         return (brp)(this.t() ? brp.d : super.b($$0, $$1));
      }
   }

   public boolean gt() {
      if (this.o_()) {
         return false;
      } else {
         this.b(new cvp(cvt.or));
         this.a(dzl.r);
         this.a(awe.ao);
         return true;
      }
   }

   public boolean gB() {
      return !this.gm() && !this.bm() && !this.K_() && !this.bW() && !this.bX();
   }

   @Override
   public boolean gw() {
      return super.gw() && !this.t();
   }

   @Override
   protected awd w() {
      return this.t() ? null : awe.af;
   }

   @Override
   protected void gv() {
      this.b(awe.ac);
   }

   @Override
   protected awd n_() {
      return awe.ah;
   }

   @Override
   protected awd d(bsg $$0) {
      return this.t() ? awe.ae : awe.ad;
   }

   @Override
   protected void b(je $$0, duo $$1) {
      this.a(awe.ag, 0.15F, 1.0F);
   }

   @Override
   public int ag() {
      return this.t() ? 0 : 32;
   }

   @Override
   protected caf J() {
      return new caf(this) {
         @Override
         public void a() {
            if (!chj.this.t()) {
               super.a();
            }
         }
      };
   }

   public static enum a implements azz {
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

      private static final azz.a<chj.a> f = azz.a(chj.a::values);
      private static final IntFunction<chj.a> g = axu.a(chj.a::d, values(), axu.a.a);
      public static final zb<ByteBuf, chj.a> e = yz.a(g, chj.a::d);
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

      public static chj.a a(String $$0) {
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
