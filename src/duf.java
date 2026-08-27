import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class duf implements dtr {
   public static final Codec<duf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(dtz.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, duf::new)
   );
   public final List<dtz.a> b;

   public duf(dja $$0, dja $$1) {
      this(ImmutableList.of(dtz.a(new ece($$0), $$1)));
   }

   public duf(List<dtz.a> $$0) {
      this.b = $$0;
   }
}
