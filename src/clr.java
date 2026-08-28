import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class clr extends cln {
   private static final int bZ = 50;
   private static final float ca = 0.35F;
   private static final int cb = 7;
   protected static final ImmutableList<ceb<? extends cea<? super clr>>> e = ImmutableList.of(ceb.c, ceb.d, ceb.b, ceb.f, ceb.m);
   protected static final ImmutableList<ccu<?>> bY = ImmutableList.of(
      ccu.n, ccu.v, ccu.g, ccu.h, ccu.k, ccu.l, ccu.ao, ccu.an, ccu.x, ccu.y, ccu.m, ccu.E, new ccu[]{ccu.o, ccu.p, ccu.q, ccu.t, ccu.ab, ccu.M, ccu.b}
   );

   public clr(btb<? extends clr> $$0, dbz $$1) {
      super($$0, $$1);
      this.bN = 20;
   }

   public static bux.a y() {
      return cke.gw().a(buy.q, 50.0).a(buy.r, 0.35F).a(buy.c, 7.0);
   }

   @Nullable
   @Override
   public buj a(dco $$0, bqt $$1, btu $$2, @Nullable buj $$3) {
      cls.a(this);
      this.a($$0.E_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azh $$0, bqt $$1) {
      this.a(btc.a, new cuq(cut.oY));
   }

   @Override
   protected bus.b<clr> dT() {
      return bus.a(bY, e);
   }

   @Override
   protected bus<?> a(Dynamic<?> $$0) {
      return cls.a(this, this.dT().a($$0));
   }

   @Override
   public bus<clr> dS() {
      return (bus<clr>)super.dS();
   }

   @Override
   public boolean s() {
      return false;
   }

   @Override
   public boolean k(cuq $$0) {
      return $$0.a(cut.oY) ? super.k($$0) : false;
   }

   @Override
   protected void Z() {
      this.dP().ag().a("piglinBruteBrain");
      this.dS().a((arf)this.dP(), this);
      this.dP().ag().c();
      cls.b(this);
      cls.c(this);
      super.Z();
   }

   @Override
   public clq gs() {
      return this.gi() && this.gt() ? clq.a : clq.f;
   }

   @Override
   public boolean a(bro $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dP().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof btq) {
            cls.a(this, (btq)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected avz v() {
      return awa.tM;
   }

   @Override
   protected avz d(bro $$0) {
      return awa.tP;
   }

   @Override
   protected avz o_() {
      return awa.tO;
   }

   @Override
   protected void b(iz $$0, dsd $$1) {
      this.a(awa.tQ, 0.15F, 1.0F);
   }

   protected void gx() {
      this.b(awa.tN);
   }

   @Override
   protected void gu() {
      this.b(awa.tR);
   }
}
