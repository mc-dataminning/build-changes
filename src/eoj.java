import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class eoj extends epf {
   public static final MapCodec<eoj> a = dus.a.xmap(dur.a::b, dhm::n).listOf().fieldOf("blocks").xmap(eoj::new, $$0 -> $$0.e);
   public static final eoj b = new eoj(ImmutableList.of(dho.pa));
   public static final eoj c = new eoj(ImmutableList.of(dho.a));
   public static final eoj d = new eoj(ImmutableList.of(dho.a, dho.pa));
   private final ImmutableList<dhm> e;

   public eoj(List<dhm> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public epi.c a(dem $$0, jf $$1, jf $$2, epi.c $$3, epi.c $$4, epe $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected eph<?> a() {
      return eph.e;
   }
}
