import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eww extends exc {
   public static final MapCodec<eww> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(evp.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, eww::new)
   );
   private final evp.b b;

   public eww(List<eyy> $$0, evp.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public exe<eww> b() {
      return exf.B;
   }

   @Override
   public Set<bah<?>> a() {
      return Set.of(this.b.a());
   }

   @Override
   public cwn a(cwn $$0, evp $$1) {
      if ($$0.a(cwr.vm) && $$1.c(this.b.a()) instanceof cov $$2) {
         $$0.b(kv.ag, new czm($$2.gh()));
      }

      return $$0;
   }

   public static exc.a<?> a(evp.b $$0) {
      return a($$1 -> new eww($$1, $$0));
   }
}
