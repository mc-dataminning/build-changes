import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlv extends djo {
   public static final MapCodec<dlv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dlt.a.forGetter($$0x -> $$0x.c), t()).apply($$0, dlv::new));
   private final dke c;
   private static final fcr d = dke.b(12.0, 0.0, 15.0);

   @Override
   public MapCodec<dlv> a() {
      return a;
   }

   protected dlv(dke $$0, dxp.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, dxq $$3, boolean $$4) {
      this.a($$0, $$1, $$1, $$1.A, $$2);
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, azh $$3) {
      if (!d($$0, $$1, $$2)) {
         $$1.a($$2, this.c.m().b(b, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if ($$4 == jn.a && !$$0.a($$1, $$3)) {
         return dkg.a.m();
      } else {
         this.a($$0, $$1, $$2, $$7, $$3);
         if ($$0.c(b)) {
            $$2.a($$3, etx.c, etx.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return d;
   }
}
