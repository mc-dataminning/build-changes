import com.mojang.serialization.MapCodec;

public class dky extends dma {
   public static final MapCodec<dky> a = b(dky::new);

   @Override
   public MapCodec<? extends dky> a() {
      return a;
   }

   public dky(dzy.d $$0) {
      super($$0);
   }

   @Override
   protected void a(div $$0, dzz $$1, fee $$2, crs $$3) {
      if (!$$0.C) {
         iu $$4 = $$2.b();
         $$0.a(null, $$4, awn.E, awo.e, 1.0F, 0.5F + $$0.A.i() * 1.2F);
      }
   }
}
