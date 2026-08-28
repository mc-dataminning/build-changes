import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eua extends eug {
   public static final MapCodec<eua> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(est.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, eua::new)
   );
   private final est.b b;

   public eua(List<ewe> $$0, est.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eui<eua> b() {
      return euj.B;
   }

   @Override
   public Set<evm<?>> a() {
      return ImmutableSet.of(this.b.a());
   }

   @Override
   public cvl a(cvl $$0, est $$1) {
      if ($$0.a(cvo.up) && $$1.c(this.b.a()) instanceof cnp $$2) {
         $$0.b(kr.Y, new cyn($$2.gb()));
      }

      return $$0;
   }

   public static eug.a<?> a(est.b $$0) {
      return a($$1 -> new eua($$1, $$0));
   }
}
