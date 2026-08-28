import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cnf extends cgy implements clq, cnh {
   private static final ajy<Boolean> cc = akc.a(cnf.class, aka.k);
   private static final int cd = 40;
   private static final float ce = 0.3F;
   private static final int cf = 1;
   private static final float cg = 0.6F;
   private static final int ch = 6;
   private static final float ci = 0.5F;
   public static final int bY = 300;
   private int cj;
   private int ck;
   private boolean cl;
   protected static final ImmutableList<? extends cfs<? extends cfr<? super cnf>>> bZ = ImmutableList.of(cfs.c, cfs.d, cfs.o, cfs.n);
   protected static final ImmutableList<? extends cel<?>> ca = ImmutableList.of(
      cel.r,
      cel.g,
      cel.h,
      cel.k,
      cel.l,
      cel.n,
      cel.m,
      cel.E,
      cel.t,
      cel.o,
      cel.p,
      cel.aq,
      new cel[]{cel.z, cel.as, cel.at, cel.ap, cel.K, cel.aw, cel.ax, cel.Z}
   );

   public cnf(bus<? extends cnf> $$0, dgi $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @VisibleForTesting
   public void s(int $$0) {
      this.ck = $$0;
   }

   @Override
   public boolean y() {
      return true;
   }

   public static bwo.a p() {
      return cly.gx().a(bwp.s, 40.0).a(bwp.v, 0.3F).a(bwp.p, 0.6F).a(bwp.d, 1.0).a(bwp.c, 6.0);
   }

   @Override
   public boolean c(ard $$0, bul $$1) {
      if ($$1 instanceof bvh $$2) {
         this.cj = 10;
         this.dV().a(this, (byte)4);
         this.b(awa.mO);
         cng.a(this, $$2);
         return cnh.a($$0, this, $$2);
      } else {
         return false;
      }
   }

   @Override
   protected void e(bvh $$0) {
      if (this.t()) {
         cnh.a(this, $$0);
      }
   }

   @Override
   public boolean a(ard $$0, btb $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bvh $$4) {
         cng.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   protected bwj.b<cnf> ec() {
      return bwj.a(ca, bZ);
   }

   @Override
   protected bwj<?> a(Dynamic<?> $$0) {
      return cng.a(this.ec().a($$0));
   }

   @Override
   public bwj<cnf> eb() {
      return (bwj<cnf>)super.eb();
   }

   @Override
   protected void a(ard $$0) {
      bot $$1 = bos.a();
      $$1.a("hoglinBrain");
      this.eb().a($$0, this);
      $$1.c();
      cng.a(this);
      if (this.gs()) {
         this.ck++;
         if (this.ck > 300) {
            this.b(awa.mP);
            this.gu();
         }
      } else {
         this.ck = 0;
      }
   }

   @Override
   public void d_() {
      if (this.cj > 0) {
         this.cj--;
      }

      super.d_();
   }

   @Override
   protected void i() {
      if (this.e_()) {
         this.bN = 3;
         this.g(bwp.c).a(0.5);
      } else {
         this.bN = 5;
         this.g(bwp.c).a(6.0);
      }
   }

   public static boolean c(bus<cnf> $$0, dgj $$1, bur $$2, ji $$3, azh $$4) {
      return !$$1.a_($$3.e()).a(djo.lm);
   }

   @Nullable
   @Override
   public bwa a(dgz $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      if ($$0.H_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean h(double $$0) {
      return !this.fZ();
   }

   @Override
   public float a(ji $$0, dgl $$1) {
      if (cng.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.e()).a(djo.oY) ? 10.0F : 0.0F;
      }
   }

   @Override
   public bsk b(cox $$0, bsj $$1) {
      bsk $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.fY();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cj = 10;
         this.b(awa.mO);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int x() {
      return this.cj;
   }

   @Override
   public boolean em() {
      return true;
   }

   @Override
   protected int e(ard $$0) {
      return this.bN;
   }

   private void gu() {
      this.a(bus.bM, bug.a(this, true, false), $$0 -> $$0.a(new btq(bts.i, 200, 0)));
   }

   @Override
   public boolean j(cwp $$0) {
      return $$0.a(awy.ap);
   }

   public boolean t() {
      return !this.e_();
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(cc, false);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      if (this.gv()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.ck);
      if (this.cl) {
         $$0.a("CannotBeHunted", true);
      }
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.x($$0.q("IsImmuneToZombification"));
      this.ck = $$0.h("TimeInOverworld");
      this.y($$0.q("CannotBeHunted"));
   }

   public void x(boolean $$0) {
      this.au().a(cc, $$0);
   }

   private boolean gv() {
      return this.au().a(cc);
   }

   public boolean gs() {
      return !this.dV().G_().b() && !this.gv() && !this.gf();
   }

   private void y(boolean $$0) {
      this.cl = $$0;
   }

   public boolean gt() {
      return this.t() && !this.cl;
   }

   @Nullable
   @Override
   public buc a(ard $$0, buc $$1) {
      cnf $$2 = bus.aj.a($$0, bur.e);
      if ($$2 != null) {
         $$2.fY();
      }

      return $$2;
   }

   @Override
   public boolean gz() {
      return !cng.c(this) && super.gz();
   }

   @Override
   public awb dm() {
      return awb.f;
   }

   @Override
   protected avz u() {
      return this.dV().C ? null : cng.b(this).orElse(null);
   }

   @Override
   protected avz e(btb $$0) {
      return awa.mR;
   }

   @Override
   protected avz o_() {
      return awa.mQ;
   }

   @Override
   protected avz aV() {
      return awa.nw;
   }

   @Override
   protected avz aW() {
      return awa.nv;
   }

   @Override
   protected void b(ji $$0, dwx $$1) {
      this.a(awa.mT, 0.15F, 1.0F);
   }

   @Override
   protected void ac() {
      super.ac();
      agd.a(this);
   }

   @Nullable
   @Override
   public bvh O_() {
      return this.R();
   }
}
