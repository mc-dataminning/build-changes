import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvp extends dvj {
   public static final Codec<dvp> a = RecordCodecBuilder.create(
      $$0 -> b($$0).and(bjf.b(0, 24).fieldOf("trunk_height").forGetter($$0x -> $$0x.b)).apply($$0, dvp::new)
   );
   private final bjf b;

   public dvp(bjf $$0, bjf $$1, bjf $$2) {
      super($$0, $$1);
      this.b = $$2;
   }

   @Override
   protected dvk<?> a() {
      return dvk.b;
   }

   @Override
   protected void a(ctu $$0, dvj.b $$1, auu $$2, dut $$3, int $$4, dvj.a $$5, int $$6, int $$7, int $$8) {
      hx $$9 = $$5.a();
      int $$10 = $$2.a(2);
      int $$11 = 1;
      int $$12 = 0;

      for (int $$13 = $$8; $$13 >= -$$6; $$13--) {
         this.a($$0, $$1, $$2, $$3, $$9, $$10, $$13, $$5.c());
         if ($$10 >= $$11) {
            $$10 = $$12;
            $$12 = 1;
            $$11 = Math.min($$11 + 1, $$7 + $$5.b());
         } else {
            $$10++;
         }
      }
   }

   @Override
   public int a(auu $$0, int $$1, dut $$2) {
      return Math.max(4, $$1 - this.b.a($$0));
   }

   @Override
   protected boolean a(auu $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
