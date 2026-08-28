import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eel extends eeh {
   public static final MapCodec<eel> c = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eel::new));

   public eel(bpx $$0, bpx $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected een<?> a() {
      return een.f;
   }

   @Override
   protected void a(dcc $$0, eem.b $$1, azf $$2, edw $$3, int $$4, eem.a $$5, int $$6, int $$7, int $$8) {
      for (int $$9 = $$8; $$9 >= $$8 - $$6; $$9--) {
         int $$10 = $$7 + ($$9 != $$8 && $$9 != $$8 - $$6 ? 1 : 0);
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }
   }

   @Override
   protected boolean a(azf $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return ayx.k((float)$$1 + 0.5F) + ayx.k((float)$$3 + 0.5F) > (float)($$4 * $$4);
   }
}
