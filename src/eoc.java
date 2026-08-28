import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eoc extends eny {
   public static final MapCodec<eoc> c = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eoc::new));

   public eoc(bty $$0, bty $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected eoe<?> a() {
      return eoe.f;
   }

   @Override
   protected void a(dkf $$0, eod.b $$1, azz $$2, enn $$3, int $$4, eod.a $$5, int $$6, int $$7, int $$8) {
      for (int $$9 = $$8; $$9 >= $$8 - $$6; $$9--) {
         int $$10 = $$7 + ($$9 != $$8 && $$9 != $$8 - $$6 ? 1 : 0);
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }
   }

   @Override
   protected boolean a(azz $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return azq.l((float)$$1 + 0.5F) + azq.l((float)$$3 + 0.5F) > (float)($$4 * $$4);
   }
}
