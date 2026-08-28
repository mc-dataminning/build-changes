import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ekg implements ejv {
   public static final Codec<ekg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eok.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), eok.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, ekg::new)
   );
   public final js<eok> b;
   public final js<eok> c;

   public ekg(js<eok> $$0, js<eok> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<ehd<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
