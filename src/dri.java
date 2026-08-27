import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dri extends drd {
   public static final Codec<dri> a = RecordCodecBuilder.create(
      $$0 -> b($$0)
            .and(
               $$0.group(
                  bfv.b(1, 512).fieldOf("foliage_height").forGetter($$0x -> $$0x.b),
                  Codec.intRange(0, 256).fieldOf("leaf_placement_attempts").forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, dri::new)
   );
   private final bfv b;
   private final int c;

   public dri(bfv $$0, bfv $$1, bfv $$2, int $$3) {
      super($$0, $$1);
      this.b = $$2;
      this.c = $$3;
   }

   @Override
   protected dre<?> a() {
      return dre.j;
   }

   @Override
   protected void a(cps $$0, drd.b $$1, aru $$2, dqn $$3, int $$4, drd.a $$5, int $$6, int $$7, int $$8) {
      gu $$9 = $$5.a();
      gu.a $$10 = $$9.j();

      for (int $$11 = 0; $$11 < this.c; $$11++) {
         $$10.a($$9, $$2.a($$7) - $$2.a($$7), $$2.a($$6) - $$2.a($$6), $$2.a($$7) - $$2.a($$7));
         a($$0, $$1, $$2, $$3, $$10);
      }
   }

   @Override
   public int a(aru $$0, int $$1, dqn $$2) {
      return this.b.a($$0);
   }

   @Override
   protected boolean a(aru $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return false;
   }
}
