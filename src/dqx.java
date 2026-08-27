import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqx extends drd {
   public static final Codec<dqx> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, dqx::new));

   public dqx(bfv $$0, bfv $$1) {
      super($$0, $$1);
   }

   @Override
   protected dre<?> a() {
      return dre.d;
   }

   @Override
   protected void a(cps $$0, drd.b $$1, aru $$2, dqn $$3, int $$4, drd.a $$5, int $$6, int $$7, int $$8) {
      boolean $$9 = $$5.c();
      gu $$10 = $$5.a().b($$8);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b(), -1 - $$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 - 1, -$$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b() - 1, 0, $$9);
   }

   @Override
   public int a(aru $$0, int $$1, dqn $$2) {
      return 0;
   }

   @Override
   protected boolean a(aru $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$2 == 0 ? ($$1 > 1 || $$3 > 1) && $$1 != 0 && $$3 != 0 : $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
