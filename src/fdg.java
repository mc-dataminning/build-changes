import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fdg extends fcg {
   public static final MapCodec<fdg> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(ddt.d.fieldOf("pages").forGetter($$0x -> $$0x.b), fcf.a(100).forGetter($$0x -> $$0x.c))).apply($$0, fdg::new)
   );
   private final List<ast<String>> b;
   private final fcf c;

   protected fdg(List<fec> $$0, List<ast<String>> $$1, fcf $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected dak a(dak $$0, fat $$1) {
      $$0.a(kl.U, ddt.a, this::a);
      return $$0;
   }

   public ddt a(ddt $$0) {
      List<ast<String>> $$1 = this.c.a($$0.a(), this.b, 100);
      return $$0.b($$1);
   }

   @Override
   public fci<fdg> b() {
      return fcj.O;
   }
}
