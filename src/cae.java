import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cae extends bur implements bza, cag {
   private static final aef<Boolean> bW = aei.a(cae.class, aeh.k);
   private static final float bX = 0.2F;
   private static final int bY = 40;
   private static final float bZ = 0.3F;
   private static final int ca = 1;
   private static final float cb = 0.6F;
   private static final int cc = 6;
   private static final float cd = 0.5F;
   private static final int ce = 300;
   private int cf;
   private int cg;
   private boolean ch;
   protected static final ImmutableList<? extends btm<? extends btl<? super cae>>> bT = ImmutableList.of(btm.c, btm.d, btm.n, btm.m);
   protected static final ImmutableList<? extends bsh<?>> bU = ImmutableList.of(
      bsh.r, bsh.g, bsh.h, bsh.k, bsh.l, bsh.n, bsh.m, bsh.E, bsh.t, bsh.o, bsh.p, bsh.ap, new bsh[]{bsh.z, bsh.ar, bsh.as, bsh.ao, bsh.J, bsh.av, bsh.aw}
   );

   public cae(biu<? extends cae> $$0, cpv $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   public boolean a(cbu $$0) {
      return !this.fR();
   }

   public static bkl.a s() {
      return bzi.gj().a(bkm.a, 40.0).a(bkm.d, 0.3F).a(bkm.c, 0.6F).a(bkm.g, 1.0).a(bkm.f, 6.0);
   }

   @Override
   public boolean C(biq $$0) {
      if (!($$0 instanceof bjg)) {
         return false;
      } else {
         this.cf = 10;
         this.dL().a(this, (byte)4);
         this.a(ape.kO, 1.0F, this.eW());
         caf.a(this, (bjg)$$0);
         return cag.a(this, (bjg)$$0);
      }
   }

   @Override
   protected void e(bjg $$0) {
      if (this.t()) {
         cag.b(this, $$0);
      }
   }

   @Override
   public boolean a(bho $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dL().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bjg) {
            caf.b(this, (bjg)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected bkg.b<cae> dO() {
      return bkg.a(bU, bT);
   }

   @Override
   protected bkg<?> a(Dynamic<?> $$0) {
      return caf.a(this.dO().a($$0));
   }

   @Override
   public bkg<cae> dN() {
      return (bkg<cae>)super.dN();
   }

   @Override
   protected void Y() {
      this.dL().ad().a("hoglinBrain");
      this.dN().a((akr)this.dL(), this);
      this.dL().ad().c();
      caf.a(this);
      if (this.y()) {
         this.cg++;
         if (this.cg > 300) {
            this.b(ape.kP);
            this.c((akr)this.dL());
         }
      } else {
         this.cg = 0;
      }
   }

   @Override
   public void b_() {
      if (this.cf > 0) {
         this.cf--;
      }

      super.b_();
   }

   @Override
   protected void m() {
      if (this.m_()) {
         this.bJ = 3;
         this.a(bkm.f).a(0.5);
      } else {
         this.bJ = 5;
         this.a(bkm.f).a(6.0);
      }
   }

   public static boolean c(biu<cae> $$0, cpw $$1, bjk $$2, gw $$3, asc $$4) {
      return !$$1.a_($$3.d()).a(csw.kK);
   }

   @Nullable
   @Override
   public bjz a(cqk $$0, bgw $$1, bjk $$2, @Nullable bjz $$3, @Nullable qx $$4) {
      if ($$0.D_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.fK();
   }

   @Override
   public float a(gw $$0, cpy $$1) {
      if (caf.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.d()).a(csw.ow) ? 10.0F : 0.0F;
      }
   }

   @Override
   protected Vector3f a(biq $$0, bir $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.09375F * $$2, 0.0F);
   }

   @Override
   public bgy b(cbu $$0, bgx $$1) {
      bgy $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.fI();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cf = 10;
         this.a(ape.kO, 1.0F, this.eW());
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gd() {
      return this.cf;
   }

   @Override
   public boolean eb() {
      return true;
   }

   @Override
   public int ed() {
      return this.bJ;
   }

   private void c(akr $$0) {
      caa $$1 = this.a(biu.bo, true);
      if ($$1 != null) {
         $$1.b(new bid(bif.i, 200, 0));
      }
   }

   @Override
   public boolean m(cjf $$0) {
      return $$0.a(cji.dg);
   }

   public boolean t() {
      return !this.m_();
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bW, false);
   }

   @Override
   public void b(qx $$0) {
      super.b($$0);
      if (this.gk()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.cg);
      if (this.ch) {
         $$0.a("CannotBeHunted", true);
      }
   }

   @Override
   public void a(qx $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.cg = $$0.h("TimeInOverworld");
      this.x($$0.q("CannotBeHunted"));
   }

   public void w(boolean $$0) {
      this.am().b(bW, $$0);
   }

   private boolean gk() {
      return this.am().b(bW);
   }

   public boolean y() {
      return !this.dL().C_().b() && !this.gk() && !this.fT();
   }

   private void x(boolean $$0) {
      this.ch = $$0;
   }

   public boolean gj() {
      return this.t() && !this.ch;
   }

   @Nullable
   @Override
   public bil a(akr $$0, bil $$1) {
      cae $$2 = biu.W.a((cpv)$$0);
      if ($$2 != null) {
         $$2.fI();
      }

      return $$2;
   }

   @Override
   public boolean ge() {
      return !caf.c(this) && super.ge();
   }

   @Override
   public apf db() {
      return apf.f;
   }

   @Override
   protected apd w() {
      return this.dL().B ? null : caf.b(this).orElse(null);
   }

   @Override
   protected apd d(bho $$0) {
      return ape.kR;
   }

   @Override
   protected apd l_() {
      return ape.kQ;
   }

   @Override
   protected apd aM() {
      return ape.lw;
   }

   @Override
   protected apd aN() {
      return ape.lv;
   }

   @Override
   protected void b(gw $$0, dfj $$1) {
      this.a(ape.kT, 0.15F, 1.0F);
   }

   protected void b(apd $$0) {
      this.a($$0, this.eV(), this.eW());
   }

   @Override
   protected void X() {
      super.X();
      abc.a(this);
   }
}
