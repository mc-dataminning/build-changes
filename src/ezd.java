import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JavaOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ezd extends eyc {
   public static final Codec<xv> a = xx.a.validate($$0 -> dax.g.encodeStart(JavaOps.INSTANCE, $$0).map($$1 -> $$0));
   public static final MapCodec<ezd> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(dax.a(a).fieldOf("pages").forGetter($$0x -> $$0x.c), eyb.a.forGetter($$0x -> $$0x.d))).apply($$0, ezd::new)
   );
   private final List<asz<xv>> c;
   private final eyb d;

   protected ezd(List<ezy> $$0, List<asz<xv>> $$1, eyb $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cxp a(cxp $$0, ewp $$1) {
      $$0.a(ku.T, dax.a, this::a);
      return $$0;
   }

   @VisibleForTesting
   public dax a(dax $$0) {
      List<asz<xv>> $$1 = this.d.a($$0.a(), this.c);
      return $$0.b($$1);
   }

   @Override
   public eye<ezd> b() {
      return eyf.N;
   }
}
