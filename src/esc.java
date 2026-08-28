import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esc extends ers {
   public static final MapCodec<esc> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kj.b.fieldOf("components").forGetter($$0x -> $$0x.b)).apply($$0, esc::new)
   );
   private final kj b;

   private esc(List<etq> $$0, kj $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eru<esc> b() {
      return erv.k;
   }

   @Override
   public cun a(cun $$0, eqg $$1) {
      $$0.a(this.b);
      return $$0;
   }

   public static <T> ers.a<?> a(kl<T> $$0, T $$1) {
      return a($$2 -> new esc($$2, kj.a().a($$0, $$1).a()));
   }
}
