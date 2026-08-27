import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

public class equ extends epw {
   public static final Codec<wu> a = axh.b(ww.a, (Function<wu, DataResult<wu>>)($$0 -> cwg.h.encodeStart(axs.a, $$0).map($$1 -> $$0)));
   public static final Codec<equ> b = RecordCodecBuilder.create(
      $$0 -> a($$0).and($$0.group(cwg.a(a).fieldOf("pages").forGetter($$0x -> $$0x.c), epv.a(100).forGetter($$0x -> $$0x.d))).apply($$0, equ::new)
   );
   private final List<aqy<wu>> c;
   private final epv d;

   protected equ(List<erq> $$0, List<aqy<wu>> $$1, epv $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected csz a(csz $$0, eol $$1) {
      $$0.a(ka.H, cwg.a, this::a);
      return $$0;
   }

   @VisibleForTesting
   public cwg a(cwg $$0) {
      List<aqy<wu>> $$1 = this.d.a($$0.a(), this.c, 100);
      return $$0.b($$1);
   }

   @Override
   public epy b() {
      return epz.K;
   }
}
