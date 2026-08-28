import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class coj extends cof {
   private static final int ca = 50;
   private static final float cb = 0.35F;
   private static final int cc = 7;
   private static final double cd = 12.0;
   protected static final ImmutableList<cgm<? extends cgl<? super coj>>> d = ImmutableList.of(cgm.c, cgm.d, cgm.b, cgm.f, cgm.m);
   protected static final ImmutableList<cff<?>> bZ = ImmutableList.of(
      cff.n, cff.v, cff.g, cff.h, cff.k, cff.l, cff.ao, cff.an, cff.x, cff.y, cff.m, cff.E, new cff[]{cff.o, cff.p, cff.q, cff.t, cff.ab, cff.M, cff.b}
   );

   public coj(bvm<? extends coj> $$0, dha $$1) {
      super($$0, $$1);
      this.bO = 20;
   }

   public static bxi.a t() {
      return cms.gr().a(bxj.s, 50.0).a(bxj.v, 0.35F).a(bxj.c, 7.0).a(bxj.m, 12.0);
   }

   @Nullable
   @Override
   public bwu a(dhr $$0, btc $$1, bvl $$2, @Nullable bwu $$3) {
      cok.a(this);
      this.a($$0.H_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(bam $$0, btc $$1) {
      this.a(bvn.a, new cxk(cxo.pv));
   }

   @Override
   protected bxd.b<coj> ec() {
      return bxd.a(bZ, d);
   }

   @Override
   protected bxd<?> a(Dynamic<?> $$0) {
      return cok.a(this, this.ec().a($$0));
   }

   @Override
   public bxd<coj> eb() {
      return (bxd<coj>)super.eb();
   }

   @Override
   public boolean m() {
      return false;
   }

   @Override
   public boolean c(ash $$0, cxk $$1) {
      return $$1.a(cxo.pv) ? super.c($$0, $$1) : false;
   }

   @Override
   protected void a(ash $$0) {
      bpo $$1 = bpn.a();
      $$1.a("piglinBruteBrain");
      this.eb().a($$0, this);
      $$1.c();
      cok.b(this);
      cok.c(this);
      super.a($$0);
   }

   @Override
   public coi gn() {
      return this.gb() && this.go() ? coi.a : coi.f;
   }

   @Override
   public boolean a(ash $$0, btv $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bwb $$4) {
         cok.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   protected axe u() {
      return axf.ui;
   }

   @Override
   protected axe e(btv $$0) {
      return axf.ul;
   }

   @Override
   protected axe o_() {
      return axf.uk;
   }

   @Override
   protected void b(jh $$0, dxn $$1) {
      this.a(axf.um, 0.15F, 1.0F);
   }

   protected void gs() {
      this.b(axf.uj);
   }

   @Override
   protected void gp() {
      this.b(axf.un);
   }
}
