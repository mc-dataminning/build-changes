import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emo extends emj {
   public static final MapCodec<emo> a = RecordCodecBuilder.mapCodec(
      $$0 -> b($$0)
            .and(
               $$0.group(
                  btd.b(1, 512).fieldOf("foliage_height").forGetter($$0x -> $$0x.b),
                  Codec.intRange(0, 256).fieldOf("leaf_placement_attempts").forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, emo::new)
   );
   private final btd b;
   private final int c;

   public emo(btd $$0, btd $$1, btd $$2, int $$3) {
      super($$0, $$1);
      this.b = $$2;
      this.c = $$3;
   }

   @Override
   protected emk<?> a() {
      return emk.j;
   }

   @Override
   protected void a(div $$0, emj.b $$1, azt $$2, elt $$3, int $$4, emj.a $$5, int $$6, int $$7, int $$8) {
      iu $$9 = $$5.a();
      iu.a $$10 = $$9.k();

      for (int $$11 = 0; $$11 < this.c; $$11++) {
         $$10.a($$9, $$2.a($$7) - $$2.a($$7), $$2.a($$6) - $$2.a($$6), $$2.a($$7) - $$2.a($$7));
         a($$0, $$1, $$2, $$3, $$10);
      }
   }

   @Override
   public int a(azt $$0, int $$1, elt $$2) {
      return this.b.a($$0);
   }

   @Override
   protected boolean a(azt $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return false;
   }
}
