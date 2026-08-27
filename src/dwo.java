import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dwo implements dwd {
   public static final Codec<dwo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eap.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), eap.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, dwo::new)
   );
   public final ij<eap> b;
   public final ij<eap> c;

   public dwo(ij<eap> $$0, ij<eap> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<dtm<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
