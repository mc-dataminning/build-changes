import com.mojang.serialization.MapCodec;

public class dkr extends dfy {
   public static final MapCodec<dkr> a = b(dkr::new);
   private static final int b = 20;

   @Override
   public MapCodec<dkr> a() {
      return a;
   }

   public dkr(dtb.d $$0) {
      super($$0);
   }

   @Override
   public void a(dcw $$0, jd $$1, dtc $$2, bsr $$3) {
      if (!$$3.bX() && $$3 instanceof btn) {
         $$3.a($$0.aj().f(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      dge.b($$1, $$2.d(), $$0);
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if ($$1 == ji.b && $$2.a(dga.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dtc $$0, dcw $$1, jd $$2, dtc $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }
}
