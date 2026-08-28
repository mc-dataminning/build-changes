import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class chv extends cgm {
   public static final float bY = 0.6F;
   public static final float bZ = 32.5F;
   public static final int ca = 80;
   private static final double cf = 7.0;
   private static final double cg = 2.0;
   private static final akk<chv.a> ch = ako.a(chv.class, akm.B);
   private long ci = 0L;
   public final btr cc = new btr();
   public final btr cd = new btr();
   public final btr ce = new btr();
   private int cj;
   private boolean ck = false;

   public chv(bug<? extends cgm> $$0, dev $$1) {
      super($$0, $$1);
      this.P().a(true);
      this.cj = this.gI();
   }

   @Nullable
   @Override
   public btq a(arm $$0, btq $$1) {
      return bug.c.a($$0, buf.e);
   }

   public static bwc.a q() {
      return cgm.gA().a(bwd.s, 12.0).a(bwd.v, 0.14);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(ch, chv.a.a);
   }

   public boolean t() {
      return this.am.a(ch) != chv.a.a;
   }

   public boolean y() {
      return this.gw().a(this.ci);
   }

   public boolean gv() {
      return this.gw() == chv.a.b && this.ci > (long)chv.a.b.b();
   }

   public chv.a gw() {
      return this.am.a(ch);
   }

   @Override
   protected void ab() {
      super.ab();
      agr.a(this);
   }

   public void a(chv.a $$0) {
      this.am.a(ch, $$0);
   }

   @Override
   public void a(akk<?> $$0) {
      if (ch.equals($$0)) {
         this.ci = 0L;
      }

      super.a($$0);
   }

   @Override
   protected bvx.b<chv> ee() {
      return chw.a();
   }

   @Override
   protected bvx<?> a(Dynamic<?> $$0) {
      return chw.a(this.ee().a($$0));
   }

   @Override
   protected void ac() {
      this.dX().ah().a("armadilloBrain");
      ((bvx<chv>)this.bC).a((arm)this.dX(), this);
      this.dX().ah().c();
      this.dX().ah().a("armadilloActivityUpdate");
      chw.a(this);
      this.dX().ah().c();
      if (this.bM() && !this.p_() && --this.cj <= 0) {
         this.a(awk.ak, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
         this.a(cwb.or);
         this.a(eaa.t);
         this.cj = this.gI();
      }

      super.ac();
   }

   private int gI() {
      return this.af.a(20 * bak.e * 5) + 20 * bak.e * 5;
   }

   @Override
   public void l() {
      super.l();
      if (this.dX().y_()) {
         this.gJ();
      }

      if (this.t()) {
         this.ag();
      }

      this.ci++;
   }

   @Override
   public float ek() {
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
               this.ce.a(chv.a.c.b(), 1.0F);
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
      if ($$0 == 64 && this.dX().C) {
         this.ck = true;
         this.dX().a(this.dC(), this.dE(), this.dI(), awk.am, this.dn(), 1.0F, 1.0F, false);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean l(cvx $$0) {
      return $$0.a(axi.aj);
   }

   public static boolean c(bug<chv> $$0, dew $$1, buf $$2, jg $$3, azr $$4) {
      return $$1.a_($$3.e()).a(awz.bY) && a($$1, $$3);
   }

   public boolean j(buv $$0) {
      if (!this.cS().c(7.0, 2.0, 7.0).c($$0.cS())) {
         return false;
      } else if ($$0.aq().a(axd.d)) {
         return true;
      } else if (this.es() == $$0) {
         return true;
      } else if ($$0 instanceof coh $$1) {
         return $$1.R_() ? false : $$1.ck() || $$1.ca();
      } else {
         return false;
      }
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      $$0.a("state", this.gw().c());
      $$0.a("scute_time", this.cj);
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      this.a(chv.a.a($$0.l("state")));
      if ($$0.e("scute_time")) {
         this.cj = $$0.h("scute_time");
      }
   }

   public void gx() {
      if (!this.t()) {
         this.X();
         this.gG();
         this.a(eaa.u);
         this.b(awk.ai);
         this.a(chv.a.b);
      }
   }

   public void gy() {
      if (this.t()) {
         this.a(eaa.u);
         this.b(awk.al);
         this.a(chv.a.a);
      }
   }

   @Override
   public boolean a(bsp $$0, float $$1) {
      if (this.t()) {
         $$1 = ($$1 - 1.0F) / 2.0F;
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void f(bsp $$0, float $$1) {
      super.f($$0, $$1);
      if (!this.gi() && !this.eH()) {
         if ($$0.d() instanceof buv) {
            this.ed().a(cdz.G, true, 80L);
            if (this.gH()) {
               this.gx();
            }
         } else if ($$0.a(axb.G)) {
            this.gy();
         }
      }
   }

   @Override
   public bry b(coh $$0, brx $$1) {
      cvx $$2 = $$0.b($$1);
      if ($$2.a(cwb.xx) && this.gz()) {
         $$2.a(16, $$0, d($$1));
         return bry.a;
      } else {
         return (bry)(this.t() ? bry.d : super.b($$0, $$1));
      }
   }

   public boolean gz() {
      if (this.p_()) {
         return false;
      } else {
         this.b(new cvx(cwb.or));
         this.a(eaa.r);
         this.a(awk.ao);
         return true;
      }
   }

   public boolean gH() {
      return !this.gs() && !this.bo() && !this.M_() && !this.ca() && !this.cb();
   }

   @Override
   public boolean gC() {
      return super.gC() && !this.t();
   }

   @Override
   protected awj w() {
      return this.t() ? null : awk.af;
   }

   @Override
   protected void gB() {
      this.b(awk.ac);
   }

   @Override
   protected awj o_() {
      return awk.ah;
   }

   @Override
   protected awj d(bsp $$0) {
      return this.t() ? awk.ae : awk.ad;
   }

   @Override
   protected void b(jg $$0, dvd $$1) {
      this.a(awk.ag, 0.15F, 1.0F);
   }

   @Override
   public int ae() {
      return this.t() ? 0 : 32;
   }

   @Override
   protected car J() {
      return new car(this) {
         @Override
         public void a() {
            if (!chv.this.t()) {
               super.a();
            }
         }
      };
   }

   public static enum a implements baf {
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

      private static final baf.a<chv.a> f = baf.a(chv.a::values);
      private static final IntFunction<chv.a> g = aya.a(chv.a::d, values(), aya.a.a);
      public static final zf<ByteBuf, chv.a> e = zd.a(g, chv.a::d);
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

      public static chv.a a(String $$0) {
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
