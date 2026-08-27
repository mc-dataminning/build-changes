import com.mojang.serialization.MapCodec;

public class ddg extends cyo {
   public static final MapCodec<ddg> a = b(ddg::new);
   private static final int b = 20;

   @Override
   public MapCodec<ddg> a() {
      return a;
   }

   public ddg(dle.d $$0) {
      super($$0);
   }

   @Override
   public void a(cvn $$0, hz $$1, dlf $$2, bno $$3) {
      if (!$$3.bT() && $$3 instanceof bog && !ctj.j((bog)$$3)) {
         $$3.a($$0.ai().e(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dlf $$0, aov $$1, hz $$2, awo $$3) {
      cyu.b($$1, $$2.c(), $$0);
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if ($$1 == ie.b && $$2.a(cyq.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dlf $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }
}
