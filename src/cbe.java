import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cbe extends bzx {
   public static final float bT = 0.6F;
   public static final float bU = 32.5F;
   private static final int bZ = 5;
   private static final int ca = 8;
   public static final int bW = 60;
   private static final double cb = 7.0;
   private static final double cc = 2.0;
   private static final aie<cbe.a> cd = aih.a(cbe.class, aig.z);
   private long ce = 0L;
   public final bnm bX = new bnm();
   public final bnm bY = new bnm();
   private int cf;

   public cbe(bnw<? extends bzx> $$0, cvr $$1) {
      super($$0, $$1);
      this.N().a(true);
      this.cf = this.gr();
   }

   @Nullable
   @Override
   public bnl a(aow $$0, bnl $$1) {
      return bnw.d.a((cvr)$$0);
   }

   public static bpo.a u() {
      return bok.C().a(bpp.n, 12.0).a(bpp.o, 0.14);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(cd, cbe.a.a);
   }

   public boolean w() {
      return this.am.b(cd) != cbe.a.a;
   }

   public boolean A() {
      cbe.a $$0 = this.gq();
      return $$0 == cbe.a.c || $$0 == cbe.a.b && this.ce > 5L;
   }

   public boolean gg() {
      return this.gq() == cbe.a.b && this.ce > 8L;
   }

   private cbe.a gq() {
      return this.am.b(cd);
   }

   @Override
   protected void Z() {
      super.Z();
      aep.a(this);
   }

   public void a(cbe.a $$0) {
      this.am.b(cd, $$0);
   }

   private void w(boolean $$0) {
      this.a($$0 ? cbe.a.b : cbe.a.a);
   }

   @Override
   public void a(aie<?> $$0) {
      if (cd.equals($$0)) {
         this.ce = 0L;
      }

      super.a($$0);
   }

   @Override
   protected bpj.b<cbe> dP() {
      return cbf.a();
   }

   @Override
   protected bpj<?> a(Dynamic<?> $$0) {
      return cbf.a(this.dP().a($$0));
   }

   @Override
   protected void aa() {
      this.dM().ae().a("armadilloBrain");
      ((bpj<cbe>)this.bz).a((aow)this.dM(), this);
      this.dM().ae().c();
      this.dM().ae().a("armadilloActivityUpdate");
      cbf.a(this);
      this.dM().ae().c();
      if (this.bx() && !this.o_() && --this.cf <= 0) {
         this.a(atl.ak, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
         this.a(cpg.op);
         this.b(dpw.t);
         this.cf = this.gr();
      }

      super.aa();
   }

   private int gr() {
      return this.af.a(20 * axh.e * 5) + 20 * axh.e * 5;
   }

   @Override
   public void l() {
      super.l();
      if (this.dM().y_()) {
         this.gs();
      }

      if (this.w()) {
         this.fI();
      }

      this.ce++;
   }

   @Override
   public float dZ() {
      return this.o_() ? 0.6F : 1.0F;
   }

   private void gs() {
      switch (this.gq()) {
         case a:
            this.bX.a();
            this.bY.a();
            break;
         case c:
            this.bX.b(this.ag);
            this.bY.a();
            break;
         case b:
            this.bX.a();
            this.bY.b(this.ag);
      }
   }

   @Override
   public boolean m(cpd $$0) {
      return cbf.a.a($$0);
   }

   public static boolean c(bnw<cbe> $$0, cvs $$1, bom $$2, hz $$3, awp $$4) {
      return $$1.a_($$3.d()).a(aua.bQ) && a($$1, $$3);
   }

   public boolean j(boi $$0) {
      if (!this.cH().c(7.0, 2.0, 7.0).c($$0.cH())) {
         return false;
      } else if ($$0.ai().a(aud.d)) {
         return true;
      } else if (this.ei() == $$0) {
         return true;
      } else if ($$0 instanceof chl $$1) {
         return $$1.P_() ? false : $$1.bY() || $$1.bO();
      } else {
         return false;
      }
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("state", this.gq().c());
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.a(cbe.a.a($$0.l("state")));
   }

   public void gm() {
      if (!this.w()) {
         this.V();
         this.gl();
         this.b(dpw.u);
         this.b(atl.ai);
         this.w(true);
      }
   }

   public void gn() {
      if (this.w()) {
         this.b(dpw.u);
         this.b(atl.al);
         this.w(false);
      }
   }

   @Override
   public boolean a(bmp $$0, float $$1) {
      if (this.w()) {
         $$1 = ($$1 - 1.0F) / 2.0F;
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void f(bmp $$0, float $$1) {
      super.f($$0, $$1);
      if ($$0.d() instanceof boi) {
         this.dO().a(bxl.G, true, 60L);
         if (this.gp()) {
            this.gm();
         }
      } else {
         this.gn();
      }
   }

   @Override
   public blw b(chl $$0, blv $$1) {
      cpd $$2 = $$0.b($$1);
      if ($$2.a(cpg.xl)) {
         if (!$$0.fU().d) {
            $$2.a(16, $$0, d($$1));
         }

         this.go();
         return blw.a(this.dM().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   public void go() {
      this.b(new cpd(cpg.op));
      this.b(dpw.r);
      this.a(atl.am);
   }

   public boolean gp() {
      return !this.gd() && !this.bd() && !this.fU() && !this.bO() && !this.bP();
   }

   @Override
   public void g(@Nullable chl $$0) {
      super.g($$0);
      this.b(atl.ac);
   }

   @Override
   public boolean gh() {
      return super.gh() && !this.w();
   }

   @Override
   public atk d(cpd $$0) {
      return atl.ac;
   }

   @Override
   protected atk y() {
      return this.w() ? null : atl.af;
   }

   @Override
   protected atk n_() {
      return atl.ah;
   }

   @Override
   protected atk d(bmp $$0) {
      return this.w() ? atl.ae : atl.ad;
   }

   @Override
   protected void b(hz $$0, dlj $$1) {
      this.a(atl.ag, 0.15F, 1.0F);
   }

   @Override
   public int fH() {
      return this.w() ? 0 : 32;
   }

   @Override
   protected bud H() {
      return new bud(this) {
         @Override
         public void a() {
            if (!cbe.this.w()) {
               super.a();
            }
         }
      };
   }

   public static enum a implements axc {
      a("idle", 0),
      b("rolling", 1),
      c("scared", 2);

      private static final axc.a<cbe.a> e = axc.a(cbe.a::values);
      private static final IntFunction<cbe.a> f = ava.a(cbe.a::a, values(), ava.a.a);
      public static final xo<ByteBuf, cbe.a> d = xm.a(f, cbe.a::a);
      private final String g;
      private final int h;

      private a(String $$0, int $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public static cbe.a a(String $$0) {
         return e.a($$0, a);
      }

      @Override
      public String c() {
         return this.g;
      }

      private int a() {
         return this.h;
      }
   }
}
