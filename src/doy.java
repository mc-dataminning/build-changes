import com.mojang.serialization.MapCodec;

public class doy extends djl implements djo {
   public static final MapCodec<doy> a = b(doy::new);

   @Override
   public MapCodec<doy> a() {
      return a;
   }

   protected doy(dwv.d $$0) {
      super($$0);
   }

   private static boolean b(dww $$0, dgk $$1, ji $$2) {
      ji $$3 = $$2.d();
      dww $$4 = $$1.a_($$3);
      int $$5 = esp.a($$0, $$4, jn.b, $$4.g());
      return $$5 < 15;
   }

   @Override
   protected void b(dww $$0, ard $$1, ji $$2, azh $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, djn.ei.m());
      }
   }

   @Override
   public boolean a(dgk $$0, ji $$1, dww $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dgh $$0, azh $$1, ji $$2, dww $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dww $$3) {
      dww $$4 = $$0.a_($$2);
      ji $$5 = $$2.d();
      dys $$6 = $$0.m().g();
      ke<efj<?, ?>> $$7 = $$0.K_().e(mc.aL);
      if ($$4.a(djn.oY)) {
         this.a($$7, rh.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(djn.oP)) {
         this.a($$7, rh.j, $$0, $$6, $$1, $$5);
         this.a($$7, rh.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, rh.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(ke<efj<?, ?>> $$0, aku<efj<?, ?>> $$1, ard $$2, dys $$3, azh $$4, ji $$5) {
      $$0.a($$1).ifPresent($$4x -> ((efj)$$4x.a()).a($$2, $$3, $$4, $$5));
   }

   @Override
   public djo.a aq_() {
      return djo.a.a;
   }
}
