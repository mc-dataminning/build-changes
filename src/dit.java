import com.mojang.serialization.MapCodec;

public class dit extends dea {
   public static final MapCodec<dit> a = b(dit::new);
   private static final int b = 20;

   @Override
   public MapCodec<dit> a() {
      return a;
   }

   public dit(drc.d $$0) {
      super($$0);
   }

   @Override
   public void a(daz $$0, io $$1, drd $$2, brw $$3) {
      if (!$$3.bW() && $$3 instanceof bsq && !czc.j((bsq)$$3)) {
         $$3.a($$0.ai().e(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(drd $$0, aqn $$1, io $$2, aym $$3) {
      deg.b($$1, $$2.c(), $$0);
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if ($$1 == it.b && $$2.a(dec.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }
}
