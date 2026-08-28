import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ell implements ekx {
   public static final Codec<ell> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(elf.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, ell::new)
   );
   public final List<elf.a> b;

   public ell(dzo $$0, dzo $$1) {
      this(ImmutableList.of(elf.a(new eto($$0), $$1)));
   }

   public ell(List<elf.a> $$0) {
      this.b = $$0;
   }
}
