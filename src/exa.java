import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class exa extends exc {
   public static final MapCodec<exa> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(evo.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, exa::new));
   private final evo b;

   private exa(List<eyy> $$0, evo $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public exe<exa> b() {
      return exf.w;
   }

   @Override
   public Set<bah<?>> a() {
      return this.b.a();
   }

   @Override
   public cwn a(cwn $$0, evp $$1) {
      int $$2 = this.b.a($$1, $$0.M());
      $$0.e($$2);
      return $$0;
   }

   public static exc.a<?> a(evo $$0) {
      return a($$1 -> new exa($$1, $$0));
   }
}
