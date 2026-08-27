import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dqe implements dpq {
   public static final Codec<dqe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(dpy.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, dqe::new)
   );
   public final List<dpy.a> b;

   public dqe(dez $$0, dez $$1) {
      this(ImmutableList.of(dpy.a(new dxw($$0), $$1)));
   }

   public dqe(List<dpy.a> $$0) {
      this.b = $$0;
   }
}
