import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JavaOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eyv extends exu {
   public static final Codec<xv> a = xx.a.validate($$0 -> das.g.encodeStart(JavaOps.INSTANCE, $$0).map($$1 -> $$0));
   public static final MapCodec<eyv> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(das.a(a).fieldOf("pages").forGetter($$0x -> $$0x.c), ext.a.forGetter($$0x -> $$0x.d))).apply($$0, eyv::new)
   );
   private final List<asz<xv>> c;
   private final ext d;

   protected eyv(List<ezs> $$0, List<asz<xv>> $$1, ext $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cxk a(cxk $$0, ewh $$1) {
      $$0.a(ku.T, das.a, this::a);
      return $$0;
   }

   @VisibleForTesting
   public das a(das $$0) {
      List<asz<xv>> $$1 = this.d.a($$0.a(), this.c);
      return $$0.b($$1);
   }

   @Override
   public exw<eyv> b() {
      return exx.N;
   }
}
