import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cdr extends cci {
   public static final float bX = 0.6F;
   public static final float bY = 32.5F;
   public static final int ca = 80;
   private static final double ce = 7.0;
   private static final double cf = 2.0;
   private static final aja<cdr.a> cg = aje.a(cdr.class, ajc.A);
   private long ch = 0L;
   public final bpv cb = new bpv();
   public final bpv cc = new bpv();
   public final bpv cd = new bpv();
   private int ci;
   private boolean cj = false;

   public cdr(bqg<? extends cci> $$0, czg $$1) {
      super($$0, $$1);
      this.K().a(true);
      this.ci = this.gz();
   }

   @Nullable
   @Override
   public bpu a(apu $$0, bpu $$1) {
      return bqg.c.a((czg)$$0);
   }

   public static brz.a r() {
      return bqv.A().a(bsa.q, 12.0).a(bsa.r, 0.14);
   }

   @Override
   protected void a(aje.a $$0) {
      super.a($$0);
      $$0.a(cg, cdr.a.a);
   }

   public boolean u() {
      return this.an.a(cg) != cdr.a.a;
   }

   public boolean y() {
      return this.gt().a(this.ch);
   }

   public boolean gn() {
      return this.gt() == cdr.a.b && this.ch > (long)cdr.a.b.b();
   }

   public cdr.a gt() {
      return this.an.a(cg);
   }

   @Override
   protected void X() {
      super.X();
      afk.a(this);
   }

   public void a(cdr.a $$0) {
      this.an.a(cg, $$0);
   }

   @Override
   public void a(aja<?> $$0) {
      if (cg.equals($$0)) {
         this.ch = 0L;
      }

      super.a($$0);
   }

   @Override
   protected bru.b<cdr> dQ() {
      return cds.a();
   }

   @Override
   protected bru<?> a(Dynamic<?> $$0) {
      return cds.a(this.dQ().a($$0));
   }

   @Override
   protected void Y() {
      this.dM().af().a("armadilloBrain");
      ((bru<cdr>)this.bC).a((apu)this.dM(), this);
      this.dM().af().c();
      this.dM().af().a("armadilloActivityUpdate");
      cds.a(this);
      this.dM().af().c();
      if (this.bA() && !this.p_() && --this.ci <= 0) {
         this.a(auo.ak, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
         this.a(crv.op);
         this.a(dub.t);
         this.ci = this.gz();
      }

      super.Y();
   }

   private int gz() {
      return this.ag.a(20 * ayl.e * 5) + 20 * ayl.e * 5;
   }

   @Override
   public void l() {
      super.l();
      if (this.dM().x_()) {
         this.gA();
      }

      if (this.u()) {
         this.ab();
      }

      this.ch++;
   }

   @Override
   public float ea() {
      return this.p_() ? 0.6F : 1.0F;
   }

   private void gA() {
      switch (this.gt()) {
         case a:
            this.cb.a();
            this.cc.a();
            this.cd.a();
            break;
         case d:
            this.cb.b(this.ah);
            this.cc.a();
            this.cd.a();
            break;
         case b:
            this.cb.a();
            this.cc.b(this.ah);
            this.cd.a();
            break;
         case c:
            this.cb.a();
            this.cc.a();
            if (this.cj) {
               this.cd.a();
               this.cj = false;
            }

            if (this.ch == 0L) {
               this.cd.a(this.ah);
               this.cd.a(cdr.a.c.b(), 1.0F);
            } else {
               this.cd.b(this.ah);
            }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 64 && this.dM().B) {
         this.cj = true;
         this.dM().a(this.dr(), this.dt(), this.dx(), auo.am, this.db(), 1.0F, 1.0F, false);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean o(crs $$0) {
      return cds.a.a($$0);
   }

   public static boolean c(bqg<cdr> $$0, czh $$1, bqx $$2, id $$3, axt $$4) {
      return $$1.a_($$3.d()).a(ave.bR) && a($$1, $$3);
   }

   public boolean j(bqt $$0) {
      if (!this.cH().c(7.0, 2.0, 7.0).c($$0.cH())) {
         return false;
      } else if ($$0.ai().a(avh.d)) {
         return true;
      } else if (this.ej() == $$0) {
         return true;
      } else if ($$0 instanceof cka $$1) {
         return $$1.N_() ? false : $$1.bY() || $$1.bO();
      } else {
         return false;
      }
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      $$0.a("state", this.gt().c());
      $$0.a("scute_time", this.ci);
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      this.a(cdr.a.a($$0.l("state")));
      if ($$0.e("scute_time")) {
         this.ci = $$0.h("scute_time");
      }
   }

   public void gu() {
      if (!this.u()) {
         this.T();
         this.gs();
         this.a(dub.u);
         this.b(auo.ai);
         this.a(cdr.a.b);
      }
   }

   public void gv() {
      if (this.u()) {
         this.a(dub.u);
         this.b(auo.al);
         this.a(cdr.a.a);
      }
   }

   @Override
   public boolean a(boy $$0, float $$1) {
      if (this.u()) {
         $$1 = ($$1 - 1.0F) / 2.0F;
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void f(boy $$0, float $$1) {
      super.f($$0, $$1);
      if (!this.gd()) {
         if ($$0.d() instanceof bqt) {
            this.dP().a(bzw.G, true, 80L);
            if (this.gy()) {
               this.gu();
            }
         } else if (this.gw()) {
            this.gv();
         }
      }
   }

   public boolean gw() {
      return this.bN() || this.dB();
   }

   @Override
   public bof b(cka $$0, boe $$1) {
      crs $$2 = $$0.b($$1);
      if ($$2.a(crv.xn) && this.gx()) {
         $$2.a(16, $$0, d($$1));
         return bof.a(this.dM().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(int $$0, boolean $$1) {
      if (this.p_() && $$1) {
         this.b(auo.ac);
      }

      super.a($$0, $$1);
   }

   public boolean gx() {
      if (this.p_()) {
         return false;
      } else {
         this.b(new crs(crv.op));
         this.a(dub.r);
         this.a(auo.ao);
         return true;
      }
   }

   public boolean gy() {
      return !this.gk() && !this.bg() && !this.gb() && !this.bO() && !this.bP();
   }

   @Override
   public void g(@Nullable cka $$0) {
      super.g($$0);
      this.b(auo.ac);
   }

   @Override
   public boolean go() {
      return super.go() && !this.u();
   }

   @Override
   public aun d(crs $$0) {
      return auo.ac;
   }

   @Override
   protected aun v() {
      return this.u() ? null : auo.af;
   }

   @Override
   protected aun o_() {
      return auo.ah;
   }

   @Override
   protected aun d(boy $$0) {
      return this.u() ? auo.ae : auo.ad;
   }

   @Override
   protected void b(id $$0, dpi $$1) {
      this.a(auo.ag, 0.15F, 1.0F);
   }

   @Override
   public int aa() {
      return this.u() ? 0 : 32;
   }

   @Override
   protected bwo E() {
      return new bwo(this) {
         @Override
         public void a() {
            if (!cdr.this.u()) {
               super.a();
            }
         }
      };
   }

   public static enum a implements ayg {
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

      private static final ayg.a<cdr.a> f = ayg.a(cdr.a::values);
      private static final IntFunction<cdr.a> g = awd.a(cdr.a::d, values(), awd.a.a);
      public static final yg<ByteBuf, cdr.a> e = ye.a(g, cdr.a::d);
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

      public static cdr.a a(String $$0) {
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
