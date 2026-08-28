import com.mojang.serialization.MapCodec;

public class doa extends dmf {
   public static final MapCodec<doa> a = b(doa::new);
   private static final wy b = wy.c("container.crafting");

   @Override
   public MapCodec<? extends doa> a() {
      return a;
   }

   protected doa(eag.d $$0) {
      super($$0);
   }

   @Override
   protected bud a(eah $$0, dja $$1, iu $$2, crc $$3, fem $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awx.an);
      }

      return bud.a;
   }

   @Override
   protected buf b(eah $$0, dja $$1, iu $$2) {
      return new bul(($$2x, $$3, $$4) -> new cvo($$2x, $$3, cvi.a($$1, $$2)), b);
   }
}
