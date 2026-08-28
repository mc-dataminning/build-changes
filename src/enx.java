import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class enx extends eod {
   public static final MapCodec<enx> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, enx::new));

   public enx(bty $$0, bty $$1) {
      super($$0, $$1);
   }

   @Override
   protected eoe<?> a() {
      return eoe.d;
   }

   @Override
   protected void a(dkf $$0, eod.b $$1, azz $$2, enn $$3, int $$4, eod.a $$5, int $$6, int $$7, int $$8) {
      boolean $$9 = $$5.c();
      iw $$10 = $$5.a().b($$8);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b(), -1 - $$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 - 1, -$$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b() - 1, 0, $$9);
   }

   @Override
   public int a(azz $$0, int $$1, enn $$2) {
      return 0;
   }

   @Override
   protected boolean a(azz $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$2 == 0 ? ($$1 > 1 || $$3 > 1) && $$1 != 0 && $$3 != 0 : $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
