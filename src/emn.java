import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class emn implements emc {
   public static final Codec<emn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eqr.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), eqr.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, emn::new)
   );
   public final jf<eqr> b;
   public final jf<eqr> c;

   public emn(jf<eqr> $$0, jf<eqr> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<ejk<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
