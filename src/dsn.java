import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dsn implements drz {
   public static final Codec<dsn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(dsh.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, dsn::new)
   );
   public final List<dsh.a> b;

   public dsn(dhi $$0, dhi $$1) {
      this(ImmutableList.of(dsh.a(new eam($$0), $$1)));
   }

   public dsn(List<dsh.a> $$0) {
      this.b = $$0;
   }
}
