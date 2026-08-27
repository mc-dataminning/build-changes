import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvc extends duy {
   public static final Codec<dvc> c = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dvc::new));

   public dvc(bja $$0, bja $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dve<?> a() {
      return dve.f;
   }

   @Override
   protected void a(cto $$0, dvd.b $$1, aup $$2, dun $$3, int $$4, dvd.a $$5, int $$6, int $$7, int $$8) {
      for (int $$9 = $$8; $$9 >= $$8 - $$6; $$9--) {
         int $$10 = $$7 + ($$9 != $$8 && $$9 != $$8 - $$6 ? 1 : 0);
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }
   }

   @Override
   protected boolean a(aup $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return aui.k((float)$$1 + 0.5F) + aui.k((float)$$3 + 0.5F) > (float)($$4 * $$4);
   }
}
