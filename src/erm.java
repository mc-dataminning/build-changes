import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class erm extends esi {
   public static final MapCodec<erm> a = dxu.a.xmap(dxt.a::b, dkl::m).listOf().fieldOf("blocks").xmap(erm::new, $$0 -> $$0.e);
   public static final erm b = new erm(ImmutableList.of(dkn.pv));
   public static final erm c = new erm(ImmutableList.of(dkn.a));
   public static final erm d = new erm(ImmutableList.of(dkn.a, dkn.pv));
   private final ImmutableList<dkl> e;

   public erm(List<dkl> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public esl.d a(dhk $$0, jh $$1, jh $$2, esl.d $$3, esl.d $$4, esh $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected esk<?> a() {
      return esk.e;
   }
}
