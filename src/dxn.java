import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxn extends dxi {
   public static final Codec<dxn> a = RecordCodecBuilder.create(
      $$0 -> b($$0)
            .and(
               $$0.group(
                  bkz.b(1, 512).fieldOf("foliage_height").forGetter($$0x -> $$0x.b),
                  Codec.intRange(0, 256).fieldOf("leaf_placement_attempts").forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, dxn::new)
   );
   private final bkz b;
   private final int c;

   public dxn(bkz $$0, bkz $$1, bkz $$2, int $$3) {
      super($$0, $$1);
      this.b = $$2;
      this.c = $$3;
   }

   @Override
   protected dxj<?> a() {
      return dxj.j;
   }

   @Override
   protected void a(cvt $$0, dxi.b $$1, awo $$2, dws $$3, int $$4, dxi.a $$5, int $$6, int $$7, int $$8) {
      hz $$9 = $$5.a();
      hz.a $$10 = $$9.j();

      for (int $$11 = 0; $$11 < this.c; $$11++) {
         $$10.a($$9, $$2.a($$7) - $$2.a($$7), $$2.a($$6) - $$2.a($$6), $$2.a($$7) - $$2.a($$7));
         a($$0, $$1, $$2, $$3, $$10);
      }
   }

   @Override
   public int a(awo $$0, int $$1, dws $$2) {
      return this.b.a($$0);
   }

   @Override
   protected boolean a(awo $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return false;
   }
}
