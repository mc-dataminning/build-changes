import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class emb implements elq {
   public static final Codec<emb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eqf.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), eqf.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, emb::new)
   );
   public final je<eqf> b;
   public final je<eqf> c;

   public emb(je<eqf> $$0, je<eqf> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<eiy<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
