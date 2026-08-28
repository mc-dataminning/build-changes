import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fam extends faa {
   public static final MapCodec<fam> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(uv.j.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, fam::new));
   private final tx b;

   private fam(List<fbw> $$0, tx $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fac<fam> b() {
      return fad.j;
   }

   @Override
   public cys a(cys $$0, eyn $$1) {
      dba.a(kj.b, $$0, $$0x -> $$0x.a(this.b));
      return $$0;
   }

   @Deprecated
   public static faa.a<?> a(tx $$0) {
      return a($$1 -> new fam($$1, $$0));
   }
}
