import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ezc extends eyc {
   public static final MapCodec<ezc> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(daw.d.fieldOf("pages").forGetter($$0x -> $$0x.b), eyb.a(100).forGetter($$0x -> $$0x.c))).apply($$0, ezc::new)
   );
   private final List<asz<String>> b;
   private final eyb c;

   protected ezc(List<ezy> $$0, List<asz<String>> $$1, eyb $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cxp a(cxp $$0, ewp $$1) {
      $$0.a(ku.S, daw.a, this::a);
      return $$0;
   }

   public daw a(daw $$0) {
      List<asz<String>> $$1 = this.c.a($$0.a(), this.b, 100);
      return $$0.b($$1);
   }

   @Override
   public eye<ezc> b() {
      return eyf.O;
   }
}
