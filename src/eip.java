import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eip implements eib {
   public static final Codec<eip> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(eij.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, eip::new)
   );
   public final List<eij.a> b;

   public eip(dww $$0, dww $$1) {
      this(ImmutableList.of(eij.a(new eqr($$0), $$1)));
   }

   public eip(List<eij.a> $$0) {
      this.b = $$0;
   }
}
