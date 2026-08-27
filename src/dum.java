import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dum implements dty {
   public static final Codec<dum> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(dug.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, dum::new)
   );
   public final List<dug.a> b;

   public dum(djh $$0, djh $$1) {
      this(ImmutableList.of(dug.a(new ecl($$0), $$1)));
   }

   public dum(List<dug.a> $$0) {
      this.b = $$0;
   }
}
