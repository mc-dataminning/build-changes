import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class eul extends eus {
   public final axr<dma> a;
   public static final MapCodec<eul> b = axr.b(mg.i).xmap(eul::new, $$0 -> $$0.a).fieldOf("value");

   public eul(axr<dma> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public euv.d a(diy $$0, iu $$1, iu $$2, euv.d $$3, euv.d $$4, eur $$5) {
      return eje.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected euu<?> a() {
      return euu.n;
   }
}
