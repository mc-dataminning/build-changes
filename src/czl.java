import com.mojang.serialization.MapCodec;

public class czl extends cut {
   public static final MapCodec<czl> a = b(czl::new);
   private static final int b = 20;

   @Override
   public MapCodec<czl> a() {
      return a;
   }

   public czl(dgv.d $$0) {
      super($$0);
   }

   @Override
   public void a(crs $$0, ht $$1, dgw $$2, bki $$3) {
      if (!$$3.bS() && $$3 instanceof bky && !cpo.j((bky)$$3)) {
         $$3.a($$0.ag().e(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dgw $$0, ama $$1, ht $$2, ato $$3) {
      cuz.b($$1, $$2.c(), $$0);
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if ($$1 == hx.b && $$2.a(cuv.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void b(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }
}
