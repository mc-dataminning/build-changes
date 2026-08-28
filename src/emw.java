import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emw extends enc {
   public static final MapCodec<emw> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, emw::new));

   public emw(bti $$0, bti $$1) {
      super($$0, $$1);
   }

   @Override
   protected end<?> a() {
      return end.d;
   }

   @Override
   protected void a(djg $$0, enc.b $$1, azv $$2, emm $$3, int $$4, enc.a $$5, int $$6, int $$7, int $$8) {
      boolean $$9 = $$5.c();
      iu $$10 = $$5.a().b($$8);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b(), -1 - $$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 - 1, -$$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b() - 1, 0, $$9);
   }

   @Override
   public int a(azv $$0, int $$1, emm $$2) {
      return 0;
   }

   @Override
   protected boolean a(azv $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$2 == 0 ? ($$1 > 1 || $$3 > 1) && $$1 != 0 && $$3 != 0 : $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
