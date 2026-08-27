import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class erq extends eqs {
   public static final MapCodec<erq> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(cwy.c.fieldOf("pages").forGetter($$0x -> $$0x.b), eqr.a(100).forGetter($$0x -> $$0x.c))).apply($$0, erq::new)
   );
   private final List<are<String>> b;
   private final eqr c;

   protected erq(List<esn> $$0, List<are<String>> $$1, eqr $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected ctq a(ctq $$0, eph $$1) {
      $$0.a(kb.H, cwy.a, this::a);
      return $$0;
   }

   public cwy a(cwy $$0) {
      List<are<String>> $$1 = this.c.a($$0.a(), this.b, 100);
      return $$0.b($$1);
   }

   @Override
   public equ b() {
      return eqv.L;
   }
}
