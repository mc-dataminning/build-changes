import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class eim implements eia {
   public static final Codec<eim> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(eim::new, ehq.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), emo.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<ehq> b;
   public final jr<emo> c;

   public eim(List<ehq> $$0, jr<emo> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<efi<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
