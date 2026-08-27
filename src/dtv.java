import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtv extends dtq {
   public static final Codec<dtv> a = RecordCodecBuilder.create(
      $$0 -> b($$0)
            .and(
               $$0.group(
                  big.b(1, 512).fieldOf("foliage_height").forGetter($$0x -> $$0x.b),
                  Codec.intRange(0, 256).fieldOf("leaf_placement_attempts").forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, dtv::new)
   );
   private final big b;
   private final int c;

   public dtv(big $$0, big $$1, big $$2, int $$3) {
      super($$0, $$1);
      this.b = $$2;
      this.c = $$3;
   }

   @Override
   protected dtr<?> a() {
      return dtr.j;
   }

   @Override
   protected void a(csl $$0, dtq.b $$1, atw $$2, dta $$3, int $$4, dtq.a $$5, int $$6, int $$7, int $$8) {
      hx $$9 = $$5.a();
      hx.a $$10 = $$9.j();

      for (int $$11 = 0; $$11 < this.c; $$11++) {
         $$10.a($$9, $$2.a($$7) - $$2.a($$7), $$2.a($$6) - $$2.a($$6), $$2.a($$7) - $$2.a($$7));
         a($$0, $$1, $$2, $$3, $$10);
      }
   }

   @Override
   public int a(atw $$0, int $$1, dta $$2) {
      return this.b.a($$0);
   }

   @Override
   protected boolean a(atw $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return false;
   }
}
