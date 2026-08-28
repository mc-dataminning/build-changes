import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cno extends cnk {
   private static final int bZ = 50;
   private static final float ca = 0.35F;
   private static final int cb = 7;
   private static final double cc = 12.0;
   protected static final ImmutableList<cfs<? extends cfr<? super cno>>> d = ImmutableList.of(cfs.c, cfs.d, cfs.b, cfs.f, cfs.m);
   protected static final ImmutableList<cel<?>> bY = ImmutableList.of(
      cel.n, cel.v, cel.g, cel.h, cel.k, cel.l, cel.ao, cel.an, cel.x, cel.y, cel.m, cel.E, new cel[]{cel.o, cel.p, cel.q, cel.t, cel.ab, cel.M, cel.b}
   );

   public cno(bus<? extends cno> $$0, dgi $$1) {
      super($$0, $$1);
      this.bN = 20;
   }

   public static bwo.a t() {
      return cly.gx().a(bwp.s, 50.0).a(bwp.v, 0.35F).a(bwp.c, 7.0).a(bwp.m, 12.0);
   }

   @Nullable
   @Override
   public bwa a(dgz $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      cnp.a(this);
      this.a($$0.H_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azh $$0, bsi $$1) {
      this.a(but.a, new cwp(cwt.pE));
   }

   @Override
   protected bwj.b<cno> ec() {
      return bwj.a(bY, d);
   }

   @Override
   protected bwj<?> a(Dynamic<?> $$0) {
      return cnp.a(this, this.ec().a($$0));
   }

   @Override
   public bwj<cno> eb() {
      return (bwj<cno>)super.eb();
   }

   @Override
   public boolean m() {
      return false;
   }

   @Override
   public boolean c(ard $$0, cwp $$1) {
      return $$1.a(cwt.pE) ? super.c($$0, $$1) : false;
   }

   @Override
   protected void a(ard $$0) {
      bot $$1 = bos.a();
      $$1.a("piglinBruteBrain");
      this.eb().a($$0, this);
      $$1.c();
      cnp.b(this);
      cnp.c(this);
      super.a($$0);
   }

   @Override
   public cnn gt() {
      return this.gh() && this.gu() ? cnn.a : cnn.f;
   }

   @Override
   public boolean a(ard $$0, btb $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bvh $$4) {
         cnp.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   protected avz u() {
      return awa.up;
   }

   @Override
   protected avz e(btb $$0) {
      return awa.us;
   }

   @Override
   protected avz o_() {
      return awa.ur;
   }

   @Override
   protected void b(ji $$0, dwx $$1) {
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
