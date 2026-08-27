import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dnd implements dms {
   public static final Codec<dnd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dre.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), dre.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, dnd::new)
   );
   public final he<dre> b;
   public final he<dre> c;

   public dnd(he<dre> $$0, he<dre> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<dkb<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
