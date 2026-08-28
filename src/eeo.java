import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eeo extends eek {
   public static final MapCodec<eeo> c = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eeo::new));

   public eeo(bqa $$0, bqa $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected eeq<?> a() {
      return eeq.f;
   }

   @Override
   protected void a(dcf $$0, eep.b $$1, azh $$2, edz $$3, int $$4, eep.a $$5, int $$6, int $$7, int $$8) {
      for (int $$9 = $$8; $$9 >= $$8 - $$6; $$9--) {
         int $$10 = $$7 + ($$9 != $$8 && $$9 != $$8 - $$6 ? 1 : 0);
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }
   }

   @Override
   protected boolean a(azh $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return ayz.k((float)$$1 + 0.5F) + ayz.k((float)$$3 + 0.5F) > (float)($$4 * $$4);
   }
}
