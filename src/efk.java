import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

record efk(kl e) implements eex {
   public static MapCodec<efk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kl.g.optionalFieldOf("offset", kl.h).forGetter(efk::g)).apply($$0, efk::new));

   @Override
   public eey<?> a() {
      return eey.m;
   }

   public boolean a(dig $$0, jh $$1) {
      return $$0.a(null, fcp.b().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   public kl g() {
      return this.e;
   }
}
