import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eho implements eha {
   public static final Codec<eho> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(ehi.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, eho::new)
   );
   public final List<ehi.a> b;

   public eho(dvv $$0, dvv $$1) {
      this(ImmutableList.of(ehi.a(new epo($$0), $$1)));
   }

   public eho(List<ehi.a> $$0) {
      this.b = $$0;
   }
}
