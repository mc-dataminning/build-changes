import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eko extends ekk {
   public static final MapCodec<eko> a = RecordCodecBuilder.mapCodec(
      $$0 -> b($$0).and(bsd.b(0, 24).fieldOf("height").forGetter($$0x -> $$0x.b)).apply($$0, eko::new)
   );
   private final bsd b;

   public eko(bsd $$0, bsd $$1, bsd $$2) {
      super($$0, $$1);
      this.b = $$2;
   }

   @Override
   protected ekl<?> a() {
      return ekl.c;
   }

   @Override
   protected void a(dhf $$0, ekk.b $$1, azh $$2, eju $$3, int $$4, ekk.a $$5, int $$6, int $$7, int $$8) {
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
   public int a(azh $$0, int $$1) {
      return super.a($$0, $$1) + $$0.a(Math.max($$1 + 1, 1));
   }

   @Override
   public int a(azh $$0, int $$1, eju $$2) {
      return this.b.a($$0);
   }

   @Override
   protected boolean a(azh $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
