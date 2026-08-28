import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eiq implements eic {
   public static final Codec<eiq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(eik.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, eiq::new)
   );
   public final List<eik.a> b;

   public eiq(dwx $$0, dwx $$1) {
      this(ImmutableList.of(eik.a(new eqs($$0), $$1)));
   }

   public eiq(List<eik.a> $$0) {
      this.b = $$0;
   }
}
