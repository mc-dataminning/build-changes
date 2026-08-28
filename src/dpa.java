import com.mojang.serialization.MapCodec;

public class dpa extends djn implements djq {
   public static final MapCodec<dpa> a = b(dpa::new);

   @Override
   public MapCodec<dpa> a() {
      return a;
   }

   protected dpa(dwx.d $$0) {
      super($$0);
   }

   private static boolean b(dwy $$0, dgm $$1, ji $$2) {
      ji $$3 = $$2.d();
      dwy $$4 = $$1.a_($$3);
      int $$5 = esr.a($$0, $$4, jn.b, $$4.g());
      return $$5 < 15;
   }

   @Override
   protected void b(dwy $$0, ard $$1, ji $$2, azh $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, djp.ei.m());
      }
   }

   @Override
   public boolean a(dgm $$0, ji $$1, dwy $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dgj $$0, azh $$1, ji $$2, dwy $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dwy $$3) {
      dwy $$4 = $$0.a_($$2);
      ji $$5 = $$2.d();
      dyu $$6 = $$0.m().g();
      ke<efl<?, ?>> $$7 = $$0.K_().e(mc.aL);
      if ($$4.a(djp.oY)) {
         this.a($$7, rh.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(djp.oP)) {
         this.a($$7, rh.j, $$0, $$6, $$1, $$5);
         this.a($$7, rh.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, rh.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(ke<efl<?, ?>> $$0, aku<efl<?, ?>> $$1, ard $$2, dyu $$3, azh $$4, ji $$5) {
      $$0.a($$1).ifPresent($$4x -> ((efl)$$4x.a()).a($$2, $$3, $$4, $$5));
   }

   @Override
   public djq.a aq_() {
      return djq.a.a;
   }
}
