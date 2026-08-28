import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ehh implements egt {
   public static final Codec<ehh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(ehb.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, ehh::new)
   );
   public final List<ehb.a> b;

   public ehh(dvo $$0, dvo $$1) {
      this(ImmutableList.of(ehb.a(new eph($$0), $$1)));
   }

   public ehh(List<ehb.a> $$0) {
      this.b = $$0;
   }
}
