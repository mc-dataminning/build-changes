import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drr extends drm {
   public static final Codec<drr> a = RecordCodecBuilder.create(
      $$0 -> b($$0)
            .and(
               $$0.group(
                  bgd.b(1, 512).fieldOf("foliage_height").forGetter($$0x -> $$0x.b),
                  Codec.intRange(0, 256).fieldOf("leaf_placement_attempts").forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, drr::new)
   );
   private final bgd b;
   private final int c;

   public drr(bgd $$0, bgd $$1, bgd $$2, int $$3) {
      super($$0, $$1);
      this.b = $$2;
      this.c = $$3;
   }

   @Override
   protected drn<?> a() {
      return drn.j;
   }

   @Override
   protected void a(cqb $$0, drm.b $$1, asc $$2, dqw $$3, int $$4, drm.a $$5, int $$6, int $$7, int $$8) {
      gw $$9 = $$5.a();
      gw.a $$10 = $$9.j();

      for (int $$11 = 0; $$11 < this.c; $$11++) {
         $$10.a($$9, $$2.a($$7) - $$2.a($$7), $$2.a($$6) - $$2.a($$6), $$2.a($$7) - $$2.a($$7));
         a($$0, $$1, $$2, $$3, $$10);
      }
   }

   @Override
   public int a(asc $$0, int $$1, dqw $$2) {
      return this.b.a($$0);
   }

   @Override
   protected boolean a(asc $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return false;
   }
}
