import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class enr extends eon {
   public static final MapCodec<enr> a = dua.a.xmap(dtz.a::b, dgv::o).listOf().fieldOf("blocks").xmap(enr::new, $$0 -> $$0.e);
   public static final enr b = new enr(ImmutableList.of(dgx.pa));
   public static final enr c = new enr(ImmutableList.of(dgx.a));
   public static final enr d = new enr(ImmutableList.of(dgx.a, dgx.pa));
   private final ImmutableList<dgv> e;

   public enr(List<dgv> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public eoq.c a(ddv $$0, je $$1, je $$2, eoq.c $$3, eoq.c $$4, eom $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected eop<?> a() {
      return eop.e;
   }
}
