import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ejl implements eja {
   public static final Codec<ejl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eno.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), eno.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, ejl::new)
   );
   public final jq<eno> b;
   public final jq<eno> c;

   public ejl(jq<eno> $$0, jq<eno> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<egi<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
