import com.mojang.serialization.MapCodec;

public class def extends dfh {
   public static final MapCodec<def> a = b(def::new);

   @Override
   public MapCodec<? extends def> a() {
      return a;
   }

   public def(dsj.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dcf $$0, dsk $$1, ewb $$2, cnc $$3) {
      if (!$$0.B) {
         ja $$4 = $$2.a();
         $$0.a(null, $$4, avh.G, avi.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
         $$0.a(null, $$4, avh.E, avi.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
      }
   }
}
