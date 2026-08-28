import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class esj extends erv {
   static final MapCodec<esj> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(eup.a.fieldOf("value").forGetter($$0x -> $$0x.b)).apply($$0, esj::new));
   private final euo b;

   private esj(List<ett> $$0, euo $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<etc<?>> a() {
      return this.b.a();
   }

   @Override
   public erx<esj> b() {
      return ery.R;
   }

   @Override
   public cuq a(cuq $$0, eqj $$1) {
      $$0.b(km.o, new cxg(this.b.a($$1)));
      return $$0;
   }
}
