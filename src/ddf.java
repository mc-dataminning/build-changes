import com.mojang.serialization.MapCodec;

public class ddf extends dcj {
   public static final MapCodec<ddf> a = b(ddf::new);
   private static final vq b = vq.c("container.loom");

   @Override
   public MapCodec<ddf> a() {
      return a;
   }

   protected ddf(dle.d $$0) {
      super($$0);
   }

   @Override
   protected blu a(dlf $$0, cvn $$1, hz $$2, chh $$3, eno $$4) {
      if ($$1.B) {
         return blu.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(atu.ax);
         return blu.b;
      }
   }

   @Override
   protected bly b(dlf $$0, cvn $$1, hz $$2) {
      return new bme(($$2x, $$3, $$4) -> new clg($$2x, $$3, ckm.a($$1, $$2)), b);
   }

   @Override
   public dlf a(crg $$0) {
      return this.o().a(aE, $$0.g().g());
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(aE);
   }
}
