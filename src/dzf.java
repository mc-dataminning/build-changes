import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzf extends dzb {
   public static final Codec<dzf> c = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dzf::new));

   public dzf(bmh $$0, bmh $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dzh<?> a() {
      return dzh.f;
   }

   @Override
   protected void a(cxf $$0, dzg.b $$1, axd $$2, dyq $$3, int $$4, dzg.a $$5, int $$6, int $$7, int $$8) {
      for (int $$9 = $$8; $$9 >= $$8 - $$6; $$9--) {
         int $$10 = $$7 + ($$9 != $$8 && $$9 != $$8 - $$6 ? 1 : 0);
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }
   }

   @Override
   protected boolean a(axd $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return aww.k((float)$$1 + 0.5F) + aww.k((float)$$3 + 0.5F) > (float)($$4 * $$4);
   }
}
