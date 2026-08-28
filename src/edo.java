import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class edo implements eda {
   public static final Codec<edo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(edi.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, edo::new)
   );
   public final List<edi.a> b;

   public edo(dsa $$0, dsa $$1) {
      this(ImmutableList.of(edi.a(new eln($$0), $$1)));
   }

   public edo(List<edi.a> $$0) {
      this.b = $$0;
   }
}
