import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecj extends ecf {
   public static final Codec<ecj> c = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, ecj::new));

   public ecj(bnv $$0, bnv $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected ecl<?> a() {
      return ecl.f;
   }

   @Override
   protected void a(daa $$0, eck.b $$1, ayd $$2, ebu $$3, int $$4, eck.a $$5, int $$6, int $$7, int $$8) {
      for (int $$9 = $$8; $$9 >= $$8 - $$6; $$9--) {
         int $$10 = $$7 + ($$9 != $$8 && $$9 != $$8 - $$6 ? 1 : 0);
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }
   }

   @Override
   protected boolean a(ayd $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return axw.k((float)$$1 + 0.5F) + axw.k((float)$$3 + 0.5F) > (float)($$4 * $$4);
   }
}
