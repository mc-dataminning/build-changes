import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class etn extends ete {
   public static final MapCodec<etn> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kn.b.fieldOf("components").forGetter($$0x -> $$0x.b)).apply($$0, etn::new)
   );
   private final kn b;

   private etn(List<evc> $$0, kn $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public etg<etn> b() {
      return eth.k;
   }

   @Override
   public cuq a(cuq $$0, err $$1) {
      $$0.a(this.b);
      return $$0;
   }

   public static <T> ete.a<?> a(kp<T> $$0, T $$1) {
      return a($$2 -> new etn($$2, kn.a().a($$0, $$1).a()));
   }
}
