import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egm extends egs {
   public static final MapCodec<egm> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, egm::new));

   public egm(bqp $$0, bqp $$1) {
      super($$0, $$1);
   }

   @Override
   protected egt<?> a() {
      return egt.d;
   }

   @Override
   protected void a(ddy $$0, egs.b $$1, azk $$2, egc $$3, int $$4, egs.a $$5, int $$6, int $$7, int $$8) {
      boolean $$9 = $$5.c();
      je $$10 = $$5.a().b($$8);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b(), -1 - $$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 - 1, -$$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b() - 1, 0, $$9);
   }

   @Override
   public int a(azk $$0, int $$1, egc $$2) {
      return 0;
   }

   @Override
   protected boolean a(azk $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$2 == 0 ? ($$1 > 1 || $$3 > 1) && $$1 != 0 && $$3 != 0 : $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
