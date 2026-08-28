import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ehe implements egt {
   public static final Codec<ehe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(elf.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), elf.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, ehe::new)
   );
   public final jq<elf> b;
   public final jq<elf> c;

   public ehe(jq<elf> $$0, jq<elf> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<eeb<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
