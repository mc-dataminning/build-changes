import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fcu extends fbw {
   public static final MapCodec<fcu> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(dbu.a.fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, fcu::new));
   private final jg<dbu> b;

   private fcu(List<fds> $$0, jg<dbu> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fby<fcu> b() {
      return fbz.F;
   }

   @Override
   public daa a(daa $$0, faj $$1) {
      $$0.a(kl.R, dbw.a, this.b, dbw::b);
      return $$0;
   }

   public static fbw.a<?> a(jg<dbu> $$0) {
      return a($$1 -> new fcu($$1, $$0));
   }
}
