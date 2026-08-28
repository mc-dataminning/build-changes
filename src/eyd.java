import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JavaOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eyd extends exc {
   public static final Codec<wo> a = wq.a.validate($$0 -> czv.g.encodeStart(JavaOps.INSTANCE, $$0).map($$1 -> $$0));
   public static final MapCodec<eyd> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(czv.a(a).fieldOf("pages").forGetter($$0x -> $$0x.c), exb.a.forGetter($$0x -> $$0x.d))).apply($$0, eyd::new)
   );
   private final List<aru<wo>> c;
   private final exb d;

   protected eyd(List<eyy> $$0, List<aru<wo>> $$1, exb $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cwn a(cwn $$0, evp $$1) {
      $$0.a(kv.T, czv.a, this::a);
      return $$0;
   }

   @VisibleForTesting
   public czv a(czv $$0) {
      List<aru<wo>> $$1 = this.d.a($$0.a(), this.c);
      return $$0.b($$1);
   }

   @Override
   public exe<eyd> b() {
      return exf.N;
   }
}
