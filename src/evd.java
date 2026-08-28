import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class evd extends euu {
   public static final MapCodec<evd> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ko.b.fieldOf("components").forGetter($$0x -> $$0x.b)).apply($$0, evd::new)
   );
   private final ko b;

   private evd(List<ews> $$0, ko $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public euw<evd> b() {
      return eux.k;
   }

   @Override
   public cvp a(cvp $$0, eth $$1) {
      $$0.a(this.b);
      return $$0;
   }

   public static <T> euu.a<?> a(kq<T> $$0, T $$1) {
      return a($$2 -> new evd($$2, ko.a().a($$0, $$1).a()));
   }
}
