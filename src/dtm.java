import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtm extends dtl {
   public static final Codec<dtm> c = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dtm::new));

   public dtm(big $$0, big $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dtr<?> a() {
      return dtr.e;
   }

   @Override
   protected void a(csl $$0, dtq.b $$1, atw $$2, dta $$3, int $$4, dtq.a $$5, int $$6, int $$7, int $$8) {
      for (int $$9 = $$8; $$9 >= $$8 - $$6; $$9--) {
         int $$10 = $$7 + $$5.b() - 1 - $$9;
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }
   }

   @Override
   protected boolean a(atw $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == $$4 && $$3 == $$4 && $$0.a(2) == 0;
   }
}
