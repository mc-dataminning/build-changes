import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ejn implements eiz {
   public static final Codec<ejn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(ejh.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, ejn::new)
   );
   public final List<ejh.a> b;

   public ejn(dxu $$0, dxu $$1) {
      this(ImmutableList.of(ejh.a(new erp($$0), $$1)));
   }

   public ejn(List<ejh.a> $$0) {
      this.b = $$0;
   }
}
