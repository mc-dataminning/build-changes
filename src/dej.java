import com.mojang.serialization.MapCodec;

public class dej extends cwy {
   public static final MapCodec<dej> a = b(dej::new);
   protected static final emv b = cwy.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
   private static final int c = 20;

   @Override
   public MapCodec<dej> a() {
      return a;
   }

   public dej(djo.d $$0) {
      super($$0);
   }

   @Override
   public emv b(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return b;
   }

   @Override
   public emv b_(djp $$0, ctd $$1, hx $$2) {
      return ems.b();
   }

   @Override
   public emv c(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return ems.b();
   }

   @Override
   public void a(djp $$0, ane $$1, hx $$2, auw $$3) {
      cxe.b($$1, $$2.c(), $$0);
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if ($$1 == ic.b && $$2.a(cxa.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void b(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }

   @Override
   public boolean a(djp $$0, ctd $$1, hx $$2, efp $$3) {
      return false;
   }

   @Override
   public float d(djp $$0, ctd $$1, hx $$2) {
      return 0.2F;
   }
}
