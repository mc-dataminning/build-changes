import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efs extends efo {
   public static final MapCodec<efs> c = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, efs::new));

   public efs(bpw $$0, bpw $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected efu<?> a() {
      return efu.f;
   }

   @Override
   protected void a(ddc $$0, eft.b $$1, ayw $$2, efd $$3, int $$4, eft.a $$5, int $$6, int $$7, int $$8) {
      for (int $$9 = $$8; $$9 >= $$8 - $$6; $$9--) {
         int $$10 = $$7 + ($$9 != $$8 && $$9 != $$8 - $$6 ? 1 : 0);
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }
   }

   @Override
   protected boolean a(ayw $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return ayo.k((float)$$1 + 0.5F) + ayo.k((float)$$3 + 0.5F) > (float)($$4 * $$4);
   }
}
