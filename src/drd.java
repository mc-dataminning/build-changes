import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class drd implements dqs {
   public static final Codec<drd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dve.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), dve.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, drd::new)
   );
   public final ib<dve> b;
   public final ib<dve> c;

   public drd(ib<dve> $$0, ib<dve> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<dob<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
