import com.mojang.serialization.MapCodec;

public class ddk extends cys {
   public static final MapCodec<ddk> a = b(ddk::new);
   private static final int b = 20;

   @Override
   public MapCodec<ddk> a() {
      return a;
   }

   public ddk(dli.d $$0) {
      super($$0);
   }

   @Override
   public void a(cvr $$0, hz $$1, dlj $$2, bnq $$3) {
      if (!$$3.bT() && $$3 instanceof boi && !ctn.j((boi)$$3)) {
         $$3.a($$0.ah().e(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dlj $$0, aow $$1, hz $$2, awp $$3) {
      cyy.b($$1, $$2.c(), $$0);
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      if ($$1 == ie.b && $$2.a(cyu.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dlj $$0, cvr $$1, hz $$2, dlj $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }
}
