import com.mojang.serialization.MapCodec;

public class ddu extends cwj {
   public static final MapCodec<ddu> a = b(ddu::new);
   protected static final emf b = cwj.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
   private static final int c = 20;

   @Override
   public MapCodec<ddu> a() {
      return a;
   }

   public ddu(diz.d $$0) {
      super($$0);
   }

   @Override
   public emf b(dja $$0, cso $$1, hx $$2, elr $$3) {
      return b;
   }

   @Override
   public emf b_(dja $$0, cso $$1, hx $$2) {
      return emc.b();
   }

   @Override
   public emf c(dja $$0, cso $$1, hx $$2, elr $$3) {
      return emc.b();
   }

   @Override
   public void a(dja $$0, amz $$1, hx $$2, aup $$3) {
      cwp.b($$1, $$2.c(), $$0);
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if ($$1 == ic.b && $$2.a(cwl.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void b(dja $$0, cti $$1, hx $$2, dja $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }

   @Override
   public boolean a(dja $$0, cso $$1, hx $$2, efa $$3) {
      return false;
   }

   @Override
   public float d(dja $$0, cso $$1, hx $$2) {
      return 0.2F;
   }
}
