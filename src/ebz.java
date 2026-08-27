import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebz extends ebu {
   public static final Codec<ebz> a = RecordCodecBuilder.create(
      $$0 -> b($$0)
            .and(
               $$0.group(
                  bnk.b(1, 512).fieldOf("foliage_height").forGetter($$0x -> $$0x.b),
                  Codec.intRange(0, 256).fieldOf("leaf_placement_attempts").forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, ebz::new)
   );
   private final bnk b;
   private final int c;

   public ebz(bnk $$0, bnk $$1, bnk $$2, int $$3) {
      super($$0, $$1);
      this.b = $$2;
      this.c = $$3;
   }

   @Override
   protected ebv<?> a() {
      return ebv.j;
   }

   @Override
   protected void a(czm $$0, ebu.b $$1, axt $$2, ebe $$3, int $$4, ebu.a $$5, int $$6, int $$7, int $$8) {
      id $$9 = $$5.a();
      id.a $$10 = $$9.j();

      for (int $$11 = 0; $$11 < this.c; $$11++) {
         $$10.a($$9, $$2.a($$7) - $$2.a($$7), $$2.a($$6) - $$2.a($$6), $$2.a($$7) - $$2.a($$7));
         a($$0, $$1, $$2, $$3, $$10);
      }
   }

   @Override
   public int a(axt $$0, int $$1, ebe $$2) {
      return this.b.a($$0);
   }

   @Override
   protected boolean a(axt $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return false;
   }
}
