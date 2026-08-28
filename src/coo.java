import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class coo extends coj {
   private static final int ca = 50;
   private static final float cb = 0.35F;
   private static final int cc = 7;
   private static final double cd = 12.0;
   protected static final ImmutableList<cgq<? extends cgp<? super coo>>> d = ImmutableList.of(cgq.c, cgq.d, cgq.b, cgq.f, cgq.m);
   protected static final ImmutableList<cfj<?>> bZ = ImmutableList.of(
      cfj.n, cfj.v, cfj.g, cfj.h, cfj.k, cfj.l, cfj.ao, cfj.an, cfj.x, cfj.y, cfj.m, cfj.E, new cfj[]{cfj.o, cfj.p, cfj.q, cfj.t, cfj.ab, cfj.M, cfj.b}
   );

   public coo(bvq<? extends coo> $$0, dhh $$1) {
      super($$0, $$1);
      this.bO = 20;
   }

   public static bxm.a t() {
      return cmw.gr().a(bxn.s, 50.0).a(bxn.v, 0.35F).a(bxn.c, 7.0).a(bxn.m, 12.0);
   }

   @Nullable
   @Override
   public bwy a(dhy $$0, btg $$1, bvp $$2, @Nullable bwy $$3) {
      cop.a(this);
      this.a($$0.H_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(bam $$0, btg $$1) {
      this.a(bvr.a, new cxo(cxs.pv));
   }

   @Override
   protected bxh.b<coo> ec() {
      return bxh.a(bZ, d);
   }

   @Override
   protected bxh<?> a(Dynamic<?> $$0) {
      return cop.a(this, this.ec().a($$0));
   }

   @Override
   public bxh<coo> eb() {
      return (bxh<coo>)super.eb();
   }

   @Override
   public boolean m() {
      return false;
   }

   @Override
   public boolean c(ash $$0, cxo $$1) {
      return $$1.a(cxs.pv) ? super.c($$0, $$1) : false;
   }

   @Override
   protected void a(ash $$0) {
      bps $$1 = bpr.a();
      $$1.a("piglinBruteBrain");
      this.eb().a($$0, this);
      $$1.c();
      cop.b(this);
      cop.c(this);
      super.a($$0);
   }

   @Override
   public com gn() {
      return this.gb() && this.go() ? com.a : com.f;
   }

   @Override
   public boolean a(ash $$0, btz $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bwf $$4) {
         cop.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   protected axe u() {
      return axf.uj;
   }

   @Override
   protected axe e(btz $$0) {
      return axf.um;
   }

   @Override
   protected axe o_() {
      return axf.ul;
   }

   @Override
   protected void b(jh $$0, dxu $$1) {
      this.a(axf.un, 0.15F, 1.0F);
   }

   protected void gs() {
      this.b(axf.uk);
   }

   @Override
   protected void gp() {
      this.b(axf.uo);
   }
}
