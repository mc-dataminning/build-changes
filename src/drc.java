import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drc extends dqy {
   public static final Codec<drc> c = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, drc::new));

   public drc(bfv $$0, bfv $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dre<?> a() {
      return dre.f;
   }

   @Override
   protected void a(cps $$0, drd.b $$1, aru $$2, dqn $$3, int $$4, drd.a $$5, int $$6, int $$7, int $$8) {
      for (int $$9 = $$8; $$9 >= $$8 - $$6; $$9--) {
         int $$10 = $$7 + ($$9 != $$8 && $$9 != $$8 - $$6 ? 1 : 0);
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }
   }

   @Override
   protected boolean a(aru $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return arp.k((float)$$1 + 0.5F) + arp.k((float)$$3 + 0.5F) > (float)($$4 * $$4);
   }
}
