import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvr extends dvn {
   public static final Codec<dvr> c = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dvr::new));

   public dvr(bjh $$0, bjh $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dvt<?> a() {
      return dvt.f;
   }

   @Override
   protected void a(cud $$0, dvs.b $$1, auw $$2, dvc $$3, int $$4, dvs.a $$5, int $$6, int $$7, int $$8) {
      for (int $$9 = $$8; $$9 >= $$8 - $$6; $$9--) {
         int $$10 = $$7 + ($$9 != $$8 && $$9 != $$8 - $$6 ? 1 : 0);
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }
   }

   @Override
   protected boolean a(auw $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return aup.k((float)$$1 + 0.5F) + aup.k((float)$$3 + 0.5F) > (float)($$4 * $$4);
   }
}
