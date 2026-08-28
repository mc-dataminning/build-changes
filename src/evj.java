import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class evj extends evp {
   public static final MapCodec<evj> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(euc.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, evj::new)
   );
   private final euc.b b;

   public evj(List<exn> $$0, euc.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public evr<evj> b() {
      return evs.B;
   }

   @Override
   public Set<ewv<?>> a() {
      return ImmutableSet.of(this.b.a());
   }

   @Override
   public cwb a(cwb $$0, euc $$1) {
      if ($$0.a(cwf.up) && $$1.c(this.b.a()) instanceof com $$2) {
         $$0.b(ku.ag, new cza($$2.gj()));
      }

      return $$0;
   }

   public static evp.a<?> a(euc.b $$0) {
      return a($$1 -> new evj($$1, $$0));
   }
}
