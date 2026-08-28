import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dme extends djw {
   public static final MapCodec<dme> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dmc.a.forGetter($$0x -> $$0x.e), t()).apply($$0, dme::new));
   private final dkm e;
   protected static final float b = 6.0F;
   protected static final fcs c = dkm.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<dme> a() {
      return a;
   }

   protected dme(dkm $$0, dxu.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   protected void b(dxv $$0, dhi $$1, jh $$2, dxv $$3, boolean $$4) {
      this.a($$0, $$1, $$1, $$1.A, $$2);
   }

   @Override
   protected void a(dxv $$0, ash $$1, jh $$2, bam $$3) {
      if (!d($$0, $$1, $$2)) {
         $$1.a($$2, this.e.m().b(d, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if ($$4 == jm.a && !$$0.a($$1, $$3)) {
         return dko.a.m();
      } else {
         this.a($$0, $$1, $$2, $$7, $$3);
         if ($$0.c(d)) {
            $$2.a($$3, ety.c, ety.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return c;
   }
}
