import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ekl extends ekh {
   public static final MapCodec<ekl> c = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ekl::new));

   public ekl(bso $$0, bso $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected ekn<?> a() {
      return ekn.f;
   }

   @Override
   protected void a(dho $$0, ekm.b $$1, bam $$2, ejw $$3, int $$4, ekm.a $$5, int $$6, int $$7, int $$8) {
      for (int $$9 = $$8; $$9 >= $$8 - $$6; $$9--) {
         int $$10 = $$7 + ($$9 != $$8 && $$9 != $$8 - $$6 ? 1 : 0);
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }
   }

   @Override
   protected boolean a(bam $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return bae.l((float)$$1 + 0.5F) + bae.l((float)$$3 + 0.5F) > (float)($$4 * $$4);
   }
}
