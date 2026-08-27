import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebt extends ebp {
   public static final Codec<ebt> c = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, ebt::new));

   public ebt(bnk $$0, bnk $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected ebv<?> a() {
      return ebv.f;
   }

   @Override
   protected void a(czm $$0, ebu.b $$1, axt $$2, ebe $$3, int $$4, ebu.a $$5, int $$6, int $$7, int $$8) {
      for (int $$9 = $$8; $$9 >= $$8 - $$6; $$9--) {
         int $$10 = $$7 + ($$9 != $$8 && $$9 != $$8 - $$6 ? 1 : 0);
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }
   }

   @Override
   protected boolean a(axt $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return axm.k((float)$$1 + 0.5F) + axm.k((float)$$3 + 0.5F) > (float)($$4 * $$4);
   }
}
