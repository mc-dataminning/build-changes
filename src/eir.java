import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eir implements eid {
   public static final Codec<eir> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(eil.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, eir::new)
   );
   public final List<eil.a> b;

   public eir(dwy $$0, dwy $$1) {
      this(ImmutableList.of(eil.a(new eqt($$0), $$1)));
   }

   public eir(List<eil.a> $$0) {
      this.b = $$0;
   }
}
