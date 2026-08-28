import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class esw extends etc {
   public static final MapCodec<esw> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(erp.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, esw::new)
   );
   private final erp.b b;

   public esw(List<eva> $$0, erp.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public ete<esw> b() {
      return etf.B;
   }

   @Override
   public Set<eui<?>> a() {
      return ImmutableSet.of(this.b.a());
   }

   @Override
   public cuq a(cuq $$0, erp $$1) {
      if ($$0.a(cut.un) && $$1.c(this.b.a()) instanceof cmx $$2) {
         $$0.b(kq.W, new cxu($$2.fY()));
      }

      return $$0;
   }

   public static etc.a<?> a(erp.b $$0) {
      return a($$1 -> new esw($$1, $$0));
   }
}
