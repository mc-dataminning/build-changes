import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class evo implements evk {
   public static final MapCodec<evo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(evm.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, evo::new)
   );
   public static final Codec<evo> b = evm.b.listOf().xmap(evo::new, $$0 -> $$0.c);
   private final List<evk> c;
   private final BiFunction<cvx, etw, cvx> d;

   private evo(List<evk> $$0) {
      this.c = $$0;
      this.d = evm.a($$0);
   }

   public static evo a(List<evk> $$0) {
      return new evo(List.copyOf($$0));
   }

   public cvx a(cvx $$0, etw $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(euc $$0) {
      evk.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public evl<evo> b() {
      return evm.I;
   }
}
