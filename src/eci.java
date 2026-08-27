import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class eci extends edd {
   public static final Codec<eci> a = djh.b.xmap(djg.a::b, cwq::o).listOf().fieldOf("blocks").xmap(eci::new, $$0 -> $$0.e).codec();
   public static final eci b = new eci(ImmutableList.of(cws.pa));
   public static final eci c = new eci(ImmutableList.of(cws.a));
   public static final eci d = new eci(ImmutableList.of(cws.a, cws.pa));
   private final ImmutableList<cwq> e;

   public eci(List<cwq> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public edg.c a(cts $$0, hx $$1, hx $$2, edg.c $$3, edg.c $$4, edc $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected edf<?> a() {
      return edf.e;
   }
}
