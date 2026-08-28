import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class eqn extends erj {
   public static final MapCodec<eqn> a = dwv.a.xmap(dwu.a::b, djk::m).listOf().fieldOf("blocks").xmap(eqn::new, $$0 -> $$0.e);
   public static final eqn b = new eqn(ImmutableList.of(djm.pC));
   public static final eqn c = new eqn(ImmutableList.of(djm.a));
   public static final eqn d = new eqn(ImmutableList.of(djm.a, djm.pC));
   private final ImmutableList<djk> e;

   public eqn(List<djk> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public erm.d a(dgj $$0, ji $$1, ji $$2, erm.d $$3, erm.d $$4, eri $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected erl<?> a() {
      return erl.e;
   }
}
