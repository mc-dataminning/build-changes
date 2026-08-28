import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ewb extends evj {
   public static final MapCodec<ewb> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(eye.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, ewb::new)
   );
   private final eyd b;
   private final boolean c;

   private ewb(List<exh> $$0, eyd $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public evl<ewb> b() {
      return evm.e;
   }

   @Override
   public Set<ewp<?>> a() {
      return this.b.a();
   }

   @Override
   public cvx a(cvx $$0, etw $$1) {
      int $$2 = this.c ? $$0.L() : 0;
      $$0.e($$2 + this.b.a($$1));
      return $$0;
   }

   public static evj.a<?> a(eyd $$0) {
      return a($$1 -> new ewb($$1, $$0, false));
   }

   public static evj.a<?> a(eyd $$0, boolean $$1) {
      return a($$2 -> new ewb($$2, $$0, $$1));
   }
}
