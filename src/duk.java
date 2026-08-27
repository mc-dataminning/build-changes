import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class duk implements dty {
   public static final Codec<duk> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(duk::new, dto.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), dyk.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<dto> b;
   public final ih<dyk> c;

   public duk(List<dto> $$0, ih<dyk> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<drh<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
