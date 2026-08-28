import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record deo(jr<avz> d, bsb e, bsb f) implements dei {
   public static final MapCodec<deo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               avz.b.fieldOf("sound").forGetter(deo::b),
               bsb.a(1.0E-5F, 10.0F).fieldOf("volume").forGetter(deo::c),
               bsb.a(1.0E-5F, 2.0F).fieldOf("pitch").forGetter(deo::d)
            )
            .apply($$0, deo::new)
   );

   @Override
   public void a(ard $$0, int $$1, ddq $$2, bva $$3, fbx $$4) {
      azh $$5 = $$3.dX();
      if (!$$3.bb()) {
         $$0.a(null, $$4.a(), $$4.b(), $$4.c(), this.d, $$3.dl(), this.e.a($$5), this.f.a($$5));
      }
   }

   @Override
   public MapCodec<deo> a() {
      return a;
   }

   public jr<avz> b() {
      return this.d;
   }

   public bsb c() {
      return this.e;
   }

   public bsb d() {
      return this.f;
   }
}
