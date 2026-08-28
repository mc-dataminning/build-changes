import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class ekh implements ejv {
   public static final Codec<ekh> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(ekh::new, ejl.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), eok.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<ejl> b;
   public final js<eok> c;

   public ekh(List<ejl> $$0, js<eok> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<ehd<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
