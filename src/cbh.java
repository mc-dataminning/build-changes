import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cbh extends bvu implements cad, cbj {
   private static final afc<Boolean> bW = aff.a(cbh.class, afe.k);
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
   protected static final ImmutableList<? extends bup<? extends buo<? super cbh>>> bT = ImmutableList.of(bup.c, bup.d, bup.n, bup.m);
   protected static final ImmutableList<? extends btk<?>> bU = ImmutableList.of(
      btk.r,
      btk.g,
      btk.h,
      btk.k,
      btk.l,
      btk.n,
      btk.m,
      btk.E,
      btk.t,
      btk.o,
      btk.p,
      btk.ap,
      new btk[]{btk.z, btk.ar, btk.as, btk.ao, btk.J, btk.av, btk.aw, btk.Y}
   );

   public cbh(bjx<? extends cbh> $$0, cqz $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   public boolean a(ccx $$0) {
      return !this.fS();
   }

   public static blo.a s() {
      return cal.gk().a(blp.l, 40.0).a(blp.m, 0.3F).a(blp.i, 0.6F).a(blp.d, 1.0).a(blp.c, 6.0);
   }

   @Override
   public boolean C(bjt $$0) {
      if (!($$0 instanceof bkj)) {
         return false;
      } else {
         this.cf = 10;
         this.dL().a(this, (byte)4);
         this.a(aqd.kQ, 1.0F, this.eW());
         cbi.a(this, (bkj)$$0);
         return cbj.a(this, (bkj)$$0);
      }
   }

   @Override
   protected void e(bkj $$0) {
      if (this.t()) {
         cbj.b(this, $$0);
      }
   }

   @Override
   public boolean a(bir $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dL().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bkj) {
            cbi.b(this, (bkj)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected blj.b<cbh> dO() {
      return blj.a(bU, bT);
   }

   @Override
   protected blj<?> a(Dynamic<?> $$0) {
      return cbi.a(this.dO().a($$0));
   }

   @Override
   public blj<cbh> dN() {
      return (blj<cbh>)super.dN();
   }

   @Override
   protected void X() {
      this.dL().ad().a("hoglinBrain");
      this.dN().a((alq)this.dL(), this);
      this.dL().ad().c();
      cbi.a(this);
      if (this.y()) {
         this.cg++;
         if (this.cg > 300) {
            this.b(aqd.kR);
            this.c((alq)this.dL());
         }
      } else {
         this.cg = 0;
      }
   }

   @Override
   public void c_() {
      if (this.cf > 0) {
         this.cf--;
      }

      super.c_();
   }

   @Override
   protected void m() {
      if (this.n_()) {
         this.bJ = 3;
         this.a(blp.c).a(0.5);
      } else {
         this.bJ = 5;
         this.a(blp.c).a(6.0);
      }
   }

   public static boolean c(bjx<cbh> $$0, cra $$1, bkn $$2, ht $$3, ate $$4) {
      return !$$1.a_($$3.d()).a(cuc.kK);
   }

   @Nullable
   @Override
   public blc a(cro $$0, bhz $$1, bkn $$2, @Nullable blc $$3, @Nullable rt $$4) {
      if ($$0.E_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.fL();
   }

   @Override
   public float a(ht $$0, crc $$1) {
      if (cbi.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.d()).a(cuc.ow) ? 10.0F : 0.0F;
      }
   }

   @Override
   protected Vector3f a(bjt $$0, bju $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.09375F * $$2, 0.0F);
   }

   @Override
   public bib b(ccx $$0, bia $$1) {
      bib $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.fJ();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cf = 10;
         this.a(aqd.kQ, 1.0F, this.eW());
      } else {
         super.b($$0);
      }
   }

   @Override
   public int ge() {
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

   private void c(alq $$0) {
      cbd $$1 = this.a(bjx.bo, true);
      if ($$1 != null) {
         $$1.b(new bjg(bji.i, 200, 0));
      }
   }

   @Override
   public boolean m(ckj $$0) {
      return $$0.a(ckm.dg);
   }

   public boolean t() {
      return !this.n_();
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(bW, false);
   }

   @Override
   public void b(rt $$0) {
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
   public void a(rt $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.cg = $$0.h("TimeInOverworld");
      this.x($$0.q("CannotBeHunted"));
   }

   public void w(boolean $$0) {
      this.al().b(bW, $$0);
   }

   private boolean gl() {
      return this.al().b(bW);
   }

   public boolean y() {
      return !this.dL().D_().b() && !this.gl() && !this.fU();
   }

   private void x(boolean $$0) {
      this.ch = $$0;
   }

   public boolean gk() {
      return this.t() && !this.ch;
   }

   @Nullable
   @Override
   public bjo a(alq $$0, bjo $$1) {
      cbh $$2 = bjx.W.a((cqz)$$0);
      if ($$2 != null) {
         $$2.fJ();
      }

      return $$2;
   }

   @Override
   public boolean gf() {
      return !cbi.c(this) && super.gf();
   }

   @Override
   public aqe da() {
      return aqe.f;
   }

   @Override
   protected aqc w() {
      return this.dL().B ? null : cbi.b(this).orElse(null);
   }

   @Override
   protected aqc d(bir $$0) {
      return aqd.kT;
   }

   @Override
   protected aqc m_() {
      return aqd.kS;
   }

   @Override
   protected aqc aL() {
      return aqd.ly;
   }

   @Override
   protected aqc aM() {
      return aqd.lx;
   }

   @Override
   protected void b(ht $$0, dgb $$1) {
      this.a(aqd.kV, 0.15F, 1.0F);
   }

   protected void b(aqc $$0) {
      this.a($$0, this.eV(), this.eW());
   }

   @Override
   protected void W() {
      super.W();
      abz.a(this);
   }
}
