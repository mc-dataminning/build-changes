import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dqg implements dpv {
   public static final Codec<dqg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(duh.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), duh.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, dqg::new)
   );
   public final hg<duh> b;
   public final hg<duh> c;

   public dqg(hg<duh> $$0, hg<duh> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<dne<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
