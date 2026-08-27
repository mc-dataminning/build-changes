import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqy extends dqx {
   public static final Codec<dqy> c = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dqy::new));

   public dqy(bfv $$0, bfv $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected drd<?> a() {
      return drd.e;
   }

   @Override
   protected void a(cpr $$0, drc.b $$1, aru $$2, dqm $$3, int $$4, drc.a $$5, int $$6, int $$7, int $$8) {
      for (int $$9 = $$8; $$9 >= $$8 - $$6; $$9--) {
         int $$10 = $$7 + $$5.b() - 1 - $$9;
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }
   }

   @Override
   protected boolean a(aru $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == $$4 && $$3 == $$4 && $$0.a(2) == 0;
   }
}
