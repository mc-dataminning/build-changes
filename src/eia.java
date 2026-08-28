import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eia extends ehw {
   public static final MapCodec<eia> c = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eia::new));

   public eia(bri $$0, bri $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected eic<?> a() {
      return eic.f;
   }

   @Override
   protected void a(dfh $$0, eib.b $$1, azs $$2, ehl $$3, int $$4, eib.a $$5, int $$6, int $$7, int $$8) {
      for (int $$9 = $$8; $$9 >= $$8 - $$6; $$9--) {
         int $$10 = $$7 + ($$9 != $$8 && $$9 != $$8 - $$6 ? 1 : 0);
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }
   }

   @Override
   protected boolean a(azs $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return azk.l((float)$$1 + 0.5F) + azk.l((float)$$3 + 0.5F) > (float)($$4 * $$4);
   }
}
