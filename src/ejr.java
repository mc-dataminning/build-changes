import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejr extends ejm {
   public static final MapCodec<ejr> a = RecordCodecBuilder.mapCodec(
      $$0 -> b($$0)
            .and(
               $$0.group(
                  brn.b(1, 512).fieldOf("foliage_height").forGetter($$0x -> $$0x.b),
                  Codec.intRange(0, 256).fieldOf("leaf_placement_attempts").forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, ejr::new)
   );
   private final brn b;
   private final int c;

   public ejr(brn $$0, brn $$1, brn $$2, int $$3) {
      super($$0, $$1);
      this.b = $$2;
      this.c = $$3;
   }

   @Override
   protected ejn<?> a() {
      return ejn.j;
   }

   @Override
   protected void a(dgm $$0, ejm.b $$1, azg $$2, eiw $$3, int $$4, ejm.a $$5, int $$6, int $$7, int $$8) {
      ji $$9 = $$5.a();
      ji.a $$10 = $$9.k();

      for (int $$11 = 0; $$11 < this.c; $$11++) {
         $$10.a($$9, $$2.a($$7) - $$2.a($$7), $$2.a($$6) - $$2.a($$6), $$2.a($$7) - $$2.a($$7));
         a($$0, $$1, $$2, $$3, $$10);
      }
   }

   @Override
   public int a(azg $$0, int $$1, eiw $$2) {
      return this.b.a($$0);
   }

   @Override
   protected boolean a(azg $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return false;
   }
}
