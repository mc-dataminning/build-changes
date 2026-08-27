import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxh extends dxd {
   public static final Codec<dxh> c = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dxh::new));

   public dxh(bkz $$0, bkz $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dxj<?> a() {
      return dxj.f;
   }

   @Override
   protected void a(cvt $$0, dxi.b $$1, awo $$2, dws $$3, int $$4, dxi.a $$5, int $$6, int $$7, int $$8) {
      for (int $$9 = $$8; $$9 >= $$8 - $$6; $$9--) {
         int $$10 = $$7 + ($$9 != $$8 && $$9 != $$8 - $$6 ? 1 : 0);
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }
   }

   @Override
   protected boolean a(awo $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return awh.k((float)$$1 + 0.5F) + awh.k((float)$$3 + 0.5F) > (float)($$4 * $$4);
   }
}
