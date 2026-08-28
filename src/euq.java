import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class euq extends evm {
   public static final MapCodec<euq> a = eat.a.xmap(eas.a::b, dmr::m).listOf().fieldOf("blocks").xmap(euq::new, $$0 -> $$0.e);
   public static final euq b = new euq(ImmutableList.of(dmt.pG));
   public static final euq c = new euq(ImmutableList.of(dmt.a));
   public static final euq d = new euq(ImmutableList.of(dmt.a, dmt.pG));
   private final ImmutableList<dmr> e;

   public euq(List<dmr> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public evp.d a(djp $$0, iv $$1, iv $$2, evp.d $$3, evp.d $$4, evl $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected evo<?> a() {
      return evo.e;
   }
}
