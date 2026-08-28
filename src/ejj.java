import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejj extends ejp {
   public static final MapCodec<ejj> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, ejj::new));

   public ejj(brq $$0, brq $$1) {
      super($$0, $$1);
   }

   @Override
   protected ejq<?> a() {
      return ejq.d;
   }

   @Override
   protected void a(dgp $$0, ejp.b $$1, azh $$2, eiz $$3, int $$4, ejp.a $$5, int $$6, int $$7, int $$8) {
      boolean $$9 = $$5.c();
      ji $$10 = $$5.a().b($$8);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b(), -1 - $$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 - 1, -$$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b() - 1, 0, $$9);
   }

   @Override
   public int a(azh $$0, int $$1, eiz $$2) {
      return 0;
   }

   @Override
   protected boolean a(azh $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$2 == 0 ? ($$1 > 1 || $$3 > 1) && $$1 != 0 && $$3 != 0 : $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
