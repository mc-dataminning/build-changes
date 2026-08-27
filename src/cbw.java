import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cbw extends bwj implements cas, cby {
   private static final afm<Boolean> bW = afp.a(cbw.class, afo.k);
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
   protected static final ImmutableList<? extends bve<? extends bvd<? super cbw>>> bT = ImmutableList.of(bve.c, bve.d, bve.n, bve.m);
   protected static final ImmutableList<? extends btz<?>> bU = ImmutableList.of(
      btz.r,
      btz.g,
      btz.h,
      btz.k,
      btz.l,
      btz.n,
      btz.m,
      btz.E,
      btz.t,
      btz.o,
      btz.p,
      btz.ap,
      new btz[]{btz.z, btz.ar, btz.as, btz.ao, btz.J, btz.av, btz.aw, btz.Y}
   );

   public cbw(bkm<? extends cbw> $$0, crs $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   public boolean a(cdm $$0) {
      return !this.fS();
   }

   public static bmd.a s() {
      return cba.gk().a(bme.l, 40.0).a(bme.m, 0.3F).a(bme.i, 0.6F).a(bme.d, 1.0).a(bme.c, 6.0);
   }

   @Override
   public boolean C(bki $$0) {
      if (!($$0 instanceof bky)) {
         return false;
      } else {
         this.cf = 10;
         this.dL().a(this, (byte)4);
         this.a(aqn.kS, 1.0F, this.eW());
         cbx.a(this, (bky)$$0);
         return cby.a(this, (bky)$$0);
      }
   }

   @Override
   protected void e(bky $$0) {
      if (this.t()) {
         cby.b(this, $$0);
      }
   }

   @Override
   public boolean a(bjg $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dL().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bky) {
            cbx.b(this, (bky)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected bly.b<cbw> dO() {
      return bly.a(bU, bT);
   }

   @Override
   protected bly<?> a(Dynamic<?> $$0) {
      return cbx.a(this.dO().a($$0));
   }

   @Override
   public bly<cbw> dN() {
      return (bly<cbw>)super.dN();
   }

   @Override
   protected void X() {
      this.dL().ad().a("hoglinBrain");
      this.dN().a((ama)this.dL(), this);
      this.dL().ad().c();
      cbx.a(this);
      if (this.y()) {
         this.cg++;
         if (this.cg > 300) {
            this.b(aqn.kT);
            this.c((ama)this.dL());
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
         this.a(bme.c).a(0.5);
      } else {
         this.bJ = 5;
         this.a(bme.c).a(6.0);
      }
   }

   public static boolean c(bkm<cbw> $$0, crt $$1, blc $$2, ht $$3, ato $$4) {
      return !$$1.a_($$3.d()).a(cuv.kK);
   }

   @Nullable
   @Override
   public blr a(csh $$0, bio $$1, blc $$2, @Nullable blr $$3, @Nullable rz $$4) {
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
   public float a(ht $$0, crv $$1) {
      if (cbx.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.d()).a(cuv.ow) ? 10.0F : 0.0F;
      }
   }

   @Override
   protected Vector3f a(bki $$0, bkj $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.09375F * $$2, 0.0F);
   }

   @Override
   public biq b(cdm $$0, bip $$1) {
      biq $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.fJ();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cf = 10;
         this.a(aqn.kS, 1.0F, this.eW());
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

   private void c(ama $$0) {
      cbs $$1 = this.a(bkm.bo, true);
      if ($$1 != null) {
         $$1.b(new bjv(bjx.i, 200, 0));
      }
   }

   @Override
   public boolean m(clb $$0) {
      return $$0.a(cle.dg);
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
   public void b(rz $$0) {
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
   public void a(rz $$0) {
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
   public bkd a(ama $$0, bkd $$1) {
      cbw $$2 = bkm.W.a((crs)$$0);
      if ($$2 != null) {
         $$2.fJ();
      }

      return $$2;
   }

   @Override
   public boolean gf() {
      return !cbx.c(this) && super.gf();
   }

   @Override
   public aqo da() {
      return aqo.f;
   }

   @Override
   protected aqm w() {
      return this.dL().B ? null : cbx.b(this).orElse(null);
   }

   @Override
   protected aqm d(bjg $$0) {
      return aqn.kV;
   }

   @Override
   protected aqm m_() {
      return aqn.kU;
   }

   @Override
   protected aqm aL() {
      return aqn.lA;
   }

   @Override
   protected aqm aM() {
      return aqn.lz;
   }

   @Override
   protected void b(ht $$0, dgw $$1) {
      this.a(aqn.kX, 0.15F, 1.0F);
   }

   protected void b(aqm $$0) {
      this.a($$0, this.eV(), this.eW());
   }

   @Override
   protected void W() {
      super.W();
      aci.a(this);
   }
}
