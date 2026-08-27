import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class dxk implements dwy {
   public static final Codec<dxk> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(dxk::new, dwo.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), ebk.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<dwo> b;
   public final il<ebk> c;

   public dxk(List<dwo> $$0, il<ebk> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<duh<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
