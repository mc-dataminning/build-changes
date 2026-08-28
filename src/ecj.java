import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecj implements ebv {
   public static final MapCodec<ecj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kj.v(16).optionalFieldOf("offset", kj.g).forGetter($$0x -> $$0x.e), dus.a.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, ecj::new)
   );
   private final kj e;
   private final dus f;

   protected ecj(kj $$0, dus $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dfg $$0, jf $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public ebw<?> a() {
      return ebw.g;
   }
}
