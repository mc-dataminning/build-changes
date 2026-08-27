import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class ebq extends ecl {
   public static final Codec<ebq> a = dip.b.xmap(dio.a::b, cvz::o).listOf().fieldOf("blocks").xmap(ebq::new, $$0 -> $$0.e).codec();
   public static final ebq b = new ebq(ImmutableList.of(cwb.pa));
   public static final ebq c = new ebq(ImmutableList.of(cwb.a));
   public static final ebq d = new ebq(ImmutableList.of(cwb.a, cwb.pa));
   private final ImmutableList<cvz> e;

   public ebq(List<cvz> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public eco.c a(ctb $$0, hv $$1, hv $$2, eco.c $$3, eco.c $$4, eck $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected ecn<?> a() {
      return ecn.e;
   }
}
