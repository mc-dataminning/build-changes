import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ekq extends ekk {
   public static final MapCodec<ekq> a = RecordCodecBuilder.mapCodec(
      $$0 -> b($$0).and(bsd.b(0, 24).fieldOf("trunk_height").forGetter($$0x -> $$0x.b)).apply($$0, ekq::new)
   );
   private final bsd b;

   public ekq(bsd $$0, bsd $$1, bsd $$2) {
      super($$0, $$1);
      this.b = $$2;
   }

   @Override
   protected ekl<?> a() {
      return ekl.b;
   }

   @Override
   protected void a(dhf $$0, ekk.b $$1, azh $$2, eju $$3, int $$4, ekk.a $$5, int $$6, int $$7, int $$8) {
      ji $$9 = $$5.a();
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
   public int a(azh $$0, int $$1, eju $$2) {
      return Math.max(4, $$1 - this.b.a($$0));
   }

   @Override
   protected boolean a(azh $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
