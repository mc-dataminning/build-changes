import com.mojang.serialization.MapCodec;

public class dun extends dvj implements dmd {
   public static final MapCodec<dun> a = b(dun::new);
   private static final ffc b = dma.b(12.0, 0.0, 13.0);

   @Override
   public MapCodec<dun> a() {
      return a;
   }

   protected dun(dzy.d $$0) {
      super($$0);
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return b;
   }

   @Override
   public boolean a(diy $$0, iu $$1, dzz $$2) {
      return o($$2).m().a($$0, $$1) && $$0.v($$1.d());
   }

   @Override
   public boolean a(div $$0, azv $$1, iu $$2, dzz $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, dzz $$3) {
      doj.a($$0, o($$3).m(), $$2, 2);
   }

   private static doj o(dzz $$0) {
      return (doj)($$0.a(dmc.bB) ? dmc.jh : dmc.jg);
   }
}
