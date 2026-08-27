import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dtu implements dtg {
   public static final Codec<dtu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(dto.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, dtu::new)
   );
   public final List<dto.a> b;

   public dtu(dip $$0, dip $$1) {
      this(ImmutableList.of(dto.a(new ebt($$0), $$1)));
   }

   public dtu(List<dto.a> $$0) {
      this.b = $$0;
   }
}
