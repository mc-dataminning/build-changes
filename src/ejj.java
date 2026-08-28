import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

record ejj(kb e) implements eiw {
   public static MapCodec<ejj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kb.g.optionalFieldOf("offset", kb.i).forGetter(ejj::g)).apply($$0, ejj::new));

   @Override
   public eix<?> a() {
      return eix.m;
   }

   public boolean a(dli $$0, iw $$1) {
      return $$0.a(null, fgt.b().a($$1));
   }

   public kb g() {
      return this.e;
   }
}
