import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class egx implements egj {
   public static final Codec<egx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(egr.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, egx::new)
   );
   public final List<egr.a> b;

   public egx(dvd $$0, dvd $$1) {
      this(ImmutableList.of(egr.a(new eox($$0), $$1)));
   }

   public egx(List<egr.a> $$0) {
      this.b = $$0;
   }
}
