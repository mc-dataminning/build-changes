import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dqb implements dpq {
   public static final Codec<dqb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(duc.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), duc.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, dqb::new)
   );
   public final he<duc> b;
   public final he<duc> c;

   public dqb(he<duc> $$0, he<duc> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<dmz<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
