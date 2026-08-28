import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ekk extends ekg {
   public static final MapCodec<ekk> c = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ekk::new));

   public ekk(bsn $$0, bsn $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected ekm<?> a() {
      return ekm.f;
   }

   @Override
   protected void a(dhn $$0, ekl.b $$1, bam $$2, ejv $$3, int $$4, ekl.a $$5, int $$6, int $$7, int $$8) {
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
