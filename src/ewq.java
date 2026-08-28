import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JavaOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ewq extends evp {
   public static final Codec<xi> a = xk.a.validate($$0 -> czj.g.encodeStart(JavaOps.INSTANCE, $$0).map($$1 -> $$0));
   public static final MapCodec<ewq> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(czj.a(a).fieldOf("pages").forGetter($$0x -> $$0x.c), evo.a.forGetter($$0x -> $$0x.d))).apply($$0, ewq::new)
   );
   private final List<asf<xi>> c;
   private final evo d;

   protected ewq(List<exn> $$0, List<asf<xi>> $$1, evo $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cwb a(cwb $$0, euc $$1) {
      $$0.a(ku.T, czj.a, this::a);
      return $$0;
   }

   @VisibleForTesting
   public czj a(czj $$0) {
      List<asf<xi>> $$1 = this.d.a($$0.a(), this.c);
      return $$0.b($$1);
   }

   @Override
   public evr<ewq> b() {
      return evs.N;
   }
}
