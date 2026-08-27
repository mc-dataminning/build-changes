import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eat implements eai {
   public static final Codec<eat> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eeu.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), eeu.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, eat::new)
   );
   public final in<eeu> b;
   public final in<eeu> c;

   public eat(in<eeu> $$0, in<eeu> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<dxr<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
