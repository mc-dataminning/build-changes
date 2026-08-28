import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efp extends efl {
   public static final MapCodec<efp> c = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, efp::new));

   public efp(bpv $$0, bpv $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected efr<?> a() {
      return efr.f;
   }

   @Override
   protected void a(dda $$0, efq.b $$1, ayv $$2, efa $$3, int $$4, efq.a $$5, int $$6, int $$7, int $$8) {
      for (int $$9 = $$8; $$9 >= $$8 - $$6; $$9--) {
         int $$10 = $$7 + ($$9 != $$8 && $$9 != $$8 - $$6 ? 1 : 0);
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }
   }

   @Override
   protected boolean a(ayv $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return ayn.k((float)$$1 + 0.5F) + ayn.k((float)$$3 + 0.5F) > (float)($$4 * $$4);
   }
}
