import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class erm extends ers {
   public static final MapCodec<erm> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(eqg.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, erm::new)
   );
   private final eqg.b b;

   public erm(List<etq> $$0, eqg.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eru<erm> b() {
      return erv.B;
   }

   @Override
   public Set<esz<?>> a() {
      return ImmutableSet.of(this.b.a());
   }

   @Override
   public cun a(cun $$0, eqg $$1) {
      if ($$0.a(cuq.un) && $$1.c(this.b.a()) instanceof cmv $$2) {
         $$0.b(km.U, new cxp($$2.gb()));
      }

      return $$0;
   }

   public static ers.a<?> a(eqg.b $$0) {
      return a($$1 -> new erm($$1, $$0));
   }
}
