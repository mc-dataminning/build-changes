import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class efu implements efg {
   public static final Codec<efu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(efo.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, efu::new)
   );
   public final List<efo.a> b;

   public efu(dua $$0, dua $$1) {
      this(ImmutableList.of(efo.a(new enu($$0), $$1)));
   }

   public efu(List<efo.a> $$0) {
      this.b = $$0;
   }
}
