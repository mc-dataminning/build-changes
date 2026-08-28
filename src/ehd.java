import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ehd implements egp {
   public static final Codec<ehd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(egx.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, ehd::new)
   );
   public final List<egx.a> b;

   public ehd(dvj $$0, dvj $$1) {
      this(ImmutableList.of(egx.a(new epd($$0), $$1)));
   }

   public ehd(List<egx.a> $$0) {
      this.b = $$0;
   }
}
