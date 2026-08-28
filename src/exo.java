import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class exo extends exf {
   public static final MapCodec<exo> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ks.b.fieldOf("components").forGetter($$0x -> $$0x.b)).apply($$0, exo::new)
   );
   private final ks b;

   private exo(List<ezb> $$0, ks $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public exh<exo> b() {
      return exi.k;
   }

   @Override
   public cwq a(cwq $$0, evs $$1) {
      $$0.a(this.b);
      return $$0;
   }

   public static <T> exf.a<?> a(ku<T> $$0, T $$1) {
      return a($$2 -> new exo($$2, ks.a().a($$0, $$1).a()));
   }
}
