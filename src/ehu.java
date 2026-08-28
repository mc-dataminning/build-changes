import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehu extends ehq {
   public static final MapCodec<ehu> c = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ehu::new));

   public ehu(brd $$0, brd $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected ehw<?> a() {
      return ehw.f;
   }

   @Override
   protected void a(dfb $$0, ehv.b $$1, azr $$2, ehf $$3, int $$4, ehv.a $$5, int $$6, int $$7, int $$8) {
      for (int $$9 = $$8; $$9 >= $$8 - $$6; $$9--) {
         int $$10 = $$7 + ($$9 != $$8 && $$9 != $$8 - $$6 ? 1 : 0);
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }
   }

   @Override
   protected boolean a(azr $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return azj.l((float)$$1 + 0.5F) + azj.l((float)$$3 + 0.5F) > (float)($$4 * $$4);
   }
}
