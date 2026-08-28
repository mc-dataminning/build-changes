import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class edt implements edi {
   public static final Codec<edt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ehu.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), ehu.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, edt::new)
   );
   public final jj<ehu> b;
   public final jj<ehu> c;

   public edt(jj<ehu> $$0, jj<ehu> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<ear<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
