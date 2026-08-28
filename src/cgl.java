import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cgl extends cfc {
   public static final float ca = 0.6F;
   public static final float cb = 32.5F;
   public static final int cc = 80;
   private static final double ch = 7.0;
   private static final double ci = 2.0;
   private static final ajv<cgl.a> cj = ajz.a(cgl.class, ajx.B);
   private long ck = 0L;
   public final bsl ce = new bsl();
   public final bsl cf = new bsl();
   public final bsl cg = new bsl();
   private int cl;
   private boolean cm = false;

   public cgl(bsw<? extends cfc> $$0, dcu $$1) {
      super($$0, $$1);
      this.J().a(true);
      this.cl = this.gx();
   }

   @Nullable
   @Override
   public bsk a(aqt $$0, bsk $$1) {
      return bsw.c.a((dcu)$$0);
   }

   public static but.a s() {
      return btn.A().a(buu.s, 12.0).a(buu.v, 0.14);
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(cj, cgl.a.a);
   }

   public boolean t() {
      return this.ao.a(cj) != cgl.a.a;
   }

   public boolean x() {
      return this.gn().a(this.ck);
   }

   public boolean gm() {
      return this.gn() == cgl.a.b && this.ck > (long)cgl.a.b.b();
   }

   public cgl.a gn() {
      return this.ao.a(cj);
   }

   @Override
   protected void Y() {
      super.Y();
      age.a(this);
   }

   public void a(cgl.a $$0) {
      this.ao.a(cj, $$0);
   }

   @Override
   public void a(ajv<?> $$0) {
      if (cj.equals($$0)) {
         this.ck = 0L;
      }

      super.a($$0);
   }

   @Override
   protected buo.b<cgl> dV() {
      return cgm.a();
   }

   @Override
   protected buo<?> a(Dynamic<?> $$0) {
      return cgm.a(this.dV().a($$0));
   }

   @Override
   protected void Z() {
      this.dQ().ag().a("armadilloBrain");
      ((buo<cgl>)this.bF).a((aqt)this.dQ(), this);
      this.dQ().ag().c();
      this.dQ().ag().a("armadilloActivityUpdate");
      cgm.a(this);
      this.dQ().ag().c();
      if (this.bE() && !this.o_() && --this.cl <= 0) {
         this.a(avo.ak, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
         this.a(cur.oq);
         this.a(dxw.t);
         this.cl = this.gx();
      }

      super.Z();
   }

   private int gx() {
      return this.ah.a(20 * azo.e * 5) + 20 * azo.e * 5;
   }

   @Override
   public void l() {
      super.l();
      if (this.dQ().x_()) {
         this.gy();
      }

      if (this.t()) {
         this.ac();
      }

      this.ck++;
   }

   @Override
   public float eb() {
      return this.o_() ? 0.6F : 1.0F;
   }

   private void gy() {
      switch (this.gn()) {
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
               this.cg.a(cgl.a.c.b(), 1.0F);
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
      if ($$0 == 64 && this.dQ().B) {
         this.cm = true;
         this.dQ().a(this.dv(), this.dx(), this.dB(), avo.am, this.df(), 1.0F, 1.0F, false);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean o(cuo $$0) {
      return $$0.a(awm.ai);
   }

   public static boolean c(bsw<cgl> $$0, dcv $$1, btp $$2, jd $$3, ayv $$4) {
      return $$1.a_($$3.d()).a(awd.bX) && a($$1, $$3);
   }

   public boolean j(btl $$0) {
      if (!this.cL().c(7.0, 2.0, 7.0).c($$0.cL())) {
         return false;
      } else if ($$0.am().a(awh.d)) {
         return true;
      } else if (this.ej() == $$0) {
         return true;
      } else if ($$0 instanceof cmv $$1) {
         return $$1.N_() ? false : $$1.cc() || $$1.bS();
      } else {
         return false;
      }
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("state", this.gn().c());
      $$0.a("scute_time", this.cl);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a(cgl.a.a($$0.l("state")));
      if ($$0.e("scute_time")) {
         this.cl = $$0.h("scute_time");
      }
   }

   public void go() {
      if (!this.t()) {
         this.U();
         this.gv();
         this.a(dxw.u);
         this.b(avo.ai);
         this.a(cgl.a.b);
      }
   }

   public void gp() {
      if (this.t()) {
         this.a(dxw.u);
         this.b(avo.al);
         this.a(cgl.a.a);
      }
   }

   @Override
   public boolean a(brj $$0, float $$1) {
      if (this.t()) {
         $$1 = ($$1 - 1.0F) / 2.0F;
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void f(brj $$0, float $$1) {
      super.f($$0, $$1);
      if (!this.gb() && !this.ey()) {
         if ($$0.d() instanceof btl) {
            this.dU().a(ccq.G, true, 80L);
            if (this.gw()) {
               this.go();
            }
         } else if ($$0.a(awf.G)) {
            this.gp();
         }
      }
   }

   @Override
   public bqq b(cmv $$0, bqp $$1) {
      cuo $$2 = $$0.b($$1);
      if ($$2.a(cur.xu) && this.gq()) {
         $$2.a(16, $$0, d($$1));
         return bqq.a(this.dQ().B);
      } else {
         return this.t() ? bqq.f : super.b($$0, $$1);
      }
   }

   @Override
   public void a(int $$0, boolean $$1) {
      if (this.o_() && $$1) {
         this.b(avo.ac);
      }

      super.a($$0, $$1);
   }

   public boolean gq() {
      if (this.o_()) {
         return false;
      } else {
         this.b(new cuo(cur.oq));
         this.a(dxw.r);
         this.a(avo.ao);
         return true;
      }
   }

   public boolean gw() {
      return !this.gj() && !this.bj() && !this.fY() && !this.bS() && !this.bT();
   }

   @Override
   public void g(@Nullable cmv $$0) {
      super.g($$0);
      this.b(avo.ac);
   }

   @Override
   public boolean gr() {
      return super.gr() && !this.t();
   }

   @Override
   public avn d(cuo $$0) {
      return avo.ac;
   }

   @Override
   protected avn v() {
      return this.t() ? null : avo.af;
   }

   @Override
   protected avn n_() {
      return avo.ah;
   }

   @Override
   protected avn d(brj $$0) {
      return this.t() ? avo.ae : avo.ad;
   }

   @Override
   protected void b(jd $$0, dta $$1) {
      this.a(avo.ag, 0.15F, 1.0F);
   }

   @Override
   public int ab() {
      return this.t() ? 0 : 32;
   }

   @Override
   protected bzi E() {
      return new bzi(this) {
         @Override
         public void a() {
            if (!cgl.this.t()) {
               super.a();
            }
         }
      };
   }

   public static enum a implements azj {
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

      private static final azj.a<cgl.a> f = azj.a(cgl.a::values);
      private static final IntFunction<cgl.a> g = axd.a(cgl.a::d, values(), axd.a.a);
      public static final yw<ByteBuf, cgl.a> e = yu.a(g, cgl.a::d);
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

      public static cgl.a a(String $$0) {
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
