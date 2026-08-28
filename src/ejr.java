import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejr extends ejp {
   public static final MapCodec<ejr> a = RecordCodecBuilder.mapCodec(
      $$0 -> b($$0).and(Codec.intRange(0, 16).fieldOf("height").forGetter($$0x -> $$0x.b)).apply($$0, ejr::new)
   );
   protected final int b;

   public ejr(brq $$0, brq $$1, int $$2) {
      super($$0, $$1);
      this.b = $$2;
   }

   @Override
   protected ejq<?> a() {
      return ejq.g;
   }

   @Override
   protected void a(dgp $$0, ejp.b $$1, azh $$2, eiz $$3, int $$4, ejp.a $$5, int $$6, int $$7, int $$8) {
      int $$9 = $$5.c() ? $$6 : 1 + $$2.a(2);

      for (int $$10 = $$8; $$10 >= $$8 - $$9; $$10--) {
         int $$11 = $$7 + $$5.b() + 1 - $$10;
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$11, $$10, $$5.c());
      }
   }

   @Override
   public int a(azh $$0, int $$1, eiz $$2) {
      return this.b;
   }

   @Override
   protected boolean a(azh $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 + $$3 >= 7 ? true : $$1 * $$1 + $$3 * $$3 > $$4 * $$4;
   }
}
