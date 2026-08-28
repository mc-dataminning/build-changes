import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eeu extends eep {
   public static final MapCodec<eeu> a = RecordCodecBuilder.mapCodec(
      $$0 -> b($$0)
            .and(
               $$0.group(
                  bqa.b(1, 512).fieldOf("foliage_height").forGetter($$0x -> $$0x.b),
                  Codec.intRange(0, 256).fieldOf("leaf_placement_attempts").forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, eeu::new)
   );
   private final bqa b;
   private final int c;

   public eeu(bqa $$0, bqa $$1, bqa $$2, int $$3) {
      super($$0, $$1);
      this.b = $$2;
      this.c = $$3;
   }

   @Override
   protected eeq<?> a() {
      return eeq.j;
   }

   @Override
   protected void a(dcf $$0, eep.b $$1, azh $$2, edz $$3, int $$4, eep.a $$5, int $$6, int $$7, int $$8) {
      iz $$9 = $$5.a();
      iz.a $$10 = $$9.j();

      for (int $$11 = 0; $$11 < this.c; $$11++) {
         $$10.a($$9, $$2.a($$7) - $$2.a($$7), $$2.a($$6) - $$2.a($$6), $$2.a($$7) - $$2.a($$7));
         a($$0, $$1, $$2, $$3, $$10);
      }
   }

   @Override
   public int a(azh $$0, int $$1, edz $$2) {
      return this.b.a($$0);
   }

   @Override
   protected boolean a(azh $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return false;
   }
}
