import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cga extends cer {
   public static final float ca = 0.6F;
   public static final float cb = 32.5F;
   public static final int cd = 80;
   private static final double ch = 7.0;
   private static final double ci = 2.0;
   private static final ajp<cga.a> cj = ajt.a(cga.class, ajr.B);
   private long ck = 0L;
   public final bsb ce = new bsb();
   public final bsb cf = new bsb();
   public final bsb cg = new bsb();
   private int cl;
   private boolean cm = false;

   public cga(bsm<? extends cer> $$0, dcf $$1) {
      super($$0, $$1);
      this.K().a(true);
      this.cl = this.gA();
   }

   @Nullable
   @Override
   public bsa a(aqm $$0, bsa $$1) {
      return bsm.c.a((dcf)$$0);
   }

   public static bui.a s() {
      return btd.A().a(buj.s, 12.0).a(buj.v, 0.14);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(cj, cga.a.a);
   }

   public boolean u() {
      return this.ao.a(cj) != cga.a.a;
   }

   public boolean y() {
      return this.gu().a(this.ck);
   }

   public boolean go() {
      return this.gu() == cga.a.b && this.ck > (long)cga.a.b.b();
   }

   public cga.a gu() {
      return this.ao.a(cj);
   }

   @Override
   protected void Y() {
      super.Y();
      afy.a(this);
   }

   public void a(cga.a $$0) {
      this.ao.a(cj, $$0);
   }

   @Override
   public void a(ajp<?> $$0) {
      if (cj.equals($$0)) {
         this.ck = 0L;
      }

      super.a($$0);
   }

   @Override
   protected bud.b<cga> dV() {
      return cgb.a();
   }

   @Override
   protected bud<?> a(Dynamic<?> $$0) {
      return cgb.a(this.dV().a($$0));
   }

   @Override
   protected void Z() {
      this.dQ().ag().a("armadilloBrain");
      ((bud<cga>)this.bF).a((aqm)this.dQ(), this);
      this.dQ().ag().c();
      this.dQ().ag().a("armadilloActivityUpdate");
      cgb.a(this);
      this.dQ().ag().c();
      if (this.bE() && !this.p_() && --this.cl <= 0) {
         this.a(avh.ak, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
         this.a(cuf.oq);
         this.a(dxg.t);
         this.cl = this.gA();
      }

      super.Z();
   }

   private int gA() {
      return this.ah.a(20 * azh.e * 5) + 20 * azh.e * 5;
   }

   @Override
   public void l() {
      super.l();
      if (this.dQ().x_()) {
         this.gB();
      }

      if (this.u()) {
         this.ad();
      }

      this.ck++;
   }

   @Override
   public float eb() {
      return this.p_() ? 0.6F : 1.0F;
   }

   private void gB() {
      switch (this.gu()) {
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
               this.cg.a(cga.a.c.b(), 1.0F);
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
         this.dQ().a(this.dv(), this.dx(), this.dB(), avh.am, this.df(), 1.0F, 1.0F, false);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean o(cuc $$0) {
      return $$0.a(awf.ai);
   }

   public static boolean c(bsm<cga> $$0, dcg $$1, btf $$2, ja $$3, ayo $$4) {
      return $$1.a_($$3.d()).a(avw.bX) && a($$1, $$3);
   }

   public boolean j(btb $$0) {
      if (!this.cL().c(7.0, 2.0, 7.0).c($$0.cL())) {
         return false;
      } else if ($$0.al().a(awa.d)) {
         return true;
      } else if (this.ej() == $$0) {
         return true;
      } else if ($$0 instanceof cmk $$1) {
         return $$1.N_() ? false : $$1.cc() || $$1.bS();
      } else {
         return false;
      }
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("state", this.gu().c());
      $$0.a("scute_time", this.cl);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a(cga.a.a($$0.l("state")));
      if ($$0.e("scute_time")) {
         this.cl = $$0.h("scute_time");
      }
   }

   public void gv() {
      if (!this.u()) {
         this.U();
         this.gt();
         this.a(dxg.u);
         this.b(avh.ai);
         this.a(cga.a.b);
      }
   }

   public void gw() {
      if (this.u()) {
         this.a(dxg.u);
         this.b(avh.al);
         this.a(cga.a.a);
      }
   }

   @Override
   public boolean a(bqz $$0, float $$1) {
      if (this.u()) {
         $$1 = ($$1 - 1.0F) / 2.0F;
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void f(bqz $$0, float $$1) {
      super.f($$0, $$1);
      if (!this.gd() && !this.ey()) {
         if ($$0.d() instanceof btb) {
            this.dU().a(ccf.G, true, 80L);
            if (this.gz()) {
               this.gv();
            }
         } else if (this.gx()) {
            this.gw();
         }
      }
   }

   public boolean gx() {
      return this.bR() || this.dF();
   }

   @Override
   public bqg b(cmk $$0, bqf $$1) {
      cuc $$2 = $$0.b($$1);
      if ($$2.a(cuf.xu) && this.gy()) {
         $$2.a(16, $$0, d($$1));
         return bqg.a(this.dQ().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(int $$0, boolean $$1) {
      if (this.p_() && $$1) {
         this.b(avh.ac);
      }

      super.a($$0, $$1);
   }

   public boolean gy() {
      if (this.p_()) {
         return false;
      } else {
         this.b(new cuc(cuf.oq));
         this.a(dxg.r);
         this.a(avh.ao);
         return true;
      }
   }

   public boolean gz() {
      return !this.gl() && !this.bj() && !this.ga() && !this.bS() && !this.bT();
   }

   @Override
   public void g(@Nullable cmk $$0) {
      super.g($$0);
      this.b(avh.ac);
   }

   @Override
   public boolean gp() {
      return super.gp() && !this.u();
   }

   @Override
   public avg d(cuc $$0) {
      return avh.ac;
   }

   @Override
   protected avg v() {
      return this.u() ? null : avh.af;
   }

   @Override
   protected avg o_() {
      return avh.ah;
   }

   @Override
   protected avg d(bqz $$0) {
      return this.u() ? avh.ae : avh.ad;
   }

   @Override
   protected void b(ja $$0, dsk $$1) {
      this.a(avh.ag, 0.15F, 1.0F);
   }

   @Override
   public int ab() {
      return this.u() ? 0 : 32;
   }

   @Override
   protected byx E() {
      return new byx(this) {
         @Override
         public void a() {
            if (!cga.this.u()) {
               super.a();
            }
         }
      };
   }

   public static enum a implements azc {
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

      private static final azc.a<cga.a> f = azc.a(cga.a::values);
      private static final IntFunction<cga.a> g = aww.a(cga.a::d, values(), aww.a.a);
      public static final ys<ByteBuf, cga.a> e = yq.a(g, cga.a::d);
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

      public static cga.a a(String $$0) {
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
