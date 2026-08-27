import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsy extends dsu {
   public static final Codec<dsy> c = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dsy::new));

   public dsy(bhv $$0, bhv $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dta<?> a() {
      return dta.f;
   }

   @Override
   protected void a(cry $$0, dsz.b $$1, ato $$2, dsj $$3, int $$4, dsz.a $$5, int $$6, int $$7, int $$8) {
      for (int $$9 = $$8; $$9 >= $$8 - $$6; $$9--) {
         int $$10 = $$7 + ($$9 != $$8 && $$9 != $$8 - $$6 ? 1 : 0);
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }
   }

   @Override
   protected boolean a(ato $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return ati.k((float)$$1 + 0.5F) + ati.k((float)$$3 + 0.5F) > (float)($$4 * $$4);
   }
}
