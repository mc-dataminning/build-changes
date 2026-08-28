import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efg extends efb {
   public static final MapCodec<efg> a = RecordCodecBuilder.mapCodec(
      $$0 -> b($$0)
            .and(
               $$0.group(
                  bpm.b(1, 512).fieldOf("foliage_height").forGetter($$0x -> $$0x.b),
                  Codec.intRange(0, 256).fieldOf("leaf_placement_attempts").forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, efg::new)
   );
   private final bpm b;
   private final int c;

   public efg(bpm $$0, bpm $$1, bpm $$2, int $$3) {
      super($$0, $$1);
      this.b = $$2;
      this.c = $$3;
   }

   @Override
   protected efc<?> a() {
      return efc.j;
   }

   @Override
   protected void a(dcm $$0, efb.b $$1, ayo $$2, eel $$3, int $$4, efb.a $$5, int $$6, int $$7, int $$8) {
      ja $$9 = $$5.a();
      ja.a $$10 = $$9.j();

      for (int $$11 = 0; $$11 < this.c; $$11++) {
         $$10.a($$9, $$2.a($$7) - $$2.a($$7), $$2.a($$6) - $$2.a($$6), $$2.a($$7) - $$2.a($$7));
         a($$0, $$1, $$2, $$3, $$10);
      }
   }

   @Override
   public int a(ayo $$0, int $$1, eel $$2) {
      return this.b.a($$0);
   }

   @Override
   protected boolean a(ayo $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return false;
   }
}
