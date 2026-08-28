import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eog extends eob {
   public static final MapCodec<eog> a = RecordCodecBuilder.mapCodec(
      $$0 -> b($$0)
            .and(
               $$0.group(
                  btw.b(1, 512).fieldOf("foliage_height").forGetter($$0x -> $$0x.b),
                  Codec.intRange(0, 256).fieldOf("leaf_placement_attempts").forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, eog::new)
   );
   private final btw b;
   private final int c;

   public eog(btw $$0, btw $$1, btw $$2, int $$3) {
      super($$0, $$1);
      this.b = $$2;
      this.c = $$3;
   }

   @Override
   protected eoc<?> a() {
      return eoc.j;
   }

   @Override
   protected void a(dkd $$0, eob.b $$1, azx $$2, enl $$3, int $$4, eob.a $$5, int $$6, int $$7, int $$8) {
      iv $$9 = $$5.a();
      iv.a $$10 = $$9.k();

      for (int $$11 = 0; $$11 < this.c; $$11++) {
         $$10.a($$9, $$2.a($$7) - $$2.a($$7), $$2.a($$6) - $$2.a($$6), $$2.a($$7) - $$2.a($$7));
         a($$0, $$1, $$2, $$3, $$10);
      }
   }

   @Override
   public int a(azx $$0, int $$1, enl $$2) {
      return this.b.a($$0);
   }

   @Override
   protected boolean a(azx $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return false;
   }
}
