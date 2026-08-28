import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class emi implements elx {
   public static final Codec<emi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eqm.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), eqm.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, emi::new)
   );
   public final jf<eqm> b;
   public final jf<eqm> c;

   public emi(jf<eqm> $$0, jf<eqm> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<ejf<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
