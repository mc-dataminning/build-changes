import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class edp implements edb {
   public static final Codec<edp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(edj.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, edp::new)
   );
   public final List<edj.a> b;

   public edp(dsb $$0, dsb $$1) {
      this(ImmutableList.of(edj.a(new elo($$0), $$1)));
   }

   public edp(List<edj.a> $$0) {
      this.b = $$0;
   }
}
