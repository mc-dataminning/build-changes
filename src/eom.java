import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eom extends eoi {
   public static final MapCodec<eom> c = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eom::new));

   public eom(buh $$0, buh $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected eoo<?> a() {
      return eoo.f;
   }

   @Override
   protected void a(dkp $$0, eon.b $$1, bai $$2, enx $$3, int $$4, eon.a $$5, int $$6, int $$7, int $$8) {
      for (int $$9 = $$8; $$9 >= $$8 - $$6; $$9--) {
         int $$10 = $$7 + ($$9 != $$8 && $$9 != $$8 - $$6 ? 1 : 0);
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }
   }

   @Override
   protected boolean a(bai $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return azz.l((float)$$1 + 0.5F) + azz.l((float)$$3 + 0.5F) > (float)($$4 * $$4);
   }
}
