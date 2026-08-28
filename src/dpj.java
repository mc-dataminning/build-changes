import com.mojang.serialization.MapCodec;

public class dpj extends dne {
   public static final MapCodec<dpj> a = b(dpj::new);
   private static final fgm b = dne.b(16.0, 0.0, 15.0);

   @Override
   public MapCodec<dpj> a() {
      return a;
   }

   protected dpj(ebf.d $$0) {
      super($$0);
   }

   @Override
   protected boolean g_(ebg $$0) {
      return true;
   }

   @Override
   public ebg a(ddt $$0) {
      return !this.m().a((dkc)$$0.q(), $$0.a()) ? dne.a(this.m(), dng.j.m(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if ($$4 == jc.b && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, azz $$3) {
      dqd.a(null, $$0, $$1, $$2);
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      ebg $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dqf;
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return b;
   }

   @Override
   protected boolean a(ebg $$0, eyf $$1) {
      return false;
   }
}
