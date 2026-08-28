import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eyv extends exv {
   public static final MapCodec<eyv> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(dan.d.fieldOf("pages").forGetter($$0x -> $$0x.b), exu.a(100).forGetter($$0x -> $$0x.c))).apply($$0, eyv::new)
   );
   private final List<asp<String>> b;
   private final exu c;

   protected eyv(List<ezr> $$0, List<asp<String>> $$1, exu $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cxg a(cxg $$0, ewi $$1) {
      $$0.a(ku.S, dan.a, this::a);
      return $$0;
   }

   public dan a(dan $$0) {
      List<asp<String>> $$1 = this.c.a($$0.a(), this.b, 100);
      return $$0.b($$1);
   }

   @Override
   public exx<eyv> b() {
      return exy.O;
   }
}
