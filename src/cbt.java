import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cbt extends cam {
   public static final float bV = 0.6F;
   public static final float bW = 32.5F;
   private static final int cb = 5;
   private static final int cc = 8;
   public static final int bY = 60;
   private static final double cd = 7.0;
   private static final double ce = 2.0;
   private static final aii<cbt.a> cf = ail.a(cbt.class, aik.z);
   private long cg = 0L;
   public final bob bZ = new bob();
   public final bob ca = new bob();
   private int ch;

   public cbt(bol<? extends cam> $$0, cwe $$1) {
      super($$0, $$1);
      this.N().a(true);
      this.ch = this.gw();
   }

   @Nullable
   @Override
   public boa a(apa $$0, boa $$1) {
      return bol.d.a((cwe)$$0);
   }

   public static bqd.a u() {
      return boz.C().a(bqe.n, 12.0).a(bqe.o, 0.14);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(cf, cbt.a.a);
   }

   public boolean w() {
      return this.am.b(cf) != cbt.a.a;
   }

   public boolean A() {
      cbt.a $$0 = this.gv();
      return $$0 == cbt.a.c || $$0 == cbt.a.b && this.cg > 5L;
   }

   public boolean gl() {
      return this.gv() == cbt.a.b && this.cg > 8L;
   }

   private cbt.a gv() {
      return this.am.b(cf);
   }

   @Override
   protected void Z() {
      super.Z();
      aes.a(this);
   }

   public void a(cbt.a $$0) {
      this.am.b(cf, $$0);
   }

   private void w(boolean $$0) {
      this.a($$0 ? cbt.a.b : cbt.a.a);
   }

   @Override
   public void a(aii<?> $$0) {
      if (cf.equals($$0)) {
         this.cg = 0L;
      }

      super.a($$0);
   }

   @Override
   protected bpy.b<cbt> dN() {
      return cbu.a();
   }

   @Override
   protected bpy<?> a(Dynamic<?> $$0) {
      return cbu.a(this.dN().a($$0));
   }

   @Override
   protected void aa() {
      this.dJ().ae().a("armadilloBrain");
      ((bpy<cbt>)this.bA).a((apa)this.dJ(), this);
      this.dJ().ae().c();
      this.dJ().ae().a("armadilloActivityUpdate");
      cbu.a(this);
      this.dJ().ae().c();
      if (this.bx() && !this.o_() && --this.ch <= 0) {
         this.a(atp.ak, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
         this.a(cpt.op);
         this.b(dqr.t);
         this.ch = this.gw();
      }

      super.aa();
   }

   private int gw() {
      return this.af.a(20 * axl.e * 5) + 20 * axl.e * 5;
   }

   @Override
   public void l() {
      super.l();
      if (this.dJ().y_()) {
         this.gx();
      }

      if (this.w()) {
         this.fK();
      }

      this.cg++;
   }

   @Override
   public float dX() {
      return this.o_() ? 0.6F : 1.0F;
   }

   private void gx() {
      switch (this.gv()) {
         case a:
            this.bZ.a();
            this.ca.a();
            break;
         case c:
            this.bZ.b(this.ag);
            this.ca.a();
            break;
         case b:
            this.bZ.a();
            this.ca.b(this.ag);
      }
   }

   @Override
   public boolean o(cpq $$0) {
      return cbu.a.a($$0);
   }

   public static boolean c(bol<cbt> $$0, cwf $$1, bpb $$2, ib $$3, awt $$4) {
      return $$1.a_($$3.d()).a(aue.bQ) && a($$1, $$3);
   }

   public boolean j(box $$0) {
      if (!this.cE().c(7.0, 2.0, 7.0).c($$0.cE())) {
         return false;
      } else if ($$0.ai().a(auh.d)) {
         return true;
      } else if (this.eg() == $$0) {
         return true;
      } else if ($$0 instanceof cia $$1) {
         return $$1.P_() ? false : $$1.bV() || $$1.bL();
      } else {
         return false;
      }
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      $$0.a("state", this.gv().c());
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      this.a(cbt.a.a($$0.l("state")));
   }

   public void gr() {
      if (!this.w()) {
         this.V();
         this.gq();
         this.b(dqr.u);
         this.b(atp.ai);
         this.w(true);
      }
   }

   public void gs() {
      if (this.w()) {
         this.b(dqr.u);
         this.b(atp.al);
         this.w(false);
      }
   }

   @Override
   public boolean a(bne $$0, float $$1) {
      if (this.w()) {
         $$1 = ($$1 - 1.0F) / 2.0F;
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void f(bne $$0, float $$1) {
      super.f($$0, $$1);
      if ($$0.d() instanceof box) {
         this.dM().a(bya.G, true, 60L);
         if (this.gu()) {
            this.gr();
         }
      } else {
         this.gs();
      }
   }

   @Override
   public bml b(cia $$0, bmk $$1) {
      cpq $$2 = $$0.b($$1);
      if ($$2.a(cpt.xl)) {
         if (!$$0.fW().d) {
            $$2.a(16, $$0, d($$1));
         }

         this.gt();
         return bml.a(this.dJ().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   public void gt() {
      this.b(new cpq(cpt.op));
      this.b(dqr.r);
      this.a(atp.am);
   }

   public boolean gu() {
      return !this.gi() && !this.bd() && !this.fZ() && !this.bL() && !this.bM();
   }

   @Override
   public void g(@Nullable cia $$0) {
      super.g($$0);
      this.b(atp.ac);
   }

   @Override
   public boolean gm() {
      return super.gm() && !this.w();
   }

   @Override
   public ato d(cpq $$0) {
      return atp.ac;
   }

   @Override
   protected ato y() {
      return this.w() ? null : atp.af;
   }

   @Override
   protected ato n_() {
      return atp.ah;
   }

   @Override
   protected ato d(bne $$0) {
      return this.w() ? atp.ae : atp.ad;
   }

   @Override
   protected void b(ib $$0, dme $$1) {
      this.a(atp.ag, 0.15F, 1.0F);
   }

   @Override
   public int fJ() {
      return this.w() ? 0 : 32;
   }

   @Override
   protected bus H() {
      return new bus(this) {
         @Override
         public void a() {
            if (!cbt.this.w()) {
               super.a();
            }
         }
      };
   }

   public static enum a implements axg {
      a("idle", 0),
      b("rolling", 1),
      c("scared", 2);

      private static final axg.a<cbt.a> e = axg.a(cbt.a::values);
      private static final IntFunction<cbt.a> f = ave.a(cbt.a::a, values(), ave.a.a);
      public static final xq<ByteBuf, cbt.a> d = xo.a(f, cbt.a::a);
      private final String g;
      private final int h;

      private a(String $$0, int $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public static cbt.a a(String $$0) {
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
