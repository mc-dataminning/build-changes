import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fcx extends fbw {
   public static final MapCodec<fcx> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(ddk.h.fieldOf("pages").forGetter($$0x -> $$0x.b), fbv.a.forGetter($$0x -> $$0x.c))).apply($$0, fcx::new)
   );
   private final List<asm<xc>> b;
   private final fbv c;

   protected fcx(List<fds> $$0, List<asm<xc>> $$1, fbv $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected daa a(daa $$0, faj $$1) {
      $$0.a(kl.V, ddk.a, this::a);
      return $$0;
   }

   @VisibleForTesting
   public ddk a(ddk $$0) {
      List<asm<xc>> $$1 = this.c.a($$0.a(), this.b);
      return $$0.b($$1);
   }

   @Override
   public fby<fcx> b() {
      return fbz.N;
   }
}
