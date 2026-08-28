import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eno extends enj {
   public static final MapCodec<eno> a = RecordCodecBuilder.mapCodec(
      $$0 -> b($$0)
            .and(
               $$0.group(
                  btl.b(1, 512).fieldOf("foliage_height").forGetter($$0x -> $$0x.b),
                  Codec.intRange(0, 256).fieldOf("leaf_placement_attempts").forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, eno::new)
   );
   private final btl b;
   private final int c;

   public eno(btl $$0, btl $$1, btl $$2, int $$3) {
      super($$0, $$1);
      this.b = $$2;
      this.c = $$3;
   }

   @Override
   protected enk<?> a() {
      return enk.j;
   }

   @Override
   protected void a(djn $$0, enj.b $$1, azv $$2, emt $$3, int $$4, enj.a $$5, int $$6, int $$7, int $$8) {
      iv $$9 = $$5.a();
      iv.a $$10 = $$9.k();

      for (int $$11 = 0; $$11 < this.c; $$11++) {
         $$10.a($$9, $$2.a($$7) - $$2.a($$7), $$2.a($$6) - $$2.a($$6), $$2.a($$7) - $$2.a($$7));
         a($$0, $$1, $$2, $$3, $$10);
      }
   }

   @Override
   public int a(azv $$0, int $$1, emt $$2) {
      return this.b.a($$0);
   }

   @Override
   protected boolean a(azv $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return false;
   }
}
