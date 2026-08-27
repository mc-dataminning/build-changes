import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cey extends cdp {
   public static final float bY = 0.6F;
   public static final float bZ = 32.5F;
   public static final int cb = 80;
   private static final double cf = 7.0;
   private static final double cg = 2.0;
   private static final ajm<cey.a> ch = ajq.a(cey.class, ajo.B);
   private long ci = 0L;
   public final brc cc = new brc();
   public final brc cd = new brc();
   public final brc ce = new brc();
   private int cj;
   private boolean ck = false;

   public cey(brn<? extends cdp> $$0, dad $$1) {
      super($$0, $$1);
      this.K().a(true);
      this.cj = this.gB();
   }

   @Nullable
   @Override
   public brb a(aqh $$0, brb $$1) {
      return brn.c.a((dad)$$0);
   }

   public static btg.a r() {
      return bsc.A().a(bth.q, 12.0).a(bth.r, 0.14);
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(ch, cey.a.a);
   }

   public boolean u() {
      return this.ao.a(ch) != cey.a.a;
   }

   public boolean y() {
      return this.gv().a(this.ci);
   }

   public boolean gp() {
      return this.gv() == cey.a.b && this.ci > (long)cey.a.b.b();
   }

   public cey.a gv() {
      return this.ao.a(ch);
   }

   @Override
   protected void X() {
      super.X();
      afw.a(this);
   }

   public void a(cey.a $$0) {
      this.ao.a(ch, $$0);
   }

   @Override
   public void a(ajm<?> $$0) {
      if (ch.equals($$0)) {
         this.ci = 0L;
      }

      super.a($$0);
   }

   @Override
   protected btb.b<cey> dR() {
      return cez.a();
   }

   @Override
   protected btb<?> a(Dynamic<?> $$0) {
      return cez.a(this.dR().a($$0));
   }

   @Override
   protected void Y() {
      this.dN().af().a("armadilloBrain");
      ((btb<cey>)this.bE).a((aqh)this.dN(), this);
      this.dN().af().c();
      this.dN().af().a("armadilloActivityUpdate");
      cez.a(this);
      this.dN().af().c();
      if (this.bB() && !this.p_() && --this.cj <= 0) {
         this.a(avc.ak, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
         this.a(ctc.oq);
         this.a(dva.t);
         this.cj = this.gB();
      }

      super.Y();
   }

   private int gB() {
      return this.ah.a(20 * ayy.e * 5) + 20 * ayy.e * 5;
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
               this.ce.a(cey.a.c.b(), 1.0F);
            } else {
               this.ce.b(this.ai);
            }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 64 && this.dN().B) {
         this.ck = true;
         this.dN().a(this.ds(), this.du(), this.dy(), avc.am, this.dc(), 1.0F, 1.0F, false);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean o(csz $$0) {
      return $$0.a(avz.ai);
   }

   public static boolean c(brn<cey> $$0, dae $$1, bse $$2, in $$3, ayg $$4) {
      return $$1.a_($$3.d()).a(avr.bX) && a($$1, $$3);
   }

   public boolean j(bsa $$0) {
      if (!this.cI().c(7.0, 2.0, 7.0).c($$0.cI())) {
         return false;
      } else if ($$0.ai().a(avu.d)) {
         return true;
      } else if (this.ek() == $$0) {
         return true;
      } else if ($$0 instanceof clh $$1) {
         return $$1.N_() ? false : $$1.bZ() || $$1.bP();
      } else {
         return false;
      }
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("state", this.gv().c());
      $$0.a("scute_time", this.cj);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a(cey.a.a($$0.l("state")));
      if ($$0.e("scute_time")) {
         this.cj = $$0.h("scute_time");
      }
   }

   public void gw() {
      if (!this.u()) {
         this.T();
         this.gu();
         this.a(dva.u);
         this.b(avc.ai);
         this.a(cey.a.b);
      }
   }

   public void gx() {
      if (this.u()) {
         this.a(dva.u);
         this.b(avc.al);
         this.a(cey.a.a);
      }
   }

   @Override
   public boolean a(bqf $$0, float $$1) {
      if (this.u()) {
         $$1 = ($$1 - 1.0F) / 2.0F;
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void f(bqf $$0, float $$1) {
      super.f($$0, $$1);
      if (!this.gf()) {
         if ($$0.d() instanceof bsa) {
            this.dQ().a(cbd.G, true, 80L);
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
   public bpm b(clh $$0, bpl $$1) {
      csz $$2 = $$0.b($$1);
      if ($$2.a(ctc.xr) && this.gz()) {
         $$2.a(16, $$0, d($$1));
         return bpm.a(this.dN().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(int $$0, boolean $$1) {
      if (this.p_() && $$1) {
         this.b(avc.ac);
      }

      super.a($$0, $$1);
   }

   public boolean gz() {
      if (this.p_()) {
         return false;
      } else {
         this.b(new csz(ctc.oq));
         this.a(dva.r);
         this.a(avc.ao);
         return true;
      }
   }

   public boolean gA() {
      return !this.gm() && !this.bg() && !this.gc() && !this.bP() && !this.bQ();
   }

   @Override
   public void g(@Nullable clh $$0) {
      super.g($$0);
      this.b(avc.ac);
   }

   @Override
   public boolean gq() {
      return super.gq() && !this.u();
   }

   @Override
   public avb d(csz $$0) {
      return avc.ac;
   }

   @Override
   protected avb v() {
      return this.u() ? null : avc.af;
   }

   @Override
   protected avb o_() {
      return avc.ah;
   }

   @Override
   protected avb d(bqf $$0) {
      return this.u() ? avc.ae : avc.ad;
   }

   @Override
   protected void b(in $$0, dqh $$1) {
      this.a(avc.ag, 0.15F, 1.0F);
   }

   @Override
   public int aa() {
      return this.u() ? 0 : 32;
   }

   @Override
   protected bxv E() {
      return new bxv(this) {
         @Override
         public void a() {
            if (!cey.this.u()) {
               super.a();
            }
         }
      };
   }

   public static enum a implements ayt {
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

      private static final ayt.a<cey.a> f = ayt.a(cey.a::values);
      private static final IntFunction<cey.a> g = awq.a(cey.a::d, values(), awq.a.a);
      public static final ys<ByteBuf, cey.a> e = yq.a(g, cey.a::d);
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

      public static cey.a a(String $$0) {
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
