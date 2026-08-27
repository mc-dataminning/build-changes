import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dye extends dyk {
   public static final Codec<dye> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, dye::new));

   public dye(blq $$0, blq $$1) {
      super($$0, $$1);
   }

   @Override
   protected dyl<?> a() {
      return dyl.d;
   }

   @Override
   protected void a(cwk $$0, dyk.b $$1, awt $$2, dxu $$3, int $$4, dyk.a $$5, int $$6, int $$7, int $$8) {
      boolean $$9 = $$5.c();
      ib $$10 = $$5.a().b($$8);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b(), -1 - $$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 - 1, -$$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b() - 1, 0, $$9);
   }

   @Override
   public int a(awt $$0, int $$1, dxu $$2) {
      return 0;
   }

   @Override
   protected boolean a(awt $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$2 == 0 ? ($$1 > 1 || $$3 > 1) && $$1 != 0 && $$3 != 0 : $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
