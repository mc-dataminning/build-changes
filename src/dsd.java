import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsd extends drz {
   public static final Codec<dsd> c = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dsd::new));

   public dsd(bhg $$0, bhg $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dsf<?> a() {
      return dsf.f;
   }

   @Override
   protected void a(crf $$0, dse.b $$1, ate $$2, dro $$3, int $$4, dse.a $$5, int $$6, int $$7, int $$8) {
      for (int $$9 = $$8; $$9 >= $$8 - $$6; $$9--) {
         int $$10 = $$7 + ($$9 != $$8 && $$9 != $$8 - $$6 ? 1 : 0);
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }
   }

   @Override
   protected boolean a(ate $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return asy.k((float)$$1 + 0.5F) + asy.k((float)$$3 + 0.5F) > (float)($$4 * $$4);
   }
}
