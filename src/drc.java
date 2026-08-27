import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public class drc extends drh {
   public static final Codec<drc> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, drc::new));
   protected final int b;

   protected static <P extends drc> P3<Mu<P>, bfy, bfy, Integer> a(Instance<P> $$0) {
      return b($$0).and(Codec.intRange(0, 16).fieldOf("height").forGetter($$0x -> $$0x.b));
   }

   public drc(bfy $$0, bfy $$1, int $$2) {
      super($$0, $$1);
      this.b = $$2;
   }

   @Override
   protected dri<?> a() {
      return dri.a;
   }

   @Override
   protected void a(cpw $$0, drh.b $$1, arx $$2, dqr $$3, int $$4, drh.a $$5, int $$6, int $$7, int $$8) {
      for (int $$9 = $$8; $$9 >= $$8 - $$6; $$9--) {
         int $$10 = Math.max($$7 + $$5.b() - 1 - $$9 / 2, 0);
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }
   }

   @Override
   public int a(arx $$0, int $$1, dqr $$2) {
      return this.b;
   }

   @Override
   protected boolean a(arx $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == $$4 && $$3 == $$4 && ($$0.a(2) == 0 || $$2 == 0);
   }
}
