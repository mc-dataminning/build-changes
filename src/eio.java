import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eio implements eid {
   public static final Codec<eio> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(emr.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), emr.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, eio::new)
   );
   public final jr<emr> b;
   public final jr<emr> c;

   public eio(jr<emr> $$0, jr<emr> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<efl<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
