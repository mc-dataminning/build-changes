import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgy(dgs d) implements dhc {
   public static final MapCodec<dgy> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dgs.b.fieldOf("amount").forGetter($$0x -> $$0x.d)).apply($$0, dgy::new));

   @Override
   public void a(ars $$0, int $$1, dgk $$2, bwt $$3, ffq $$4) {
      czy $$5 = $$2.a();
      if ($$5.c(kk.d) && $$5.c(kk.e)) {
         art $$7 = $$2.c() instanceof art $$6 ? $$6 : null;
         int $$8 = (int)this.d.a($$1);
         $$5.a($$8, $$0, $$7, $$2.d());
      }
   }

   @Override
   public MapCodec<dgy> a() {
      return a;
   }

   public dgs b() {
      return this.d;
   }
}
