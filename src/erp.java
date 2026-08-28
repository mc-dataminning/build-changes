import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class erp extends erv {
   public static final MapCodec<erp> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(eqj.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, erp::new)
   );
   private final eqj.b b;

   public erp(List<ett> $$0, eqj.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public erx<erp> b() {
      return ery.B;
   }

   @Override
   public Set<etc<?>> a() {
      return ImmutableSet.of(this.b.a());
   }

   @Override
   public cuq a(cuq $$0, eqj $$1) {
      if ($$0.a(cut.un) && $$1.c(this.b.a()) instanceof cmy $$2) {
         $$0.b(km.V, new cxs($$2.gb()));
      }

      return $$0;
   }

   public static erv.a<?> a(eqj.b $$0) {
      return a($$1 -> new erp($$1, $$0));
   }
}
