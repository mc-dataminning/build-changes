import com.mojang.serialization.MapCodec;

public class dmi extends dkd {
   public static final MapCodec<dmi> a = b(dmi::new);
   protected static final fcl b = dnb.c;

   @Override
   public MapCodec<dmi> a() {
      return a;
   }

   protected dmi(dxn.d $$0) {
      super($$0);
   }

   @Override
   protected boolean g_(dxo $$0) {
      return true;
   }

   @Override
   public dxo a(dax $$0) {
      return !this.m().a((dhc)$$0.q(), $$0.a()) ? dkd.a(this.m(), dkf.j.m(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if ($$4 == jm.b && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dxo $$0, arx $$1, jh $$2, bac $$3) {
      dnb.a(null, $$0, $$1, $$2);
   }

   @Override
   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      dxo $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dnd;
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return b;
   }

   @Override
   protected boolean a(dxo $$0, euf $$1) {
      return false;
   }
}
