import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class evg extends ewc {
   public static final MapCodec<evg> a = ebg.a.xmap(ebf.a::b, dne::m).listOf().fieldOf("blocks").xmap(evg::new, $$0 -> $$0.e);
   public static final evg b = new evg(ImmutableList.of(dng.pG));
   public static final evg c = new evg(ImmutableList.of(dng.a));
   public static final evg d = new evg(ImmutableList.of(dng.a, dng.pG));
   private final ImmutableList<dne> e;

   public evg(List<dne> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public ewf.d a(dkc $$0, iw $$1, iw $$2, ewf.d $$3, ewf.d $$4, ewb $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected ewe<?> a() {
      return ewe.e;
   }
}
