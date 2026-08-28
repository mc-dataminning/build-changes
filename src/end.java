import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class end implements emr {
   public static final Codec<end> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(end::new, emg.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), erh.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<emg> b;
   public final jg<erh> c;

   public end(List<emg> $$0, jg<erh> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<ejx<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
