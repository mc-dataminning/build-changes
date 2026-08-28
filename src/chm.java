import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class chm extends cgd {
   public static final float bY = 0.6F;
   public static final float bZ = 32.5F;
   public static final int ca = 80;
   private static final double cf = 7.0;
   private static final double cg = 2.0;
   private static final akh<chm.a> ch = akl.a(chm.class, akj.B);
   private long ci = 0L;
   public final btl cc = new btl();
   public final btl cd = new btl();
   public final btl ce = new btl();
   private int cj;
   private boolean ck = false;

   public chm(bty<? extends cgd> $$0, dej $$1) {
      super($$0, $$1);
      this.P().a(true);
      this.cj = this.gB();
   }

   @Nullable
   @Override
   public btk a(arj $$0, btk $$1) {
      return bty.c.a($$0, btx.e);
   }

   public static bvt.a q() {
      return cgd.gt().a(bvu.s, 12.0).a(bvu.v, 0.14);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(ch, chm.a.a);
   }

   public boolean t() {
      return this.am.a(ch) != chm.a.a;
   }

   public boolean y() {
      return this.gp().a(this.ci);
   }

   public boolean go() {
      return this.gp() == chm.a.b && this.ci > (long)chm.a.b.b();
   }

   public chm.a gp() {
      return this.am.a(ch);
   }

   @Override
   protected void ab() {
      super.ab();
      ago.a(this);
   }

   public void a(chm.a $$0) {
      this.am.a(ch, $$0);
   }

   @Override
   public void a(akh<?> $$0) {
      if (ch.equals($$0)) {
         this.ci = 0L;
      }

      super.a($$0);
   }

   @Override
   protected bvo.b<chm> dZ() {
      return chn.a();
   }

   @Override
   protected bvo<?> a(Dynamic<?> $$0) {
      return chn.a(this.dZ().a($$0));
   }

   @Override
   protected void ac() {
      this.dS().ah().a("armadilloBrain");
      ((bvo<chm>)this.bB).a((arj)this.dS(), this);
      this.dS().ah().c();
      this.dS().ah().a("armadilloActivityUpdate");
      chn.a(this);
      this.dS().ah().c();
      if (this.bI() && !this.p_() && --this.cj <= 0) {
         this.a(awg.ak, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
         this.a(cvw.or);
         this.a(dzp.t);
         this.cj = this.gB();
      }

      super.ac();
   }

   private int gB() {
      return this.af.a(20 * bag.e * 5) + 20 * bag.e * 5;
   }

   @Override
   public void l() {
      super.l();
      if (this.dS().x_()) {
         this.gC();
      }

      if (this.t()) {
         this.ag();
      }

      this.ci++;
   }

   @Override
   public float ef() {
      return this.p_() ? 0.6F : 1.0F;
   }

   private void gC() {
      switch (this.gp()) {
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
               this.ce.a(chm.a.c.b(), 1.0F);
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
         this.dS().a(this.dx(), this.dz(), this.dD(), awg.am, this.di(), 1.0F, 1.0F, false);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean n(cvs $$0) {
      return $$0.a(axe.ai);
   }

   public static boolean c(bty<chm> $$0, dek $$1, btx $$2, jf $$3, azn $$4) {
      return $$1.a_($$3.e()).a(awv.bY) && a($$1, $$3);
   }

   public boolean j(bun $$0) {
      if (!this.cO().c(7.0, 2.0, 7.0).c($$0.cO())) {
         return false;
      } else if ($$0.ao().a(awz.d)) {
         return true;
      } else if (this.en() == $$0) {
         return true;
      } else if ($$0 instanceof cnx $$1) {
         return $$1.Q_() ? false : $$1.cg() || $$1.bW();
      } else {
         return false;
      }
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      $$0.a("state", this.gp().c());
      $$0.a("scute_time", this.cj);
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      this.a(chm.a.a($$0.l("state")));
      if ($$0.e("scute_time")) {
         this.cj = $$0.h("scute_time");
      }
   }

   public void gq() {
      if (!this.t()) {
         this.X();
         this.gz();
         this.a(dzp.u);
         this.b(awg.ai);
         this.a(chm.a.b);
      }
   }

   public void gr() {
      if (this.t()) {
         this.a(dzp.u);
         this.b(awg.al);
         this.a(chm.a.a);
      }
   }

   @Override
   public boolean a(bsj $$0, float $$1) {
      if (this.t()) {
         $$1 = ($$1 - 1.0F) / 2.0F;
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void f(bsj $$0, float $$1) {
      super.f($$0, $$1);
      if (!this.gd() && !this.eC()) {
         if ($$0.d() instanceof bun) {
            this.dY().a(cdq.G, true, 80L);
            if (this.gA()) {
               this.gq();
            }
         } else if ($$0.a(awx.G)) {
            this.gr();
         }
      }
   }

   @Override
   public brs b(cnx $$0, brr $$1) {
      cvs $$2 = $$0.b($$1);
      if ($$2.a(cvw.xx) && this.gs()) {
         $$2.a(16, $$0, d($$1));
         return brs.a;
      } else {
         return (brs)(this.t() ? brs.d : super.b($$0, $$1));
      }
   }

   public boolean gs() {
      if (this.p_()) {
         return false;
      } else {
         this.b(new cvs(cvw.or));
         this.a(dzp.r);
         this.a(awg.ao);
         return true;
      }
   }

   public boolean gA() {
      return !this.gl() && !this.bm() && !this.L_() && !this.bW() && !this.bX();
   }

   @Override
   public boolean gv() {
      return super.gv() && !this.t();
   }

   @Override
   protected awf w() {
      return this.t() ? null : awg.af;
   }

   @Override
   protected void gu() {
      this.b(awg.ac);
   }

   @Override
   protected awf o_() {
      return awg.ah;
   }

   @Override
   protected awf d(bsj $$0) {
      return this.t() ? awg.ae : awg.ad;
   }

   @Override
   protected void b(jf $$0, dus $$1) {
      this.a(awg.ag, 0.15F, 1.0F);
   }

   @Override
   public int ae() {
      return this.t() ? 0 : 32;
   }

   @Override
   protected cai J() {
      return new cai(this) {
         @Override
         public void a() {
            if (!chm.this.t()) {
               super.a();
            }
         }
      };
   }

   public static enum a implements bab {
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

      private static final bab.a<chm.a> f = bab.a(chm.a::values);
      private static final IntFunction<chm.a> g = axw.a(chm.a::d, values(), axw.a.a);
      public static final zc<ByteBuf, chm.a> e = za.a(g, chm.a::d);
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

      public static chm.a a(String $$0) {
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
