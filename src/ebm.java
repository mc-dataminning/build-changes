import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ebm implements eay {
   public static final Codec<ebm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(ebg.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, ebm::new)
   );
   public final List<ebg.a> b;

   public ebm(dpy $$0, dpy $$1) {
      this(ImmutableList.of(ebg.a(new ejl($$0), $$1)));
   }

   public ebm(List<ebg.a> $$0) {
      this.b = $$0;
   }
}
