import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esu extends ert {
   public static final MapCodec<esu> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(cxw.d.fieldOf("pages").forGetter($$0x -> $$0x.b), ers.a(100).forGetter($$0x -> $$0x.c))).apply($$0, esu::new)
   );
   private final List<arv<String>> b;
   private final ers c;

   protected esu(List<etr> $$0, List<arv<String>> $$1, ers $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cuo a(cuo $$0, eqh $$1) {
      $$0.a(km.I, cxw.a, this::a);
      return $$0;
   }

   public cxw a(cxw $$0) {
      List<arv<String>> $$1 = this.c.a($$0.a(), this.b, 100);
      return $$0.b($$1);
   }

   @Override
   public erv<esu> b() {
      return erw.O;
   }
}
