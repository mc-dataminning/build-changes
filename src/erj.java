import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class erj extends erp {
   public static final MapCodec<erj> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(eqd.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, erj::new)
   );
   private final eqd.b b;

   public erj(List<etn> $$0, eqd.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public err<erj> b() {
      return ers.B;
   }

   @Override
   public Set<esw<?>> a() {
      return ImmutableSet.of(this.b.a());
   }

   @Override
   public cuk a(cuk $$0, eqd $$1) {
      if ($$0.a(cun.un) && $$1.c(this.b.a()) instanceof cms $$2) {
         $$0.b(km.U, new cxm($$2.gb()));
      }

      return $$0;
   }

   public static erp.a<?> a(eqd.b $$0) {
      return a($$1 -> new erj($$1, $$0));
   }
}
