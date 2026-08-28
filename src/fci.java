import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fci extends fbw {
   public static final MapCodec<fci> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(vb.f.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, fci::new));
   private final ua b;

   private fci(List<fds> $$0, ua $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fby<fci> b() {
      return fbz.j;
   }

   @Override
   public daa a(daa $$0, faj $$1) {
      dci.a(kl.b, $$0, $$0x -> $$0x.a(this.b));
      return $$0;
   }

   @Deprecated
   public static fbw.a<?> a(ua $$0) {
      return a($$1 -> new fci($$1, $$0));
   }
}
