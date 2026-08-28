import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ejj implements eiy {
   public static final Codec<ejj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(enn.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), enn.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, ejj::new)
   );
   public final jr<enn> b;
   public final jr<enn> c;

   public ejj(jr<enn> $$0, jr<enn> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<egg<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
