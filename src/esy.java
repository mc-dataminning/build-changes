import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class esy extends ete {
   public static final MapCodec<esy> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(err.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, esy::new)
   );
   private final err.b b;

   public esy(List<evc> $$0, err.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public etg<esy> b() {
      return eth.B;
   }

   @Override
   public Set<euk<?>> a() {
      return ImmutableSet.of(this.b.a());
   }

   @Override
   public cuq a(cuq $$0, err $$1) {
      if ($$0.a(cut.un) && $$1.c(this.b.a()) instanceof cmx $$2) {
         $$0.b(kq.W, new cxu($$2.fX()));
      }

      return $$0;
   }

   public static ete.a<?> a(err.b $$0) {
      return a($$1 -> new esy($$1, $$0));
   }
}
