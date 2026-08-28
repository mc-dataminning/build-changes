import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fco extends fbu {
   public static final MapCodec<fco> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(czu.e.fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, fco::new));
   private final jf<czu> b;

   private fco(List<fdq> $$0, jf<czu> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fbw<fco> b() {
      return fbx.f;
   }

   @Override
   public czy a(czy $$0, fah $$1) {
      return $$0.a(this.b.a());
   }
}
