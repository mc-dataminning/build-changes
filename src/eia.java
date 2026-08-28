import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eia extends ehv {
   public static final MapCodec<eia> a = RecordCodecBuilder.mapCodec(
      $$0 -> b($$0)
            .and(
               $$0.group(
                  brd.b(1, 512).fieldOf("foliage_height").forGetter($$0x -> $$0x.b),
                  Codec.intRange(0, 256).fieldOf("leaf_placement_attempts").forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, eia::new)
   );
   private final brd b;
   private final int c;

   public eia(brd $$0, brd $$1, brd $$2, int $$3) {
      super($$0, $$1);
      this.b = $$2;
      this.c = $$3;
   }

   @Override
   protected ehw<?> a() {
      return ehw.j;
   }

   @Override
   protected void a(dfb $$0, ehv.b $$1, azr $$2, ehf $$3, int $$4, ehv.a $$5, int $$6, int $$7, int $$8) {
      jg $$9 = $$5.a();
      jg.a $$10 = $$9.k();

      for (int $$11 = 0; $$11 < this.c; $$11++) {
         $$10.a($$9, $$2.a($$7) - $$2.a($$7), $$2.a($$6) - $$2.a($$6), $$2.a($$7) - $$2.a($$7));
         a($$0, $$1, $$2, $$3, $$10);
      }
   }

   @Override
   public int a(azr $$0, int $$1, ehf $$2) {
      return this.b.a($$0);
   }

   @Override
   protected boolean a(azr $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return false;
   }
}
