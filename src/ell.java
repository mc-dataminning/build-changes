import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class ell extends emg {
   public static final MapCodec<ell> a = dsb.b.xmap(dsa.a::b, dey::o).listOf().fieldOf("blocks").xmap(ell::new, $$0 -> $$0.e);
   public static final ell b = new ell(ImmutableList.of(dfa.pa));
   public static final ell c = new ell(ImmutableList.of(dfa.a));
   public static final ell d = new ell(ImmutableList.of(dfa.a, dfa.pa));
   private final ImmutableList<dey> e;

   public ell(List<dey> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public emj.c a(dca $$0, iz $$1, iz $$2, emj.c $$3, emj.c $$4, emf $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected emi<?> a() {
      return emi.e;
   }
}
