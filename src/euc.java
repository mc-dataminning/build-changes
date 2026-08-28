import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class euc extends ete {
   public static final MapCodec<euc> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(cws.a.fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, euc::new));
   private final jm<cws> b;

   private euc(List<evc> $$0, jm<cws> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public etg<euc> b() {
      return eth.F;
   }

   @Override
   public cuq a(cuq $$0, err $$1) {
      $$0.a(kq.G, cwu.a, this.b, cwu::b);
      return $$0;
   }

   public static ete.a<?> a(jm<cws> $$0) {
      return a($$1 -> new euc($$1, $$0));
   }
}
