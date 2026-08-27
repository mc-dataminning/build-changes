import com.mojang.serialization.MapCodec;

public class dbq extends cwy {
   public static final MapCodec<dbq> a = b(dbq::new);
   private static final int b = 20;

   @Override
   public MapCodec<dbq> a() {
      return a;
   }

   public dbq(djo.d $$0) {
      super($$0);
   }

   @Override
   public void a(ctx $$0, hx $$1, djp $$2, blw $$3) {
      if (!$$3.bT() && $$3 instanceof bmo && !crt.j((bmo)$$3)) {
         $$3.a($$0.ai().e(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
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
}
