import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dxj implements dwy {
   public static final Codec<dxj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ebk.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), ebk.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, dxj::new)
   );
   public final il<ebk> b;
   public final il<ebk> c;

   public dxj(il<ebk> $$0, il<ebk> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<duh<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
