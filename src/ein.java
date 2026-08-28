import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class ein implements eib {
   public static final Codec<ein> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(ein::new, ehr.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), emp.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<ehr> b;
   public final jr<emp> c;

   public ein(List<ehr> $$0, jr<emp> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<efj<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
