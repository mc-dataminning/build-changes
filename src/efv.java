import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efv extends efq {
   public static final MapCodec<efv> a = RecordCodecBuilder.mapCodec(
      $$0 -> b($$0)
            .and(
               $$0.group(
                  bpv.b(1, 512).fieldOf("foliage_height").forGetter($$0x -> $$0x.b),
                  Codec.intRange(0, 256).fieldOf("leaf_placement_attempts").forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, efv::new)
   );
   private final bpv b;
   private final int c;

   public efv(bpv $$0, bpv $$1, bpv $$2, int $$3) {
      super($$0, $$1);
      this.b = $$2;
      this.c = $$3;
   }

   @Override
   protected efr<?> a() {
      return efr.j;
   }

   @Override
   protected void a(dda $$0, efq.b $$1, ayv $$2, efa $$3, int $$4, efq.a $$5, int $$6, int $$7, int $$8) {
      jd $$9 = $$5.a();
      jd.a $$10 = $$9.j();

      for (int $$11 = 0; $$11 < this.c; $$11++) {
         $$10.a($$9, $$2.a($$7) - $$2.a($$7), $$2.a($$6) - $$2.a($$6), $$2.a($$7) - $$2.a($$7));
         a($$0, $$1, $$2, $$3, $$10);
      }
   }

   @Override
   public int a(ayv $$0, int $$1, efa $$2) {
      return this.b.a($$0);
   }

   @Override
   protected boolean a(ayv $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return false;
   }
}
