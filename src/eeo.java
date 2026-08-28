import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eeo extends eej {
   public static final MapCodec<eeo> a = RecordCodecBuilder.mapCodec(
      $$0 -> b($$0)
            .and(
               $$0.group(
                  bpu.b(1, 512).fieldOf("foliage_height").forGetter($$0x -> $$0x.b),
                  Codec.intRange(0, 256).fieldOf("leaf_placement_attempts").forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, eeo::new)
   );
   private final bpu b;
   private final int c;

   public eeo(bpu $$0, bpu $$1, bpu $$2, int $$3) {
      super($$0, $$1);
      this.b = $$2;
      this.c = $$3;
   }

   @Override
   protected eek<?> a() {
      return eek.j;
   }

   @Override
   protected void a(dbz $$0, eej.b $$1, azc $$2, edt $$3, int $$4, eej.a $$5, int $$6, int $$7, int $$8) {
      iz $$9 = $$5.a();
      iz.a $$10 = $$9.j();

      for (int $$11 = 0; $$11 < this.c; $$11++) {
         $$10.a($$9, $$2.a($$7) - $$2.a($$7), $$2.a($$6) - $$2.a($$6), $$2.a($$7) - $$2.a($$7));
         a($$0, $$1, $$2, $$3, $$10);
      }
   }

   @Override
   public int a(azc $$0, int $$1, edt $$2) {
      return this.b.a($$0);
   }

   @Override
   protected boolean a(azc $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return false;
   }
}
