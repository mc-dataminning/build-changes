import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class dxt extends dyo {
   public static final Codec<dxt> a = dez.b.xmap(dey.a::b, csl::n).listOf().fieldOf("blocks").xmap(dxt::new, $$0 -> $$0.e).codec();
   public static final dxt b = new dxt(ImmutableList.of(csm.pa));
   public static final dxt c = new dxt(ImmutableList.of(csm.a));
   public static final dxt d = new dxt(ImmutableList.of(csm.a, csm.pa));
   private final ImmutableList<csl> e;

   public dxt(List<csl> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public dyr.c a(cpo $$0, gu $$1, gu $$2, dyr.c $$3, dyr.c $$4, dyn $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected dyq<?> a() {
      return dyq.e;
   }
}
