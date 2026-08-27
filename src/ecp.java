import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ecp implements ecb {
   public static final Codec<ecp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(ecj.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, ecp::new)
   );
   public final List<ecj.a> b;

   public ecp(drb $$0, drb $$1) {
      this(ImmutableList.of(ecj.a(new eko($$0), $$1)));
   }

   public ecp(List<ecj.a> $$0) {
      this.b = $$0;
   }
}
