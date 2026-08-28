import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egq {
   public static final Codec<egq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(elm.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, egq::new)
   );
   public final jq<elm> b;
   public final float c;

   public egq(jq<elm> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(dgk $$0, dxr $$1, azu $$2, jh $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
