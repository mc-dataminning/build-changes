import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JavaOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esx extends erv {
   public static final Codec<xp> a = xr.a.validate($$0 -> cxz.g.encodeStart(JavaOps.INSTANCE, $$0).map($$1 -> $$0));
   public static final MapCodec<esx> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(cxz.a(a).fieldOf("pages").forGetter($$0x -> $$0x.c), eru.a.forGetter($$0x -> $$0x.d))).apply($$0, esx::new)
   );
   private final List<arw<xp>> c;
   private final eru d;

   protected esx(List<ett> $$0, List<arw<xp>> $$1, eru $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cuq a(cuq $$0, eqj $$1) {
      $$0.a(km.J, cxz.a, this::a);
      return $$0;
   }

   @VisibleForTesting
   public cxz a(cxz $$0) {
      List<arw<xp>> $$1 = this.d.a($$0.a(), this.c);
      return $$0.b($$1);
   }

   @Override
   public erx<esx> b() {
      return ery.N;
   }
}
