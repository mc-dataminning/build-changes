import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehp extends ehv {
   public static final MapCodec<ehp> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, ehp::new));

   public ehp(brd $$0, brd $$1) {
      super($$0, $$1);
   }

   @Override
   protected ehw<?> a() {
      return ehw.d;
   }

   @Override
   protected void a(dfb $$0, ehv.b $$1, azr $$2, ehf $$3, int $$4, ehv.a $$5, int $$6, int $$7, int $$8) {
      boolean $$9 = $$5.c();
      jg $$10 = $$5.a().b($$8);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b(), -1 - $$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 - 1, -$$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b() - 1, 0, $$9);
   }

   @Override
   public int a(azr $$0, int $$1, ehf $$2) {
      return 0;
   }

   @Override
   protected boolean a(azr $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$2 == 0 ? ($$1 > 1 || $$3 > 1) && $$1 != 0 && $$3 != 0 : $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
