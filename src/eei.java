import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eei extends eee {
   public static final MapCodec<eei> c = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eei::new));

   public eei(bpu $$0, bpu $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected eek<?> a() {
      return eek.f;
   }

   @Override
   protected void a(dbz $$0, eej.b $$1, azc $$2, edt $$3, int $$4, eej.a $$5, int $$6, int $$7, int $$8) {
      for (int $$9 = $$8; $$9 >= $$8 - $$6; $$9--) {
         int $$10 = $$7 + ($$9 != $$8 && $$9 != $$8 - $$6 ? 1 : 0);
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }
   }

   @Override
   protected boolean a(azc $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return ayu.k((float)$$1 + 0.5F) + ayu.k((float)$$3 + 0.5F) > (float)($$4 * $$4);
   }
}
