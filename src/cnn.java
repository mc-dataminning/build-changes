import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cnn extends cnj {
   private static final int bZ = 50;
   private static final float ca = 0.35F;
   private static final int cb = 7;
   private static final double cc = 12.0;
   protected static final ImmutableList<cfr<? extends cfq<? super cnn>>> d = ImmutableList.of(cfr.c, cfr.d, cfr.b, cfr.f, cfr.m);
   protected static final ImmutableList<cek<?>> bY = ImmutableList.of(
      cek.n, cek.v, cek.g, cek.h, cek.k, cek.l, cek.ao, cek.an, cek.x, cek.y, cek.m, cek.E, new cek[]{cek.o, cek.p, cek.q, cek.t, cek.ab, cek.M, cek.b}
   );

   public cnn(bur<? extends cnn> $$0, dgh $$1) {
      super($$0, $$1);
      this.bN = 20;
   }

   public static bwn.a t() {
      return clx.gx().a(bwo.s, 50.0).a(bwo.v, 0.35F).a(bwo.c, 7.0).a(bwo.m, 12.0);
   }

   @Nullable
   @Override
   public bvz a(dgy $$0, bsh $$1, buq $$2, @Nullable bvz $$3) {
      cno.a(this);
      this.a($$0.H_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azh $$0, bsh $$1) {
      this.a(bus.a, new cwo(cws.pE));
   }

   @Override
   protected bwi.b<cnn> ec() {
      return bwi.a(bY, d);
   }

   @Override
   protected bwi<?> a(Dynamic<?> $$0) {
      return cno.a(this, this.ec().a($$0));
   }

   @Override
   public bwi<cnn> eb() {
      return (bwi<cnn>)super.eb();
   }

   @Override
   public boolean m() {
      return false;
   }

   @Override
   public boolean c(ard $$0, cwo $$1) {
      return $$1.a(cws.pE) ? super.c($$0, $$1) : false;
   }

   @Override
   protected void a(ard $$0) {
      bos $$1 = bor.a();
      $$1.a("piglinBruteBrain");
      this.eb().a($$0, this);
      $$1.c();
      cno.b(this);
      cno.c(this);
      super.a($$0);
   }

   @Override
   public cnm gt() {
      return this.gh() && this.gu() ? cnm.a : cnm.f;
   }

   @Override
   public boolean a(ard $$0, bta $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bvg $$4) {
         cno.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   protected avz u() {
      return awa.up;
   }

   @Override
   protected avz e(bta $$0) {
      return awa.us;
   }

   @Override
   protected avz o_() {
      return awa.ur;
   }

   @Override
   protected void b(ji $$0, dww $$1) {
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
