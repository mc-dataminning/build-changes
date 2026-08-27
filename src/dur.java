import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dur implements dug {
   public static final Codec<dur> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dys.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), dys.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, dur::new)
   );
   public final ih<dys> b;
   public final ih<dys> c;

   public dur(ih<dys> $$0, ih<dys> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<drp<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
