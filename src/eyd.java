import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eyd extends exd {
   public static final MapCodec<eyd> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(czv.d.fieldOf("pages").forGetter($$0x -> $$0x.b), exc.a(100).forGetter($$0x -> $$0x.c))).apply($$0, eyd::new)
   );
   private final List<arv<String>> b;
   private final exc c;

   protected eyd(List<eyz> $$0, List<arv<String>> $$1, exc $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cwo a(cwo $$0, evq $$1) {
      $$0.a(kv.S, czv.a, this::a);
      return $$0;
   }

   public czv a(czv $$0) {
      List<arv<String>> $$1 = this.c.a($$0.a(), this.b, 100);
      return $$0.b($$1);
   }

   @Override
   public exf<eyd> b() {
      return exg.O;
   }
}
