import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eoa extends enw {
   public static final MapCodec<eoa> c = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eoa::new));

   public eoa(btw $$0, btw $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected eoc<?> a() {
      return eoc.f;
   }

   @Override
   protected void a(dkd $$0, eob.b $$1, azx $$2, enl $$3, int $$4, eob.a $$5, int $$6, int $$7, int $$8) {
      for (int $$9 = $$8; $$9 >= $$8 - $$6; $$9--) {
         int $$10 = $$7 + ($$9 != $$8 && $$9 != $$8 - $$6 ? 1 : 0);
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }
   }

   @Override
   protected boolean a(azx $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return azo.l((float)$$1 + 0.5F) + azo.l((float)$$3 + 0.5F) > (float)($$4 * $$4);
   }
}
