import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class emp extends enk {
   public static final MapCodec<emp> a = dta.b.xmap(dsz.a::b, dfw::o).listOf().fieldOf("blocks").xmap(emp::new, $$0 -> $$0.e);
   public static final emp b = new emp(ImmutableList.of(dfy.pa));
   public static final emp c = new emp(ImmutableList.of(dfy.a));
   public static final emp d = new emp(ImmutableList.of(dfy.a, dfy.pa));
   private final ImmutableList<dfw> e;

   public emp(List<dfw> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public enn.c a(dcx $$0, jd $$1, jd $$2, enn.c $$3, enn.c $$4, enj $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected enm<?> a() {
      return enm.e;
   }
}
