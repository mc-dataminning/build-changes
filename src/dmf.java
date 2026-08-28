import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmf extends djx {
   public static final MapCodec<dmf> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dmc.a.forGetter($$0x -> $$0x.f), t()).apply($$0, dmf::new));
   private final dkm f;

   @Override
   public MapCodec<dmf> a() {
      return e;
   }

   protected dmf(dkm $$0, dxu.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void b(dxv $$0, dhi $$1, jh $$2, dxv $$3, boolean $$4) {
      this.a($$0, $$1, $$1, $$1.A, $$2);
   }

   @Override
   protected void a(dxv $$0, ash $$1, jh $$2, bam $$3) {
      if (!d($$0, $$1, $$2)) {
         $$1.a($$2, this.f.m().b(d, Boolean.valueOf(false)).b(c, $$0.c(c)), 2);
      }
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if ($$4.g() == $$0.c(c) && !$$0.a($$1, $$3)) {
         return dko.a.m();
      } else {
         if ($$0.c(d)) {
            $$2.a($$3, ety.c, ety.c.a($$1));
         }

         this.a($$0, $$1, $$2, $$7, $$3);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
