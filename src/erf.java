import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class erf extends esb {
   public static final MapCodec<erf> a = dxn.a.xmap(dxm.a::b, dke::m).listOf().fieldOf("blocks").xmap(erf::new, $$0 -> $$0.e);
   public static final erf b = new erf(ImmutableList.of(dkg.pv));
   public static final erf c = new erf(ImmutableList.of(dkg.a));
   public static final erf d = new erf(ImmutableList.of(dkg.a, dkg.pv));
   private final ImmutableList<dke> e;

   public erf(List<dke> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public ese.d a(dhd $$0, jh $$1, jh $$2, ese.d $$3, ese.d $$4, esa $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected esd<?> a() {
      return esd.e;
   }
}
