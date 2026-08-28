import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cnp extends cnl {
   private static final int bZ = 50;
   private static final float ca = 0.35F;
   private static final int cb = 7;
   private static final double cc = 12.0;
   protected static final ImmutableList<cft<? extends cfs<? super cnp>>> d = ImmutableList.of(cft.c, cft.d, cft.b, cft.f, cft.m);
   protected static final ImmutableList<cem<?>> bY = ImmutableList.of(
      cem.n, cem.v, cem.g, cem.h, cem.k, cem.l, cem.ao, cem.an, cem.x, cem.y, cem.m, cem.E, new cem[]{cem.o, cem.p, cem.q, cem.t, cem.ab, cem.M, cem.b}
   );

   public cnp(but<? extends cnp> $$0, dgj $$1) {
      super($$0, $$1);
      this.bN = 20;
   }

   public static bwp.a t() {
      return clz.gx().a(bwq.s, 50.0).a(bwq.v, 0.35F).a(bwq.c, 7.0).a(bwq.m, 12.0);
   }

   @Nullable
   @Override
   public bwb a(dha $$0, bsj $$1, bus $$2, @Nullable bwb $$3) {
      cnq.a(this);
      this.a($$0.H_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azh $$0, bsj $$1) {
      this.a(buu.a, new cwq(cwu.pE));
   }

   @Override
   protected bwk.b<cnp> ec() {
      return bwk.a(bY, d);
   }

   @Override
   protected bwk<?> a(Dynamic<?> $$0) {
      return cnq.a(this, this.ec().a($$0));
   }

   @Override
   public bwk<cnp> eb() {
      return (bwk<cnp>)super.eb();
   }

   @Override
   public boolean m() {
      return false;
   }

   @Override
   public boolean c(ard $$0, cwq $$1) {
      return $$1.a(cwu.pE) ? super.c($$0, $$1) : false;
   }

   @Override
   protected void a(ard $$0) {
      bou $$1 = bot.a();
      $$1.a("piglinBruteBrain");
      this.eb().a($$0, this);
      $$1.c();
      cnq.b(this);
      cnq.c(this);
      super.a($$0);
   }

   @Override
   public cno gt() {
      return this.gh() && this.gu() ? cno.a : cno.f;
   }

   @Override
   public boolean a(ard $$0, btc $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bvi $$4) {
         cnq.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   protected avz u() {
      return awa.up;
   }

   @Override
   protected avz e(btc $$0) {
      return awa.us;
   }

   @Override
   protected avz o_() {
      return awa.ur;
   }

   @Override
   protected void b(ji $$0, dwy $$1) {
      this.a(awa.ut, 0.15F, 1.0F);
   }

   protected void gy() {
      this.b(awa.uq);
   }

   @Override
   protected void gv() {
      this.b(awa.uu);
   }
}
