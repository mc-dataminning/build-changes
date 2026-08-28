import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record deo(jq<axe> d, bsh e, bsh f) implements dei {
   public static final MapCodec<deo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               axe.b.fieldOf("sound").forGetter(deo::b),
               bsh.a(1.0E-5F, 10.0F).fieldOf("volume").forGetter(deo::c),
               bsh.a(1.0E-5F, 2.0F).fieldOf("pitch").forGetter(deo::d)
            )
            .apply($$0, deo::new)
   );

   @Override
   public void a(ash $$0, int $$1, ddq $$2, bvf $$3, fbs $$4) {
      bam $$5 = $$3.dY();
      if (!$$3.bb()) {
         $$0.a(null, $$4.a(), $$4.b(), $$4.c(), this.d, $$3.dm(), this.e.a($$5), this.f.a($$5));
      }
   }

   @Override
   public MapCodec<deo> a() {
      return a;
   }

   public jq<axe> b() {
      return this.d;
   }

   public bsh c() {
      return this.e;
   }

   public bsh d() {
      return this.f;
   }
}
