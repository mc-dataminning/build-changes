import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cqi extends cjm implements cot, cqk {
   private static final akn<Boolean> bM = akr.a(cqi.class, akp.k);
   private static final int bN = 40;
   private static final float bO = 0.3F;
   private static final int bP = 1;
   private static final float bQ = 0.6F;
   private static final int bR = 6;
   private static final float bS = 0.5F;
   private static final boolean bT = false;
   private static final int bU = 0;
   private static final boolean bV = false;
   public static final int bI = 300;
   private int bW;
   private int bX = 0;
   private boolean bY = false;
   protected static final ImmutableList<? extends cif<? extends cie<? super cqi>>> bJ = ImmutableList.of(cif.c, cif.d, cif.o, cif.n);
   protected static final ImmutableList<? extends cgy<?>> bK = ImmutableList.of(
      cgy.s,
      cgy.g,
      cgy.h,
      cgy.k,
      cgy.l,
      cgy.o,
      cgy.n,
      cgy.F,
      cgy.u,
      cgy.p,
      cgy.q,
      cgy.ar,
      new cgy[]{cgy.A, cgy.at, cgy.au, cgy.aq, cgy.L, cgy.ax, cgy.ay, cgy.aa}
   );

   public cqi(bxe<? extends cqi> $$0, djz $$1) {
      super($$0, $$1);
      this.bA = 5;
   }

   @VisibleForTesting
   public void s(int $$0) {
      this.bX = $$0;
   }

   @Override
   public boolean w() {
      return true;
   }

   public static bzb.a t() {
      return cpb.gx().a(bzc.s, 40.0).a(bzc.v, 0.3F).a(bzc.p, 0.6F).a(bzc.d, 1.0).a(bzc.c, 6.0);
   }

   @Override
   public boolean c(aru $$0, bwv $$1) {
      if ($$1 instanceof bxw $$2) {
         this.bW = 10;
         this.dV().a(this, (byte)4);
         this.b(awr.mS);
         cqj.a(this, $$2);
         return cqk.a($$0, this, $$2);
      } else {
         return false;
      }
   }

   @Override
   protected void d(bxw $$0) {
      if (this.x()) {
         cqk.a(this, $$0);
      }
   }

   @Override
   public boolean a(aru $$0, bvk $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bxw $$4) {
         cqj.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   protected byw.b<cqi> ed() {
      return byw.a(bK, bJ);
   }

   @Override
   protected byw<?> a(Dynamic<?> $$0) {
      return cqj.a(this.ed().a($$0));
   }

   @Override
   public byw<cqi> ec() {
      return (byw<cqi>)super.ec();
   }

   @Override
   protected void a(aru $$0) {
      brd $$1 = brc.a();
      $$1.a("hoglinBrain");
      this.ec().a($$0, this);
      $$1.c();
      cqj.a(this);
      if (this.gu()) {
         this.bX++;
         if (this.bX > 300) {
            this.b(awr.mT);
            this.gw();
         }
      } else {
         this.bX = 0;
      }
   }

   @Override
   public void k_() {
      if (this.bW > 0) {
         this.bW--;
      }

      super.k_();
   }

   @Override
   protected void j() {
      if (this.n_()) {
         this.bA = 3;
         this.g(bzc.c).a(0.5);
      } else {
         this.bA = 5;
         this.g(bzc.c).a(6.0);
      }
   }

   public static boolean c(bxe<cqi> $$0, dka $$1, bxd $$2, iw $$3, azz $$4) {
      return !$$1.a_($$3.e()).a(dng.lq);
   }

   @Nullable
   @Override
   public byo a(dkq $$0, bur $$1, bxd $$2, @Nullable byo $$3) {
      if ($$0.G_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean h(double $$0) {
      return !this.gd();
   }

   @Override
   public float a(iw $$0, dkc $$1) {
      if (cqj.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.e()).a(dng.pc) ? 10.0F : 0.0F;
      }
   }

   @Override
   public but b(crz $$0, bus $$1) {
      but $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.gc();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.bW = 10;
         this.b(awr.mS);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int q() {
      return this.bW;
   }

   @Override
   public boolean eo() {
      return true;
   }

   @Override
   protected int e(aru $$0) {
      return this.bA;
   }

   private void gw() {
      this.a(bxe.bO, bwp.a(this, true, false), $$0 -> $$0.a(new bvz(bwb.i, 200, 0)));
   }

   @Override
   public boolean i(daa $$0) {
      return $$0.a(axo.ar);
   }

   public boolean x() {
      return !this.n_();
   }

   @Override
   protected void a(akr.a $$0) {
      super.a($$0);
      $$0.a(bM, false);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("IsImmuneToZombification", this.gx());
      $$0.a("TimeInOverworld", this.bX);
      $$0.a("CannotBeHunted", this.bY);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.w($$0.b("IsImmuneToZombification", false));
      this.bX = $$0.b("TimeInOverworld", 0);
      this.x($$0.b("CannotBeHunted", false));
   }

   public void w(boolean $$0) {
      this.ar().a(bM, $$0);
   }

   private boolean gx() {
      return this.ar().a(bM);
   }

   public boolean gu() {
      return !this.dV().F_().b() && !this.gx() && !this.gj();
   }

   private void x(boolean $$0) {
      this.bY = $$0;
   }

   public boolean gv() {
      return this.x() && !this.bY;
   }

   @Nullable
   @Override
   public bwl a(aru $$0, bwl $$1) {
      cqi $$2 = bxe.ak.a($$0, bxd.e);
      if ($$2 != null) {
         $$2.gc();
      }

      return $$2;
   }

   @Override
   public boolean gB() {
      return !cqj.c(this) && super.gB();
   }

   @Override
   public aws dm() {
      return aws.f;
   }

   @Override
   protected awq u() {
      return this.dV().C ? null : cqj.b(this).orElse(null);
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.mV;
   }

   @Override
   protected awq l_() {
      return awr.mU;
   }

   @Override
   protected awq aU() {
      return awr.nA;
   }

   @Override
   protected awq aV() {
      return awr.nz;
   }

   @Override
   protected void b(iw $$0, ebg $$1) {
      this.a(awr.mX, 0.15F, 1.0F);
   }

   @Override
   protected void ac() {
      super.ac();
      agq.a(this);
   }

   @Nullable
   @Override
   public bxw f() {
      return this.Q();
   }
}
