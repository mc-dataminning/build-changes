import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqx extends dqw {
   public static final Codec<dqx> c = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dqx::new));

   public dqx(bft $$0, bft $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected drc<?> a() {
      return drc.e;
   }

   @Override
   protected void a(cpq $$0, drb.b $$1, art $$2, dql $$3, int $$4, drb.a $$5, int $$6, int $$7, int $$8) {
      for (int $$9 = $$8; $$9 >= $$8 - $$6; $$9--) {
         int $$10 = $$7 + $$5.b() - 1 - $$9;
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }
   }

   @Override
   protected boolean a(art $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == $$4 && $$3 == $$4 && $$0.a(2) == 0;
   }
}
