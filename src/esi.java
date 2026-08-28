import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esi extends erv {
   public static final MapCodec<esi> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(vq.j.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, esi::new));
   private final us b;

   private esi(List<ett> $$0, us $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public erx<esi> b() {
      return ery.j;
   }

   @Override
   public cuq a(cuq $$0, eqj $$1) {
      cxf.a(km.b, $$0, $$0x -> $$0x.a(this.b));
      return $$0;
   }

   @Deprecated
   public static erv.a<?> a(us $$0) {
      return a($$1 -> new esi($$1, $$0));
   }
}
