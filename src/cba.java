import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cba extends bzt {
   public static final float bT = 0.6F;
   public static final float bU = 32.5F;
   private static final int bZ = 5;
   private static final int ca = 8;
   public static final int bW = 60;
   private static final double cb = 7.0;
   private static final double cc = 2.0;
   private static final aie<cba.a> cd = aih.a(cba.class, aig.z);
   private long ce = 0L;
   public final bnk bX = new bnk();
   public final bnk bY = new bnk();
   private int cf;

   public cba(bnu<? extends bzt> $$0, cvn $$1) {
      super($$0, $$1);
      this.N().a(true);
      this.cf = this.gr();
   }

   @Nullable
   @Override
   public bnj a(aov $$0, bnj $$1) {
      return bnu.d.a((cvn)$$0);
   }

   public static bpk.a u() {
      return boi.C().a(bpl.n, 12.0).a(bpl.o, 0.14);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(cd, cba.a.a);
   }

   public boolean w() {
      return this.am.b(cd) != cba.a.a;
   }

   public boolean A() {
      cba.a $$0 = this.gq();
      return $$0 == cba.a.c || $$0 == cba.a.b && this.ce > 5L;
   }

   public boolean gg() {
      return this.gq() == cba.a.b && this.ce > 8L;
   }

   private cba.a gq() {
      return this.am.b(cd);
   }

   @Override
   protected void Z() {
      super.Z();
      aep.a(this);
   }

   public void a(cba.a $$0) {
      this.am.b(cd, $$0);
   }

   private void w(boolean $$0) {
      this.a($$0 ? cba.a.b : cba.a.a);
   }

   @Override
   public void a(aie<?> $$0) {
      if (cd.equals($$0)) {
         this.ce = 0L;
      }

      super.a($$0);
   }

   @Override
   protected bpf.b<cba> dP() {
      return cbb.a();
   }

   @Override
   protected bpf<?> a(Dynamic<?> $$0) {
      return cbb.a(this.dP().a($$0));
   }

   @Override
   protected void aa() {
      this.dM().af().a("armadilloBrain");
      ((bpf<cba>)this.bz).a((aov)this.dM(), this);
      this.dM().af().c();
      this.dM().af().a("armadilloActivityUpdate");
      cbb.a(this);
      this.dM().af().c();
      if (this.bx() && !this.o_() && --this.cf <= 0) {
         this.a(atk.aj, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
         this.a(cpc.op);
         this.b(dpp.t);
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
   public boolean m(coz $$0) {
      return cbb.a.a($$0);
   }

   public static boolean c(bnu<cba> $$0, cvo $$1, bok $$2, hz $$3, awo $$4) {
      return $$1.a_($$3.d()).a(atz.bQ) && a($$1, $$3);
   }

   public boolean j(bog $$0) {
      if (!this.cH().c(7.0, 2.0, 7.0).c($$0.cH())) {
         return false;
      } else if ($$0.ai().a(auc.d)) {
         return true;
      } else if ($$0 instanceof chh $$1) {
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
      this.a(cba.a.a($$0.l("state")));
   }

   public void gm() {
      if (!this.w()) {
         this.V();
         this.gl();
         this.b(dpp.u);
         this.b(atk.ah);
         this.w(true);
      }
   }

   public void gn() {
      if (this.w()) {
         this.b(dpp.u);
         this.b(atk.ak);
         this.w(false);
      }
   }

   @Override
   protected void f(bmn $$0, float $$1) {
      this.gn();
      super.f($$0, $$1);
   }

   @Override
   public blu b(chh $$0, blt $$1) {
      coz $$2 = $$0.b($$1);
      if ($$2.a(cpc.xl)) {
         if (!$$0.fU().d) {
            $$2.a(16, $$0, d($$1));
         }

         this.go();
         return blu.a(this.dM().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   public void go() {
      this.b(new coz(cpc.op));
      this.b(dpp.r);
      this.a(atk.al);
   }

   public boolean gp() {
      return !this.gd() && !this.bd() && !this.fU() && !this.bO() && !this.bP();
   }

   @Override
   public void g(@Nullable chh $$0) {
      super.g($$0);
      this.b(atk.ac);
   }

   @Override
   public boolean gh() {
      return super.gh() && !this.w();
   }

   @Override
   public atj d(coz $$0) {
      return atk.ac;
   }

   @Override
   protected atj y() {
      return this.w() ? null : atk.ae;
   }

   @Override
   protected atj n_() {
      return atk.ag;
   }

   @Override
   protected atj d(bmn $$0) {
      return atk.ad;
   }

   @Override
   protected void b(hz $$0, dlf $$1) {
      this.a(atk.af, 0.15F, 1.0F);
   }

   @Override
   public int fH() {
      return this.w() ? 0 : 32;
   }

   @Override
   protected btz H() {
      return new btz(this) {
         @Override
         public void a() {
            if (!cba.this.w()) {
               super.a();
            }
         }
      };
   }

   public static enum a implements axc {
      a("idle", 0),
      b("rolling", 1),
      c("scared", 2);

      private static final axc.a<cba.a> e = axc.a(cba.a::values);
      private static final IntFunction<cba.a> f = auz.a(cba.a::a, values(), auz.a.a);
      public static final xo<ByteBuf, cba.a> d = xm.a(f, cba.a::a);
      private final String g;
      private final int h;

      private a(String $$0, int $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public static cba.a a(String $$0) {
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
