import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JavaOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esy extends erw {
   public static final Codec<xp> a = xr.a.validate($$0 -> cya.g.encodeStart(JavaOps.INSTANCE, $$0).map($$1 -> $$0));
   public static final MapCodec<esy> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(cya.a(a).fieldOf("pages").forGetter($$0x -> $$0x.c), erv.a.forGetter($$0x -> $$0x.d))).apply($$0, esy::new)
   );
   private final List<arw<xp>> c;
   private final erv d;

   protected esy(List<etu> $$0, List<arw<xp>> $$1, erv $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cur a(cur $$0, eqk $$1) {
      $$0.a(km.J, cya.a, this::a);
      return $$0;
   }

   @VisibleForTesting
   public cya a(cya $$0) {
      List<arw<xp>> $$1 = this.d.a($$0.a(), this.c);
      return $$0.b($$1);
   }

   @Override
   public ery<esy> b() {
      return erz.N;
   }
}
