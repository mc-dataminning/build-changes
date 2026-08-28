import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esq extends erp {
   public static final MapCodec<esq> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(cxs.d.fieldOf("pages").forGetter($$0x -> $$0x.b), ero.a(100).forGetter($$0x -> $$0x.c))).apply($$0, esq::new)
   );
   private final List<ars<String>> b;
   private final ero c;

   protected esq(List<etn> $$0, List<ars<String>> $$1, ero $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cuk a(cuk $$0, eqd $$1) {
      $$0.a(km.H, cxs.a, this::a);
      return $$0;
   }

   public cxs a(cxs $$0) {
      List<ars<String>> $$1 = this.c.a($$0.a(), this.b, 100);
      return $$0.b($$1);
   }

   @Override
   public err<esq> b() {
      return ers.O;
   }
}
