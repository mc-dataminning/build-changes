import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eyd extends exu {
   public static final MapCodec<eyd> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kr.b.fieldOf("components").forGetter($$0x -> $$0x.b)).apply($$0, eyd::new)
   );
   private final kr b;

   private eyd(List<ezs> $$0, kr $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public exw<eyd> b() {
      return exx.k;
   }

   @Override
   public cxk a(cxk $$0, ewh $$1) {
      $$0.a(this.b);
      return $$0;
   }

   public static <T> exu.a<?> a(kt<T> $$0, T $$1) {
      return a($$2 -> new eyd($$2, kr.a().a($$0, $$1).a()));
   }
}
