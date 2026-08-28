import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ess extends esb {
   public static final MapCodec<ess> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(awk.b(lr.I).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, ess::new)
   );
   private final awk<cts> b;

   private ess(List<etz> $$0, awk<cts> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public esd<ess> b() {
      return ese.G;
   }

   @Override
   public cua a(cua $$0, eqo $$1) {
      ctt.a($$0, this.b, $$1.b());
      return $$0;
   }

   public static esb.a<?> a(awk<cts> $$0) {
      return a($$1 -> new ess($$1, $$0));
   }
}
