import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzn extends dzi {
   public static final Codec<dzn> a = RecordCodecBuilder.create(
      $$0 -> b($$0)
            .and(
               $$0.group(
                  bmi.b(1, 512).fieldOf("foliage_height").forGetter($$0x -> $$0x.b),
                  Codec.intRange(0, 256).fieldOf("leaf_placement_attempts").forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, dzn::new)
   );
   private final bmi b;
   private final int c;

   public dzn(bmi $$0, bmi $$1, bmi $$2, int $$3) {
      super($$0, $$1);
      this.b = $$2;
      this.c = $$3;
   }

   @Override
   protected dzj<?> a() {
      return dzj.j;
   }

   @Override
   protected void a(cxh $$0, dzi.b $$1, axd $$2, dys $$3, int $$4, dzi.a $$5, int $$6, int $$7, int $$8) {
      ib $$9 = $$5.a();
      ib.a $$10 = $$9.j();

      for (int $$11 = 0; $$11 < this.c; $$11++) {
         $$10.a($$9, $$2.a($$7) - $$2.a($$7), $$2.a($$6) - $$2.a($$6), $$2.a($$7) - $$2.a($$7));
         a($$0, $$1, $$2, $$3, $$10);
      }
   }

   @Override
   public int a(axd $$0, int $$1, dys $$2) {
      return this.b.a($$0);
   }

   @Override
   protected boolean a(axd $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return false;
   }
}
