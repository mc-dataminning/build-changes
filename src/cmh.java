import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cmh extends cgd implements ckv, cmj {
   private static final akh<Boolean> ca = akl.a(cmh.class, akj.k);
   private static final int cc = 40;
   private static final float cd = 0.3F;
   private static final int ce = 1;
   private static final float cf = 0.6F;
   private static final int cg = 6;
   private static final float ch = 0.5F;
   private static final int ci = 300;
   private int cj;
   private int ck;
   private boolean cl;
   protected static final ImmutableList<? extends cex<? extends cew<? super cmh>>> bY = ImmutableList.of(cex.c, cex.d, cex.o, cex.n);
   protected static final ImmutableList<? extends cdq<?>> bZ = ImmutableList.of(
      cdq.r,
      cdq.g,
      cdq.h,
      cdq.k,
      cdq.l,
      cdq.n,
      cdq.m,
      cdq.E,
      cdq.t,
      cdq.o,
      cdq.p,
      cdq.aq,
      new cdq[]{cdq.z, cdq.as, cdq.at, cdq.ap, cdq.K, cdq.aw, cdq.ax, cdq.Z}
   );

   public cmh(bty<? extends cmh> $$0, dej $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   public boolean A() {
      return true;
   }

   public static bvt.a q() {
      return cld.gu().a(bvu.s, 40.0).a(bvu.v, 0.3F).a(bvu.p, 0.6F).a(bvu.d, 1.0).a(bvu.c, 6.0);
   }

   @Override
   public boolean E(btr $$0) {
      if (!($$0 instanceof bun)) {
         return false;
      } else {
         this.cj = 10;
         this.dS().a(this, (byte)4);
         this.b(awg.mr);
         cmi.a(this, (bun)$$0);
         return cmj.a(this, (bun)$$0);
      }
   }

   @Override
   protected void e(bun $$0) {
      if (this.t()) {
         cmj.b(this, $$0);
      }
   }

   @Override
   public boolean a(bsj $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dS().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bun) {
            cmi.b(this, (bun)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected bvo.b<cmh> dZ() {
      return bvo.a(bZ, bY);
   }

   @Override
   protected bvo<?> a(Dynamic<?> $$0) {
      return cmi.a(this.dZ().a($$0));
   }

   @Override
   public bvo<cmh> dY() {
      return (bvo<cmh>)super.dY();
   }

   @Override
   protected void ac() {
      this.dS().ah().a("hoglinBrain");
      this.dY().a((arj)this.dS(), this);
      this.dS().ah().c();
      cmi.a(this);
      if (this.y()) {
         this.ck++;
         if (this.ck > 300) {
            this.b(awg.ms);
            this.a((arj)this.dS());
         }
      } else {
         this.ck = 0;
      }
   }

   @Override
   public void n_() {
      if (this.cj > 0) {
         this.cj--;
      }

      super.n_();
   }

   @Override
   protected void k() {
      if (this.p_()) {
         this.bN = 3;
         this.g(bvu.c).a(0.5);
      } else {
         this.bN = 5;
         this.g(bvu.c).a(6.0);
      }
   }

   public static boolean c(bty<cmh> $$0, dek $$1, btx $$2, jf $$3, azn $$4) {
      return !$$1.a_($$3.e()).a(dho.kK);
   }

   @Nullable
   @Override
   public bvf a(dez $$0, brq $$1, btx $$2, @Nullable bvf $$3) {
      if ($$0.D_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean h(double $$0) {
      return !this.fX();
   }

   @Override
   public float a(jf $$0, dem $$1) {
      if (cmi.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.e()).a(dho.ow) ? 10.0F : 0.0F;
      }
   }

   @Override
   public brs b(cnx $$0, brr $$1) {
      brs $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.fW();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cj = 10;
         this.b(awg.mr);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int go() {
      return this.cj;
   }

   @Override
   public boolean ej() {
      return true;
   }

   @Override
   protected int el() {
      return this.bN;
   }

   private void a(arj $$0) {
      clv $$1 = this.a(bty.bt, true);
      if ($$1 != null) {
         $$1.a(new bsy(bta.i, 200, 0));
      }
   }

   @Override
   public boolean n(cvs $$0) {
      return $$0.a(axe.am);
   }

   public boolean t() {
      return !this.p_();
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(ca, false);
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      if (this.gq()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.ck);
      if (this.cl) {
         $$0.a("CannotBeHunted", true);
      }
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      this.x($$0.q("IsImmuneToZombification"));
      this.ck = $$0.h("TimeInOverworld");
      this.y($$0.q("CannotBeHunted"));
   }

   public void x(boolean $$0) {
      this.at().a(ca, $$0);
   }

   private boolean gq() {
      return this.at().a(ca);
   }

   public boolean y() {
      return !this.dS().C_().b() && !this.gq() && !this.gd();
   }

   private void y(boolean $$0) {
      this.cl = $$0;
   }

   public boolean gp() {
      return this.t() && !this.cl;
   }

   @Nullable
   @Override
   public btk a(arj $$0, btk $$1) {
      cmh $$2 = bty.Z.a($$0, btx.e);
      if ($$2 != null) {
         $$2.fW();
      }

      return $$2;
   }

   @Override
   public boolean gv() {
      return !cmi.c(this) && super.gv();
   }

   @Override
   public awh di() {
      return awh.f;
   }

   @Override
   protected awf w() {
      return this.dS().B ? null : cmi.b(this).orElse(null);
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.mu;
   }

   @Override
   protected awf o_() {
      return awg.mt;
   }

   @Override
   protected awf aT() {
      return awg.mZ;
   }

   @Override
   protected awf aU() {
      return awg.mY;
   }

   @Override
   protected void b(jf $$0, dus $$1) {
      this.a(awg.mw, 0.15F, 1.0F);
   }

   @Override
   protected void ab() {
      super.ab();
      ago.a(this);
   }

   @Nullable
   @Override
   public bun m() {
      return this.R();
   }
}
