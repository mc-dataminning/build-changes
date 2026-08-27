import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JavaOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class erp extends eqq {
   public static final Codec<wx> a = wz.a.validate($$0 -> cwx.h.encodeStart(JavaOps.INSTANCE, $$0).map($$1 -> $$0));
   public static final MapCodec<erp> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(cwx.a(a).fieldOf("pages").forGetter($$0x -> $$0x.c), eqp.a(100).forGetter($$0x -> $$0x.d))).apply($$0, erp::new)
   );
   private final List<ard<wx>> c;
   private final eqp d;

   protected erp(List<esl> $$0, List<ard<wx>> $$1, eqp $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cto a(cto $$0, epf $$1) {
      $$0.a(kb.I, cwx.a, this::a);
      return $$0;
   }

   @VisibleForTesting
   public cwx a(cwx $$0) {
      List<ard<wx>> $$1 = this.d.a($$0.a(), this.c, 100);
      return $$0.b($$1);
   }

   @Override
   public eqs b() {
      return eqt.K;
   }
}
