import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dql implements dqa {
   public static final Codec<dql> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dum.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), dum.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, dql::new)
   );
   public final hg<dum> b;
   public final hg<dum> c;

   public dql(hg<dum> $$0, hg<dum> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<dnj<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
