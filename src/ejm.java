import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ejm implements eiy {
   public static final Codec<ejm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(ejg.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, ejm::new)
   );
   public final List<ejg.a> b;

   public ejm(dxq $$0, dxq $$1) {
      this(ImmutableList.of(ejg.a(new erp($$0), $$1)));
   }

   public ejm(List<ejg.a> $$0) {
      this.b = $$0;
   }
}
