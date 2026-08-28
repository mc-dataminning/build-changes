import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class fbx extends fbg {
   public static final MapCodec<fbx> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axr.b(mh.aU).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, fbx::new)
   );
   private final axr<czg> b;

   private fbx(List<fdc> $$0, axr<czg> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fbi<fbx> b() {
      return fbj.G;
   }

   @Override
   public czn a(czn $$0, ezt $$1) {
      js<czg> $$2 = $$1.d().F_().f(mh.aU);
      Optional<jf<czg>> $$3 = $$2.a(this.b, $$1.b());
      if ($$3.isPresent()) {
         $$0.b(kk.ab, new dcd($$3.get()));
      }

      return $$0;
   }

   public static fbg.a<?> a(axr<czg> $$0) {
      return a($$1 -> new fbx($$1, $$0));
   }
}
