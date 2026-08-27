import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvx extends dvs {
   public static final Codec<dvx> a = RecordCodecBuilder.create(
      $$0 -> b($$0)
            .and(
               $$0.group(
                  bjh.b(1, 512).fieldOf("foliage_height").forGetter($$0x -> $$0x.b),
                  Codec.intRange(0, 256).fieldOf("leaf_placement_attempts").forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, dvx::new)
   );
   private final bjh b;
   private final int c;

   public dvx(bjh $$0, bjh $$1, bjh $$2, int $$3) {
      super($$0, $$1);
      this.b = $$2;
      this.c = $$3;
   }

   @Override
   protected dvt<?> a() {
      return dvt.j;
   }

   @Override
   protected void a(cud $$0, dvs.b $$1, auw $$2, dvc $$3, int $$4, dvs.a $$5, int $$6, int $$7, int $$8) {
      hx $$9 = $$5.a();
      hx.a $$10 = $$9.j();

      for (int $$11 = 0; $$11 < this.c; $$11++) {
         $$10.a($$9, $$2.a($$7) - $$2.a($$7), $$2.a($$6) - $$2.a($$6), $$2.a($$7) - $$2.a($$7));
         a($$0, $$1, $$2, $$3, $$10);
      }
   }

   @Override
   public int a(auw $$0, int $$1, dvc $$2) {
      return this.b.a($$0);
   }

   @Override
   protected boolean a(auw $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return false;
   }
}
