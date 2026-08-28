import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eyc extends exc {
   public static final MapCodec<eyc> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(czu.d.fieldOf("pages").forGetter($$0x -> $$0x.b), exb.a(100).forGetter($$0x -> $$0x.c))).apply($$0, eyc::new)
   );
   private final List<aru<String>> b;
   private final exb c;

   protected eyc(List<eyy> $$0, List<aru<String>> $$1, exb $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cwn a(cwn $$0, evp $$1) {
      $$0.a(kv.S, czu.a, this::a);
      return $$0;
   }

   public czu a(czu $$0) {
      List<aru<String>> $$1 = this.c.a($$0.a(), this.b, 100);
      return $$0.b($$1);
   }

   @Override
   public exe<eyc> b() {
      return exf.O;
   }
}
