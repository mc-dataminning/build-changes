import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class dxs extends dyn {
   public static final Codec<dxs> a = dey.b.xmap(dex.a::b, csk::n).listOf().fieldOf("blocks").xmap(dxs::new, $$0 -> $$0.e).codec();
   public static final dxs b = new dxs(ImmutableList.of(csl.pa));
   public static final dxs c = new dxs(ImmutableList.of(csl.a));
   public static final dxs d = new dxs(ImmutableList.of(csl.a, csl.pa));
   private final ImmutableList<csk> e;

   public dxs(List<csk> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public dyq.c a(cpn $$0, gv $$1, gv $$2, dyq.c $$3, dyq.c $$4, dym $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected dyp<?> a() {
      return dyp.e;
   }
}
