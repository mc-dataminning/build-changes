import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxo extends dxi {
   public static final Codec<dxo> a = RecordCodecBuilder.create(
      $$0 -> b($$0).and(bkz.b(0, 24).fieldOf("trunk_height").forGetter($$0x -> $$0x.b)).apply($$0, dxo::new)
   );
   private final bkz b;

   public dxo(bkz $$0, bkz $$1, bkz $$2) {
      super($$0, $$1);
      this.b = $$2;
   }

   @Override
   protected dxj<?> a() {
      return dxj.b;
   }

   @Override
   protected void a(cvt $$0, dxi.b $$1, awo $$2, dws $$3, int $$4, dxi.a $$5, int $$6, int $$7, int $$8) {
      hz $$9 = $$5.a();
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
   public int a(awo $$0, int $$1, dws $$2) {
      return Math.max(4, $$1 - this.b.a($$0));
   }

   @Override
   protected boolean a(awo $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
