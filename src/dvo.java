import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvo extends dvj {
   public static final Codec<dvo> a = RecordCodecBuilder.create(
      $$0 -> b($$0)
            .and(
               $$0.group(
                  bjf.b(1, 512).fieldOf("foliage_height").forGetter($$0x -> $$0x.b),
                  Codec.intRange(0, 256).fieldOf("leaf_placement_attempts").forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, dvo::new)
   );
   private final bjf b;
   private final int c;

   public dvo(bjf $$0, bjf $$1, bjf $$2, int $$3) {
      super($$0, $$1);
      this.b = $$2;
      this.c = $$3;
   }

   @Override
   protected dvk<?> a() {
      return dvk.j;
   }

   @Override
   protected void a(ctu $$0, dvj.b $$1, auu $$2, dut $$3, int $$4, dvj.a $$5, int $$6, int $$7, int $$8) {
      hx $$9 = $$5.a();
      hx.a $$10 = $$9.j();

      for (int $$11 = 0; $$11 < this.c; $$11++) {
         $$10.a($$9, $$2.a($$7) - $$2.a($$7), $$2.a($$6) - $$2.a($$6), $$2.a($$7) - $$2.a($$7));
         a($$0, $$1, $$2, $$3, $$10);
      }
   }

   @Override
   public int a(auu $$0, int $$1, dut $$2) {
      return this.b.a($$0);
   }

   @Override
   protected boolean a(auu $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return false;
   }
}
