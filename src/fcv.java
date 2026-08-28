import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fcv extends fbu {
   public static final MapCodec<fcv> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(ddi.h.fieldOf("pages").forGetter($$0x -> $$0x.b), fbt.a.forGetter($$0x -> $$0x.c))).apply($$0, fcv::new)
   );
   private final List<ask<xa>> b;
   private final fbt c;

   protected fcv(List<fdq> $$0, List<ask<xa>> $$1, fbt $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected czy a(czy $$0, fah $$1) {
      $$0.a(kk.V, ddi.a, this::a);
      return $$0;
   }

   @VisibleForTesting
   public ddi a(ddi $$0) {
      List<ask<xa>> $$1 = this.c.a($$0.a(), this.b);
      return $$0.b($$1);
   }

   @Override
   public fbw<fcv> b() {
      return fbx.N;
   }
}
