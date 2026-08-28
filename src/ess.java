import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ess extends esj {
   public static final MapCodec<ess> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kk.b.fieldOf("components").forGetter($$0x -> $$0x.b)).apply($$0, ess::new)
   );
   private final kk b;

   private ess(List<euh> $$0, kk $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public esl<ess> b() {
      return esm.k;
   }

   @Override
   public cud a(cud $$0, eqw $$1) {
      $$0.a(this.b);
      return $$0;
   }

   public static <T> esj.a<?> a(km<T> $$0, T $$1) {
      return a($$2 -> new ess($$2, kk.a().a($$0, $$1).a()));
   }
}
