import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cak extends bux implements bzg, cam {
   private static final aef<Boolean> bW = aei.a(cak.class, aeh.k);
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
   protected static final ImmutableList<? extends bts<? extends btr<? super cak>>> bT = ImmutableList.of(bts.c, bts.d, bts.n, bts.m);
   protected static final ImmutableList<? extends bsn<?>> bU = ImmutableList.of(
      bsn.r,
      bsn.g,
      bsn.h,
      bsn.k,
      bsn.l,
      bsn.n,
      bsn.m,
      bsn.E,
      bsn.t,
      bsn.o,
      bsn.p,
      bsn.ap,
      new bsn[]{bsn.z, bsn.ar, bsn.as, bsn.ao, bsn.J, bsn.av, bsn.aw, bsn.Y}
   );

   public cak(bja<? extends cak> $$0, cqb $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   public boolean a(cca $$0) {
      return !this.fS();
   }

   public static bkr.a s() {
      return bzo.gk().a(bks.l, 40.0).a(bks.m, 0.3F).a(bks.i, 0.6F).a(bks.d, 1.0).a(bks.c, 6.0);
   }

   @Override
   public boolean C(biw $$0) {
      if (!($$0 instanceof bjm)) {
         return false;
      } else {
         this.cf = 10;
         this.dL().a(this, (byte)4);
         this.a(apg.kO, 1.0F, this.eW());
         cal.a(this, (bjm)$$0);
         return cam.a(this, (bjm)$$0);
      }
   }

   @Override
   protected void e(bjm $$0) {
      if (this.t()) {
         cam.b(this, $$0);
      }
   }

   @Override
   public boolean a(bhu $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dL().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bjm) {
            cal.b(this, (bjm)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected bkm.b<cak> dO() {
      return bkm.a(bU, bT);
   }

   @Override
   protected bkm<?> a(Dynamic<?> $$0) {
      return cal.a(this.dO().a($$0));
   }

   @Override
   public bkm<cak> dN() {
      return (bkm<cak>)super.dN();
   }

   @Override
   protected void X() {
      this.dL().ad().a("hoglinBrain");
      this.dN().a((akt)this.dL(), this);
      this.dL().ad().c();
      cal.a(this);
      if (this.y()) {
         this.cg++;
         if (this.cg > 300) {
            this.b(apg.kP);
            this.c((akt)this.dL());
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
         this.a(bks.c).a(0.5);
      } else {
         this.bJ = 5;
         this.a(bks.c).a(6.0);
      }
   }

   public static boolean c(bja<cak> $$0, cqc $$1, bjq $$2, gw $$3, ash $$4) {
      return !$$1.a_($$3.d()).a(cte.kK);
   }

   @Nullable
   @Override
   public bkf a(cqq $$0, bhc $$1, bjq $$2, @Nullable bkf $$3, @Nullable qw $$4) {
      if ($$0.D_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.fL();
   }

   @Override
   public float a(gw $$0, cqe $$1) {
      if (cal.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.d()).a(cte.ow) ? 10.0F : 0.0F;
      }
   }

   @Override
   protected Vector3f a(biw $$0, bix $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.09375F * $$2, 0.0F);
   }

   @Override
   public bhe b(cca $$0, bhd $$1) {
      bhe $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.fJ();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cf = 10;
         this.a(apg.kO, 1.0F, this.eW());
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

   private void c(akt $$0) {
      cag $$1 = this.a(bja.bo, true);
      if ($$1 != null) {
         $$1.b(new bij(bil.i, 200, 0));
      }
   }

   @Override
   public boolean m(cjl $$0) {
      return $$0.a(cjo.dg);
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
   public void b(qw $$0) {
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
   public void a(qw $$0) {
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
      return !this.dL().C_().b() && !this.gl() && !this.fU();
   }

   private void x(boolean $$0) {
      this.ch = $$0;
   }

   public boolean gk() {
      return this.t() && !this.ch;
   }

   @Nullable
   @Override
   public bir a(akt $$0, bir $$1) {
      cak $$2 = bja.W.a((cqb)$$0);
      if ($$2 != null) {
         $$2.fJ();
      }

      return $$2;
   }

   @Override
   public boolean gf() {
      return !cal.c(this) && super.gf();
   }

   @Override
   public aph da() {
      return aph.f;
   }

   @Override
   protected apf w() {
      return this.dL().B ? null : cal.b(this).orElse(null);
   }

   @Override
   protected apf d(bhu $$0) {
      return apg.kR;
   }

   @Override
   protected apf l_() {
      return apg.kQ;
   }

   @Override
   protected apf aL() {
      return apg.lw;
   }

   @Override
   protected apf aM() {
      return apg.lv;
   }

   @Override
   protected void b(gw $$0, dfd $$1) {
      this.a(apg.kT, 0.15F, 1.0F);
   }

   protected void b(apf $$0) {
      this.a($$0, this.eV(), this.eW());
   }

   @Override
   protected void W() {
      super.W();
      abc.a(this);
   }
}
