import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class eys extends eyb {
   public static final MapCodec<eys> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axf.b(mc.I).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, eys::new)
   );
   private final axf<cxa> b;

   private eys(List<ezx> $$0, axf<cxa> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eyd<eys> b() {
      return eye.G;
   }

   @Override
   public cxh a(cxh $$0, ewo $$1) {
      ke<cxa> $$2 = $$1.d().F_().e(mc.I);
      Optional<jr<cxa>> $$3 = $$2.a(this.b, $$1.b());
      if ($$3.isPresent()) {
         $$0.b(kv.ab, $$3.get());
      }

      return $$0;
   }

   public static eyb.a<?> a(axf<cxa> $$0) {
      return a($$1 -> new eys($$1, $$0));
   }
}
