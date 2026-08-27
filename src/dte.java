import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dte extends dsz {
   public static final Codec<dte> a = RecordCodecBuilder.create(
      $$0 -> b($$0)
            .and(
               $$0.group(
                  bhv.b(1, 512).fieldOf("foliage_height").forGetter($$0x -> $$0x.b),
                  Codec.intRange(0, 256).fieldOf("leaf_placement_attempts").forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, dte::new)
   );
   private final bhv b;
   private final int c;

   public dte(bhv $$0, bhv $$1, bhv $$2, int $$3) {
      super($$0, $$1);
      this.b = $$2;
      this.c = $$3;
   }

   @Override
   protected dta<?> a() {
      return dta.j;
   }

   @Override
   protected void a(cry $$0, dsz.b $$1, ato $$2, dsj $$3, int $$4, dsz.a $$5, int $$6, int $$7, int $$8) {
      ht $$9 = $$5.a();
      ht.a $$10 = $$9.j();

      for (int $$11 = 0; $$11 < this.c; $$11++) {
         $$10.a($$9, $$2.a($$7) - $$2.a($$7), $$2.a($$6) - $$2.a($$6), $$2.a($$7) - $$2.a($$7));
         a($$0, $$1, $$2, $$3, $$10);
      }
   }

   @Override
   public int a(ato $$0, int $$1, dsj $$2) {
      return this.b.a($$0);
   }

   @Override
   protected boolean a(ato $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return false;
   }
}
