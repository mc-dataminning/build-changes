import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class dqh implements dpv {
   public static final Codec<dqh> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(dqh::new, dpl.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), duh.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<dpl> b;
   public final hg<duh> c;

   public dqh(List<dpl> $$0, hg<duh> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<dne<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
