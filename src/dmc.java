import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmc extends djt {
   public static final MapCodec<dmc> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dmb.a.forGetter($$0x -> $$0x.c), t()).apply($$0, dmc::new));
   private final dkl c;

   @Override
   public MapCodec<dmc> a() {
      return b;
   }

   protected dmc(dkl $$0, dxt.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   protected void b(dxu $$0, dhh $$1, jh $$2, dxu $$3, boolean $$4) {
      this.a($$0, $$1, $$1, $$1.A, $$2);
   }

   @Override
   protected void a(dxu $$0, ash $$1, jh $$2, bam $$3) {
      if (!d($$0, $$1, $$2)) {
         $$1.a($$2, this.c.m().b(d, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      if ($$4 == jm.a && !$$0.a($$1, $$3)) {
         return dkn.a.m();
      } else {
         this.a($$0, $$1, $$2, $$7, $$3);
         if ($$0.c(d)) {
            $$2.a($$3, etx.c, etx.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
