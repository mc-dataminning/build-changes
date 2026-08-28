import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class egj implements efy {
   public static final Codec<egj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ekk.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), ekk.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, egj::new)
   );
   public final jo<ekk> b;
   public final jo<ekk> c;

   public egj(jo<ekk> $$0, jo<ekk> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<edg<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
