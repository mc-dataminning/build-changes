import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edm extends edi {
   public static final MapCodec<edm> c = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, edm::new));

   public edm(boz $$0, boz $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected edo<?> a() {
      return edo.f;
   }

   @Override
   protected void a(dbd $$0, edn.b $$1, ayk $$2, ecx $$3, int $$4, edn.a $$5, int $$6, int $$7, int $$8) {
      for (int $$9 = $$8; $$9 >= $$8 - $$6; $$9--) {
         int $$10 = $$7 + ($$9 != $$8 && $$9 != $$8 - $$6 ? 1 : 0);
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }
   }

   @Override
   protected boolean a(ayk $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return ayd.k((float)$$1 + 0.5F) + ayd.k((float)$$3 + 0.5F) > (float)($$4 * $$4);
   }
}
