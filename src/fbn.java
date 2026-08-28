import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fbn extends fam {
   public static final MapCodec<fbn> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(dci.h.fieldOf("pages").forGetter($$0x -> $$0x.b), fal.a.forGetter($$0x -> $$0x.c))).apply($$0, fbn::new)
   );
   private final List<asi<wy>> b;
   private final fal c;

   protected fbn(List<fci> $$0, List<asi<wy>> $$1, fal $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cyy a(cyy $$0, eyz $$1) {
      $$0.a(kj.V, dci.a, this::a);
      return $$0;
   }

   @VisibleForTesting
   public dci a(dci $$0) {
      List<asi<wy>> $$1 = this.c.a($$0.a(), this.b);
      return $$0.b($$1);
   }

   @Override
   public fao<fbn> b() {
      return fap.N;
   }
}
