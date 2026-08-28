import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgx(jf<awm> d, btj e, btj f) implements dgr {
   public static final MapCodec<dgx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               awm.b.fieldOf("sound").forGetter(dgx::b),
               btj.a(1.0E-5F, 10.0F).fieldOf("volume").forGetter(dgx::c),
               btj.a(1.0E-5F, 2.0F).fieldOf("pitch").forGetter(dgx::d)
            )
            .apply($$0, dgx::new)
   );

   @Override
   public void a(arq $$0, int $$1, dfz $$2, bwi $$3, ffc $$4) {
      azv $$5 = $$3.dX();
      if (!$$3.aZ()) {
         $$0.a(null, $$4.a(), $$4.b(), $$4.c(), this.d, $$3.dl(), this.e.a($$5), this.f.a($$5));
      }
   }

   @Override
   public MapCodec<dgx> a() {
      return a;
   }

   public jf<awm> b() {
      return this.d;
   }

   public btj c() {
      return this.e;
   }

   public btj d() {
      return this.f;
   }
}
