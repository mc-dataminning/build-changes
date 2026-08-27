import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cdr extends bxx implements ccg, cdt {
   private static final agm<Boolean> bW = agp.a(cdr.class, ago.k);
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
   protected static final ImmutableList<? extends bws<? extends bwr<? super cdr>>> bT = ImmutableList.of(bws.c, bws.d, bws.n, bws.m);
   protected static final ImmutableList<? extends bvm<?>> bU = ImmutableList.of(
      bvm.r,
      bvm.g,
      bvm.h,
      bvm.k,
      bvm.l,
      bvm.n,
      bvm.m,
      bvm.E,
      bvm.t,
      bvm.o,
      bvm.p,
      bvm.ap,
      new bvm[]{bvm.z, bvm.ar, bvm.as, bvm.ao, bvm.J, bvm.av, bvm.aw, bvm.Y}
   );

   public cdr(bly<? extends cdr> $$0, cto $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   public boolean a(cfh $$0) {
      return !this.fS();
   }

   public static bnp.a u() {
      return cco.gk().a(bnq.l, 40.0).a(bnq.m, 0.3F).a(bnq.i, 0.6F).a(bnq.d, 1.0).a(bnq.c, 6.0);
   }

   @Override
   public boolean C(blu $$0) {
      if (!($$0 instanceof bmk)) {
         return false;
      } else {
         this.cf = 10;
         this.dM().a(this, (byte)4);
         this.a(arr.lC, 1.0F, this.eX());
         cds.a(this, (bmk)$$0);
         return cdt.a(this, (bmk)$$0);
      }
   }

   @Override
   protected void e(bmk $$0) {
      if (this.w()) {
         cdt.b(this, $$0);
      }
   }

   @Override
   public boolean a(bks $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dM().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bmk) {
            cds.b(this, (bmk)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected bnk.b<cdr> dP() {
      return bnk.a(bU, bT);
   }

   @Override
   protected bnk<?> a(Dynamic<?> $$0) {
      return cds.a(this.dP().a($$0));
   }

   @Override
   public bnk<cdr> dO() {
      return (bnk<cdr>)super.dO();
   }

   @Override
   protected void Z() {
      this.dM().af().a("hoglinBrain");
      this.dO().a((and)this.dM(), this);
      this.dM().af().c();
      cds.a(this);
      if (this.A()) {
         this.cg++;
         if (this.cg > 300) {
            this.b(arr.lD);
            this.c((and)this.dM());
         }
      } else {
         this.cg = 0;
      }
   }

   @Override
   public void d_() {
      if (this.cf > 0) {
         this.cf--;
      }

      super.d_();
   }

   @Override
   protected void m() {
      if (this.o_()) {
         this.bJ = 3;
         this.a(bnq.c).a(0.5);
      } else {
         this.bJ = 5;
         this.a(bnq.c).a(6.0);
      }
   }

   public static boolean c(bly<cdr> $$0, ctp $$1, bmo $$2, hx $$3, auu $$4) {
      return !$$1.a_($$3.d()).a(cwr.kK);
   }

   @Nullable
   @Override
   public bnd a(cud $$0, bjy $$1, bmo $$2, @Nullable bnd $$3, @Nullable sn $$4) {
      if ($$0.F_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.fL();
   }

   @Override
   public float a(hx $$0, ctr $$1) {
      if (cds.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.d()).a(cwr.ow) ? 10.0F : 0.0F;
      }
   }

   @Override
   protected Vector3f a(blu $$0, blv $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.09375F * $$2, 0.0F);
   }

   @Override
   public bka b(cfh $$0, bjz $$1) {
      bka $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.fJ();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cf = 10;
         this.a(arr.lC, 1.0F, this.eX());
      } else {
         super.b($$0);
      }
   }

   @Override
   public int ge() {
      return this.cf;
   }

   @Override
   public boolean ec() {
      return true;
   }

   @Override
   public int ee() {
      return this.bJ;
   }

   private void c(and $$0) {
      cdg $$1 = this.a(bly.bq, true);
      if ($$1 != null) {
         $$1.b(new blh(blj.i, 200, 0));
      }
   }

   @Override
   public boolean m(cmx $$0) {
      return $$0.a(cna.dB);
   }

   public boolean w() {
      return !this.o_();
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bW, false);
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      if (this.gl()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.cg);
      if (this.ch) {
         $$0.a("CannotBeHunted", true);
      }
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.cg = $$0.h("TimeInOverworld");
      this.x($$0.q("CannotBeHunted"));
   }

   public void w(boolean $$0) {
      this.an().b(bW, $$0);
   }

   private boolean gl() {
      return this.an().b(bW);
   }

   public boolean A() {
      return !this.dM().E_().b() && !this.gl() && !this.fU();
   }

   private void x(boolean $$0) {
      this.ch = $$0;
   }

   public boolean gk() {
      return this.w() && !this.ch;
   }

   @Nullable
   @Override
   public blp a(and $$0, blp $$1) {
      cdr $$2 = bly.X.a((cto)$$0);
      if ($$2 != null) {
         $$2.fJ();
      }

      return $$2;
   }

   @Override
   public boolean gf() {
      return !cds.c(this) && super.gf();
   }

   @Override
   public ars db() {
      return ars.f;
   }

   @Override
   protected arq y() {
      return this.dM().B ? null : cds.b(this).orElse(null);
   }

   @Override
   protected arq d(bks $$0) {
      return arr.lF;
   }

   @Override
   protected arq n_() {
      return arr.lE;
   }

   @Override
   protected arq aN() {
      return arr.mk;
   }

   @Override
   protected arq aO() {
      return arr.mj;
   }

   @Override
   protected void b(hx $$0, djg $$1) {
      this.a(arr.lH, 0.15F, 1.0F);
   }

   protected void b(arq $$0) {
      this.a($$0, this.eW(), this.eX());
   }

   @Override
   protected void Y() {
      super.Y();
      adi.a(this);
   }
}
