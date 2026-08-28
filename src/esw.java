import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JavaOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esw extends eru {
   public static final Codec<xp> a = xr.a.validate($$0 -> cxy.g.encodeStart(JavaOps.INSTANCE, $$0).map($$1 -> $$0));
   public static final MapCodec<esw> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(cxy.a(a).fieldOf("pages").forGetter($$0x -> $$0x.c), ert.a.forGetter($$0x -> $$0x.d))).apply($$0, esw::new)
   );
   private final List<arw<xp>> c;
   private final ert d;

   protected esw(List<ets> $$0, List<arw<xp>> $$1, ert $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cup a(cup $$0, eqi $$1) {
      $$0.a(km.J, cxy.a, this::a);
      return $$0;
   }

   @VisibleForTesting
   public cxy a(cxy $$0) {
      List<arw<xp>> $$1 = this.d.a($$0.a(), this.c);
      return $$0.b($$1);
   }

   @Override
   public erw<esw> b() {
      return erx.N;
   }
}
