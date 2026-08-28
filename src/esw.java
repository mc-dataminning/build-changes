import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esw extends erv {
   public static final MapCodec<esw> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(cxy.d.fieldOf("pages").forGetter($$0x -> $$0x.b), eru.a(100).forGetter($$0x -> $$0x.c))).apply($$0, esw::new)
   );
   private final List<arw<String>> b;
   private final eru c;

   protected esw(List<ett> $$0, List<arw<String>> $$1, eru $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cuq a(cuq $$0, eqj $$1) {
      $$0.a(km.I, cxy.a, this::a);
      return $$0;
   }

   public cxy a(cxy $$0) {
      List<arw<String>> $$1 = this.c.a($$0.a(), this.b, 100);
      return $$0.b($$1);
   }

   @Override
   public erx<esw> b() {
      return ery.O;
   }
}
