import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esg extends ert {
   public static final MapCodec<esg> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(vp.j.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, esg::new));
   private final ur b;

   private esg(List<etr> $$0, ur $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public erv<esg> b() {
      return erw.j;
   }

   @Override
   public cuo a(cuo $$0, eqh $$1) {
      cxd.a(km.b, $$0, $$0x -> $$0x.a(this.b));
      return $$0;
   }

   @Deprecated
   public static ert.a<?> a(ur $$0) {
      return a($$1 -> new esg($$1, $$0));
   }
}
