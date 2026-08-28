import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eeo extends eem {
   public static final MapCodec<eeo> a = RecordCodecBuilder.mapCodec(
      $$0 -> b($$0).and(Codec.intRange(0, 16).fieldOf("height").forGetter($$0x -> $$0x.b)).apply($$0, eeo::new)
   );
   protected final int b;

   public eeo(bpx $$0, bpx $$1, int $$2) {
      super($$0, $$1);
      this.b = $$2;
   }

   @Override
   protected een<?> a() {
      return een.g;
   }

   @Override
   protected void a(dcc $$0, eem.b $$1, azf $$2, edw $$3, int $$4, eem.a $$5, int $$6, int $$7, int $$8) {
      int $$9 = $$5.c() ? $$6 : 1 + $$2.a(2);

      for (int $$10 = $$8; $$10 >= $$8 - $$9; $$10--) {
         int $$11 = $$7 + $$5.b() + 1 - $$10;
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$11, $$10, $$5.c());
      }
   }

   @Override
   public int a(azf $$0, int $$1, edw $$2) {
      return this.b;
   }

   @Override
   protected boolean a(azf $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 + $$3 >= 7 ? true : $$1 * $$1 + $$3 * $$3 > $$4 * $$4;
   }
}
