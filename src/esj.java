import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esj extends erw {
   public static final MapCodec<esj> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(vq.j.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, esj::new));
   private final us b;

   private esj(List<etu> $$0, us $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public ery<esj> b() {
      return erz.j;
   }

   @Override
   public cur a(cur $$0, eqk $$1) {
      cxg.a(km.b, $$0, $$0x -> $$0x.a(this.b));
      return $$0;
   }

   @Deprecated
   public static erw.a<?> a(us $$0) {
      return a($$1 -> new esj($$1, $$0));
   }
}
