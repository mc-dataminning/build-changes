import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class edq implements edc {
   public static final Codec<edq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(edk.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, edq::new)
   );
   public final List<edk.a> b;

   public edq(dsc $$0, dsc $$1) {
      this(ImmutableList.of(edk.a(new elp($$0), $$1)));
   }

   public edq(List<edk.a> $$0) {
      this.b = $$0;
   }
}
