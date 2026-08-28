import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ewm extends evp {
   static final MapCodec<ewm> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(eyk.a.fieldOf("amplifier").forGetter($$0x -> $$0x.b)).apply($$0, ewm::new));
   private final eyj b;

   private ewm(List<exn> $$0, eyj $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<ewv<?>> a() {
      return this.b.a();
   }

   @Override
   public evr<ewm> b() {
      return evs.Q;
   }

   @Override
   public cwb a(cwb $$0, euc $$1) {
      int $$2 = azk.a(this.b.a($$1), 0, 4);
      $$0.b(ku.aa, new cyz($$2));
      return $$0;
   }

   public eyj c() {
      return this.b;
   }

   public static evp.a<?> a(eyj $$0) {
      return a($$1 -> new ewm($$1, $$0));
   }
}
