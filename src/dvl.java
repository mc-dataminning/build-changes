import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvl extends dvj {
   public static final Codec<dvl> a = RecordCodecBuilder.create(
      $$0 -> b($$0).and(Codec.intRange(0, 16).fieldOf("height").forGetter($$0x -> $$0x.b)).apply($$0, dvl::new)
   );
   protected final int b;

   public dvl(bjf $$0, bjf $$1, int $$2) {
      super($$0, $$1);
      this.b = $$2;
   }

   @Override
   protected dvk<?> a() {
      return dvk.g;
   }

   @Override
   protected void a(ctu $$0, dvj.b $$1, auu $$2, dut $$3, int $$4, dvj.a $$5, int $$6, int $$7, int $$8) {
      int $$9 = $$5.c() ? $$6 : 1 + $$2.a(2);

      for (int $$10 = $$8; $$10 >= $$8 - $$9; $$10--) {
         int $$11 = $$7 + $$5.b() + 1 - $$10;
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$11, $$10, $$5.c());
      }
   }

   @Override
   public int a(auu $$0, int $$1, dut $$2) {
      return this.b;
   }

   @Override
   protected boolean a(auu $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 + $$3 >= 7 ? true : $$1 * $$1 + $$3 * $$3 > $$4 * $$4;
   }
}
