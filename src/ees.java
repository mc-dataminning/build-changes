import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ees extends een {
   public static final MapCodec<ees> a = RecordCodecBuilder.mapCodec(
      $$0 -> b($$0)
            .and(
               $$0.group(
                  bpy.b(1, 512).fieldOf("foliage_height").forGetter($$0x -> $$0x.b),
                  Codec.intRange(0, 256).fieldOf("leaf_placement_attempts").forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, ees::new)
   );
   private final bpy b;
   private final int c;

   public ees(bpy $$0, bpy $$1, bpy $$2, int $$3) {
      super($$0, $$1);
      this.b = $$2;
      this.c = $$3;
   }

   @Override
   protected eeo<?> a() {
      return eeo.j;
   }

   @Override
   protected void a(dcd $$0, een.b $$1, azg $$2, edx $$3, int $$4, een.a $$5, int $$6, int $$7, int $$8) {
      iz $$9 = $$5.a();
      iz.a $$10 = $$9.j();

      for (int $$11 = 0; $$11 < this.c; $$11++) {
         $$10.a($$9, $$2.a($$7) - $$2.a($$7), $$2.a($$6) - $$2.a($$6), $$2.a($$7) - $$2.a($$7));
         a($$0, $$1, $$2, $$3, $$10);
      }
   }

   @Override
   public int a(azg $$0, int $$1, edx $$2) {
      return this.b.a($$0);
   }

   @Override
   protected boolean a(azg $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return false;
   }
}
