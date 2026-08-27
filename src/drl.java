import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drl extends drh {
   public static final Codec<drl> c = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, drl::new));

   public drl(bgd $$0, bgd $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected drn<?> a() {
      return drn.f;
   }

   @Override
   protected void a(cqb $$0, drm.b $$1, asc $$2, dqw $$3, int $$4, drm.a $$5, int $$6, int $$7, int $$8) {
      for (int $$9 = $$8; $$9 >= $$8 - $$6; $$9--) {
         int $$10 = $$7 + ($$9 != $$8 && $$9 != $$8 - $$6 ? 1 : 0);
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }
   }

   @Override
   protected boolean a(asc $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return arx.k((float)$$1 + 0.5F) + arx.k((float)$$3 + 0.5F) > (float)($$4 * $$4);
   }
}
