import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

record eiz(kb e) implements eim {
   public static MapCodec<eiz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kb.g.optionalFieldOf("offset", kb.i).forGetter(eiz::g)).apply($$0, eiz::new));

   @Override
   public ein<?> a() {
      return ein.m;
   }

   public boolean a(dky $$0, iw $$1) {
      return $$0.a(null, fgj.b().a($$1));
   }

   public kb g() {
      return this.e;
   }
}
