import com.mojang.serialization.MapCodec;

public class dds extends daf {
   public static final MapCodec<dds> a = b(dds::new);

   @Override
   public MapCodec<dds> a() {
      return a;
   }

   public dds(djf.d $$0) {
      super($$0);
   }

   @Override
   public void a(cto $$0, djg $$1, hx $$2, blu $$3, float $$4) {
      if ($$3.bU()) {
         super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         $$3.a($$4, 0.0F, $$0.ai().k());
      }
   }

   @Override
   public void a(csu $$0, blu $$1) {
      if ($$1.bU()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(blu $$0) {
      els $$1 = $$0.dp();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof bmk ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * $$2, $$1.e);
      }
   }

   @Override
   public void a(cto $$0, hx $$1, djg $$2, blu $$3) {
      double $$4 = Math.abs($$3.dp().d);
      if ($$4 < 0.1 && !$$3.bT()) {
         double $$5 = 0.4 + $$4 * 0.2;
         $$3.g($$3.dp().d($$5, 1.0, $$5));
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
