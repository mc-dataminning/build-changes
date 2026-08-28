import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eds implements ede {
   public static final Codec<eds> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(edm.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, eds::new)
   );
   public final List<edm.a> b;

   public eds(dse $$0, dse $$1) {
      this(ImmutableList.of(edm.a(new elr($$0), $$1)));
   }

   public eds(List<edm.a> $$0) {
      this.b = $$0;
   }
}
