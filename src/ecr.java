import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ecr implements ecd {
   public static final Codec<ecr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(ecl.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, ecr::new)
   );
   public final List<ecl.a> b;

   public ecr(drd $$0, drd $$1) {
      this(ImmutableList.of(ecl.a(new ekq($$0), $$1)));
   }

   public ecr(List<ecl.a> $$0) {
      this.b = $$0;
   }
}
