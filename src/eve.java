import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class eve extends ewa {
   public static final MapCodec<eve> a = ebe.a.xmap(ebd.a::b, dnc::m).listOf().fieldOf("blocks").xmap(eve::new, $$0 -> $$0.e);
   public static final eve b = new eve(ImmutableList.of(dne.pG));
   public static final eve c = new eve(ImmutableList.of(dne.a));
   public static final eve d = new eve(ImmutableList.of(dne.a, dne.pG));
   private final ImmutableList<dnc> e;

   public eve(List<dnc> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public ewd.d a(dka $$0, iv $$1, iv $$2, ewd.d $$3, ewd.d $$4, evz $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected ewc<?> a() {
      return ewc.e;
   }
}
