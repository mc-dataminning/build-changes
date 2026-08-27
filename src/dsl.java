import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class dsl implements drz {
   public static final Codec<dsl> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(dsl::new, drp.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), dwl.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<drp> b;
   public final ib<dwl> c;

   public dsl(List<drp> $$0, ib<dwl> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<dpi<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
