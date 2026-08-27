import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public class dve extends dvj {
   public static final Codec<dve> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dve::new));
   protected final int b;

   protected static <P extends dve> P3<Mu<P>, bjf, bjf, Integer> a(Instance<P> $$0) {
      return b($$0).and(Codec.intRange(0, 16).fieldOf("height").forGetter($$0x -> $$0x.b));
   }

   public dve(bjf $$0, bjf $$1, int $$2) {
      super($$0, $$1);
      this.b = $$2;
   }

   @Override
   protected dvk<?> a() {
      return dvk.a;
   }

   @Override
   protected void a(ctu $$0, dvj.b $$1, auu $$2, dut $$3, int $$4, dvj.a $$5, int $$6, int $$7, int $$8) {
      for (int $$9 = $$8; $$9 >= $$8 - $$6; $$9--) {
         int $$10 = Math.max($$7 + $$5.b() - 1 - $$9 / 2, 0);
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }
   }

   @Override
   public int a(auu $$0, int $$1, dut $$2) {
      return this.b;
   }

   @Override
   protected boolean a(auu $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == $$4 && $$3 == $$4 && ($$0.a(2) == 0 || $$2 == 0);
   }
}
