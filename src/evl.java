import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class evl extends euu {
   public static final MapCodec<evl> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axj.b(lv.I).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, evl::new)
   );
   private final axj<cvh> b;

   private evl(List<ews> $$0, axj<cvh> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public euw<evl> b() {
      return eux.G;
   }

   @Override
   public cvp a(cvp $$0, eth $$1) {
      ka<cvh> $$2 = $$1.d().F_().d(lv.I);
      Optional<jn<cvh>> $$3 = $$2.a(this.b, $$1.b());
      if ($$3.isPresent()) {
         $$0.b(kr.U, $$3.get());
      }

      return $$0;
   }

   public static euu.a<?> a(axj<cvh> $$0) {
      return a($$1 -> new evl($$1, $$0));
   }
}
