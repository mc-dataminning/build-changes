import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efv extends efr {
   public static final Codec<efv> c = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, efv::new));

   public efv(bpf $$0, bpf $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected efx<?> a() {
      return efx.f;
   }

   @Override
   protected void a(dcg $$0, efw.b $$1, ayt $$2, efg $$3, int $$4, efw.a $$5, int $$6, int $$7, int $$8) {
      for (int $$9 = $$8; $$9 >= $$8 - $$6; $$9--) {
         int $$10 = $$7 + ($$9 != $$8 && $$9 != $$8 - $$6 ? 1 : 0);
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }
   }

   @Override
   protected boolean a(ayt $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return aym.k((float)$$1 + 0.5F) + aym.k((float)$$3 + 0.5F) > (float)($$4 * $$4);
   }
}
