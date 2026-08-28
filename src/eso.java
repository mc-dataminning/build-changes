import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eso extends erw {
   public static final MapCodec<eso> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axf.b(lq.E).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, eso::new)
   );
   private final axf<cuj> b;

   private eso(List<etu> $$0, axf<cuj> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public ery<eso> b() {
      return erz.G;
   }

   @Override
   public cur a(cur $$0, eqk $$1) {
      cuk.a($$0, this.b, $$1.b());
      return $$0;
   }

   public static erw.a<?> a(axf<cuj> $$0) {
      return a($$1 -> new eso($$1, $$0));
   }
}
