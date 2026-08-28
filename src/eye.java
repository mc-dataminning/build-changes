import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eye extends exe {
   public static final MapCodec<eye> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(czw.d.fieldOf("pages").forGetter($$0x -> $$0x.b), exd.a(100).forGetter($$0x -> $$0x.c))).apply($$0, eye::new)
   );
   private final List<aru<String>> b;
   private final exd c;

   protected eye(List<eza> $$0, List<aru<String>> $$1, exd $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cwp a(cwp $$0, evr $$1) {
      $$0.a(kv.S, czw.a, this::a);
      return $$0;
   }

   public czw a(czw $$0) {
      List<aru<String>> $$1 = this.c.a($$0.a(), this.b, 100);
      return $$0.b($$1);
   }

   @Override
   public exg<eye> b() {
      return exh.O;
   }
}
