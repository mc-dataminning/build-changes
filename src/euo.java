import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class euo extends euu {
   public static final MapCodec<euo> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(eth.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, euo::new)
   );
   private final eth.b b;

   public euo(List<ews> $$0, eth.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public euw<euo> b() {
      return eux.B;
   }

   @Override
   public Set<ewa<?>> a() {
      return ImmutableSet.of(this.b.a());
   }

   @Override
   public cvp a(cvp $$0, eth $$1) {
      if ($$0.a(cvt.up) && $$1.c(this.b.a()) instanceof cnu $$2) {
         $$0.b(kr.ab, new cys($$2.gb()));
      }

      return $$0;
   }

   public static euu.a<?> a(eth.b $$0) {
      return a($$1 -> new euo($$1, $$0));
   }
}
