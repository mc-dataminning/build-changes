import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eil implements eia {
   public static final Codec<eil> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(emo.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), emo.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, eil::new)
   );
   public final jr<emo> b;
   public final jr<emo> c;

   public eil(jr<emo> $$0, jr<emo> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<efi<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
