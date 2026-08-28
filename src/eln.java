import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class eln extends emi {
   public static final MapCodec<eln> a = dsd.b.xmap(dsc.a::b, dfa::o).listOf().fieldOf("blocks").xmap(eln::new, $$0 -> $$0.e);
   public static final eln b = new eln(ImmutableList.of(dfc.pa));
   public static final eln c = new eln(ImmutableList.of(dfc.a));
   public static final eln d = new eln(ImmutableList.of(dfc.a, dfc.pa));
   private final ImmutableList<dfa> e;

   public eln(List<dfa> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public eml.c a(dcc $$0, iz $$1, iz $$2, eml.c $$3, eml.c $$4, emh $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected emk<?> a() {
      return emk.e;
   }
}
