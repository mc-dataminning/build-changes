import com.mojang.serialization.MapCodec;

public class cyr extends cua {
   public static final MapCodec<cyr> a = b(cyr::new);
   private static final int b = 20;

   @Override
   public MapCodec<cyr> a() {
      return a;
   }

   public cyr(dga.d $$0) {
      super($$0);
   }

   @Override
   public void a(cqz $$0, ht $$1, dgb $$2, bjt $$3) {
      if (!$$3.bS() && $$3 instanceof bkj && !cov.j((bkj)$$3)) {
         $$3.a($$0.ag().e(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dgb $$0, alq $$1, ht $$2, ate $$3) {
      cug.b($$1, $$2.c(), $$0);
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if ($$1 == hx.b && $$2.a(cuc.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void b(dgb $$0, cqz $$1, ht $$2, dgb $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }
}
