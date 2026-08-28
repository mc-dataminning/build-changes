import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cnl extends cnh {
   private static final int bZ = 50;
   private static final float ca = 0.35F;
   private static final int cb = 7;
   private static final double cc = 12.0;
   protected static final ImmutableList<cfs<? extends cfr<? super cnl>>> d = ImmutableList.of(cfs.c, cfs.d, cfs.b, cfs.f, cfs.m);
   protected static final ImmutableList<cel<?>> bY = ImmutableList.of(
      cel.n, cel.v, cel.g, cel.h, cel.k, cel.l, cel.ao, cel.an, cel.x, cel.y, cel.m, cel.E, new cel[]{cel.o, cel.p, cel.q, cel.t, cel.ab, cel.M, cel.b}
   );

   public cnl(bus<? extends cnl> $$0, dfm $$1) {
      super($$0, $$1);
      this.bN = 20;
   }

   public static bwo.a v() {
      return cly.gs().a(bwp.s, 50.0).a(bwp.v, 0.35F).a(bwp.c, 7.0).a(bwp.m, 12.0);
   }

   @Nullable
   @Override
   public bwa a(dgd $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      cnm.a(this);
      this.a($$0.G_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azu $$0, bsi $$1) {
      this.a(but.a, new cwm(cwq.pa));
   }

   @Override
   protected bwj.b<cnl> ec() {
      return bwj.a(bY, d);
   }

   @Override
   protected bwj<?> a(Dynamic<?> $$0) {
      return cnm.a(this, this.ec().a($$0));
   }

   @Override
   public bwj<cnl> eb() {
      return (bwj<cnl>)super.eb();
   }

   @Override
   public boolean n() {
      return false;
   }

   @Override
   public boolean c(arp $$0, cwm $$1) {
      return $$1.a(cwq.pa) ? super.c($$0, $$1) : false;
   }

   @Override
   protected void a(arp $$0) {
      bou $$1 = bot.a();
      $$1.a("piglinBruteBrain");
      this.eb().a($$0, this);
      $$1.c();
      cnm.b(this);
      cnm.c(this);
      super.a($$0);
   }

   @Override
   public cnk go() {
      return this.gb() && this.gp() ? cnk.a : cnk.f;
   }

   @Override
   public boolean a(arp $$0, btb $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bvh $$4) {
         cnm.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   protected awm t() {
      return awn.tO;
   }

   @Override
   protected awm e(btb $$0) {
      return awn.tR;
   }

   @Override
   protected awm n_() {
      return awn.tQ;
   }

   @Override
   protected void b(jh $$0, dvv $$1) {
      this.a(awn.tS, 0.15F, 1.0F);
   }

   protected void gt() {
      this.b(awn.tP);
   }

   @Override
   protected void gq() {
      this.b(awn.tT);
   }
}
