import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ebs implements ebh {
   public static final Codec<ebs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eft.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), eft.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, ebs::new)
   );
   public final iw<eft> b;
   public final iw<eft> c;

   public ebs(iw<eft> $$0, iw<eft> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<dyq<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
