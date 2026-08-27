import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dwk implements dvw {
   public static final Codec<dwk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(dwe.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, dwk::new)
   );
   public final List<dwe.a> b;

   public dwk(dlf $$0, dlf $$1) {
      this(ImmutableList.of(dwe.a(new eej($$0), $$1)));
   }

   public dwk(List<dwe.a> $$0) {
      this.b = $$0;
   }
}
