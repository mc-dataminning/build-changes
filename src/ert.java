import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ert extends erv {
   public static final MapCodec<ert> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(eqi.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, ert::new));
   private final eqi b;

   private ert(List<ett> $$0, eqi $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public erx<ert> b() {
      return ery.w;
   }

   @Override
   public Set<etc<?>> a() {
      return this.b.a();
   }

   @Override
   public cuq a(cuq $$0, eqj $$1) {
      int $$2 = this.b.a($$1, $$0.I());
      $$0.e($$2);
      return $$0;
   }

   public static erv.a<?> a(eqi $$0) {
      return a($$1 -> new ert($$1, $$0));
   }
}
