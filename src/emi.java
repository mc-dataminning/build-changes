import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emi extends eme {
   public static final MapCodec<emi> c = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, emi::new));

   public emi(btd $$0, btd $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected emk<?> a() {
      return emk.f;
   }

   @Override
   protected void a(div $$0, emj.b $$1, azt $$2, elt $$3, int $$4, emj.a $$5, int $$6, int $$7, int $$8) {
      for (int $$9 = $$8; $$9 >= $$8 - $$6; $$9--) {
         int $$10 = $$7 + ($$9 != $$8 && $$9 != $$8 - $$6 ? 1 : 0);
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }
   }

   @Override
   protected boolean a(azt $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return azk.l((float)$$1 + 0.5F) + azk.l((float)$$3 + 0.5F) > (float)($$4 * $$4);
   }
}
