import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

record egf(kn e) implements efs {
   public static MapCodec<egf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kn.g.optionalFieldOf("offset", kn.i).forGetter(egf::g)).apply($$0, egf::new));

   @Override
   public eft<?> a() {
      return eft.m;
   }

   public boolean a(dio $$0, jj $$1) {
      return $$0.a(null, fdl.b().a($$1));
   }

   public kn g() {
      return this.e;
   }
}
