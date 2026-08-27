import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public class dsg extends drw {
   public static final Codec<dsg> b = bfd.b(dfe.b).comapFlatMap(dsg::a, $$0 -> $$0.c).fieldOf("entries").codec();
   private final bfd<dfe> c;

   private static DataResult<dsg> a(bfd<dfe> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new dsg($$0));
   }

   public dsg(bfd<dfe> $$0) {
      this.c = $$0;
   }

   public dsg(bfd.a<dfe> $$0) {
      this($$0.a());
   }

   @Override
   protected drx<?> a() {
      return drx.b;
   }

   @Override
   public dfe a(arx $$0, gw $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
