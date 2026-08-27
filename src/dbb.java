import com.mojang.serialization.MapCodec;

public class dbb extends cwj {
   public static final MapCodec<dbb> a = b(dbb::new);
   private static final int b = 20;

   @Override
   public MapCodec<dbb> a() {
      return a;
   }

   public dbb(diz.d $$0) {
      super($$0);
   }

   @Override
   public void a(cti $$0, hx $$1, dja $$2, blp $$3) {
      if (!$$3.bT() && $$3 instanceof bmf && !cre.j((bmf)$$3)) {
         $$3.a($$0.ai().e(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
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
}
