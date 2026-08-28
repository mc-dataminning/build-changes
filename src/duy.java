import com.mojang.serialization.MapCodec;

public class duy extends dnc {
   public static final MapCodec<duy> a = b(duy::new);
   private static final fgk b = dnc.b(16.0, 0.0, 14.0);
   private static final int c = 20;

   @Override
   public MapCodec<duy> a() {
      return a;
   }

   public duy(ebd.d $$0) {
      super($$0);
   }

   @Override
   protected fgk b(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return b;
   }

   @Override
   protected fgk b_(ebe $$0, djb $$1, iv $$2) {
      return fgh.b();
   }

   @Override
   protected fgk c(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return fgh.b();
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, azx $$3) {
      dnj.b($$1, $$2.d(), $$0);
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if ($$4 == jb.b && $$6.a(dne.J)) {
         $$2.a($$3, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, ebe $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }

   @Override
   protected boolean a(ebe $$0, eyd $$1) {
      return false;
   }

   @Override
   protected float c(ebe $$0, djb $$1, iv $$2) {
      return 0.2F;
   }
}
