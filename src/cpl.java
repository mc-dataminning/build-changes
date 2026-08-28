import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cpl extends ciu implements cnv, cpn {
   private static final akj<Boolean> bK = akn.a(cpl.class, akl.k);
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
   protected static final ImmutableList<? extends chn<? extends chm<? super cpl>>> bH = ImmutableList.of(chn.c, chn.d, chn.o, chn.n);
   protected static final ImmutableList<? extends cgg<?>> bI = ImmutableList.of(
      cgg.s,
      cgg.g,
      cgg.h,
      cgg.k,
      cgg.l,
      cgg.o,
      cgg.n,
      cgg.F,
      cgg.u,
      cgg.p,
      cgg.q,
      cgg.ar,
      new cgg[]{cgg.A, cgg.at, cgg.au, cgg.aq, cgg.L, cgg.ax, cgg.ay, cgg.aa}
   );

   public cpl(bwo<? extends cpl> $$0, dja $$1) {
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

   public static byj.a t() {
      return cod.gu().a(byk.s, 40.0).a(byk.v, 0.3F).a(byk.p, 0.6F).a(byk.d, 1.0).a(byk.c, 6.0);
   }

   @Override
   public boolean c(arq $$0, bwf $$1) {
      if ($$1 instanceof bxe $$2) {
         this.bR = 10;
         this.dV().a(this, (byte)4);
         this.b(awn.mS);
         cpm.a(this, $$2);
         return cpn.a($$0, this, $$2);
      } else {
         return false;
      }
   }

   @Override
   protected void d(bxe $$0) {
      if (this.x()) {
         cpn.a(this, $$0);
      }
   }

   @Override
   public boolean a(arq $$0, buu $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bxe $$4) {
         cpm.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   protected bye.b<cpl> ed() {
      return bye.a(bI, bH);
   }

   @Override
   protected bye<?> a(Dynamic<?> $$0) {
      return cpm.a(this.ed().a($$0));
   }

   @Override
   public bye<cpl> ec() {
      return (bye<cpl>)super.ec();
   }

   @Override
   protected void a(arq $$0) {
      bqo $$1 = bqn.a();
      $$1.a("hoglinBrain");
      this.ec().a($$0, this);
      $$1.c();
      cpm.a(this);
      if (this.gr()) {
         this.bS++;
         if (this.bS > 300) {
            this.b(awn.mT);
            this.gt();
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
         this.g(byk.c).a(0.5);
      } else {
         this.by = 5;
         this.g(byk.c).a(6.0);
      }
   }

   public static boolean c(bwo<cpl> $$0, djb $$1, bwn $$2, iu $$3, azv $$4) {
      return !$$1.a_($$3.e()).a(dmh.lq);
   }

   @Nullable
   @Override
   public bxw a(djr $$0, bub $$1, bwn $$2, @Nullable bxw $$3) {
      if ($$0.C_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean h(double $$0) {
      return !this.ga();
   }

   @Override
   public float a(iu $$0, djd $$1) {
      if (cpm.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.e()).a(dmh.pc) ? 10.0F : 0.0F;
      }
   }

   @Override
   public bud b(crc $$0, buc $$1) {
      bud $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.fZ();
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
   public boolean eo() {
      return true;
   }

   @Override
   protected int e(arq $$0) {
      return this.by;
   }

   private void gt() {
      this.a(bwo.bN, bvz.a(this, true, false), $$0 -> $$0.a(new bvj(bvl.i, 200, 0)));
   }

   @Override
   public boolean i(czd $$0) {
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
      if (this.gu()) {
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
      this.w($$0.q("IsImmuneToZombification"));
      this.bS = $$0.h("TimeInOverworld");
      this.x($$0.q("CannotBeHunted"));
   }

   public void w(boolean $$0) {
      this.au().a(bK, $$0);
   }

   private boolean gu() {
      return this.au().a(bK);
   }

   public boolean gr() {
      return !this.dV().B_().b() && !this.gu() && !this.gg();
   }

   private void x(boolean $$0) {
      this.bT = $$0;
   }

   public boolean gs() {
      return this.x() && !this.bT;
   }

   @Nullable
   @Override
   public bvv a(arq $$0, bvv $$1) {
      cpl $$2 = bwo.aj.a($$0, bwn.e);
      if ($$2 != null) {
         $$2.fZ();
      }

      return $$2;
   }

   @Override
   public boolean gy() {
      return !cpm.c(this) && super.gy();
   }

   @Override
   public awo dm() {
      return awo.f;
   }

   @Override
   protected awm u() {
      return this.dV().C ? null : cpm.b(this).orElse(null);
   }

   @Override
   protected awm e(buu $$0) {
      return awn.mV;
   }

   @Override
   protected awm l_() {
      return awn.mU;
   }

   @Override
   protected awm aV() {
      return awn.nA;
   }

   @Override
   protected awm aW() {
      return awn.nz;
   }

   @Override
   protected void b(iu $$0, eah $$1) {
      this.a(awn.mX, 0.15F, 1.0F);
   }

   @Override
   protected void ab() {
      super.ab();
      agm.a(this);
   }

   @Nullable
   @Override
   public bxe f() {
      return this.Q();
   }
}
