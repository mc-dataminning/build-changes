import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class evu extends ewa {
   public static final MapCodec<evu> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(eun.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, evu::new)
   );
   private final eun.b b;

   public evu(List<exy> $$0, eun.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public ewc<evu> b() {
      return ewd.B;
   }

   @Override
   public Set<exg<?>> a() {
      return ImmutableSet.of(this.b.a());
   }

   @Override
   public cwm a(cwm $$0, eun $$1) {
      if ($$0.a(cwq.uF) && $$1.c(this.b.a()) instanceof cou $$2) {
         $$0.b(ku.ag, new czl($$2.gf()));
      }

      return $$0;
   }

   public static ewa.a<?> a(eun.b $$0) {
      return a($$1 -> new evu($$1, $$0));
   }
}
