import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cop extends cok {
   private static final int ca = 50;
   private static final float cb = 0.35F;
   private static final int cc = 7;
   private static final double cd = 12.0;
   protected static final ImmutableList<cgr<? extends cgq<? super cop>>> d = ImmutableList.of(cgr.c, cgr.d, cgr.b, cgr.f, cgr.m);
   protected static final ImmutableList<cfk<?>> bZ = ImmutableList.of(
      cfk.n, cfk.v, cfk.g, cfk.h, cfk.k, cfk.l, cfk.ao, cfk.an, cfk.x, cfk.y, cfk.m, cfk.E, new cfk[]{cfk.o, cfk.p, cfk.q, cfk.t, cfk.ab, cfk.M, cfk.b}
   );

   public cop(bvr<? extends cop> $$0, dhi $$1) {
      super($$0, $$1);
      this.bO = 20;
   }

   public static bxn.a t() {
      return cmx.gt().a(bxo.s, 50.0).a(bxo.v, 0.35F).a(bxo.c, 7.0).a(bxo.m, 12.0);
   }

   @Nullable
   @Override
   public bwz a(dhz $$0, bth $$1, bvq $$2, @Nullable bwz $$3) {
      coq.a(this);
      this.a($$0.H_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(bam $$0, bth $$1) {
      this.a(bvs.a, new cxp(cxt.pv));
   }

   @Override
   protected bxi.b<cop> ed() {
      return bxi.a(bZ, d);
   }

   @Override
   protected bxi<?> a(Dynamic<?> $$0) {
      return coq.a(this, this.ed().a($$0));
   }

   @Override
   public bxi<cop> ec() {
      return (bxi<cop>)super.ec();
   }

   @Override
   public boolean m() {
      return false;
   }

   @Override
   public boolean c(ash $$0, cxp $$1) {
      return $$1.a(cxt.pv) ? super.c($$0, $$1) : false;
   }

   @Override
   protected void a(ash $$0) {
      bpt $$1 = bps.a();
      $$1.a("piglinBruteBrain");
      this.ec().a($$0, this);
      $$1.c();
      coq.b(this);
      coq.c(this);
      super.a($$0);
   }

   @Override
   public coo gp() {
      return this.gd() && this.gq() ? coo.a : coo.f;
   }

   @Override
   public boolean a(ash $$0, bua $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bwg $$4) {
         coq.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   protected axe u() {
      return axf.uj;
   }

   @Override
   protected axe e(bua $$0) {
      return axf.um;
   }

   @Override
   protected axe o_() {
      return axf.ul;
   }

   @Override
   protected void b(jh $$0, dxv $$1) {
      this.a(axf.un, 0.15F, 1.0F);
   }

   protected void gu() {
      this.b(axf.uk);
   }

   @Override
   protected void gr() {
      this.b(axf.uo);
   }
}
