import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtw extends dtq {
   public static final Codec<dtw> a = RecordCodecBuilder.create(
      $$0 -> b($$0).and(big.b(0, 24).fieldOf("trunk_height").forGetter($$0x -> $$0x.b)).apply($$0, dtw::new)
   );
   private final big b;

   public dtw(big $$0, big $$1, big $$2) {
      super($$0, $$1);
      this.b = $$2;
   }

   @Override
   protected dtr<?> a() {
      return dtr.b;
   }

   @Override
   protected void a(csl $$0, dtq.b $$1, atw $$2, dta $$3, int $$4, dtq.a $$5, int $$6, int $$7, int $$8) {
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
   public int a(atw $$0, int $$1, dta $$2) {
      return Math.max(4, $$1 - this.b.a($$0));
   }

   @Override
   protected boolean a(atw $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
