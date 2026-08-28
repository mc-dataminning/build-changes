import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eyf extends exf {
   public static final MapCodec<eyf> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(czx.d.fieldOf("pages").forGetter($$0x -> $$0x.b), exe.a(100).forGetter($$0x -> $$0x.c))).apply($$0, eyf::new)
   );
   private final List<arv<String>> b;
   private final exe c;

   protected eyf(List<ezb> $$0, List<arv<String>> $$1, exe $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cwq a(cwq $$0, evs $$1) {
      $$0.a(kv.S, czx.a, this::a);
      return $$0;
   }

   public czx a(czx $$0) {
      List<arv<String>> $$1 = this.c.a($$0.a(), this.b, 100);
      return $$0.b($$1);
   }

   @Override
   public exh<eyf> b() {
      return exi.O;
   }
}
