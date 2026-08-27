import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cfn extends cee {
   public static final float ch = 0.6F;
   public static final float ci = 32.5F;
   public static final int ck = 80;
   private static final double co = 7.0;
   private static final double cp = 2.0;
   private static final ajy<cfn.a> cq = akc.a(cfn.class, aka.B);
   private long cr = 0L;
   public final brq cl = new brq();
   public final brq cm = new brq();
   public final brq cn = new brq();
   private int cs;
   private boolean ct = false;

   public cfn(bsb<? extends cee> $$0, dca $$1) {
      super($$0, $$1);
      this.J().a(true);
      this.cs = this.gK();
   }

   @Override
   public boolean dW() {
      return true;
   }

   @Nullable
   @Override
   public brp a(aqt $$0, brp $$1) {
      return bsb.c.a((dca)$$0);
   }

   public static btu.a r() {
      return bsq.A().a(btv.q, 12.0).a(btv.r, 0.14);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(cq, cfn.a.a);
   }

   public boolean t() {
      return this.as.a(cq) != cfn.a.a;
   }

   public boolean x() {
      return this.gE().a(this.cr);
   }

   public boolean gy() {
      return this.gE() == cfn.a.b && this.cr > (long)cfn.a.b.b();
   }

   public cfn.a gE() {
      return this.as.a(cq);
   }

   @Override
   protected void X() {
      super.X();
      agi.a(this);
   }

   public void a(cfn.a $$0) {
      this.as.a(cq, $$0);
   }

   @Override
   public void a(ajy<?> $$0) {
      if (cq.equals($$0)) {
         this.cr = 0L;
      }

      super.a($$0);
   }

   @Override
   protected btp.b<cfn> ea() {
      return cfo.a();
   }

   @Override
   protected btp<?> a(Dynamic<?> $$0) {
      return cfo.a(this.ea().a($$0));
   }

   @Override
   protected void Y() {
      this.dU().ag().a("armadilloBrain");
      ((btp<cfn>)this.bO).a((aqt)this.dU(), this);
      this.dU().ag().c();
      this.dU().ag().a("armadilloActivityUpdate");
      cfo.a(this);
      this.dU().ag().c();
      if (this.bI() && !this.o_() && --this.cs <= 0) {
         this.a(avo.ap, 1.0F, (this.al.i() - this.al.i()) * 0.2F + 1.0F);
         this.a(cuk.pG);
         this.a(dxv.t);
         this.cs = this.gK();
      }

      super.Y();
   }

   private int gK() {
      return this.al.a(20 * azl.e * 5) + 20 * azl.e * 5;
   }

   @Override
   public void l() {
      super.l();
      if (this.dU().x_()) {
         this.gL();
      }

      if (this.t()) {
         this.ab();
      }

      this.cr++;
   }

   @Override
   public float el() {
      return this.o_() ? 0.6F : 1.0F;
   }

   private void gL() {
      switch (this.gE()) {
         case a:
            this.cl.a();
            this.cm.a();
            this.cn.a();
            break;
         case d:
            this.cl.b(this.am);
            this.cm.a();
            this.cn.a();
            break;
         case b:
            this.cl.a();
            this.cm.b(this.am);
            this.cn.a();
            break;
         case c:
            this.cl.a();
            this.cm.a();
            if (this.ct) {
               this.cn.a();
               this.ct = false;
            }

            if (this.cr == 0L) {
               this.cn.a(this.am);
               this.cn.a(cfn.a.c.b(), 1.0F);
            } else {
               this.cn.b(this.am);
            }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 64 && this.dU().C) {
         this.ct = true;
         this.dU().a(this.dz(), this.dB(), this.dF(), avo.ar, this.dj(), 1.0F, 1.0F, false);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean o(cuh $$0) {
      return $$0.a(awm.ai);
   }

   public static boolean c(bsb<cfn> $$0, dcb $$1, bss $$2, ir $$3, ayt $$4) {
      return $$1.a_($$3.d()).a(awe.ca) && a($$1, $$3);
   }

   public boolean j(bso $$0) {
      if (!this.cP().c(7.0, 2.0, 7.0).c($$0.cP())) {
         return false;
      } else if ($$0.ak().a(awh.d)) {
         return true;
      } else if (this.eu() == $$0) {
         return true;
      } else if ($$0 instanceof cly $$1) {
         return $$1.O_() ? false : $$1.cg() || $$1.bW();
      } else {
         return false;
      }
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("state", this.gE().c());
      $$0.a("scute_time", this.cs);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.a(cfn.a.a($$0.l("state")));
      if ($$0.e("scute_time")) {
         this.cs = $$0.h("scute_time");
      }
   }

   public void gF() {
      if (!this.t()) {
         this.T();
         this.gD();
         this.a(dxv.u);
         this.b(avo.an);
         this.a(cfn.a.b);
      }
   }

   public void gG() {
      if (this.t()) {
         this.a(dxv.u);
         this.b(avo.aq);
         this.a(cfn.a.a);
      }
   }

   @Override
   public boolean a(bqt $$0, float $$1) {
      if (this.t()) {
         $$1 = ($$1 - 1.0F) / 2.0F;
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void f(bqt $$0, float $$1) {
      super.f($$0, $$1);
      if (!this.go()) {
         if ($$0.d() instanceof bso) {
            this.dZ().a(cbr.G, true, 80L);
            if (this.gJ()) {
               this.gF();
            }
         } else if (this.gH()) {
            this.gG();
         }
      }
   }

   public boolean gH() {
      return this.bV() || this.dJ();
   }

   @Override
   public bqa b(cly $$0, bpz $$1) {
      cuh $$2 = $$0.b($$1);
      if ($$2.a(cuk.ze) && this.gI()) {
         $$2.a(16, $$0, d($$1));
         return bqa.a(this.dU().C);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(int $$0, boolean $$1) {
      if (this.o_() && $$1) {
         this.b(avo.ah);
      }

      super.a($$0, $$1);
   }

   public boolean gI() {
      if (this.o_()) {
         return false;
      } else {
         this.b(new cuh(cuk.pG));
         this.a(dxv.r);
         this.a(avo.at);
         return true;
      }
   }

   public boolean gJ() {
      return !this.gv() && !this.bm() && !this.gl() && !this.bW() && !this.bX();
   }

   @Override
   public void g(@Nullable cly $$0) {
      super.g($$0);
      this.b(avo.ah);
   }

   @Override
   public boolean gz() {
      return super.gz() && !this.t();
   }

   @Override
   public avn d(cuh $$0) {
      return avo.ah;
   }

   @Override
   protected avn u() {
      return this.t() ? null : avo.ak;
   }

   @Override
   protected avn n_() {
      return avo.am;
   }

   @Override
   protected avn d(bqt $$0) {
      return this.t() ? avo.aj : avo.ai;
   }

   @Override
   protected void b(ir $$0, dtc $$1) {
      this.a(avo.al, 0.15F, 1.0F);
   }

   @Override
   public int aa() {
      return this.t() ? 0 : 32;
   }

   @Override
   protected byj E() {
      return new byj(this) {
         @Override
         public void a() {
            if (!cfn.this.t()) {
               super.a();
            }
         }
      };
   }

   public static enum a implements azg {
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

      private static final azg.a<cfn.a> f = azg.a(cfn.a::values);
      private static final IntFunction<cfn.a> g = axd.a(cfn.a::d, values(), axd.a.a);
      public static final zc<ByteBuf, cfn.a> e = za.a(g, cfn.a::d);
      private final String h;
      private final boolean i;
      private final int j;
      private final int k;

      a(String $$0, boolean $$1, int $$2, int $$3) {
         this.h = $$0;
         this.i = $$1;
         this.j = $$2;
         this.k = $$3;
      }

      public static cfn.a a(String $$0) {
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
