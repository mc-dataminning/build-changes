import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxu extends dxp {
   public static final Codec<dxu> a = RecordCodecBuilder.create(
      $$0 -> b($$0)
            .and(
               $$0.group(
                  blb.b(1, 512).fieldOf("foliage_height").forGetter($$0x -> $$0x.b),
                  Codec.intRange(0, 256).fieldOf("leaf_placement_attempts").forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, dxu::new)
   );
   private final blb b;
   private final int c;

   public dxu(blb $$0, blb $$1, blb $$2, int $$3) {
      super($$0, $$1);
      this.b = $$2;
      this.c = $$3;
   }

   @Override
   protected dxq<?> a() {
      return dxq.j;
   }

   @Override
   protected void a(cvx $$0, dxp.b $$1, awp $$2, dwz $$3, int $$4, dxp.a $$5, int $$6, int $$7, int $$8) {
      hz $$9 = $$5.a();
      hz.a $$10 = $$9.j();

      for (int $$11 = 0; $$11 < this.c; $$11++) {
         $$10.a($$9, $$2.a($$7) - $$2.a($$7), $$2.a($$6) - $$2.a($$6), $$2.a($$7) - $$2.a($$7));
         a($$0, $$1, $$2, $$3, $$10);
      }
   }

   @Override
   public int a(awp $$0, int $$1, dwz $$2) {
      return this.b.a($$0);
   }

   @Override
   protected boolean a(awp $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return false;
   }
}
