import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class duj implements dtx {
   public static final Codec<duj> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(duj::new, dtn.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), dyj.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<dtn> b;
   public final ih<dyj> c;

   public duj(List<dtn> $$0, ih<dyj> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<drg<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
