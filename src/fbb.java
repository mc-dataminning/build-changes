import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fbb extends faa {
   public static final MapCodec<fbb> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(dcc.h.fieldOf("pages").forGetter($$0x -> $$0x.b), ezz.a.forGetter($$0x -> $$0x.c))).apply($$0, fbb::new)
   );
   private final List<asg<ww>> b;
   private final ezz c;

   protected fbb(List<fbw> $$0, List<asg<ww>> $$1, ezz $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cys a(cys $$0, eyn $$1) {
      $$0.a(kj.V, dcc.a, this::a);
      return $$0;
   }

   @VisibleForTesting
   public dcc a(dcc $$0) {
      List<asg<ww>> $$1 = this.c.a($$0.a(), this.b);
      return $$0.b($$1);
   }

   @Override
   public fac<fbb> b() {
      return fad.N;
   }
}
