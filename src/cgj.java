import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cgj extends cfa {
   public static final float bY = 0.6F;
   public static final float bZ = 32.5F;
   public static final int cb = 80;
   private static final double cf = 7.0;
   private static final double cg = 2.0;
   private static final akg<cgj.a> ch = akk.a(cgj.class, aki.B);
   private long ci = 0L;
   public final bsk cc = new bsk();
   public final bsk cd = new bsk();
   public final bsk ce = new bsk();
   private int cj;
   private boolean ck = false;

   public cgj(bsv<? extends cfa> $$0, dbt $$1) {
      super($$0, $$1);
      this.K().a(true);
      this.cj = this.gC();
   }

   @Nullable
   @Override
   public bsj a(arb $$0, bsj $$1) {
      return bsv.c.a((dbt)$$0);
   }

   public static bur.a s() {
      return btm.A().a(bus.q, 12.0).a(bus.r, 0.14);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(ch, cgj.a.a);
   }

   public boolean u() {
      return this.ao.a(ch) != cgj.a.a;
   }

   public boolean y() {
      return this.gw().a(this.ci);
   }

   public boolean gq() {
      return this.gw() == cgj.a.b && this.ci > (long)cgj.a.b.b();
   }

   public cgj.a gw() {
      return this.ao.a(ch);
   }

   @Override
   protected void Y() {
      super.Y();
      agp.a(this);
   }

   public void a(cgj.a $$0) {
      this.ao.a(ch, $$0);
   }

   @Override
   public void a(akg<?> $$0) {
      if (ch.equals($$0)) {
         this.ci = 0L;
      }

      super.a($$0);
   }

   @Override
   protected bum.b<cgj> dT() {
      return cgk.a();
   }

   @Override
   protected bum<?> a(Dynamic<?> $$0) {
      return cgk.a(this.dT().a($$0));
   }

   @Override
   protected void Z() {
      this.dP().ag().a("armadilloBrain");
      ((bum<cgj>)this.bD).a((arb)this.dP(), this);
      this.dP().ag().c();
      this.dP().ag().a("armadilloActivityUpdate");
      cgk.a(this);
      this.dP().ag().c();
      if (this.bD() && !this.p_() && --this.cj <= 0) {
         this.a(avw.ak, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
         this.a(cun.oq);
         this.a(dwq.t);
         this.cj = this.gC();
      }

      super.Z();
   }

   private int gC() {
      return this.ah.a(20 * azu.e * 5) + 20 * azu.e * 5;
   }

   @Override
   public void l() {
      super.l();
      if (this.dP().x_()) {
         this.gD();
      }

      if (this.u()) {
         this.ad();
      }

      this.ci++;
   }

   @Override
   public float ed() {
      return this.p_() ? 0.6F : 1.0F;
   }

   private void gD() {
      switch (this.gw()) {
         case a:
            this.cc.a();
            this.cd.a();
            this.ce.a();
            break;
         case b:
            this.cc.a();
            this.cd.b(this.ai);
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
               this.ce.a(this.ai);
               this.ce.a(cgj.a.c.b(), 1.0F);
            } else {
               this.ce.b(this.ai);
            }
            break;
         case d:
            this.cc.b(this.ai);
            this.cd.a();
            this.ce.a();
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 64 && this.dP().B) {
         this.ck = true;
         this.dP().a(this.du(), this.dw(), this.dA(), avw.am, this.de(), 1.0F, 1.0F, false);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean o(cuk $$0) {
      return $$0.a(awu.ai);
   }

   public static boolean c(bsv<cgj> $$0, dbu $$1, bto $$2, iz $$3, azc $$4) {
      return $$1.a_($$3.d()).a(awl.bX) && a($$1, $$3);
   }

   public boolean j(btk $$0) {
      if (!this.cK().c(7.0, 2.0, 7.0).c($$0.cK())) {
         return false;
      } else if ($$0.ak().a(awp.d)) {
         return true;
      } else if (this.em() == $$0) {
         return true;
      } else if ($$0 instanceof cms $$1) {
         return $$1.N_() ? false : $$1.cb() || $$1.bR();
      } else {
         return false;
      }
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("state", this.gw().c());
      $$0.a("scute_time", this.cj);
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.a(cgj.a.a($$0.l("state")));
      if ($$0.e("scute_time")) {
         this.cj = $$0.h("scute_time");
      }
   }

   public void gx() {
      if (!this.u()) {
         this.U();
         this.gv();
         this.a(dwq.u);
         this.b(avw.ai);
         this.a(cgj.a.b);
      }
   }

   public void gy() {
      if (this.u()) {
         this.a(dwq.u);
         this.b(avw.al);
         this.a(cgj.a.a);
      }
   }

   @Override
   public boolean a(bri $$0, float $$1) {
      if (this.u()) {
         $$1 = ($$1 - 1.0F) / 2.0F;
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void f(bri $$0, float $$1) {
      super.f($$0, $$1);
      if (!this.gg()) {
         if ($$0.d() instanceof btk) {
            this.dS().a(cco.G, true, 80L);
            if (this.gB()) {
               this.gx();
            }
         } else if (this.gz()) {
            this.gy();
         }
      }
   }

   public boolean gz() {
      return this.bQ() || this.dE();
   }

   @Override
   public bqp b(cms $$0, bqo $$1) {
      cuk $$2 = $$0.b($$1);
      if ($$2.a(cun.xr) && this.gA()) {
         $$2.a(16, $$0, d($$1));
         return bqp.a(this.dP().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(int $$0, boolean $$1) {
      if (this.p_() && $$1) {
         this.b(avw.ac);
      }

      super.a($$0, $$1);
   }

   public boolean gA() {
      if (this.p_()) {
         return false;
      } else {
         this.b(new cuk(cun.oq));
         this.a(dwq.r);
         this.a(avw.ao);
         return true;
      }
   }

   public boolean gB() {
      return !this.gn() && !this.bi() && !this.gd() && !this.bR() && !this.bS();
   }

   @Override
   public void g(@Nullable cms $$0) {
      super.g($$0);
      this.b(avw.ac);
   }

   @Override
   public boolean gr() {
      return super.gr() && !this.u();
   }

   @Override
   public avv d(cuk $$0) {
      return avw.ac;
   }

   @Override
   protected avv v() {
      return this.u() ? null : avw.af;
   }

   @Override
   protected avv o_() {
      return avw.ah;
   }

   @Override
   protected avv d(bri $$0) {
      return this.u() ? avw.ae : avw.ad;
   }

   @Override
   protected void b(iz $$0, drx $$1) {
      this.a(avw.ag, 0.15F, 1.0F);
   }

   @Override
   public int ab() {
      return this.u() ? 0 : 32;
   }

   @Override
   protected bzg E() {
      return new bzg(this) {
         @Override
         public void a() {
            if (!cgj.this.u()) {
               super.a();
            }
         }
      };
   }

   public static enum a implements azp {
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

      private static final azp.a<cgj.a> f = azp.a(cgj.a::values);
      private static final IntFunction<cgj.a> g = axl.a(cgj.a::d, values(), axl.a.a);
      public static final zj<ByteBuf, cgj.a> e = zh.a(g, cgj.a::d);
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

      public static cgj.a a(String $$0) {
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
