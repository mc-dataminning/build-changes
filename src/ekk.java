import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ekk extends ekf {
   public static final MapCodec<ekk> a = RecordCodecBuilder.mapCodec(
      $$0 -> b($$0)
            .and(
               $$0.group(
                  bsf.b(1, 512).fieldOf("foliage_height").forGetter($$0x -> $$0x.b),
                  Codec.intRange(0, 256).fieldOf("leaf_placement_attempts").forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, ekk::new)
   );
   private final bsf b;
   private final int c;

   public ekk(bsf $$0, bsf $$1, bsf $$2, int $$3) {
      super($$0, $$1);
      this.b = $$2;
      this.c = $$3;
   }

   @Override
   protected ekg<?> a() {
      return ekg.j;
   }

   @Override
   protected void a(dhf $$0, ekf.b $$1, bac $$2, ejp $$3, int $$4, ekf.a $$5, int $$6, int $$7, int $$8) {
      jh $$9 = $$5.a();
      jh.a $$10 = $$9.k();

      for (int $$11 = 0; $$11 < this.c; $$11++) {
         $$10.a($$9, $$2.a($$7) - $$2.a($$7), $$2.a($$6) - $$2.a($$6), $$2.a($$7) - $$2.a($$7));
         a($$0, $$1, $$2, $$3, $$10);
      }
   }

   @Override
   public int a(bac $$0, int $$1, ejp $$2) {
      return this.b.a($$0);
   }

   @Override
   protected boolean a(bac $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return false;
   }
}
