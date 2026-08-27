import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dui implements dtx {
   public static final Codec<dui> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dyj.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), dyj.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, dui::new)
   );
   public final ih<dyj> b;
   public final ih<dyj> c;

   public dui(ih<dyj> $$0, ih<dyj> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<drg<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
