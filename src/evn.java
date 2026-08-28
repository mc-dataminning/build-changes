import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class evn extends evj {
   public static final MapCodec<evn> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(etu.e.fieldOf("component").forGetter($$0x -> $$0x.b), evm.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, evn::new)
   );
   private final ett<?> b;
   private final evk c;

   private evn(List<exh> $$0, ett<?> $$1, evk $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public evl<evn> b() {
      return evm.u;
   }

   @Override
   public cvx a(cvx $$0, etw $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         this.b.a($$0, $$1x -> this.c.apply($$1x, $$1));
         return $$0;
      }
   }

   @Override
   public void a(euc $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
