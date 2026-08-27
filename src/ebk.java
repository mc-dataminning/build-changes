import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebk extends ebg {
   public static final Codec<ebk> c = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, ebk::new));

   public ebk(bnf $$0, bnf $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected ebm<?> a() {
      return ebm.f;
   }

   @Override
   protected void a(czd $$0, ebl.b $$1, axr $$2, eav $$3, int $$4, ebl.a $$5, int $$6, int $$7, int $$8) {
      for (int $$9 = $$8; $$9 >= $$8 - $$6; $$9--) {
         int $$10 = $$7 + ($$9 != $$8 && $$9 != $$8 - $$6 ? 1 : 0);
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }
   }

   @Override
   protected boolean a(axr $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return axk.k((float)$$1 + 0.5F) + axk.k((float)$$3 + 0.5F) > (float)($$4 * $$4);
   }
}
