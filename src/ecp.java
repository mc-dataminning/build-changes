import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecp extends eck {
   public static final Codec<ecp> a = RecordCodecBuilder.create(
      $$0 -> b($$0)
            .and(
               $$0.group(
                  bnv.b(1, 512).fieldOf("foliage_height").forGetter($$0x -> $$0x.b),
                  Codec.intRange(0, 256).fieldOf("leaf_placement_attempts").forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, ecp::new)
   );
   private final bnv b;
   private final int c;

   public ecp(bnv $$0, bnv $$1, bnv $$2, int $$3) {
      super($$0, $$1);
      this.b = $$2;
      this.c = $$3;
   }

   @Override
   protected ecl<?> a() {
      return ecl.j;
   }

   @Override
   protected void a(daa $$0, eck.b $$1, ayd $$2, ebu $$3, int $$4, eck.a $$5, int $$6, int $$7, int $$8) {
      im $$9 = $$5.a();
      im.a $$10 = $$9.j();

      for (int $$11 = 0; $$11 < this.c; $$11++) {
         $$10.a($$9, $$2.a($$7) - $$2.a($$7), $$2.a($$6) - $$2.a($$6), $$2.a($$7) - $$2.a($$7));
         a($$0, $$1, $$2, $$3, $$10);
      }
   }

   @Override
   public int a(ayd $$0, int $$1, ebu $$2) {
      return this.b.a($$0);
   }

   @Override
   protected boolean a(ayd $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return false;
   }
}
