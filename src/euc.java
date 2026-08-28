import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class euc extends etc {
   public static final MapCodec<euc> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(cya.d.fieldOf("pages").forGetter($$0x -> $$0x.b), etb.a(100).forGetter($$0x -> $$0x.c))).apply($$0, euc::new)
   );
   private final List<arl<String>> b;
   private final etb c;

   protected euc(List<eva> $$0, List<arl<String>> $$1, etb $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cuq a(cuq $$0, erp $$1) {
      $$0.a(kq.I, cya.a, this::a);
      return $$0;
   }

   public cya a(cya $$0) {
      List<arl<String>> $$1 = this.c.a($$0.a(), this.b, 100);
      return $$0.b($$1);
   }

   @Override
   public ete<euc> b() {
      return etf.O;
   }
}
