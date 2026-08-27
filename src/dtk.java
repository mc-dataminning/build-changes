import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtk extends dtg {
   public static final Codec<dtk> c = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dtk::new));

   public dtk(bic $$0, bic $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dtm<?> a() {
      return dtm.f;
   }

   @Override
   protected void a(csg $$0, dtl.b $$1, ats $$2, dsv $$3, int $$4, dtl.a $$5, int $$6, int $$7, int $$8) {
      for (int $$9 = $$8; $$9 >= $$8 - $$6; $$9--) {
         int $$10 = $$7 + ($$9 != $$8 && $$9 != $$8 - $$6 ? 1 : 0);
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }
   }

   @Override
   protected boolean a(ats $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return atm.k((float)$$1 + 0.5F) + atm.k((float)$$3 + 0.5F) > (float)($$4 * $$4);
   }
}
