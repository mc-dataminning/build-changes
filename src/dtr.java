import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dtr implements dtg {
   public static final Codec<dtr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dxs.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), dxs.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, dtr::new)
   );
   public final ie<dxs> b;
   public final ie<dxs> c;

   public dtr(ie<dxs> $$0, ie<dxs> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<dqp<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
