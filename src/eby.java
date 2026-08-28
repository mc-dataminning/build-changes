import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eby implements ebv {
   private final kj e;
   private final jk f;
   public static final MapCodec<eby> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kj.v(16).optionalFieldOf("offset", kj.g).forGetter($$0x -> $$0x.e), jk.g.fieldOf("direction").forGetter($$0x -> $$0x.f))
            .apply($$0, eby::new)
   );

   public eby(kj $$0, jk $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dfg $$0, jf $$1) {
      jf $$2 = $$1.a(this.e);
      return $$0.a_($$2).c($$0, $$2, this.f);
   }

   @Override
   public ebw<?> a() {
      return ebw.d;
   }
}
