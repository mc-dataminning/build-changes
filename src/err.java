import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JavaOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class err extends eqs {
   public static final Codec<wx> a = wz.a.validate($$0 -> cwz.h.encodeStart(JavaOps.INSTANCE, $$0).map($$1 -> $$0));
   public static final MapCodec<err> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(cwz.a(a).fieldOf("pages").forGetter($$0x -> $$0x.c), eqr.a(100).forGetter($$0x -> $$0x.d))).apply($$0, err::new)
   );
   private final List<are<wx>> c;
   private final eqr d;

   protected err(List<esn> $$0, List<are<wx>> $$1, eqr $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected ctq a(ctq $$0, eph $$1) {
      $$0.a(kb.I, cwz.a, this::a);
      return $$0;
   }

   @VisibleForTesting
   public cwz a(cwz $$0) {
      List<are<wx>> $$1 = this.d.a($$0.a(), this.c, 100);
      return $$0.b($$1);
   }

   @Override
   public equ b() {
      return eqv.K;
   }
}
