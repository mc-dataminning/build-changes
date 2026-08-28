import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eet extends eep {
   public static final MapCodec<eet> c = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eet::new));

   public eet(bpi $$0, bpi $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected eev<?> a() {
      return eev.f;
   }

   @Override
   protected void a(dcj $$0, eeu.b $$1, aym $$2, eee $$3, int $$4, eeu.a $$5, int $$6, int $$7, int $$8) {
      for (int $$9 = $$8; $$9 >= $$8 - $$6; $$9--) {
         int $$10 = $$7 + ($$9 != $$8 && $$9 != $$8 - $$6 ? 1 : 0);
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }
   }

   @Override
   protected boolean a(aym $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return aye.k((float)$$1 + 0.5F) + aye.k((float)$$3 + 0.5F) > (float)($$4 * $$4);
   }
}
