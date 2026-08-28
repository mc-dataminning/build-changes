import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cgb extends ces {
   public static final float ca = 0.6F;
   public static final float cb = 32.5F;
   public static final int cd = 80;
   private static final double ch = 7.0;
   private static final double ci = 2.0;
   private static final ajp<cgb.a> cj = ajt.a(cgb.class, ajr.B);
   private long ck = 0L;
   public final bsc ce = new bsc();
   public final bsc cf = new bsc();
   public final bsc cg = new bsc();
   private int cl;
   private boolean cm = false;

   public cgb(bsn<? extends ces> $$0, dcg $$1) {
      super($$0, $$1);
      this.J().a(true);
      this.cl = this.gz();
   }

   @Nullable
   @Override
   public bsb a(aqm $$0, bsb $$1) {
      return bsn.c.a((dcg)$$0);
   }

   public static buj.a s() {
      return bte.A().a(buk.s, 12.0).a(buk.v, 0.14);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(cj, cgb.a.a);
   }

   public boolean t() {
      return this.ao.a(cj) != cgb.a.a;
   }

   public boolean x() {
      return this.gt().a(this.ck);
   }

   public boolean gn() {
      return this.gt() == cgb.a.b && this.ck > (long)cgb.a.b.b();
   }

   public cgb.a gt() {
      return this.ao.a(cj);
   }

   @Override
   protected void Y() {
      super.Y();
      afy.a(this);
   }

   public void a(cgb.a $$0) {
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
   protected bue.b<cgb> dW() {
      return cgc.a();
   }

   @Override
   protected bue<?> a(Dynamic<?> $$0) {
      return cgc.a(this.dW().a($$0));
   }

   @Override
   protected void Z() {
      this.dR().ag().a("armadilloBrain");
      ((bue<cgb>)this.bG).a((aqm)this.dR(), this);
      this.dR().ag().c();
      this.dR().ag().a("armadilloActivityUpdate");
      cgc.a(this);
      this.dR().ag().c();
      if (this.bF() && !this.o_() && --this.cl <= 0) {
         this.a(avh.ak, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
         this.a(cug.oq);
         this.a(dxh.t);
         this.cl = this.gz();
      }

      super.Z();
   }

   private int gz() {
      return this.ah.a(20 * azh.e * 5) + 20 * azh.e * 5;
   }

   @Override
   public void l() {
      super.l();
      if (this.dR().x_()) {
         this.gA();
      }

      if (this.t()) {
         this.ac();
      }

      this.ck++;
   }

   @Override
   public float ec() {
      return this.o_() ? 0.6F : 1.0F;
   }

   private void gA() {
      switch (this.gt()) {
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
               this.cg.a(cgb.a.c.b(), 1.0F);
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
      if ($$0 == 64 && this.dR().B) {
         this.cm = true;
         this.dR().a(this.dw(), this.dy(), this.dC(), avh.am, this.dg(), 1.0F, 1.0F, false);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean o(cud $$0) {
      return $$0.a(awf.ai);
   }

   public static boolean c(bsn<cgb> $$0, dch $$1, btg $$2, ja $$3, ayo $$4) {
      return $$1.a_($$3.d()).a(avw.bX) && a($$1, $$3);
   }

   public boolean j(btc $$0) {
      if (!this.cM().c(7.0, 2.0, 7.0).c($$0.cM())) {
         return false;
      } else if ($$0.am().a(awa.d)) {
         return true;
      } else if (this.ek() == $$0) {
         return true;
      } else if ($$0 instanceof cml $$1) {
         return $$1.N_() ? false : $$1.cd() || $$1.bT();
      } else {
         return false;
      }
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("state", this.gt().c());
      $$0.a("scute_time", this.cl);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a(cgb.a.a($$0.l("state")));
      if ($$0.e("scute_time")) {
         this.cl = $$0.h("scute_time");
      }
   }

   public void gu() {
      if (!this.t()) {
         this.U();
         this.gs();
         this.a(dxh.u);
         this.b(avh.ai);
         this.a(cgb.a.b);
      }
   }

   public void gv() {
      if (this.t()) {
         this.a(dxh.u);
         this.b(avh.al);
         this.a(cgb.a.a);
      }
   }

   @Override
   public boolean a(bra $$0, float $$1) {
      if (this.t()) {
         $$1 = ($$1 - 1.0F) / 2.0F;
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void f(bra $$0, float $$1) {
      super.f($$0, $$1);
      if (!this.gc() && !this.ez()) {
         if ($$0.d() instanceof btc) {
            this.dV().a(ccg.G, true, 80L);
            if (this.gy()) {
               this.gu();
            }
         } else if (this.gw()) {
            this.gv();
         }
      }
   }

   public boolean gw() {
      return this.bS() || this.dG();
   }

   @Override
   public bqh b(cml $$0, bqg $$1) {
      cud $$2 = $$0.b($$1);
      if ($$2.a(cug.xu) && this.gx()) {
         $$2.a(16, $$0, d($$1));
         return bqh.a(this.dR().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(int $$0, boolean $$1) {
      if (this.o_() && $$1) {
         this.b(avh.ac);
      }

      super.a($$0, $$1);
   }

   public boolean gx() {
      if (this.o_()) {
         return false;
      } else {
         this.b(new cud(cug.oq));
         this.a(dxh.r);
         this.a(avh.ao);
         return true;
      }
   }

   public boolean gy() {
      return !this.gk() && !this.bk() && !this.fZ() && !this.bT() && !this.bU();
   }

   @Override
   public void g(@Nullable cml $$0) {
      super.g($$0);
      this.b(avh.ac);
   }

   @Override
   public boolean go() {
      return super.go() && !this.t();
   }

   @Override
   public avg d(cud $$0) {
      return avh.ac;
   }

   @Override
   protected avg v() {
      return this.t() ? null : avh.af;
   }

   @Override
   protected avg n_() {
      return avh.ah;
   }

   @Override
   protected avg d(bra $$0) {
      return this.t() ? avh.ae : avh.ad;
   }

   @Override
   protected void b(ja $$0, dsl $$1) {
      this.a(avh.ag, 0.15F, 1.0F);
   }

   @Override
   public int ab() {
      return this.t() ? 0 : 32;
   }

   @Override
   protected byy E() {
      return new byy(this) {
         @Override
         public void a() {
            if (!cgb.this.t()) {
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

      private static final azc.a<cgb.a> f = azc.a(cgb.a::values);
      private static final IntFunction<cgb.a> g = aww.a(cgb.a::d, values(), aww.a.a);
      public static final ys<ByteBuf, cgb.a> e = yq.a(g, cgb.a::d);
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

      public static cgb.a a(String $$0) {
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
