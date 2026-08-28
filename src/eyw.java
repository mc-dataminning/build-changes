import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JavaOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eyw extends exv {
   public static final Codec<xk> a = xm.a.validate($$0 -> dao.g.encodeStart(JavaOps.INSTANCE, $$0).map($$1 -> $$0));
   public static final MapCodec<eyw> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(dao.a(a).fieldOf("pages").forGetter($$0x -> $$0x.c), exu.a.forGetter($$0x -> $$0x.d))).apply($$0, eyw::new)
   );
   private final List<asp<xk>> c;
   private final exu d;

   protected eyw(List<ezr> $$0, List<asp<xk>> $$1, exu $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cxg a(cxg $$0, ewi $$1) {
      $$0.a(ku.T, dao.a, this::a);
      return $$0;
   }

   @VisibleForTesting
   public dao a(dao $$0) {
      List<asp<xk>> $$1 = this.d.a($$0.a(), this.c);
      return $$0.b($$1);
   }

   @Override
   public exx<eyw> b() {
      return exy.N;
   }
}
