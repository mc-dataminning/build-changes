import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

record eap(kh e) implements eac {
   public static MapCodec<eap> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kh.f.optionalFieldOf("offset", kh.g).forGetter(eap::g)).apply($$0, eap::new));

   @Override
   public ead<?> a() {
      return ead.m;
   }

   public boolean a(ddq $$0, jd $$1) {
      return $$0.a(null, exm.b().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   public kh g() {
      return this.e;
   }
}
