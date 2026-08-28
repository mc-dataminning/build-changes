import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ekj implements ejv {
   public static final Codec<ekj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(ekd.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, ekj::new)
   );
   public final List<ekd.a> b;

   public ekj(dym $$0, dym $$1) {
      this(ImmutableList.of(ekd.a(new esm($$0), $$1)));
   }

   public ekj(List<ekd.a> $$0) {
      this.b = $$0;
   }
}
