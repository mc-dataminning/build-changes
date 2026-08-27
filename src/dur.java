import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dur extends dun {
   public static final Codec<dur> c = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dur::new));

   public dur(biq $$0, biq $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dut<?> a() {
      return dut.f;
   }

   @Override
   protected void a(cte $$0, dus.b $$1, auf $$2, duc $$3, int $$4, dus.a $$5, int $$6, int $$7, int $$8) {
      for (int $$9 = $$8; $$9 >= $$8 - $$6; $$9--) {
         int $$10 = $$7 + ($$9 != $$8 && $$9 != $$8 - $$6 ? 1 : 0);
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }
   }

   @Override
   protected boolean a(auf $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return aty.k((float)$$1 + 0.5F) + aty.k((float)$$3 + 0.5F) > (float)($$4 * $$4);
   }
}
