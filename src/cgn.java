import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cgn extends cfe {
   public static final float ca = 0.6F;
   public static final float cb = 32.5F;
   public static final int cc = 80;
   private static final double ch = 7.0;
   private static final double ci = 2.0;
   private static final ajw<cgn.a> cj = aka.a(cgn.class, ajy.B);
   private long ck = 0L;
   public final bsm ce = new bsm();
   public final bsm cf = new bsm();
   public final bsm cg = new bsm();
   private int cl;
   private boolean cm = false;

   public cgn(bsx<? extends cfe> $$0, dcw $$1) {
      super($$0, $$1);
      this.N().a(true);
      this.cl = this.gv();
   }

   @Nullable
   @Override
   public bsl a(aqu $$0, bsl $$1) {
      return bsx.c.a((dcw)$$0);
   }

   public static buv.a s() {
      return btp.C().a(buw.s, 12.0).a(buw.v, 0.14);
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(cj, cgn.a.a);
   }

   public boolean t() {
      return this.ao.a(cj) != cgn.a.a;
   }

   public boolean x() {
      return this.gl().a(this.ck);
   }

   public boolean gk() {
      return this.gl() == cgn.a.b && this.ck > (long)cgn.a.b.b();
   }

   public cgn.a gl() {
      return this.ao.a(cj);
   }

   @Override
   protected void aa() {
      super.aa();
      agf.a(this);
   }

   public void a(cgn.a $$0) {
      this.ao.a(cj, $$0);
   }

   @Override
   public void a(ajw<?> $$0) {
      if (cj.equals($$0)) {
         this.ck = 0L;
      }

      super.a($$0);
   }

   @Override
   protected buq.b<cgn> dU() {
      return cgo.a();
   }

   @Override
   protected buq<?> a(Dynamic<?> $$0) {
      return cgo.a(this.dU().a($$0));
   }

   @Override
   protected void ab() {
      this.dO().ag().a("armadilloBrain");
      ((buq<cgn>)this.bF).a((aqu)this.dO(), this);
      this.dO().ag().c();
      this.dO().ag().a("armadilloActivityUpdate");
      cgo.a(this);
      this.dO().ag().c();
      if (this.bE() && !this.o_() && --this.cl <= 0) {
         this.a(avp.ak, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
         this.a(cut.oq);
         this.a(dxz.t);
         this.cl = this.gv();
      }

      super.ab();
   }

   private int gv() {
      return this.ah.a(20 * azp.e * 5) + 20 * azp.e * 5;
   }

   @Override
   public void l() {
      super.l();
      if (this.dO().x_()) {
         this.gw();
      }

      if (this.t()) {
         this.af();
      }

      this.ck++;
   }

   @Override
   public float ea() {
      return this.o_() ? 0.6F : 1.0F;
   }

   private void gw() {
      switch (this.gl()) {
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
               this.cg.a(cgn.a.c.b(), 1.0F);
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
      if ($$0 == 64 && this.dO().B) {
         this.cm = true;
         this.dO().a(this.dt(), this.dv(), this.dz(), avp.am, this.de(), 1.0F, 1.0F, false);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean o(cuq $$0) {
      return $$0.a(awn.ai);
   }

   public static boolean c(bsx<cgn> $$0, dcx $$1, btr $$2, jd $$3, ayw $$4) {
      return $$1.a_($$3.e()).a(awe.bY) && a($$1, $$3);
   }

   public boolean j(btn $$0) {
      if (!this.cK().c(7.0, 2.0, 7.0).c($$0.cK())) {
         return false;
      } else if ($$0.am().a(awi.d)) {
         return true;
      } else if (this.ei() == $$0) {
         return true;
      } else if ($$0 instanceof cmx $$1) {
         return $$1.R_() ? false : $$1.cc() || $$1.bS();
      } else {
         return false;
      }
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("state", this.gl().c());
      $$0.a("scute_time", this.cl);
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      this.a(cgn.a.a($$0.l("state")));
      if ($$0.e("scute_time")) {
         this.cl = $$0.h("scute_time");
      }
   }

   public void gm() {
      if (!this.t()) {
         this.W();
         this.gt();
         this.a(dxz.u);
         this.b(avp.ai);
         this.a(cgn.a.b);
      }
   }

   public void gn() {
      if (this.t()) {
         this.a(dxz.u);
         this.b(avp.al);
         this.a(cgn.a.a);
      }
   }

   @Override
   public boolean a(brk $$0, float $$1) {
      if (this.t()) {
         $$1 = ($$1 - 1.0F) / 2.0F;
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void f(brk $$0, float $$1) {
      super.f($$0, $$1);
      if (!this.fZ() && !this.ex()) {
         if ($$0.d() instanceof btn) {
            this.dT().a(ccs.G, true, 80L);
            if (this.gu()) {
               this.gm();
            }
         } else if ($$0.a(awg.G)) {
            this.gn();
         }
      }
   }

   @Override
   public bqr b(cmx $$0, bqq $$1) {
      cuq $$2 = $$0.b($$1);
      if ($$2.a(cut.xu) && this.go()) {
         $$2.a(16, $$0, d($$1));
         return bqr.a(this.dO().B);
      } else {
         return this.t() ? bqr.f : super.b($$0, $$1);
      }
   }

   @Override
   public void a(int $$0, boolean $$1) {
      if (this.o_() && $$1) {
         this.b(avp.ac);
      }

      super.a($$0, $$1);
   }

   public boolean go() {
      if (this.o_()) {
         return false;
      } else {
         this.b(new cuq(cut.oq));
         this.a(dxz.r);
         this.a(avp.ao);
         return true;
      }
   }

   public boolean gu() {
      return !this.gh() && !this.bj() && !this.N_() && !this.bS() && !this.bT();
   }

   @Override
   public void f(@Nullable cmx $$0) {
      super.f($$0);
      this.b(avp.ac);
   }

   @Override
   public boolean gp() {
      return super.gp() && !this.t();
   }

   @Override
   public avo d(cuq $$0) {
      return avp.ac;
   }

   @Override
   protected avo v() {
      return this.t() ? null : avp.af;
   }

   @Override
   protected avo n_() {
      return avp.ah;
   }

   @Override
   protected avo d(brk $$0) {
      return this.t() ? avp.ae : avp.ad;
   }

   @Override
   protected void b(jd $$0, dtc $$1) {
      this.a(avp.ag, 0.15F, 1.0F);
   }

   @Override
   public int ae() {
      return this.t() ? 0 : 32;
   }

   @Override
   protected bzk H() {
      return new bzk(this) {
         @Override
         public void a() {
            if (!cgn.this.t()) {
               super.a();
            }
         }
      };
   }

   public static enum a implements azk {
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

      private static final azk.a<cgn.a> f = azk.a(cgn.a::values);
      private static final IntFunction<cgn.a> g = axe.a(cgn.a::d, values(), axe.a.a);
      public static final yx<ByteBuf, cgn.a> e = yv.a(g, cgn.a::d);
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

      public static cgn.a a(String $$0) {
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
