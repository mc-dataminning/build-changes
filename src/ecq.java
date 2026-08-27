import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecq extends eck {
   public static final Codec<ecq> a = RecordCodecBuilder.create(
      $$0 -> b($$0).and(bnv.b(0, 24).fieldOf("trunk_height").forGetter($$0x -> $$0x.b)).apply($$0, ecq::new)
   );
   private final bnv b;

   public ecq(bnv $$0, bnv $$1, bnv $$2) {
      super($$0, $$1);
      this.b = $$2;
   }

   @Override
   protected ecl<?> a() {
      return ecl.b;
   }

   @Override
   protected void a(daa $$0, eck.b $$1, ayd $$2, ebu $$3, int $$4, eck.a $$5, int $$6, int $$7, int $$8) {
      im $$9 = $$5.a();
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
   public int a(ayd $$0, int $$1, ebu $$2) {
      return Math.max(4, $$1 - this.b.a($$0));
   }

   @Override
   protected boolean a(ayd $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
