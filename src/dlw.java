import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlw extends djp {
   public static final MapCodec<dlw> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dlt.a.forGetter($$0x -> $$0x.f), t()).apply($$0, dlw::new));
   private final dke f;

   @Override
   public MapCodec<dlw> a() {
      return e;
   }

   protected dlw(dke $$0, dxp.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, dxq $$3, boolean $$4) {
      this.a($$0, $$1, $$1, $$1.A, $$2);
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, azh $$3) {
      if (!d($$0, $$1, $$2)) {
         $$1.a($$2, this.f.m().b(b, Boolean.valueOf(false)).b(d, $$0.c(d)), 2);
      }
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if ($$4.g() == $$0.c(d) && !$$0.a($$1, $$3)) {
         return dkg.a.m();
      } else {
         if ($$0.c(b)) {
            $$2.a($$3, etx.c, etx.c.a($$1));
         }

         this.a($$0, $$1, $$2, $$7, $$3);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
