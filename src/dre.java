import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class dre implements dqs {
   public static final Codec<dre> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(dre::new, dqi.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), dve.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<dqi> b;
   public final ib<dve> c;

   public dre(List<dqi> $$0, ib<dve> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<dob<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
