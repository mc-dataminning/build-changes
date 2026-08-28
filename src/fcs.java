import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fcs extends fcg {
   public static final MapCodec<fcs> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(vb.f.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, fcs::new));
   private final ua b;

   private fcs(List<fec> $$0, ua $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fci<fcs> b() {
      return fcj.j;
   }

   @Override
   public dak a(dak $$0, fat $$1) {
      dcs.a(kl.b, $$0, $$0x -> $$0x.a(this.b));
      return $$0;
   }

   @Deprecated
   public static fcg.a<?> a(ua $$0) {
      return a($$1 -> new fcs($$1, $$0));
   }
}
