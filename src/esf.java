import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esf extends ers {
   public static final MapCodec<esf> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(vp.j.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, esf::new));
   private final ur b;

   private esf(List<etq> $$0, ur $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eru<esf> b() {
      return erv.j;
   }

   @Override
   public cun a(cun $$0, eqg $$1) {
      cxc.a(km.a, $$0, $$0x -> $$0x.a(this.b));
      return $$0;
   }

   @Deprecated
   public static ers.a<?> a(ur $$0) {
      return a($$1 -> new esf($$1, $$0));
   }
}
