import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edu extends edp {
   public static final MapCodec<edu> a = RecordCodecBuilder.mapCodec(
      $$0 -> b($$0)
            .and(
               $$0.group(
                  bpb.b(1, 512).fieldOf("foliage_height").forGetter($$0x -> $$0x.b),
                  Codec.intRange(0, 256).fieldOf("leaf_placement_attempts").forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, edu::new)
   );
   private final bpb b;
   private final int c;

   public edu(bpb $$0, bpb $$1, bpb $$2, int $$3) {
      super($$0, $$1);
      this.b = $$2;
      this.c = $$3;
   }

   @Override
   protected edq<?> a() {
      return edq.j;
   }

   @Override
   protected void a(dbf $$0, edp.b $$1, aym $$2, ecz $$3, int $$4, edp.a $$5, int $$6, int $$7, int $$8) {
      io $$9 = $$5.a();
      io.a $$10 = $$9.j();

      for (int $$11 = 0; $$11 < this.c; $$11++) {
         $$10.a($$9, $$2.a($$7) - $$2.a($$7), $$2.a($$6) - $$2.a($$6), $$2.a($$7) - $$2.a($$7));
         a($$0, $$1, $$2, $$3, $$10);
      }
   }

   @Override
   public int a(aym $$0, int $$1, ecz $$2) {
      return this.b.a($$0);
   }

   @Override
   protected boolean a(aym $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return false;
   }
}
