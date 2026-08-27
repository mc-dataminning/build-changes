import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvi extends dve {
   public static final Codec<dvi> c = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dvi::new));

   public dvi(bjf $$0, bjf $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dvk<?> a() {
      return dvk.f;
   }

   @Override
   protected void a(ctu $$0, dvj.b $$1, auu $$2, dut $$3, int $$4, dvj.a $$5, int $$6, int $$7, int $$8) {
      for (int $$9 = $$8; $$9 >= $$8 - $$6; $$9--) {
         int $$10 = $$7 + ($$9 != $$8 && $$9 != $$8 - $$6 ? 1 : 0);
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }
   }

   @Override
   protected boolean a(auu $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return aun.k((float)$$1 + 0.5F) + aun.k((float)$$3 + 0.5F) > (float)($$4 * $$4);
   }
}
