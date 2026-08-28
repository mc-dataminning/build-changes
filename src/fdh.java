import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fdh extends fcg {
   public static final MapCodec<fdh> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(ddu.h.fieldOf("pages").forGetter($$0x -> $$0x.b), fcf.a.forGetter($$0x -> $$0x.c))).apply($$0, fdh::new)
   );
   private final List<ast<xg>> b;
   private final fcf c;

   protected fdh(List<fec> $$0, List<ast<xg>> $$1, fcf $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected dak a(dak $$0, fat $$1) {
      $$0.a(kl.V, ddu.a, this::a);
      return $$0;
   }

   @VisibleForTesting
   public ddu a(ddu $$0) {
      List<ast<xg>> $$1 = this.c.a($$0.a(), this.b);
      return $$0.b($$1);
   }

   @Override
   public fci<fdh> b() {
      return fcj.N;
   }
}
