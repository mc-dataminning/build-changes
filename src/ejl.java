import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejl extends ejh {
   public static final MapCodec<ejl> c = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ejl::new));

   public ejl(brn $$0, brn $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected ejn<?> a() {
      return ejn.f;
   }

   @Override
   protected void a(dgm $$0, ejm.b $$1, azg $$2, eiw $$3, int $$4, ejm.a $$5, int $$6, int $$7, int $$8) {
      for (int $$9 = $$8; $$9 >= $$8 - $$6; $$9--) {
         int $$10 = $$7 + ($$9 != $$8 && $$9 != $$8 - $$6 ? 1 : 0);
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }
   }

   @Override
   protected boolean a(azg $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return ayy.l((float)$$1 + 0.5F) + ayy.l((float)$$3 + 0.5F) > (float)($$4 * $$4);
   }
}
