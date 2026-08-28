import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eyk extends eyb {
   public static final MapCodec<eyk> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kr.b.fieldOf("components").forGetter($$0x -> $$0x.b)).apply($$0, eyk::new)
   );
   private final kr b;

   private eyk(List<ezx> $$0, kr $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eyd<eyk> b() {
      return eye.k;
   }

   @Override
   public cxo a(cxo $$0, ewo $$1) {
      $$0.a(this.b);
      return $$0;
   }

   public static <T> eyb.a<?> a(kt<T> $$0, T $$1) {
      return a($$2 -> new eyk($$2, kr.a().a($$0, $$1).a()));
   }
}
