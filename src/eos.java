import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eos extends eon {
   public static final MapCodec<eos> a = RecordCodecBuilder.mapCodec(
      $$0 -> b($$0)
            .and(
               $$0.group(
                  buh.b(1, 512).fieldOf("foliage_height").forGetter($$0x -> $$0x.b),
                  Codec.intRange(0, 256).fieldOf("leaf_placement_attempts").forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, eos::new)
   );
   private final buh b;
   private final int c;

   public eos(buh $$0, buh $$1, buh $$2, int $$3) {
      super($$0, $$1);
      this.b = $$2;
      this.c = $$3;
   }

   @Override
   protected eoo<?> a() {
      return eoo.j;
   }

   @Override
   protected void a(dkp $$0, eon.b $$1, bai $$2, enx $$3, int $$4, eon.a $$5, int $$6, int $$7, int $$8) {
      iw $$9 = $$5.a();
      iw.a $$10 = $$9.k();

      for (int $$11 = 0; $$11 < this.c; $$11++) {
         $$10.a($$9, $$2.a($$7) - $$2.a($$7), $$2.a($$6) - $$2.a($$6), $$2.a($$7) - $$2.a($$7));
         a($$0, $$1, $$2, $$3, $$10);
      }
   }

   @Override
   public int a(bai $$0, int $$1, enx $$2) {
      return this.b.a($$0);
   }

   @Override
   protected boolean a(bai $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return false;
   }
}
