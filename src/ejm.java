import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejm extends eji {
   public static final MapCodec<ejm> c = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ejm::new));

   public ejm(bro $$0, bro $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected ejo<?> a() {
      return ejo.f;
   }

   @Override
   protected void a(dgn $$0, ejn.b $$1, azh $$2, eix $$3, int $$4, ejn.a $$5, int $$6, int $$7, int $$8) {
      for (int $$9 = $$8; $$9 >= $$8 - $$6; $$9--) {
         int $$10 = $$7 + ($$9 != $$8 && $$9 != $$8 - $$6 ? 1 : 0);
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }
   }

   @Override
   protected boolean a(azh $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return ayz.l((float)$$1 + 0.5F) + ayz.l((float)$$3 + 0.5F) > (float)($$4 * $$4);
   }
}
