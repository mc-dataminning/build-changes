import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class ely extends emt {
   public static final MapCodec<ely> a = dsk.b.xmap(dsj.a::b, dfh::o).listOf().fieldOf("blocks").xmap(ely::new, $$0 -> $$0.e);
   public static final ely b = new ely(ImmutableList.of(dfj.pa));
   public static final ely c = new ely(ImmutableList.of(dfj.a));
   public static final ely d = new ely(ImmutableList.of(dfj.a, dfj.pa));
   private final ImmutableList<dfh> e;

   public ely(List<dfh> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public emw.c a(dci $$0, ja $$1, ja $$2, emw.c $$3, emw.c $$4, ems $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected emv<?> a() {
      return emv.e;
   }
}
