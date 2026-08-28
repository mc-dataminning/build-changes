import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class est extends ers {
   public static final MapCodec<est> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(cxv.d.fieldOf("pages").forGetter($$0x -> $$0x.b), err.a(100).forGetter($$0x -> $$0x.c))).apply($$0, est::new)
   );
   private final List<arv<String>> b;
   private final err c;

   protected est(List<etq> $$0, List<arv<String>> $$1, err $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cun a(cun $$0, eqg $$1) {
      $$0.a(km.H, cxv.a, this::a);
      return $$0;
   }

   public cxv a(cxv $$0) {
      List<arv<String>> $$1 = this.c.a($$0.a(), this.b, 100);
      return $$0.b($$1);
   }

   @Override
   public eru<est> b() {
      return erv.O;
   }
}
