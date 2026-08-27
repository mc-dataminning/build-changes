import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drn extends drj {
   public static final Codec<drn> c = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, drn::new));

   public drn(bgf $$0, bgf $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected drp<?> a() {
      return drp.f;
   }

   @Override
   protected void a(cqd $$0, dro.b $$1, ase $$2, dqy $$3, int $$4, dro.a $$5, int $$6, int $$7, int $$8) {
      for (int $$9 = $$8; $$9 >= $$8 - $$6; $$9--) {
         int $$10 = $$7 + ($$9 != $$8 && $$9 != $$8 - $$6 ? 1 : 0);
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }
   }

   @Override
   protected boolean a(ase $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return ary.k((float)$$1 + 0.5F) + ary.k((float)$$3 + 0.5F) > (float)($$4 * $$4);
   }
}
