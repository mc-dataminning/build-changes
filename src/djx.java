import com.mojang.serialization.MapCodec;

public class djx extends djb {
   public static final MapCodec<djx> a = b(djx::new);
   private static final wu b = wu.c("container.loom");

   @Override
   public MapCodec<djx> a() {
      return a;
   }

   protected djx(dsg.d $$0) {
      super($$0);
   }

   @Override
   protected bqd a(dsh $$0, dcd $$1, ja $$2, cmh $$3, evv $$4) {
      if ($$1.B) {
         return bqd.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avp.ax);
         return bqd.c;
      }
   }

   @Override
   protected bqh b(dsh $$0, dcd $$1, ja $$2) {
      return new bqn(($$2x, $$3, $$4) -> new cqk($$2x, $$3, cpq.a($$1, $$2)), b);
   }

   @Override
   public dsh a(cxk $$0) {
      return this.o().a(aE, $$0.g().g());
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(aE);
   }
}
