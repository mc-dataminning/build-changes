import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public class eji extends ejn {
   public static final MapCodec<eji> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eji::new));
   protected final int b;

   protected static <P extends eji> P3<Mu<P>, bro, bro, Integer> a(Instance<P> $$0) {
      return b($$0).and(Codec.intRange(0, 16).fieldOf("height").forGetter($$0x -> $$0x.b));
   }

   public eji(bro $$0, bro $$1, int $$2) {
      super($$0, $$1);
      this.b = $$2;
   }

   @Override
   protected ejo<?> a() {
      return ejo.a;
   }

   @Override
   protected void a(dgn $$0, ejn.b $$1, azh $$2, eix $$3, int $$4, ejn.a $$5, int $$6, int $$7, int $$8) {
      for (int $$9 = $$8; $$9 >= $$8 - $$6; $$9--) {
         int $$10 = Math.max($$7 + $$5.b() - 1 - $$9 / 2, 0);
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }
   }

   @Override
   public int a(azh $$0, int $$1, eix $$2) {
      return this.b;
   }

   @Override
   protected boolean a(azh $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == $$4 && $$3 == $$4 && ($$0.a(2) == 0 || $$2 == 0);
   }
}
