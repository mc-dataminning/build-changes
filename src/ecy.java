import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecy extends ect {
   public static final Codec<ecy> a = RecordCodecBuilder.create(
      $$0 -> b($$0)
            .and(
               $$0.group(
                  bor.b(1, 512).fieldOf("foliage_height").forGetter($$0x -> $$0x.b),
                  Codec.intRange(0, 256).fieldOf("leaf_placement_attempts").forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, ecy::new)
   );
   private final bor b;
   private final int c;

   public ecy(bor $$0, bor $$1, bor $$2, int $$3) {
      super($$0, $$1);
      this.b = $$2;
      this.c = $$3;
   }

   @Override
   protected ecu<?> a() {
      return ecu.j;
   }

   @Override
   protected void a(daj $$0, ect.b $$1, ayg $$2, ecd $$3, int $$4, ect.a $$5, int $$6, int $$7, int $$8) {
      in $$9 = $$5.a();
      in.a $$10 = $$9.j();

      for (int $$11 = 0; $$11 < this.c; $$11++) {
         $$10.a($$9, $$2.a($$7) - $$2.a($$7), $$2.a($$6) - $$2.a($$6), $$2.a($$7) - $$2.a($$7));
         a($$0, $$1, $$2, $$3, $$10);
      }
   }

   @Override
   public int a(ayg $$0, int $$1, ecd $$2) {
      return this.b.a($$0);
   }

   @Override
   protected boolean a(ayg $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return false;
   }
}
