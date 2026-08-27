import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public class edj extends ecz {
   public static final Codec<edj> b = bna.b(dpy.b).comapFlatMap(edj::a, $$0 -> $$0.c).fieldOf("entries").codec();
   private final bna<dpy> c;

   private static DataResult<edj> a(bna<dpy> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new edj($$0));
   }

   public edj(bna<dpy> $$0) {
      this.c = $$0;
   }

   public edj(bna.a<dpy> $$0) {
      this($$0.a());
   }

   @Override
   protected eda<?> a() {
      return eda.b;
   }

   @Override
   public dpy a(ayd $$0, im $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
