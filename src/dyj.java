import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dyj extends dyf {
   public static final Codec<dyj> c = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dyj::new));

   public dyj(blq $$0, blq $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dyl<?> a() {
      return dyl.f;
   }

   @Override
   protected void a(cwk $$0, dyk.b $$1, awt $$2, dxu $$3, int $$4, dyk.a $$5, int $$6, int $$7, int $$8) {
      for (int $$9 = $$8; $$9 >= $$8 - $$6; $$9--) {
         int $$10 = $$7 + ($$9 != $$8 && $$9 != $$8 - $$6 ? 1 : 0);
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }
   }

   @Override
   protected boolean a(awt $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return awm.k((float)$$1 + 0.5F) + awm.k((float)$$3 + 0.5F) > (float)($$4 * $$4);
   }
}
