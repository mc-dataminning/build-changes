import com.mojang.serialization.MapCodec;

public class dml extends dgz {
   public static final MapCodec<dml> b = b(dml::new);
   private static final wu c = wu.c("container.upgrade");

   @Override
   public MapCodec<dml> a() {
      return b;
   }

   protected dml(dsg.d $$0) {
      super($$0);
   }

   @Override
   protected bqh b(dsh $$0, dcd $$1, ja $$2) {
      return new bqn(($$2x, $$3, $$4) -> new crd($$2x, $$3, cpq.a($$1, $$2)), c);
   }

   @Override
   protected bqd a(dsh $$0, dcd $$1, ja $$2, cmh $$3, evv $$4) {
      if ($$1.B) {
         return bqd.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avp.aF);
         return bqd.c;
      }
   }
}
