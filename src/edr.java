import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class edr implements edd {
   public static final Codec<edr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(edl.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, edr::new)
   );
   public final List<edl.a> b;

   public edr(dsd $$0, dsd $$1) {
      this(ImmutableList.of(edl.a(new elq($$0), $$1)));
   }

   public edr(List<edl.a> $$0) {
      this.b = $$0;
   }
}
