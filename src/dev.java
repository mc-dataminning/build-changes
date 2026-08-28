import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dev(jq<axe> d, bsl e, bsl f) implements dep {
   public static final MapCodec<dev> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               axe.b.fieldOf("sound").forGetter(dev::b),
               bsl.a(1.0E-5F, 10.0F).fieldOf("volume").forGetter(dev::c),
               bsl.a(1.0E-5F, 2.0F).fieldOf("pitch").forGetter(dev::d)
            )
            .apply($$0, dev::new)
   );

   @Override
   public void a(ash $$0, int $$1, ddx $$2, bvj $$3, fbx $$4) {
      bam $$5 = $$3.dZ();
      if (!$$3.bb()) {
         $$0.a(null, $$4.a(), $$4.b(), $$4.c(), this.d, $$3.dn(), this.e.a($$5), this.f.a($$5));
      }
   }

   @Override
   public MapCodec<dev> a() {
      return a;
   }

   public jq<axe> b() {
      return this.d;
   }

   public bsl c() {
      return this.e;
   }

   public bsl d() {
      return this.f;
   }
}
