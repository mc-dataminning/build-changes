import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esk extends esb {
   public static final MapCodec<esk> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kk.b.fieldOf("components").forGetter($$0x -> $$0x.b)).apply($$0, esk::new)
   );
   private final kk b;

   private esk(List<etz> $$0, kk $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public esd<esk> b() {
      return ese.k;
   }

   @Override
   public cua a(cua $$0, eqo $$1) {
      $$0.a(this.b);
      return $$0;
   }

   public static <T> esb.a<?> a(km<T> $$0, T $$1) {
      return a($$2 -> new esk($$2, kk.a().a($$0, $$1).a()));
   }
}
