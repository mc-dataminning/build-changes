import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

record efi(km e) implements eev {
   public static MapCodec<efi> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(km.g.optionalFieldOf("offset", km.h).forGetter(efi::g)).apply($$0, efi::new));

   @Override
   public eew<?> a() {
      return eew.m;
   }

   public boolean a(dhy $$0, ji $$1) {
      return $$0.a(null, fco.b().a($$1));
   }

   public km g() {
      return this.e;
   }
}
