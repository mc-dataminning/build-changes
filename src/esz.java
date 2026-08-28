import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esz extends esb {
   public static final MapCodec<esz> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(lq.h.s().fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, esz::new));
   private final jj<cvz> b;

   private esz(List<etz> $$0, jj<cvz> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public esd<esz> b() {
      return ese.F;
   }

   @Override
   public cua a(cua $$0, eqo $$1) {
      $$0.a(kn.G, cwb.a, this.b, cwb::b);
      return $$0;
   }

   public static esb.a<?> a(jj<cvz> $$0) {
      return a($$1 -> new esz($$1, $$0));
   }
}
