import com.mojang.serialization.MapCodec;

public class deu extends dac {
   public static final MapCodec<deu> a = b(deu::new);
   private static final int b = 20;

   @Override
   public MapCodec<deu> a() {
      return a;
   }

   public deu(dna.d $$0) {
      super($$0);
   }

   @Override
   public void a(cxb $$0, ib $$1, dnb $$2, box $$3) {
      if (!$$3.bT() && $$3 instanceof bpp && !cux.j((bpp)$$3)) {
         $$3.a($$0.ah().e(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dnb $$0, apf $$1, ib $$2, axd $$3) {
      dai.b($$1, $$2.c(), $$0);
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if ($$1 == ih.b && $$2.a(dae.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }
}
