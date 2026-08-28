import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecj implements ecg {
   private final kk e;
   private final jl f;
   public static final MapCodec<ecj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kk.v(16).optionalFieldOf("offset", kk.g).forGetter($$0x -> $$0x.e), jl.g.fieldOf("direction").forGetter($$0x -> $$0x.f))
            .apply($$0, ecj::new)
   );

   public ecj(kk $$0, jl $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dfs $$0, jg $$1) {
      jg $$2 = $$1.a(this.e);
      return $$0.a_($$2).c($$0, $$2, this.f);
   }

   @Override
   public ech<?> a() {
      return ech.d;
   }
}
