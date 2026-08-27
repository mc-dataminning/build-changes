import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dra extends dqw {
   public static final Codec<dra> c = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dra::new));

   public dra(bft $$0, bft $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected drc<?> a() {
      return drc.f;
   }

   @Override
   protected void a(cpq $$0, drb.b $$1, art $$2, dql $$3, int $$4, drb.a $$5, int $$6, int $$7, int $$8) {
      for (int $$9 = $$8; $$9 >= $$8 - $$6; $$9--) {
         int $$10 = $$7 + ($$9 != $$8 && $$9 != $$8 - $$6 ? 1 : 0);
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }
   }

   @Override
   protected boolean a(art $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return aro.k((float)$$1 + 0.5F) + aro.k((float)$$3 + 0.5F) > (float)($$4 * $$4);
   }
}
