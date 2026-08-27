import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvi extends dvd {
   public static final Codec<dvi> a = RecordCodecBuilder.create(
      $$0 -> b($$0)
            .and(
               $$0.group(
                  bja.b(1, 512).fieldOf("foliage_height").forGetter($$0x -> $$0x.b),
                  Codec.intRange(0, 256).fieldOf("leaf_placement_attempts").forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, dvi::new)
   );
   private final bja b;
   private final int c;

   public dvi(bja $$0, bja $$1, bja $$2, int $$3) {
      super($$0, $$1);
      this.b = $$2;
      this.c = $$3;
   }

   @Override
   protected dve<?> a() {
      return dve.j;
   }

   @Override
   protected void a(cto $$0, dvd.b $$1, aup $$2, dun $$3, int $$4, dvd.a $$5, int $$6, int $$7, int $$8) {
      hx $$9 = $$5.a();
      hx.a $$10 = $$9.j();

      for (int $$11 = 0; $$11 < this.c; $$11++) {
         $$10.a($$9, $$2.a($$7) - $$2.a($$7), $$2.a($$6) - $$2.a($$6), $$2.a($$7) - $$2.a($$7));
         a($$0, $$1, $$2, $$3, $$10);
      }
   }

   @Override
   public int a(aup $$0, int $$1, dun $$2) {
      return this.b.a($$0);
   }

   @Override
   protected boolean a(aup $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return false;
   }
}
