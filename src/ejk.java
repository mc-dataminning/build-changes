import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class ejk implements eiy {
   public static final Codec<ejk> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(ejk::new, eio.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), enn.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<eio> b;
   public final jr<enn> c;

   public ejk(List<eio> $$0, jr<enn> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<egg<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
