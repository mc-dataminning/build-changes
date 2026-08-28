import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fay extends fam {
   public static final MapCodec<fay> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(ux.j.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, fay::new));
   private final tz b;

   private fay(List<fci> $$0, tz $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fao<fay> b() {
      return fap.j;
   }

   @Override
   public cyy a(cyy $$0, eyz $$1) {
      dbg.a(kj.b, $$0, $$0x -> $$0x.a(this.b));
      return $$0;
   }

   @Deprecated
   public static fam.a<?> a(tz $$0) {
      return a($$1 -> new fay($$1, $$0));
   }
}
