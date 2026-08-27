import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebo extends ebu {
   public static final Codec<ebo> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, ebo::new));

   public ebo(bnk $$0, bnk $$1) {
      super($$0, $$1);
   }

   @Override
   protected ebv<?> a() {
      return ebv.d;
   }

   @Override
   protected void a(czm $$0, ebu.b $$1, axt $$2, ebe $$3, int $$4, ebu.a $$5, int $$6, int $$7, int $$8) {
      boolean $$9 = $$5.c();
      id $$10 = $$5.a().b($$8);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b(), -1 - $$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 - 1, -$$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b() - 1, 0, $$9);
   }

   @Override
   public int a(axt $$0, int $$1, ebe $$2) {
      return 0;
   }

   @Override
   protected boolean a(axt $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$2 == 0 ? ($$1 > 1 || $$3 > 1) && $$1 != 0 && $$3 != 0 : $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
