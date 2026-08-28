import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eve extends evj {
   public static final MapCodec<eve> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(ct.a.fieldOf("item_filter").forGetter($$0x -> $$0x.b), evm.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, eve::new)
   );
   private final ct b;
   private final evk c;

   private eve(List<exh> $$0, ct $$1, evk $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public evl<eve> b() {
      return evm.v;
   }

   @Override
   public cvx a(cvx $$0, etw $$1) {
      return this.b.a($$0) ? this.c.apply($$0, $$1) : $$0;
   }

   @Override
   public void a(euc $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
