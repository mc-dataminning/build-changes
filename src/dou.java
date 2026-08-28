import com.mojang.serialization.MapCodec;

public class dou extends dfh {
   public static final MapCodec<dou> a = b(dou::new);

   @Override
   public MapCodec<dou> a() {
      return a;
   }

   public dou(dsj.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, bsg $$3) {
      ewf $$4 = new ewf(0.25, 0.05F, 0.25);
      if ($$3 instanceof btb $$5 && $$5.b(brq.K)) {
         $$4 = new ewf(0.5, 0.25, 0.5);
      }

      $$3.a($$0, $$4);
   }
}
