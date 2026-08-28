import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JavaOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class evh extends eug {
   public static final Codec<xd> a = xf.a.validate($$0 -> cyu.g.encodeStart(JavaOps.INSTANCE, $$0).map($$1 -> $$0));
   public static final MapCodec<evh> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(cyu.a(a).fieldOf("pages").forGetter($$0x -> $$0x.c), euf.a.forGetter($$0x -> $$0x.d))).apply($$0, evh::new)
   );
   private final List<arx<xd>> c;
   private final euf d;

   protected evh(List<ewe> $$0, List<arx<xd>> $$1, euf $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cvl a(cvl $$0, est $$1) {
      $$0.a(kr.L, cyu.a, this::a);
      return $$0;
   }

   @VisibleForTesting
   public cyu a(cyu $$0) {
      List<arx<xd>> $$1 = this.d.a($$0.a(), this.c);
      return $$0.b($$1);
   }

   @Override
   public eui<evh> b() {
      return euj.N;
   }
}
