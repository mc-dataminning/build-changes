import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzc extends dzi {
   public static final Codec<dzc> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, dzc::new));

   public dzc(bmi $$0, bmi $$1) {
      super($$0, $$1);
   }

   @Override
   protected dzj<?> a() {
      return dzj.d;
   }

   @Override
   protected void a(cxh $$0, dzi.b $$1, axd $$2, dys $$3, int $$4, dzi.a $$5, int $$6, int $$7, int $$8) {
      boolean $$9 = $$5.c();
      ib $$10 = $$5.a().b($$8);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b(), -1 - $$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 - 1, -$$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b() - 1, 0, $$9);
   }

   @Override
   public int a(axd $$0, int $$1, dys $$2) {
      return 0;
   }

   @Override
   protected boolean a(axd $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$2 == 0 ? ($$1 > 1 || $$3 > 1) && $$1 != 0 && $$3 != 0 : $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
