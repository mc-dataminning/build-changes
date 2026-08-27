import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eqz extends eqq {
   public static final MapCodec<eqz> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(jy.b.fieldOf("components").forGetter($$0x -> $$0x.b)).apply($$0, eqz::new)
   );
   private final jy b;

   private eqz(List<esl> $$0, jy $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eqs b() {
      return eqt.j;
   }

   @Override
   public cto a(cto $$0, epf $$1) {
      $$0.a(this.b);
      return $$0;
   }

   public static <T> eqq.a<?> a(ka<T> $$0, T $$1) {
      return a($$2 -> new eqz($$2, jy.a().a($$0, $$1).a()));
   }
}
