import com.mojang.serialization.MapCodec;

public class dph extends dnc {
   public static final MapCodec<dph> a = b(dph::new);
   private static final fgk b = dnc.b(16.0, 0.0, 15.0);

   @Override
   public MapCodec<dph> a() {
      return a;
   }

   protected dph(ebd.d $$0) {
      super($$0);
   }

   @Override
   protected boolean g_(ebe $$0) {
      return true;
   }

   @Override
   public ebe a(ddr $$0) {
      return !this.m().a((dka)$$0.q(), $$0.a()) ? dnc.a(this.m(), dne.j.m(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if ($$4 == jb.b && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, azx $$3) {
      dqb.a(null, $$0, $$1, $$2);
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      ebe $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dqd;
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return b;
   }

   @Override
   protected boolean a(ebe $$0, eyd $$1) {
      return false;
   }
}
