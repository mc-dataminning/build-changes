import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvn extends dvj {
   public static final Codec<dvn> a = RecordCodecBuilder.create(
      $$0 -> b($$0).and(bjf.b(0, 24).fieldOf("height").forGetter($$0x -> $$0x.b)).apply($$0, dvn::new)
   );
   private final bjf b;

   public dvn(bjf $$0, bjf $$1, bjf $$2) {
      super($$0, $$1);
      this.b = $$2;
   }

   @Override
   protected dvk<?> a() {
      return dvk.c;
   }

   @Override
   protected void a(ctu $$0, dvj.b $$1, auu $$2, dut $$3, int $$4, dvj.a $$5, int $$6, int $$7, int $$8) {
      int $$9 = 0;

      for (int $$10 = $$8; $$10 >= $$8 - $$6; $$10--) {
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$9, $$10, $$5.c());
         if ($$9 >= 1 && $$10 == $$8 - $$6 + 1) {
            $$9--;
         } else if ($$9 < $$7 + $$5.b()) {
            $$9++;
         }
      }
   }

   @Override
   public int a(auu $$0, int $$1) {
      return super.a($$0, $$1) + $$0.a(Math.max($$1 + 1, 1));
   }

   @Override
   public int a(auu $$0, int $$1, dut $$2) {
      return this.b.a($$0);
   }

   @Override
   protected boolean a(auu $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
