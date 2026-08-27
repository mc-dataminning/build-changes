import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cka extends cjw {
   private static final int bZ = 50;
   private static final float ca = 0.35F;
   private static final int cb = 7;
   protected static final ImmutableList<cck<? extends ccj<? super cka>>> e = ImmutableList.of(cck.c, cck.d, cck.b, cck.f, cck.m);
   protected static final ImmutableList<cbd<?>> bY = ImmutableList.of(
      cbd.n, cbd.v, cbd.g, cbd.h, cbd.k, cbd.l, cbd.ao, cbd.an, cbd.x, cbd.y, cbd.m, cbd.E, new cbd[]{cbd.o, cbd.p, cbd.q, cbd.t, cbd.ab, cbd.M, cbd.b}
   );

   public cka(brn<? extends cka> $$0, dad $$1) {
      super($$0, $$1);
      this.bN = 20;
   }

   public static btg.a y() {
      return cin.gv().a(bth.q, 50.0).a(bth.r, 0.35F).a(bth.c, 7.0);
   }

   @Nullable
   @Override
   public bss a(das $$0, bpk $$1, bse $$2, @Nullable bss $$3) {
      ckb.a(this);
      this.a($$0.E_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ayg $$0, bpk $$1) {
      this.a(bro.a, new csz(ctc.oY));
   }

   @Override
   protected btb.b<cka> dR() {
      return btb.a(bY, e);
   }

   @Override
   protected btb<?> a(Dynamic<?> $$0) {
      return ckb.a(this, this.dR().a($$0));
   }

   @Override
   public btb<cka> dQ() {
      return (btb<cka>)super.dQ();
   }

   @Override
   public boolean r() {
      return false;
   }

   @Override
   public boolean k(csz $$0) {
      return $$0.a(ctc.oY) ? super.k($$0) : false;
   }

   @Override
   protected void Y() {
      this.dN().af().a("piglinBruteBrain");
      this.dQ().a((aqh)this.dN(), this);
      this.dN().af().c();
      ckb.b(this);
      ckb.c(this);
      super.Y();
   }

   @Override
   public cjz gr() {
      return this.gh() && this.gs() ? cjz.a : cjz.f;
   }

   @Override
   public boolean a(bqf $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dN().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bsa) {
            ckb.a(this, (bsa)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected avb v() {
      return avc.tB;
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.tE;
   }

   @Override
   protected avb o_() {
      return avc.tD;
   }

   @Override
   protected void b(in $$0, dqh $$1) {
      this.a(avc.tF, 0.15F, 1.0F);
   }

   protected void gw() {
      this.b(avc.tC);
   }

   @Override
   protected void gt() {
      this.b(avc.tG);
   }
}
