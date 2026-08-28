import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class exu extends exd {
   public static final MapCodec<exu> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axf.b(mc.I).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, exu::new)
   );
   private final axf<cwh> b;

   private exu(List<eyz> $$0, axf<cwh> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public exf<exu> b() {
      return exg.G;
   }

   @Override
   public cwo a(cwo $$0, evq $$1) {
      ke<cwh> $$2 = $$1.d().K_().e(mc.I);
      Optional<jr<cwh>> $$3 = $$2.a(this.b, $$1.b());
      if ($$3.isPresent()) {
         $$0.b(kv.Z, $$3.get());
      }

      return $$0;
   }

   public static exd.a<?> a(axf<cwh> $$0) {
      return a($$1 -> new exu($$1, $$0));
   }
}
