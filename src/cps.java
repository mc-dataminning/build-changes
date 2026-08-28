import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cps extends ciz implements coc, cpu {
   private static final akj<Boolean> bK = akn.a(cps.class, akl.k);
   private static final int bL = 40;
   private static final float bM = 0.3F;
   private static final int bN = 1;
   private static final float bO = 0.6F;
   private static final int bP = 6;
   private static final float bQ = 0.5F;
   public static final int bG = 300;
   private int bR;
   private int bS;
   private boolean bT;
   protected static final ImmutableList<? extends chs<? extends chr<? super cps>>> bH = ImmutableList.of(chs.c, chs.d, chs.o, chs.n);
   protected static final ImmutableList<? extends cgl<?>> bI = ImmutableList.of(
      cgl.s,
      cgl.g,
      cgl.h,
      cgl.k,
      cgl.l,
      cgl.o,
      cgl.n,
      cgl.F,
      cgl.u,
      cgl.p,
      cgl.q,
      cgl.ar,
      new cgl[]{cgl.A, cgl.at, cgl.au, cgl.aq, cgl.L, cgl.ax, cgl.ay, cgl.aa}
   );

   public cps(bwr<? extends cps> $$0, djh $$1) {
      super($$0, $$1);
      this.by = 5;
   }

   @VisibleForTesting
   public void s(int $$0) {
      this.bS = $$0;
   }

   @Override
   public boolean w() {
      return true;
   }

   public static byo.a t() {
      return cok.gw().a(byp.s, 40.0).a(byp.v, 0.3F).a(byp.p, 0.6F).a(byp.d, 1.0).a(byp.c, 6.0);
   }

   @Override
   public boolean c(arq $$0, bwi $$1) {
      if ($$1 instanceof bxj $$2) {
         this.bR = 10;
         this.dU().a(this, (byte)4);
         this.b(awn.mS);
         cpt.a(this, $$2);
         return cpu.a($$0, this, $$2);
      } else {
         return false;
      }
   }

   @Override
   protected void d(bxj $$0) {
      if (this.x()) {
         cpu.a(this, $$0);
      }
   }

   @Override
   public boolean a(arq $$0, bux $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bxj $$4) {
         cpt.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   protected byj.b<cps> ec() {
      return byj.a(bI, bH);
   }

   @Override
   protected byj<?> a(Dynamic<?> $$0) {
      return cpt.a(this.ec().a($$0));
   }

   @Override
   public byj<cps> eb() {
      return (byj<cps>)super.eb();
   }

   @Override
   protected void a(arq $$0) {
      bqq $$1 = bqp.a();
      $$1.a("hoglinBrain");
      this.eb().a($$0, this);
      $$1.c();
      cpt.a(this);
      if (this.gt()) {
         this.bS++;
         if (this.bS > 300) {
            this.b(awn.mT);
            this.gv();
         }
      } else {
         this.bS = 0;
      }
   }

   @Override
   public void k_() {
      if (this.bR > 0) {
         this.bR--;
      }

      super.k_();
   }

   @Override
   protected void j() {
      if (this.n_()) {
         this.by = 3;
         this.g(byp.c).a(0.5);
      } else {
         this.by = 5;
         this.g(byp.c).a(6.0);
      }
   }

   public static boolean c(bwr<cps> $$0, dji $$1, bwq $$2, iv $$3, azv $$4) {
      return !$$1.a_($$3.e()).a(dmo.lq);
   }

   @Nullable
   @Override
   public byb a(djy $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      if ($$0.C_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean h(double $$0) {
      return !this.gc();
   }

   @Override
   public float a(iv $$0, djk $$1) {
      if (cpt.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.e()).a(dmo.pc) ? 10.0F : 0.0F;
      }
   }

   @Override
   public bug b(crj $$0, buf $$1) {
      bug $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.gb();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.bR = 10;
         this.b(awn.mS);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int q() {
      return this.bR;
   }

   @Override
   public boolean en() {
      return true;
   }

   @Override
   protected int e(arq $$0) {
      return this.by;
   }

   private void gv() {
      this.a(bwr.bN, bwc.a(this, true, false), $$0 -> $$0.a(new bvm(bvo.i, 200, 0)));
   }

   @Override
   public boolean i(czk $$0) {
      return $$0.a(axk.aq);
   }

   public boolean x() {
      return !this.n_();
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bK, false);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      if (this.gw()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.bS);
      if (this.bT) {
         $$0.a("CannotBeHunted", true);
      }
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.w($$0.o("IsImmuneToZombification"));
      this.bS = $$0.f("TimeInOverworld");
      this.x($$0.o("CannotBeHunted"));
   }

   public void w(boolean $$0) {
      this.ar().a(bK, $$0);
   }

   private boolean gw() {
      return this.ar().a(bK);
   }

   public boolean gt() {
      return !this.dU().B_().b() && !this.gw() && !this.gi();
   }

   private void x(boolean $$0) {
      this.bT = $$0;
   }

   public boolean gu() {
      return this.x() && !this.bT;
   }

   @Nullable
   @Override
   public bvy a(arq $$0, bvy $$1) {
      cps $$2 = bwr.aj.a($$0, bwq.e);
      if ($$2 != null) {
         $$2.gb();
      }

      return $$2;
   }

   @Override
   public boolean gA() {
      return !cpt.c(this) && super.gA();
   }

   @Override
   public awo dl() {
      return awo.f;
   }

   @Override
   protected awm u() {
      return this.dU().C ? null : cpt.b(this).orElse(null);
   }

   @Override
   protected awm e(bux $$0) {
      return awn.mV;
   }

   @Override
   protected awm l_() {
      return awn.mU;
   }

   @Override
   protected awm aT() {
      return awn.nA;
   }

   @Override
   protected awm aU() {
      return awn.nz;
   }

   @Override
   protected void b(iv $$0, eao $$1) {
      this.a(awn.mX, 0.15F, 1.0F);
   }

   @Override
   protected void ac() {
      super.ac();
      agm.a(this);
   }

   @Nullable
   @Override
   public bxj f() {
      return this.Q();
   }
}
