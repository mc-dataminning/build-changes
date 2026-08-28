import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record den(jq<awu> d, bsd e, bsd f) implements deh {
   public static final MapCodec<den> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               awu.b.fieldOf("sound").forGetter(den::b),
               bsd.a(1.0E-5F, 10.0F).fieldOf("volume").forGetter(den::c),
               bsd.a(1.0E-5F, 2.0F).fieldOf("pitch").forGetter(den::d)
            )
            .apply($$0, den::new)
   );

   @Override
   public void a(arx $$0, int $$1, ddp $$2, bvb $$3, fbr $$4) {
      bac $$5 = $$3.dZ();
      if (!$$3.bb()) {
         $$0.a(null, $$4.a(), $$4.b(), $$4.c(), this.d, $$3.dn(), this.e.a($$5), this.f.a($$5));
      }
   }

   @Override
   public MapCodec<den> a() {
      return a;
   }

   public jq<awu> b() {
      return this.d;
   }

   public bsd c() {
      return this.e;
   }

   public bsd d() {
      return this.f;
   }
}
