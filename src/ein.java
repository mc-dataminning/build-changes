import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ein implements eic {
   public static final Codec<ein> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(emq.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), emq.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, ein::new)
   );
   public final jr<emq> b;
   public final jr<emq> c;

   public ein(jr<emq> $$0, jr<emq> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<efk<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
