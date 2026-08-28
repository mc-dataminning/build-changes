import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ewg extends evj {
   static final MapCodec<ewg> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(eye.a.fieldOf("amplifier").forGetter($$0x -> $$0x.b)).apply($$0, ewg::new));
   private final eyd b;

   private ewg(List<exh> $$0, eyd $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<ewp<?>> a() {
      return this.b.a();
   }

   @Override
   public evl<ewg> b() {
      return evm.Q;
   }

   @Override
   public cvx a(cvx $$0, etw $$1) {
      int $$2 = azj.a(this.b.a($$1), 0, 4);
      $$0.b(kt.Z, new cyt($$2));
      return $$0;
   }

   public eyd c() {
      return this.b;
   }

   public static evj.a<?> a(eyd $$0) {
      return a($$1 -> new ewg($$1, $$0));
   }
}
