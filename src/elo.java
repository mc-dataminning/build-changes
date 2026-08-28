import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class elo extends emj {
   public static final MapCodec<elo> a = dse.b.xmap(dsd.a::b, dfb::o).listOf().fieldOf("blocks").xmap(elo::new, $$0 -> $$0.e);
   public static final elo b = new elo(ImmutableList.of(dfd.pa));
   public static final elo c = new elo(ImmutableList.of(dfd.a));
   public static final elo d = new elo(ImmutableList.of(dfd.a, dfd.pa));
   private final ImmutableList<dfb> e;

   public elo(List<dfb> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public emm.c a(dcd $$0, iz $$1, iz $$2, emm.c $$3, emm.c $$4, emi $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected eml<?> a() {
      return eml.e;
   }
}
