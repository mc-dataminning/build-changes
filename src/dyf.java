import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class dyf extends dza {
   public static final Codec<dyf> a = dfl.b.xmap(dfk.a::b, csx::n).listOf().fieldOf("blocks").xmap(dyf::new, $$0 -> $$0.e).codec();
   public static final dyf b = new dyf(ImmutableList.of(csy.pa));
   public static final dyf c = new dyf(ImmutableList.of(csy.a));
   public static final dyf d = new dyf(ImmutableList.of(csy.a, csy.pa));
   private final ImmutableList<csx> e;

   public dyf(List<csx> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public dzd.c a(cqa $$0, gw $$1, gw $$2, dzd.c $$3, dzd.c $$4, dyz $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected dzc<?> a() {
      return dzc.e;
   }
}
