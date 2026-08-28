import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cor extends cig implements cnb, cot {
   private static final akg<Boolean> bI = akk.a(cor.class, aki.k);
   private static final int bJ = 40;
   private static final float bK = 0.3F;
   private static final int bL = 1;
   private static final float bM = 0.6F;
   private static final int bN = 6;
   private static final float bO = 0.5F;
   public static final int bE = 300;
   private int bP;
   private int bQ;
   private boolean bR;
   protected static final ImmutableList<? extends cha<? extends cgz<? super cor>>> bF = ImmutableList.of(cha.c, cha.d, cha.o, cha.n);
   protected static final ImmutableList<? extends cft<?>> bG = ImmutableList.of(
      cft.s,
      cft.g,
      cft.h,
      cft.k,
      cft.l,
      cft.o,
      cft.n,
      cft.F,
      cft.u,
      cft.p,
      cft.q,
      cft.ar,
      new cft[]{cft.A, cft.at, cft.au, cft.aq, cft.L, cft.ax, cft.ay, cft.aa}
   );

   public cor(bwb<? extends cor> $$0, dhp $$1) {
      super($$0, $$1);
      this.bw = 5;
   }

   @VisibleForTesting
   public void s(int $$0) {
      this.bQ = $$0;
   }

   @Override
   public boolean w() {
      return true;
   }

   public static bxw.a t() {
      return cnj.gt().a(bxx.s, 40.0).a(bxx.v, 0.3F).a(bxx.p, 0.6F).a(bxx.d, 1.0).a(bxx.c, 6.0);
   }

   @Override
   public boolean c(arn $$0, bvs $$1) {
      if ($$1 instanceof bwr $$2) {
         this.bP = 10;
         this.dV().a(this, (byte)4);
         this.b(awk.mO);
         cos.a(this, $$2);
         return cot.a($$0, this, $$2);
      } else {
         return false;
      }
   }

   @Override
   protected void e(bwr $$0) {
      if (this.x()) {
         cot.a(this, $$0);
      }
   }

   @Override
   public boolean a(arn $$0, buh $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bwr $$4) {
         cos.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   protected bxr.b<cor> ec() {
      return bxr.a(bG, bF);
   }

   @Override
   protected bxr<?> a(Dynamic<?> $$0) {
      return cos.a(this.ec().a($$0));
   }

   @Override
   public bxr<cor> eb() {
      return (bxr<cor>)super.eb();
   }

   @Override
   protected void a(arn $$0) {
      bqb $$1 = bqa.a();
      $$1.a("hoglinBrain");
      this.eb().a($$0, this);
      $$1.c();
      cos.a(this);
      if (this.gq()) {
         this.bQ++;
         if (this.bQ > 300) {
            this.b(awk.mP);
            this.gs();
         }
      } else {
         this.bQ = 0;
      }
   }

   @Override
   public void k_() {
      if (this.bP > 0) {
         this.bP--;
      }

      super.k_();
   }

   @Override
   protected void j() {
      if (this.n_()) {
         this.bw = 3;
         this.g(bxx.c).a(0.5);
      } else {
         this.bw = 5;
         this.g(bxx.c).a(6.0);
      }
   }

   public static boolean c(bwb<cor> $$0, dhq $$1, bwa $$2, jj $$3, azs $$4) {
      return !$$1.a_($$3.e()).a(dkw.lm);
   }

   @Nullable
   @Override
   public bxj a(dig $$0, bto $$1, bwa $$2, @Nullable bxj $$3) {
      if ($$0.C_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean h(double $$0) {
      return !this.fZ();
   }

   @Override
   public float a(jj $$0, dhs $$1) {
      if (cos.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.e()).a(dkw.oY) ? 10.0F : 0.0F;
      }
   }

   @Override
   public btq b(cqi $$0, btp $$1) {
      btq $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.fY();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.bP = 10;
         this.b(awk.mO);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int q() {
      return this.bP;
   }

   @Override
   public boolean en() {
      return true;
   }

   @Override
   protected int e(arn $$0) {
      return this.bw;
   }

   private void gs() {
      this.a(bwb.bM, bvm.a(this, true, false), $$0 -> $$0.a(new buw(buy.i, 200, 0)));
   }

   @Override
   public boolean k(cxy $$0) {
      return $$0.a(axi.ap);
   }

   public boolean x() {
      return !this.n_();
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bI, false);
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      if (this.gt()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.bQ);
      if (this.bR) {
         $$0.a("CannotBeHunted", true);
      }
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.bQ = $$0.h("TimeInOverworld");
      this.x($$0.q("CannotBeHunted"));
   }

   public void w(boolean $$0) {
      this.au().a(bI, $$0);
   }

   private boolean gt() {
      return this.au().a(bI);
   }

   public boolean gq() {
      return !this.dV().B_().b() && !this.gt() && !this.gf();
   }

   private void x(boolean $$0) {
      this.bR = $$0;
   }

   public boolean gr() {
      return this.x() && !this.bR;
   }

   @Nullable
   @Override
   public bvi a(arn $$0, bvi $$1) {
      cor $$2 = bwb.aj.a($$0, bwa.e);
      if ($$2 != null) {
         $$2.fY();
      }

      return $$2;
   }

   @Override
   public boolean gx() {
      return !cos.c(this) && super.gx();
   }

   @Override
   public awl dm() {
      return awl.f;
   }

   @Override
   protected awj u() {
      return this.dV().C ? null : cos.b(this).orElse(null);
   }

   @Override
   protected awj e(buh $$0) {
      return awk.mR;
   }

   @Override
   protected awj l_() {
      return awk.mQ;
   }

   @Override
   protected awj aV() {
      return awk.nw;
   }

   @Override
   protected awj aW() {
      return awk.nv;
   }

   @Override
   protected void b(jj $$0, dym $$1) {
      this.a(awk.mT, 0.15F, 1.0F);
   }

   @Override
   protected void ab() {
      super.ab();
      agj.a(this);
   }

   @Nullable
   @Override
   public bwr f() {
      return this.Q();
   }
}
