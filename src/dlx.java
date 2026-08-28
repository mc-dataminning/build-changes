import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlx extends djp {
   public static final MapCodec<dlx> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dlu.a.forGetter($$0x -> $$0x.f), t()).apply($$0, dlx::new));
   private final dke f;

   @Override
   public MapCodec<dlx> a() {
      return e;
   }

   protected dlx(dke $$0, dxm.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void b(dxn $$0, dha $$1, jh $$2, dxn $$3, boolean $$4) {
      this.a($$0, $$1, $$1, $$1.A, $$2);
   }

   @Override
   protected void a(dxn $$0, ash $$1, jh $$2, bam $$3) {
      if (!d($$0, $$1, $$2)) {
         $$1.a($$2, this.f.m().b(d, Boolean.valueOf(false)).b(c, $$0.c(c)), 2);
      }
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if ($$4.g() == $$0.c(c) && !$$0.a($$1, $$3)) {
         return dkg.a.m();
      } else {
         if ($$0.c(d)) {
            $$2.a($$3, etq.c, etq.c.a($$1));
         }

         this.a($$0, $$1, $$2, $$7, $$3);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
