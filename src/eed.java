import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eed extends eej {
   public static final MapCodec<eed> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, eed::new));

   public eed(bpu $$0, bpu $$1) {
      super($$0, $$1);
   }

   @Override
   protected eek<?> a() {
      return eek.d;
   }

   @Override
   protected void a(dbz $$0, eej.b $$1, azc $$2, edt $$3, int $$4, eej.a $$5, int $$6, int $$7, int $$8) {
      boolean $$9 = $$5.c();
      iz $$10 = $$5.a().b($$8);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b(), -1 - $$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 - 1, -$$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b() - 1, 0, $$9);
   }

   @Override
   public int a(azc $$0, int $$1, edt $$2) {
      return 0;
   }

   @Override
   protected boolean a(azc $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$2 == 0 ? ($$1 > 1 || $$3 > 1) && $$1 != 0 && $$3 != 0 : $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
