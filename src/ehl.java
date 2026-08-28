import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ehl implements eha {
   public static final Codec<ehl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(elm.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), elm.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, ehl::new)
   );
   public final jq<elm> b;
   public final jq<elm> c;

   public ehl(jq<elm> $$0, jq<elm> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<eei<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
