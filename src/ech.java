import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class ech extends edc {
   public static final Codec<ech> a = djg.b.xmap(djf.a::b, cwp::o).listOf().fieldOf("blocks").xmap(ech::new, $$0 -> $$0.e).codec();
   public static final ech b = new ech(ImmutableList.of(cwr.pa));
   public static final ech c = new ech(ImmutableList.of(cwr.a));
   public static final ech d = new ech(ImmutableList.of(cwr.a, cwr.pa));
   private final ImmutableList<cwp> e;

   public ech(List<cwp> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public edf.c a(ctr $$0, hx $$1, hx $$2, edf.c $$3, edf.c $$4, edb $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected ede<?> a() {
      return ede.e;
   }
}
