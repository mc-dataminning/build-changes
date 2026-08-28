import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehz extends ehv {
   public static final MapCodec<ehz> a = RecordCodecBuilder.mapCodec(
      $$0 -> b($$0).and(brd.b(0, 24).fieldOf("height").forGetter($$0x -> $$0x.b)).apply($$0, ehz::new)
   );
   private final brd b;

   public ehz(brd $$0, brd $$1, brd $$2) {
      super($$0, $$1);
      this.b = $$2;
   }

   @Override
   protected ehw<?> a() {
      return ehw.c;
   }

   @Override
   protected void a(dfb $$0, ehv.b $$1, azr $$2, ehf $$3, int $$4, ehv.a $$5, int $$6, int $$7, int $$8) {
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
   public int a(azr $$0, int $$1) {
      return super.a($$0, $$1) + $$0.a(Math.max($$1 + 1, 1));
   }

   @Override
   public int a(azr $$0, int $$1, ehf $$2) {
      return this.b.a($$0);
   }

   @Override
   protected boolean a(azr $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
