import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class etp extends esy {
   public static final MapCodec<etp> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(awt.b(lu.I).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, etp::new)
   );
   private final awt<cug> b;

   private etp(List<euw> $$0, awt<cug> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eta<etp> b() {
      return etb.G;
   }

   @Override
   public cuo a(cuo $$0, erl $$1) {
      cuh.a($$0, this.b, $$1.b());
      return $$0;
   }

   public static esy.a<?> a(awt<cug> $$0) {
      return a($$1 -> new etp($$1, $$0));
   }
}
