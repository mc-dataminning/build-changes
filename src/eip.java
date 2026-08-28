import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class eip implements eid {
   public static final Codec<eip> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(eip::new, eht.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), emr.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<eht> b;
   public final jr<emr> c;

   public eip(List<eht> $$0, jr<emr> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<efl<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
