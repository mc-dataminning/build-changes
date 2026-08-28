import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JavaOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esr extends erp {
   public static final Codec<xl> a = xn.a.validate($$0 -> cxt.g.encodeStart(JavaOps.INSTANCE, $$0).map($$1 -> $$0));
   public static final MapCodec<esr> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(cxt.a(a).fieldOf("pages").forGetter($$0x -> $$0x.c), ero.a.forGetter($$0x -> $$0x.d))).apply($$0, esr::new)
   );
   private final List<ars<xl>> c;
   private final ero d;

   protected esr(List<etn> $$0, List<ars<xl>> $$1, ero $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cuk a(cuk $$0, eqd $$1) {
      $$0.a(km.I, cxt.a, this::a);
      return $$0;
   }

   @VisibleForTesting
   public cxt a(cxt $$0) {
      List<ars<xl>> $$1 = this.d.a($$0.a(), this.c);
      return $$0.b($$1);
   }

   @Override
   public err<esr> b() {
      return ers.N;
   }
}
