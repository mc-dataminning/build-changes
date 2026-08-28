import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JavaOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ewu extends evt {
   public static final Codec<xl> a = xn.a.validate($$0 -> czn.g.encodeStart(JavaOps.INSTANCE, $$0).map($$1 -> $$0));
   public static final MapCodec<ewu> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(czn.a(a).fieldOf("pages").forGetter($$0x -> $$0x.c), evs.a.forGetter($$0x -> $$0x.d))).apply($$0, ewu::new)
   );
   private final List<asi<xl>> c;
   private final evs d;

   protected ewu(List<exr> $$0, List<asi<xl>> $$1, evs $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cwf a(cwf $$0, eug $$1) {
      $$0.a(ku.T, czn.a, this::a);
      return $$0;
   }

   @VisibleForTesting
   public czn a(czn $$0) {
      List<asi<xl>> $$1 = this.d.a($$0.a(), this.c);
      return $$0.b($$1);
   }

   @Override
   public evv<ewu> b() {
      return evw.N;
   }
}
