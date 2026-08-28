import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ewj extends evj {
   public static final MapCodec<ewj> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(czc.d.fieldOf("pages").forGetter($$0x -> $$0x.b), evi.a(100).forGetter($$0x -> $$0x.c))).apply($$0, ewj::new)
   );
   private final List<ase<String>> b;
   private final evi c;

   protected ewj(List<exh> $$0, List<ase<String>> $$1, evi $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cvx a(cvx $$0, etw $$1) {
      $$0.a(kt.R, czc.a, this::a);
      return $$0;
   }

   public czc a(czc $$0) {
      List<ase<String>> $$1 = this.c.a($$0.a(), this.b, 100);
      return $$0.b($$1);
   }

   @Override
   public evl<ewj> b() {
      return evm.O;
   }
}
