import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cno extends cnk {
   private static final int bZ = 50;
   private static final float ca = 0.35F;
   private static final int cb = 7;
   private static final double cc = 12.0;
   protected static final ImmutableList<cfr<? extends cfq<? super cno>>> d = ImmutableList.of(cfr.c, cfr.d, cfr.b, cfr.f, cfr.m);
   protected static final ImmutableList<cek<?>> bY = ImmutableList.of(
      cek.n, cek.v, cek.g, cek.h, cek.k, cek.l, cek.ao, cek.an, cek.x, cek.y, cek.m, cek.E, new cek[]{cek.o, cek.p, cek.q, cek.t, cek.ab, cek.M, cek.b}
   );

   public cno(bur<? extends cno> $$0, dgi $$1) {
      super($$0, $$1);
      this.bN = 20;
   }

   public static bwn.a t() {
      return clx.gu().a(bwo.s, 50.0).a(bwo.v, 0.35F).a(bwo.c, 7.0).a(bwo.m, 12.0);
   }

   @Nullable
   @Override
   public bvz a(dgz $$0, bsh $$1, buq $$2, @Nullable bvz $$3) {
      cnp.a(this);
      this.a($$0.H_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azh $$0, bsh $$1) {
      this.a(bus.a, new cwp(cwt.pE));
   }

   @Override
   protected bwi.b<cno> ed() {
      return bwi.a(bY, d);
   }

   @Override
   protected bwi<?> a(Dynamic<?> $$0) {
      return cnp.a(this, this.ed().a($$0));
   }

   @Override
   public bwi<cno> ec() {
      return (bwi<cno>)super.ec();
   }

   @Override
   public boolean m() {
      return false;
   }

   @Override
   public boolean c(arc $$0, cwp $$1) {
      return $$1.a(cwt.pE) ? super.c($$0, $$1) : false;
   }

   @Override
   protected void a(arc $$0) {
      bos $$1 = bor.a();
      $$1.a("piglinBruteBrain");
      this.ec().a($$0, this);
      $$1.c();
      cnp.b(this);
      cnp.c(this);
      super.a($$0);
   }

   @Override
   public cnn gq() {
      return this.ge() && this.gr() ? cnn.a : cnn.f;
   }

   @Override
   public boolean a(arc $$0, bta $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bvg $$4) {
         cnp.a($$0, this, $$4);
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
   protected void b(ji $$0, dwx $$1) {
      this.a(awa.ut, 0.15F, 1.0F);
   }

   protected void gv() {
      this.b(awa.uq);
   }

   @Override
   protected void gs() {
      this.b(awa.uu);
   }
}
