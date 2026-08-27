import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqw extends drc {
   public static final Codec<dqw> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, dqw::new));

   public dqw(bfv $$0, bfv $$1) {
      super($$0, $$1);
   }

   @Override
   protected drd<?> a() {
      return drd.d;
   }

   @Override
   protected void a(cpr $$0, drc.b $$1, aru $$2, dqm $$3, int $$4, drc.a $$5, int $$6, int $$7, int $$8) {
      boolean $$9 = $$5.c();
      gu $$10 = $$5.a().b($$8);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b(), -1 - $$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 - 1, -$$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b() - 1, 0, $$9);
   }

   @Override
   public int a(aru $$0, int $$1, dqm $$2) {
      return 0;
   }

   @Override
   protected boolean a(aru $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$2 == 0 ? ($$1 > 1 || $$3 > 1) && $$1 != 0 && $$3 != 0 : $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
