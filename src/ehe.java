import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehe extends ehk {
   public static final MapCodec<ehe> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, ehe::new));

   public ehe(bqx $$0, bqx $$1) {
      super($$0, $$1);
   }

   @Override
   protected ehl<?> a() {
      return ehl.d;
   }

   @Override
   protected void a(dep $$0, ehk.b $$1, azn $$2, egu $$3, int $$4, ehk.a $$5, int $$6, int $$7, int $$8) {
      boolean $$9 = $$5.c();
      jf $$10 = $$5.a().b($$8);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b(), -1 - $$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 - 1, -$$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b() - 1, 0, $$9);
   }

   @Override
   public int a(azn $$0, int $$1, egu $$2) {
      return 0;
   }

   @Override
   protected boolean a(azn $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$2 == 0 ? ($$1 > 1 || $$3 > 1) && $$1 != 0 && $$3 != 0 : $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
