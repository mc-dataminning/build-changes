import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public class ehw extends eib {
   public static final MapCodec<ehw> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ehw::new));
   protected final int b;

   protected static <P extends ehw> P3<Mu<P>, bri, bri, Integer> a(Instance<P> $$0) {
      return b($$0).and(Codec.intRange(0, 16).fieldOf("height").forGetter($$0x -> $$0x.b));
   }

   public ehw(bri $$0, bri $$1, int $$2) {
      super($$0, $$1);
      this.b = $$2;
   }

   @Override
   protected eic<?> a() {
      return eic.a;
   }

   @Override
   protected void a(dfh $$0, eib.b $$1, azs $$2, ehl $$3, int $$4, eib.a $$5, int $$6, int $$7, int $$8) {
      for (int $$9 = $$8; $$9 >= $$8 - $$6; $$9--) {
         int $$10 = Math.max($$7 + $$5.b() - 1 - $$9 / 2, 0);
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }
   }

   @Override
   public int a(azs $$0, int $$1, ehl $$2) {
      return this.b;
   }

   @Override
   protected boolean a(azs $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == $$4 && $$3 == $$4 && ($$0.a(2) == 0 || $$2 == 0);
   }
}
