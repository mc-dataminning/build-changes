import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eha implements egp {
   public static final Codec<eha> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(elb.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), elb.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, eha::new)
   );
   public final jq<elb> b;
   public final jq<elb> c;

   public eha(jq<elb> $$0, jq<elb> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<edx<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
