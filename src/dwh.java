import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dwh implements dvw {
   public static final Codec<dwh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eai.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), eai.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, dwh::new)
   );
   public final ij<eai> b;
   public final ij<eai> c;

   public dwh(ij<eai> $$0, ij<eai> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<dtf<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
