import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class ezp extends eyy {
   public static final MapCodec<ezp> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axp.b(me.I).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, ezp::new)
   );
   private final axp<cxr> b;

   private ezp(List<fau> $$0, axp<cxr> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eza<ezp> b() {
      return ezb.G;
   }

   @Override
   public cxy a(cxy $$0, exl $$1) {
      kf<cxr> $$2 = $$1.d().F_().f(me.I);
      Optional<js<cxr>> $$3 = $$2.a(this.b, $$1.b());
      if ($$3.isPresent()) {
         $$0.b(kx.ab, $$3.get());
      }

      return $$0;
   }

   public static eyy.a<?> a(axp<cxr> $$0) {
      return a($$1 -> new ezp($$1, $$0));
   }
}
