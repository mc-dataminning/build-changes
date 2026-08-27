import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsj extends dse {
   public static final Codec<dsj> a = RecordCodecBuilder.create(
      $$0 -> b($$0)
            .and(
               $$0.group(
                  bhg.b(1, 512).fieldOf("foliage_height").forGetter($$0x -> $$0x.b),
                  Codec.intRange(0, 256).fieldOf("leaf_placement_attempts").forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, dsj::new)
   );
   private final bhg b;
   private final int c;

   public dsj(bhg $$0, bhg $$1, bhg $$2, int $$3) {
      super($$0, $$1);
      this.b = $$2;
      this.c = $$3;
   }

   @Override
   protected dsf<?> a() {
      return dsf.j;
   }

   @Override
   protected void a(crf $$0, dse.b $$1, ate $$2, dro $$3, int $$4, dse.a $$5, int $$6, int $$7, int $$8) {
      ht $$9 = $$5.a();
      ht.a $$10 = $$9.j();

      for (int $$11 = 0; $$11 < this.c; $$11++) {
         $$10.a($$9, $$2.a($$7) - $$2.a($$7), $$2.a($$6) - $$2.a($$6), $$2.a($$7) - $$2.a($$7));
         a($$0, $$1, $$2, $$3, $$10);
      }
   }

   @Override
   public int a(ate $$0, int $$1, dro $$2) {
      return this.b.a($$0);
   }

   @Override
   protected boolean a(ate $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return false;
   }
}
