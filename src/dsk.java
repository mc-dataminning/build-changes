import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dsk implements drz {
   public static final Codec<dsk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dwl.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), dwl.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, dsk::new)
   );
   public final ib<dwl> b;
   public final ib<dwl> c;

   public dsk(ib<dwl> $$0, ib<dwl> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<dpi<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
