import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class els extends emn {
   public static final MapCodec<els> a = dsh.b.xmap(dsg.a::b, dff::o).listOf().fieldOf("blocks").xmap(els::new, $$0 -> $$0.e);
   public static final els b = new els(ImmutableList.of(dfh.pa));
   public static final els c = new els(ImmutableList.of(dfh.a));
   public static final els d = new els(ImmutableList.of(dfh.a, dfh.pa));
   private final ImmutableList<dff> e;

   public els(List<dff> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public emq.c a(dcg $$0, ja $$1, ja $$2, emq.c $$3, emq.c $$4, emm $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected emp<?> a() {
      return emp.e;
   }
}
