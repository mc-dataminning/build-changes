import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class evd extends evj {
   public static final MapCodec<evd> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(etw.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, evd::new)
   );
   private final etw.b b;

   public evd(List<exh> $$0, etw.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public evl<evd> b() {
      return evm.B;
   }

   @Override
   public Set<ewp<?>> a() {
      return ImmutableSet.of(this.b.a());
   }

   @Override
   public cvx a(cvx $$0, etw $$1) {
      if ($$0.a(cwb.up) && $$1.c(this.b.a()) instanceof coh $$2) {
         $$0.b(kt.af, new cyu($$2.gj()));
      }

      return $$0;
   }

   public static evj.a<?> a(etw.b $$0) {
      return a($$1 -> new evd($$1, $$0));
   }
}
