import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class egm implements efy {
   public static final Codec<egm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(egg.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, egm::new)
   );
   public final List<egg.a> b;

   public egm(dus $$0, dus $$1) {
      this(ImmutableList.of(egg.a(new eom($$0), $$1)));
   }

   public egm(List<egg.a> $$0) {
      this.b = $$0;
   }
}
