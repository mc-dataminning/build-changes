import com.mojang.serialization.MapCodec;

public class dgz extends dff {
   public static final MapCodec<dgz> a = b(dgz::new);
   private static final wu b = wu.c("container.crafting");

   @Override
   public MapCodec<? extends dgz> a() {
      return a;
   }

   protected dgz(dsg.d $$0) {
      super($$0);
   }

   @Override
   protected bqd a(dsh $$0, dcd $$1, ja $$2, cmh $$3, evv $$4) {
      if ($$1.B) {
         return bqd.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avp.an);
         return bqd.c;
      }
   }

   @Override
   protected bqh b(dsh $$0, dcd $$1, ja $$2) {
      return new bqn(($$2x, $$3, $$4) -> new cpw($$2x, $$3, cpq.a($$1, $$2)), b);
   }
}
