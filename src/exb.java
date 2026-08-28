import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JavaOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class exb extends ewa {
   public static final Codec<xj> a = xl.a.validate($$0 -> czu.g.encodeStart(JavaOps.INSTANCE, $$0).map($$1 -> $$0));
   public static final MapCodec<exb> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(czu.a(a).fieldOf("pages").forGetter($$0x -> $$0x.c), evz.a.forGetter($$0x -> $$0x.d))).apply($$0, exb::new)
   );
   private final List<ash<xj>> c;
   private final evz d;

   protected exb(List<exy> $$0, List<ash<xj>> $$1, evz $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cwm a(cwm $$0, eun $$1) {
      $$0.a(ku.T, czu.a, this::a);
      return $$0;
   }

   @VisibleForTesting
   public czu a(czu $$0) {
      List<ash<xj>> $$1 = this.d.a($$0.a(), this.c);
      return $$0.b($$1);
   }

   @Override
   public ewc<exb> b() {
      return ewd.N;
   }
}
