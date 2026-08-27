import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cec extends cct {
   public static final float bY = 0.6F;
   public static final float bZ = 32.5F;
   public static final int cb = 80;
   private static final double cf = 7.0;
   private static final double cg = 2.0;
   private static final ajk<cec.a> ch = ajo.a(cec.class, ajm.B);
   private long ci = 0L;
   public final bqg cc = new bqg();
   public final bqg cd = new bqg();
   public final bqg ce = new bqg();
   private int cj;
   private boolean ck = false;

   public cec(bqr<? extends cct> $$0, czu $$1) {
      super($$0, $$1);
      this.K().a(true);
      this.cj = this.gB();
   }

   @Nullable
   @Override
   public bqf a(aqe $$0, bqf $$1) {
      return bqr.c.a((czu)$$0);
   }

   public static bsk.a r() {
      return brg.A().a(bsl.q, 12.0).a(bsl.r, 0.14);
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(ch, cec.a.a);
   }

   public boolean u() {
      return this.ao.a(ch) != cec.a.a;
   }

   public boolean y() {
      return this.gv().a(this.ci);
   }

   public boolean gp() {
      return this.gv() == cec.a.b && this.ci > (long)cec.a.b.b();
   }

   public cec.a gv() {
      return this.ao.a(ch);
   }

   @Override
   protected void X() {
      super.X();
      afu.a(this);
   }

   public void a(cec.a $$0) {
      this.ao.a(ch, $$0);
   }

   @Override
   public void a(ajk<?> $$0) {
      if (ch.equals($$0)) {
         this.ci = 0L;
      }

      super.a($$0);
   }

   @Override
   protected bsf.b<cec> dR() {
      return ced.a();
   }

   @Override
   protected bsf<?> a(Dynamic<?> $$0) {
      return ced.a(this.dR().a($$0));
   }

   @Override
   protected void Y() {
      this.dN().af().a("armadilloBrain");
      ((bsf<cec>)this.bE).a((aqe)this.dN(), this);
      this.dN().af().c();
      this.dN().af().a("armadilloActivityUpdate");
      ced.a(this);
      this.dN().af().c();
      if (this.bB() && !this.p_() && --this.cj <= 0) {
         this.a(auz.ak, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
         this.a(csg.oq);
         this.a(dur.t);
         this.cj = this.gB();
      }

      super.Y();
   }

   private int gB() {
      return this.ah.a(20 * ayv.e * 5) + 20 * ayv.e * 5;
   }

   @Override
   public void l() {
      super.l();
      if (this.dN().x_()) {
         this.gC();
      }

      if (this.u()) {
         this.ab();
      }

      this.ci++;
   }

   @Override
   public float eb() {
      return this.p_() ? 0.6F : 1.0F;
   }

   private void gC() {
      switch (this.gv()) {
         case a:
            this.cc.a();
            this.cd.a();
            this.ce.a();
            break;
         case d:
            this.cc.b(this.ai);
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
               this.ce.a(cec.a.c.b(), 1.0F);
            } else {
               this.ce.b(this.ai);
            }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 64 && this.dN().B) {
         this.ck = true;
         this.dN().a(this.ds(), this.du(), this.dy(), auz.am, this.dc(), 1.0F, 1.0F, false);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean o(csd $$0) {
      return ced.a.a($$0);
   }

   public static boolean c(bqr<cec> $$0, czv $$1, bri $$2, im $$3, ayd $$4) {
      return $$1.a_($$3.d()).a(avo.bR) && a($$1, $$3);
   }

   public boolean j(bre $$0) {
      if (!this.cI().c(7.0, 2.0, 7.0).c($$0.cI())) {
         return false;
      } else if ($$0.ai().a(avr.d)) {
         return true;
      } else if (this.ek() == $$0) {
         return true;
      } else if ($$0 instanceof ckl $$1) {
         return $$1.N_() ? false : $$1.bZ() || $$1.bP();
      } else {
         return false;
      }
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      $$0.a("state", this.gv().c());
      $$0.a("scute_time", this.cj);
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      this.a(cec.a.a($$0.l("state")));
      if ($$0.e("scute_time")) {
         this.cj = $$0.h("scute_time");
      }
   }

   public void gw() {
      if (!this.u()) {
         this.T();
         this.gu();
         this.a(dur.u);
         this.b(auz.ai);
         this.a(cec.a.b);
      }
   }

   public void gx() {
      if (this.u()) {
         this.a(dur.u);
         this.b(auz.al);
         this.a(cec.a.a);
      }
   }

   @Override
   public boolean a(bpj $$0, float $$1) {
      if (this.u()) {
         $$1 = ($$1 - 1.0F) / 2.0F;
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void f(bpj $$0, float $$1) {
      super.f($$0, $$1);
      if (!this.gf()) {
         if ($$0.d() instanceof bre) {
            this.dQ().a(cah.G, true, 80L);
            if (this.gA()) {
               this.gw();
            }
         } else if (this.gy()) {
            this.gx();
         }
      }
   }

   public boolean gy() {
      return this.bO() || this.dC();
   }

   @Override
   public boq b(ckl $$0, bop $$1) {
      csd $$2 = $$0.b($$1);
      if ($$2.a(csg.xr) && this.gz()) {
         $$2.a(16, $$0, d($$1));
         return boq.a(this.dN().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(int $$0, boolean $$1) {
      if (this.p_() && $$1) {
         this.b(auz.ac);
      }

      super.a($$0, $$1);
   }

   public boolean gz() {
      if (this.p_()) {
         return false;
      } else {
         this.b(new csd(csg.oq));
         this.a(dur.r);
         this.a(auz.ao);
         return true;
      }
   }

   public boolean gA() {
      return !this.gm() && !this.bg() && !this.gc() && !this.bP() && !this.bQ();
   }

   @Override
   public void g(@Nullable ckl $$0) {
      super.g($$0);
      this.b(auz.ac);
   }

   @Override
   public boolean gq() {
      return super.gq() && !this.u();
   }

   @Override
   public auy d(csd $$0) {
      return auz.ac;
   }

   @Override
   protected auy v() {
      return this.u() ? null : auz.af;
   }

   @Override
   protected auy o_() {
      return auz.ah;
   }

   @Override
   protected auy d(bpj $$0) {
      return this.u() ? auz.ae : auz.ad;
   }

   @Override
   protected void b(im $$0, dpy $$1) {
      this.a(auz.ag, 0.15F, 1.0F);
   }

   @Override
   public int aa() {
      return this.u() ? 0 : 32;
   }

   @Override
   protected bwz E() {
      return new bwz(this) {
         @Override
         public void a() {
            if (!cec.this.u()) {
               super.a();
            }
         }
      };
   }

   public static enum a implements ayq {
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

      private static final ayq.a<cec.a> f = ayq.a(cec.a::values);
      private static final IntFunction<cec.a> g = awn.a(cec.a::d, values(), awn.a.a);
      public static final yq<ByteBuf, cec.a> e = yo.a(g, cec.a::d);
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

      public static cec.a a(String $$0) {
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
