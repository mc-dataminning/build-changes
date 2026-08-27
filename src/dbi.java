import com.mojang.serialization.MapCodec;

public class dbi extends cwq {
   public static final MapCodec<dbi> a = b(dbi::new);
   private static final int b = 20;

   @Override
   public MapCodec<dbi> a() {
      return a;
   }

   public dbi(djg.d $$0) {
      super($$0);
   }

   @Override
   public void a(ctp $$0, hx $$1, djh $$2, blv $$3) {
      if (!$$3.bT() && $$3 instanceof bml && !crl.j((bml)$$3)) {
         $$3.a($$0.ai().e(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(djh $$0, and $$1, hx $$2, auv $$3) {
      cww.b($$1, $$2.c(), $$0);
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if ($$1 == ic.b && $$2.a(cws.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void b(djh $$0, ctp $$1, hx $$2, djh $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }
}
