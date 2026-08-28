import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class egg implements efu {
   public static final Codec<egg> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(egg::new, efk.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), ekg.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<efk> b;
   public final jn<ekg> c;

   public egg(List<efk> $$0, jn<ekg> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<edc<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
