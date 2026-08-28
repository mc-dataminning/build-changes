import com.mojang.serialization.MapCodec;

public class dtv extends doa {
   public static final MapCodec<dtv> b = b(dtv::new);
   private static final wy c = wy.c("container.upgrade");

   @Override
   public MapCodec<dtv> a() {
      return b;
   }

   protected dtv(eag.d $$0) {
      super($$0);
   }

   @Override
   protected buf b(eah $$0, dja $$1, iu $$2) {
      return new bul(($$2x, $$3, $$4) -> new cwv($$2x, $$3, cvi.a($$1, $$2)), c);
   }

   @Override
   protected bud a(eah $$0, dja $$1, iu $$2, crc $$3, fem $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awx.aF);
      }

      return bud.a;
   }
}
