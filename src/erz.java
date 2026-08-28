import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class erz extends erp {
   public static final MapCodec<erz> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kj.b.fieldOf("components").forGetter($$0x -> $$0x.b)).apply($$0, erz::new)
   );
   private final kj b;

   private erz(List<etn> $$0, kj $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public err<erz> b() {
      return ers.k;
   }

   @Override
   public cuk a(cuk $$0, eqd $$1) {
      $$0.a(this.b);
      return $$0;
   }

   public static <T> erp.a<?> a(kl<T> $$0, T $$1) {
      return a($$2 -> new erz($$2, kj.a().a($$0, $$1).a()));
   }
}
