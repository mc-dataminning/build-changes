import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class dxx extends dys {
   public static final Codec<dxx> a = dfd.b.xmap(dfc.a::b, ctc::o).listOf().fieldOf("blocks").xmap(dxx::new, $$0 -> $$0.e).codec();
   public static final dxx b = new dxx(ImmutableList.of(cte.pa));
   public static final dxx c = new dxx(ImmutableList.of(cte.a));
   public static final dxx d = new dxx(ImmutableList.of(cte.a, cte.pa));
   private final ImmutableList<ctc> e;

   public dxx(List<ctc> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public dyv.c a(cqe $$0, gw $$1, gw $$2, dyv.c $$3, dyv.c $$4, dyr $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected dyu<?> a() {
      return dyu.e;
   }
}
