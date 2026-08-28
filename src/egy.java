import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egy extends egs {
   public static final MapCodec<egy> a = RecordCodecBuilder.mapCodec(
      $$0 -> b($$0).and(bqp.b(0, 24).fieldOf("trunk_height").forGetter($$0x -> $$0x.b)).apply($$0, egy::new)
   );
   private final bqp b;

   public egy(bqp $$0, bqp $$1, bqp $$2) {
      super($$0, $$1);
      this.b = $$2;
   }

   @Override
   protected egt<?> a() {
      return egt.b;
   }

   @Override
   protected void a(ddy $$0, egs.b $$1, azk $$2, egc $$3, int $$4, egs.a $$5, int $$6, int $$7, int $$8) {
      je $$9 = $$5.a();
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
   public int a(azk $$0, int $$1, egc $$2) {
      return Math.max(4, $$1 - this.b.a($$0));
   }

   @Override
   protected boolean a(azk $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
