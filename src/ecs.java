import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecs extends eco {
   public static final Codec<ecs> c = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, ecs::new));

   public ecs(bor $$0, bor $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected ecu<?> a() {
      return ecu.f;
   }

   @Override
   protected void a(daj $$0, ect.b $$1, ayg $$2, ecd $$3, int $$4, ect.a $$5, int $$6, int $$7, int $$8) {
      for (int $$9 = $$8; $$9 >= $$8 - $$6; $$9--) {
         int $$10 = $$7 + ($$9 != $$8 && $$9 != $$8 - $$6 ? 1 : 0);
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }
   }

   @Override
   protected boolean a(ayg $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return axz.k((float)$$1 + 0.5F) + axz.k((float)$$3 + 0.5F) > (float)($$4 * $$4);
   }
}
