import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fcs extends fbu {
   public static final MapCodec<fcs> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(dbs.a.fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, fcs::new));
   private final jf<dbs> b;

   private fcs(List<fdq> $$0, jf<dbs> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fbw<fcs> b() {
      return fbx.F;
   }

   @Override
   public czy a(czy $$0, fah $$1) {
      $$0.a(kk.R, dbu.a, this.b, dbu::b);
      return $$0;
   }

   public static fbu.a<?> a(jf<dbs> $$0) {
      return a($$1 -> new fcs($$1, $$0));
   }
}
