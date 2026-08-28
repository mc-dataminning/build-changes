import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eez extends eev {
   public static final MapCodec<eez> c = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eez::new));

   public eez(bpl $$0, bpl $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected efb<?> a() {
      return efb.f;
   }

   @Override
   protected void a(dcl $$0, efa.b $$1, ayo $$2, eek $$3, int $$4, efa.a $$5, int $$6, int $$7, int $$8) {
      for (int $$9 = $$8; $$9 >= $$8 - $$6; $$9--) {
         int $$10 = $$7 + ($$9 != $$8 && $$9 != $$8 - $$6 ? 1 : 0);
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }
   }

   @Override
   protected boolean a(ayo $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return ayg.k((float)$$1 + 0.5F) + ayg.k((float)$$3 + 0.5F) > (float)($$4 * $$4);
   }
}
