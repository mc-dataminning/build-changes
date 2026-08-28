import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eih extends eib {
   public static final MapCodec<eih> a = RecordCodecBuilder.mapCodec(
      $$0 -> b($$0).and(bri.b(0, 24).fieldOf("trunk_height").forGetter($$0x -> $$0x.b)).apply($$0, eih::new)
   );
   private final bri b;

   public eih(bri $$0, bri $$1, bri $$2) {
      super($$0, $$1);
      this.b = $$2;
   }

   @Override
   protected eic<?> a() {
      return eic.b;
   }

   @Override
   protected void a(dfh $$0, eib.b $$1, azs $$2, ehl $$3, int $$4, eib.a $$5, int $$6, int $$7, int $$8) {
      jh $$9 = $$5.a();
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
   public int a(azs $$0, int $$1, ehl $$2) {
      return Math.max(4, $$1 - this.b.a($$0));
   }

   @Override
   protected boolean a(azs $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
